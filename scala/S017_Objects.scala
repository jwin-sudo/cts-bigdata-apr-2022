object S017_Objects extends App{
  // objects in scala represents singleton nature of java static classes
  // java has static members and static methods which can be accessible via class

  // in scala, we have mo static classes

  // useful to represent static feature in java

  object Logger {
    // object constructor, this body block executed at first use of object
    println("Inside Logger")
    // can have member variables
    // can have member functions

    var logLevel: Int = 0 // member variable
    def error(msg: String): Unit = println("Error " + msg) // member functions
  }

  // Logger first time
  Logger

  Logger

  Logger.logLevel = 2 // access logger member variable
  Logger.error(msg="Something wrong with db")


}
