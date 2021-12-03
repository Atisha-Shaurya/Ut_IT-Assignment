package com.questiononetwo.passwordvalidator

import java.util.regex.Pattern


class Passwordvalidator() {

  def isValidpassword(password:String):Boolean= {

    if (password.contains(" ")) {
      return false

  }

    // checking the length of password is between 8 to 15
    if(!(password.length >= 8 && password.length <= 15 )) {
      return false

      //check if password contains digits and at least one Upper and lowercase
    }

    val upperletter = Pattern.compile("[A-Z]")
    val lowerletter = Pattern.compile("[a-z]")
    val digit = Pattern.compile("[0-9]")

    val special = Pattern.compile("[!@#$%&*()_+=|<>?^{}\\[\\]~-]")
    val hasupperletter = upperletter.matcher(password)
    val haslowerletter = lowerletter.matcher(password)
    val hasdigit = digit.matcher(password)
    val hasspecial = special.matcher(password)
    if( ! (haslowerletter.find() && hasupperletter. find() && hasdigit.find() && hasspecial.find()) ){
      return false

    }
     return true

  }

}
