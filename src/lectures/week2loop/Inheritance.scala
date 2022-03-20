package lectures.week2loop

object Inheritance extends App {
  class Person(name: String, age: Int) {
    val gender = "n/a"
    def greet: String = s"Hello"
//    private нельзя использовать вне класса
    private def greet1 : String = "Hello private"
    protected def greet2: String = "Hello protected"

//    Чтобы не писасть при опредлении дочернего класса параметры родительского в extends
    def this() = this("UnknownPerson", 0)

    println(greet1)
  }

  class Student(name: String, age: Int, id: Int, override val gender: String) extends Person(name,age) {
//    override def greet: String = s"Hello, $name"
//    Можно использовать вызов метода родительского класса и добавление туда своего черех super
    override def greet: String = s"${super.greet}, $name"
    println(greet2)
  }

  val student = new Student("Xi", 22, 1, "m")
  println(student.greet)
  println(student.gender)

//  задачка
  class Button(label: String){
  def click(): String = s"button -$label- has been clicked"

  def this() = this("test")
}
  class RoundedButton(label:String) extends Button(label) {
    override def click: String = s"rounded ${super.click()}"
  }

  val battn = new RoundedButton("1")
  println(battn.click)
}
