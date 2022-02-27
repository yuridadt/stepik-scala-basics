package lectures.week1basics

object TypesValuesVariables extends App{

  var aString: String = "Hello"
  // У Char кавычки одинарные
  val aChar: Char = 'C'
  val aInt: Int = 11
  val aLong: Long = 11L
  val aFloat: Float = 2.0f
  val aDouble: Double = 2.0
  val aBoolean: Boolean = true
  println(aString,aChar,aInt,aLong,aFloat,aDouble,aBoolean)
  println(s"Класс для aLong $aLong = $aLong.getClass")

  // Изменяем только перменные с var, не val
  aString = "Hello, World"
  // Через ; пишем только если неск-ко выраженйи на 1-й строке
  val aaChar: Char = 'C';  val aaInt: Int = 11
}
