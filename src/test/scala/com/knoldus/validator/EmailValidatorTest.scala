package com.knoldus.validator

import org.scalatest.funsuite.AnyFunSuite


class EmailValidatorTest extends AnyFunSuite {
  var emailObj = new EmailValidator

  test("without name of recipient"){
    assert(!emailObj.emailIdIsValid("@gmail.com"))
  }

  test("without @ in the email"){
    assert(!emailObj.emailIdIsValid("Atisha.shaurya.gmail.com"))
  }

  test("without domain name"){
    assert(!emailObj.emailIdIsValid("Atisha.shaurya@"))
  }

  test("other domain name than .com|.net|.org "){
    assert(!emailObj.emailIdIsValid("atisha.shaurya@yahoo.in"))
  }

  test("correct one uppercase"){
    assert(emailObj.emailIdIsValid("ATISHA.SHAURYA@abc.COM"))
  }

  test("correct one lowercase"){
    assert(emailObj.emailIdIsValid("atisha.shaurya@yahoo.com"))
  }

}
