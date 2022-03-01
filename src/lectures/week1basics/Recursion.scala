package lectures.week1basics
import scala.annotation.tailrec

object Recursion extends App{
//  Так можно делать но не  стоит (потому что лучше работаь с val перменными)
var i = 0
  while (i < 3) {
    println("hello")
    i += 1
  }
// Просто рекурсия, хранит данные в стеке, если данных много то будет StackOverflowError
  def factorial(n: Int): Int = {
    if (n <= 0) 1
    else n * factorial(n - 1)
  }

  println(factorial(3)) // выводит 6

//  Хвостовая рекурсия
  def factorialWithTailRecursion(n: Int): Int = {
    @tailrec
    def loop(x: Int, accumulator: Int = 1): Int = {
      if (x <= 1) accumulator
      else loop(x-1, x*accumulator)
    }

    loop(n)
  }
println(factorialWithTailRecursion(5))

  def repeatWord(word: String, n: Int): String = {
    @tailrec
    def loop(i: Int, acc: String = word): String = {
      if (i <= 1) acc
      else loop(i - 1, s"$word $acc")
    }

    loop(n)
  }


  def powerOfTwo(n: Int): BigInt = {
    @tailrec
    def loop(x: Int, accumulator: BigInt = 1): BigInt = {
      if (x < 1) accumulator
      else loop(x-1, 2*accumulator)
    }

    loop(n)
  }
  println(powerOfTwo(32))

  def aFunc(fArgs: Array[String]): String = {
    @tailrec
    def loop(x: Int, y: Int, n: Int, accumulator: Int = 0): String = {
      if (n < 1) ((x + accumulator).toString + " ") * x.toString.length + "is the result"
      else loop(x, y,n-1, accumulator+y)
    }

    loop(fArgs(0).toInt, fArgs(1).toInt, fArgs(2).toInt)
  }
  println(aFunc(Array("10","1","5")))
}
