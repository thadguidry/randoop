package foo.bar;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NaiveRegression0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NaiveRegression0.test01"); }


    java2.util2.ArrayList arrayList0 = new java2.util2.ArrayList();
    java2.util2.Enumeration enumeration1 = java2.util2.Collections.enumeration((java2.util2.Collection)arrayList0);
    java2.util2.ArrayList arrayList2 = java2.util2.Collections.list(enumeration1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object obj3 = java2.util2.Collections.max((java2.util2.Collection)arrayList2);
      org.junit.Assert.fail("Expected exception of type java2.util2.NoSuchElementException");
    } catch (java2.util2.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arrayList2);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NaiveRegression0.test02"); }


    int i0 = 100;
    java2.util2.ArrayList arrayList1 = new java2.util2.ArrayList(i0);
    short s2 = (short)100;
    java.lang.Object[] obj_array3 = new java.lang.Object[] { s2 };
    java.lang.Object[] obj_array4 = arrayList1.toArray(obj_array3);
    java2.util2.LinkedList linkedList5 = new java2.util2.LinkedList((java2.util2.Collection)arrayList1);
    java2.util2.ArrayList arrayList6 = new java2.util2.ArrayList();
    java2.util2.List list7 = java2.util2.Collections.synchronizedList((java2.util2.List)arrayList6);
    java2.util2.Iterator iterator8 = arrayList6.iterator();
    java2.util2.Enumeration enumeration9 = java2.util2.Collections.enumeration((java2.util2.Collection)arrayList6);
    java2.util2.ArrayList arrayList10 = new java2.util2.ArrayList();
    java2.util2.Enumeration enumeration11 = java2.util2.Collections.enumeration((java2.util2.Collection)arrayList10);
    int i12 = arrayList6.lastIndexOf((java.lang.Object)enumeration11);
    boolean b13 = linkedList5.contains((java.lang.Object)arrayList6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object obj14 = linkedList5.getFirst();
      org.junit.Assert.fail("Expected exception of type java2.util2.NoSuchElementException");
    } catch (java2.util2.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NaiveRegression0.test03"); }


    char char0 = ' ';
    java2.util2.List list1 = java2.util2.Collections.singletonList((java.lang.Object)char0);
    char char2 = '#';
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java2.util2.Collections.fill(list1, (java.lang.Object)char2);
      org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list1);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NaiveRegression0.test04"); }


    int i0 = 100;
    java2.util2.ArrayList arrayList1 = new java2.util2.ArrayList(i0);
    short s2 = (short)100;
    java.lang.Object[] obj_array3 = new java.lang.Object[] { s2 };
    java.lang.Object[] obj_array4 = arrayList1.toArray(obj_array3);
    int i5 = 0;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object obj6 = arrayList1.remove((int)i5);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NaiveRegression0.test05"); }


    int i0 = (-1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java2.util2.ArrayList arrayList1 = new java2.util2.ArrayList(i0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NaiveRegression0.test06"); }


    int i0 = 100;
    java2.util2.ArrayList arrayList1 = new java2.util2.ArrayList(i0);
    short s2 = (short)100;
    java.lang.Object[] obj_array3 = new java.lang.Object[] { s2 };
    java.lang.Object[] obj_array4 = arrayList1.toArray(obj_array3);
    java2.util2.LinkedList linkedList5 = new java2.util2.LinkedList((java2.util2.Collection)arrayList1);
    int i6 = linkedList5.size();
    linkedList5.clear();
    int i8 = 0;
    int i9 = 100;
    java2.util2.ArrayList arrayList10 = new java2.util2.ArrayList(i9);
    short s11 = (short)100;
    java.lang.Object[] obj_array12 = new java.lang.Object[] { s11 };
    java.lang.Object[] obj_array13 = arrayList10.toArray(obj_array12);
    java2.util2.LinkedList linkedList14 = new java2.util2.LinkedList((java2.util2.Collection)arrayList10);
    int i15 = linkedList14.size();
    java2.util2.Iterator iterator16 = linkedList14.iterator();
    boolean b17 = linkedList5.addAll((int)i8, (java2.util2.Collection)linkedList14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object obj18 = linkedList5.getLast();
      org.junit.Assert.fail("Expected exception of type java2.util2.NoSuchElementException");
    } catch (java2.util2.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NaiveRegression0.test07"); }


    int i0 = 10;
    java2.util2.ArrayList arrayList1 = new java2.util2.ArrayList();
    java2.util2.List list2 = java2.util2.Collections.nCopies((int)i0, (java.lang.Object)arrayList1);
    int i3 = 100;
    java2.util2.ArrayList arrayList4 = new java2.util2.ArrayList(i3);
    short s5 = (short)100;
    java.lang.Object[] obj_array6 = new java.lang.Object[] { s5 };
    java.lang.Object[] obj_array7 = arrayList4.toArray(obj_array6);
    java2.util2.LinkedList linkedList8 = new java2.util2.LinkedList((java2.util2.Collection)arrayList4);
    int i9 = arrayList1.indexOf((java.lang.Object)linkedList8);
    linkedList8.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NaiveRegression0.test08"); }


    int i0 = 100;
    java2.util2.ArrayList arrayList1 = new java2.util2.ArrayList(i0);
    short s2 = (short)100;
    java.lang.Object[] obj_array3 = new java.lang.Object[] { s2 };
    java.lang.Object[] obj_array4 = arrayList1.toArray(obj_array3);
    java2.util2.LinkedList linkedList5 = new java2.util2.LinkedList((java2.util2.Collection)arrayList1);
    int i6 = linkedList5.size();
    java2.util2.Iterator iterator7 = linkedList5.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NaiveRegression0.test09"); }


    java2.util2.ArrayList arrayList0 = new java2.util2.ArrayList();
    java2.util2.List list1 = java2.util2.Collections.synchronizedList((java2.util2.List)arrayList0);
    java2.util2.Iterator iterator2 = arrayList0.iterator();
    java2.util2.Enumeration enumeration3 = java2.util2.Collections.enumeration((java2.util2.Collection)arrayList0);
    java2.util2.ArrayList arrayList4 = new java2.util2.ArrayList();
    java2.util2.Enumeration enumeration5 = java2.util2.Collections.enumeration((java2.util2.Collection)arrayList4);
    int i6 = arrayList0.lastIndexOf((java.lang.Object)enumeration5);
    java2.util2.Collections.reverse((java2.util2.List)arrayList0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NaiveRegression0.test10"); }


    int i0 = 100;
    java2.util2.ArrayList arrayList1 = new java2.util2.ArrayList(i0);
    short s2 = (short)100;
    java.lang.Object[] obj_array3 = new java.lang.Object[] { s2 };
    java.lang.Object[] obj_array4 = arrayList1.toArray(obj_array3);
    java2.util2.ArrayList arrayList5 = new java2.util2.ArrayList();
    java2.util2.Enumeration enumeration6 = java2.util2.Collections.enumeration((java2.util2.Collection)arrayList5);
    int i7 = arrayList1.lastIndexOf((java.lang.Object)arrayList5);
    java2.util2.ArrayList arrayList8 = new java2.util2.ArrayList();
    java2.util2.Enumeration enumeration9 = java2.util2.Collections.enumeration((java2.util2.Collection)arrayList8);
    double d10 = 10.0d;
    boolean b11 = arrayList8.remove((java.lang.Object)d10);
    float f12 = 1.0f;
    boolean b13 = java2.util2.Collections.replaceAll((java2.util2.List)arrayList1, (java.lang.Object)d10, (java.lang.Object)f12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NaiveRegression0.test11"); }


    java2.util2.ArrayList arrayList0 = new java2.util2.ArrayList();
    java2.util2.Enumeration enumeration1 = java2.util2.Collections.enumeration((java2.util2.Collection)arrayList0);
    java2.util2.List list2 = java2.util2.Collections.unmodifiableList((java2.util2.List)arrayList0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NaiveRegression0.test12"); }


    int i0 = 100;
    java2.util2.ArrayList arrayList1 = new java2.util2.ArrayList(i0);
    short s2 = (short)100;
    java.lang.Object[] obj_array3 = new java.lang.Object[] { s2 };
    java.lang.Object[] obj_array4 = arrayList1.toArray(obj_array3);
    java2.util2.ArrayList arrayList5 = new java2.util2.ArrayList();
    java2.util2.Enumeration enumeration6 = java2.util2.Collections.enumeration((java2.util2.Collection)arrayList5);
    int i7 = arrayList1.lastIndexOf((java.lang.Object)arrayList5);
    int i8 = 100;
    java2.util2.ArrayList arrayList9 = new java2.util2.ArrayList(i8);
    short s10 = (short)100;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { s10 };
    java.lang.Object[] obj_array12 = arrayList9.toArray(obj_array11);
    java2.util2.LinkedList linkedList13 = new java2.util2.LinkedList((java2.util2.Collection)arrayList9);
    java2.util2.ArrayList arrayList14 = new java2.util2.ArrayList();
    java2.util2.List list15 = java2.util2.Collections.synchronizedList((java2.util2.List)arrayList14);
    java2.util2.Iterator iterator16 = arrayList14.iterator();
    java2.util2.Enumeration enumeration17 = java2.util2.Collections.enumeration((java2.util2.Collection)arrayList14);
    java2.util2.ArrayList arrayList18 = new java2.util2.ArrayList();
    java2.util2.Enumeration enumeration19 = java2.util2.Collections.enumeration((java2.util2.Collection)arrayList18);
    int i20 = arrayList14.lastIndexOf((java.lang.Object)enumeration19);
    boolean b21 = linkedList13.contains((java.lang.Object)arrayList14);
    boolean b22 = arrayList1.retainAll((java2.util2.Collection)linkedList13);
    int i23 = 100;
    int i24 = 100;
    java2.util2.ArrayList arrayList25 = new java2.util2.ArrayList(i24);
    short s26 = (short)100;
    java.lang.Object[] obj_array27 = new java.lang.Object[] { s26 };
    java.lang.Object[] obj_array28 = arrayList25.toArray(obj_array27);
    java2.util2.LinkedList linkedList29 = new java2.util2.LinkedList((java2.util2.Collection)arrayList25);
    int i30 = linkedList29.size();
    linkedList29.clear();
    int i32 = 0;
    int i33 = 100;
    java2.util2.ArrayList arrayList34 = new java2.util2.ArrayList(i33);
    short s35 = (short)100;
    java.lang.Object[] obj_array36 = new java.lang.Object[] { s35 };
    java.lang.Object[] obj_array37 = arrayList34.toArray(obj_array36);
    java2.util2.LinkedList linkedList38 = new java2.util2.LinkedList((java2.util2.Collection)arrayList34);
    int i39 = linkedList38.size();
    java2.util2.Iterator iterator40 = linkedList38.iterator();
    boolean b41 = linkedList29.addAll((int)i32, (java2.util2.Collection)linkedList38);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object obj42 = arrayList1.set((int)i23, (java.lang.Object)b41);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NaiveRegression0.test13"); }


    int i0 = 100;
    java2.util2.ArrayList arrayList1 = new java2.util2.ArrayList(i0);
    short s2 = (short)100;
    java.lang.Object[] obj_array3 = new java.lang.Object[] { s2 };
    java.lang.Object[] obj_array4 = arrayList1.toArray(obj_array3);
    java2.util2.LinkedList linkedList5 = new java2.util2.LinkedList((java2.util2.Collection)arrayList1);
    java2.util2.ArrayList arrayList6 = new java2.util2.ArrayList();
    java2.util2.List list7 = java2.util2.Collections.synchronizedList((java2.util2.List)arrayList6);
    java2.util2.Iterator iterator8 = arrayList6.iterator();
    java2.util2.Enumeration enumeration9 = java2.util2.Collections.enumeration((java2.util2.Collection)arrayList6);
    java2.util2.ArrayList arrayList10 = new java2.util2.ArrayList();
    java2.util2.Enumeration enumeration11 = java2.util2.Collections.enumeration((java2.util2.Collection)arrayList10);
    int i12 = arrayList6.lastIndexOf((java.lang.Object)enumeration11);
    boolean b13 = linkedList5.contains((java.lang.Object)arrayList6);
    int i14 = 100;
    java2.util2.ArrayList arrayList15 = new java2.util2.ArrayList(i14);
    int i16 = arrayList6.indexOf((java.lang.Object)arrayList15);
    java.lang.Object obj17 = arrayList6.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj17);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NaiveRegression0.test14"); }


    int i0 = 100;
    java2.util2.ArrayList arrayList1 = new java2.util2.ArrayList(i0);
    short s2 = (short)100;
    java.lang.Object[] obj_array3 = new java.lang.Object[] { s2 };
    java.lang.Object[] obj_array4 = arrayList1.toArray(obj_array3);
    java2.util2.LinkedList linkedList5 = new java2.util2.LinkedList((java2.util2.Collection)arrayList1);
    arrayList1.clear();
    int i7 = 1;
    java2.util2.Collections.rotate((java2.util2.List)arrayList1, (int)i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NaiveRegression0.test15"); }


    int i0 = 100;
    java2.util2.ArrayList arrayList1 = new java2.util2.ArrayList(i0);
    short s2 = (short)100;
    java.lang.Object[] obj_array3 = new java.lang.Object[] { s2 };
    java.lang.Object[] obj_array4 = arrayList1.toArray(obj_array3);
    java2.util2.LinkedList linkedList5 = new java2.util2.LinkedList((java2.util2.Collection)arrayList1);
    java2.util2.ArrayList arrayList6 = new java2.util2.ArrayList();
    java2.util2.List list7 = java2.util2.Collections.synchronizedList((java2.util2.List)arrayList6);
    java2.util2.Iterator iterator8 = arrayList6.iterator();
    java2.util2.Enumeration enumeration9 = java2.util2.Collections.enumeration((java2.util2.Collection)arrayList6);
    java2.util2.ArrayList arrayList10 = new java2.util2.ArrayList();
    java2.util2.Enumeration enumeration11 = java2.util2.Collections.enumeration((java2.util2.Collection)arrayList10);
    int i12 = arrayList6.lastIndexOf((java.lang.Object)enumeration11);
    boolean b13 = linkedList5.contains((java.lang.Object)arrayList6);
    int i14 = linkedList5.size();
    java.lang.String str15 = "hi!";
    linkedList5.addLast((java.lang.Object)str15);
    java2.util2.ArrayList arrayList17 = new java2.util2.ArrayList();
    java2.util2.List list18 = java2.util2.Collections.synchronizedList((java2.util2.List)arrayList17);
    boolean b19 = true;
    int i20 = arrayList17.indexOf((java.lang.Object)b19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int i21 = java2.util2.Collections.binarySearch((java2.util2.List)linkedList5, (java.lang.Object)arrayList17);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == (-1));

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NaiveRegression0.test16"); }


    int i0 = 100;
    java2.util2.ArrayList arrayList1 = new java2.util2.ArrayList(i0);
    short s2 = (short)100;
    java.lang.Object[] obj_array3 = new java.lang.Object[] { s2 };
    java.lang.Object[] obj_array4 = arrayList1.toArray(obj_array3);
    java2.util2.LinkedList linkedList5 = new java2.util2.LinkedList((java2.util2.Collection)arrayList1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object obj6 = linkedList5.removeLast();
      org.junit.Assert.fail("Expected exception of type java2.util2.NoSuchElementException");
    } catch (java2.util2.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NaiveRegression0.test17"); }


    int i0 = 100;
    java2.util2.ArrayList arrayList1 = new java2.util2.ArrayList(i0);
    short s2 = (short)100;
    java.lang.Object[] obj_array3 = new java.lang.Object[] { s2 };
    java.lang.Object[] obj_array4 = arrayList1.toArray(obj_array3);
    java2.util2.ArrayList arrayList5 = new java2.util2.ArrayList();
    java2.util2.List list6 = java2.util2.Collections.synchronizedList((java2.util2.List)arrayList5);
    boolean b7 = arrayList1.addAll((java2.util2.Collection)list6);
    java2.util2.Enumeration enumeration8 = java2.util2.Collections.enumeration((java2.util2.Collection)list6);
    int i9 = 100;
    java2.util2.ArrayList arrayList10 = new java2.util2.ArrayList(i9);
    short s11 = (short)100;
    java.lang.Object[] obj_array12 = new java.lang.Object[] { s11 };
    java.lang.Object[] obj_array13 = arrayList10.toArray(obj_array12);
    java2.util2.ArrayList arrayList14 = new java2.util2.ArrayList();
    java2.util2.List list15 = java2.util2.Collections.synchronizedList((java2.util2.List)arrayList14);
    boolean b16 = arrayList10.addAll((java2.util2.Collection)list15);
    java2.util2.Enumeration enumeration17 = java2.util2.Collections.enumeration((java2.util2.Collection)list15);
    java2.util2.Map map18 = java2.util2.Collections.singletonMap((java.lang.Object)enumeration8, (java.lang.Object)enumeration17);
    java2.util2.Map map19 = java2.util2.Collections.unmodifiableMap(map18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map19);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NaiveRegression0.test18"); }


    int i0 = 10;
    java2.util2.ArrayList arrayList1 = new java2.util2.ArrayList();
    java2.util2.List list2 = java2.util2.Collections.nCopies((int)i0, (java.lang.Object)arrayList1);
    int i3 = 100;
    java2.util2.ArrayList arrayList4 = new java2.util2.ArrayList(i3);
    short s5 = (short)100;
    java.lang.Object[] obj_array6 = new java.lang.Object[] { s5 };
    java.lang.Object[] obj_array7 = arrayList4.toArray(obj_array6);
    java2.util2.LinkedList linkedList8 = new java2.util2.LinkedList((java2.util2.Collection)arrayList4);
    int i9 = arrayList1.indexOf((java.lang.Object)linkedList8);
    int i10 = (-1);
    int i11 = 100;
    java2.util2.ArrayList arrayList12 = new java2.util2.ArrayList(i11);
    short s13 = (short)100;
    java.lang.Object[] obj_array14 = new java.lang.Object[] { s13 };
    java.lang.Object[] obj_array15 = arrayList12.toArray(obj_array14);
    java2.util2.LinkedList linkedList16 = new java2.util2.LinkedList((java2.util2.Collection)arrayList12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      linkedList8.add((int)i10, (java.lang.Object)arrayList12);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NaiveRegression0.test19"); }


    int i0 = 100;
    java2.util2.ArrayList arrayList1 = new java2.util2.ArrayList(i0);
    short s2 = (short)100;
    java.lang.Object[] obj_array3 = new java.lang.Object[] { s2 };
    java.lang.Object[] obj_array4 = arrayList1.toArray(obj_array3);
    java2.util2.ArrayList arrayList5 = new java2.util2.ArrayList();
    java2.util2.Enumeration enumeration6 = java2.util2.Collections.enumeration((java2.util2.Collection)arrayList5);
    int i7 = arrayList1.lastIndexOf((java.lang.Object)arrayList5);
    java2.util2.ArrayList arrayList8 = new java2.util2.ArrayList();
    java2.util2.Enumeration enumeration9 = java2.util2.Collections.enumeration((java2.util2.Collection)arrayList8);
    double d10 = 10.0d;
    boolean b11 = arrayList8.remove((java.lang.Object)d10);
    int i12 = arrayList5.lastIndexOf((java.lang.Object)d10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NaiveRegression0.test20"); }


    int i0 = 100;
    java2.util2.ArrayList arrayList1 = new java2.util2.ArrayList(i0);
    short s2 = (short)100;
    java.lang.Object[] obj_array3 = new java.lang.Object[] { s2 };
    java.lang.Object[] obj_array4 = arrayList1.toArray(obj_array3);
    java2.util2.LinkedList linkedList5 = new java2.util2.LinkedList((java2.util2.Collection)arrayList1);
    int i6 = 100;
    java2.util2.ArrayList arrayList7 = new java2.util2.ArrayList(i6);
    short s8 = (short)100;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { s8 };
    java.lang.Object[] obj_array10 = arrayList7.toArray(obj_array9);
    java2.util2.LinkedList linkedList11 = new java2.util2.LinkedList((java2.util2.Collection)arrayList7);
    java2.util2.ArrayList arrayList12 = new java2.util2.ArrayList();
    java2.util2.List list13 = java2.util2.Collections.synchronizedList((java2.util2.List)arrayList12);
    java2.util2.Iterator iterator14 = arrayList12.iterator();
    java2.util2.Enumeration enumeration15 = java2.util2.Collections.enumeration((java2.util2.Collection)arrayList12);
    java2.util2.ArrayList arrayList16 = new java2.util2.ArrayList();
    java2.util2.Enumeration enumeration17 = java2.util2.Collections.enumeration((java2.util2.Collection)arrayList16);
    int i18 = arrayList12.lastIndexOf((java.lang.Object)enumeration17);
    boolean b19 = linkedList11.contains((java.lang.Object)arrayList12);
    int i20 = 100;
    java2.util2.ArrayList arrayList21 = new java2.util2.ArrayList(i20);
    int i22 = arrayList12.indexOf((java.lang.Object)arrayList21);
    linkedList5.addFirst((java.lang.Object)arrayList21);
    java2.util2.Set set24 = java2.util2.Collections.singleton((java.lang.Object)linkedList5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object obj25 = java2.util2.Collections.min((java2.util2.Collection)linkedList5);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set24);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NaiveRegression0.test21"); }


    int i0 = 100;
    java2.util2.ArrayList arrayList1 = new java2.util2.ArrayList(i0);
    short s2 = (short)100;
    java.lang.Object[] obj_array3 = new java.lang.Object[] { s2 };
    java.lang.Object[] obj_array4 = arrayList1.toArray(obj_array3);
    java2.util2.LinkedList linkedList5 = new java2.util2.LinkedList((java2.util2.Collection)arrayList1);
    java2.util2.ArrayList arrayList6 = new java2.util2.ArrayList();
    java2.util2.List list7 = java2.util2.Collections.synchronizedList((java2.util2.List)arrayList6);
    java2.util2.Iterator iterator8 = arrayList6.iterator();
    java2.util2.Enumeration enumeration9 = java2.util2.Collections.enumeration((java2.util2.Collection)arrayList6);
    java2.util2.ArrayList arrayList10 = new java2.util2.ArrayList();
    java2.util2.Enumeration enumeration11 = java2.util2.Collections.enumeration((java2.util2.Collection)arrayList10);
    int i12 = arrayList6.lastIndexOf((java.lang.Object)enumeration11);
    boolean b13 = linkedList5.contains((java.lang.Object)arrayList6);
    int i14 = linkedList5.size();
    java2.util2.Iterator iterator15 = linkedList5.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator15);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NaiveRegression0.test22"); }


    int i0 = 100;
    java2.util2.ArrayList arrayList1 = new java2.util2.ArrayList(i0);
    short s2 = (short)100;
    java.lang.Object[] obj_array3 = new java.lang.Object[] { s2 };
    java.lang.Object[] obj_array4 = arrayList1.toArray(obj_array3);
    java2.util2.LinkedList linkedList5 = new java2.util2.LinkedList((java2.util2.Collection)arrayList1);
    int i6 = 100;
    int i7 = 100;
    java2.util2.ArrayList arrayList8 = new java2.util2.ArrayList(i7);
    short s9 = (short)100;
    java.lang.Object[] obj_array10 = new java.lang.Object[] { s9 };
    java.lang.Object[] obj_array11 = arrayList8.toArray(obj_array10);
    java2.util2.LinkedList linkedList12 = new java2.util2.LinkedList((java2.util2.Collection)arrayList8);
    int i13 = linkedList12.size();
    java.lang.Object obj14 = linkedList12.clone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      linkedList5.add((int)i6, obj14);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj14);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NaiveRegression0.test23"); }


    int i0 = 100;
    java2.util2.ArrayList arrayList1 = new java2.util2.ArrayList(i0);
    short s2 = (short)100;
    java.lang.Object[] obj_array3 = new java.lang.Object[] { s2 };
    java.lang.Object[] obj_array4 = arrayList1.toArray(obj_array3);
    java2.util2.LinkedList linkedList5 = new java2.util2.LinkedList((java2.util2.Collection)arrayList1);
    java2.util2.LinkedList linkedList6 = new java2.util2.LinkedList((java2.util2.Collection)arrayList1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NaiveRegression0.test24"); }


    int i0 = 100;
    java2.util2.ArrayList arrayList1 = new java2.util2.ArrayList(i0);
    short s2 = (short)100;
    java.lang.Object[] obj_array3 = new java.lang.Object[] { s2 };
    java.lang.Object[] obj_array4 = arrayList1.toArray(obj_array3);
    java2.util2.LinkedList linkedList5 = new java2.util2.LinkedList((java2.util2.Collection)arrayList1);
    java2.util2.ArrayList arrayList6 = new java2.util2.ArrayList();
    java2.util2.List list7 = java2.util2.Collections.synchronizedList((java2.util2.List)arrayList6);
    java2.util2.Iterator iterator8 = arrayList6.iterator();
    java2.util2.Enumeration enumeration9 = java2.util2.Collections.enumeration((java2.util2.Collection)arrayList6);
    java2.util2.ArrayList arrayList10 = new java2.util2.ArrayList();
    java2.util2.Enumeration enumeration11 = java2.util2.Collections.enumeration((java2.util2.Collection)arrayList10);
    int i12 = arrayList6.lastIndexOf((java.lang.Object)enumeration11);
    boolean b13 = linkedList5.contains((java.lang.Object)arrayList6);
    int i14 = linkedList5.size();
    int i15 = 100;
    java2.util2.ArrayList arrayList16 = new java2.util2.ArrayList(i15);
    short s17 = (short)100;
    java.lang.Object[] obj_array18 = new java.lang.Object[] { s17 };
    java.lang.Object[] obj_array19 = arrayList16.toArray(obj_array18);
    java2.util2.LinkedList linkedList20 = new java2.util2.LinkedList((java2.util2.Collection)arrayList16);
    int i21 = linkedList20.size();
    int i22 = java2.util2.Collections.indexOfSubList((java2.util2.List)linkedList5, (java2.util2.List)linkedList20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NaiveRegression0.test25"); }


    int i0 = 100;
    java2.util2.ArrayList arrayList1 = new java2.util2.ArrayList(i0);
    short s2 = (short)100;
    java.lang.Object[] obj_array3 = new java.lang.Object[] { s2 };
    java.lang.Object[] obj_array4 = arrayList1.toArray(obj_array3);
    java2.util2.LinkedList linkedList5 = new java2.util2.LinkedList((java2.util2.Collection)arrayList1);
    java2.util2.ArrayList arrayList6 = new java2.util2.ArrayList();
    java2.util2.List list7 = java2.util2.Collections.synchronizedList((java2.util2.List)arrayList6);
    java2.util2.Iterator iterator8 = arrayList6.iterator();
    java2.util2.Enumeration enumeration9 = java2.util2.Collections.enumeration((java2.util2.Collection)arrayList6);
    java2.util2.ArrayList arrayList10 = new java2.util2.ArrayList();
    java2.util2.Enumeration enumeration11 = java2.util2.Collections.enumeration((java2.util2.Collection)arrayList10);
    int i12 = arrayList6.lastIndexOf((java.lang.Object)enumeration11);
    boolean b13 = linkedList5.contains((java.lang.Object)arrayList6);
    int i14 = 100;
    java2.util2.ArrayList arrayList15 = new java2.util2.ArrayList(i14);
    short s16 = (short)100;
    java.lang.Object[] obj_array17 = new java.lang.Object[] { s16 };
    java.lang.Object[] obj_array18 = arrayList15.toArray(obj_array17);
    java2.util2.LinkedList linkedList19 = new java2.util2.LinkedList((java2.util2.Collection)arrayList15);
    arrayList15.clear();
    java.lang.Object[] obj_array21 = arrayList15.toArray();
    int i22 = linkedList5.indexOf((java.lang.Object)arrayList15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == (-1));

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NaiveRegression0.test26"); }


    int i0 = 100;
    java2.util2.ArrayList arrayList1 = new java2.util2.ArrayList(i0);
    short s2 = (short)100;
    java.lang.Object[] obj_array3 = new java.lang.Object[] { s2 };
    java.lang.Object[] obj_array4 = arrayList1.toArray(obj_array3);
    java2.util2.ArrayList arrayList5 = new java2.util2.ArrayList();
    java2.util2.Collections.copy((java2.util2.List)arrayList1, (java2.util2.List)arrayList5);
    int i7 = 10;
    java2.util2.ArrayList arrayList8 = new java2.util2.ArrayList();
    java2.util2.List list9 = java2.util2.Collections.nCopies((int)i7, (java.lang.Object)arrayList8);
    int i10 = 100;
    java2.util2.ArrayList arrayList11 = new java2.util2.ArrayList(i10);
    short s12 = (short)100;
    java.lang.Object[] obj_array13 = new java.lang.Object[] { s12 };
    java.lang.Object[] obj_array14 = arrayList11.toArray(obj_array13);
    java2.util2.LinkedList linkedList15 = new java2.util2.LinkedList((java2.util2.Collection)arrayList11);
    int i16 = arrayList8.indexOf((java.lang.Object)linkedList15);
    java.lang.Object[] obj_array17 = linkedList15.toArray();
    int i18 = java2.util2.Collections.binarySearch((java2.util2.List)arrayList1, (java.lang.Object)linkedList15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NaiveRegression0.test27"); }


    int i0 = 100;
    java2.util2.ArrayList arrayList1 = new java2.util2.ArrayList(i0);
    short s2 = (short)100;
    java.lang.Object[] obj_array3 = new java.lang.Object[] { s2 };
    java.lang.Object[] obj_array4 = arrayList1.toArray(obj_array3);
    java2.util2.LinkedList linkedList5 = new java2.util2.LinkedList((java2.util2.Collection)arrayList1);
    java2.util2.ArrayList arrayList6 = new java2.util2.ArrayList();
    java2.util2.List list7 = java2.util2.Collections.synchronizedList((java2.util2.List)arrayList6);
    java2.util2.Iterator iterator8 = arrayList6.iterator();
    java2.util2.Enumeration enumeration9 = java2.util2.Collections.enumeration((java2.util2.Collection)arrayList6);
    java2.util2.ArrayList arrayList10 = new java2.util2.ArrayList();
    java2.util2.Enumeration enumeration11 = java2.util2.Collections.enumeration((java2.util2.Collection)arrayList10);
    int i12 = arrayList6.lastIndexOf((java.lang.Object)enumeration11);
    boolean b13 = linkedList5.contains((java.lang.Object)arrayList6);
    int i14 = 100;
    java2.util2.ArrayList arrayList15 = new java2.util2.ArrayList(i14);
    int i16 = arrayList6.indexOf((java.lang.Object)arrayList15);
    int i17 = 100;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object obj18 = arrayList6.remove((int)i17);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NaiveRegression0.test28"); }


    int i0 = 10;
    java2.util2.ArrayList arrayList1 = new java2.util2.ArrayList();
    java2.util2.List list2 = java2.util2.Collections.nCopies((int)i0, (java.lang.Object)arrayList1);
    int i3 = 100;
    java2.util2.ArrayList arrayList4 = new java2.util2.ArrayList(i3);
    short s5 = (short)100;
    java.lang.Object[] obj_array6 = new java.lang.Object[] { s5 };
    java.lang.Object[] obj_array7 = arrayList4.toArray(obj_array6);
    java2.util2.LinkedList linkedList8 = new java2.util2.LinkedList((java2.util2.Collection)arrayList4);
    int i9 = arrayList1.indexOf((java.lang.Object)linkedList8);
    java2.util2.Collections.shuffle((java2.util2.List)arrayList1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NaiveRegression0.test29"); }


    java2.util2.ArrayList arrayList0 = new java2.util2.ArrayList();
    java.lang.Object obj1 = arrayList0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj1);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NaiveRegression0.test30"); }


    java2.util2.ArrayList arrayList0 = new java2.util2.ArrayList();
    java2.util2.Enumeration enumeration1 = java2.util2.Collections.enumeration((java2.util2.Collection)arrayList0);
    arrayList0.trimToSize();
    char char3 = '4';
    int i4 = java2.util2.Collections.binarySearch((java2.util2.List)arrayList0, (java.lang.Object)char3);
    arrayList0.trimToSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NaiveRegression0.test31"); }


    int i0 = 100;
    java2.util2.ArrayList arrayList1 = new java2.util2.ArrayList(i0);
    short s2 = (short)100;
    java.lang.Object[] obj_array3 = new java.lang.Object[] { s2 };
    java.lang.Object[] obj_array4 = arrayList1.toArray(obj_array3);
    java2.util2.LinkedList linkedList5 = new java2.util2.LinkedList((java2.util2.Collection)arrayList1);
    int i6 = 100;
    java2.util2.ArrayList arrayList7 = new java2.util2.ArrayList(i6);
    short s8 = (short)100;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { s8 };
    java.lang.Object[] obj_array10 = arrayList7.toArray(obj_array9);
    java2.util2.LinkedList linkedList11 = new java2.util2.LinkedList((java2.util2.Collection)arrayList7);
    java2.util2.ArrayList arrayList12 = new java2.util2.ArrayList();
    java2.util2.List list13 = java2.util2.Collections.synchronizedList((java2.util2.List)arrayList12);
    java2.util2.Iterator iterator14 = arrayList12.iterator();
    java2.util2.Enumeration enumeration15 = java2.util2.Collections.enumeration((java2.util2.Collection)arrayList12);
    java2.util2.ArrayList arrayList16 = new java2.util2.ArrayList();
    java2.util2.Enumeration enumeration17 = java2.util2.Collections.enumeration((java2.util2.Collection)arrayList16);
    int i18 = arrayList12.lastIndexOf((java.lang.Object)enumeration17);
    boolean b19 = linkedList11.contains((java.lang.Object)arrayList12);
    int i20 = 100;
    java2.util2.ArrayList arrayList21 = new java2.util2.ArrayList(i20);
    int i22 = arrayList12.indexOf((java.lang.Object)arrayList21);
    linkedList5.addFirst((java.lang.Object)arrayList21);
    java2.util2.ArrayList arrayList24 = new java2.util2.ArrayList();
    java2.util2.List list25 = java2.util2.Collections.synchronizedList((java2.util2.List)arrayList24);
    java2.util2.Iterator iterator26 = arrayList24.iterator();
    java2.util2.Enumeration enumeration27 = java2.util2.Collections.enumeration((java2.util2.Collection)arrayList24);
    int i28 = 10;
    java2.util2.ArrayList arrayList29 = new java2.util2.ArrayList();
    java2.util2.List list30 = java2.util2.Collections.nCopies((int)i28, (java.lang.Object)arrayList29);
    long long31 = (-1L);
    boolean b32 = arrayList29.remove((java.lang.Object)long31);
    boolean b33 = arrayList24.containsAll((java2.util2.Collection)arrayList29);
    boolean b34 = arrayList21.add((java.lang.Object)b33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NaiveRegression0.test32"); }


    java2.util2.ArrayList arrayList0 = new java2.util2.ArrayList();
    java2.util2.Enumeration enumeration1 = java2.util2.Collections.enumeration((java2.util2.Collection)arrayList0);
    double d2 = 10.0d;
    boolean b3 = arrayList0.remove((java.lang.Object)d2);
    int i4 = 100;
    java2.util2.ArrayList arrayList5 = new java2.util2.ArrayList(i4);
    short s6 = (short)100;
    java.lang.Object[] obj_array7 = new java.lang.Object[] { s6 };
    java.lang.Object[] obj_array8 = arrayList5.toArray(obj_array7);
    java2.util2.LinkedList linkedList9 = new java2.util2.LinkedList((java2.util2.Collection)arrayList5);
    java2.util2.ArrayList arrayList10 = new java2.util2.ArrayList();
    java2.util2.List list11 = java2.util2.Collections.synchronizedList((java2.util2.List)arrayList10);
    java2.util2.Iterator iterator12 = arrayList10.iterator();
    java2.util2.Enumeration enumeration13 = java2.util2.Collections.enumeration((java2.util2.Collection)arrayList10);
    java2.util2.ArrayList arrayList14 = new java2.util2.ArrayList();
    java2.util2.Enumeration enumeration15 = java2.util2.Collections.enumeration((java2.util2.Collection)arrayList14);
    int i16 = arrayList10.lastIndexOf((java.lang.Object)enumeration15);
    boolean b17 = linkedList9.contains((java.lang.Object)arrayList10);
    int i18 = linkedList9.size();
    java.lang.String str19 = "hi!";
    linkedList9.addLast((java.lang.Object)str19);
    int i21 = arrayList0.indexOf((java.lang.Object)str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NaiveRegression0.test33"); }


    int i0 = 10;
    java2.util2.ArrayList arrayList1 = new java2.util2.ArrayList();
    java2.util2.List list2 = java2.util2.Collections.nCopies((int)i0, (java.lang.Object)arrayList1);
    java2.util2.List list3 = java2.util2.Collections.synchronizedList((java2.util2.List)arrayList1);
    int i4 = 10;
    java2.util2.ArrayList arrayList5 = new java2.util2.ArrayList();
    java2.util2.List list6 = java2.util2.Collections.nCopies((int)i4, (java.lang.Object)arrayList5);
    java2.util2.List list7 = java2.util2.Collections.synchronizedList((java2.util2.List)arrayList5);
    int i8 = java2.util2.Collections.lastIndexOfSubList((java2.util2.List)arrayList1, list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NaiveRegression0.test34"); }


    java2.util2.ArrayList arrayList0 = new java2.util2.ArrayList();
    java2.util2.Enumeration enumeration1 = java2.util2.Collections.enumeration((java2.util2.Collection)arrayList0);
    arrayList0.trimToSize();
    char char3 = '4';
    int i4 = java2.util2.Collections.binarySearch((java2.util2.List)arrayList0, (java.lang.Object)char3);
    int i5 = 100;
    java2.util2.ArrayList arrayList6 = new java2.util2.ArrayList(i5);
    short s7 = (short)100;
    java.lang.Object[] obj_array8 = new java.lang.Object[] { s7 };
    java.lang.Object[] obj_array9 = arrayList6.toArray(obj_array8);
    java2.util2.LinkedList linkedList10 = new java2.util2.LinkedList((java2.util2.Collection)arrayList6);
    arrayList6.clear();
    java.lang.Object[] obj_array12 = arrayList6.toArray();
    java.lang.Object[] obj_array13 = arrayList0.toArray(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NaiveRegression0.test35"); }


    int i0 = 100;
    java2.util2.ArrayList arrayList1 = new java2.util2.ArrayList(i0);
    short s2 = (short)100;
    java.lang.Object[] obj_array3 = new java.lang.Object[] { s2 };
    java.lang.Object[] obj_array4 = arrayList1.toArray(obj_array3);
    java2.util2.ArrayList arrayList5 = new java2.util2.ArrayList();
    java2.util2.Enumeration enumeration6 = java2.util2.Collections.enumeration((java2.util2.Collection)arrayList5);
    int i7 = arrayList1.lastIndexOf((java.lang.Object)arrayList5);
    java2.util2.Comparator comparator8 = java2.util2.Collections.reverseOrder();
    java2.util2.Collections.sort((java2.util2.List)arrayList1, comparator8);
    java2.util2.TreeSet treeSet10 = new java2.util2.TreeSet(comparator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator8);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NaiveRegression0.test36"); }


    java2.util2.ArrayList arrayList0 = new java2.util2.ArrayList();
    java2.util2.List list1 = java2.util2.Collections.synchronizedList((java2.util2.List)arrayList0);
    int i2 = 100;
    java2.util2.ArrayList arrayList3 = new java2.util2.ArrayList(i2);
    short s4 = (short)100;
    java.lang.Object[] obj_array5 = new java.lang.Object[] { s4 };
    java.lang.Object[] obj_array6 = arrayList3.toArray(obj_array5);
    java2.util2.LinkedList linkedList7 = new java2.util2.LinkedList((java2.util2.Collection)arrayList3);
    int i8 = linkedList7.size();
    linkedList7.clear();
    int i10 = 0;
    int i11 = 100;
    java2.util2.ArrayList arrayList12 = new java2.util2.ArrayList(i11);
    short s13 = (short)100;
    java.lang.Object[] obj_array14 = new java.lang.Object[] { s13 };
    java.lang.Object[] obj_array15 = arrayList12.toArray(obj_array14);
    java2.util2.LinkedList linkedList16 = new java2.util2.LinkedList((java2.util2.Collection)arrayList12);
    int i17 = linkedList16.size();
    java2.util2.Iterator iterator18 = linkedList16.iterator();
    boolean b19 = linkedList7.addAll((int)i10, (java2.util2.Collection)linkedList16);
    java2.util2.LinkedList linkedList20 = new java2.util2.LinkedList((java2.util2.Collection)linkedList16);
    float f21 = 100.0f;
    boolean b22 = linkedList20.remove((java.lang.Object)f21);
    int i23 = arrayList0.lastIndexOf((java.lang.Object)linkedList20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == (-1));

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NaiveRegression0.test37"); }


    java2.util2.TreeSet treeSet0 = new java2.util2.TreeSet();
    java.lang.Object obj1 = treeSet0.clone();
    int i2 = treeSet0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NaiveRegression0.test38"); }


    int i0 = 100;
    java2.util2.ArrayList arrayList1 = new java2.util2.ArrayList(i0);
    short s2 = (short)100;
    java.lang.Object[] obj_array3 = new java.lang.Object[] { s2 };
    java.lang.Object[] obj_array4 = arrayList1.toArray(obj_array3);
    java2.util2.LinkedList linkedList5 = new java2.util2.LinkedList((java2.util2.Collection)arrayList1);
    int i6 = 100;
    java2.util2.ArrayList arrayList7 = new java2.util2.ArrayList(i6);
    short s8 = (short)100;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { s8 };
    java.lang.Object[] obj_array10 = arrayList7.toArray(obj_array9);
    java2.util2.LinkedList linkedList11 = new java2.util2.LinkedList((java2.util2.Collection)arrayList7);
    java2.util2.ArrayList arrayList12 = new java2.util2.ArrayList();
    java2.util2.List list13 = java2.util2.Collections.synchronizedList((java2.util2.List)arrayList12);
    java2.util2.Iterator iterator14 = arrayList12.iterator();
    java2.util2.Enumeration enumeration15 = java2.util2.Collections.enumeration((java2.util2.Collection)arrayList12);
    java2.util2.ArrayList arrayList16 = new java2.util2.ArrayList();
    java2.util2.Enumeration enumeration17 = java2.util2.Collections.enumeration((java2.util2.Collection)arrayList16);
    int i18 = arrayList12.lastIndexOf((java.lang.Object)enumeration17);
    boolean b19 = linkedList11.contains((java.lang.Object)arrayList12);
    int i20 = 100;
    java2.util2.ArrayList arrayList21 = new java2.util2.ArrayList(i20);
    int i22 = arrayList12.indexOf((java.lang.Object)arrayList21);
    linkedList5.addFirst((java.lang.Object)arrayList21);
    java2.util2.ListIterator listIterator24 = linkedList5.listIterator();
    java2.util2.ArrayList arrayList25 = new java2.util2.ArrayList();
    java2.util2.Enumeration enumeration26 = java2.util2.Collections.enumeration((java2.util2.Collection)arrayList25);
    arrayList25.trimToSize();
    char char28 = '4';
    int i29 = java2.util2.Collections.binarySearch((java2.util2.List)arrayList25, (java.lang.Object)char28);
    java2.util2.Comparator comparator30 = java2.util2.Collections.reverseOrder();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int i31 = java2.util2.Collections.binarySearch((java2.util2.List)linkedList5, (java.lang.Object)char28, comparator30);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listIterator24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator30);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NaiveRegression0.test39"); }


    int i0 = 10;
    long long1 = 100L;
    java2.util2.List list2 = java2.util2.Collections.nCopies((int)i0, (java.lang.Object)long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NaiveRegression0.test40"); }


    java2.util2.ArrayList arrayList0 = new java2.util2.ArrayList();
    java2.util2.List list1 = java2.util2.Collections.synchronizedList((java2.util2.List)arrayList0);
    java2.util2.Iterator iterator2 = arrayList0.iterator();
    int i3 = 0;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object obj4 = arrayList0.remove((int)i3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator2);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NaiveRegression0.test41"); }


    java2.util2.ArrayList arrayList0 = new java2.util2.ArrayList();
    java2.util2.List list1 = java2.util2.Collections.synchronizedList((java2.util2.List)arrayList0);
    boolean b2 = true;
    int i3 = arrayList0.indexOf((java.lang.Object)b2);
    int i4 = 1;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object obj5 = arrayList0.get((int)i4);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NaiveRegression0.test42"); }


    int i0 = 100;
    java2.util2.ArrayList arrayList1 = new java2.util2.ArrayList(i0);
    short s2 = (short)100;
    java.lang.Object[] obj_array3 = new java.lang.Object[] { s2 };
    java.lang.Object[] obj_array4 = arrayList1.toArray(obj_array3);
    java2.util2.LinkedList linkedList5 = new java2.util2.LinkedList((java2.util2.Collection)arrayList1);
    int i6 = linkedList5.size();
    linkedList5.clear();
    int i8 = 0;
    int i9 = 100;
    java2.util2.ArrayList arrayList10 = new java2.util2.ArrayList(i9);
    short s11 = (short)100;
    java.lang.Object[] obj_array12 = new java.lang.Object[] { s11 };
    java.lang.Object[] obj_array13 = arrayList10.toArray(obj_array12);
    java2.util2.LinkedList linkedList14 = new java2.util2.LinkedList((java2.util2.Collection)arrayList10);
    int i15 = linkedList14.size();
    java2.util2.Iterator iterator16 = linkedList14.iterator();
    boolean b17 = linkedList5.addAll((int)i8, (java2.util2.Collection)linkedList14);
    java2.util2.LinkedList linkedList18 = new java2.util2.LinkedList((java2.util2.Collection)linkedList14);
    short s19 = (short)0;
    linkedList14.addLast((java.lang.Object)s19);
    java2.util2.Enumeration enumeration21 = java2.util2.Collections.enumeration((java2.util2.Collection)linkedList14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration21);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NaiveRegression0.test43"); }


    java2.util2.ArrayList arrayList0 = new java2.util2.ArrayList();
    java2.util2.Enumeration enumeration1 = java2.util2.Collections.enumeration((java2.util2.Collection)arrayList0);
    double d2 = 10.0d;
    boolean b3 = arrayList0.remove((java.lang.Object)d2);
    java2.util2.TreeSet treeSet4 = new java2.util2.TreeSet((java2.util2.Collection)arrayList0);
    java2.util2.List list5 = java2.util2.Collections.singletonList((java.lang.Object)treeSet4);
    int i6 = 100;
    java2.util2.ArrayList arrayList7 = new java2.util2.ArrayList(i6);
    boolean b8 = treeSet4.contains((java.lang.Object)arrayList7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NaiveRegression0.test44"); }


    int i0 = 100;
    java2.util2.ArrayList arrayList1 = new java2.util2.ArrayList(i0);
    short s2 = (short)100;
    java.lang.Object[] obj_array3 = new java.lang.Object[] { s2 };
    java.lang.Object[] obj_array4 = arrayList1.toArray(obj_array3);
    java2.util2.LinkedList linkedList5 = new java2.util2.LinkedList((java2.util2.Collection)arrayList1);
    int i6 = linkedList5.size();
    java2.util2.Iterator iterator7 = linkedList5.iterator();
    int i8 = 100;
    java2.util2.ArrayList arrayList9 = new java2.util2.ArrayList(i8);
    short s10 = (short)100;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { s10 };
    java.lang.Object[] obj_array12 = arrayList9.toArray(obj_array11);
    java2.util2.ArrayList arrayList13 = new java2.util2.ArrayList();
    java2.util2.List list14 = java2.util2.Collections.synchronizedList((java2.util2.List)arrayList13);
    boolean b15 = arrayList9.addAll((java2.util2.Collection)list14);
    java2.util2.Enumeration enumeration16 = java2.util2.Collections.enumeration((java2.util2.Collection)list14);
    boolean b17 = linkedList5.add((java.lang.Object)list14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NaiveRegression0.test45"); }


    int i0 = 10;
    java2.util2.ArrayList arrayList1 = new java2.util2.ArrayList();
    java2.util2.List list2 = java2.util2.Collections.nCopies((int)i0, (java.lang.Object)arrayList1);
    java2.util2.ArrayList arrayList3 = new java2.util2.ArrayList((java2.util2.Collection)arrayList1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NaiveRegression0.test46"); }


    int i0 = 100;
    java2.util2.ArrayList arrayList1 = new java2.util2.ArrayList(i0);
    short s2 = (short)100;
    java.lang.Object[] obj_array3 = new java.lang.Object[] { s2 };
    java.lang.Object[] obj_array4 = arrayList1.toArray(obj_array3);
    java2.util2.ArrayList arrayList5 = new java2.util2.ArrayList();
    java2.util2.Collections.copy((java2.util2.List)arrayList1, (java2.util2.List)arrayList5);
    int i7 = 100;
    java2.util2.ArrayList arrayList8 = new java2.util2.ArrayList(i7);
    short s9 = (short)100;
    java.lang.Object[] obj_array10 = new java.lang.Object[] { s9 };
    java.lang.Object[] obj_array11 = arrayList8.toArray(obj_array10);
    java2.util2.LinkedList linkedList12 = new java2.util2.LinkedList((java2.util2.Collection)arrayList8);
    arrayList8.clear();
    java.lang.Object[] obj_array14 = arrayList8.toArray();
    float f15 = 100.0f;
    boolean b16 = java2.util2.Collections.replaceAll((java2.util2.List)arrayList1, (java.lang.Object)arrayList8, (java.lang.Object)f15);
    int i17 = 1;
    arrayList1.ensureCapacity((int)i17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NaiveRegression0.test47"); }


    int i0 = 100;
    java2.util2.ArrayList arrayList1 = new java2.util2.ArrayList(i0);
    short s2 = (short)100;
    java.lang.Object[] obj_array3 = new java.lang.Object[] { s2 };
    java.lang.Object[] obj_array4 = arrayList1.toArray(obj_array3);
    java2.util2.LinkedList linkedList5 = new java2.util2.LinkedList((java2.util2.Collection)arrayList1);
    int i6 = linkedList5.size();
    java2.util2.Iterator iterator7 = linkedList5.iterator();
    java2.util2.Collection collection8 = java2.util2.Collections.unmodifiableCollection((java2.util2.Collection)linkedList5);
    int i9 = 10;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object obj10 = linkedList5.remove((int)i9);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection8);

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","NaiveRegression0.test48"); }


    java2.util2.ArrayList arrayList0 = new java2.util2.ArrayList();
    java2.util2.Enumeration enumeration1 = java2.util2.Collections.enumeration((java2.util2.Collection)arrayList0);
    double d2 = 10.0d;
    boolean b3 = arrayList0.remove((java.lang.Object)d2);
    java2.util2.TreeSet treeSet4 = new java2.util2.TreeSet((java2.util2.Collection)arrayList0);
    java2.util2.List list5 = java2.util2.Collections.singletonList((java.lang.Object)treeSet4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object obj6 = treeSet4.first();
      org.junit.Assert.fail("Expected exception of type java2.util2.NoSuchElementException");
    } catch (java2.util2.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);

  }

}
