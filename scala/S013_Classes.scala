object S013_Classes extends App{
  // classes are prototype of objects

  // member variables can be declared in class definition
  // or within class
  // by default all member variables are public scope
  class Product (val id: Int, val name:String, val price: Double) {
    var grandTotal: Double = 0
    // class body, itself is a default constructor, any code here executed first
    println("Product Created")

    def applyDiscount(p: Double): Unit = {
      grandTotal = price - (price * p) /100.0
    }

    // similar to python's __str__ which was called during print/string representation
    // in scal/java/c#, we have toString(), called automatically when we print objects

    override def toString():String = s"Product($id, $name, $price, $grandTotal)"
  }

  val p1 = new Product(id = 1001, name = "iPhone 12", price = 1000.0)
  val p2 = new Product(id = 1002, name = "Galaxy", price = 750.0)
  p1.applyDiscount(10)
  p2.applyDiscount(20)
  println(p1.id, p1.name, p1.price, p1.grandTotal)
  println(p1.id, p1.name, p1.price, p1.grandTotal)

  println(p1) // calls toString() and print output of toString
  println(p2) // calls toString()

  // String Template known as string
  val name = "Scala"
  val version = "2.12"
  val course = "Learn" + name + " " + version
  val course2 = s"Learn $name $version" // s string, where $name and $version represent variable

  println(course)
  println(course2)
}
