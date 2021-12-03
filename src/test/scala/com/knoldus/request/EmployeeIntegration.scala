package com.knoldus.request

import com.knoldus.db.Companydata
import com.knoldus.models.Employee
import com.knoldus.validator.EmployeeValidator
import com.knoldus.validator.EmailValidator
import org.scalatest.funsuite.AnyFunSuite

class EmployeeExeIntegrationTest extends AnyFunSuite{
  val companyName = new Companydata
  val validateEmail = new EmailValidator
  val employeeValidator = new EmployeeValidator(companyName,validateEmail)

  val employeeExe = new EmployeeImpl(employeeValidator)

  test("user can not created bcz company doent exist"){
    val Atisha:Employee = new Employee("Atisha","Shaurya",20,15000,"Intern","Infosys","atisha.shaurya@gmail.com")
    val result = employeeExe.createEmployee(Atisha)
    assert(result.isEmpty)
  }

  test("user can not created bcz email is invalid"){
    val Atisha:Employee = new Employee("Atisha","Shaurya",20,15000,"Intern","Knoldus","atisha.shaurya@gmailcom")
    val result = employeeExe.createEmployee(Atisha)
    assert(result.isEmpty)
  }
  test("user can not created bcz email invalid and company doesnt exist in DB"){
    val Atisha:Employee = new Employee("Atisha","Shaurya",20,15000,"Intern","Infosys","atisha.shaurya@gmaicom")
    val result = employeeExe.createEmployee(Atisha)
    assert(result.isEmpty)
  }
  test("user can be created"){
    val Atisha:Employee = new Employee("Atisha","Shaurya",20,15000,"Intern","Knoldus","atisha.shaurya@gmail.com")
    val result = employeeExe.createEmployee(Atisha)
    assert(result.isDefined)
  }
}

