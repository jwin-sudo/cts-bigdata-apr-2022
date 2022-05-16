object S014_String extends App {
  // String Template known as string
  val name = "Scala"
  val version = "2.12"
  val course = "Learn" + name + " " + version
  val course2 = s"Learn $name $version" // s string, where $name and $version represent variable

  println(course)
  println(course2)

}
