package lectures.week1basics

object StringOperations extends App{
  val aString: String = "Hello, world!"

  println(aString.length)
  println(aString.charAt(1))
  println(aString.substring(0,2))
  println(aString.split(" ").toList)
  println(aString.startsWith("He"))
  println(aString.replace("!","."))
  println(aString.toLowerCase)
  println(aString.toUpperCase)
  println(aString.reverse)
  println(aString.take(12))

  val aaString: String = "Scala course"
  println(aaString.substring(0,5).toUpperCase.length)
  println(aaString.take(5).toUpperCase.length)

  val aNumber = "42".toInt
  println(aNumber) // выводит 42
  println(aNumber.getClass) // выводит int
  val tString = 42.toString

  println('1' +: "42" :+ '3') // выводит 1423
  println('1' + "42" + '3')
  // Тоже самое, что и:
  val aStr = "42".+:('1')
  println(aStr.:+('3'))  // 1423

  println('a' +: "bc" :+ 'd') // abcd
  println("a" ++ "bc" :++ "d") // abcd

  println('3' + '4') //103 ???? getClass= int

  // string interpolation
  val name = "John"
  val surname = "Smith"
  println(s"Hello, $name") // выводит Hello, John
  println(s"Hello, ${name + surname}") // выводит Hello, JohnSmith
  val someString = "this is \n a string"
  println(raw"$someString")
  println(raw"this is \n a string")

  val link = "https://stepik.org"
  println("end")
}
