package com.knoldus
 import org.apache.log4j.Logger._

object Implementation extends App {
  val log = getLogger(this.getClass)
  val first: Int = 5
 val second: Int = 5
  val a = new HighOrderFunctionsImplementation
  val square = a.squareCalculation(first, first => first * first)
  log.debug(square + " is the square\n")
  val cube = a.cubeCalculation(first, first => first * first * first)
 log.debug(cube + " is the cube\n")
val sum = a.sumCalculation(first,second,(first,second) => first + second)
 log.debug(sum + " is the sum\n")
}

