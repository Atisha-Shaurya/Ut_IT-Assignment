import com.questiononetwo.partone.Logic
import org.scalatest.funsuite.AnyFunSuite

class Logictest extends AnyFunSuite {
  var check = new Logic()


  //Test Case to Check the "palindrome" of any Number.

  test("check whether the number is palindrome or not") {
    val input = 12321
    val output = true
    assert(check.ispalindrome(input) == output)

  }

  test("when the number is not palindrome ") {
    val input = 1231
    val output = false
    assert(check.ispalindrome(input) == output)
  }

  test("check whether negative number is palindrome or not ") {
    val input = -12321
    val output = false
    assert(check.ispalindrome(input) == output)
  }

  test("check whether the number is palindrome if it is zero ") {
    val input = 0
    val output = true
    assert(check.ispalindrome(input) == output)
  }


  //Test Case to Check the "Factorial" of any Number.

  test("Handling factorial of a negative number ") {
    val input = -7
    val output = -1
    assert(check.factorialof(input) == output)
  }

  test("check whether the factorial of 0 is 1 ") {
    val input = 0
    val output = 1
    assert(check.factorialof(input) == output)
  }

test("check whether the number of factorial is correct or not"){
val input = 3
val output = 6
  assert(check.factorialof(input) == output)}

test("checking for the wrong output"){
  val input = 7
  val output = 504
  assert(check.factorialof(input) != output)}
}

