object S011_FunctionSyntax extends App {
  // how to declare a function ourself using type
  // Functions are annoynumous, no name given to them
  // name is value, String is a type, "Nila" object are assigned to name
  // : left side of colon is identifier [name]
  // right side of colon is data type
  // after = , we have expression Nila

  val name: String = "Nila"

  //greeting function doesn't accept any parameter, return Unit
  // greeting is a variable/ref to function
  // after colon, data type
  // () => Unit is a data type of a function, a function that accept no parameter, return Unit
  // after = . we have function definition
  val greeting: () => Unit = () => println("Good morning")
  greeting()

  // greet is variable ref to function
  // (String) => unit is a data type of a function, a function that accept 1 string parameter, return unit
  // (name) => println("Good morning ", name) is function definition
  val greet: (String) => Unit = (name) => println("Good morning ", name)

  greet("Nila")
  // a function that doesn't accept parameter, return double
  val getPI: () => Double = () =>3.14

  println(getPI())

  // a function that accept int as input, return int as result
  val power: (Int) => Int = n => n * n
  println(power(5))

  val add: (Int, Int) => Int = (a,b) => a+b
  println(add(10,20))




}
