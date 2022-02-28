package lectures.week1basics

object Functions extends App{

def aPerson(name: String, surname: String): String = {
  s"$name $surname"
}
def aPerson2(name: String, surname: String): Unit = println(s"$name $surname")

println((aPerson("Yuri", "Dadteev")))
aPerson2("Yuri", "Dadteev")

def aParameterlessFunction(): Unit = println("Function with no parameters")

aParameterlessFunction()
aParameterlessFunction

def aFunctionWithDefaultParameter(x: Int, y: String = "Default Parameter"): String = {
  s"x = $x and y = $y"
}

println(aFunctionWithDefaultParameter(1)) // выводит x = 1 and y = Default Parameter

//  Вычисляет значение заранее и один раз
  def callByValue(x: Long): Unit = {
    println(s"call by value: x1 = $x")
    println(s"call by value: x2 = $x")
  }

// Вычисялет значение каждый раз привызове функции
  def callByName(x: => Long): Unit = {
    println(s"call by name: x1 = $x")
    println(s"call by name: x2 = $x")
  }

  callByValue(System.nanoTime())
  callByName(System.nanoTime())
  def aBossFunction(): String = {
    def aHelperFunction(): String = "I'm here to help"

    aHelperFunction()
  }
  def aCondition(): Boolean = if ( 1 < 2) true else false

  def someFunc(x: Int, y: Int): Int = {
    if (aCondition()) x * 2 else  x*y
  }
  println(someFunc(3,4))
}
