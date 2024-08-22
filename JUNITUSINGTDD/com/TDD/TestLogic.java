package com.TDD;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class TestLogic {

          @Test
          public void Testcube()
          {
        	  assertEquals(27, Number.cube(3));
        	  assertEquals(10, Number.cube(2));
          }
          public void TestEvenOrNot()
          {
        	  assertTrue(Number.isEven(7));
        	  assertTrue(Number.isEven(6));
        	  assertFalse(Number.isEven(5));
          }
          public void TestOddOrNot()
          {
        	  assertTrue(Number.isOdd(7));
        	  assertTrue(Number.isOdd(6));
        	  assertFalse(Number.isOdd(5));
          }
          public void testobjNotNull()
          {
        	  Object obj ="Hello";
        	  assertNotNull(obj);
          }

}
       