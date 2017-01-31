package com.bank.masters;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseNG {
 
	LIB LB=new LIB();
  @BeforeTest
  public void beforeTest() 
  {
  LB.login();
  }

  @AfterTest
  public void afterTest() 
  {
  LB.logout();
  }

  @BeforeSuite
  public void beforeSuite() throws IOException
  {
  LB.openApp();
  }

  @AfterSuite
  public void afterSuite() 
  {
  LB.Aclose();
  }

}
