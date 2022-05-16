object S006_If extends App {
  // in scala, if is an expression, means that if expression can retrun value
  val result1 = if (10 % 2 == 0) true else false
  print(result1)

  val result2 = if (11 % 2 == 0) true else false
  print(result2)

  val result3 = if (10 % 2 == 0) {
    println("even number")
    true
  }
  else {
    println("odd number")
    false
  }
  println(result3)

  var gr = {
    val a = 60
    val b = 50
    val c = 40

    val result = if (a > b && a > c) {
      a
    } else {
      c
    }
    result
  }
  println(gr)

  val gr2 = {
    val a = 60
    val b = 40
    val c = 50

    // what is value of result? Unit
    val result = if (a > b && a > c) {
      println("A is greater") // return Unit
    } else if (b > c) println("B is greater")
    else {
      println("C is greater")
    }

    result // Unit
  }

  println(gr2) // what will be printing ()
}



