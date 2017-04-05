package com.latewind.pattern;

import java.lang.reflect.Field;

import com.latewind.oo.Father;

import junit.framework.TestCase;

public class TestOO extends TestCase {
	
	public void testObjectExtends(){
		
		Father father=new Father();
		father.run();

		father.setStep(12);
		father.walk();
	
		father.run();
	}

}
