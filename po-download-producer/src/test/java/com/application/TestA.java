/*
 * package com.application;
 * 
 * import org.junit.*;
 * 
 * import java.util.List;
 * 
 * public class TestA {
 * 
 * A a = null;
 * 
 * @BeforeClass public static void b(){
 * System.out.println("Inside BeforeClass...."); }
 * 
 * 
 * @AfterClass public static void a(){
 * System.out.println("Inside AfterClass...."); }
 * 
 * @Before public void setup(){ a = new A();
 * System.out.println("Inside @Before method..."); }
 * 
 * @After public void afterSetup(){
 * System.out.println("Inside @After method..."); a =null; }
 * 
 * 
 * 
 * 
 * @Test public void testAddMethod(){ int result = a.add(5,5);
 * Assert.assertEquals(10,result); }
 * 
 * @Test(expected = ArrayIndexOutOfBoundsException.class) public void
 * testArrayList(){ List<String> list = a.getData();
 * //Assert.assertEquals(0,list.size()); System.out.println(list.get(3)); } }
 */