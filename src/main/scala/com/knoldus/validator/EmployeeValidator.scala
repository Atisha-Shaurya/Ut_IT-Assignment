package com.knoldus.validator

import com.knoldus.db.Companydata
import com.knoldus.models.Employee

class EmployeeValidator(companyName: Companydata, validateEmail: EmailValidator) {

  def employeeIsValid(employee: Employee): Boolean = {

    if(companyName.getCompanyByName(employee.companyName).isDefined && validateEmail.emailIdIsValid(employee.emailId))
      true
    else
      false
  }
}


