package lectures.part1Scala

import java.util.concurrent.atomic.DoubleAccumulator
import scala.annotation.tailrec

object Recap extends App {

  val aCondition: Boolean = false
  val aConditionval  = if(aCondition) 42 else 65

  val aCodeBlock = {
    if(aCondition) 54
    56
  }

  def aFunction(x: Int): Int = x+1

  @tailrec def factorial(n: Int, accumulator: Int):Int=
    if(n <= 0 ) accumulator
    else factorial(n - 1 , n * accumulator)


  class Animal
  class Dog extends Animal
  val aDog: Animal = new Dog


  trait Carnivore {

    def eat (a: Animal): Unit
  }

  class Crocadile extends Animal with Carnivore{
    override def eat(a: Animal): Unit = println("Crunch!")


  }

 val aCroc = new Crocadile
  aCroc.eat(aDog)


}
