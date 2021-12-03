package com.knoldus.db

import com.knoldus.models.Company
import scala.collection.immutable.HashMap

class Companydata {
  val knoldusCompany: Company = Company("knoldus", "knoldus@gmail.com", "Noida")
  val infosysCompany: Company = Company("infosys", "infosys303@gmail.com", "Noida")
  val companies: HashMap[String, Company] = HashMap("Knoldus" -> knoldusCompany, "infosys" -> infosysCompany)
  def getCompanyByName(name: String): Option[Company] = companies.get(name)

}
