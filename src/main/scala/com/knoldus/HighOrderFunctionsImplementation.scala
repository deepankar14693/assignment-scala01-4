package com.knoldus

class HighOrderFunctionsImplementation {

 def squareCalculation(firstval: Int,  f: (Int) => Int): Int = f(firstval)

 def cubeCalculation(firstval: Int,  f: (Int) => Int): Int = f(firstval)

 def sumCalculation(firstval: Int,secondval: Int,f: (Int,Int) => Int): Int = f(firstval,secondval)
}
