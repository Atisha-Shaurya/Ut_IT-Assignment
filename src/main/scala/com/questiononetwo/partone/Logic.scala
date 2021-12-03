package com.questiononetwo.partone

class Logic extends Factorial with Palindrome {
  override def factorialof(num: Int): Int = {

  var res = 1
    if(num < 0){
      res = -1
      res
    }
  for(i <- 2 to num)
    {
      res = res * i
    }
    res
  }

  override def ispalindrome(num: Int): Boolean = {
    var rev = 0
    var rem = 0
    var tem = num
    while(tem>0)
      {
        rem = tem % 10
        rev = rev * 10+rem
        tem = tem/10

      }
      if(rev == num)
        true
      else
        false
  }
}
