package com.bank.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ExampleNG 

{
	@Test
public void xyz()
{
	Assert.assertEquals("Selenium","Selenium");
}
	@Test(enabled=false)
 public void pqr()
 {
	 Assert.assertEquals("Gmail","Gmail");
 }
	@Test
 public void abc()
 {
	 Assert.assertEquals("Yahoo","Yahoo");
 }
  
}
