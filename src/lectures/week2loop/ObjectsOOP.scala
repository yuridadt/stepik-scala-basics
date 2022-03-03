package lectures.week2loop

object ObjectsOOP extends App{
  object Number1 {
    val Pi = 3.14
  }

  println(Number1.Pi)

//  Ссылаются на один и тот же объект
  val numAA = Number1
  val numBB = Number1

  println(numAA == numBB) // выведет true

//  Объект и класс с одинаковыми именами называются компаньонами. имеют доступ к методам и полям друг друга
class MyString(val str: String) {
  private var extra = "extraData"

  def getString: String = str + extra
}

  object MyString {
    def apply(base: String, extras: String): MyString = {
      val s = new MyString(base)
      s.extra = extras
      s
    }

    def apply(base: String) = new MyString(base)
  }

  println(MyString.apply("hello", "world").getString)
  println(MyString.apply("welcome").getString)

// Фабричнй метод - не меняя конструткора класс асоздаем новый класс
  class Number(val num: Int)

  object Number {
    val Pi = 3.14

//    имя apply опускается при вызове
    def apply(x: Number, y: Number): Number = new Number(x.num + y.num)
  }

  val numA = new Number(1)
  val numB = new Number(2)

  val numC = Number(numA, numB) // применяем apply

  println(numA.num) // 1
  println(numB.num) // 2
  println(numC.num) // 3
}
