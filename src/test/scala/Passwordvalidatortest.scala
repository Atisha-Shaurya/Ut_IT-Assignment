import org.scalatest.funsuite.AnyFunSuite
import com.questiononetwo.passwordvalidator.Passwordvalidator


class Passwordvalidatortest extends AnyFunSuite {
  var passcheck = new Passwordvalidator()

  test("check if password is valid or not ") {
    val inputpassword = "Atisha#2865"
    val expectedoutput = true
    assert(passcheck.isValidpassword(inputpassword) == expectedoutput)
  }
  test("checking entered password is valid when the length is more than 15"){
    val inputpassword = "Atishashaurya2865#"
    val expectedoutput = false
    assert(passcheck.isValidpassword(inputpassword) == expectedoutput)

  }
  test("checking entered password is valid when the length is less than 8"){
    val inputpassword = "Ati28#"
    val expectedoutput = false
    assert(passcheck.isValidpassword(inputpassword) == expectedoutput)

  }
  test("check if lowercase password is valid or not"){
    val inputpassword = "atishashaurya2865#"
    val expectedoutput = false
    assert(passcheck.isValidpassword(inputpassword) == expectedoutput)

  }
  test("check if password is without digit passes"){
    val inputpassword = "Atishashaurya#"
    val expectedoutput = false
    assert(passcheck.isValidpassword(inputpassword) == expectedoutput)

  }
  test("check entered password is valid or not without special character"){
    val inputpassword = "Atishashaurya2865"
    val expectedoutput = false
    assert(passcheck.isValidpassword(inputpassword) == expectedoutput)

  }
  test("check if uppercase password is valid or not"){
    val inputpassword = "ATISHASHAURYA2865#"
    val expectedoutput = false
    assert(passcheck.isValidpassword(inputpassword) == expectedoutput)

  }
  test("check if special character password is valid or not") {
    val inputpassword = "!@$&**)%#2865"
    val expectedoutput = false
    assert(passcheck.isValidpassword(inputpassword) == expectedoutput)


  }
  test("check  entered digit password is valid or not") {
    val inputpassword = "2865567#"
    val expectedoutput = false
    assert(passcheck.isValidpassword(inputpassword) == expectedoutput)
  }

}


