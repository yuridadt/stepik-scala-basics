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

//  Полиморфизм
  val aPerson: Person = new Student("alice",21,2,"f")
 println(aPerson.greet) // выведет greet от Student

//  Как защититьс яот переопредления
//  1) использовать final перед классом (тогда нельзя делать extends)
//  2) использовать final перед методом ( его нельзя будет вызвать)
//  3) использовтаь sealed вместо final ( тогда можно вызывать extends но только в текущем файле)

  sealed abstract class DayOfTheWeek(val name: String, val isWeekend: Boolean)

  case object Monday extends DayOfTheWeek("Monday", false)
  case object Tuesday extends DayOfTheWeek("Tuesday",  false)
  case object Wednesday extends DayOfTheWeek("Wednesday", false)
  case object Thursday extends DayOfTheWeek("Thursday", false)
  case object Friday extends DayOfTheWeek("Friday", false)
  case object Saturday extends DayOfTheWeek("Saturday", true)
  case object Sunday extends DayOfTheWeek("Sunday", true)

//  Абстрактные классы
  abstract  class BaseDataSource(dataSourceName: String) {
  def save: String = {
    s"Save method implemented"
  }
  def delete: String = {
    s"Delete method implemented"
  }

//  Абстрактные поля и методы оставляем пустыми
  val user: String
  def connect: String
}
  class PublicDataSource(ds:String) extends BaseDataSource(ds){
//    Надо прописать все пустые методы из абстрактоного класса
    val user = "publicUser"
    def connect: String = {
      s"PublicData source, no password needed"
    }
  }

//  Анонимный класс
  val someSource = new BaseDataSource("someDS") {
    override val user: String = "someSourceUser"

    override def connect: String = "someSource connection"
  }
println(someSource.getClass)

  // задача

  abstract class Event {
    def trigger(eventName: String): Unit
  }

  class Listener(val eventName: String, var event: Event) {
    def register(evt: Event) { event = evt }
    def sendNotification() { event.trigger(eventName) }
  }

  val notification: Listener = new Listener("mousedown", null)
  val abs_cls: Event = new Event {
    override def trigger(eventName: String): Unit = println(s"trigger $eventName event")
  }

  notification.register(  abs_cls
  )

  println(notification.sendNotification())

//  Трейты
}
