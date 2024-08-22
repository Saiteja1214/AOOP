package com.TDD;

class Number {
	//Find the cube of a number
  public static int cube(int n)
  {
	return n*n*n;  
  }
     //Check the number is even or not
      public static boolean isEven(int number)
      {
		return number%2==0;
    	  
      }
      public static boolean isOdd(int number)
      {
		return !isEven(number);
    	  
      }
}
 