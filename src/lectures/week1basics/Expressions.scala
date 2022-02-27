package lectures.week1basics

object Expressions extends App{
  val aVal = 1 + 2 * 3
  print(1 + 2 * 3)
  print()

  // выводим выражение а не инструкцию
  val aCondition = true
  val ifExpressionValue = if (aCondition) "True Condition" else "False Condition"
  println(ifExpressionValue) // выведет True Condition

  // если ничего не вывводим то можно использовать тип Unit
  val someVal : Unit = print("I just want to print")
  print(someVal)

  // Блоки кодв
  val aCodeBlock = {
    val someVal = 1
    val y = 2

    if (someVal + y > 1) true else false
    "String to return"
  }

  println(aCodeBlock) // выводит "String to return"

}
