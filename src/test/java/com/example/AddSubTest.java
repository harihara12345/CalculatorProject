package com.example;

import static org.testng.Assert.assertNotEquals;
import static org.testng.AssertJUnit.assertEquals;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.Reporter;

import static org.testng.Assert.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class AddSubTest {

	@DataProvider(name="add")
	  
	  public Object[] getData(){
		  Object[][] data = new Object[1][2];
		  data[0][0] = "1";
		  data[0][1] = "2";
		
		  return data;
		  }	
  @Test(dataProvider="add",groups= {"addition"})
 
  public void testDataAdd(String number1,String number2) throws InterruptedException {
     // assertEquals(String message, long expected, long actual)
//	  C = Integer.parseInt(Calculator.add(number1, number2));
	  Assert.assertEquals( 9, Calculator.add(9, 0));
	  Assert.assertEquals( -3, Calculator.add(-1, -2));  
      Assert.assertNotEquals( -3, Calculator.add(-10, 5));  
    
      System.out.println("Assertion for Assert Equals & Notquals in add method passed");
	  System.out.println("Data passed through DataProvider in this method");
	  System.out.println("Value passed from DataProvider for number1 = "+number1);
	  System.out.println("Value passed from DataProvider for number2 = "+number2);
	  System.out.println("Sum of two numbers "+number1+" + "+number2+" = "+Calculator.add(Integer.parseInt(number1), Integer.parseInt(number2)));
	  System.out.println("==================================================================");
	  Reporter.log("This method is to verify data passed from Data Provider for addition function in calculator");
	  
	
 

  }
  
/*  
    public Object[][] readData() throws Exception
  {
      File f = new File("C:\\Users\\HARIHARAVIGNESHM\\Desktop\\ExcelData.xlsx");
      FileInputStream fis = new FileInputStream(f);
      XSSFWorkbook workBook = (XSSFWorkbook) WorkbookFactory.create(fis);
      XSSFSheet sheet=workBook.getSheet("Sheet1");
      Object array[][]=new Object[1][2];
      for(int i =0;i<1;i++)
      {
          for( int j=0;j<=1;j++)
          {
              array[i][j]=sheet.getRow(i).getCell(j).toString();

          }
      }
      return array;



  }

 */
  
  @Test(groups= {"addition"})
  @Parameters({"number1","number2"})
  public void testParamAdd(String number1, String number2)  {
     // assertNotEquals(String message, long expected, long actual)
//   Assert.assertNotEquals( 0, Calculator.add(number1, number2));
	  int a=Integer.parseInt(number1);
	  int b = Integer.parseInt(number2);
	  int c = a+b;
	  Assert.assertNotEquals(c,4);
	  Assert.assertEquals(c,500);
	  Assert.assertTrue(c>0);
	  Assert.assertFalse(c<0);
	  System.out.println("Assertion for Assert Equals, Notequals, True & False in add method passed");
	  System.out.println("Data passed through Parameters from XML.file in this method");
	  System.out.println("Parameter value passed from xml file for number1 = "+number1);
	  System.out.println("Parameter value passed from xml file for number2 = "+number2);
	  System.out.println("Sum of numbers "+number1+" + "+number2+" = "+Calculator.add(Integer.parseInt(number1), Integer.parseInt(number2)));
	  System.out.println("==================================================================");
	  Reporter.log("This method is to verify data passed from Parameter value set in xml for addition function in calculator");
     
  }

	 @DataProvider(name="sub")
	  
	  public Object[] getData3(){
		  Object[][] data = new Object[1][2];
		  data[0][0] = "25";
		  data[0][1] = "5";
		
		  return data;
		  }

  @Test(dataProvider="sub",groups= {"subtraction"})
  public void testDataSub(String number1, String number2) throws InterruptedException {
	  
     Assert.assertEquals( 1, Calculator.sub(2, 1));
     Assert.assertEquals( -1, Calculator.sub(-2, -1));
     Assert.assertNotEquals( 0, Calculator.sub(2, 1));
     System.out.println("Assertion for Assert Equals & Notequals in Subtraction method passed");
     System.out.println("Data passed through DataProvider in this method");
	 System.out.println("Value passed from DataProvider for number1 = "+number1);
	 System.out.println("Value passed from DataProvider for number2 = "+number2);
	 System.out.println("Subtraction of numbers "+number1+" - "+number2+" = "+Calculator.sub(Integer.parseInt(number1), Integer.parseInt(number2)));
     System.out.println("==================================================================");
     Reporter.log("This method is to verify data passed from Data Provider for subscription function in calculator");
     
  }
  
  @Test(groups= {"subtraction"})
  @Parameters({"number1","number2"})
  public void testParamSub(String number1, String number2)  {
     // assertNotEquals(String message, long expected, long actual)
//   Assert.assertNotEquals( 0, Calculator.add(number1, number2));
	  int a=Integer.parseInt(number1);
	  int b = Integer.parseInt(number2);
	  int c = a+b;
	  Assert.assertNotEquals(c,4);
	  Assert.assertEquals(c,500);
	  Assert.assertTrue(c>0);
	  Assert.assertFalse(c<0);
	  System.out.println("Assertion for Assert Equals, Notequals, True & False in Subtraction method passed");
	  System.out.println("Data passed through Parameters from XML.file in this method");
	  System.out.println("Parameter value passed from xml file for number1 = "+number1);
	  System.out.println("Parameter value passed from xml file for number2 = "+number2);
	  System.out.println("Subtraction of numbers "+number1+" - "+number2+" = "+Calculator.sub(Integer.parseInt(number1), Integer.parseInt(number2)));
	  System.out.println("==================================================================");
	  Reporter.log("This method is to verify data passed from Parameter value set in xml for Subscription function in calculator");
     
  }

  @DataProvider(name="mul")
  
  public Object[] getData1(){
	  Object[][] data = new Object[1][2];
	  data[0][0] = "5";
	  data[0][1] = "5";
	
	  return data;
	  }
 
  @Test(dataProvider="mul",groups= {"multiplication"})
  public void testDataMul(String number1, String number2) throws InterruptedException {
	 
     Assert.assertEquals( 2, Calculator.mul(2, 1));
     Assert.assertEquals( -2, Calculator.mul(2, -1));
     Assert.assertNotEquals( 0, Calculator.mul(2, 1));
     System.out.println("Assertion for Assert Equals & Notequals in Multiplication method passed");
     System.out.println("Data passed through DataProvider in this method");
	 System.out.println("Value passed from DataProvider for number1 = "+number1);
	 System.out.println("Value passed from DataProvider for number2 = "+number2);
	 System.out.println("Multiplication of numbers "+number1+" * "+number2+" = "+Calculator.mul(Integer.parseInt(number1), Integer.parseInt(number2)));
     System.out.println("==================================================================");
     Reporter.log("This method is to verify data passed from Data Provider for Multiplication function in calculator");
     
  }
  
  @Test(groups= {"multiplication"})
  @Parameters({"num1","num2"})
  public void testParamMul(String num1, String num2)  {
     // assertNotEquals(String message, long expected, long actual)
//   Assert.assertNotEquals( 0, Calculator.add(number1, number2));
	  int a=Integer.parseInt(num1);
	  int b = Integer.parseInt(num2);
	  int c = a*b;
	  Assert.assertNotEquals(c,4);
	  Assert.assertEquals(c,500);
	  Assert.assertTrue(c>0);
	  Assert.assertFalse(c<0);
	  System.out.println("Assertion for Assert Equals, Notequals, True & False in Multiplication method passed");
	  System.out.println("Data passed through Parameters from XML.file in this method");
	  System.out.println("Parameter value passed from xml file for number1 = "+num1);
	  System.out.println("Parameter value passed from xml file for number2 = "+num2);
	  System.out.println("Multiplication of numbers "+num1+" * "+num2+" = "+Calculator.mul(Integer.parseInt(num1), Integer.parseInt(num2)));
	  System.out.println("==================================================================");
	  Reporter.log("This method is to verify data passed from Parameter value set in xml for Multiplication function in calculator");
     
  }
  
  @DataProvider(name="div")
  
  public Object[] getData2(){
	  Object[][] data = new Object[1][2];
	  data[0][0] = "25";
	  data[0][1] = "5";
	
	  return data;
	  }
   @Test(dataProvider="div",groups= {"division"})
  public void testDataDiv(String number1, String number2) throws InterruptedException {
     
     
     Assert.assertEquals( 5, Calculator.divInt(25, 5));
     Assert.assertEquals( -2, Calculator.divInt(2, -1));
     Assert.assertNotEquals( 0, Calculator.divInt(2, 1));
     System.out.println("Assertion for Assert Equals & Notequals in Division method passed");
     System.out.println("Data passed through DataProvider in this method");
	 System.out.println("Value passed from DataProvider for number1 = "+number1);
	 System.out.println("Value passed from DataProvider for number2 = "+number2);
	 System.out.println("Division of two numbers "+number1+" / "+number2+" = "+Calculator.divInt(Integer.parseInt(number1), Integer.parseInt(number2)));
     System.out.println("==================================================================");
     Reporter.log("This method is to verify data passed from Data Provider for Division function in calculator");
     
  }
   
   @Test(groups= {"division"})
   @Parameters({"num1","num2"})
   public void testParamDiv(String num1, String num2)  {
      // assertNotEquals(String message, long expected, long actual)
 //   Assert.assertNotEquals( 0, Calculator.add(number1, number2));
 	  int a=Integer.parseInt(num1);
 	  int b = Integer.parseInt(num2);
 	  int c = a/b;
 	  Assert.assertNotEquals(c,4);
 	  Assert.assertEquals(c,20);
 	  Assert.assertTrue(c>0);
	  Assert.assertFalse(c<0);
 	  System.out.println("Assertion for Assert Equals, Notequals, True and False in Division method passed");
 	  System.out.println("Data passed through Parameters from XML.file in this method");
 	  System.out.println("Parameter value passed from xml file for number1 = "+num1);
 	  System.out.println("Parameter value passed from xml file for number2 = "+num2);
 	  System.out.println("Division of numbers "+num1+" / "+num2+" = "+Calculator.divInt(Integer.parseInt(num1), Integer.parseInt(num2)));
 	  System.out.println("==================================================================");
 	 
 	  Reporter.log("This method is to verify data passed from Parameter value set in xml for Division function in calculator");
      
   }
   @Test(groups= {"exclude"})
   public void testExclude()
   {
	   System.out.println("This method is for excluding a particular group");
	   Reporter.log("This method is for excluding a particular group");
   }

  
}