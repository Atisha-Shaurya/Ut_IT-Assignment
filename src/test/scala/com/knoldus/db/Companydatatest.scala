package com.knoldus.db


import com.knoldus.models.Company
import com.knoldus.validator.EmailValidator
import org.scalatest.funsuite.AnyFunSuite
import org.mockito.MockitoSugar.{mock, when}
import com.knoldus.validator.CompanyValidator


class CompanyValidatorTest extends AnyFunSuite{
  val knoldusCompany:Company = Company("Knoldus","knoldus@gmail.com","Noida")
  val companyRead = mock[Companydata]
  val emailValidator = mock[EmailValidator]
  val companyValidator = new CompanyValidator(companyRead,emailValidator)

  test(" company should valid"){
    when(companyRead.getCompanyByName(knoldusCompany.name)).thenReturn(None)
    when(emailValidator.emailIdIsValid(knoldusCompany.emailId)).thenReturn(true)
    val result = companyValidator.companyIsValid(knoldusCompany)
    assert(result)
  }
  test("check if company already exists in DB"){
    when(companyRead.getCompanyByName(knoldusCompany.name)).thenReturn(Option(knoldusCompany))
    when(emailValidator.emailIdIsValid(knoldusCompany.emailId)).thenReturn(true)
    val result = companyValidator.companyIsValid(knoldusCompany)
    assert(!result)
  }

  test("company is invalid as email is not valid"){

    when(companyRead.getCompanyByName(knoldusCompany.name)).thenReturn(None)
    when(emailValidator.emailIdIsValid(knoldusCompany.emailId)).thenReturn(false)
    val result = companyValidator.companyIsValid(knoldusCompany)
    assert(!result)
  }
  test("Company is invalid as the email id is not valid and it already exists in the DB"){
    when(companyRead.getCompanyByName(knoldusCompany.name)) thenReturn(Option(knoldusCompany))
    when(emailValidator.emailIdIsValid(knoldusCompany.emailId)) thenReturn(false)
    val result = companyValidator.companyIsValid(knoldusCompany)
    assert(!result)
  }
}


