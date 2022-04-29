object S005_BlockExpr extends App{
  val a = 10 + 20
  val b = 50

  val c = {10 + 20}

  val d = {
    println("Inside block")
    40
  }

  println("a", a)
  println("b", b)
  println("c", c)
  println("d", d)

}
