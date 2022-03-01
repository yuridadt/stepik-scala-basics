package playground

object ScalaPlayground1 extends App{
  println("Hello, Scala")

}

object ScalaPlayground2 {
  def main(args: Array[String]): Unit = {
    println("Hello def Scala")
  }

}

object StringReverse extends App{
  val s: String = " I like     Scala "
  val l = s.trim.split(" ").filter(_.nonEmpty).reverse.mkString(" ")
  println(l)

}
