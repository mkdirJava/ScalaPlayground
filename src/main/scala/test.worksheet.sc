case class Person (name:String, age:Int)

enum PersonAction :
  def map(mapper:PersonAction=>Person) = mapper(this)
  case doSomething
  case doNotDoSomething

val result = for
  action <- PersonAction.values if action == PersonAction.doSomething
  result:Person <- action 
yield result
