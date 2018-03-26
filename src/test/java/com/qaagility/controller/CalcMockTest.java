package com.qaagility.controller;

import com.qaagility.controller.Calculator;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
 
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.MockitoAnnotations;
 
public class CalcMockTest {

//	@Mock
//    	Calculator calcMock;	
	
	@Mock
    	private Calculator calcMock;

	 @Before
	 public void setupMock() {
		 MockitoAnnotations.initMocks(this);
		//calcMock = mock(Calculator.class);
	    }	

	@Test
	public void testCalcMock1()  {
	System.out.println("Stubbing mul(x,y)"); 	
	when(calcMock.mul(9,9)).thenReturn(81);
	assertEquals(81,calcMock.mul(9,9));
	verify(calcMock, atLeastOnce()).add(9,9);
        System.out.println("Verifying add method is also called atleast onece when mul method is called");	
	}

/*	
	@Test
	public void testCalcMock1()  {
		
        //  create mock
	ClassToTest test  = new ClassToTest(calcMock);	
        // MyCalc test = mock(MyCalc.class);

        // define return value for method getMul()
        when(test.getMul()).thenReturn(81);

        // use mock in test....
        assertEquals(test.getMul(), 81);
	}

*/	
	@Test	
      public void testCalc() {
        assertEquals("Result", 9, 9);
      }
	
    }
