package com.knoldus.request

import com.knoldus.models.Employee
import com.knoldus.validator.EmployeeValidator
import org.mockito.MockitoSugar.{mock, when}
import org.scalatest.funsuite.AnyFunSuite

class EmployeeImpltest extends AnyFunSuite{
  val employeeValidator = mock[EmployeeValidator]
  val atisha:Employee = new Employee("Atisha","Shaurya",20,15000,"Intern","Knoldus","atisha.shaurya@gmail.com")
  val userImpl = new EmployeeImpl(employeeValidator)

  test("User can be created"){
    when(employeeValidator.employeeIsValid(atisha)) thenReturn(true)
    val result = userImpl.createEmployee(atisha)
    assert(result.isDefined)
  }
  test("User can not be created"){
    when(employeeValidator.employeeIsValid(atisha)) thenReturn(false)
    val result = userImpl.createEmployee(atisha)
    assert(result.isEmpty)
  }
}

