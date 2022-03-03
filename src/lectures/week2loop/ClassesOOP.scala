package lectures.week2loop

object ClassesOOP extends App{
  val student = new Student(id=0, name = "Bob")
  println(student.name)

//  Код в теле функции выполняется при создании класса
  class Student(id: Int, val name: String) {
    val uni = "University"
    println("Student class")
  //  Метод this позволяет указывать на параметры класса, вместо параметров метода класса
    def getId(name: String, id: Int): String = s"${this.name} has ID ${this.id} and $name has $id"
  //  Перегрузка метода (Overloading). Набор или тип аргметов должен отличаться
    def getId: String = s"here is $name's ID $id'"
  // Также можно создавать перегруженные конструктоыр через def this - аналог задания переременных по умолчанию в конструткоре класса
  def this(name: String) = this(0, name)
  def this() = this(0,"NoName")
  }

  val new_student = new Student(1,"Sam")
  println(new_student.getId("Pam",2))
  println(new_student.getId)


  class Employee(val name: String, var salary: Double) {
    // здесь пропущена строка кода
    def this() = this("John",0.0)
  }

  val employee = new Employee()
  println(s"${employee.name}'s salary is ${employee.salary}")

  class Instructor(val id: Int, val name: String, val surname:String) {
    def fullName: String = s"${this.name.toLowerCase.capitalize} ${this.surname.toLowerCase.capitalize}"
  }

  class Course(val courseID: Int, val title: String, val releaseYear: String, val instructor: Instructor) {

    def getID: String = s"${courseID.toString}${instructor.id.toString}"

    def isTaughtBy(instructor: Instructor): Boolean = {
      if (instructor.name == this.instructor.name && instructor.surname == this.instructor.surname) true else false
    }
    def copyCourse(newReleaseYear: String): Course = new Course(courseID,title, releaseYear = newReleaseYear, instructor)
  }
  val inst = new Instructor(1, "John", "Doe")
  val cr = new Course(courseID=0, title = "Just a Course", releaseYear = "2022", instructor = inst)
  println(inst.fullName)
}
