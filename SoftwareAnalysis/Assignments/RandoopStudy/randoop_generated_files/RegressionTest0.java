
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }


    java.util.ArrayList<java.lang.Object> arraylist_obj0 = new java.util.ArrayList<java.lang.Object>();
    java.lang.Object[] obj_array15 = new java.lang.Object[] { 1.0d, 0, (short)10, (-1), 10L, "hi!", (short)0, (-1), ' ', (-1), 0.0d, 100.0f, '4', 10.0d };
    boolean b16 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>)arraylist_obj0, obj_array15);
    java.util.List<java.lang.Object[]> list_obj_array17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Collections.copy((java.util.List<java.lang.Object>)arraylist_obj0, list_obj_array17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }


    java.util.ArrayList<java.lang.Object[]> arraylist_obj_array0 = new java.util.ArrayList<java.lang.Object[]>();
    java.lang.Object[][] obj_array_array1 = new java.lang.Object[][] {  };
    boolean b2 = java.util.Collections.addAll((java.util.Collection<java.lang.Object[]>)arraylist_obj_array0, obj_array_array1);
    java.util.Comparator<java.lang.Object[]> comparator_obj_array3 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object[] obj_array4 = java.util.Collections.max((java.util.Collection<java.lang.Object[]>)arraylist_obj_array0, comparator_obj_array3);
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.util.NoSuchElementException")) {
        org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }


    java.util.SortedMap<java.lang.String,java.lang.Object[]> sortedmap_str_obj_array0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.SortedMap<java.lang.String,java.lang.Object[]> sortedmap_str_obj_array1 = java.util.Collections.unmodifiableSortedMap(sortedmap_str_obj_array0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }


    java.util.SortedMap<java.util.Collections,java.util.Collections> sortedmap_collections_collections0 = java.util.Collections.emptySortedMap();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedmap_collections_collections0);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }


    java.util.NavigableMap<java.lang.Object,java.util.Collections> navigablemap_obj_collections0 = null;
    java.lang.Class<java.lang.Object> cls1 = null;
    java.lang.Class<java.util.Collections> cls2 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.NavigableMap<java.lang.Object,java.util.Collections> navigablemap_obj_collections3 = java.util.Collections.checkedNavigableMap(navigablemap_obj_collections0, cls1, cls2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }


    java.util.LinkedHashSet<java.lang.Object[]> linkedhashset_obj_array0 = new java.util.LinkedHashSet<java.lang.Object[]>();
    java.lang.Object[][] obj_array_array1 = new java.lang.Object[][] {  };
    boolean b2 = java.util.Collections.addAll((java.util.Collection<java.lang.Object[]>)linkedhashset_obj_array0, obj_array_array1);
    java.lang.Class<java.lang.Object[]> cls3 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<java.lang.Object[]> set_obj_array4 = java.util.Collections.checkedSet((java.util.Set<java.lang.Object[]>)linkedhashset_obj_array0, cls3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }


    java.util.TreeSet<java.util.Random> treeset_random0 = new java.util.TreeSet<java.util.Random>();
    java.util.Random[] random_array1 = new java.util.Random[] {  };
    boolean b2 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)treeset_random0, random_array1);
    java.lang.Class<java.util.Random> cls3 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.NavigableSet<java.util.Random> navigableset_random4 = java.util.Collections.checkedNavigableSet((java.util.NavigableSet<java.util.Random>)treeset_random0, cls3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }


    java.util.LinkedHashSet<java.lang.Integer> linkedhashset_i0 = new java.util.LinkedHashSet<java.lang.Integer>();
    java.lang.Integer[] i_array5 = new java.lang.Integer[] { 0, 0, 0, 0 };
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)linkedhashset_i0, i_array5);
    java.util.Set<java.lang.Integer> set_i7 = java.util.Collections.synchronizedSet((java.util.Set<java.lang.Integer>)linkedhashset_i0);
    java.util.Collection<java.lang.Boolean> collection_b8 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = java.util.Collections.disjoint((java.util.Collection<java.lang.Integer>)set_i7, collection_b8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_i7);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }


    java.util.ArrayList<java.lang.Integer> arraylist_i0 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array4 = new java.lang.Integer[] { 100, 1, 1 };
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i0, i_array4);
    java.lang.Class<java.lang.Integer> cls6 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.lang.Integer> list_i7 = java.util.Collections.checkedList((java.util.List<java.lang.Integer>)arraylist_i0, cls6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }


    java.util.NavigableMap<java.lang.Integer,java.lang.String> navigablemap_i_str0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.NavigableMap<java.lang.Integer,java.lang.String> navigablemap_i_str1 = java.util.Collections.unmodifiableNavigableMap(navigablemap_i_str0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }


    java.util.ArrayList<java.util.Random> arraylist_random0 = new java.util.ArrayList<java.util.Random>();
    java.util.Random[] random_array1 = new java.util.Random[] {  };
    boolean b2 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)arraylist_random0, random_array1);
    java.util.Collections.rotate((java.util.List<java.util.Random>)arraylist_random0, (int)(short)0);
    java.util.Collections.rotate((java.util.List<java.util.Random>)arraylist_random0, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }


    java.util.ArrayList<java.lang.Integer> arraylist_i0 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 100, (-1) };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i0, i_array3);
    java.lang.Class<java.lang.Integer> cls5 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.lang.Integer> list_i6 = java.util.Collections.checkedList((java.util.List<java.lang.Integer>)arraylist_i0, cls5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }


    java.util.Comparator<java.lang.Object> comparator_obj0 = null;
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>(comparator_obj0);
    // The following exception was thrown during execution in test generation
    try {
    java.util.NavigableSet<java.lang.String> navigableset_str6 = treeset_str1.subSet("hi!", true, "", false);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }


    java.util.Map<java.lang.String,java.lang.String> map_str_str0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Map<java.lang.String,java.lang.String> map_str_str1 = java.util.Collections.synchronizedMap(map_str_str0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }


    java.util.LinkedList<java.lang.Object[]> linkedlist_obj_array0 = new java.util.LinkedList<java.lang.Object[]>();
    java.lang.Object[][] obj_array_array1 = new java.lang.Object[][] {  };
    boolean b2 = java.util.Collections.addAll((java.util.Collection<java.lang.Object[]>)linkedlist_obj_array0, obj_array_array1);
    java.lang.Class<java.lang.Object[]> cls3 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Queue<java.lang.Object[]> queue_obj_array4 = java.util.Collections.checkedQueue((java.util.Queue<java.lang.Object[]>)linkedlist_obj_array0, cls3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array1);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }


    java.util.Map<java.lang.Integer,java.lang.Long> map_i_long0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Map<java.lang.Integer,java.lang.Long> map_i_long1 = java.util.Collections.unmodifiableMap(map_i_long0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array2);
    // The following exception was thrown during execution in test generation
    try {
    boolean b5 = treeset_str0.remove((java.lang.Object)(-1L));
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }


    java.util.Comparator<java.lang.Object> comparator_obj0 = null;
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>(comparator_obj0);
    java.lang.String str3 = treeset_str1.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str5 = treeset_str1.headSet("");
    java.util.function.Consumer<java.lang.String> consumer_str6 = null;
    // The following exception was thrown during execution in test generation
    try {
    treeset_str1.forEach(consumer_str6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str5);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }


    java.util.TreeSet<java.util.Collections> treeset_collections0 = new java.util.TreeSet<java.util.Collections>();
    java.util.Collections[] collections_array1 = new java.util.Collections[] {  };
    boolean b2 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)treeset_collections0, collections_array1);
    java.lang.Class<java.util.Collections> cls3 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.SortedSet<java.util.Collections> sortedset_collections4 = java.util.Collections.checkedSortedSet((java.util.SortedSet<java.util.Collections>)treeset_collections0, cls3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array1);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }


    java.util.Collection<java.lang.String> collection_str0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i2 = java.util.Collections.frequency(collection_str0, (java.lang.Object)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }


    java.util.Comparator<java.lang.Long> comparator_long0 = java.util.Collections.reverseOrder();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_long0);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }


    java.util.Enumeration<java.util.Collections> enumeration_collections0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.ArrayList<java.util.Collections> arraylist_collections1 = java.util.Collections.list(enumeration_collections0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }


    java.util.LinkedHashSet<java.lang.String> linkedhashset_str0 = new java.util.LinkedHashSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "hi!" };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str0, str_array2);
    java.util.ArrayList<java.util.Collections> arraylist_collections4 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array5 = new java.util.Collections[] {  };
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections4, collections_array5);
    java.util.Collections collections7 = null;
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    int i9 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections4, collections7, comparator_obj8);
    boolean b10 = linkedhashset_str0.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections4);
    java.util.Collection<java.lang.String> collection_str11 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)linkedhashset_str0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str11);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }


    java.util.NavigableMap<java.util.Collections,java.lang.Boolean> navigablemap_collections_b0 = java.util.Collections.emptyNavigableMap();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigablemap_collections_b0);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }


    java.util.TreeSet<java.lang.Long> treeset_long0 = new java.util.TreeSet<java.lang.Long>();
    java.lang.Long[] long_array6 = new java.lang.Long[] { 0L, 10L, 1L, 10L, 100L };
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)treeset_long0, long_array6);
    java.util.NavigableSet<java.lang.Long> navigableset_long8 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long0);
    java.lang.Class<java.lang.Long> cls9 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Collection<java.lang.Long> collection_long10 = java.util.Collections.checkedCollection((java.util.Collection<java.lang.Long>)treeset_long0, cls9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_long8);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }


    java.util.NavigableSet<java.util.Random> navigableset_random0 = null;
    java.lang.Class<java.util.Random> cls1 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.NavigableSet<java.util.Random> navigableset_random2 = java.util.Collections.checkedNavigableSet(navigableset_random0, cls1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }


    java.util.Iterator<java.lang.Boolean> iterator_b0 = java.util.Collections.emptyIterator();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b0);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str7 = treeset_str0.descendingSet();
    java.lang.String str9 = treeset_str0.floor("hi!");
    java.util.TreeSet<java.lang.String> treeset_str10 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array13 = new java.lang.String[] { "", "" };
    boolean b14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str10, str_array13);
    java.util.Iterator<java.lang.String> iterator_str15 = treeset_str10.iterator();
    java.lang.String str17 = treeset_str10.higher("hi!");
    java.lang.String str18 = treeset_str10.pollFirst();
    java.util.Iterator<java.lang.String> iterator_str19 = treeset_str10.descendingIterator();
    // The following exception was thrown during execution in test generation
    try {
    boolean b20 = treeset_str0.remove((java.lang.Object)treeset_str10);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str15);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str19);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }


    java.util.SortedSet<java.lang.Object[]> sortedset_obj_array0 = java.util.Collections.emptySortedSet();
    java.lang.Class<java.lang.Object[]> cls1 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<java.lang.Object[]> set_obj_array2 = java.util.Collections.checkedSet((java.util.Set<java.lang.Object[]>)sortedset_obj_array0, cls1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_obj_array0);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str9 = treeset_str0.headSet("", false);
    // The following exception was thrown during execution in test generation
    try {
    boolean b11 = treeset_str0.contains((java.lang.Object)(-1.0d));
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str9);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    // The following exception was thrown during execution in test generation
    try {
    java.util.SortedSet<java.lang.String> sortedset_str3 = treeset_str0.subSet("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }


    java.util.List<java.lang.Integer> list_i0 = null;
    java.util.ArrayList<java.lang.Integer> arraylist_i1 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0 };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i1, i_array3);
    java.util.ArrayList<java.lang.Integer> arraylist_i5 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array7 = new java.lang.Integer[] { 1 };
    boolean b8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i5, i_array7);
    int i9 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i1, (java.util.List<java.lang.Integer>)arraylist_i5);
    // The following exception was thrown during execution in test generation
    try {
    int i10 = java.util.Collections.indexOfSubList(list_i0, (java.util.List<java.lang.Integer>)arraylist_i1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.lang.String str7 = treeset_str0.higher("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str10 = treeset_str0.tailSet("", true);
    java.util.stream.Stream<java.lang.String> stream_str11 = navigableset_str10.parallelStream();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str10);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str11);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }


    java.util.SortedMap<java.lang.Object[],java.util.Collections> sortedmap_obj_array_collections0 = null;
    java.lang.Class<java.lang.Object[]> cls1 = null;
    java.lang.Class<java.util.Collections> cls2 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.SortedMap<java.lang.Object[],java.util.Collections> sortedmap_obj_array_collections3 = java.util.Collections.checkedSortedMap(sortedmap_obj_array_collections0, cls1, cls2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }


    java.util.SortedMap<java.lang.Object,java.lang.String> sortedmap_obj_str0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.SortedMap<java.lang.Object,java.lang.String> sortedmap_obj_str1 = java.util.Collections.synchronizedSortedMap(sortedmap_obj_str0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }


    java.util.Random random0 = null;
    java.util.Map<java.util.Random,java.lang.Integer> map_random_i2 = java.util.Collections.singletonMap(random0, (java.lang.Integer)100);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_random_i2);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.lang.String str7 = treeset_str0.higher("hi!");
    treeset_str0.clear();
    java.util.Iterator<java.lang.String> iterator_str9 = treeset_str0.descendingIterator();
    java.util.Spliterator<java.lang.String> spliterator_str10 = treeset_str0.spliterator();
    boolean b12 = treeset_str0.contains((java.lang.Object)' ');

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str10);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }


    java.util.ArrayList<java.lang.Object[]> arraylist_obj_array0 = new java.util.ArrayList<java.lang.Object[]>();
    java.lang.Object[] obj_array2 = new java.lang.Object[] { (short)10 };
    java.util.Set<java.lang.Object[]> set_obj_array3 = java.util.Collections.singleton(obj_array2);
    java.util.NavigableMap<java.util.Collections,java.lang.Boolean> navigablemap_collections_b4 = java.util.Collections.emptyNavigableMap();
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    java.util.TreeSet<java.lang.String> treeset_str7 = new java.util.TreeSet<java.lang.String>(comparator_obj6);
    java.lang.String str9 = treeset_str7.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str11 = treeset_str7.headSet("");
    java.util.TreeSet<java.lang.String> treeset_str13 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array16 = new java.lang.String[] { "", "" };
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str13, str_array16);
    java.util.SortedSet<java.lang.String> sortedset_str19 = treeset_str13.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str22 = treeset_str13.headSet("", false);
    boolean b24 = treeset_str13.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str25 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str13);
    java.lang.Object[] obj_array26 = new java.lang.Object[] { navigablemap_collections_b4, true, sortedset_str11, 1.0d, treeset_str25 };
    java.util.Set<java.lang.Object[]> set_obj_array27 = java.util.Collections.singleton(obj_array26);
    java.lang.Object[][] obj_array_array28 = new java.lang.Object[][] { obj_array2, obj_array26 };
    boolean b29 = java.util.Collections.addAll((java.util.Collection<java.lang.Object[]>)arraylist_obj_array0, obj_array_array28);
    java.util.Random random30 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Collections.shuffle((java.util.List<java.lang.Object[]>)arraylist_obj_array0, random30);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigablemap_collections_b4);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str11);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str19);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str22);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array27);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array28);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }


    java.util.Enumeration<java.lang.Integer> enumeration_i0 = java.util.Collections.emptyEnumeration();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration_i0);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str9 = treeset_str0.headSet("", false);
    boolean b11 = treeset_str0.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str12 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str0);
    java.util.ArrayList<java.lang.Integer> arraylist_i13 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array15 = new java.lang.Integer[] { (-1) };
    boolean b16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i13, i_array15);
    java.util.ArrayList<java.lang.Boolean> arraylist_b17 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array19 = new java.lang.Boolean[] { false };
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b17, b_array19);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b17);
    boolean b22 = java.util.Collections.disjoint((java.util.Collection<java.lang.Integer>)arraylist_i13, (java.util.Collection<java.lang.Boolean>)arraylist_b17);
    // The following exception was thrown during execution in test generation
    try {
    boolean b23 = treeset_str0.containsAll((java.util.Collection<java.lang.Boolean>)arraylist_b17);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array19);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }


    java.util.ArrayList<java.util.Collections> arraylist_collections0 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array1 = new java.util.Collections[] {  };
    boolean b2 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections0, collections_array1);
    java.util.Collections collections3 = null;
    java.util.Collections.fill((java.util.List<java.util.Collections>)arraylist_collections0, collections3);
    java.util.Collections collections5 = null;
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    int i7 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections0, collections5, comparator_obj6);
    java.util.Collections.reverse((java.util.List<java.util.Collections>)arraylist_collections0);
    java.util.Collection<java.util.Collections> collection_collections9 = java.util.Collections.unmodifiableCollection((java.util.Collection<java.util.Collections>)arraylist_collections0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array1);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_collections9);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }


    java.util.Comparator<java.lang.Object> comparator_obj0 = null;
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>(comparator_obj0);
    java.lang.String str3 = treeset_str1.higher("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str6 = treeset_str1.headSet("hi!", false);
    java.util.TreeSet<java.lang.String> treeset_str7 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array10 = new java.lang.String[] { "", "" };
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str7, str_array10);
    java.util.Iterator<java.lang.String> iterator_str12 = treeset_str7.iterator();
    java.lang.String str14 = treeset_str7.higher("hi!");
    java.lang.String str15 = treeset_str7.pollFirst();
    java.lang.String str17 = treeset_str7.lower("");
    boolean b18 = treeset_str1.addAll((java.util.Collection<java.lang.String>)treeset_str7);
    java.lang.Object obj19 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b20 = treeset_str1.remove(obj19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }


    java.util.Random random0 = null;
    java.util.Map<java.util.Random,java.lang.Integer> map_random_i2 = java.util.Collections.singletonMap(random0, (java.lang.Integer)1);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_random_i2);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }


    java.util.Set<java.lang.Integer> set_i0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<java.lang.Integer> set_i1 = java.util.Collections.synchronizedSet(set_i0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }


    java.util.Map<java.util.Collections,java.lang.Integer> map_collections_i0 = java.util.Collections.EMPTY_MAP;

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_collections_i0);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str7 = treeset_str0.descendingSet();
    java.lang.String str9 = treeset_str0.lower("hi!");

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }


    java.util.ArrayList<java.lang.Integer> arraylist_i0 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array2 = new java.lang.Integer[] { 0 };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i0, i_array2);
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array6 = new java.lang.Integer[] { 1 };
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array6);
    int i8 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i0, (java.util.List<java.lang.Integer>)arraylist_i4);
    java.util.ArrayList<java.lang.Integer> arraylist_i9 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array11 = new java.lang.Integer[] { (-1) };
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i9, i_array11);
    java.util.ArrayList<java.lang.Integer> arraylist_i13 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array15 = new java.lang.Integer[] { 0 };
    boolean b16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i13, i_array15);
    java.util.ArrayList<java.lang.Integer> arraylist_i17 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array19 = new java.lang.Integer[] { 1 };
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i17, i_array19);
    int i21 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i13, (java.util.List<java.lang.Integer>)arraylist_i17);
    int i22 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i9, (java.util.List<java.lang.Integer>)arraylist_i13);
    int i23 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i4, (java.util.List<java.lang.Integer>)arraylist_i9);
    java.lang.Class<java.lang.Integer> cls24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.lang.Integer> list_i25 = java.util.Collections.checkedList((java.util.List<java.lang.Integer>)arraylist_i4, cls24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == (-1));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }


    java.util.LinkedHashSet<java.lang.String> linkedhashset_str0 = new java.util.LinkedHashSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "hi!" };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str0, str_array2);
    java.util.ArrayList<java.util.Collections> arraylist_collections4 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array5 = new java.util.Collections[] {  };
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections4, collections_array5);
    java.util.Collections collections7 = null;
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    int i9 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections4, collections7, comparator_obj8);
    boolean b10 = linkedhashset_str0.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections4);
    java.util.Collections collections11 = null;
    java.util.Collections.fill((java.util.List<java.util.Collections>)arraylist_collections4, collections11);
    java.util.Collections collections13 = null;
    java.util.Collections.fill((java.util.List<java.util.Collections>)arraylist_collections4, collections13);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.lang.String str7 = treeset_str0.higher("hi!");
    java.util.function.Consumer<java.lang.String> consumer_str8 = null;
    // The following exception was thrown during execution in test generation
    try {
    treeset_str0.forEach(consumer_str8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }


    java.util.Comparator<java.lang.Object> comparator_obj0 = null;
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>(comparator_obj0);
    java.lang.String str3 = treeset_str1.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str5 = treeset_str1.headSet("");
    java.util.Iterator<java.lang.String> iterator_str6 = treeset_str1.descendingIterator();
    java.util.NavigableSet<java.lang.String> navigableset_str7 = treeset_str1.descendingSet();
    java.lang.String str9 = treeset_str1.lower("hi!");

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }


    java.util.LinkedHashSet<java.lang.String> linkedhashset_str0 = new java.util.LinkedHashSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "hi!" };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str0, str_array2);
    java.util.ArrayList<java.util.Collections> arraylist_collections4 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array5 = new java.util.Collections[] {  };
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections4, collections_array5);
    java.util.Collections collections7 = null;
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    int i9 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections4, collections7, comparator_obj8);
    boolean b10 = linkedhashset_str0.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections4);
    java.util.Collections.reverse((java.util.List<java.util.Collections>)arraylist_collections4);
    java.util.List<java.util.Collections> list_collections12 = java.util.Collections.unmodifiableList((java.util.List<java.util.Collections>)arraylist_collections4);
    java.util.Collections collections13 = null;
    java.util.Comparator<java.lang.Object> comparator_obj14 = null;
    int i15 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections4, collections13, comparator_obj14);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_collections12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str9 = treeset_str0.headSet("", false);
    java.util.stream.Stream<java.lang.String> stream_str10 = navigableset_str9.parallelStream();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str10);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str9 = treeset_str0.headSet("", false);
    java.util.Comparator<?> comparator_obj10 = treeset_str0.comparator();
    java.util.function.Consumer<java.lang.String> consumer_str11 = null;
    // The following exception was thrown during execution in test generation
    try {
    treeset_str0.forEach(consumer_str11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_obj10);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }


    java.util.LinkedHashSet<java.lang.String> linkedhashset_str0 = new java.util.LinkedHashSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "hi!" };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str0, str_array2);
    java.util.ArrayList<java.util.Collections> arraylist_collections4 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array5 = new java.util.Collections[] {  };
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections4, collections_array5);
    java.util.Collections collections7 = null;
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    int i9 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections4, collections7, comparator_obj8);
    boolean b10 = linkedhashset_str0.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections4);
    java.lang.Object[] obj_array11 = linkedhashset_str0.toArray();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }


    java.util.NavigableMap<java.util.Collections,java.util.Random> navigablemap_collections_random0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.NavigableMap<java.util.Collections,java.util.Random> navigablemap_collections_random1 = java.util.Collections.synchronizedNavigableMap(navigablemap_collections_random0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }


    java.util.ArrayList<java.lang.Long> arraylist_long0 = new java.util.ArrayList<java.lang.Long>();
    java.lang.Long[] long_array5 = new java.lang.Long[] { (-1L), (-1L), 1L, 100L };
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long0, long_array5);
    boolean b9 = java.util.Collections.replaceAll((java.util.List<java.lang.Long>)arraylist_long0, (java.lang.Long)(-1L), (java.lang.Long)0L);
    java.lang.Class<java.lang.Long> cls10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Collection<java.lang.Long> collection_long11 = java.util.Collections.checkedCollection((java.util.Collection<java.lang.Long>)arraylist_long0, cls10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.lang.String str7 = treeset_str0.higher("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str10 = treeset_str0.tailSet("", true);
    java.util.TreeSet<java.lang.Boolean> treeset_b11 = new java.util.TreeSet<java.lang.Boolean>();
    java.lang.Boolean[] b_array13 = new java.lang.Boolean[] { true };
    boolean b14 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)treeset_b11, b_array13);
    java.util.NavigableSet<java.lang.Boolean> navigableset_b15 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.lang.Boolean>)treeset_b11);
    // The following exception was thrown during execution in test generation
    try {
    boolean b16 = treeset_str0.containsAll((java.util.Collection<java.lang.Boolean>)navigableset_b15);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str10);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array13);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_b15);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.lang.String str7 = treeset_str0.higher("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str10 = treeset_str0.tailSet("", true);
    java.util.Spliterator<java.lang.String> spliterator_str11 = treeset_str0.spliterator();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str10);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str11);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.lang.String str7 = treeset_str0.higher("hi!");
    treeset_str0.clear();
    java.util.Comparator<java.lang.String> comparator_str9 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str10 = java.util.Collections.min((java.util.Collection<java.lang.String>)treeset_str0, comparator_str9);
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.util.NoSuchElementException")) {
        org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }


    java.util.ArrayList<java.lang.Integer> arraylist_i0 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array2 = new java.lang.Integer[] { 0 };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i0, i_array2);
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array6 = new java.lang.Integer[] { 1 };
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array6);
    int i8 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i0, (java.util.List<java.lang.Integer>)arraylist_i4);
    java.lang.Integer i9 = java.util.Collections.min((java.util.Collection<java.lang.Integer>)arraylist_i4);
    java.lang.Class<java.lang.Integer> cls10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.lang.Integer> list_i11 = java.util.Collections.checkedList((java.util.List<java.lang.Integer>)arraylist_i4, cls10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 1+ "'", i9.equals(1));

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }


    java.util.List<java.lang.Integer> list_i0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Collections.swap(list_i0, (int)(short)-1, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }


    java.util.LinkedHashSet<java.lang.String> linkedhashset_str0 = new java.util.LinkedHashSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "hi!" };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str0, str_array2);
    java.util.ArrayList<java.util.Collections> arraylist_collections4 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array5 = new java.util.Collections[] {  };
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections4, collections_array5);
    java.util.Collections collections7 = null;
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    int i9 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections4, collections7, comparator_obj8);
    boolean b10 = linkedhashset_str0.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections4);
    java.util.function.Consumer<java.lang.String> consumer_str11 = null;
    // The following exception was thrown during execution in test generation
    try {
    linkedhashset_str0.forEach(consumer_str11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }


    java.util.ArrayList<java.lang.Object[]> arraylist_obj_array0 = new java.util.ArrayList<java.lang.Object[]>();
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str1 = new java.util.LinkedHashSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str1, str_array3);
    java.util.ArrayList<java.util.Collections> arraylist_collections5 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array6 = new java.util.Collections[] {  };
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections5, collections_array6);
    java.util.Collections collections8 = null;
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    int i10 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections5, collections8, comparator_obj9);
    boolean b11 = linkedhashset_str1.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections5);
    java.lang.Object[] obj_array12 = linkedhashset_str1.toArray();
    java.util.NavigableMap<java.util.Collections,java.lang.Boolean> navigablemap_collections_b13 = java.util.Collections.emptyNavigableMap();
    java.util.Comparator<java.lang.Object> comparator_obj15 = null;
    java.util.TreeSet<java.lang.String> treeset_str16 = new java.util.TreeSet<java.lang.String>(comparator_obj15);
    java.lang.String str18 = treeset_str16.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str20 = treeset_str16.headSet("");
    java.util.TreeSet<java.lang.String> treeset_str22 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array25 = new java.lang.String[] { "", "" };
    boolean b26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str22, str_array25);
    java.util.SortedSet<java.lang.String> sortedset_str28 = treeset_str22.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str31 = treeset_str22.headSet("", false);
    boolean b33 = treeset_str22.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str34 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str22);
    java.lang.Object[] obj_array35 = new java.lang.Object[] { navigablemap_collections_b13, true, sortedset_str20, 1.0d, treeset_str34 };
    java.util.Set<java.lang.Object[]> set_obj_array36 = java.util.Collections.singleton(obj_array35);
    java.util.Set<java.lang.Object[]> set_obj_array37 = java.util.Collections.singleton(obj_array35);
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str38 = new java.util.LinkedHashSet<java.lang.String>();
    java.lang.String[] str_array40 = new java.lang.String[] { "hi!" };
    boolean b41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str38, str_array40);
    java.util.ArrayList<java.util.Collections> arraylist_collections42 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array43 = new java.util.Collections[] {  };
    boolean b44 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections42, collections_array43);
    java.util.Collections collections45 = null;
    java.util.Comparator<java.lang.Object> comparator_obj46 = null;
    int i47 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections42, collections45, comparator_obj46);
    boolean b48 = linkedhashset_str38.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections42);
    java.lang.Object[] obj_array49 = linkedhashset_str38.toArray();
    java.lang.Object[][] obj_array_array50 = new java.lang.Object[][] { obj_array12, obj_array35, obj_array49 };
    boolean b51 = java.util.Collections.addAll((java.util.Collection<java.lang.Object[]>)arraylist_obj_array0, obj_array_array50);
    java.util.Random random52 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Collections.shuffle((java.util.List<java.lang.Object[]>)arraylist_obj_array0, random52);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigablemap_collections_b13);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str20);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str28);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str31);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array36);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array37);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array40);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array43);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array49);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array50);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }


    java.util.TreeSet<java.lang.Integer> treeset_i0 = new java.util.TreeSet<java.lang.Integer>();
    java.lang.Integer[] i_array2 = new java.lang.Integer[] { (-1) };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)treeset_i0, i_array2);
    java.util.SortedSet<java.lang.Integer> sortedset_i4 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.Integer>)treeset_i0);
    java.util.SortedSet<java.lang.Integer> sortedset_i5 = java.util.Collections.synchronizedSortedSet(sortedset_i4);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_i4);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_i5);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }


    java.util.LinkedList<java.lang.Object[]> linkedlist_obj_array0 = new java.util.LinkedList<java.lang.Object[]>();
    java.util.NavigableMap<java.util.Collections,java.lang.Boolean> navigablemap_collections_b1 = java.util.Collections.emptyNavigableMap();
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    java.util.TreeSet<java.lang.String> treeset_str4 = new java.util.TreeSet<java.lang.String>(comparator_obj3);
    java.lang.String str6 = treeset_str4.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str8 = treeset_str4.headSet("");
    java.util.TreeSet<java.lang.String> treeset_str10 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array13 = new java.lang.String[] { "", "" };
    boolean b14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str10, str_array13);
    java.util.SortedSet<java.lang.String> sortedset_str16 = treeset_str10.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str19 = treeset_str10.headSet("", false);
    boolean b21 = treeset_str10.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str22 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str10);
    java.lang.Object[] obj_array23 = new java.lang.Object[] { navigablemap_collections_b1, true, sortedset_str8, 1.0d, treeset_str22 };
    java.util.Set<java.lang.Object[]> set_obj_array24 = java.util.Collections.singleton(obj_array23);
    java.lang.Object[][] obj_array_array25 = new java.lang.Object[][] { obj_array23 };
    boolean b26 = java.util.Collections.addAll((java.util.Collection<java.lang.Object[]>)linkedlist_obj_array0, obj_array_array25);
    java.lang.Class<java.lang.Object[]> cls27 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Queue<java.lang.Object[]> queue_obj_array28 = java.util.Collections.checkedQueue((java.util.Queue<java.lang.Object[]>)linkedlist_obj_array0, cls27);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigablemap_collections_b1);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str8);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str16);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str19);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array24);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array25);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str9 = treeset_str0.headSet("", false);
    boolean b11 = treeset_str0.add("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str12 = treeset_str0.descendingSet();
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str13 = new java.util.LinkedHashSet<java.lang.String>();
    java.lang.String[] str_array15 = new java.lang.String[] { "hi!" };
    boolean b16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str13, str_array15);
    java.util.ArrayList<java.util.Collections> arraylist_collections17 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array18 = new java.util.Collections[] {  };
    boolean b19 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections17, collections_array18);
    java.util.Collections collections20 = null;
    java.util.Comparator<java.lang.Object> comparator_obj21 = null;
    int i22 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections17, collections20, comparator_obj21);
    boolean b23 = linkedhashset_str13.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections17);
    // The following exception was thrown during execution in test generation
    try {
    boolean b24 = treeset_str0.remove((java.lang.Object)linkedhashset_str13);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array18);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }


    java.util.Comparator<java.lang.Object> comparator_obj0 = null;
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>(comparator_obj0);
    java.lang.String str3 = treeset_str1.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str5 = treeset_str1.headSet("");
    java.util.Iterator<java.lang.String> iterator_str6 = treeset_str1.descendingIterator();
    boolean b7 = treeset_str1.isEmpty();
    boolean b8 = treeset_str1.isEmpty();
    java.lang.String str10 = treeset_str1.ceiling("hi!");

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }


    java.util.NavigableMap<java.util.Collections,java.lang.Boolean> navigablemap_collections_b0 = java.util.Collections.emptyNavigableMap();
    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    java.util.TreeSet<java.lang.String> treeset_str3 = new java.util.TreeSet<java.lang.String>(comparator_obj2);
    java.lang.String str5 = treeset_str3.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str7 = treeset_str3.headSet("");
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array12 = new java.lang.String[] { "", "" };
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str9, str_array12);
    java.util.SortedSet<java.lang.String> sortedset_str15 = treeset_str9.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str18 = treeset_str9.headSet("", false);
    boolean b20 = treeset_str9.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str21 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str9);
    java.lang.Object[] obj_array22 = new java.lang.Object[] { navigablemap_collections_b0, true, sortedset_str7, 1.0d, treeset_str21 };
    java.util.Set<java.lang.Object[]> set_obj_array23 = java.util.Collections.singleton(obj_array22);
    java.util.Set<java.lang.Object[]> set_obj_array24 = java.util.Collections.singleton(obj_array22);
    java.lang.Class<java.lang.Object[]> cls25 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<java.lang.Object[]> set_obj_array26 = java.util.Collections.checkedSet(set_obj_array24, cls25);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigablemap_collections_b0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str15);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str18);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array23);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array24);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array2);
    java.util.ArrayList<java.lang.Object> arraylist_obj4 = new java.util.ArrayList<java.lang.Object>();
    java.util.ArrayList<java.util.Random> arraylist_random8 = new java.util.ArrayList<java.util.Random>();
    java.util.Random[] random_array9 = new java.util.Random[] {  };
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)arraylist_random8, random_array9);
    java.util.Collections.rotate((java.util.List<java.util.Random>)arraylist_random8, (int)(short)0);
    java.lang.Object[] obj_array22 = new java.lang.Object[] { 10.0f, ' ', 0L, arraylist_random8, (short)1, 100L, (short)0, (-1.0f), (-1L), 1.0f, 100.0f, (short)1, (-1.0f) };
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>)arraylist_obj4, obj_array22);
    boolean b24 = arraylist_str0.retainAll((java.util.Collection<java.lang.Object>)arraylist_obj4);
    java.util.Collection<java.lang.String> collection_str25 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str0);
    java.util.stream.Stream<java.lang.String> stream_str26 = arraylist_str0.stream();
    java.util.stream.Stream<java.lang.String> stream_str27 = arraylist_str0.stream();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random_array9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str25);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str26);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str27);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }


    java.util.List<java.util.Random> list_random0 = java.util.Collections.EMPTY_LIST;

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_random0);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }


    java.util.Collection<java.lang.String> collection_str0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Collection<java.lang.String> collection_str1 = java.util.Collections.synchronizedCollection(collection_str0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }


    java.util.TreeSet<java.lang.Integer> treeset_i0 = new java.util.TreeSet<java.lang.Integer>();
    java.lang.Integer[] i_array2 = new java.lang.Integer[] { (-1) };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)treeset_i0, i_array2);
    java.util.SortedSet<java.lang.Integer> sortedset_i4 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.Integer>)treeset_i0);
    java.lang.Integer i5 = java.util.Collections.min((java.util.Collection<java.lang.Integer>)sortedset_i4);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_i4);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }


    java.util.ListIterator<java.lang.Boolean> listiterator_b0 = java.util.Collections.emptyListIterator();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listiterator_b0);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }


    java.util.LinkedHashSet<java.lang.String> linkedhashset_str0 = new java.util.LinkedHashSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "hi!" };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str0, str_array2);
    java.util.ArrayList<java.util.Collections> arraylist_collections4 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array5 = new java.util.Collections[] {  };
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections4, collections_array5);
    java.util.Collections collections7 = null;
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    int i9 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections4, collections7, comparator_obj8);
    boolean b10 = linkedhashset_str0.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections4);
    java.util.Collections.reverse((java.util.List<java.util.Collections>)arraylist_collections4);
    java.util.List<java.util.Collections> list_collections12 = java.util.Collections.unmodifiableList((java.util.List<java.util.Collections>)arraylist_collections4);
    java.util.Collections.reverse((java.util.List<java.util.Collections>)arraylist_collections4);
    java.util.Collections collections14 = null;
    java.util.Comparator<java.lang.Object> comparator_obj15 = null;
    java.util.Comparator<java.lang.Object> comparator_obj16 = java.util.Collections.reverseOrder(comparator_obj15);
    int i17 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections4, collections14, comparator_obj16);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_collections12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj16);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }


    java.util.List<java.lang.Boolean> list_b1 = java.util.Collections.singletonList((java.lang.Boolean)false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_b1);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }


    java.util.List<java.lang.Integer> list_i0 = java.util.Collections.emptyList();
    java.lang.Class<java.lang.Integer> cls1 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.lang.Integer> list_i2 = java.util.Collections.checkedList(list_i0, cls1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i0);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.lang.String str7 = treeset_str0.higher("hi!");
    java.lang.String str8 = treeset_str0.pollFirst();
    java.lang.String str10 = treeset_str0.lower("");
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = treeset_str0.last();
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.util.NoSuchElementException")) {
        org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }


    java.util.Map<java.lang.Integer,java.util.Collections> map_i_collections0 = null;
    java.lang.Class<java.lang.Integer> cls1 = null;
    java.lang.Class<java.util.Collections> cls2 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Map<java.lang.Integer,java.util.Collections> map_i_collections3 = java.util.Collections.checkedMap(map_i_collections0, cls1, cls2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }


    java.util.Comparator<java.lang.Object> comparator_obj0 = null;
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>(comparator_obj0);
    java.lang.String str3 = treeset_str1.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str5 = treeset_str1.headSet("");
    java.util.Iterator<java.lang.String> iterator_str6 = treeset_str1.descendingIterator();
    boolean b7 = treeset_str1.isEmpty();
    java.util.function.Predicate<java.lang.Object> predicate_obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = treeset_str1.removeIf(predicate_obj8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }


    java.util.Queue<java.lang.Object[]> queue_obj_array0 = null;
    java.lang.Class<java.lang.Object[]> cls1 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Queue<java.lang.Object[]> queue_obj_array2 = java.util.Collections.checkedQueue(queue_obj_array0, cls1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.lang.String str7 = treeset_str0.higher("hi!");
    java.util.Comparator<?> comparator_obj8 = treeset_str0.comparator();
    java.util.function.Consumer<java.lang.String> consumer_str9 = null;
    // The following exception was thrown during execution in test generation
    try {
    treeset_str0.forEach(consumer_str9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_obj8);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }


    java.util.ArrayList<java.lang.Long> arraylist_long0 = new java.util.ArrayList<java.lang.Long>();
    java.lang.Long[] long_array5 = new java.lang.Long[] { 10L, 0L, 0L, 1L };
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long0, long_array5);
    boolean b9 = java.util.Collections.replaceAll((java.util.List<java.lang.Long>)arraylist_long0, (java.lang.Long)100L, (java.lang.Long)1L);
    boolean b12 = java.util.Collections.replaceAll((java.util.List<java.lang.Long>)arraylist_long0, (java.lang.Long)0L, (java.lang.Long)100L);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }


    java.util.Random random0 = null;
    java.util.Map<java.util.Random,java.lang.Integer> map_random_i2 = java.util.Collections.singletonMap(random0, (java.lang.Integer)0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_random_i2);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }


    java.util.ArrayList<java.lang.Integer> arraylist_i0 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array2 = new java.lang.Integer[] { (-1) };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i0, i_array2);
    java.util.ArrayList<java.lang.Boolean> arraylist_b4 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array6 = new java.lang.Boolean[] { false };
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b4, b_array6);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b4);
    boolean b9 = java.util.Collections.disjoint((java.util.Collection<java.lang.Integer>)arraylist_i0, (java.util.Collection<java.lang.Boolean>)arraylist_b4);
    // The following exception was thrown during execution in test generation
    try {
    java.util.Collections.swap((java.util.List<java.lang.Integer>)arraylist_i0, 0, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str9 = treeset_str0.headSet("", false);
    boolean b11 = treeset_str0.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str12 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str0);
    java.util.stream.Stream<java.lang.String> stream_str13 = treeset_str12.stream();
    java.util.NavigableSet<java.lang.String> navigableset_str14 = treeset_str12.descendingSet();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str13);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str14);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.lang.String str7 = treeset_str0.higher("hi!");
    java.lang.String str8 = treeset_str0.pollFirst();
    int i9 = treeset_str0.size();
    java.util.stream.Stream<java.lang.String> stream_str10 = treeset_str0.stream();
    java.util.NavigableSet<java.lang.String> navigableset_str13 = treeset_str0.tailSet("hi!", true);
    java.util.ArrayDeque<java.lang.String> arraydeque_str14 = new java.util.ArrayDeque<java.lang.String>();
    java.lang.String[] str_array17 = new java.lang.String[] { "hi!", "hi!" };
    boolean b18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraydeque_str14, str_array17);
    java.util.Queue<java.lang.String> queue_str19 = java.util.Collections.asLifoQueue((java.util.Deque<java.lang.String>)arraydeque_str14);
    // The following exception was thrown during execution in test generation
    try {
    boolean b20 = treeset_str0.contains((java.lang.Object)queue_str19);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str10);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str13);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(queue_str19);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.lang.String str7 = treeset_str0.higher("hi!");
    treeset_str0.clear();
    java.util.Iterator<java.lang.String> iterator_str9 = treeset_str0.descendingIterator();
    java.util.Spliterator<java.lang.String> spliterator_str10 = treeset_str0.spliterator();
    int i11 = treeset_str0.size();
    boolean b13 = treeset_str0.add("");

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str10);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str7 = treeset_str0.descendingSet();
    java.lang.String str9 = treeset_str0.floor("hi!");
    java.util.function.Predicate<java.lang.Object> predicate_obj10 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b11 = treeset_str0.removeIf(predicate_obj10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.lang.String str7 = treeset_str0.higher("hi!");
    java.lang.String str8 = treeset_str0.pollFirst();
    int i9 = treeset_str0.size();
    java.util.stream.Stream<java.lang.String> stream_str10 = treeset_str0.stream();
    java.util.NavigableSet<java.lang.String> navigableset_str13 = treeset_str0.tailSet("hi!", true);
    java.util.Collection<java.lang.String> collection_str14 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)navigableset_str13);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str10);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str13);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str14);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str9 = treeset_str0.headSet("", false);
    boolean b11 = treeset_str0.add("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str12 = treeset_str0.descendingSet();
    java.lang.String str13 = treeset_str0.first();
    java.lang.Object[] obj_array14 = treeset_str0.toArray();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }


    java.util.TreeSet<java.lang.Long> treeset_long0 = new java.util.TreeSet<java.lang.Long>();
    java.lang.Long[] long_array6 = new java.lang.Long[] { 0L, 10L, 1L, 10L, 100L };
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)treeset_long0, long_array6);
    java.util.NavigableSet<java.lang.Long> navigableset_long8 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long0);
    java.lang.Long long9 = java.util.Collections.max((java.util.Collection<java.lang.Long>)navigableset_long8);
    java.util.NavigableSet<java.lang.Long> navigableset_long10 = java.util.Collections.unmodifiableNavigableSet(navigableset_long8);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_long8);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L+ "'", long9.equals(100L));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_long10);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.lang.String str7 = treeset_str0.higher("hi!");
    treeset_str0.clear();
    java.util.Iterator<java.lang.String> iterator_str9 = treeset_str0.descendingIterator();
    java.util.Spliterator<java.lang.String> spliterator_str10 = treeset_str0.spliterator();
    int i11 = treeset_str0.size();
    java.util.SortedSet<java.lang.String> sortedset_str13 = treeset_str0.headSet("");
    java.util.Collection<java.lang.String> collection_str14 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)sortedset_str13);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str10);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str13);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str14);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }


    java.util.Random random0 = null;
    java.util.Map<java.util.Random,java.lang.Integer> map_random_i2 = java.util.Collections.singletonMap(random0, (java.lang.Integer)10);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_random_i2);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str7 = treeset_str0.descendingSet();
    java.lang.String str9 = treeset_str0.floor("hi!");
    java.lang.String str11 = treeset_str0.higher("");

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array2);
    java.util.ArrayList<java.lang.Object> arraylist_obj4 = new java.util.ArrayList<java.lang.Object>();
    java.util.ArrayList<java.util.Random> arraylist_random8 = new java.util.ArrayList<java.util.Random>();
    java.util.Random[] random_array9 = new java.util.Random[] {  };
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)arraylist_random8, random_array9);
    java.util.Collections.rotate((java.util.List<java.util.Random>)arraylist_random8, (int)(short)0);
    java.lang.Object[] obj_array22 = new java.lang.Object[] { 10.0f, ' ', 0L, arraylist_random8, (short)1, 100L, (short)0, (-1.0f), (-1L), 1.0f, 100.0f, (short)1, (-1.0f) };
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>)arraylist_obj4, obj_array22);
    boolean b24 = arraylist_str0.retainAll((java.util.Collection<java.lang.Object>)arraylist_obj4);
    java.util.Collection<java.lang.String> collection_str25 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str0);
    java.util.stream.Stream<java.lang.String> stream_str26 = arraylist_str0.stream();
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str27 = new java.util.LinkedHashSet<java.lang.String>();
    java.lang.String[] str_array29 = new java.lang.String[] { "hi!" };
    boolean b30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str27, str_array29);
    java.util.ArrayList<java.util.Collections> arraylist_collections31 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array32 = new java.util.Collections[] {  };
    boolean b33 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections31, collections_array32);
    java.util.Collections collections34 = null;
    java.util.Comparator<java.lang.Object> comparator_obj35 = null;
    int i36 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections31, collections34, comparator_obj35);
    boolean b37 = linkedhashset_str27.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections31);
    java.util.Collections collections38 = null;
    java.util.Collections.fill((java.util.List<java.util.Collections>)arraylist_collections31, collections38);
    java.util.Collections collections40 = null;
    java.util.Comparator<java.lang.Object> comparator_obj41 = null;
    java.util.Comparator<java.lang.Object> comparator_obj42 = java.util.Collections.reverseOrder(comparator_obj41);
    int i43 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections31, collections40, comparator_obj42);
    java.util.Comparator<java.lang.Object> comparator_obj44 = java.util.Collections.reverseOrder(comparator_obj42);
    int i45 = java.util.Collections.frequency((java.util.Collection<java.lang.String>)arraylist_str0, (java.lang.Object)comparator_obj42);
    java.util.function.Consumer<java.lang.String> consumer_str46 = null;
    // The following exception was thrown during execution in test generation
    try {
    arraylist_str0.forEach(consumer_str46);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random_array9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str25);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str26);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array29);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array32);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj42);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj44);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }


    java.util.LinkedList<java.lang.Object[]> linkedlist_obj_array0 = new java.util.LinkedList<java.lang.Object[]>();
    java.lang.Object[] obj_array2 = new java.lang.Object[] { (short)10 };
    java.util.Set<java.lang.Object[]> set_obj_array3 = java.util.Collections.singleton(obj_array2);
    java.util.TreeSet<java.lang.String> treeset_str4 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array7 = new java.lang.String[] { "", "" };
    boolean b8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str4, str_array7);
    java.util.SortedSet<java.lang.String> sortedset_str10 = treeset_str4.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str11 = treeset_str4.descendingSet();
    java.lang.Object[] obj_array12 = treeset_str4.toArray();
    java.util.TreeSet<java.lang.String> treeset_str13 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array16 = new java.lang.String[] { "", "" };
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str13, str_array16);
    java.util.SortedSet<java.lang.String> sortedset_str19 = treeset_str13.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str22 = treeset_str13.headSet("", false);
    boolean b24 = treeset_str13.add("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str25 = treeset_str13.descendingSet();
    java.lang.String str26 = treeset_str13.first();
    java.lang.Object[] obj_array27 = treeset_str13.toArray();
    java.util.TreeSet<java.lang.String> treeset_str28 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array31 = new java.lang.String[] { "", "" };
    boolean b32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str28, str_array31);
    java.util.Iterator<java.lang.String> iterator_str33 = treeset_str28.iterator();
    java.lang.String str35 = treeset_str28.higher("hi!");
    java.lang.String str36 = treeset_str28.pollFirst();
    java.util.Comparator<java.lang.Object> comparator_obj37 = null;
    java.util.TreeSet<java.lang.String> treeset_str38 = new java.util.TreeSet<java.lang.String>(comparator_obj37);
    java.lang.String str40 = treeset_str38.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str42 = treeset_str38.headSet("");
    boolean b43 = treeset_str28.addAll((java.util.Collection<java.lang.String>)treeset_str38);
    java.lang.Object[] obj_array44 = treeset_str28.toArray();
    java.util.Set<java.lang.Object[]> set_obj_array45 = java.util.Collections.singleton(obj_array44);
    java.lang.Object[][] obj_array_array46 = new java.lang.Object[][] { obj_array2, obj_array12, obj_array27, obj_array44 };
    boolean b47 = java.util.Collections.addAll((java.util.Collection<java.lang.Object[]>)linkedlist_obj_array0, obj_array_array46);
    java.lang.Class<java.lang.Object[]> cls48 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Queue<java.lang.Object[]> queue_obj_array49 = java.util.Collections.checkedQueue((java.util.Queue<java.lang.Object[]>)linkedlist_obj_array0, cls48);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str10);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str11);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str19);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str22);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str25);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array31);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str33);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str35);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + ""+ "'", str36.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str40);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str42);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array44);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array45);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array46);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }


    java.util.ArrayList<java.lang.Boolean> arraylist_b0 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array2 = new java.lang.Boolean[] { false };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b0, b_array2);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b0);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b0);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b0);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b0);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }


    java.util.Comparator<java.lang.Object> comparator_obj0 = null;
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>(comparator_obj0);
    java.lang.String str3 = treeset_str1.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str5 = treeset_str1.headSet("");
    java.util.Iterator<java.lang.String> iterator_str6 = treeset_str1.descendingIterator();
    java.util.NavigableSet<java.lang.String> navigableset_str7 = treeset_str1.descendingSet();
    java.util.SortedSet<java.lang.Object[]> sortedset_obj_array8 = java.util.Collections.emptySortedSet();
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = treeset_str1.remove((java.lang.Object)sortedset_obj_array8);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_obj_array8);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array2);
    java.util.ArrayList<java.lang.Object> arraylist_obj4 = new java.util.ArrayList<java.lang.Object>();
    java.util.ArrayList<java.util.Random> arraylist_random8 = new java.util.ArrayList<java.util.Random>();
    java.util.Random[] random_array9 = new java.util.Random[] {  };
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)arraylist_random8, random_array9);
    java.util.Collections.rotate((java.util.List<java.util.Random>)arraylist_random8, (int)(short)0);
    java.lang.Object[] obj_array22 = new java.lang.Object[] { 10.0f, ' ', 0L, arraylist_random8, (short)1, 100L, (short)0, (-1.0f), (-1L), 1.0f, 100.0f, (short)1, (-1.0f) };
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>)arraylist_obj4, obj_array22);
    boolean b24 = arraylist_str0.retainAll((java.util.Collection<java.lang.Object>)arraylist_obj4);
    java.util.List<java.lang.String> list_str25 = java.util.Collections.synchronizedList((java.util.List<java.lang.String>)arraylist_str0);
    java.util.Collections.shuffle(list_str25);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random_array9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str25);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.lang.String str7 = treeset_str0.higher("hi!");
    java.lang.String str8 = treeset_str0.pollFirst();
    java.util.Iterator<java.lang.String> iterator_str9 = treeset_str0.descendingIterator();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str10 = treeset_str0.last();
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.util.NoSuchElementException")) {
        org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str9);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.lang.String str7 = treeset_str0.higher("hi!");
    java.lang.String str8 = treeset_str0.pollFirst();
    java.util.Iterator<java.lang.String> iterator_str9 = treeset_str0.descendingIterator();
    boolean b11 = treeset_str0.remove((java.lang.Object)' ');
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = treeset_str0.first();
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.util.NoSuchElementException")) {
        org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }


    java.util.Map<java.lang.String,java.lang.String> map_str_str0 = java.util.Collections.emptyMap();
    java.util.Map<java.lang.String,java.lang.String> map_str_str1 = java.util.Collections.synchronizedMap(map_str_str0);
    java.util.Map<java.lang.String,java.lang.String> map_str_str2 = java.util.Collections.synchronizedMap(map_str_str0);
    java.util.Map<java.lang.String,java.lang.String> map_str_str3 = java.util.Collections.synchronizedMap(map_str_str2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str1);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str3);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }


    java.util.Comparator<java.lang.Object> comparator_obj0 = null;
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>(comparator_obj0);
    java.lang.String str3 = treeset_str1.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str5 = treeset_str1.headSet("");
    java.util.Iterator<java.lang.String> iterator_str6 = treeset_str1.descendingIterator();
    boolean b7 = treeset_str1.isEmpty();
    java.util.SortedSet<java.lang.String> sortedset_str9 = treeset_str1.tailSet("hi!");
    java.util.Collection<java.lang.String> collection_str10 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)sortedset_str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str10);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }


    java.util.Collection<java.lang.Object> collection_obj0 = null;
    java.lang.Boolean[] b_array6 = new java.lang.Boolean[] { true, true, true, true, true };
    // The following exception was thrown during execution in test generation
    try {
    boolean b7 = java.util.Collections.addAll(collection_obj0, b_array6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array6);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str7 = treeset_str0.descendingSet();
    java.lang.String str9 = treeset_str0.floor("hi!");
    java.util.Iterator<java.lang.String> iterator_str10 = treeset_str0.descendingIterator();
    java.util.NavigableSet<java.lang.String> navigableset_str11 = treeset_str0.descendingSet();
    int i12 = treeset_str0.size();
    java.util.SortedSet<java.lang.String> sortedset_str14 = treeset_str0.headSet("hi!");

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str10);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str11);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str14);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }


    java.util.Comparator<java.lang.Object> comparator_obj0 = null;
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>(comparator_obj0);
    java.lang.String str3 = treeset_str1.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str5 = treeset_str1.headSet("");
    java.util.Iterator<java.lang.String> iterator_str6 = treeset_str1.descendingIterator();
    boolean b7 = treeset_str1.isEmpty();
    boolean b8 = treeset_str1.isEmpty();
    java.util.Comparator<?> comparator_obj9 = treeset_str1.comparator();
    java.util.function.Consumer<java.lang.String> consumer_str10 = null;
    // The following exception was thrown during execution in test generation
    try {
    treeset_str1.forEach(consumer_str10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_obj9);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }


    java.util.List<java.lang.String> list_str2 = java.util.Collections.nCopies((int)(byte)1, "");

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }


    java.util.Random random0 = null;
    java.util.Map<java.util.Random,java.lang.Integer> map_random_i2 = java.util.Collections.singletonMap(random0, (java.lang.Integer)(-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_random_i2);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }


    java.util.NavigableMap<java.util.Collections,java.lang.Boolean> navigablemap_collections_b0 = java.util.Collections.emptyNavigableMap();
    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    java.util.TreeSet<java.lang.String> treeset_str3 = new java.util.TreeSet<java.lang.String>(comparator_obj2);
    java.lang.String str5 = treeset_str3.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str7 = treeset_str3.headSet("");
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array12 = new java.lang.String[] { "", "" };
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str9, str_array12);
    java.util.SortedSet<java.lang.String> sortedset_str15 = treeset_str9.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str18 = treeset_str9.headSet("", false);
    boolean b20 = treeset_str9.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str21 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str9);
    java.lang.Object[] obj_array22 = new java.lang.Object[] { navigablemap_collections_b0, true, sortedset_str7, 1.0d, treeset_str21 };
    java.util.Set<java.lang.Object[]> set_obj_array23 = java.util.Collections.singleton(obj_array22);
    java.util.Set<java.lang.Object[]> set_obj_array24 = java.util.Collections.singleton(obj_array22);
    java.util.Set<java.lang.Object[]> set_obj_array25 = java.util.Collections.unmodifiableSet(set_obj_array24);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigablemap_collections_b0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str15);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str18);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array23);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array24);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array25);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }


    java.util.Collection<java.lang.Long> collection_long0 = null;
    java.lang.Class<java.lang.Long> cls1 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Collection<java.lang.Long> collection_long2 = java.util.Collections.checkedCollection(collection_long0, cls1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }


    java.util.Comparator<java.lang.Object> comparator_obj0 = null;
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>(comparator_obj0);
    java.lang.String str3 = treeset_str1.higher("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str6 = treeset_str1.headSet("hi!", false);
    java.util.TreeSet<java.lang.String> treeset_str7 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array10 = new java.lang.String[] { "", "" };
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str7, str_array10);
    java.util.Iterator<java.lang.String> iterator_str12 = treeset_str7.iterator();
    java.lang.String str14 = treeset_str7.higher("hi!");
    java.lang.String str15 = treeset_str7.pollFirst();
    java.lang.String str17 = treeset_str7.lower("");
    boolean b18 = treeset_str1.addAll((java.util.Collection<java.lang.String>)treeset_str7);
    java.util.ArrayList<java.lang.Boolean> arraylist_b19 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array22 = new java.lang.Boolean[] { true, false };
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b19, b_array22);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b19);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b19);
    java.util.ArrayList<java.lang.Boolean> arraylist_b26 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array29 = new java.lang.Boolean[] { true, false };
    boolean b30 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b26, b_array29);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b26);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b26);
    java.util.Comparator<java.lang.Object> comparator_obj33 = null;
    java.util.Comparator<java.lang.Object> comparator_obj34 = java.util.Collections.reverseOrder(comparator_obj33);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b26, comparator_obj34);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b19, comparator_obj34);
    boolean b37 = treeset_str7.containsAll((java.util.Collection<java.lang.Boolean>)arraylist_b19);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array22);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array29);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj34);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }


    java.util.List<java.util.Collections> list_collections0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Collections.reverse(list_collections0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.lang.String str7 = treeset_str0.higher("hi!");
    java.lang.String str8 = treeset_str0.pollFirst();
    int i9 = treeset_str0.size();
    java.util.stream.Stream<java.lang.String> stream_str10 = treeset_str0.stream();
    java.util.Comparator<java.lang.Object> comparator_obj11 = null;
    java.util.TreeSet<java.lang.String> treeset_str12 = new java.util.TreeSet<java.lang.String>(comparator_obj11);
    // The following exception was thrown during execution in test generation
    try {
    boolean b13 = treeset_str0.contains((java.lang.Object)comparator_obj11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str10);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array2);
    java.util.ArrayList<java.lang.Object> arraylist_obj4 = new java.util.ArrayList<java.lang.Object>();
    java.util.ArrayList<java.util.Random> arraylist_random8 = new java.util.ArrayList<java.util.Random>();
    java.util.Random[] random_array9 = new java.util.Random[] {  };
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)arraylist_random8, random_array9);
    java.util.Collections.rotate((java.util.List<java.util.Random>)arraylist_random8, (int)(short)0);
    java.lang.Object[] obj_array22 = new java.lang.Object[] { 10.0f, ' ', 0L, arraylist_random8, (short)1, 100L, (short)0, (-1.0f), (-1L), 1.0f, 100.0f, (short)1, (-1.0f) };
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>)arraylist_obj4, obj_array22);
    boolean b24 = arraylist_str0.retainAll((java.util.Collection<java.lang.Object>)arraylist_obj4);
    java.util.Collection<java.lang.String> collection_str25 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str0);
    java.util.stream.Stream<java.lang.String> stream_str26 = arraylist_str0.stream();
    java.util.Comparator<java.lang.String> comparator_str27 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str28 = java.util.Collections.min((java.util.Collection<java.lang.String>)arraylist_str0, comparator_str27);
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.util.NoSuchElementException")) {
        org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random_array9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str25);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str26);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }


    java.util.List<java.lang.String> list_str2 = java.util.Collections.nCopies((int)(short)100, "hi!");
    java.util.function.Consumer<java.lang.String> consumer_str3 = null;
    // The following exception was thrown during execution in test generation
    try {
    list_str2.forEach(consumer_str3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }


    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.lang.String> list_str2 = java.util.Collections.nCopies((-1), "[]");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.lang.String str7 = treeset_str0.higher("hi!");
    java.lang.String str8 = treeset_str0.pollFirst();
    java.util.Iterator<java.lang.String> iterator_str9 = treeset_str0.descendingIterator();
    boolean b11 = treeset_str0.remove((java.lang.Object)' ');
    java.util.NavigableSet<java.lang.String> navigableset_str14 = treeset_str0.headSet("", false);
    java.util.SortedSet<java.lang.String> sortedset_str16 = treeset_str0.tailSet("hi!");

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str14);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str16);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str7 = treeset_str0.descendingSet();
    java.util.Comparator<java.lang.String> comparator_str8 = null;
    java.lang.String str9 = java.util.Collections.min((java.util.Collection<java.lang.String>)navigableset_str7, comparator_str8);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str7 = treeset_str0.descendingSet();
    java.lang.String str9 = treeset_str0.floor("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str11 = treeset_str0.tailSet("[]");

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str11);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.lang.String str7 = treeset_str0.higher("hi!");
    java.lang.String str8 = treeset_str0.pollFirst();
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    java.util.TreeSet<java.lang.String> treeset_str10 = new java.util.TreeSet<java.lang.String>(comparator_obj9);
    java.lang.String str12 = treeset_str10.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str14 = treeset_str10.headSet("");
    boolean b15 = treeset_str0.addAll((java.util.Collection<java.lang.String>)treeset_str10);
    java.lang.Object[] obj_array16 = treeset_str0.toArray();
    java.util.Set<java.lang.Object[]> set_obj_array17 = java.util.Collections.singleton(obj_array16);
    java.lang.Class<java.lang.Object[]> cls18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<java.lang.Object[]> set_obj_array19 = java.util.Collections.checkedSet(set_obj_array17, cls18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str14);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array17);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }


    java.util.Comparator<java.lang.Object> comparator_obj0 = null;
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>(comparator_obj0);
    java.lang.String str3 = treeset_str1.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str5 = treeset_str1.headSet("");
    java.util.Iterator<java.lang.String> iterator_str6 = treeset_str1.descendingIterator();
    boolean b7 = treeset_str1.isEmpty();
    java.util.Spliterator<java.lang.String> spliterator_str8 = treeset_str1.spliterator();
    boolean b9 = treeset_str1.isEmpty();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str8);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }


    java.util.Set<java.util.Random> set_random0 = java.util.Collections.emptySet();
    java.util.Enumeration<java.util.Random> enumeration_random1 = java.util.Collections.enumeration((java.util.Collection<java.util.Random>)set_random0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_random0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration_random1);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }


    java.util.ArrayList<java.lang.Integer> arraylist_i0 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array7 = new java.lang.Integer[] { 1, (-1), 1, (-1), 0, 10 };
    boolean b8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i0, i_array7);
    java.lang.Class<java.lang.Integer> cls9 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.lang.Integer> list_i10 = java.util.Collections.checkedList((java.util.List<java.lang.Integer>)arraylist_i0, cls9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }


    java.util.LinkedHashSet<java.lang.Integer> linkedhashset_i0 = new java.util.LinkedHashSet<java.lang.Integer>();
    java.lang.Integer[] i_array5 = new java.lang.Integer[] { 0, 0, 0, 0 };
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)linkedhashset_i0, i_array5);
    java.util.Set<java.lang.Integer> set_i7 = java.util.Collections.synchronizedSet((java.util.Set<java.lang.Integer>)linkedhashset_i0);
    java.util.Set<java.lang.Boolean> set_b8 = java.util.Collections.EMPTY_SET;
    boolean b9 = java.util.Collections.disjoint((java.util.Collection<java.lang.Integer>)linkedhashset_i0, (java.util.Collection<java.lang.Boolean>)set_b8);
    java.util.Set<java.lang.Integer> set_i10 = java.util.Collections.synchronizedSet((java.util.Set<java.lang.Integer>)linkedhashset_i0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_i7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_b8);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_i10);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }


    java.util.LinkedHashSet<java.lang.Integer> linkedhashset_i0 = new java.util.LinkedHashSet<java.lang.Integer>();
    java.lang.Integer[] i_array6 = new java.lang.Integer[] { 1, (-1), 100, 1, 100 };
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)linkedhashset_i0, i_array6);
    java.util.Set<java.lang.Integer> set_i8 = java.util.Collections.synchronizedSet((java.util.Set<java.lang.Integer>)linkedhashset_i0);
    java.lang.Integer i9 = java.util.Collections.min((java.util.Collection<java.lang.Integer>)linkedhashset_i0);
    java.util.Set<java.lang.Integer> set_i10 = java.util.Collections.synchronizedSet((java.util.Set<java.lang.Integer>)linkedhashset_i0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_i8);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_i10);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }


    java.util.LinkedHashSet<java.lang.String> linkedhashset_str0 = new java.util.LinkedHashSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "hi!" };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str0, str_array2);
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str4 = new java.util.LinkedHashSet<java.lang.String>();
    java.lang.String[] str_array6 = new java.lang.String[] { "hi!" };
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str4, str_array6);
    java.util.ArrayList<java.util.Collections> arraylist_collections8 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array9 = new java.util.Collections[] {  };
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections8, collections_array9);
    java.util.Collections collections11 = null;
    java.util.Comparator<java.lang.Object> comparator_obj12 = null;
    int i13 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections8, collections11, comparator_obj12);
    boolean b14 = linkedhashset_str4.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections8);
    java.util.Collections collections15 = null;
    java.util.Collections.fill((java.util.List<java.util.Collections>)arraylist_collections8, collections15);
    boolean b17 = linkedhashset_str0.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections8);
    java.util.function.Predicate<java.lang.Object> predicate_obj18 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b19 = linkedhashset_str0.removeIf(predicate_obj18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str7 = treeset_str0.descendingSet();
    java.lang.String str9 = treeset_str0.higher("");
    java.util.NavigableSet<java.lang.String> navigableset_str12 = treeset_str0.headSet("hi!", true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str12);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str7 = treeset_str0.descendingSet();
    java.lang.Object[] obj_array8 = treeset_str0.toArray();
    java.util.SortedSet<java.lang.String> sortedset_str10 = treeset_str0.tailSet("[]");
    java.util.function.Consumer<java.lang.String> consumer_str11 = null;
    // The following exception was thrown during execution in test generation
    try {
    treeset_str0.forEach(consumer_str11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str10);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.lang.String str7 = treeset_str0.higher("hi!");
    java.lang.String str8 = treeset_str0.pollFirst();
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    java.util.TreeSet<java.lang.String> treeset_str10 = new java.util.TreeSet<java.lang.String>(comparator_obj9);
    java.lang.String str12 = treeset_str10.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str14 = treeset_str10.headSet("");
    boolean b15 = treeset_str0.addAll((java.util.Collection<java.lang.String>)treeset_str10);
    java.lang.String str16 = treeset_str10.pollLast();
    java.util.ArrayList<java.lang.Object[]> arraylist_obj_array17 = new java.util.ArrayList<java.lang.Object[]>();
    java.lang.Object[][] obj_array_array18 = new java.lang.Object[][] {  };
    boolean b19 = java.util.Collections.addAll((java.util.Collection<java.lang.Object[]>)arraylist_obj_array17, obj_array_array18);
    java.util.Random random20 = null;
    java.util.Collections.shuffle((java.util.List<java.lang.Object[]>)arraylist_obj_array17, random20);
    // The following exception was thrown during execution in test generation
    try {
    boolean b22 = treeset_str10.contains((java.lang.Object)arraylist_obj_array17);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str14);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array18);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }


    java.util.List<java.lang.String> list_str2 = java.util.Collections.nCopies(0, "hi!");
    java.util.List<java.lang.String> list_str3 = java.util.Collections.synchronizedList(list_str2);
    java.util.function.Predicate<java.lang.Object> predicate_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b5 = list_str2.removeIf(predicate_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.lang.String str7 = treeset_str0.higher("hi!");
    treeset_str0.clear();
    java.util.Iterator<java.lang.String> iterator_str9 = treeset_str0.descendingIterator();
    java.util.Spliterator<java.lang.String> spliterator_str10 = treeset_str0.spliterator();
    int i11 = treeset_str0.size();
    java.lang.String str12 = treeset_str0.toString();
    java.util.SortedSet<java.lang.String> sortedset_str14 = treeset_str0.tailSet("");

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str10);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str14);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str7 = treeset_str0.descendingSet();
    java.lang.String str9 = treeset_str0.floor("hi!");
    java.util.Iterator<java.lang.String> iterator_str10 = treeset_str0.descendingIterator();
    java.util.NavigableSet<java.lang.String> navigableset_str11 = treeset_str0.descendingSet();
    java.lang.Object obj12 = treeset_str0.clone();
    java.util.TreeSet<java.lang.Boolean> treeset_b13 = new java.util.TreeSet<java.lang.Boolean>();
    java.lang.Boolean[] b_array15 = new java.lang.Boolean[] { true };
    boolean b16 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)treeset_b13, b_array15);
    java.util.NavigableSet<java.lang.Boolean> navigableset_b17 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.lang.Boolean>)treeset_b13);
    // The following exception was thrown during execution in test generation
    try {
    boolean b18 = treeset_str0.contains((java.lang.Object)treeset_b13);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str10);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str11);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array15);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_b17);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str9 = treeset_str0.headSet("", false);
    int i11 = java.util.Collections.frequency((java.util.Collection<java.lang.String>)treeset_str0, (java.lang.Object)' ');
    java.util.TreeSet<java.lang.String> treeset_str12 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    boolean b14 = treeset_str12.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str15 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }


    java.lang.Object[] obj_array1 = new java.lang.Object[] { (short)10 };
    java.util.Set<java.lang.Object[]> set_obj_array2 = java.util.Collections.singleton(obj_array1);
    java.lang.Class<java.lang.Object[]> cls3 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<java.lang.Object[]> set_obj_array4 = java.util.Collections.checkedSet(set_obj_array2, cls3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array2);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }


    java.util.ArrayDeque<java.lang.String> arraydeque_str0 = new java.util.ArrayDeque<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!", "hi!" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraydeque_str0, str_array3);
    java.util.Queue<java.lang.String> queue_str5 = java.util.Collections.asLifoQueue((java.util.Deque<java.lang.String>)arraydeque_str0);
    java.util.function.Consumer<java.lang.String> consumer_str6 = null;
    // The following exception was thrown during execution in test generation
    try {
    queue_str5.forEach(consumer_str6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(queue_str5);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }


    java.util.List<java.lang.Boolean> list_b1 = java.util.Collections.singletonList((java.lang.Boolean)true);
    java.util.Collections.sort(list_b1);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_b1);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }


    java.util.LinkedList<java.lang.Object[]> linkedlist_obj_array0 = new java.util.LinkedList<java.lang.Object[]>();
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str1 = new java.util.LinkedHashSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str1, str_array3);
    java.util.ArrayList<java.util.Collections> arraylist_collections5 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array6 = new java.util.Collections[] {  };
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections5, collections_array6);
    java.util.Collections collections8 = null;
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    int i10 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections5, collections8, comparator_obj9);
    boolean b11 = linkedhashset_str1.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections5);
    java.lang.Object[] obj_array12 = linkedhashset_str1.toArray();
    java.lang.Object[][] obj_array_array13 = new java.lang.Object[][] { obj_array12 };
    boolean b14 = java.util.Collections.addAll((java.util.Collection<java.lang.Object[]>)linkedlist_obj_array0, obj_array_array13);
    java.lang.Class<java.lang.Object[]> cls15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Queue<java.lang.Object[]> queue_obj_array16 = java.util.Collections.checkedQueue((java.util.Queue<java.lang.Object[]>)linkedlist_obj_array0, cls15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array13);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }


    java.util.TreeSet<java.lang.Integer> treeset_i0 = new java.util.TreeSet<java.lang.Integer>();
    java.lang.Integer[] i_array2 = new java.lang.Integer[] { (-1) };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)treeset_i0, i_array2);
    java.util.SortedSet<java.lang.Integer> sortedset_i4 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.Integer>)treeset_i0);
    java.util.SortedSet<java.lang.Integer> sortedset_i5 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.Integer>)treeset_i0);
    java.util.Set<java.lang.Integer> set_i6 = java.util.Collections.synchronizedSet((java.util.Set<java.lang.Integer>)treeset_i0);
    java.util.Set<java.lang.Integer> set_i7 = java.util.Collections.synchronizedSet(set_i6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_i4);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_i5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_i6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_i7);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }


    java.util.NavigableSet<java.util.Collections> navigableset_collections0 = java.util.Collections.emptyNavigableSet();
    java.lang.Class<java.util.Collections> cls1 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.SortedSet<java.util.Collections> sortedset_collections2 = java.util.Collections.checkedSortedSet((java.util.SortedSet<java.util.Collections>)navigableset_collections0, cls1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_collections0);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str9 = treeset_str0.headSet("", false);
    int i11 = java.util.Collections.frequency((java.util.Collection<java.lang.String>)treeset_str0, (java.lang.Object)' ');
    java.util.TreeSet<java.lang.String> treeset_str12 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.lang.String str14 = treeset_str12.ceiling("hi!");
    int i15 = treeset_str12.size();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }


    java.util.Collection<java.lang.String> collection_str0 = null;
    java.util.Comparator<java.lang.String> comparator_str1 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str2 = java.util.Collections.min(collection_str0, comparator_str1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }


    java.util.Map<java.util.Random,java.lang.Boolean> map_random_b0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<java.util.Random> set_random1 = java.util.Collections.newSetFromMap(map_random_b0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }


    java.util.ArrayList<java.lang.Long> arraylist_long0 = new java.util.ArrayList<java.lang.Long>();
    java.lang.Long[] long_array5 = new java.lang.Long[] { (-1L), (-1L), 1L, 100L };
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long0, long_array5);
    boolean b9 = java.util.Collections.replaceAll((java.util.List<java.lang.Long>)arraylist_long0, (java.lang.Long)(-1L), (java.lang.Long)0L);
    boolean b12 = java.util.Collections.replaceAll((java.util.List<java.lang.Long>)arraylist_long0, (java.lang.Long)0L, (java.lang.Long)1L);
    boolean b15 = java.util.Collections.replaceAll((java.util.List<java.lang.Long>)arraylist_long0, (java.lang.Long)0L, (java.lang.Long)0L);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }


    java.util.Comparator<java.lang.Object> comparator_obj0 = null;
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>(comparator_obj0);
    java.lang.String str3 = treeset_str1.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str5 = treeset_str1.headSet("");
    java.util.Iterator<java.lang.String> iterator_str6 = treeset_str1.descendingIterator();
    java.util.Comparator<?> comparator_obj7 = treeset_str1.comparator();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_obj7);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }


    java.util.LinkedHashSet<java.lang.Object[]> linkedhashset_obj_array0 = new java.util.LinkedHashSet<java.lang.Object[]>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array4 = new java.lang.String[] { "", "" };
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str1, str_array4);
    java.util.Iterator<java.lang.String> iterator_str6 = treeset_str1.iterator();
    java.lang.String str8 = treeset_str1.higher("hi!");
    java.lang.String str9 = treeset_str1.pollFirst();
    java.util.Comparator<java.lang.Object> comparator_obj10 = null;
    java.util.TreeSet<java.lang.String> treeset_str11 = new java.util.TreeSet<java.lang.String>(comparator_obj10);
    java.lang.String str13 = treeset_str11.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str15 = treeset_str11.headSet("");
    boolean b16 = treeset_str1.addAll((java.util.Collection<java.lang.String>)treeset_str11);
    java.lang.Object[] obj_array17 = treeset_str1.toArray();
    java.util.NavigableMap<java.util.Collections,java.lang.Boolean> navigablemap_collections_b18 = java.util.Collections.emptyNavigableMap();
    java.util.Comparator<java.lang.Object> comparator_obj20 = null;
    java.util.TreeSet<java.lang.String> treeset_str21 = new java.util.TreeSet<java.lang.String>(comparator_obj20);
    java.lang.String str23 = treeset_str21.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str25 = treeset_str21.headSet("");
    java.util.TreeSet<java.lang.String> treeset_str27 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array30 = new java.lang.String[] { "", "" };
    boolean b31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str27, str_array30);
    java.util.SortedSet<java.lang.String> sortedset_str33 = treeset_str27.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str36 = treeset_str27.headSet("", false);
    boolean b38 = treeset_str27.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str39 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str27);
    java.lang.Object[] obj_array40 = new java.lang.Object[] { navigablemap_collections_b18, true, sortedset_str25, 1.0d, treeset_str39 };
    java.util.Set<java.lang.Object[]> set_obj_array41 = java.util.Collections.singleton(obj_array40);
    java.util.TreeSet<java.lang.String> treeset_str42 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array45 = new java.lang.String[] { "", "" };
    boolean b46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str42, str_array45);
    java.util.Iterator<java.lang.String> iterator_str47 = treeset_str42.iterator();
    java.lang.String str49 = treeset_str42.higher("hi!");
    java.lang.String str50 = treeset_str42.pollFirst();
    java.util.Comparator<java.lang.Object> comparator_obj51 = null;
    java.util.TreeSet<java.lang.String> treeset_str52 = new java.util.TreeSet<java.lang.String>(comparator_obj51);
    java.lang.String str54 = treeset_str52.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str56 = treeset_str52.headSet("");
    boolean b57 = treeset_str42.addAll((java.util.Collection<java.lang.String>)treeset_str52);
    java.lang.Object[] obj_array58 = treeset_str42.toArray();
    java.util.TreeSet<java.lang.String> treeset_str59 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array62 = new java.lang.String[] { "", "" };
    boolean b63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str59, str_array62);
    java.util.SortedSet<java.lang.String> sortedset_str65 = treeset_str59.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str66 = treeset_str59.descendingSet();
    java.lang.Object[] obj_array67 = treeset_str59.toArray();
    java.lang.Object[][] obj_array_array68 = new java.lang.Object[][] { obj_array17, obj_array40, obj_array58, obj_array67 };
    boolean b69 = java.util.Collections.addAll((java.util.Collection<java.lang.Object[]>)linkedhashset_obj_array0, obj_array_array68);
    java.lang.Class<java.lang.Object[]> cls70 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<java.lang.Object[]> set_obj_array71 = java.util.Collections.checkedSet((java.util.Set<java.lang.Object[]>)linkedhashset_obj_array0, cls70);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str15);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigablemap_collections_b18);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str25);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array30);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str33);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str36);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array40);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array41);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array45);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str47);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str49);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + ""+ "'", str50.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str54);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str56);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array58);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array62);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str65);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str66);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array67);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array68);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.lang.String str7 = treeset_str0.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str9 = treeset_str0.tailSet("hi!");

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str9);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }


    java.util.ArrayList<java.lang.Long> arraylist_long0 = new java.util.ArrayList<java.lang.Long>();
    java.lang.Long[] long_array5 = new java.lang.Long[] { (-1L), (-1L), 1L, 100L };
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long0, long_array5);
    boolean b9 = java.util.Collections.replaceAll((java.util.List<java.lang.Long>)arraylist_long0, (java.lang.Long)(-1L), (java.lang.Long)0L);
    boolean b12 = java.util.Collections.replaceAll((java.util.List<java.lang.Long>)arraylist_long0, (java.lang.Long)0L, (java.lang.Long)1L);
    java.lang.Class<java.lang.Long> cls13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Collection<java.lang.Long> collection_long14 = java.util.Collections.checkedCollection((java.util.Collection<java.lang.Long>)arraylist_long0, cls13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "hi!" };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array2);
    java.util.NavigableSet<java.lang.String> navigableset_str4 = treeset_str0.descendingSet();
    java.util.Comparator<?> comparator_obj5 = treeset_str0.comparator();
    java.util.Iterator<java.lang.String> iterator_str6 = treeset_str0.iterator();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str4);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_obj5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str6);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }


    java.util.Comparator<java.lang.Object> comparator_obj0 = null;
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>(comparator_obj0);
    java.lang.String str3 = treeset_str1.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str5 = treeset_str1.headSet("");
    java.util.Iterator<java.lang.String> iterator_str6 = treeset_str1.descendingIterator();
    java.lang.Object obj7 = treeset_str1.clone();
    treeset_str1.clear();
    int i9 = treeset_str1.size();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str9 = treeset_str0.headSet("", false);
    int i11 = java.util.Collections.frequency((java.util.Collection<java.lang.String>)treeset_str0, (java.lang.Object)' ');
    java.util.TreeSet<java.lang.String> treeset_str12 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.lang.String str13 = treeset_str0.pollFirst();
    java.util.TreeSet<java.lang.Integer> treeset_i14 = new java.util.TreeSet<java.lang.Integer>();
    java.lang.Integer[] i_array16 = new java.lang.Integer[] { (-1) };
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)treeset_i14, i_array16);
    java.util.SortedSet<java.lang.Integer> sortedset_i18 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.Integer>)treeset_i14);
    java.util.SortedSet<java.lang.Integer> sortedset_i19 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.Integer>)treeset_i14);
    // The following exception was thrown during execution in test generation
    try {
    boolean b20 = treeset_str0.contains((java.lang.Object)sortedset_i19);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_i18);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_i19);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str9 = treeset_str0.headSet("", false);
    int i11 = java.util.Collections.frequency((java.util.Collection<java.lang.String>)treeset_str0, (java.lang.Object)' ');
    java.util.TreeSet<java.lang.String> treeset_str12 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    treeset_str12.clear();
    java.lang.Object[] obj_array14 = treeset_str12.toArray();
    java.util.Set<java.lang.Object[]> set_obj_array15 = java.util.Collections.singleton(obj_array14);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array15);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str7 = treeset_str0.descendingSet();
    java.lang.String str9 = treeset_str0.floor("hi!");
    java.util.Iterator<java.lang.String> iterator_str10 = treeset_str0.descendingIterator();
    java.util.NavigableSet<java.lang.String> navigableset_str11 = treeset_str0.descendingSet();
    java.lang.String str12 = treeset_str0.pollLast();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str10);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str11);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }


    java.util.Set<java.lang.Object[]> set_obj_array0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<java.lang.Object[]> set_obj_array1 = java.util.Collections.unmodifiableSet(set_obj_array0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.lang.String str7 = treeset_str0.higher("hi!");
    java.lang.String str8 = treeset_str0.pollFirst();
    int i9 = treeset_str0.size();
    java.util.Iterator<java.lang.String> iterator_str10 = treeset_str0.descendingIterator();
    java.lang.String str11 = treeset_str0.pollFirst();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str10);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array2);
    java.util.ArrayList<java.lang.Object> arraylist_obj4 = new java.util.ArrayList<java.lang.Object>();
    java.util.ArrayList<java.util.Random> arraylist_random8 = new java.util.ArrayList<java.util.Random>();
    java.util.Random[] random_array9 = new java.util.Random[] {  };
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)arraylist_random8, random_array9);
    java.util.Collections.rotate((java.util.List<java.util.Random>)arraylist_random8, (int)(short)0);
    java.lang.Object[] obj_array22 = new java.lang.Object[] { 10.0f, ' ', 0L, arraylist_random8, (short)1, 100L, (short)0, (-1.0f), (-1L), 1.0f, 100.0f, (short)1, (-1.0f) };
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>)arraylist_obj4, obj_array22);
    boolean b24 = arraylist_str0.retainAll((java.util.Collection<java.lang.Object>)arraylist_obj4);
    java.util.ArrayList<java.lang.Object[]> arraylist_obj_array25 = new java.util.ArrayList<java.lang.Object[]>();
    java.lang.Object[][] obj_array_array26 = new java.lang.Object[][] {  };
    boolean b27 = java.util.Collections.addAll((java.util.Collection<java.lang.Object[]>)arraylist_obj_array25, obj_array_array26);
    java.util.Collections.copy((java.util.List<java.lang.Object>)arraylist_obj4, (java.util.List<java.lang.Object[]>)arraylist_obj_array25);
    java.util.Random random29 = null;
    java.util.Collections.shuffle((java.util.List<java.lang.Object[]>)arraylist_obj_array25, random29);
    java.util.Random random31 = null;
    java.util.Collections.shuffle((java.util.List<java.lang.Object[]>)arraylist_obj_array25, random31);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random_array9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array26);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }


    java.util.LinkedList<java.lang.Object[]> linkedlist_obj_array0 = new java.util.LinkedList<java.lang.Object[]>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array4 = new java.lang.String[] { "", "" };
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str1, str_array4);
    java.util.SortedSet<java.lang.String> sortedset_str7 = treeset_str1.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str10 = treeset_str1.headSet("", false);
    int i12 = java.util.Collections.frequency((java.util.Collection<java.lang.String>)treeset_str1, (java.lang.Object)' ');
    java.util.TreeSet<java.lang.String> treeset_str13 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str1);
    treeset_str13.clear();
    java.lang.Object[] obj_array15 = treeset_str13.toArray();
    java.util.Set<java.lang.Object[]> set_obj_array16 = java.util.Collections.singleton(obj_array15);
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str17 = new java.util.LinkedHashSet<java.lang.String>();
    java.lang.String[] str_array19 = new java.lang.String[] { "hi!" };
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str17, str_array19);
    java.util.ArrayList<java.util.Collections> arraylist_collections21 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array22 = new java.util.Collections[] {  };
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections21, collections_array22);
    java.util.Collections collections24 = null;
    java.util.Comparator<java.lang.Object> comparator_obj25 = null;
    int i26 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections21, collections24, comparator_obj25);
    boolean b27 = linkedhashset_str17.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections21);
    java.lang.Object[] obj_array28 = linkedhashset_str17.toArray();
    java.util.TreeSet<java.lang.String> treeset_str29 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array32 = new java.lang.String[] { "", "" };
    boolean b33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str29, str_array32);
    java.util.SortedSet<java.lang.String> sortedset_str35 = treeset_str29.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str38 = treeset_str29.headSet("", false);
    boolean b40 = treeset_str29.add("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str41 = treeset_str29.descendingSet();
    java.lang.String str42 = treeset_str29.first();
    java.lang.Object[] obj_array43 = treeset_str29.toArray();
    java.lang.Object[][] obj_array_array44 = new java.lang.Object[][] { obj_array15, obj_array28, obj_array43 };
    boolean b45 = java.util.Collections.addAll((java.util.Collection<java.lang.Object[]>)linkedlist_obj_array0, obj_array_array44);
    java.lang.Class<java.lang.Object[]> cls46 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Queue<java.lang.Object[]> queue_obj_array47 = java.util.Collections.checkedQueue((java.util.Queue<java.lang.Object[]>)linkedlist_obj_array0, cls46);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str10);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array16);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array22);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array32);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str35);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str38);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str41);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + ""+ "'", str42.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array44);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }


    java.util.ArrayList<java.lang.Long> arraylist_long0 = new java.util.ArrayList<java.lang.Long>();
    java.lang.Long[] long_array5 = new java.lang.Long[] { 10L, 0L, 0L, 1L };
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long0, long_array5);
    boolean b9 = java.util.Collections.replaceAll((java.util.List<java.lang.Long>)arraylist_long0, (java.lang.Long)100L, (java.lang.Long)1L);
    java.lang.Long long10 = java.util.Collections.max((java.util.Collection<java.lang.Long>)arraylist_long0);
    boolean b13 = java.util.Collections.replaceAll((java.util.List<java.lang.Long>)arraylist_long0, (java.lang.Long)0L, (java.lang.Long)0L);
    java.lang.Class<java.lang.Long> cls14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Collection<java.lang.Long> collection_long15 = java.util.Collections.checkedCollection((java.util.Collection<java.lang.Long>)arraylist_long0, cls14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L+ "'", long10.equals(10L));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }


    java.util.ArrayList<java.util.Random> arraylist_random0 = new java.util.ArrayList<java.util.Random>();
    java.util.Random[] random_array1 = new java.util.Random[] {  };
    boolean b2 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)arraylist_random0, random_array1);
    java.util.Collections.rotate((java.util.List<java.util.Random>)arraylist_random0, (int)(short)-1);
    java.util.Enumeration<java.util.Random> enumeration_random5 = java.util.Collections.enumeration((java.util.Collection<java.util.Random>)arraylist_random0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random_array1);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration_random5);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }


    java.util.LinkedHashSet<java.lang.String> linkedhashset_str0 = new java.util.LinkedHashSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "hi!" };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str0, str_array2);
    java.util.ArrayList<java.util.Collections> arraylist_collections4 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array5 = new java.util.Collections[] {  };
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections4, collections_array5);
    java.util.Collections collections7 = null;
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    int i9 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections4, collections7, comparator_obj8);
    boolean b10 = linkedhashset_str0.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections4);
    java.util.Collections.reverse((java.util.List<java.util.Collections>)arraylist_collections4);
    java.util.List<java.util.Collections> list_collections12 = java.util.Collections.unmodifiableList((java.util.List<java.util.Collections>)arraylist_collections4);
    java.util.List<java.util.Collections> list_collections13 = java.util.Collections.unmodifiableList(list_collections12);
    java.util.List<java.util.Collections> list_collections14 = java.util.Collections.unmodifiableList(list_collections13);
    java.util.Collections collections15 = null;
    java.util.Collections.fill(list_collections13, collections15);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_collections12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_collections13);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_collections14);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }


    java.util.Comparator<java.lang.Object> comparator_obj0 = null;
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>(comparator_obj0);
    java.lang.String str3 = treeset_str1.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str5 = treeset_str1.headSet("");
    java.util.Iterator<java.lang.String> iterator_str6 = treeset_str1.descendingIterator();
    java.lang.Object obj7 = treeset_str1.clone();
    treeset_str1.clear();
    java.util.Comparator<?> comparator_obj9 = treeset_str1.comparator();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_obj9);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array2);
    java.util.ArrayList<java.lang.Object> arraylist_obj4 = new java.util.ArrayList<java.lang.Object>();
    java.util.ArrayList<java.util.Random> arraylist_random8 = new java.util.ArrayList<java.util.Random>();
    java.util.Random[] random_array9 = new java.util.Random[] {  };
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)arraylist_random8, random_array9);
    java.util.Collections.rotate((java.util.List<java.util.Random>)arraylist_random8, (int)(short)0);
    java.lang.Object[] obj_array22 = new java.lang.Object[] { 10.0f, ' ', 0L, arraylist_random8, (short)1, 100L, (short)0, (-1.0f), (-1L), 1.0f, 100.0f, (short)1, (-1.0f) };
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>)arraylist_obj4, obj_array22);
    boolean b24 = arraylist_str0.retainAll((java.util.Collection<java.lang.Object>)arraylist_obj4);
    java.util.Collection<java.lang.String> collection_str25 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str0);
    java.util.stream.Stream<java.lang.String> stream_str26 = arraylist_str0.stream();
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str27 = new java.util.LinkedHashSet<java.lang.String>();
    java.lang.String[] str_array29 = new java.lang.String[] { "hi!" };
    boolean b30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str27, str_array29);
    java.util.ArrayList<java.util.Collections> arraylist_collections31 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array32 = new java.util.Collections[] {  };
    boolean b33 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections31, collections_array32);
    java.util.Collections collections34 = null;
    java.util.Comparator<java.lang.Object> comparator_obj35 = null;
    int i36 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections31, collections34, comparator_obj35);
    boolean b37 = linkedhashset_str27.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections31);
    java.util.Collections collections38 = null;
    java.util.Collections.fill((java.util.List<java.util.Collections>)arraylist_collections31, collections38);
    java.util.Collections collections40 = null;
    java.util.Comparator<java.lang.Object> comparator_obj41 = null;
    java.util.Comparator<java.lang.Object> comparator_obj42 = java.util.Collections.reverseOrder(comparator_obj41);
    int i43 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections31, collections40, comparator_obj42);
    java.util.Comparator<java.lang.Object> comparator_obj44 = java.util.Collections.reverseOrder(comparator_obj42);
    int i45 = java.util.Collections.frequency((java.util.Collection<java.lang.String>)arraylist_str0, (java.lang.Object)comparator_obj42);
    java.util.List<java.lang.String> list_str46 = java.util.Collections.synchronizedList((java.util.List<java.lang.String>)arraylist_str0);
    java.util.Collections.shuffle(list_str46);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random_array9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str25);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str26);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array29);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array32);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj42);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj44);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str46);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }


    java.util.Comparator<java.lang.Object> comparator_obj0 = null;
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>(comparator_obj0);
    java.lang.String str3 = treeset_str1.higher("hi!");
    java.util.Comparator<?> comparator_obj4 = treeset_str1.comparator();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_obj4);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }


    java.util.List<java.lang.Object[]> list_obj_array0 = null;
    java.util.Random random1 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Collections.shuffle(list_obj_array0, random1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }


    java.util.Comparator<java.lang.Object> comparator_obj0 = null;
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>(comparator_obj0);
    java.lang.String str3 = treeset_str1.higher("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str6 = treeset_str1.headSet("hi!", false);
    java.util.SortedSet<java.lang.String> sortedset_str8 = treeset_str1.headSet("");
    java.lang.String str9 = treeset_str1.toString();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str8);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }


    java.util.Comparator<java.lang.Object> comparator_obj0 = null;
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>(comparator_obj0);
    java.lang.String str3 = treeset_str1.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str5 = treeset_str1.headSet("");
    java.util.Iterator<java.lang.String> iterator_str6 = treeset_str1.descendingIterator();
    boolean b7 = treeset_str1.isEmpty();
    java.util.SortedSet<java.lang.String> sortedset_str9 = treeset_str1.tailSet("hi!");
    java.util.function.Predicate<java.lang.Object> predicate_obj10 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b11 = sortedset_str9.removeIf(predicate_obj10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str9);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }


    java.util.Comparator<java.lang.Object> comparator_obj0 = null;
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>(comparator_obj0);
    java.lang.String str3 = treeset_str1.higher("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str6 = treeset_str1.headSet("hi!", false);
    treeset_str1.clear();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str6);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test167"); }


    java.util.TreeSet<java.lang.Integer> treeset_i0 = new java.util.TreeSet<java.lang.Integer>();
    java.lang.Integer[] i_array2 = new java.lang.Integer[] { (-1) };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)treeset_i0, i_array2);
    java.util.SortedSet<java.lang.Integer> sortedset_i4 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.Integer>)treeset_i0);
    java.util.Set<java.lang.Integer> set_i5 = java.util.Collections.synchronizedSet((java.util.Set<java.lang.Integer>)treeset_i0);
    java.util.SortedSet<java.lang.Integer> sortedset_i6 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.Integer>)treeset_i0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_i4);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_i5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_i6);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test168"); }


    java.util.Comparator<java.lang.Object> comparator_obj0 = null;
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>(comparator_obj0);
    java.lang.String str3 = treeset_str1.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str5 = treeset_str1.headSet("");
    java.util.Iterator<java.lang.String> iterator_str6 = treeset_str1.descendingIterator();
    java.lang.Object obj7 = treeset_str1.clone();
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str8 = new java.util.LinkedHashSet<java.lang.String>();
    java.lang.String[] str_array10 = new java.lang.String[] { "hi!" };
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str8, str_array10);
    java.util.ArrayList<java.util.Collections> arraylist_collections12 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array13 = new java.util.Collections[] {  };
    boolean b14 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections12, collections_array13);
    java.util.Collections collections15 = null;
    java.util.Comparator<java.lang.Object> comparator_obj16 = null;
    int i17 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections12, collections15, comparator_obj16);
    boolean b18 = linkedhashset_str8.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections12);
    java.util.Collections.reverse((java.util.List<java.util.Collections>)arraylist_collections12);
    java.util.List<java.util.Collections> list_collections20 = java.util.Collections.unmodifiableList((java.util.List<java.util.Collections>)arraylist_collections12);
    java.util.Collections collections21 = null;
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str22 = new java.util.LinkedHashSet<java.lang.String>();
    java.lang.String[] str_array24 = new java.lang.String[] { "hi!" };
    boolean b25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str22, str_array24);
    java.util.ArrayList<java.util.Collections> arraylist_collections26 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array27 = new java.util.Collections[] {  };
    boolean b28 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections26, collections_array27);
    java.util.Collections collections29 = null;
    java.util.Comparator<java.lang.Object> comparator_obj30 = null;
    int i31 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections26, collections29, comparator_obj30);
    boolean b32 = linkedhashset_str22.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections26);
    java.util.Collections.reverse((java.util.List<java.util.Collections>)arraylist_collections26);
    java.util.Collections collections34 = null;
    java.util.ArrayList<java.lang.String> arraylist_str35 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array37 = new java.lang.String[] { "" };
    boolean b38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str35, str_array37);
    java.util.ArrayList<java.lang.Object> arraylist_obj39 = new java.util.ArrayList<java.lang.Object>();
    java.util.ArrayList<java.util.Random> arraylist_random43 = new java.util.ArrayList<java.util.Random>();
    java.util.Random[] random_array44 = new java.util.Random[] {  };
    boolean b45 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)arraylist_random43, random_array44);
    java.util.Collections.rotate((java.util.List<java.util.Random>)arraylist_random43, (int)(short)0);
    java.lang.Object[] obj_array57 = new java.lang.Object[] { 10.0f, ' ', 0L, arraylist_random43, (short)1, 100L, (short)0, (-1.0f), (-1L), 1.0f, 100.0f, (short)1, (-1.0f) };
    boolean b58 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>)arraylist_obj39, obj_array57);
    boolean b59 = arraylist_str35.retainAll((java.util.Collection<java.lang.Object>)arraylist_obj39);
    java.util.Collection<java.lang.String> collection_str60 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str35);
    java.util.stream.Stream<java.lang.String> stream_str61 = arraylist_str35.stream();
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str62 = new java.util.LinkedHashSet<java.lang.String>();
    java.lang.String[] str_array64 = new java.lang.String[] { "hi!" };
    boolean b65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str62, str_array64);
    java.util.ArrayList<java.util.Collections> arraylist_collections66 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array67 = new java.util.Collections[] {  };
    boolean b68 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections66, collections_array67);
    java.util.Collections collections69 = null;
    java.util.Comparator<java.lang.Object> comparator_obj70 = null;
    int i71 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections66, collections69, comparator_obj70);
    boolean b72 = linkedhashset_str62.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections66);
    java.util.Collections collections73 = null;
    java.util.Collections.fill((java.util.List<java.util.Collections>)arraylist_collections66, collections73);
    java.util.Collections collections75 = null;
    java.util.Comparator<java.lang.Object> comparator_obj76 = null;
    java.util.Comparator<java.lang.Object> comparator_obj77 = java.util.Collections.reverseOrder(comparator_obj76);
    int i78 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections66, collections75, comparator_obj77);
    java.util.Comparator<java.lang.Object> comparator_obj79 = java.util.Collections.reverseOrder(comparator_obj77);
    int i80 = java.util.Collections.frequency((java.util.Collection<java.lang.String>)arraylist_str35, (java.lang.Object)comparator_obj77);
    int i81 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections26, collections34, comparator_obj77);
    int i82 = java.util.Collections.binarySearch(list_collections20, collections21, comparator_obj77);
    boolean b83 = treeset_str1.removeAll((java.util.Collection<java.util.Collections>)list_collections20);
    java.util.NavigableSet<java.lang.String> navigableset_str84 = treeset_str1.descendingSet();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array13);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_collections20);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array24);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array27);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array37);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random_array44);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array57);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str60);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str61);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array64);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array67);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj77);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj79);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str84);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test169"); }


    java.util.TreeSet<java.lang.Boolean> treeset_b0 = new java.util.TreeSet<java.lang.Boolean>();
    java.lang.Boolean[] b_array2 = new java.lang.Boolean[] { true };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)treeset_b0, b_array2);
    java.util.NavigableSet<java.lang.Boolean> navigableset_b4 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.lang.Boolean>)treeset_b0);
    java.util.NavigableSet<java.lang.Boolean> navigableset_b5 = java.util.Collections.synchronizedNavigableSet(navigableset_b4);
    java.util.NavigableSet<java.lang.Boolean> navigableset_b6 = java.util.Collections.synchronizedNavigableSet(navigableset_b5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_b4);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_b5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_b6);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test170"); }


    java.util.List<java.util.Collections> list_collections0 = null;
    java.util.Collections collections1 = null;
    java.util.ArrayList<java.lang.Integer> arraylist_i2 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array4 = new java.lang.Integer[] { (-1) };
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i2, i_array4);
    java.util.ArrayList<java.lang.Boolean> arraylist_b6 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array8 = new java.lang.Boolean[] { false };
    boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b6, b_array8);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b6);
    boolean b11 = java.util.Collections.disjoint((java.util.Collection<java.lang.Integer>)arraylist_i2, (java.util.Collection<java.lang.Boolean>)arraylist_b6);
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str12 = new java.util.LinkedHashSet<java.lang.String>();
    java.lang.String[] str_array14 = new java.lang.String[] { "hi!" };
    boolean b15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str12, str_array14);
    java.util.ArrayList<java.util.Collections> arraylist_collections16 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array17 = new java.util.Collections[] {  };
    boolean b18 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections16, collections_array17);
    java.util.Collections collections19 = null;
    java.util.Comparator<java.lang.Object> comparator_obj20 = null;
    int i21 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections16, collections19, comparator_obj20);
    boolean b22 = linkedhashset_str12.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections16);
    java.util.Collections collections23 = null;
    java.util.Collections.fill((java.util.List<java.util.Collections>)arraylist_collections16, collections23);
    java.util.Collections collections25 = null;
    java.util.Comparator<java.lang.Object> comparator_obj26 = null;
    java.util.Comparator<java.lang.Object> comparator_obj27 = java.util.Collections.reverseOrder(comparator_obj26);
    int i28 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections16, collections25, comparator_obj27);
    java.util.Comparator<java.lang.Object> comparator_obj29 = java.util.Collections.reverseOrder(comparator_obj27);
    java.util.Comparator<java.lang.Object> comparator_obj30 = java.util.Collections.reverseOrder(comparator_obj27);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b6, comparator_obj27);
    // The following exception was thrown during execution in test generation
    try {
    int i32 = java.util.Collections.binarySearch(list_collections0, collections1, comparator_obj27);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array8);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array17);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj27);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj29);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj30);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test171"); }


    java.util.ArrayList<java.lang.Long> arraylist_long0 = new java.util.ArrayList<java.lang.Long>();
    java.lang.Long[] long_array5 = new java.lang.Long[] { (-1L), (-1L), 1L, 100L };
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long0, long_array5);
    boolean b9 = java.util.Collections.replaceAll((java.util.List<java.lang.Long>)arraylist_long0, (java.lang.Long)(-1L), (java.lang.Long)0L);
    java.lang.Long long10 = java.util.Collections.max((java.util.Collection<java.lang.Long>)arraylist_long0);
    java.lang.Class<java.lang.Long> cls11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Collection<java.lang.Long> collection_long12 = java.util.Collections.checkedCollection((java.util.Collection<java.lang.Long>)arraylist_long0, cls11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L+ "'", long10.equals(100L));

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test172"); }


    java.util.Comparator<java.lang.Object> comparator_obj0 = null;
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>(comparator_obj0);
    java.lang.String str3 = treeset_str1.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str5 = treeset_str1.headSet("");
    java.util.Iterator<java.lang.String> iterator_str6 = treeset_str1.descendingIterator();
    java.util.NavigableSet<java.lang.String> navigableset_str7 = treeset_str1.descendingSet();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str8 = treeset_str1.first();
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.util.NoSuchElementException")) {
        org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str7);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test173"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str9 = treeset_str0.headSet("", false);
    int i11 = java.util.Collections.frequency((java.util.Collection<java.lang.String>)treeset_str0, (java.lang.Object)' ');
    java.util.TreeSet<java.lang.String> treeset_str12 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.SortedSet<java.lang.String> sortedset_str14 = treeset_str12.tailSet("");
    treeset_str12.clear();
    java.util.NavigableSet<java.lang.String> navigableset_str18 = treeset_str12.headSet("[]", true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str14);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str18);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test174"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array2);
    java.util.ArrayList<java.lang.Object> arraylist_obj4 = new java.util.ArrayList<java.lang.Object>();
    java.util.ArrayList<java.util.Random> arraylist_random8 = new java.util.ArrayList<java.util.Random>();
    java.util.Random[] random_array9 = new java.util.Random[] {  };
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)arraylist_random8, random_array9);
    java.util.Collections.rotate((java.util.List<java.util.Random>)arraylist_random8, (int)(short)0);
    java.lang.Object[] obj_array22 = new java.lang.Object[] { 10.0f, ' ', 0L, arraylist_random8, (short)1, 100L, (short)0, (-1.0f), (-1L), 1.0f, 100.0f, (short)1, (-1.0f) };
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>)arraylist_obj4, obj_array22);
    boolean b24 = arraylist_str0.retainAll((java.util.Collection<java.lang.Object>)arraylist_obj4);
    java.util.ArrayList<java.lang.Object[]> arraylist_obj_array25 = new java.util.ArrayList<java.lang.Object[]>();
    java.lang.Object[][] obj_array_array26 = new java.lang.Object[][] {  };
    boolean b27 = java.util.Collections.addAll((java.util.Collection<java.lang.Object[]>)arraylist_obj_array25, obj_array_array26);
    java.util.Collections.copy((java.util.List<java.lang.Object>)arraylist_obj4, (java.util.List<java.lang.Object[]>)arraylist_obj_array25);
    java.util.ArrayList<java.lang.Object[]> arraylist_obj_array29 = new java.util.ArrayList<java.lang.Object[]>();
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str30 = new java.util.LinkedHashSet<java.lang.String>();
    java.lang.String[] str_array32 = new java.lang.String[] { "hi!" };
    boolean b33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str30, str_array32);
    java.util.ArrayList<java.util.Collections> arraylist_collections34 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array35 = new java.util.Collections[] {  };
    boolean b36 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections34, collections_array35);
    java.util.Collections collections37 = null;
    java.util.Comparator<java.lang.Object> comparator_obj38 = null;
    int i39 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections34, collections37, comparator_obj38);
    boolean b40 = linkedhashset_str30.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections34);
    java.lang.Object[] obj_array41 = linkedhashset_str30.toArray();
    java.lang.Object[][] obj_array_array42 = new java.lang.Object[][] { obj_array41 };
    boolean b43 = java.util.Collections.addAll((java.util.Collection<java.lang.Object[]>)arraylist_obj_array29, obj_array_array42);
    java.util.Collections.copy((java.util.List<java.lang.Object>)arraylist_obj4, (java.util.List<java.lang.Object[]>)arraylist_obj_array29);
    java.util.Random random45 = null;
    java.util.Collections.shuffle((java.util.List<java.lang.Object[]>)arraylist_obj_array29, random45);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random_array9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array26);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array32);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array35);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array41);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array42);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test175"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.lang.String str7 = treeset_str0.higher("hi!");
    java.lang.String str8 = treeset_str0.pollFirst();
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    java.util.TreeSet<java.lang.String> treeset_str10 = new java.util.TreeSet<java.lang.String>(comparator_obj9);
    java.lang.String str12 = treeset_str10.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str14 = treeset_str10.headSet("");
    boolean b15 = treeset_str0.addAll((java.util.Collection<java.lang.String>)treeset_str10);
    java.lang.Object[] obj_array16 = treeset_str0.toArray();
    java.util.Comparator<?> comparator_obj17 = treeset_str0.comparator();
    java.util.Comparator<java.lang.Object> comparator_obj18 = null;
    java.util.TreeSet<java.lang.String> treeset_str19 = new java.util.TreeSet<java.lang.String>(comparator_obj18);
    java.lang.String str21 = treeset_str19.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str23 = treeset_str19.headSet("");
    java.util.TreeSet<java.lang.String> treeset_str24 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str19);
    boolean b25 = treeset_str0.addAll((java.util.Collection<java.lang.String>)treeset_str19);
    int i26 = treeset_str0.size();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str14);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_obj17);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str23);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test176"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.util.NavigableSet<java.lang.String> navigableset_str8 = treeset_str0.tailSet("hi!", false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str8);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test177"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array2);
    java.util.ArrayList<java.lang.Object> arraylist_obj4 = new java.util.ArrayList<java.lang.Object>();
    java.util.ArrayList<java.util.Random> arraylist_random8 = new java.util.ArrayList<java.util.Random>();
    java.util.Random[] random_array9 = new java.util.Random[] {  };
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)arraylist_random8, random_array9);
    java.util.Collections.rotate((java.util.List<java.util.Random>)arraylist_random8, (int)(short)0);
    java.lang.Object[] obj_array22 = new java.lang.Object[] { 10.0f, ' ', 0L, arraylist_random8, (short)1, 100L, (short)0, (-1.0f), (-1L), 1.0f, 100.0f, (short)1, (-1.0f) };
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>)arraylist_obj4, obj_array22);
    boolean b24 = arraylist_str0.retainAll((java.util.Collection<java.lang.Object>)arraylist_obj4);
    java.util.ArrayList<java.lang.String> arraylist_str25 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array27 = new java.lang.String[] { "" };
    boolean b28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str25, str_array27);
    java.util.ArrayList<java.lang.Object> arraylist_obj29 = new java.util.ArrayList<java.lang.Object>();
    java.util.ArrayList<java.util.Random> arraylist_random33 = new java.util.ArrayList<java.util.Random>();
    java.util.Random[] random_array34 = new java.util.Random[] {  };
    boolean b35 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)arraylist_random33, random_array34);
    java.util.Collections.rotate((java.util.List<java.util.Random>)arraylist_random33, (int)(short)0);
    java.lang.Object[] obj_array47 = new java.lang.Object[] { 10.0f, ' ', 0L, arraylist_random33, (short)1, 100L, (short)0, (-1.0f), (-1L), 1.0f, 100.0f, (short)1, (-1.0f) };
    boolean b48 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>)arraylist_obj29, obj_array47);
    boolean b49 = arraylist_str25.retainAll((java.util.Collection<java.lang.Object>)arraylist_obj29);
    java.util.ArrayList<java.lang.Object[]> arraylist_obj_array50 = new java.util.ArrayList<java.lang.Object[]>();
    java.lang.Object[][] obj_array_array51 = new java.lang.Object[][] {  };
    boolean b52 = java.util.Collections.addAll((java.util.Collection<java.lang.Object[]>)arraylist_obj_array50, obj_array_array51);
    java.util.Collections.copy((java.util.List<java.lang.Object>)arraylist_obj29, (java.util.List<java.lang.Object[]>)arraylist_obj_array50);
    java.util.ArrayList<java.lang.Integer> arraylist_i54 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array56 = new java.lang.Integer[] { (-1) };
    boolean b57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i54, i_array56);
    java.util.ArrayList<java.lang.Integer> arraylist_i58 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array60 = new java.lang.Integer[] { 0 };
    boolean b61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i58, i_array60);
    java.util.ArrayList<java.lang.Integer> arraylist_i62 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array64 = new java.lang.Integer[] { 1 };
    boolean b65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i62, i_array64);
    int i66 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i58, (java.util.List<java.lang.Integer>)arraylist_i62);
    int i67 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i54, (java.util.List<java.lang.Integer>)arraylist_i58);
    int i68 = java.util.Collections.lastIndexOfSubList((java.util.List<java.lang.Object>)arraylist_obj29, (java.util.List<java.lang.Integer>)arraylist_i54);
    boolean b69 = arraylist_str0.retainAll((java.util.Collection<java.lang.Object>)arraylist_obj29);
    java.lang.Boolean[] b_array74 = new java.lang.Boolean[] { true, false, true, true };
    boolean b75 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>)arraylist_obj29, b_array74);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random_array9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array27);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random_array34);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array47);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array51);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array56);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array64);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array74);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test178"); }


    java.util.LinkedHashSet<java.lang.String> linkedhashset_str0 = new java.util.LinkedHashSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "hi!" };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str0, str_array2);
    java.util.ArrayList<java.util.Collections> arraylist_collections4 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array5 = new java.util.Collections[] {  };
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections4, collections_array5);
    java.util.Collections collections7 = null;
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    int i9 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections4, collections7, comparator_obj8);
    boolean b10 = linkedhashset_str0.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections4);
    java.util.Collections.reverse((java.util.List<java.util.Collections>)arraylist_collections4);
    java.util.Collections collections12 = null;
    java.util.ArrayList<java.lang.String> arraylist_str13 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array15 = new java.lang.String[] { "" };
    boolean b16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str13, str_array15);
    java.util.ArrayList<java.lang.Object> arraylist_obj17 = new java.util.ArrayList<java.lang.Object>();
    java.util.ArrayList<java.util.Random> arraylist_random21 = new java.util.ArrayList<java.util.Random>();
    java.util.Random[] random_array22 = new java.util.Random[] {  };
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)arraylist_random21, random_array22);
    java.util.Collections.rotate((java.util.List<java.util.Random>)arraylist_random21, (int)(short)0);
    java.lang.Object[] obj_array35 = new java.lang.Object[] { 10.0f, ' ', 0L, arraylist_random21, (short)1, 100L, (short)0, (-1.0f), (-1L), 1.0f, 100.0f, (short)1, (-1.0f) };
    boolean b36 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>)arraylist_obj17, obj_array35);
    boolean b37 = arraylist_str13.retainAll((java.util.Collection<java.lang.Object>)arraylist_obj17);
    java.util.Collection<java.lang.String> collection_str38 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str13);
    java.util.stream.Stream<java.lang.String> stream_str39 = arraylist_str13.stream();
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str40 = new java.util.LinkedHashSet<java.lang.String>();
    java.lang.String[] str_array42 = new java.lang.String[] { "hi!" };
    boolean b43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str40, str_array42);
    java.util.ArrayList<java.util.Collections> arraylist_collections44 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array45 = new java.util.Collections[] {  };
    boolean b46 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections44, collections_array45);
    java.util.Collections collections47 = null;
    java.util.Comparator<java.lang.Object> comparator_obj48 = null;
    int i49 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections44, collections47, comparator_obj48);
    boolean b50 = linkedhashset_str40.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections44);
    java.util.Collections collections51 = null;
    java.util.Collections.fill((java.util.List<java.util.Collections>)arraylist_collections44, collections51);
    java.util.Collections collections53 = null;
    java.util.Comparator<java.lang.Object> comparator_obj54 = null;
    java.util.Comparator<java.lang.Object> comparator_obj55 = java.util.Collections.reverseOrder(comparator_obj54);
    int i56 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections44, collections53, comparator_obj55);
    java.util.Comparator<java.lang.Object> comparator_obj57 = java.util.Collections.reverseOrder(comparator_obj55);
    int i58 = java.util.Collections.frequency((java.util.Collection<java.lang.String>)arraylist_str13, (java.lang.Object)comparator_obj55);
    int i59 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections4, collections12, comparator_obj55);
    java.util.Collections.reverse((java.util.List<java.util.Collections>)arraylist_collections4);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random_array22);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str38);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str39);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array42);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array45);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj55);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj57);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == (-1));

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test179"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str7 = treeset_str0.descendingSet();
    java.lang.String str8 = treeset_str0.last();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test180"); }


    java.util.TreeSet<java.lang.Long> treeset_long0 = new java.util.TreeSet<java.lang.Long>();
    java.lang.Long[] long_array6 = new java.lang.Long[] { 0L, 10L, 1L, 10L, 100L };
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)treeset_long0, long_array6);
    java.util.NavigableSet<java.lang.Long> navigableset_long8 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long0);
    java.lang.Long long9 = java.util.Collections.max((java.util.Collection<java.lang.Long>)navigableset_long8);
    java.lang.Long long10 = java.util.Collections.max((java.util.Collection<java.lang.Long>)navigableset_long8);
    java.lang.Class<java.lang.Long> cls11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Collection<java.lang.Long> collection_long12 = java.util.Collections.checkedCollection((java.util.Collection<java.lang.Long>)navigableset_long8, cls11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_long8);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L+ "'", long9.equals(100L));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L+ "'", long10.equals(100L));

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test181"); }


    java.util.ArrayList<java.util.Random> arraylist_random0 = new java.util.ArrayList<java.util.Random>();
    java.util.Random[] random_array1 = new java.util.Random[] {  };
    boolean b2 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)arraylist_random0, random_array1);
    java.util.Collections.rotate((java.util.List<java.util.Random>)arraylist_random0, (int)(short)0);
    java.util.Collections.rotate((java.util.List<java.util.Random>)arraylist_random0, 10);
    java.util.Enumeration<java.util.Random> enumeration_random7 = java.util.Collections.enumeration((java.util.Collection<java.util.Random>)arraylist_random0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random_array1);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration_random7);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test182"); }


    java.util.Comparator<java.lang.Object> comparator_obj0 = null;
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>(comparator_obj0);
    java.lang.String str2 = treeset_str1.pollFirst();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test183"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str9 = treeset_str0.headSet("", false);
    java.util.NavigableSet<java.lang.String> navigableset_str12 = treeset_str0.headSet("hi!", false);
    java.util.NavigableSet<java.lang.String> navigableset_str13 = treeset_str0.descendingSet();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str13);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test184"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.lang.String str7 = treeset_str0.higher("hi!");
    java.lang.String str8 = treeset_str0.pollFirst();
    int i9 = treeset_str0.size();
    java.util.stream.Stream<java.lang.String> stream_str10 = treeset_str0.stream();
    java.util.NavigableSet<java.lang.String> navigableset_str13 = treeset_str0.tailSet("hi!", true);
    java.lang.Long[] long_array19 = new java.lang.Long[] { 1L, 1L, 100L, 0L, (-1L) };
    java.lang.Long[] long_array20 = treeset_str0.toArray(long_array19);
    java.util.Set<java.lang.Object[]> set_obj_array21 = java.util.Collections.singleton((java.lang.Object[])long_array20);
    java.lang.Class<java.lang.Object[]> cls22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<java.lang.Object[]> set_obj_array23 = java.util.Collections.checkedSet(set_obj_array21, cls22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str10);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str13);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array19);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array20);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array21);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test185"); }


    java.util.NavigableSet<java.lang.Long> navigableset_long0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.NavigableSet<java.lang.Long> navigableset_long1 = java.util.Collections.unmodifiableNavigableSet(navigableset_long0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test186"); }


    java.util.ArrayList<java.lang.Integer> arraylist_i0 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array2 = new java.lang.Integer[] { (-1) };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i0, i_array2);
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array6 = new java.lang.Integer[] { 0 };
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array6);
    java.util.ArrayList<java.lang.Integer> arraylist_i8 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array10 = new java.lang.Integer[] { 1 };
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i8, i_array10);
    int i12 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i4, (java.util.List<java.lang.Integer>)arraylist_i8);
    int i13 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i0, (java.util.List<java.lang.Integer>)arraylist_i4);
    int i15 = java.util.Collections.binarySearch((java.util.List<java.lang.Integer>)arraylist_i4, (java.lang.Integer)1);
    java.lang.Class<java.lang.Integer> cls16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.lang.Integer> list_i17 = java.util.Collections.checkedList((java.util.List<java.lang.Integer>)arraylist_i4, cls16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-2));

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test187"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str9 = treeset_str0.headSet("", false);
    int i11 = java.util.Collections.frequency((java.util.Collection<java.lang.String>)treeset_str0, (java.lang.Object)' ');
    java.util.TreeSet<java.lang.String> treeset_str12 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    treeset_str12.clear();
    java.util.TreeSet<java.lang.String> treeset_str14 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array17 = new java.lang.String[] { "", "" };
    boolean b18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str14, str_array17);
    java.util.SortedSet<java.lang.String> sortedset_str20 = treeset_str14.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str23 = treeset_str14.headSet("", false);
    java.util.Comparator<?> comparator_obj24 = treeset_str14.comparator();
    java.util.ArrayList<java.util.Collections> arraylist_collections25 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array26 = new java.util.Collections[] {  };
    boolean b27 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections25, collections_array26);
    java.util.Collections collections28 = null;
    java.util.Comparator<java.lang.Object> comparator_obj29 = null;
    int i30 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections25, collections28, comparator_obj29);
    boolean b31 = treeset_str14.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections25);
    int i32 = java.util.Collections.frequency((java.util.Collection<java.lang.String>)treeset_str12, (java.lang.Object)arraylist_collections25);
    boolean b34 = treeset_str12.add("hi!");
    java.util.stream.Stream<java.lang.String> stream_str35 = treeset_str12.stream();
    java.util.Comparator<?> comparator_obj36 = treeset_str12.comparator();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str20);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str23);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_obj24);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array26);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str35);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_obj36);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test188"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.lang.String str7 = treeset_str0.higher("hi!");
    java.lang.String str8 = treeset_str0.pollFirst();
    java.util.Iterator<java.lang.String> iterator_str9 = treeset_str0.iterator();
    java.util.NavigableSet<java.lang.String> navigableset_str12 = treeset_str0.headSet("hi!", true);
    java.util.TreeSet<java.lang.String> treeset_str13 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)navigableset_str12);
    java.util.SortedSet<java.lang.String> sortedset_str15 = treeset_str13.tailSet("");
    java.util.Collection<java.lang.String> collection_str16 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)sortedset_str15);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str15);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str16);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test189"); }


    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.lang.String> list_str2 = java.util.Collections.nCopies((int)(byte)-1, "[]");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test190"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str9 = treeset_str0.headSet("", false);
    int i11 = java.util.Collections.frequency((java.util.Collection<java.lang.String>)treeset_str0, (java.lang.Object)' ');
    java.util.TreeSet<java.lang.String> treeset_str12 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    treeset_str12.clear();
    java.util.TreeSet<java.lang.String> treeset_str14 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array17 = new java.lang.String[] { "", "" };
    boolean b18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str14, str_array17);
    java.util.SortedSet<java.lang.String> sortedset_str20 = treeset_str14.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str23 = treeset_str14.headSet("", false);
    java.util.Comparator<?> comparator_obj24 = treeset_str14.comparator();
    java.util.ArrayList<java.util.Collections> arraylist_collections25 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array26 = new java.util.Collections[] {  };
    boolean b27 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections25, collections_array26);
    java.util.Collections collections28 = null;
    java.util.Comparator<java.lang.Object> comparator_obj29 = null;
    int i30 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections25, collections28, comparator_obj29);
    boolean b31 = treeset_str14.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections25);
    int i32 = java.util.Collections.frequency((java.util.Collection<java.lang.String>)treeset_str12, (java.lang.Object)arraylist_collections25);
    boolean b34 = treeset_str12.add("hi!");
    java.util.stream.Stream<java.lang.String> stream_str35 = treeset_str12.stream();
    java.lang.String str36 = treeset_str12.last();
    java.util.Collection<java.lang.String> collection_str37 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b38 = treeset_str12.addAll(collection_str37);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str20);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str23);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_obj24);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array26);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str35);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!"+ "'", str36.equals("hi!"));

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test191"); }


    java.util.Random random0 = null;
    java.util.Map<java.util.Random,java.lang.Integer> map_random_i2 = java.util.Collections.singletonMap(random0, (java.lang.Integer)(-2));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_random_i2);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test192"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str9 = treeset_str0.headSet("", false);
    boolean b11 = treeset_str0.add("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str12 = treeset_str0.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str13 = treeset_str0.iterator();
    java.lang.String str14 = treeset_str0.first();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str13);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test193"); }


    java.util.Collection<java.lang.String> collection_str0 = null;
    java.util.ArrayList<java.lang.Boolean> arraylist_b1 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array4 = new java.lang.Boolean[] { true, false };
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b1, b_array4);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b1);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b1);
    java.util.ArrayList<java.lang.Boolean> arraylist_b8 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array11 = new java.lang.Boolean[] { true, false };
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b8, b_array11);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b8);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b8);
    java.util.Comparator<java.lang.Object> comparator_obj15 = null;
    java.util.Comparator<java.lang.Object> comparator_obj16 = java.util.Collections.reverseOrder(comparator_obj15);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b8, comparator_obj16);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b1, comparator_obj16);
    java.util.Comparator<java.lang.Object> comparator_obj19 = java.util.Collections.reverseOrder(comparator_obj16);
    // The following exception was thrown during execution in test generation
    try {
    int i20 = java.util.Collections.frequency(collection_str0, (java.lang.Object)comparator_obj19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array4);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array11);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj16);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj19);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test194"); }


    java.util.Map<java.lang.String,java.lang.String> map_str_str0 = java.util.Collections.emptyMap();
    java.util.Map<java.lang.String,java.lang.String> map_str_str1 = java.util.Collections.synchronizedMap(map_str_str0);
    java.util.Map<java.lang.String,java.lang.String> map_str_str2 = java.util.Collections.synchronizedMap(map_str_str1);
    java.util.Map<java.lang.String,java.lang.String> map_str_str3 = java.util.Collections.synchronizedMap(map_str_str1);
    java.util.Map<java.lang.String,java.lang.String> map_str_str4 = java.util.Collections.synchronizedMap(map_str_str3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str1);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str4);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test195"); }


    java.util.ArrayList<java.lang.Integer> arraylist_i0 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array2 = new java.lang.Integer[] { 0 };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i0, i_array2);
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array6 = new java.lang.Integer[] { 1 };
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array6);
    int i8 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i0, (java.util.List<java.lang.Integer>)arraylist_i4);
    java.lang.Integer i9 = java.util.Collections.min((java.util.Collection<java.lang.Integer>)arraylist_i4);
    java.util.ArrayList<java.lang.Integer> arraylist_i10 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array12 = new java.lang.Integer[] { 0 };
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i10, i_array12);
    java.util.ArrayList<java.lang.Integer> arraylist_i14 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array16 = new java.lang.Integer[] { 1 };
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i14, i_array16);
    int i18 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i10, (java.util.List<java.lang.Integer>)arraylist_i14);
    int i20 = java.util.Collections.binarySearch((java.util.List<java.lang.Integer>)arraylist_i14, (java.lang.Integer)100);
    int i21 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i4, (java.util.List<java.lang.Integer>)arraylist_i14);
    int i23 = java.util.Collections.binarySearch((java.util.List<java.lang.Integer>)arraylist_i4, (java.lang.Integer)10);
    java.lang.Class<java.lang.Integer> cls24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.lang.Integer> list_i25 = java.util.Collections.checkedList((java.util.List<java.lang.Integer>)arraylist_i4, cls24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 1+ "'", i9.equals(1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == (-2));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == (-2));

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test196"); }


    java.util.LinkedHashSet<java.lang.String> linkedhashset_str0 = new java.util.LinkedHashSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "hi!" };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str0, str_array2);
    java.util.ArrayList<java.util.Collections> arraylist_collections4 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array5 = new java.util.Collections[] {  };
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections4, collections_array5);
    java.util.Collections collections7 = null;
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    int i9 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections4, collections7, comparator_obj8);
    boolean b10 = linkedhashset_str0.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections4);
    java.util.Collections.reverse((java.util.List<java.util.Collections>)arraylist_collections4);
    java.util.List<java.util.Collections> list_collections12 = java.util.Collections.unmodifiableList((java.util.List<java.util.Collections>)arraylist_collections4);
    java.util.List<java.util.Collections> list_collections13 = java.util.Collections.unmodifiableList((java.util.List<java.util.Collections>)arraylist_collections4);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_collections12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_collections13);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test197"); }


    java.util.Comparator<java.lang.Object> comparator_obj0 = null;
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>(comparator_obj0);
    java.lang.String str3 = treeset_str1.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str5 = treeset_str1.headSet("");
    java.util.Iterator<java.lang.String> iterator_str6 = treeset_str1.descendingIterator();
    boolean b7 = treeset_str1.isEmpty();
    boolean b8 = treeset_str1.isEmpty();
    java.util.Comparator<?> comparator_obj9 = treeset_str1.comparator();
    treeset_str1.clear();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_obj9);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test198"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str9 = treeset_str0.headSet("", false);
    int i11 = java.util.Collections.frequency((java.util.Collection<java.lang.String>)treeset_str0, (java.lang.Object)' ');
    java.util.TreeSet<java.lang.String> treeset_str12 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.SortedSet<java.lang.String> sortedset_str14 = treeset_str12.tailSet("");
    java.lang.String str16 = treeset_str12.lower("[]");

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str14);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test199"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array2);
    java.util.ArrayList<java.lang.Object> arraylist_obj4 = new java.util.ArrayList<java.lang.Object>();
    java.util.ArrayList<java.util.Random> arraylist_random8 = new java.util.ArrayList<java.util.Random>();
    java.util.Random[] random_array9 = new java.util.Random[] {  };
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)arraylist_random8, random_array9);
    java.util.Collections.rotate((java.util.List<java.util.Random>)arraylist_random8, (int)(short)0);
    java.lang.Object[] obj_array22 = new java.lang.Object[] { 10.0f, ' ', 0L, arraylist_random8, (short)1, 100L, (short)0, (-1.0f), (-1L), 1.0f, 100.0f, (short)1, (-1.0f) };
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>)arraylist_obj4, obj_array22);
    boolean b24 = arraylist_str0.retainAll((java.util.Collection<java.lang.Object>)arraylist_obj4);
    java.util.List<java.lang.String> list_str25 = java.util.Collections.synchronizedList((java.util.List<java.lang.String>)arraylist_str0);
    java.util.List<java.lang.String> list_str26 = java.util.Collections.synchronizedList(list_str25);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random_array9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str25);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str26);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test200"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str9 = treeset_str0.headSet("", false);
    int i11 = java.util.Collections.frequency((java.util.Collection<java.lang.String>)treeset_str0, (java.lang.Object)' ');
    java.util.TreeSet<java.lang.String> treeset_str12 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.lang.String str13 = treeset_str0.pollFirst();
    java.util.NavigableSet<java.lang.String> navigableset_str18 = treeset_str0.subSet("[]", true, "hi!", false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str18);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test201"); }


    java.util.ArrayList<java.lang.Integer> arraylist_i0 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array2 = new java.lang.Integer[] { 0 };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i0, i_array2);
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array6 = new java.lang.Integer[] { 1 };
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array6);
    int i8 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i0, (java.util.List<java.lang.Integer>)arraylist_i4);
    java.util.ArrayList<java.lang.Integer> arraylist_i9 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array11 = new java.lang.Integer[] { (-1) };
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i9, i_array11);
    java.util.ArrayList<java.lang.Integer> arraylist_i13 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array15 = new java.lang.Integer[] { 0 };
    boolean b16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i13, i_array15);
    java.util.ArrayList<java.lang.Integer> arraylist_i17 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array19 = new java.lang.Integer[] { 1 };
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i17, i_array19);
    int i21 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i13, (java.util.List<java.lang.Integer>)arraylist_i17);
    int i22 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i9, (java.util.List<java.lang.Integer>)arraylist_i13);
    int i23 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i4, (java.util.List<java.lang.Integer>)arraylist_i9);
    java.util.ArrayList<java.lang.Integer> arraylist_i24 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array26 = new java.lang.Integer[] { (-1) };
    boolean b27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i24, i_array26);
    java.util.ArrayList<java.lang.Boolean> arraylist_b28 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array30 = new java.lang.Boolean[] { false };
    boolean b31 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b28, b_array30);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b28);
    boolean b33 = java.util.Collections.disjoint((java.util.Collection<java.lang.Integer>)arraylist_i24, (java.util.Collection<java.lang.Boolean>)arraylist_b28);
    boolean b34 = java.util.Collections.disjoint((java.util.Collection<java.lang.Integer>)arraylist_i4, (java.util.Collection<java.lang.Boolean>)arraylist_b28);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b28);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array26);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array30);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test202"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str9 = treeset_str0.headSet("", false);
    int i11 = java.util.Collections.frequency((java.util.Collection<java.lang.String>)treeset_str0, (java.lang.Object)' ');
    java.util.TreeSet<java.lang.String> treeset_str12 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    treeset_str12.clear();
    java.lang.Object obj14 = treeset_str12.clone();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj14);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test203"); }


    java.util.SortedSet<java.util.Collections> sortedset_collections0 = null;
    java.lang.Class<java.util.Collections> cls1 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.SortedSet<java.util.Collections> sortedset_collections2 = java.util.Collections.checkedSortedSet(sortedset_collections0, cls1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test204"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array2);
    java.util.ArrayList<java.lang.Object> arraylist_obj4 = new java.util.ArrayList<java.lang.Object>();
    java.util.ArrayList<java.util.Random> arraylist_random8 = new java.util.ArrayList<java.util.Random>();
    java.util.Random[] random_array9 = new java.util.Random[] {  };
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)arraylist_random8, random_array9);
    java.util.Collections.rotate((java.util.List<java.util.Random>)arraylist_random8, (int)(short)0);
    java.lang.Object[] obj_array22 = new java.lang.Object[] { 10.0f, ' ', 0L, arraylist_random8, (short)1, 100L, (short)0, (-1.0f), (-1L), 1.0f, 100.0f, (short)1, (-1.0f) };
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>)arraylist_obj4, obj_array22);
    boolean b24 = arraylist_str0.retainAll((java.util.Collection<java.lang.Object>)arraylist_obj4);
    java.util.ArrayList<java.lang.Object[]> arraylist_obj_array25 = new java.util.ArrayList<java.lang.Object[]>();
    java.lang.Object[][] obj_array_array26 = new java.lang.Object[][] {  };
    boolean b27 = java.util.Collections.addAll((java.util.Collection<java.lang.Object[]>)arraylist_obj_array25, obj_array_array26);
    java.util.Collections.copy((java.util.List<java.lang.Object>)arraylist_obj4, (java.util.List<java.lang.Object[]>)arraylist_obj_array25);
    java.util.ArrayList<java.lang.Integer> arraylist_i29 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array31 = new java.lang.Integer[] { (-1) };
    boolean b32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i29, i_array31);
    java.util.ArrayList<java.lang.Boolean> arraylist_b33 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array35 = new java.lang.Boolean[] { false };
    boolean b36 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b33, b_array35);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b33);
    boolean b38 = java.util.Collections.disjoint((java.util.Collection<java.lang.Integer>)arraylist_i29, (java.util.Collection<java.lang.Boolean>)arraylist_b33);
    java.util.ArrayList<java.lang.Integer> arraylist_i39 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array41 = new java.lang.Integer[] { 0 };
    boolean b42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i39, i_array41);
    java.util.ArrayList<java.lang.Integer> arraylist_i43 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array45 = new java.lang.Integer[] { 1 };
    boolean b46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i43, i_array45);
    int i47 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i39, (java.util.List<java.lang.Integer>)arraylist_i43);
    java.util.ArrayList<java.lang.Integer> arraylist_i48 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array50 = new java.lang.Integer[] { (-1) };
    boolean b51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i48, i_array50);
    java.util.ArrayList<java.lang.Integer> arraylist_i52 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array54 = new java.lang.Integer[] { 0 };
    boolean b55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i52, i_array54);
    java.util.ArrayList<java.lang.Integer> arraylist_i56 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array58 = new java.lang.Integer[] { 1 };
    boolean b59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i56, i_array58);
    int i60 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i52, (java.util.List<java.lang.Integer>)arraylist_i56);
    int i61 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i48, (java.util.List<java.lang.Integer>)arraylist_i52);
    int i62 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i43, (java.util.List<java.lang.Integer>)arraylist_i48);
    java.util.ArrayList<java.lang.Integer> arraylist_i63 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array65 = new java.lang.Integer[] { (-1) };
    boolean b66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i63, i_array65);
    java.util.ArrayList<java.lang.Boolean> arraylist_b67 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array69 = new java.lang.Boolean[] { false };
    boolean b70 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b67, b_array69);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b67);
    boolean b72 = java.util.Collections.disjoint((java.util.Collection<java.lang.Integer>)arraylist_i63, (java.util.Collection<java.lang.Boolean>)arraylist_b67);
    boolean b73 = java.util.Collections.disjoint((java.util.Collection<java.lang.Integer>)arraylist_i43, (java.util.Collection<java.lang.Boolean>)arraylist_b67);
    java.util.ArrayList<java.lang.Integer> arraylist_i74 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array76 = new java.lang.Integer[] { 0 };
    boolean b77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i74, i_array76);
    java.util.ArrayList<java.lang.Integer> arraylist_i78 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array80 = new java.lang.Integer[] { 1 };
    boolean b81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i78, i_array80);
    int i82 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i74, (java.util.List<java.lang.Integer>)arraylist_i78);
    int i83 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i43, (java.util.List<java.lang.Integer>)arraylist_i74);
    int i84 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i29, (java.util.List<java.lang.Integer>)arraylist_i43);
    int i85 = java.util.Collections.lastIndexOfSubList((java.util.List<java.lang.Object>)arraylist_obj4, (java.util.List<java.lang.Integer>)arraylist_i29);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random_array9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array26);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array35);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array45);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array50);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array54);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array58);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array65);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array69);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array76);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array80);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i84 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == (-1));

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test205"); }


    java.util.NavigableMap<java.util.Collections,java.lang.Boolean> navigablemap_collections_b0 = java.util.Collections.emptyNavigableMap();
    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    java.util.TreeSet<java.lang.String> treeset_str3 = new java.util.TreeSet<java.lang.String>(comparator_obj2);
    java.lang.String str5 = treeset_str3.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str7 = treeset_str3.headSet("");
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array12 = new java.lang.String[] { "", "" };
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str9, str_array12);
    java.util.SortedSet<java.lang.String> sortedset_str15 = treeset_str9.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str18 = treeset_str9.headSet("", false);
    boolean b20 = treeset_str9.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str21 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str9);
    java.lang.Object[] obj_array22 = new java.lang.Object[] { navigablemap_collections_b0, true, sortedset_str7, 1.0d, treeset_str21 };
    java.util.Set<java.lang.Object[]> set_obj_array23 = java.util.Collections.singleton(obj_array22);
    java.util.Set<java.lang.Object[]> set_obj_array24 = java.util.Collections.singleton(obj_array22);
    java.util.Comparator<java.lang.Object[]> comparator_obj_array25 = null;
    java.lang.Object[] obj_array26 = java.util.Collections.max((java.util.Collection<java.lang.Object[]>)set_obj_array24, comparator_obj_array25);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigablemap_collections_b0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str15);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str18);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array23);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array24);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test206"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str7 = treeset_str0.descendingSet();
    java.util.Comparator<?> comparator_obj8 = treeset_str0.comparator();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_obj8);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test207"); }


    java.util.ArrayList<java.lang.Long> arraylist_long0 = new java.util.ArrayList<java.lang.Long>();
    java.lang.Long[] long_array2 = new java.lang.Long[] { 1L };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long0, long_array2);
    boolean b6 = java.util.Collections.replaceAll((java.util.List<java.lang.Long>)arraylist_long0, (java.lang.Long)(-1L), (java.lang.Long)10L);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test208"); }


    java.util.Collection<java.lang.Integer> collection_i0 = null;
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array4 = new java.lang.String[] { "", "" };
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str1, str_array4);
    java.util.Iterator<java.lang.String> iterator_str6 = treeset_str1.iterator();
    java.lang.String str8 = treeset_str1.higher("hi!");
    java.lang.String str9 = treeset_str1.pollFirst();
    java.util.Comparator<java.lang.Object> comparator_obj10 = null;
    java.util.TreeSet<java.lang.String> treeset_str11 = new java.util.TreeSet<java.lang.String>(comparator_obj10);
    java.lang.String str13 = treeset_str11.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str15 = treeset_str11.headSet("");
    boolean b16 = treeset_str1.addAll((java.util.Collection<java.lang.String>)treeset_str11);
    java.lang.Object[] obj_array17 = treeset_str1.toArray();
    java.util.TreeSet<java.lang.Boolean> treeset_b18 = new java.util.TreeSet<java.lang.Boolean>();
    java.lang.Boolean[] b_array20 = new java.lang.Boolean[] { true };
    boolean b21 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)treeset_b18, b_array20);
    java.util.NavigableSet<java.lang.Boolean> navigableset_b22 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.lang.Boolean>)treeset_b18);
    java.util.NavigableSet<java.lang.Boolean> navigableset_b23 = java.util.Collections.synchronizedNavigableSet(navigableset_b22);
    boolean b24 = treeset_str1.containsAll((java.util.Collection<java.lang.Boolean>)navigableset_b22);
    // The following exception was thrown during execution in test generation
    try {
    boolean b25 = java.util.Collections.disjoint(collection_i0, (java.util.Collection<java.lang.Boolean>)navigableset_b22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str15);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array20);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_b22);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_b23);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test209"); }


    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.lang.String> list_str2 = java.util.Collections.nCopies((-1), "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test210"); }


    java.util.ArrayList<java.util.Random> arraylist_random0 = new java.util.ArrayList<java.util.Random>();
    java.util.Random[] random_array1 = new java.util.Random[] {  };
    boolean b2 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)arraylist_random0, random_array1);
    java.util.Collections.rotate((java.util.List<java.util.Random>)arraylist_random0, (int)(short)0);
    java.util.Collections.rotate((java.util.List<java.util.Random>)arraylist_random0, 10);
    java.util.Collections.rotate((java.util.List<java.util.Random>)arraylist_random0, 1);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random_array1);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test211"); }


    java.util.Comparator<java.lang.Object> comparator_obj0 = null;
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>(comparator_obj0);
    java.lang.String str3 = treeset_str1.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str5 = treeset_str1.headSet("");
    java.util.function.Predicate<java.lang.Object> predicate_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b7 = treeset_str1.removeIf(predicate_obj6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str5);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test212"); }


    java.util.ArrayList<java.lang.Long> arraylist_long0 = new java.util.ArrayList<java.lang.Long>();
    java.lang.Long[] long_array5 = new java.lang.Long[] { 100L, (-1L), (-1L), 0L };
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long0, long_array5);
    boolean b9 = java.util.Collections.replaceAll((java.util.List<java.lang.Long>)arraylist_long0, (java.lang.Long)1L, (java.lang.Long)100L);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test213"); }


    java.util.LinkedHashSet<java.lang.String> linkedhashset_str0 = new java.util.LinkedHashSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "hi!" };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str0, str_array2);
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str4 = new java.util.LinkedHashSet<java.lang.String>();
    java.lang.String[] str_array6 = new java.lang.String[] { "hi!" };
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str4, str_array6);
    java.util.ArrayList<java.util.Collections> arraylist_collections8 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array9 = new java.util.Collections[] {  };
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections8, collections_array9);
    java.util.Collections collections11 = null;
    java.util.Comparator<java.lang.Object> comparator_obj12 = null;
    int i13 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections8, collections11, comparator_obj12);
    boolean b14 = linkedhashset_str4.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections8);
    java.util.Collections collections15 = null;
    java.util.Collections.fill((java.util.List<java.util.Collections>)arraylist_collections8, collections15);
    boolean b17 = linkedhashset_str0.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections8);
    java.util.Collections collections18 = null;
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str19 = new java.util.LinkedHashSet<java.lang.String>();
    java.lang.String[] str_array21 = new java.lang.String[] { "hi!" };
    boolean b22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str19, str_array21);
    java.util.ArrayList<java.util.Collections> arraylist_collections23 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array24 = new java.util.Collections[] {  };
    boolean b25 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections23, collections_array24);
    java.util.Collections collections26 = null;
    java.util.Comparator<java.lang.Object> comparator_obj27 = null;
    int i28 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections23, collections26, comparator_obj27);
    boolean b29 = linkedhashset_str19.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections23);
    java.util.Collections collections30 = null;
    java.util.Collections.fill((java.util.List<java.util.Collections>)arraylist_collections23, collections30);
    java.util.Collections collections32 = null;
    java.util.Comparator<java.lang.Object> comparator_obj33 = null;
    java.util.Comparator<java.lang.Object> comparator_obj34 = java.util.Collections.reverseOrder(comparator_obj33);
    int i35 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections23, collections32, comparator_obj34);
    java.util.Comparator<java.lang.Object> comparator_obj36 = java.util.Collections.reverseOrder(comparator_obj34);
    java.util.Comparator<java.lang.Object> comparator_obj37 = java.util.Collections.reverseOrder(comparator_obj34);
    java.util.Comparator<java.lang.Object> comparator_obj38 = java.util.Collections.reverseOrder(comparator_obj34);
    int i39 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections8, collections18, comparator_obj38);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array24);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj34);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj36);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj37);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj38);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == (-1));

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test214"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str9 = treeset_str0.headSet("", false);
    int i11 = java.util.Collections.frequency((java.util.Collection<java.lang.String>)treeset_str0, (java.lang.Object)' ');
    java.util.TreeSet<java.lang.String> treeset_str12 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.lang.String str14 = treeset_str12.ceiling("hi!");
    java.util.Comparator<java.lang.String> comparator_str15 = null;
    java.lang.String str16 = java.util.Collections.min((java.util.Collection<java.lang.String>)treeset_str12, comparator_str15);
    java.util.function.Predicate<java.lang.Object> predicate_obj17 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b18 = treeset_str12.removeIf(predicate_obj17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test215"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str9 = treeset_str0.headSet("", false);
    java.util.Iterator<java.lang.String> iterator_str10 = treeset_str0.descendingIterator();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str10);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test216"); }


    java.util.ArrayList<java.util.Collections> arraylist_collections0 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array1 = new java.util.Collections[] {  };
    boolean b2 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections0, collections_array1);
    java.util.Collections collections3 = null;
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    int i5 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections0, collections3, comparator_obj4);
    java.util.List<java.util.Collections> list_collections6 = java.util.Collections.unmodifiableList((java.util.List<java.util.Collections>)arraylist_collections0);
    java.util.Collections.reverse(list_collections6);
    java.util.Collections collections8 = null;
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str9 = new java.util.LinkedHashSet<java.lang.String>();
    java.lang.String[] str_array11 = new java.lang.String[] { "hi!" };
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str9, str_array11);
    java.util.ArrayList<java.util.Collections> arraylist_collections13 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array14 = new java.util.Collections[] {  };
    boolean b15 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections13, collections_array14);
    java.util.Collections collections16 = null;
    java.util.Comparator<java.lang.Object> comparator_obj17 = null;
    int i18 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections13, collections16, comparator_obj17);
    boolean b19 = linkedhashset_str9.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections13);
    java.util.Collections collections20 = null;
    java.util.Collections.fill((java.util.List<java.util.Collections>)arraylist_collections13, collections20);
    java.util.Collections collections22 = null;
    java.util.Comparator<java.lang.Object> comparator_obj23 = null;
    java.util.Comparator<java.lang.Object> comparator_obj24 = java.util.Collections.reverseOrder(comparator_obj23);
    int i25 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections13, collections22, comparator_obj24);
    java.util.Comparator<java.lang.Object> comparator_obj26 = java.util.Collections.reverseOrder(comparator_obj24);
    int i27 = java.util.Collections.binarySearch(list_collections6, collections8, comparator_obj24);
    java.util.Comparator<java.lang.Object> comparator_obj28 = java.util.Collections.reverseOrder(comparator_obj24);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array1);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_collections6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array14);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj24);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj26);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj28);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test217"); }


    java.util.TreeSet<java.util.Random> treeset_random0 = new java.util.TreeSet<java.util.Random>();
    java.util.Random[] random_array1 = new java.util.Random[] {  };
    boolean b2 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)treeset_random0, random_array1);
    java.util.SortedSet<java.util.Random> sortedset_random3 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.util.Random>)treeset_random0);
    java.util.Enumeration<java.util.Random> enumeration_random4 = java.util.Collections.enumeration((java.util.Collection<java.util.Random>)treeset_random0);
    java.util.SortedSet<java.util.Random> sortedset_random5 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.util.Random>)treeset_random0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random_array1);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_random3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration_random4);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_random5);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test218"); }


    java.util.LinkedHashSet<java.lang.String> linkedhashset_str0 = new java.util.LinkedHashSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "hi!" };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str0, str_array2);
    java.util.ArrayList<java.util.Collections> arraylist_collections4 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array5 = new java.util.Collections[] {  };
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections4, collections_array5);
    java.util.Collections collections7 = null;
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    int i9 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections4, collections7, comparator_obj8);
    boolean b10 = linkedhashset_str0.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections4);
    java.util.Collections.reverse((java.util.List<java.util.Collections>)arraylist_collections4);
    java.util.List<java.util.Collections> list_collections12 = java.util.Collections.unmodifiableList((java.util.List<java.util.Collections>)arraylist_collections4);
    java.util.Collections collections13 = null;
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str14 = new java.util.LinkedHashSet<java.lang.String>();
    java.lang.String[] str_array16 = new java.lang.String[] { "hi!" };
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str14, str_array16);
    java.util.ArrayList<java.util.Collections> arraylist_collections18 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array19 = new java.util.Collections[] {  };
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections18, collections_array19);
    java.util.Collections collections21 = null;
    java.util.Comparator<java.lang.Object> comparator_obj22 = null;
    int i23 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections18, collections21, comparator_obj22);
    boolean b24 = linkedhashset_str14.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections18);
    java.util.Collections.reverse((java.util.List<java.util.Collections>)arraylist_collections18);
    java.util.Collections collections26 = null;
    java.util.ArrayList<java.lang.String> arraylist_str27 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array29 = new java.lang.String[] { "" };
    boolean b30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str27, str_array29);
    java.util.ArrayList<java.lang.Object> arraylist_obj31 = new java.util.ArrayList<java.lang.Object>();
    java.util.ArrayList<java.util.Random> arraylist_random35 = new java.util.ArrayList<java.util.Random>();
    java.util.Random[] random_array36 = new java.util.Random[] {  };
    boolean b37 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)arraylist_random35, random_array36);
    java.util.Collections.rotate((java.util.List<java.util.Random>)arraylist_random35, (int)(short)0);
    java.lang.Object[] obj_array49 = new java.lang.Object[] { 10.0f, ' ', 0L, arraylist_random35, (short)1, 100L, (short)0, (-1.0f), (-1L), 1.0f, 100.0f, (short)1, (-1.0f) };
    boolean b50 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>)arraylist_obj31, obj_array49);
    boolean b51 = arraylist_str27.retainAll((java.util.Collection<java.lang.Object>)arraylist_obj31);
    java.util.Collection<java.lang.String> collection_str52 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str27);
    java.util.stream.Stream<java.lang.String> stream_str53 = arraylist_str27.stream();
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str54 = new java.util.LinkedHashSet<java.lang.String>();
    java.lang.String[] str_array56 = new java.lang.String[] { "hi!" };
    boolean b57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str54, str_array56);
    java.util.ArrayList<java.util.Collections> arraylist_collections58 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array59 = new java.util.Collections[] {  };
    boolean b60 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections58, collections_array59);
    java.util.Collections collections61 = null;
    java.util.Comparator<java.lang.Object> comparator_obj62 = null;
    int i63 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections58, collections61, comparator_obj62);
    boolean b64 = linkedhashset_str54.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections58);
    java.util.Collections collections65 = null;
    java.util.Collections.fill((java.util.List<java.util.Collections>)arraylist_collections58, collections65);
    java.util.Collections collections67 = null;
    java.util.Comparator<java.lang.Object> comparator_obj68 = null;
    java.util.Comparator<java.lang.Object> comparator_obj69 = java.util.Collections.reverseOrder(comparator_obj68);
    int i70 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections58, collections67, comparator_obj69);
    java.util.Comparator<java.lang.Object> comparator_obj71 = java.util.Collections.reverseOrder(comparator_obj69);
    int i72 = java.util.Collections.frequency((java.util.Collection<java.lang.String>)arraylist_str27, (java.lang.Object)comparator_obj69);
    int i73 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections18, collections26, comparator_obj69);
    int i74 = java.util.Collections.binarySearch(list_collections12, collections13, comparator_obj69);
    java.util.Collection<java.util.Collections> collection_collections75 = java.util.Collections.unmodifiableCollection((java.util.Collection<java.util.Collections>)list_collections12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_collections12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array19);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array29);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random_array36);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array49);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str52);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str53);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array56);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array59);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj69);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj71);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_collections75);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test219"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.lang.String str7 = treeset_str0.higher("hi!");
    java.lang.String str8 = treeset_str0.pollFirst();
    int i9 = treeset_str0.size();
    java.lang.String str11 = treeset_str0.lower("hi!");

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test220"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str7 = treeset_str0.descendingSet();
    java.lang.Object[] obj_array8 = treeset_str0.toArray();
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array12 = new java.lang.String[] { "", "" };
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str9, str_array12);
    java.util.Iterator<java.lang.String> iterator_str14 = treeset_str9.iterator();
    java.lang.String str16 = treeset_str9.higher("hi!");
    java.lang.String str17 = treeset_str9.pollFirst();
    int i18 = treeset_str9.size();
    java.util.stream.Stream<java.lang.String> stream_str19 = treeset_str9.stream();
    java.util.NavigableSet<java.lang.String> navigableset_str22 = treeset_str9.tailSet("hi!", true);
    java.lang.Long[] long_array28 = new java.lang.Long[] { 1L, 1L, 100L, 0L, (-1L) };
    java.lang.Long[] long_array29 = treeset_str9.toArray(long_array28);
    java.util.Set<java.lang.Object[]> set_obj_array30 = java.util.Collections.singleton((java.lang.Object[])long_array29);
    java.util.Set<java.lang.Object[]> set_obj_array31 = java.util.Collections.singleton((java.lang.Object[])long_array29);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Long[] long_array32 = treeset_str0.toArray(long_array29);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException");
    } catch (java.lang.ArrayStoreException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayStoreException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str14);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str19);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str22);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array28);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array29);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array30);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array31);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test221"); }


    java.util.ArrayList<java.lang.Boolean> arraylist_b0 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { true, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b0, b_array3);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b0);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b0);
    java.util.Comparator<java.lang.Object> comparator_obj7 = null;
    java.util.Comparator<java.lang.Object> comparator_obj8 = java.util.Collections.reverseOrder(comparator_obj7);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b0, comparator_obj8);
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str10 = new java.util.LinkedHashSet<java.lang.String>();
    java.lang.String[] str_array12 = new java.lang.String[] { "hi!" };
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str10, str_array12);
    java.util.ArrayList<java.util.Collections> arraylist_collections14 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array15 = new java.util.Collections[] {  };
    boolean b16 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections14, collections_array15);
    java.util.Collections collections17 = null;
    java.util.Comparator<java.lang.Object> comparator_obj18 = null;
    int i19 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections14, collections17, comparator_obj18);
    boolean b20 = linkedhashset_str10.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections14);
    java.util.Collections.reverse((java.util.List<java.util.Collections>)arraylist_collections14);
    java.util.List<java.util.Collections> list_collections22 = java.util.Collections.unmodifiableList((java.util.List<java.util.Collections>)arraylist_collections14);
    java.util.Collections collections23 = null;
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str24 = new java.util.LinkedHashSet<java.lang.String>();
    java.lang.String[] str_array26 = new java.lang.String[] { "hi!" };
    boolean b27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str24, str_array26);
    java.util.ArrayList<java.util.Collections> arraylist_collections28 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array29 = new java.util.Collections[] {  };
    boolean b30 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections28, collections_array29);
    java.util.Collections collections31 = null;
    java.util.Comparator<java.lang.Object> comparator_obj32 = null;
    int i33 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections28, collections31, comparator_obj32);
    boolean b34 = linkedhashset_str24.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections28);
    java.util.Collections.reverse((java.util.List<java.util.Collections>)arraylist_collections28);
    java.util.Collections collections36 = null;
    java.util.ArrayList<java.lang.String> arraylist_str37 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array39 = new java.lang.String[] { "" };
    boolean b40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str37, str_array39);
    java.util.ArrayList<java.lang.Object> arraylist_obj41 = new java.util.ArrayList<java.lang.Object>();
    java.util.ArrayList<java.util.Random> arraylist_random45 = new java.util.ArrayList<java.util.Random>();
    java.util.Random[] random_array46 = new java.util.Random[] {  };
    boolean b47 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)arraylist_random45, random_array46);
    java.util.Collections.rotate((java.util.List<java.util.Random>)arraylist_random45, (int)(short)0);
    java.lang.Object[] obj_array59 = new java.lang.Object[] { 10.0f, ' ', 0L, arraylist_random45, (short)1, 100L, (short)0, (-1.0f), (-1L), 1.0f, 100.0f, (short)1, (-1.0f) };
    boolean b60 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>)arraylist_obj41, obj_array59);
    boolean b61 = arraylist_str37.retainAll((java.util.Collection<java.lang.Object>)arraylist_obj41);
    java.util.Collection<java.lang.String> collection_str62 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str37);
    java.util.stream.Stream<java.lang.String> stream_str63 = arraylist_str37.stream();
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str64 = new java.util.LinkedHashSet<java.lang.String>();
    java.lang.String[] str_array66 = new java.lang.String[] { "hi!" };
    boolean b67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str64, str_array66);
    java.util.ArrayList<java.util.Collections> arraylist_collections68 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array69 = new java.util.Collections[] {  };
    boolean b70 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections68, collections_array69);
    java.util.Collections collections71 = null;
    java.util.Comparator<java.lang.Object> comparator_obj72 = null;
    int i73 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections68, collections71, comparator_obj72);
    boolean b74 = linkedhashset_str64.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections68);
    java.util.Collections collections75 = null;
    java.util.Collections.fill((java.util.List<java.util.Collections>)arraylist_collections68, collections75);
    java.util.Collections collections77 = null;
    java.util.Comparator<java.lang.Object> comparator_obj78 = null;
    java.util.Comparator<java.lang.Object> comparator_obj79 = java.util.Collections.reverseOrder(comparator_obj78);
    int i80 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections68, collections77, comparator_obj79);
    java.util.Comparator<java.lang.Object> comparator_obj81 = java.util.Collections.reverseOrder(comparator_obj79);
    int i82 = java.util.Collections.frequency((java.util.Collection<java.lang.String>)arraylist_str37, (java.lang.Object)comparator_obj79);
    int i83 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections28, collections36, comparator_obj79);
    int i84 = java.util.Collections.binarySearch(list_collections22, collections23, comparator_obj79);
    java.util.TreeSet<java.lang.String> treeset_str85 = new java.util.TreeSet<java.lang.String>(comparator_obj79);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b0, comparator_obj79);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj8);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array15);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_collections22);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array26);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array29);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array39);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random_array46);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array59);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str62);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str63);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array66);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array69);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj79);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj81);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i84 == (-1));

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test222"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.lang.String str7 = treeset_str0.higher("hi!");
    java.lang.String str8 = treeset_str0.pollFirst();
    int i9 = treeset_str0.size();
    java.util.stream.Stream<java.lang.String> stream_str10 = treeset_str0.stream();
    java.util.NavigableSet<java.lang.String> navigableset_str13 = treeset_str0.tailSet("hi!", true);
    java.lang.Object obj14 = treeset_str0.clone();
    java.util.function.Consumer<java.lang.String> consumer_str15 = null;
    // The following exception was thrown during execution in test generation
    try {
    treeset_str0.forEach(consumer_str15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str10);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str13);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj14);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test223"); }


    java.util.List<java.lang.Boolean> list_b0 = null;
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str1 = new java.util.LinkedHashSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str1, str_array3);
    java.util.ArrayList<java.util.Collections> arraylist_collections5 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array6 = new java.util.Collections[] {  };
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections5, collections_array6);
    java.util.Collections collections8 = null;
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    int i10 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections5, collections8, comparator_obj9);
    boolean b11 = linkedhashset_str1.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections5);
    java.util.Collections.reverse((java.util.List<java.util.Collections>)arraylist_collections5);
    java.util.Collections collections13 = null;
    java.util.ArrayList<java.lang.String> arraylist_str14 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array16 = new java.lang.String[] { "" };
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str14, str_array16);
    java.util.ArrayList<java.lang.Object> arraylist_obj18 = new java.util.ArrayList<java.lang.Object>();
    java.util.ArrayList<java.util.Random> arraylist_random22 = new java.util.ArrayList<java.util.Random>();
    java.util.Random[] random_array23 = new java.util.Random[] {  };
    boolean b24 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)arraylist_random22, random_array23);
    java.util.Collections.rotate((java.util.List<java.util.Random>)arraylist_random22, (int)(short)0);
    java.lang.Object[] obj_array36 = new java.lang.Object[] { 10.0f, ' ', 0L, arraylist_random22, (short)1, 100L, (short)0, (-1.0f), (-1L), 1.0f, 100.0f, (short)1, (-1.0f) };
    boolean b37 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>)arraylist_obj18, obj_array36);
    boolean b38 = arraylist_str14.retainAll((java.util.Collection<java.lang.Object>)arraylist_obj18);
    java.util.Collection<java.lang.String> collection_str39 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str14);
    java.util.stream.Stream<java.lang.String> stream_str40 = arraylist_str14.stream();
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str41 = new java.util.LinkedHashSet<java.lang.String>();
    java.lang.String[] str_array43 = new java.lang.String[] { "hi!" };
    boolean b44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str41, str_array43);
    java.util.ArrayList<java.util.Collections> arraylist_collections45 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array46 = new java.util.Collections[] {  };
    boolean b47 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections45, collections_array46);
    java.util.Collections collections48 = null;
    java.util.Comparator<java.lang.Object> comparator_obj49 = null;
    int i50 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections45, collections48, comparator_obj49);
    boolean b51 = linkedhashset_str41.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections45);
    java.util.Collections collections52 = null;
    java.util.Collections.fill((java.util.List<java.util.Collections>)arraylist_collections45, collections52);
    java.util.Collections collections54 = null;
    java.util.Comparator<java.lang.Object> comparator_obj55 = null;
    java.util.Comparator<java.lang.Object> comparator_obj56 = java.util.Collections.reverseOrder(comparator_obj55);
    int i57 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections45, collections54, comparator_obj56);
    java.util.Comparator<java.lang.Object> comparator_obj58 = java.util.Collections.reverseOrder(comparator_obj56);
    int i59 = java.util.Collections.frequency((java.util.Collection<java.lang.String>)arraylist_str14, (java.lang.Object)comparator_obj56);
    int i60 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections5, collections13, comparator_obj56);
    // The following exception was thrown during execution in test generation
    try {
    java.util.Collections.sort(list_b0, comparator_obj56);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random_array23);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array36);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str39);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str40);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array43);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array46);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj56);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj58);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == (-1));

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test224"); }


    java.util.NavigableMap<java.util.Collections,java.lang.Boolean> navigablemap_collections_b0 = java.util.Collections.emptyNavigableMap();
    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    java.util.TreeSet<java.lang.String> treeset_str3 = new java.util.TreeSet<java.lang.String>(comparator_obj2);
    java.lang.String str5 = treeset_str3.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str7 = treeset_str3.headSet("");
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array12 = new java.lang.String[] { "", "" };
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str9, str_array12);
    java.util.SortedSet<java.lang.String> sortedset_str15 = treeset_str9.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str18 = treeset_str9.headSet("", false);
    boolean b20 = treeset_str9.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str21 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str9);
    java.lang.Object[] obj_array22 = new java.lang.Object[] { navigablemap_collections_b0, true, sortedset_str7, 1.0d, treeset_str21 };
    java.util.Set<java.lang.Object[]> set_obj_array23 = java.util.Collections.singleton(obj_array22);
    java.lang.Class<java.lang.Object[]> cls24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<java.lang.Object[]> set_obj_array25 = java.util.Collections.checkedSet(set_obj_array23, cls24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigablemap_collections_b0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str15);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str18);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array23);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test225"); }


    java.util.ArrayList<java.lang.Long> arraylist_long0 = new java.util.ArrayList<java.lang.Long>();
    java.lang.Long[] long_array5 = new java.lang.Long[] { 10L, 0L, 0L, 1L };
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long0, long_array5);
    boolean b9 = java.util.Collections.replaceAll((java.util.List<java.lang.Long>)arraylist_long0, (java.lang.Long)100L, (java.lang.Long)1L);
    boolean b12 = java.util.Collections.replaceAll((java.util.List<java.lang.Long>)arraylist_long0, (java.lang.Long)10L, (java.lang.Long)10L);
    java.lang.Long long13 = java.util.Collections.max((java.util.Collection<java.lang.Long>)arraylist_long0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L+ "'", long13.equals(10L));

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test226"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array2);
    java.util.ArrayList<java.lang.Object> arraylist_obj4 = new java.util.ArrayList<java.lang.Object>();
    java.util.ArrayList<java.util.Random> arraylist_random8 = new java.util.ArrayList<java.util.Random>();
    java.util.Random[] random_array9 = new java.util.Random[] {  };
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)arraylist_random8, random_array9);
    java.util.Collections.rotate((java.util.List<java.util.Random>)arraylist_random8, (int)(short)0);
    java.lang.Object[] obj_array22 = new java.lang.Object[] { 10.0f, ' ', 0L, arraylist_random8, (short)1, 100L, (short)0, (-1.0f), (-1L), 1.0f, 100.0f, (short)1, (-1.0f) };
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>)arraylist_obj4, obj_array22);
    boolean b24 = arraylist_str0.retainAll((java.util.Collection<java.lang.Object>)arraylist_obj4);
    java.util.Collection<java.lang.String> collection_str25 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str0);
    java.util.stream.Stream<java.lang.String> stream_str26 = arraylist_str0.stream();
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str27 = new java.util.LinkedHashSet<java.lang.String>();
    java.lang.String[] str_array29 = new java.lang.String[] { "hi!" };
    boolean b30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str27, str_array29);
    java.util.ArrayList<java.util.Collections> arraylist_collections31 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array32 = new java.util.Collections[] {  };
    boolean b33 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections31, collections_array32);
    java.util.Collections collections34 = null;
    java.util.Comparator<java.lang.Object> comparator_obj35 = null;
    int i36 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections31, collections34, comparator_obj35);
    boolean b37 = linkedhashset_str27.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections31);
    java.util.Collections collections38 = null;
    java.util.Collections.fill((java.util.List<java.util.Collections>)arraylist_collections31, collections38);
    java.util.Collections collections40 = null;
    java.util.Comparator<java.lang.Object> comparator_obj41 = null;
    java.util.Comparator<java.lang.Object> comparator_obj42 = java.util.Collections.reverseOrder(comparator_obj41);
    int i43 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections31, collections40, comparator_obj42);
    java.util.Comparator<java.lang.Object> comparator_obj44 = java.util.Collections.reverseOrder(comparator_obj42);
    int i45 = java.util.Collections.frequency((java.util.Collection<java.lang.String>)arraylist_str0, (java.lang.Object)comparator_obj42);
    java.util.List<java.lang.String> list_str46 = java.util.Collections.synchronizedList((java.util.List<java.lang.String>)arraylist_str0);
    java.util.List<java.lang.String> list_str47 = java.util.Collections.synchronizedList(list_str46);
    java.util.List<java.lang.String> list_str48 = java.util.Collections.synchronizedList(list_str47);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random_array9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str25);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str26);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array29);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array32);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj42);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj44);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str46);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str47);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str48);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test227"); }


    java.util.TreeSet<java.lang.Integer> treeset_i0 = new java.util.TreeSet<java.lang.Integer>();
    java.lang.Integer[] i_array2 = new java.lang.Integer[] { (-1) };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)treeset_i0, i_array2);
    java.util.SortedSet<java.lang.Integer> sortedset_i4 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.Integer>)treeset_i0);
    java.util.Set<java.lang.Integer> set_i5 = java.util.Collections.synchronizedSet((java.util.Set<java.lang.Integer>)treeset_i0);
    java.util.Set<java.lang.Integer> set_i6 = java.util.Collections.synchronizedSet(set_i5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_i4);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_i5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_i6);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test228"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str9 = treeset_str0.headSet("", false);
    boolean b11 = treeset_str0.add("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str12 = treeset_str0.descendingSet();
    java.util.SortedSet<java.lang.String> sortedset_str15 = treeset_str0.subSet("", "hi!");
    java.util.TreeSet<java.lang.String> treeset_str16 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array19 = new java.lang.String[] { "", "" };
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str16, str_array19);
    java.util.Iterator<java.lang.String> iterator_str21 = treeset_str16.iterator();
    java.lang.String str23 = treeset_str16.higher("hi!");
    java.lang.String str24 = treeset_str16.pollFirst();
    java.util.Comparator<java.lang.Object> comparator_obj25 = null;
    java.util.TreeSet<java.lang.String> treeset_str26 = new java.util.TreeSet<java.lang.String>(comparator_obj25);
    java.lang.String str28 = treeset_str26.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str30 = treeset_str26.headSet("");
    boolean b31 = treeset_str16.addAll((java.util.Collection<java.lang.String>)treeset_str26);
    // The following exception was thrown during execution in test generation
    try {
    boolean b32 = treeset_str0.remove((java.lang.Object)treeset_str16);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str15);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str21);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str28);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str30);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test229"); }


    java.util.Collection<java.util.Random> collection_random0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Enumeration<java.util.Random> enumeration_random1 = java.util.Collections.enumeration(collection_random0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test230"); }


    java.util.LinkedHashSet<java.lang.String> linkedhashset_str0 = new java.util.LinkedHashSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "hi!" };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str0, str_array2);
    java.util.ArrayList<java.util.Collections> arraylist_collections4 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array5 = new java.util.Collections[] {  };
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections4, collections_array5);
    java.util.Collections collections7 = null;
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    int i9 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections4, collections7, comparator_obj8);
    boolean b10 = linkedhashset_str0.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections4);
    java.util.stream.Stream<java.lang.String> stream_str11 = linkedhashset_str0.parallelStream();
    java.lang.String str12 = linkedhashset_str0.toString();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str11);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[hi!]"+ "'", str12.equals("[hi!]"));

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test231"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.lang.String str7 = treeset_str0.higher("hi!");
    treeset_str0.clear();
    java.util.Iterator<java.lang.String> iterator_str9 = treeset_str0.descendingIterator();
    java.util.Spliterator<java.lang.String> spliterator_str10 = treeset_str0.spliterator();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = treeset_str0.first();
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.util.NoSuchElementException")) {
        org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str10);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test232"); }


    java.util.ArrayDeque<java.lang.String> arraydeque_str0 = new java.util.ArrayDeque<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!", "hi!" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraydeque_str0, str_array3);
    java.util.Queue<java.lang.String> queue_str5 = java.util.Collections.asLifoQueue((java.util.Deque<java.lang.String>)arraydeque_str0);
    java.util.Queue<java.lang.String> queue_str6 = java.util.Collections.asLifoQueue((java.util.Deque<java.lang.String>)arraydeque_str0);
    java.util.function.Predicate<java.lang.Object> predicate_obj7 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b8 = arraydeque_str0.removeIf(predicate_obj7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(queue_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(queue_str6);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test233"); }


    java.util.Comparator<java.lang.Object> comparator_obj0 = null;
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>(comparator_obj0);
    java.lang.String str3 = treeset_str1.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str5 = treeset_str1.headSet("");
    java.lang.String str7 = treeset_str1.higher("[]");
    java.lang.Object obj8 = treeset_str1.clone();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj8);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test234"); }


    java.util.Comparator<java.lang.Object> comparator_obj0 = null;
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>(comparator_obj0);
    java.lang.String str3 = treeset_str1.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str5 = treeset_str1.headSet("");
    java.util.Iterator<java.lang.String> iterator_str6 = treeset_str1.descendingIterator();
    java.util.Spliterator<java.lang.String> spliterator_str7 = treeset_str1.spliterator();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str7);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test235"); }


    java.util.Comparator<java.lang.Object> comparator_obj0 = null;
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>(comparator_obj0);
    java.lang.String str3 = treeset_str1.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str5 = treeset_str1.headSet("");
    java.util.Iterator<java.lang.String> iterator_str6 = treeset_str1.descendingIterator();
    java.lang.Object obj7 = treeset_str1.clone();
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str8 = new java.util.LinkedHashSet<java.lang.String>();
    java.lang.String[] str_array10 = new java.lang.String[] { "hi!" };
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str8, str_array10);
    java.util.ArrayList<java.util.Collections> arraylist_collections12 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array13 = new java.util.Collections[] {  };
    boolean b14 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections12, collections_array13);
    java.util.Collections collections15 = null;
    java.util.Comparator<java.lang.Object> comparator_obj16 = null;
    int i17 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections12, collections15, comparator_obj16);
    boolean b18 = linkedhashset_str8.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections12);
    java.util.Collections.reverse((java.util.List<java.util.Collections>)arraylist_collections12);
    java.util.List<java.util.Collections> list_collections20 = java.util.Collections.unmodifiableList((java.util.List<java.util.Collections>)arraylist_collections12);
    java.util.Collections collections21 = null;
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str22 = new java.util.LinkedHashSet<java.lang.String>();
    java.lang.String[] str_array24 = new java.lang.String[] { "hi!" };
    boolean b25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str22, str_array24);
    java.util.ArrayList<java.util.Collections> arraylist_collections26 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array27 = new java.util.Collections[] {  };
    boolean b28 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections26, collections_array27);
    java.util.Collections collections29 = null;
    java.util.Comparator<java.lang.Object> comparator_obj30 = null;
    int i31 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections26, collections29, comparator_obj30);
    boolean b32 = linkedhashset_str22.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections26);
    java.util.Collections.reverse((java.util.List<java.util.Collections>)arraylist_collections26);
    java.util.Collections collections34 = null;
    java.util.ArrayList<java.lang.String> arraylist_str35 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array37 = new java.lang.String[] { "" };
    boolean b38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str35, str_array37);
    java.util.ArrayList<java.lang.Object> arraylist_obj39 = new java.util.ArrayList<java.lang.Object>();
    java.util.ArrayList<java.util.Random> arraylist_random43 = new java.util.ArrayList<java.util.Random>();
    java.util.Random[] random_array44 = new java.util.Random[] {  };
    boolean b45 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)arraylist_random43, random_array44);
    java.util.Collections.rotate((java.util.List<java.util.Random>)arraylist_random43, (int)(short)0);
    java.lang.Object[] obj_array57 = new java.lang.Object[] { 10.0f, ' ', 0L, arraylist_random43, (short)1, 100L, (short)0, (-1.0f), (-1L), 1.0f, 100.0f, (short)1, (-1.0f) };
    boolean b58 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>)arraylist_obj39, obj_array57);
    boolean b59 = arraylist_str35.retainAll((java.util.Collection<java.lang.Object>)arraylist_obj39);
    java.util.Collection<java.lang.String> collection_str60 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str35);
    java.util.stream.Stream<java.lang.String> stream_str61 = arraylist_str35.stream();
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str62 = new java.util.LinkedHashSet<java.lang.String>();
    java.lang.String[] str_array64 = new java.lang.String[] { "hi!" };
    boolean b65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str62, str_array64);
    java.util.ArrayList<java.util.Collections> arraylist_collections66 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array67 = new java.util.Collections[] {  };
    boolean b68 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections66, collections_array67);
    java.util.Collections collections69 = null;
    java.util.Comparator<java.lang.Object> comparator_obj70 = null;
    int i71 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections66, collections69, comparator_obj70);
    boolean b72 = linkedhashset_str62.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections66);
    java.util.Collections collections73 = null;
    java.util.Collections.fill((java.util.List<java.util.Collections>)arraylist_collections66, collections73);
    java.util.Collections collections75 = null;
    java.util.Comparator<java.lang.Object> comparator_obj76 = null;
    java.util.Comparator<java.lang.Object> comparator_obj77 = java.util.Collections.reverseOrder(comparator_obj76);
    int i78 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections66, collections75, comparator_obj77);
    java.util.Comparator<java.lang.Object> comparator_obj79 = java.util.Collections.reverseOrder(comparator_obj77);
    int i80 = java.util.Collections.frequency((java.util.Collection<java.lang.String>)arraylist_str35, (java.lang.Object)comparator_obj77);
    int i81 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections26, collections34, comparator_obj77);
    int i82 = java.util.Collections.binarySearch(list_collections20, collections21, comparator_obj77);
    boolean b83 = treeset_str1.removeAll((java.util.Collection<java.util.Collections>)list_collections20);
    java.util.Collections collections84 = null;
    java.util.Collections.fill(list_collections20, collections84);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array13);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_collections20);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array24);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array27);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array37);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random_array44);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array57);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str60);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str61);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array64);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array67);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj77);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj79);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test236"); }


    java.util.LinkedHashSet<java.lang.Integer> linkedhashset_i0 = new java.util.LinkedHashSet<java.lang.Integer>();
    java.lang.Integer[] i_array6 = new java.lang.Integer[] { 1, (-1), 100, 1, 100 };
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)linkedhashset_i0, i_array6);
    java.util.Set<java.lang.Integer> set_i8 = java.util.Collections.synchronizedSet((java.util.Set<java.lang.Integer>)linkedhashset_i0);
    java.util.Set<java.lang.Integer> set_i9 = java.util.Collections.synchronizedSet((java.util.Set<java.lang.Integer>)linkedhashset_i0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_i8);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_i9);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test237"); }


    java.util.Map<java.lang.String,java.lang.String> map_str_str0 = java.util.Collections.emptyMap();
    java.util.Map<java.lang.String,java.lang.String> map_str_str1 = java.util.Collections.synchronizedMap(map_str_str0);
    java.util.Map<java.lang.String,java.lang.String> map_str_str2 = java.util.Collections.synchronizedMap(map_str_str0);
    java.util.Map<java.lang.String,java.lang.String> map_str_str3 = java.util.Collections.synchronizedMap(map_str_str0);
    java.util.Map<java.lang.String,java.lang.String> map_str_str4 = java.util.Collections.synchronizedMap(map_str_str3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str1);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str4);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test238"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str9 = treeset_str0.headSet("", false);
    java.util.NavigableSet<java.lang.String> navigableset_str12 = treeset_str0.headSet("hi!", false);
    java.lang.String str13 = treeset_str0.toString();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test239"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str9 = treeset_str0.headSet("", false);
    int i11 = java.util.Collections.frequency((java.util.Collection<java.lang.String>)treeset_str0, (java.lang.Object)' ');
    java.util.TreeSet<java.lang.String> treeset_str12 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.Spliterator<java.lang.String> spliterator_str13 = treeset_str12.spliterator();
    java.util.TreeSet<java.lang.String> treeset_str14 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array17 = new java.lang.String[] { "", "" };
    boolean b18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str14, str_array17);
    java.util.Iterator<java.lang.String> iterator_str19 = treeset_str14.iterator();
    java.lang.String str21 = treeset_str14.higher("hi!");
    java.lang.String str22 = treeset_str14.pollFirst();
    java.util.Iterator<java.lang.String> iterator_str23 = treeset_str14.iterator();
    java.util.NavigableSet<java.lang.String> navigableset_str26 = treeset_str14.headSet("hi!", true);
    java.util.TreeSet<java.lang.String> treeset_str27 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)navigableset_str26);
    java.util.TreeSet<java.lang.String> treeset_str28 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array31 = new java.lang.String[] { "", "" };
    boolean b32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str28, str_array31);
    java.util.Iterator<java.lang.String> iterator_str33 = treeset_str28.iterator();
    java.lang.String str35 = treeset_str28.higher("hi!");
    java.lang.String str36 = treeset_str28.pollFirst();
    int i37 = treeset_str28.size();
    java.util.stream.Stream<java.lang.String> stream_str38 = treeset_str28.stream();
    java.util.NavigableSet<java.lang.String> navigableset_str41 = treeset_str28.tailSet("hi!", true);
    java.lang.Long[] long_array47 = new java.lang.Long[] { 1L, 1L, 100L, 0L, (-1L) };
    java.lang.Long[] long_array48 = treeset_str28.toArray(long_array47);
    java.lang.Long[] long_array49 = treeset_str27.toArray(long_array47);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Long[] long_array50 = treeset_str12.toArray(long_array47);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException");
    } catch (java.lang.ArrayStoreException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayStoreException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str13);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str19);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str23);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str26);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array31);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str33);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str35);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + ""+ "'", str36.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str38);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str41);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array47);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array48);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array49);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test240"); }


    java.util.TreeSet<java.lang.Integer> treeset_i0 = new java.util.TreeSet<java.lang.Integer>();
    java.lang.Integer[] i_array2 = new java.lang.Integer[] { (-1) };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)treeset_i0, i_array2);
    java.util.SortedSet<java.lang.Integer> sortedset_i4 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.Integer>)treeset_i0);
    java.util.SortedSet<java.lang.Integer> sortedset_i5 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.Integer>)treeset_i0);
    java.util.SortedSet<java.lang.Integer> sortedset_i6 = java.util.Collections.synchronizedSortedSet(sortedset_i5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_i4);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_i5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_i6);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test241"); }


    java.util.Comparator<java.lang.Object> comparator_obj0 = null;
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>(comparator_obj0);
    java.lang.String str3 = treeset_str1.higher("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str6 = treeset_str1.headSet("hi!", false);
    java.util.TreeSet<java.lang.String> treeset_str7 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array10 = new java.lang.String[] { "", "" };
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str7, str_array10);
    java.util.Iterator<java.lang.String> iterator_str12 = treeset_str7.iterator();
    java.lang.String str14 = treeset_str7.higher("hi!");
    java.lang.String str15 = treeset_str7.pollFirst();
    java.lang.String str17 = treeset_str7.lower("");
    boolean b18 = treeset_str1.addAll((java.util.Collection<java.lang.String>)treeset_str7);
    java.util.Iterator<java.lang.String> iterator_str19 = treeset_str7.iterator();
    int i20 = treeset_str7.size();
    java.util.ArrayList<java.lang.Boolean> arraylist_b21 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array24 = new java.lang.Boolean[] { true, false };
    boolean b25 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b21, b_array24);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b21);
    boolean b27 = treeset_str7.containsAll((java.util.Collection<java.lang.Boolean>)arraylist_b21);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str19);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array24);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test242"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.lang.String str7 = treeset_str0.higher("hi!");
    java.lang.String str8 = treeset_str0.pollFirst();
    java.util.Iterator<java.lang.String> iterator_str9 = treeset_str0.descendingIterator();
    boolean b11 = treeset_str0.remove((java.lang.Object)' ');
    java.util.Spliterator<java.lang.String> spliterator_str12 = treeset_str0.spliterator();
    java.util.SortedSet<java.lang.String> sortedset_str14 = treeset_str0.headSet("[]");
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = treeset_str0.last();
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.util.NoSuchElementException")) {
        org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str14);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test243"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "hi!" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.descendingIterator();
    java.util.NavigableSet<java.lang.String> navigableset_str10 = treeset_str0.subSet("", true, "hi!", true);
    java.lang.String str12 = treeset_str0.floor("[]");
    java.util.TreeSet<java.lang.String> treeset_str13 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str10);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test244"); }


    java.util.Comparator<java.lang.Object> comparator_obj0 = null;
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>(comparator_obj0);
    java.lang.String str3 = treeset_str1.higher("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str6 = treeset_str1.headSet("hi!", false);
    java.util.TreeSet<java.lang.String> treeset_str7 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array10 = new java.lang.String[] { "", "" };
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str7, str_array10);
    java.util.Iterator<java.lang.String> iterator_str12 = treeset_str7.iterator();
    java.lang.String str14 = treeset_str7.higher("hi!");
    java.lang.String str15 = treeset_str7.pollFirst();
    java.lang.String str17 = treeset_str7.lower("");
    boolean b18 = treeset_str1.addAll((java.util.Collection<java.lang.String>)treeset_str7);
    java.util.Iterator<java.lang.String> iterator_str19 = treeset_str7.iterator();
    java.util.Iterator<java.lang.String> iterator_str20 = treeset_str7.descendingIterator();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str19);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str20);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test245"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array2);
    java.util.ArrayList<java.lang.Object> arraylist_obj4 = new java.util.ArrayList<java.lang.Object>();
    java.util.ArrayList<java.util.Random> arraylist_random8 = new java.util.ArrayList<java.util.Random>();
    java.util.Random[] random_array9 = new java.util.Random[] {  };
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)arraylist_random8, random_array9);
    java.util.Collections.rotate((java.util.List<java.util.Random>)arraylist_random8, (int)(short)0);
    java.lang.Object[] obj_array22 = new java.lang.Object[] { 10.0f, ' ', 0L, arraylist_random8, (short)1, 100L, (short)0, (-1.0f), (-1L), 1.0f, 100.0f, (short)1, (-1.0f) };
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>)arraylist_obj4, obj_array22);
    boolean b24 = arraylist_str0.retainAll((java.util.Collection<java.lang.Object>)arraylist_obj4);
    java.util.ArrayList<java.lang.Object[]> arraylist_obj_array25 = new java.util.ArrayList<java.lang.Object[]>();
    java.lang.Object[][] obj_array_array26 = new java.lang.Object[][] {  };
    boolean b27 = java.util.Collections.addAll((java.util.Collection<java.lang.Object[]>)arraylist_obj_array25, obj_array_array26);
    java.util.Collections.copy((java.util.List<java.lang.Object>)arraylist_obj4, (java.util.List<java.lang.Object[]>)arraylist_obj_array25);
    java.util.ArrayList<java.lang.Integer> arraylist_i29 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array31 = new java.lang.Integer[] { (-1) };
    boolean b32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i29, i_array31);
    java.util.ArrayList<java.lang.Integer> arraylist_i33 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array35 = new java.lang.Integer[] { 0 };
    boolean b36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i33, i_array35);
    java.util.ArrayList<java.lang.Integer> arraylist_i37 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array39 = new java.lang.Integer[] { 1 };
    boolean b40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i37, i_array39);
    int i41 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i33, (java.util.List<java.lang.Integer>)arraylist_i37);
    int i42 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i29, (java.util.List<java.lang.Integer>)arraylist_i33);
    int i43 = java.util.Collections.lastIndexOfSubList((java.util.List<java.lang.Object>)arraylist_obj4, (java.util.List<java.lang.Integer>)arraylist_i33);
    java.util.ArrayList<java.lang.Integer> arraylist_i44 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array46 = new java.lang.Integer[] { 0 };
    boolean b47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i44, i_array46);
    java.util.ArrayList<java.lang.Integer> arraylist_i48 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array50 = new java.lang.Integer[] { 1 };
    boolean b51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i48, i_array50);
    int i52 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i44, (java.util.List<java.lang.Integer>)arraylist_i48);
    java.lang.Integer i53 = java.util.Collections.min((java.util.Collection<java.lang.Integer>)arraylist_i48);
    java.util.ArrayList<java.lang.Integer> arraylist_i54 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array56 = new java.lang.Integer[] { 0 };
    boolean b57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i54, i_array56);
    java.util.ArrayList<java.lang.Integer> arraylist_i58 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array60 = new java.lang.Integer[] { 1 };
    boolean b61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i58, i_array60);
    int i62 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i54, (java.util.List<java.lang.Integer>)arraylist_i58);
    int i64 = java.util.Collections.binarySearch((java.util.List<java.lang.Integer>)arraylist_i58, (java.lang.Integer)100);
    int i65 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i48, (java.util.List<java.lang.Integer>)arraylist_i58);
    int i67 = java.util.Collections.binarySearch((java.util.List<java.lang.Integer>)arraylist_i48, (java.lang.Integer)10);
    int i68 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i33, (java.util.List<java.lang.Integer>)arraylist_i48);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random_array9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array26);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array50);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + 1+ "'", i53.equals(1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array56);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == (-2));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == (-2));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == (-1));

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test246"); }


    java.util.ArrayList<java.util.Collections> arraylist_collections0 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array1 = new java.util.Collections[] {  };
    boolean b2 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections0, collections_array1);
    java.util.Collections collections3 = null;
    java.util.Collections.fill((java.util.List<java.util.Collections>)arraylist_collections0, collections3);
    java.util.Collections collections5 = null;
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    int i7 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections0, collections5, comparator_obj6);
    java.util.Collections.reverse((java.util.List<java.util.Collections>)arraylist_collections0);
    java.util.Collections collections9 = null;
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str10 = new java.util.LinkedHashSet<java.lang.String>();
    java.lang.String[] str_array12 = new java.lang.String[] { "hi!" };
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str10, str_array12);
    java.util.ArrayList<java.util.Collections> arraylist_collections14 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array15 = new java.util.Collections[] {  };
    boolean b16 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections14, collections_array15);
    java.util.Collections collections17 = null;
    java.util.Comparator<java.lang.Object> comparator_obj18 = null;
    int i19 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections14, collections17, comparator_obj18);
    boolean b20 = linkedhashset_str10.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections14);
    java.util.Collections collections21 = null;
    java.util.Collections.fill((java.util.List<java.util.Collections>)arraylist_collections14, collections21);
    java.util.Collections collections23 = null;
    java.util.Comparator<java.lang.Object> comparator_obj24 = null;
    java.util.Comparator<java.lang.Object> comparator_obj25 = java.util.Collections.reverseOrder(comparator_obj24);
    int i26 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections14, collections23, comparator_obj25);
    java.util.Comparator<java.lang.Object> comparator_obj27 = java.util.Collections.reverseOrder(comparator_obj25);
    java.util.Comparator<java.lang.Object> comparator_obj28 = java.util.Collections.reverseOrder(comparator_obj25);
    java.util.Comparator<java.lang.Object> comparator_obj29 = java.util.Collections.reverseOrder(comparator_obj25);
    int i30 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections0, collections9, comparator_obj25);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array1);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array15);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj25);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj27);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj28);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj29);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == (-1));

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test247"); }


    java.util.List<java.lang.String> list_str2 = java.util.Collections.nCopies(0, "hi!");
    java.util.List<java.lang.String> list_str3 = java.util.Collections.synchronizedList(list_str2);
    java.util.ArrayList<java.util.Collections> arraylist_collections4 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array5 = new java.util.Collections[] {  };
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections4, collections_array5);
    java.util.Collections collections7 = null;
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    int i9 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections4, collections7, comparator_obj8);
    java.util.List<java.util.Collections> list_collections10 = java.util.Collections.unmodifiableList((java.util.List<java.util.Collections>)arraylist_collections4);
    java.util.Collections.reverse(list_collections10);
    java.util.Collections collections12 = null;
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str13 = new java.util.LinkedHashSet<java.lang.String>();
    java.lang.String[] str_array15 = new java.lang.String[] { "hi!" };
    boolean b16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str13, str_array15);
    java.util.ArrayList<java.util.Collections> arraylist_collections17 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array18 = new java.util.Collections[] {  };
    boolean b19 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections17, collections_array18);
    java.util.Collections collections20 = null;
    java.util.Comparator<java.lang.Object> comparator_obj21 = null;
    int i22 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections17, collections20, comparator_obj21);
    boolean b23 = linkedhashset_str13.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections17);
    java.util.Collections collections24 = null;
    java.util.Collections.fill((java.util.List<java.util.Collections>)arraylist_collections17, collections24);
    java.util.Collections collections26 = null;
    java.util.Comparator<java.lang.Object> comparator_obj27 = null;
    java.util.Comparator<java.lang.Object> comparator_obj28 = java.util.Collections.reverseOrder(comparator_obj27);
    int i29 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections17, collections26, comparator_obj28);
    java.util.Comparator<java.lang.Object> comparator_obj30 = java.util.Collections.reverseOrder(comparator_obj28);
    int i31 = java.util.Collections.binarySearch(list_collections10, collections12, comparator_obj28);
    int i32 = java.util.Collections.frequency((java.util.Collection<java.lang.String>)list_str3, (java.lang.Object)collections12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_collections10);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array18);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj28);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj30);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test248"); }


    java.util.Comparator<java.lang.Object> comparator_obj0 = null;
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>(comparator_obj0);
    java.lang.String str3 = treeset_str1.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str5 = treeset_str1.headSet("");
    java.util.TreeSet<java.lang.String> treeset_str6 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str1);
    java.util.NavigableSet<java.lang.String> navigableset_str9 = treeset_str6.tailSet("hi!", true);
    java.util.SortedSet<java.lang.String> sortedset_str12 = treeset_str6.subSet("", "");

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str12);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test249"); }


    java.util.ArrayList<java.lang.Integer> arraylist_i0 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array2 = new java.lang.Integer[] { 0 };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i0, i_array2);
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array6 = new java.lang.Integer[] { 1 };
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array6);
    int i8 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i0, (java.util.List<java.lang.Integer>)arraylist_i4);
    java.lang.Integer i9 = java.util.Collections.min((java.util.Collection<java.lang.Integer>)arraylist_i4);
    java.util.ArrayList<java.lang.Integer> arraylist_i10 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array12 = new java.lang.Integer[] { 0 };
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i10, i_array12);
    java.util.ArrayList<java.lang.Integer> arraylist_i14 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array16 = new java.lang.Integer[] { 1 };
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i14, i_array16);
    int i18 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i10, (java.util.List<java.lang.Integer>)arraylist_i14);
    int i20 = java.util.Collections.binarySearch((java.util.List<java.lang.Integer>)arraylist_i14, (java.lang.Integer)100);
    int i21 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i4, (java.util.List<java.lang.Integer>)arraylist_i14);
    int i23 = java.util.Collections.binarySearch((java.util.List<java.lang.Integer>)arraylist_i4, (java.lang.Integer)(-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 1+ "'", i9.equals(1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == (-2));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == (-1));

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test250"); }


    java.util.Comparator<java.lang.Object> comparator_obj0 = null;
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>(comparator_obj0);
    java.lang.String str3 = treeset_str1.higher("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str6 = treeset_str1.headSet("hi!", false);
    java.util.TreeSet<java.lang.String> treeset_str7 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array10 = new java.lang.String[] { "", "" };
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str7, str_array10);
    java.util.Iterator<java.lang.String> iterator_str12 = treeset_str7.iterator();
    java.lang.String str14 = treeset_str7.higher("hi!");
    java.lang.String str15 = treeset_str7.pollFirst();
    java.lang.String str17 = treeset_str7.lower("");
    boolean b18 = treeset_str1.addAll((java.util.Collection<java.lang.String>)treeset_str7);
    java.util.Iterator<java.lang.String> iterator_str19 = treeset_str7.iterator();
    int i20 = treeset_str7.size();
    treeset_str7.clear();
    java.util.TreeSet<java.lang.String> treeset_str22 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array25 = new java.lang.String[] { "", "" };
    boolean b26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str22, str_array25);
    java.util.SortedSet<java.lang.String> sortedset_str28 = treeset_str22.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str31 = treeset_str22.headSet("", false);
    int i33 = java.util.Collections.frequency((java.util.Collection<java.lang.String>)treeset_str22, (java.lang.Object)' ');
    java.util.TreeSet<java.lang.String> treeset_str34 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str22);
    boolean b35 = treeset_str7.equals((java.lang.Object)treeset_str22);
    java.util.ArrayList<java.lang.String> arraylist_str36 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array38 = new java.lang.String[] { "" };
    boolean b39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str36, str_array38);
    java.util.ArrayList<java.lang.Object> arraylist_obj40 = new java.util.ArrayList<java.lang.Object>();
    java.util.ArrayList<java.util.Random> arraylist_random44 = new java.util.ArrayList<java.util.Random>();
    java.util.Random[] random_array45 = new java.util.Random[] {  };
    boolean b46 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)arraylist_random44, random_array45);
    java.util.Collections.rotate((java.util.List<java.util.Random>)arraylist_random44, (int)(short)0);
    java.lang.Object[] obj_array58 = new java.lang.Object[] { 10.0f, ' ', 0L, arraylist_random44, (short)1, 100L, (short)0, (-1.0f), (-1L), 1.0f, 100.0f, (short)1, (-1.0f) };
    boolean b59 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>)arraylist_obj40, obj_array58);
    boolean b60 = arraylist_str36.retainAll((java.util.Collection<java.lang.Object>)arraylist_obj40);
    boolean b61 = treeset_str22.retainAll((java.util.Collection<java.lang.Object>)arraylist_obj40);
    java.util.stream.Stream<java.lang.String> stream_str62 = treeset_str22.stream();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str19);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str28);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str31);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array38);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random_array45);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array58);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str62);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test251"); }


    java.util.Comparator<java.lang.Object> comparator_obj0 = null;
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>(comparator_obj0);
    java.lang.String str3 = treeset_str1.higher("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str6 = treeset_str1.headSet("hi!", false);
    java.util.TreeSet<java.lang.String> treeset_str7 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array10 = new java.lang.String[] { "", "" };
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str7, str_array10);
    java.util.Iterator<java.lang.String> iterator_str12 = treeset_str7.iterator();
    java.lang.String str14 = treeset_str7.higher("hi!");
    java.lang.String str15 = treeset_str7.pollFirst();
    java.lang.String str17 = treeset_str7.lower("");
    boolean b18 = treeset_str1.addAll((java.util.Collection<java.lang.String>)treeset_str7);
    java.util.Iterator<java.lang.String> iterator_str19 = treeset_str7.iterator();
    int i20 = treeset_str7.size();
    treeset_str7.clear();
    java.util.TreeSet<java.lang.String> treeset_str22 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array25 = new java.lang.String[] { "", "" };
    boolean b26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str22, str_array25);
    java.util.SortedSet<java.lang.String> sortedset_str28 = treeset_str22.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str31 = treeset_str22.headSet("", false);
    int i33 = java.util.Collections.frequency((java.util.Collection<java.lang.String>)treeset_str22, (java.lang.Object)' ');
    java.util.TreeSet<java.lang.String> treeset_str34 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str22);
    boolean b35 = treeset_str7.equals((java.lang.Object)treeset_str22);
    java.util.ArrayList<java.lang.String> arraylist_str36 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array38 = new java.lang.String[] { "" };
    boolean b39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str36, str_array38);
    java.util.ArrayList<java.lang.Object> arraylist_obj40 = new java.util.ArrayList<java.lang.Object>();
    java.util.ArrayList<java.util.Random> arraylist_random44 = new java.util.ArrayList<java.util.Random>();
    java.util.Random[] random_array45 = new java.util.Random[] {  };
    boolean b46 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)arraylist_random44, random_array45);
    java.util.Collections.rotate((java.util.List<java.util.Random>)arraylist_random44, (int)(short)0);
    java.lang.Object[] obj_array58 = new java.lang.Object[] { 10.0f, ' ', 0L, arraylist_random44, (short)1, 100L, (short)0, (-1.0f), (-1L), 1.0f, 100.0f, (short)1, (-1.0f) };
    boolean b59 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>)arraylist_obj40, obj_array58);
    boolean b60 = arraylist_str36.retainAll((java.util.Collection<java.lang.Object>)arraylist_obj40);
    boolean b61 = treeset_str22.retainAll((java.util.Collection<java.lang.Object>)arraylist_obj40);
    java.lang.Boolean[] b_array62 = new java.lang.Boolean[] {  };
    boolean b63 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>)arraylist_obj40, b_array62);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str19);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str28);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str31);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array38);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random_array45);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array58);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array62);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test252"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "hi!" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    boolean b5 = treeset_str0.isEmpty();
    java.util.NavigableSet<java.lang.String> navigableset_str8 = treeset_str0.tailSet("[]", true);
    // The following exception was thrown during execution in test generation
    try {
    java.util.SortedSet<java.lang.String> sortedset_str11 = treeset_str0.subSet("[]", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str8);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test253"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.lang.String str7 = treeset_str0.higher("hi!");
    java.lang.String str8 = treeset_str0.pollFirst();
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    java.util.TreeSet<java.lang.String> treeset_str10 = new java.util.TreeSet<java.lang.String>(comparator_obj9);
    java.lang.String str12 = treeset_str10.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str14 = treeset_str10.headSet("");
    boolean b15 = treeset_str0.addAll((java.util.Collection<java.lang.String>)treeset_str10);
    java.lang.String str16 = treeset_str10.pollLast();
    boolean b18 = treeset_str10.add("[hi!]");

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str14);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test254"); }


    java.util.ArrayList<java.lang.Integer> arraylist_i0 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array2 = new java.lang.Integer[] { 0 };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i0, i_array2);
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array6 = new java.lang.Integer[] { 1 };
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array6);
    int i8 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i0, (java.util.List<java.lang.Integer>)arraylist_i4);
    java.util.ArrayList<java.lang.Integer> arraylist_i9 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array11 = new java.lang.Integer[] { (-1) };
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i9, i_array11);
    java.util.ArrayList<java.lang.Integer> arraylist_i13 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array15 = new java.lang.Integer[] { 0 };
    boolean b16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i13, i_array15);
    java.util.ArrayList<java.lang.Integer> arraylist_i17 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array19 = new java.lang.Integer[] { 1 };
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i17, i_array19);
    int i21 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i13, (java.util.List<java.lang.Integer>)arraylist_i17);
    int i22 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i9, (java.util.List<java.lang.Integer>)arraylist_i13);
    int i23 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i4, (java.util.List<java.lang.Integer>)arraylist_i9);
    java.util.ArrayList<java.lang.Integer> arraylist_i24 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array26 = new java.lang.Integer[] { (-1) };
    boolean b27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i24, i_array26);
    java.util.ArrayList<java.lang.Boolean> arraylist_b28 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array30 = new java.lang.Boolean[] { false };
    boolean b31 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b28, b_array30);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b28);
    boolean b33 = java.util.Collections.disjoint((java.util.Collection<java.lang.Integer>)arraylist_i24, (java.util.Collection<java.lang.Boolean>)arraylist_b28);
    boolean b34 = java.util.Collections.disjoint((java.util.Collection<java.lang.Integer>)arraylist_i4, (java.util.Collection<java.lang.Boolean>)arraylist_b28);
    java.util.ArrayList<java.lang.Integer> arraylist_i35 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array37 = new java.lang.Integer[] { 0 };
    boolean b38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i35, i_array37);
    java.util.ArrayList<java.lang.Integer> arraylist_i39 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array41 = new java.lang.Integer[] { 1 };
    boolean b42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i39, i_array41);
    int i43 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i35, (java.util.List<java.lang.Integer>)arraylist_i39);
    java.util.ArrayList<java.lang.Integer> arraylist_i44 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array46 = new java.lang.Integer[] { (-1) };
    boolean b47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i44, i_array46);
    java.util.ArrayList<java.lang.Integer> arraylist_i48 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array50 = new java.lang.Integer[] { 0 };
    boolean b51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i48, i_array50);
    java.util.ArrayList<java.lang.Integer> arraylist_i52 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array54 = new java.lang.Integer[] { 1 };
    boolean b55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i52, i_array54);
    int i56 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i48, (java.util.List<java.lang.Integer>)arraylist_i52);
    int i57 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i44, (java.util.List<java.lang.Integer>)arraylist_i48);
    int i58 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i39, (java.util.List<java.lang.Integer>)arraylist_i44);
    int i59 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i4, (java.util.List<java.lang.Integer>)arraylist_i39);
    // The following exception was thrown during execution in test generation
    try {
    java.util.Collections.swap((java.util.List<java.lang.Integer>)arraylist_i39, (int)' ', 0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array26);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array30);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array50);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array54);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test255"); }


    java.util.LinkedHashSet<java.lang.String> linkedhashset_str0 = new java.util.LinkedHashSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "hi!" };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str0, str_array2);
    java.util.ArrayList<java.util.Collections> arraylist_collections4 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array5 = new java.util.Collections[] {  };
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections4, collections_array5);
    java.util.Collections collections7 = null;
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    int i9 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections4, collections7, comparator_obj8);
    boolean b10 = linkedhashset_str0.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections4);
    java.util.Collections.reverse((java.util.List<java.util.Collections>)arraylist_collections4);
    java.util.List<java.util.Collections> list_collections12 = java.util.Collections.unmodifiableList((java.util.List<java.util.Collections>)arraylist_collections4);
    java.util.Collections collections13 = null;
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str14 = new java.util.LinkedHashSet<java.lang.String>();
    java.lang.String[] str_array16 = new java.lang.String[] { "hi!" };
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str14, str_array16);
    java.util.ArrayList<java.util.Collections> arraylist_collections18 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array19 = new java.util.Collections[] {  };
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections18, collections_array19);
    java.util.Collections collections21 = null;
    java.util.Comparator<java.lang.Object> comparator_obj22 = null;
    int i23 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections18, collections21, comparator_obj22);
    boolean b24 = linkedhashset_str14.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections18);
    java.util.Collections.reverse((java.util.List<java.util.Collections>)arraylist_collections18);
    java.util.Collections collections26 = null;
    java.util.ArrayList<java.lang.String> arraylist_str27 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array29 = new java.lang.String[] { "" };
    boolean b30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str27, str_array29);
    java.util.ArrayList<java.lang.Object> arraylist_obj31 = new java.util.ArrayList<java.lang.Object>();
    java.util.ArrayList<java.util.Random> arraylist_random35 = new java.util.ArrayList<java.util.Random>();
    java.util.Random[] random_array36 = new java.util.Random[] {  };
    boolean b37 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)arraylist_random35, random_array36);
    java.util.Collections.rotate((java.util.List<java.util.Random>)arraylist_random35, (int)(short)0);
    java.lang.Object[] obj_array49 = new java.lang.Object[] { 10.0f, ' ', 0L, arraylist_random35, (short)1, 100L, (short)0, (-1.0f), (-1L), 1.0f, 100.0f, (short)1, (-1.0f) };
    boolean b50 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>)arraylist_obj31, obj_array49);
    boolean b51 = arraylist_str27.retainAll((java.util.Collection<java.lang.Object>)arraylist_obj31);
    java.util.Collection<java.lang.String> collection_str52 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str27);
    java.util.stream.Stream<java.lang.String> stream_str53 = arraylist_str27.stream();
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str54 = new java.util.LinkedHashSet<java.lang.String>();
    java.lang.String[] str_array56 = new java.lang.String[] { "hi!" };
    boolean b57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str54, str_array56);
    java.util.ArrayList<java.util.Collections> arraylist_collections58 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array59 = new java.util.Collections[] {  };
    boolean b60 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections58, collections_array59);
    java.util.Collections collections61 = null;
    java.util.Comparator<java.lang.Object> comparator_obj62 = null;
    int i63 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections58, collections61, comparator_obj62);
    boolean b64 = linkedhashset_str54.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections58);
    java.util.Collections collections65 = null;
    java.util.Collections.fill((java.util.List<java.util.Collections>)arraylist_collections58, collections65);
    java.util.Collections collections67 = null;
    java.util.Comparator<java.lang.Object> comparator_obj68 = null;
    java.util.Comparator<java.lang.Object> comparator_obj69 = java.util.Collections.reverseOrder(comparator_obj68);
    int i70 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections58, collections67, comparator_obj69);
    java.util.Comparator<java.lang.Object> comparator_obj71 = java.util.Collections.reverseOrder(comparator_obj69);
    int i72 = java.util.Collections.frequency((java.util.Collection<java.lang.String>)arraylist_str27, (java.lang.Object)comparator_obj69);
    int i73 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections18, collections26, comparator_obj69);
    int i74 = java.util.Collections.binarySearch(list_collections12, collections13, comparator_obj69);
    java.util.TreeSet<java.lang.String> treeset_str75 = new java.util.TreeSet<java.lang.String>(comparator_obj69);
    java.util.TreeSet<java.lang.String> treeset_str76 = new java.util.TreeSet<java.lang.String>(comparator_obj69);
    java.util.NavigableSet<java.lang.String> navigableset_str79 = treeset_str76.tailSet("[]", false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_collections12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array19);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array29);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random_array36);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array49);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str52);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str53);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array56);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array59);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj69);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj71);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str79);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test256"); }


    java.util.TreeSet<java.util.Random> treeset_random0 = new java.util.TreeSet<java.util.Random>();
    java.util.Random[] random_array1 = new java.util.Random[] {  };
    boolean b2 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)treeset_random0, random_array1);
    java.util.SortedSet<java.util.Random> sortedset_random3 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.util.Random>)treeset_random0);
    java.util.Enumeration<java.util.Random> enumeration_random4 = java.util.Collections.enumeration((java.util.Collection<java.util.Random>)treeset_random0);
    java.lang.Class<java.util.Random> cls5 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.NavigableSet<java.util.Random> navigableset_random6 = java.util.Collections.checkedNavigableSet((java.util.NavigableSet<java.util.Random>)treeset_random0, cls5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random_array1);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_random3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration_random4);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test257"); }


    java.util.ArrayDeque<java.lang.String> arraydeque_str0 = new java.util.ArrayDeque<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "[]", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraydeque_str0, str_array3);
    java.util.Queue<java.lang.String> queue_str5 = java.util.Collections.asLifoQueue((java.util.Deque<java.lang.String>)arraydeque_str0);
    java.util.Queue<java.lang.String> queue_str6 = java.util.Collections.asLifoQueue((java.util.Deque<java.lang.String>)arraydeque_str0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(queue_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(queue_str6);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test258"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str7 = treeset_str0.descendingSet();
    java.lang.String str9 = treeset_str0.floor("hi!");
    java.lang.String str10 = treeset_str0.pollFirst();
    java.lang.String str12 = treeset_str0.ceiling("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str14 = treeset_str0.headSet("");

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str14);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test259"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str9 = treeset_str0.headSet("", false);
    boolean b11 = treeset_str0.add("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str12 = treeset_str0.descendingSet();
    java.lang.String str13 = treeset_str0.first();
    boolean b15 = treeset_str0.add("[hi!]");

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test260"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str9 = treeset_str0.headSet("", false);
    boolean b11 = treeset_str0.add("hi!");
    java.lang.String str12 = treeset_str0.first();
    java.util.Comparator<?> comparator_obj13 = treeset_str0.comparator();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_obj13);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test261"); }


    java.util.List<java.lang.String> list_str2 = java.util.Collections.nCopies(0, "hi!");
    java.util.Collections.shuffle(list_str2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test262"); }


    java.util.ArrayList<java.lang.Integer> arraylist_i0 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array2 = new java.lang.Integer[] { 0 };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i0, i_array2);
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array6 = new java.lang.Integer[] { 1 };
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array6);
    int i8 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i0, (java.util.List<java.lang.Integer>)arraylist_i4);
    java.util.ArrayList<java.lang.Integer> arraylist_i9 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array11 = new java.lang.Integer[] { (-1) };
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i9, i_array11);
    java.util.ArrayList<java.lang.Integer> arraylist_i13 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array15 = new java.lang.Integer[] { 0 };
    boolean b16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i13, i_array15);
    java.util.ArrayList<java.lang.Integer> arraylist_i17 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array19 = new java.lang.Integer[] { 1 };
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i17, i_array19);
    int i21 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i13, (java.util.List<java.lang.Integer>)arraylist_i17);
    int i22 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i9, (java.util.List<java.lang.Integer>)arraylist_i13);
    int i23 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i4, (java.util.List<java.lang.Integer>)arraylist_i9);
    // The following exception was thrown during execution in test generation
    try {
    java.util.Collections.swap((java.util.List<java.lang.Integer>)arraylist_i9, (-2), (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == (-1));

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test263"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array2);
    java.util.ArrayList<java.lang.Object> arraylist_obj4 = new java.util.ArrayList<java.lang.Object>();
    java.util.ArrayList<java.util.Random> arraylist_random8 = new java.util.ArrayList<java.util.Random>();
    java.util.Random[] random_array9 = new java.util.Random[] {  };
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)arraylist_random8, random_array9);
    java.util.Collections.rotate((java.util.List<java.util.Random>)arraylist_random8, (int)(short)0);
    java.lang.Object[] obj_array22 = new java.lang.Object[] { 10.0f, ' ', 0L, arraylist_random8, (short)1, 100L, (short)0, (-1.0f), (-1L), 1.0f, 100.0f, (short)1, (-1.0f) };
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>)arraylist_obj4, obj_array22);
    boolean b24 = arraylist_str0.retainAll((java.util.Collection<java.lang.Object>)arraylist_obj4);
    java.util.ArrayList<java.lang.String> arraylist_str25 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array27 = new java.lang.String[] { "" };
    boolean b28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str25, str_array27);
    java.util.ArrayList<java.lang.Object> arraylist_obj29 = new java.util.ArrayList<java.lang.Object>();
    java.util.ArrayList<java.util.Random> arraylist_random33 = new java.util.ArrayList<java.util.Random>();
    java.util.Random[] random_array34 = new java.util.Random[] {  };
    boolean b35 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)arraylist_random33, random_array34);
    java.util.Collections.rotate((java.util.List<java.util.Random>)arraylist_random33, (int)(short)0);
    java.lang.Object[] obj_array47 = new java.lang.Object[] { 10.0f, ' ', 0L, arraylist_random33, (short)1, 100L, (short)0, (-1.0f), (-1L), 1.0f, 100.0f, (short)1, (-1.0f) };
    boolean b48 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>)arraylist_obj29, obj_array47);
    boolean b49 = arraylist_str25.retainAll((java.util.Collection<java.lang.Object>)arraylist_obj29);
    java.util.ArrayList<java.lang.Object[]> arraylist_obj_array50 = new java.util.ArrayList<java.lang.Object[]>();
    java.lang.Object[][] obj_array_array51 = new java.lang.Object[][] {  };
    boolean b52 = java.util.Collections.addAll((java.util.Collection<java.lang.Object[]>)arraylist_obj_array50, obj_array_array51);
    java.util.Collections.copy((java.util.List<java.lang.Object>)arraylist_obj29, (java.util.List<java.lang.Object[]>)arraylist_obj_array50);
    java.util.ArrayList<java.lang.Integer> arraylist_i54 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array56 = new java.lang.Integer[] { (-1) };
    boolean b57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i54, i_array56);
    java.util.ArrayList<java.lang.Integer> arraylist_i58 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array60 = new java.lang.Integer[] { 0 };
    boolean b61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i58, i_array60);
    java.util.ArrayList<java.lang.Integer> arraylist_i62 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array64 = new java.lang.Integer[] { 1 };
    boolean b65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i62, i_array64);
    int i66 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i58, (java.util.List<java.lang.Integer>)arraylist_i62);
    int i67 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i54, (java.util.List<java.lang.Integer>)arraylist_i58);
    int i68 = java.util.Collections.lastIndexOfSubList((java.util.List<java.lang.Object>)arraylist_obj29, (java.util.List<java.lang.Integer>)arraylist_i54);
    boolean b69 = arraylist_str0.retainAll((java.util.Collection<java.lang.Object>)arraylist_obj29);
    java.util.TreeSet<java.lang.String> treeset_str70 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array73 = new java.lang.String[] { "", "" };
    boolean b74 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str70, str_array73);
    java.util.Iterator<java.lang.String> iterator_str75 = treeset_str70.iterator();
    java.lang.String str77 = treeset_str70.higher("hi!");
    java.lang.String str78 = treeset_str70.pollFirst();
    int i79 = treeset_str70.size();
    java.util.stream.Stream<java.lang.String> stream_str80 = treeset_str70.stream();
    java.util.NavigableSet<java.lang.String> navigableset_str83 = treeset_str70.tailSet("hi!", true);
    java.lang.Long[] long_array89 = new java.lang.Long[] { 1L, 1L, 100L, 0L, (-1L) };
    java.lang.Long[] long_array90 = treeset_str70.toArray(long_array89);
    java.lang.Long[] long_array91 = arraylist_str0.toArray(long_array89);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random_array9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array27);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random_array34);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array47);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array51);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array56);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array64);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array73);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str75);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str77);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str78 + "' != '" + ""+ "'", str78.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str80);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str83);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array89);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array90);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array91);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test264"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array2);
    java.util.ArrayList<java.lang.Object> arraylist_obj4 = new java.util.ArrayList<java.lang.Object>();
    java.util.ArrayList<java.util.Random> arraylist_random8 = new java.util.ArrayList<java.util.Random>();
    java.util.Random[] random_array9 = new java.util.Random[] {  };
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)arraylist_random8, random_array9);
    java.util.Collections.rotate((java.util.List<java.util.Random>)arraylist_random8, (int)(short)0);
    java.lang.Object[] obj_array22 = new java.lang.Object[] { 10.0f, ' ', 0L, arraylist_random8, (short)1, 100L, (short)0, (-1.0f), (-1L), 1.0f, 100.0f, (short)1, (-1.0f) };
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>)arraylist_obj4, obj_array22);
    boolean b24 = arraylist_str0.retainAll((java.util.Collection<java.lang.Object>)arraylist_obj4);
    java.util.ArrayList<java.lang.String> arraylist_str25 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array27 = new java.lang.String[] { "" };
    boolean b28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str25, str_array27);
    java.util.ArrayList<java.lang.Object> arraylist_obj29 = new java.util.ArrayList<java.lang.Object>();
    java.util.ArrayList<java.util.Random> arraylist_random33 = new java.util.ArrayList<java.util.Random>();
    java.util.Random[] random_array34 = new java.util.Random[] {  };
    boolean b35 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)arraylist_random33, random_array34);
    java.util.Collections.rotate((java.util.List<java.util.Random>)arraylist_random33, (int)(short)0);
    java.lang.Object[] obj_array47 = new java.lang.Object[] { 10.0f, ' ', 0L, arraylist_random33, (short)1, 100L, (short)0, (-1.0f), (-1L), 1.0f, 100.0f, (short)1, (-1.0f) };
    boolean b48 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>)arraylist_obj29, obj_array47);
    boolean b49 = arraylist_str25.retainAll((java.util.Collection<java.lang.Object>)arraylist_obj29);
    java.util.ArrayList<java.lang.Object[]> arraylist_obj_array50 = new java.util.ArrayList<java.lang.Object[]>();
    java.lang.Object[][] obj_array_array51 = new java.lang.Object[][] {  };
    boolean b52 = java.util.Collections.addAll((java.util.Collection<java.lang.Object[]>)arraylist_obj_array50, obj_array_array51);
    java.util.Collections.copy((java.util.List<java.lang.Object>)arraylist_obj29, (java.util.List<java.lang.Object[]>)arraylist_obj_array50);
    java.util.ArrayList<java.lang.Integer> arraylist_i54 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array56 = new java.lang.Integer[] { (-1) };
    boolean b57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i54, i_array56);
    java.util.ArrayList<java.lang.Integer> arraylist_i58 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array60 = new java.lang.Integer[] { 0 };
    boolean b61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i58, i_array60);
    java.util.ArrayList<java.lang.Integer> arraylist_i62 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array64 = new java.lang.Integer[] { 1 };
    boolean b65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i62, i_array64);
    int i66 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i58, (java.util.List<java.lang.Integer>)arraylist_i62);
    int i67 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i54, (java.util.List<java.lang.Integer>)arraylist_i58);
    int i68 = java.util.Collections.lastIndexOfSubList((java.util.List<java.lang.Object>)arraylist_obj29, (java.util.List<java.lang.Integer>)arraylist_i54);
    boolean b69 = arraylist_str0.retainAll((java.util.Collection<java.lang.Object>)arraylist_obj29);
    java.util.List<java.lang.String> list_str70 = java.util.Collections.synchronizedList((java.util.List<java.lang.String>)arraylist_str0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random_array9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array27);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random_array34);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array47);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array51);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array56);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array64);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str70);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test265"); }


    java.util.Comparator<java.lang.Object> comparator_obj0 = null;
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>(comparator_obj0);
    java.lang.String str3 = treeset_str1.higher("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str6 = treeset_str1.headSet("hi!", false);
    java.util.TreeSet<java.lang.String> treeset_str7 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array10 = new java.lang.String[] { "", "" };
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str7, str_array10);
    java.util.Iterator<java.lang.String> iterator_str12 = treeset_str7.iterator();
    java.lang.String str14 = treeset_str7.higher("hi!");
    java.lang.String str15 = treeset_str7.pollFirst();
    java.lang.String str17 = treeset_str7.lower("");
    boolean b18 = treeset_str1.addAll((java.util.Collection<java.lang.String>)treeset_str7);
    java.util.NavigableSet<java.lang.String> navigableset_str23 = treeset_str7.subSet("", false, "[hi!]", true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str23);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test266"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "hi!" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    boolean b5 = treeset_str0.isEmpty();
    java.util.NavigableSet<java.lang.String> navigableset_str8 = treeset_str0.tailSet("[]", true);
    // The following exception was thrown during execution in test generation
    try {
    java.util.NavigableSet<java.lang.String> navigableset_str13 = treeset_str0.subSet("hi!", true, "[hi!]", false);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str8);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test267"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str7 = treeset_str0.descendingSet();
    java.util.Spliterator<java.lang.String> spliterator_str8 = treeset_str0.spliterator();
    int i9 = treeset_str0.size();
    java.util.ArrayList<java.util.Collections> arraylist_collections10 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array11 = new java.util.Collections[] {  };
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections10, collections_array11);
    java.util.Collections collections13 = null;
    java.util.Comparator<java.lang.Object> comparator_obj14 = null;
    int i15 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections10, collections13, comparator_obj14);
    java.util.List<java.util.Collections> list_collections16 = java.util.Collections.unmodifiableList((java.util.List<java.util.Collections>)arraylist_collections10);
    boolean b17 = treeset_str0.removeAll((java.util.Collection<java.util.Collections>)list_collections16);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str8);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array11);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_collections16);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test268"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.lang.String str7 = treeset_str0.higher("hi!");
    java.lang.String str8 = treeset_str0.pollFirst();
    java.util.Iterator<java.lang.String> iterator_str9 = treeset_str0.iterator();
    java.util.NavigableSet<java.lang.String> navigableset_str12 = treeset_str0.headSet("hi!", true);
    java.util.TreeSet<java.lang.String> treeset_str13 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)navigableset_str12);
    java.util.TreeSet<java.lang.String> treeset_str14 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array17 = new java.lang.String[] { "", "" };
    boolean b18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str14, str_array17);
    java.util.Iterator<java.lang.String> iterator_str19 = treeset_str14.iterator();
    java.lang.String str21 = treeset_str14.higher("hi!");
    java.lang.String str22 = treeset_str14.pollFirst();
    int i23 = treeset_str14.size();
    java.util.stream.Stream<java.lang.String> stream_str24 = treeset_str14.stream();
    java.util.NavigableSet<java.lang.String> navigableset_str27 = treeset_str14.tailSet("hi!", true);
    java.lang.Long[] long_array33 = new java.lang.Long[] { 1L, 1L, 100L, 0L, (-1L) };
    java.lang.Long[] long_array34 = treeset_str14.toArray(long_array33);
    java.lang.Long[] long_array35 = treeset_str13.toArray(long_array33);
    java.util.NavigableSet<java.lang.String> navigableset_str38 = treeset_str13.tailSet("[hi!]", false);
    java.util.Iterator<java.lang.String> iterator_str39 = treeset_str13.iterator();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str19);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str24);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str27);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array33);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array34);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array35);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str38);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str39);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test269"); }


    java.util.Comparator<java.lang.Object> comparator_obj0 = null;
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>(comparator_obj0);
    java.lang.String str3 = treeset_str1.higher("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str6 = treeset_str1.headSet("hi!", false);
    java.util.TreeSet<java.lang.String> treeset_str7 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array10 = new java.lang.String[] { "", "" };
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str7, str_array10);
    java.util.Iterator<java.lang.String> iterator_str12 = treeset_str7.iterator();
    java.lang.String str14 = treeset_str7.higher("hi!");
    java.lang.String str15 = treeset_str7.pollFirst();
    java.lang.String str17 = treeset_str7.lower("");
    boolean b18 = treeset_str1.addAll((java.util.Collection<java.lang.String>)treeset_str7);
    java.util.Iterator<java.lang.String> iterator_str19 = treeset_str7.iterator();
    int i20 = treeset_str7.size();
    treeset_str7.clear();
    java.util.TreeSet<java.lang.String> treeset_str22 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array25 = new java.lang.String[] { "", "" };
    boolean b26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str22, str_array25);
    java.util.SortedSet<java.lang.String> sortedset_str28 = treeset_str22.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str31 = treeset_str22.headSet("", false);
    int i33 = java.util.Collections.frequency((java.util.Collection<java.lang.String>)treeset_str22, (java.lang.Object)' ');
    java.util.TreeSet<java.lang.String> treeset_str34 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str22);
    boolean b35 = treeset_str7.equals((java.lang.Object)treeset_str22);
    java.util.ArrayList<java.lang.String> arraylist_str36 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array38 = new java.lang.String[] { "" };
    boolean b39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str36, str_array38);
    java.util.ArrayList<java.lang.Object> arraylist_obj40 = new java.util.ArrayList<java.lang.Object>();
    java.util.ArrayList<java.util.Random> arraylist_random44 = new java.util.ArrayList<java.util.Random>();
    java.util.Random[] random_array45 = new java.util.Random[] {  };
    boolean b46 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)arraylist_random44, random_array45);
    java.util.Collections.rotate((java.util.List<java.util.Random>)arraylist_random44, (int)(short)0);
    java.lang.Object[] obj_array58 = new java.lang.Object[] { 10.0f, ' ', 0L, arraylist_random44, (short)1, 100L, (short)0, (-1.0f), (-1L), 1.0f, 100.0f, (short)1, (-1.0f) };
    boolean b59 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>)arraylist_obj40, obj_array58);
    boolean b60 = arraylist_str36.retainAll((java.util.Collection<java.lang.Object>)arraylist_obj40);
    boolean b61 = treeset_str22.retainAll((java.util.Collection<java.lang.Object>)arraylist_obj40);
    java.util.ArrayList<java.lang.Integer> arraylist_i62 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array64 = new java.lang.Integer[] { (-1) };
    boolean b65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i62, i_array64);
    java.util.ArrayList<java.lang.Integer> arraylist_i66 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array68 = new java.lang.Integer[] { 0 };
    boolean b69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i66, i_array68);
    java.util.ArrayList<java.lang.Integer> arraylist_i70 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array72 = new java.lang.Integer[] { 1 };
    boolean b73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i70, i_array72);
    int i74 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i66, (java.util.List<java.lang.Integer>)arraylist_i70);
    int i75 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i62, (java.util.List<java.lang.Integer>)arraylist_i66);
    int i76 = java.util.Collections.lastIndexOfSubList((java.util.List<java.lang.Object>)arraylist_obj40, (java.util.List<java.lang.Integer>)arraylist_i66);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str19);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str28);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str31);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array38);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random_array45);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array58);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array64);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array68);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array72);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == (-1));

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test270"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str9 = treeset_str0.headSet("", false);
    int i11 = java.util.Collections.frequency((java.util.Collection<java.lang.String>)treeset_str0, (java.lang.Object)' ');
    java.util.TreeSet<java.lang.String> treeset_str12 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.Spliterator<java.lang.String> spliterator_str13 = treeset_str12.spliterator();
    boolean b14 = treeset_str12.isEmpty();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str13);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test271"); }


    java.util.Comparator<java.lang.Object> comparator_obj0 = null;
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>(comparator_obj0);
    java.lang.String str3 = treeset_str1.higher("hi!");
    java.util.TreeSet<java.lang.String> treeset_str4 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array7 = new java.lang.String[] { "", "" };
    boolean b8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str4, str_array7);
    java.util.SortedSet<java.lang.String> sortedset_str10 = treeset_str4.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str13 = treeset_str4.headSet("", false);
    java.util.Comparator<?> comparator_obj14 = treeset_str4.comparator();
    java.lang.String str15 = treeset_str4.first();
    boolean b16 = treeset_str1.equals((java.lang.Object)treeset_str4);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str10);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str13);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_obj14);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test272"); }


    java.util.ArrayList<java.lang.Integer> arraylist_i0 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array2 = new java.lang.Integer[] { 0 };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i0, i_array2);
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array6 = new java.lang.Integer[] { 1 };
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array6);
    int i8 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i0, (java.util.List<java.lang.Integer>)arraylist_i4);
    java.util.ArrayList<java.lang.Integer> arraylist_i9 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array11 = new java.lang.Integer[] { (-1) };
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i9, i_array11);
    java.util.ArrayList<java.lang.Integer> arraylist_i13 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array15 = new java.lang.Integer[] { 0 };
    boolean b16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i13, i_array15);
    java.util.ArrayList<java.lang.Integer> arraylist_i17 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array19 = new java.lang.Integer[] { 1 };
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i17, i_array19);
    int i21 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i13, (java.util.List<java.lang.Integer>)arraylist_i17);
    int i22 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i9, (java.util.List<java.lang.Integer>)arraylist_i13);
    int i23 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i4, (java.util.List<java.lang.Integer>)arraylist_i9);
    int i25 = java.util.Collections.binarySearch((java.util.List<java.lang.Integer>)arraylist_i9, (java.lang.Integer)10);
    // The following exception was thrown during execution in test generation
    try {
    java.util.Collections.swap((java.util.List<java.lang.Integer>)arraylist_i9, (int)(short)1, (int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == (-2));

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test273"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.lang.String str7 = treeset_str0.higher("hi!");
    java.lang.String str8 = treeset_str0.pollFirst();
    java.util.Iterator<java.lang.String> iterator_str9 = treeset_str0.iterator();
    java.util.NavigableSet<java.lang.String> navigableset_str12 = treeset_str0.headSet("hi!", true);
    java.util.TreeSet<java.lang.String> treeset_str13 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)navigableset_str12);
    java.util.TreeSet<java.lang.String> treeset_str14 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array17 = new java.lang.String[] { "", "" };
    boolean b18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str14, str_array17);
    java.util.Iterator<java.lang.String> iterator_str19 = treeset_str14.iterator();
    java.lang.String str21 = treeset_str14.higher("hi!");
    java.lang.String str22 = treeset_str14.pollFirst();
    int i23 = treeset_str14.size();
    java.util.stream.Stream<java.lang.String> stream_str24 = treeset_str14.stream();
    java.util.NavigableSet<java.lang.String> navigableset_str27 = treeset_str14.tailSet("hi!", true);
    java.lang.Long[] long_array33 = new java.lang.Long[] { 1L, 1L, 100L, 0L, (-1L) };
    java.lang.Long[] long_array34 = treeset_str14.toArray(long_array33);
    java.lang.Long[] long_array35 = treeset_str13.toArray(long_array33);
    java.util.TreeSet<java.lang.String> treeset_str36 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str13);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str19);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str24);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str27);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array33);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array34);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array35);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test274"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.lang.String str7 = treeset_str0.higher("hi!");
    java.lang.String str8 = treeset_str0.pollFirst();
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    java.util.TreeSet<java.lang.String> treeset_str10 = new java.util.TreeSet<java.lang.String>(comparator_obj9);
    java.lang.String str12 = treeset_str10.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str14 = treeset_str10.headSet("");
    boolean b15 = treeset_str0.addAll((java.util.Collection<java.lang.String>)treeset_str10);
    java.util.Iterator<java.lang.String> iterator_str16 = treeset_str10.iterator();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str14);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str16);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test275"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str9 = treeset_str0.headSet("", false);
    int i11 = java.util.Collections.frequency((java.util.Collection<java.lang.String>)treeset_str0, (java.lang.Object)' ');
    java.util.TreeSet<java.lang.String> treeset_str12 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    boolean b14 = treeset_str12.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str15 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array18 = new java.lang.String[] { "", "" };
    boolean b19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str15, str_array18);
    java.util.SortedSet<java.lang.String> sortedset_str21 = treeset_str15.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str24 = treeset_str15.headSet("", false);
    boolean b26 = treeset_str15.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str27 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str15);
    java.util.stream.Stream<java.lang.String> stream_str28 = treeset_str27.stream();
    boolean b29 = treeset_str12.equals((java.lang.Object)stream_str28);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str21);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str24);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str28);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test276"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array2);
    java.util.ArrayList<java.lang.Object> arraylist_obj4 = new java.util.ArrayList<java.lang.Object>();
    java.util.ArrayList<java.util.Random> arraylist_random8 = new java.util.ArrayList<java.util.Random>();
    java.util.Random[] random_array9 = new java.util.Random[] {  };
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)arraylist_random8, random_array9);
    java.util.Collections.rotate((java.util.List<java.util.Random>)arraylist_random8, (int)(short)0);
    java.lang.Object[] obj_array22 = new java.lang.Object[] { 10.0f, ' ', 0L, arraylist_random8, (short)1, 100L, (short)0, (-1.0f), (-1L), 1.0f, 100.0f, (short)1, (-1.0f) };
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>)arraylist_obj4, obj_array22);
    boolean b24 = arraylist_str0.retainAll((java.util.Collection<java.lang.Object>)arraylist_obj4);
    java.util.ArrayList<java.lang.Object[]> arraylist_obj_array25 = new java.util.ArrayList<java.lang.Object[]>();
    java.lang.Object[][] obj_array_array26 = new java.lang.Object[][] {  };
    boolean b27 = java.util.Collections.addAll((java.util.Collection<java.lang.Object[]>)arraylist_obj_array25, obj_array_array26);
    java.util.Collections.copy((java.util.List<java.lang.Object>)arraylist_obj4, (java.util.List<java.lang.Object[]>)arraylist_obj_array25);
    java.util.ArrayList<java.lang.Integer> arraylist_i29 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array31 = new java.lang.Integer[] { (-1) };
    boolean b32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i29, i_array31);
    java.util.ArrayList<java.lang.Integer> arraylist_i33 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array35 = new java.lang.Integer[] { 0 };
    boolean b36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i33, i_array35);
    java.util.ArrayList<java.lang.Integer> arraylist_i37 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array39 = new java.lang.Integer[] { 1 };
    boolean b40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i37, i_array39);
    int i41 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i33, (java.util.List<java.lang.Integer>)arraylist_i37);
    int i42 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i29, (java.util.List<java.lang.Integer>)arraylist_i33);
    int i43 = java.util.Collections.lastIndexOfSubList((java.util.List<java.lang.Object>)arraylist_obj4, (java.util.List<java.lang.Integer>)arraylist_i29);
    java.util.ArrayList<java.lang.Integer> arraylist_i44 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array46 = new java.lang.Integer[] { 0 };
    boolean b47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i44, i_array46);
    java.util.ArrayList<java.lang.Integer> arraylist_i48 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array50 = new java.lang.Integer[] { 1 };
    boolean b51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i48, i_array50);
    int i52 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i44, (java.util.List<java.lang.Integer>)arraylist_i48);
    java.lang.Integer i53 = java.util.Collections.min((java.util.Collection<java.lang.Integer>)arraylist_i48);
    int i54 = java.util.Collections.lastIndexOfSubList((java.util.List<java.lang.Object>)arraylist_obj4, (java.util.List<java.lang.Integer>)arraylist_i48);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random_array9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array26);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array50);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + 1+ "'", i53.equals(1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == (-1));

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test277"); }


    java.util.ArrayList<java.lang.Integer> arraylist_i0 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array4 = new java.lang.Integer[] { (-2), 100, 1 };
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i0, i_array4);
    java.lang.Integer i6 = java.util.Collections.min((java.util.Collection<java.lang.Integer>)arraylist_i0);
    java.util.ArrayList<java.lang.Integer> arraylist_i7 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array9 = new java.lang.Integer[] { (-1) };
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i7, i_array9);
    java.util.ArrayList<java.lang.Boolean> arraylist_b11 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array13 = new java.lang.Boolean[] { false };
    boolean b14 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b11, b_array13);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b11);
    boolean b16 = java.util.Collections.disjoint((java.util.Collection<java.lang.Integer>)arraylist_i7, (java.util.Collection<java.lang.Boolean>)arraylist_b11);
    java.util.ArrayList<java.lang.Integer> arraylist_i17 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array19 = new java.lang.Integer[] { 0 };
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i17, i_array19);
    java.util.ArrayList<java.lang.Integer> arraylist_i21 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array23 = new java.lang.Integer[] { 1 };
    boolean b24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i21, i_array23);
    int i25 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i17, (java.util.List<java.lang.Integer>)arraylist_i21);
    java.util.ArrayList<java.lang.Integer> arraylist_i26 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array28 = new java.lang.Integer[] { (-1) };
    boolean b29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i26, i_array28);
    java.util.ArrayList<java.lang.Integer> arraylist_i30 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array32 = new java.lang.Integer[] { 0 };
    boolean b33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i30, i_array32);
    java.util.ArrayList<java.lang.Integer> arraylist_i34 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array36 = new java.lang.Integer[] { 1 };
    boolean b37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i34, i_array36);
    int i38 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i30, (java.util.List<java.lang.Integer>)arraylist_i34);
    int i39 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i26, (java.util.List<java.lang.Integer>)arraylist_i30);
    int i40 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i21, (java.util.List<java.lang.Integer>)arraylist_i26);
    java.util.ArrayList<java.lang.Integer> arraylist_i41 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array43 = new java.lang.Integer[] { (-1) };
    boolean b44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i41, i_array43);
    java.util.ArrayList<java.lang.Boolean> arraylist_b45 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array47 = new java.lang.Boolean[] { false };
    boolean b48 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b45, b_array47);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b45);
    boolean b50 = java.util.Collections.disjoint((java.util.Collection<java.lang.Integer>)arraylist_i41, (java.util.Collection<java.lang.Boolean>)arraylist_b45);
    boolean b51 = java.util.Collections.disjoint((java.util.Collection<java.lang.Integer>)arraylist_i21, (java.util.Collection<java.lang.Boolean>)arraylist_b45);
    java.util.ArrayList<java.lang.Integer> arraylist_i52 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array54 = new java.lang.Integer[] { 0 };
    boolean b55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i52, i_array54);
    java.util.ArrayList<java.lang.Integer> arraylist_i56 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array58 = new java.lang.Integer[] { 1 };
    boolean b59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i56, i_array58);
    int i60 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i52, (java.util.List<java.lang.Integer>)arraylist_i56);
    int i61 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i21, (java.util.List<java.lang.Integer>)arraylist_i52);
    int i62 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i7, (java.util.List<java.lang.Integer>)arraylist_i21);
    java.util.LinkedHashSet<java.lang.Integer> linkedhashset_i63 = new java.util.LinkedHashSet<java.lang.Integer>();
    java.lang.Integer[] i_array68 = new java.lang.Integer[] { 0, 0, 0, 0 };
    boolean b69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)linkedhashset_i63, i_array68);
    java.util.Set<java.lang.Integer> set_i70 = java.util.Collections.synchronizedSet((java.util.Set<java.lang.Integer>)linkedhashset_i63);
    java.util.ArrayList<java.lang.Boolean> arraylist_b71 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array74 = new java.lang.Boolean[] { false, false };
    boolean b75 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b71, b_array74);
    boolean b76 = java.util.Collections.disjoint((java.util.Collection<java.lang.Integer>)linkedhashset_i63, (java.util.Collection<java.lang.Boolean>)arraylist_b71);
    boolean b77 = java.util.Collections.disjoint((java.util.Collection<java.lang.Integer>)arraylist_i7, (java.util.Collection<java.lang.Boolean>)arraylist_b71);
    int i78 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i0, (java.util.List<java.lang.Integer>)arraylist_i7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-2)+ "'", i6.equals((-2)));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array13);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array43);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array47);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array54);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array58);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array68);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_i70);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array74);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == (-1));

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test278"); }


    java.util.Set<java.lang.Object[]> set_obj_array0 = null;
    java.lang.Class<java.lang.Object[]> cls1 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<java.lang.Object[]> set_obj_array2 = java.util.Collections.checkedSet(set_obj_array0, cls1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test279"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.lang.String str7 = treeset_str0.higher("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str10 = treeset_str0.tailSet("", true);
    java.util.TreeSet<java.lang.String> treeset_str11 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)navigableset_str10);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str10);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test280"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.lang.String str7 = treeset_str0.higher("hi!");
    treeset_str0.clear();
    java.util.Iterator<java.lang.String> iterator_str9 = treeset_str0.descendingIterator();
    java.util.Spliterator<java.lang.String> spliterator_str10 = treeset_str0.spliterator();
    int i11 = treeset_str0.size();
    java.util.SortedSet<java.lang.String> sortedset_str13 = treeset_str0.headSet("");
    java.util.Comparator<java.lang.String> comparator_str14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = java.util.Collections.min((java.util.Collection<java.lang.String>)sortedset_str13, comparator_str14);
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.util.NoSuchElementException")) {
        org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str10);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str13);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test281"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.lang.String str7 = treeset_str0.higher("hi!");
    java.lang.String str8 = treeset_str0.pollFirst();
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    java.util.TreeSet<java.lang.String> treeset_str10 = new java.util.TreeSet<java.lang.String>(comparator_obj9);
    java.lang.String str12 = treeset_str10.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str14 = treeset_str10.headSet("");
    boolean b15 = treeset_str0.addAll((java.util.Collection<java.lang.String>)treeset_str10);
    java.lang.Object[] obj_array16 = treeset_str0.toArray();
    java.util.TreeSet<java.lang.Boolean> treeset_b17 = new java.util.TreeSet<java.lang.Boolean>();
    java.lang.Boolean[] b_array19 = new java.lang.Boolean[] { true };
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)treeset_b17, b_array19);
    java.util.NavigableSet<java.lang.Boolean> navigableset_b21 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.lang.Boolean>)treeset_b17);
    java.util.NavigableSet<java.lang.Boolean> navigableset_b22 = java.util.Collections.synchronizedNavigableSet(navigableset_b21);
    boolean b23 = treeset_str0.containsAll((java.util.Collection<java.lang.Boolean>)navigableset_b21);
    java.util.NavigableSet<java.lang.String> navigableset_str26 = treeset_str0.tailSet("", false);
    java.util.Comparator<?> comparator_obj27 = treeset_str0.comparator();
    java.util.TreeSet<java.lang.String> treeset_str28 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str14);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array19);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_b21);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_b22);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str26);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_obj27);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test282"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.lang.String str7 = treeset_str0.higher("hi!");
    java.lang.String str8 = treeset_str0.pollFirst();
    java.util.Iterator<java.lang.String> iterator_str9 = treeset_str0.descendingIterator();
    boolean b11 = treeset_str0.remove((java.lang.Object)' ');
    java.util.Spliterator<java.lang.String> spliterator_str12 = treeset_str0.spliterator();
    java.util.SortedSet<java.lang.String> sortedset_str14 = treeset_str0.headSet("[]");
    java.util.SortedSet<java.lang.String> sortedset_str16 = treeset_str0.headSet("");
    java.lang.Object[] obj_array17 = treeset_str0.toArray();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str14);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str16);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test283"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array4 = new java.lang.String[] { "", "" };
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str1, str_array4);
    java.util.Iterator<java.lang.String> iterator_str6 = treeset_str1.iterator();
    java.lang.String str8 = treeset_str1.higher("hi!");
    java.lang.String str9 = treeset_str1.pollFirst();
    java.util.Iterator<java.lang.String> iterator_str10 = treeset_str1.descendingIterator();
    boolean b12 = treeset_str1.remove((java.lang.Object)' ');
    java.util.Spliterator<java.lang.String> spliterator_str13 = treeset_str1.spliterator();
    java.util.SortedSet<java.lang.String> sortedset_str15 = treeset_str1.headSet("[]");
    boolean b16 = treeset_str0.addAll((java.util.Collection<java.lang.String>)sortedset_str15);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str10);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str13);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str15);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test284"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str9 = treeset_str0.headSet("", false);
    int i11 = java.util.Collections.frequency((java.util.Collection<java.lang.String>)treeset_str0, (java.lang.Object)' ');
    java.util.TreeSet<java.lang.String> treeset_str12 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.SortedSet<java.lang.String> sortedset_str14 = treeset_str12.tailSet("");
    java.util.SortedSet<java.lang.String> sortedset_str16 = treeset_str12.headSet("");
    java.util.Comparator<java.lang.Object> comparator_obj17 = null;
    java.util.TreeSet<java.lang.String> treeset_str18 = new java.util.TreeSet<java.lang.String>(comparator_obj17);
    java.lang.String str20 = treeset_str18.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str22 = treeset_str18.headSet("");
    // The following exception was thrown during execution in test generation
    try {
    boolean b23 = treeset_str12.remove((java.lang.Object)treeset_str18);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str14);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str16);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str22);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test285"); }


    java.util.LinkedHashSet<java.lang.Integer> linkedhashset_i0 = new java.util.LinkedHashSet<java.lang.Integer>();
    java.lang.Integer[] i_array6 = new java.lang.Integer[] { 1, (-1), 100, 1, 100 };
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)linkedhashset_i0, i_array6);
    java.util.Set<java.lang.Integer> set_i8 = java.util.Collections.synchronizedSet((java.util.Set<java.lang.Integer>)linkedhashset_i0);
    java.util.Set<java.lang.Boolean> set_b9 = java.util.Collections.EMPTY_SET;
    boolean b10 = java.util.Collections.disjoint((java.util.Collection<java.lang.Integer>)linkedhashset_i0, (java.util.Collection<java.lang.Boolean>)set_b9);
    java.util.Set<java.lang.Integer> set_i11 = java.util.Collections.synchronizedSet((java.util.Set<java.lang.Integer>)linkedhashset_i0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_i8);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_b9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_i11);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test286"); }


    java.util.ArrayDeque<java.lang.String> arraydeque_str0 = new java.util.ArrayDeque<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!", "hi!" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraydeque_str0, str_array3);
    java.util.Queue<java.lang.String> queue_str5 = java.util.Collections.asLifoQueue((java.util.Deque<java.lang.String>)arraydeque_str0);
    java.util.Queue<java.lang.String> queue_str6 = java.util.Collections.asLifoQueue((java.util.Deque<java.lang.String>)arraydeque_str0);
    java.util.Queue<java.lang.String> queue_str7 = java.util.Collections.asLifoQueue((java.util.Deque<java.lang.String>)arraydeque_str0);
    java.util.Queue<java.lang.String> queue_str8 = java.util.Collections.asLifoQueue((java.util.Deque<java.lang.String>)arraydeque_str0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(queue_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(queue_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(queue_str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(queue_str8);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test287"); }


    java.util.ArrayList<java.util.Collections> arraylist_collections0 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array1 = new java.util.Collections[] {  };
    boolean b2 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections0, collections_array1);
    java.util.Collections collections3 = null;
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    int i5 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections0, collections3, comparator_obj4);
    java.util.Collections collections6 = null;
    java.util.ArrayList<java.lang.Integer> arraylist_i7 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array9 = new java.lang.Integer[] { (-1) };
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i7, i_array9);
    java.util.ArrayList<java.lang.Boolean> arraylist_b11 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array13 = new java.lang.Boolean[] { false };
    boolean b14 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b11, b_array13);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b11);
    boolean b16 = java.util.Collections.disjoint((java.util.Collection<java.lang.Integer>)arraylist_i7, (java.util.Collection<java.lang.Boolean>)arraylist_b11);
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str17 = new java.util.LinkedHashSet<java.lang.String>();
    java.lang.String[] str_array19 = new java.lang.String[] { "hi!" };
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str17, str_array19);
    java.util.ArrayList<java.util.Collections> arraylist_collections21 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array22 = new java.util.Collections[] {  };
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections21, collections_array22);
    java.util.Collections collections24 = null;
    java.util.Comparator<java.lang.Object> comparator_obj25 = null;
    int i26 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections21, collections24, comparator_obj25);
    boolean b27 = linkedhashset_str17.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections21);
    java.util.Collections collections28 = null;
    java.util.Collections.fill((java.util.List<java.util.Collections>)arraylist_collections21, collections28);
    java.util.Collections collections30 = null;
    java.util.Comparator<java.lang.Object> comparator_obj31 = null;
    java.util.Comparator<java.lang.Object> comparator_obj32 = java.util.Collections.reverseOrder(comparator_obj31);
    int i33 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections21, collections30, comparator_obj32);
    java.util.Comparator<java.lang.Object> comparator_obj34 = java.util.Collections.reverseOrder(comparator_obj32);
    java.util.Comparator<java.lang.Object> comparator_obj35 = java.util.Collections.reverseOrder(comparator_obj32);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b11, comparator_obj32);
    int i37 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections0, collections6, comparator_obj32);
    java.util.Collections collections38 = null;
    java.util.ArrayList<java.lang.Integer> arraylist_i39 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array41 = new java.lang.Integer[] { (-1) };
    boolean b42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i39, i_array41);
    java.util.ArrayList<java.lang.Boolean> arraylist_b43 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array45 = new java.lang.Boolean[] { false };
    boolean b46 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b43, b_array45);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b43);
    boolean b48 = java.util.Collections.disjoint((java.util.Collection<java.lang.Integer>)arraylist_i39, (java.util.Collection<java.lang.Boolean>)arraylist_b43);
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str49 = new java.util.LinkedHashSet<java.lang.String>();
    java.lang.String[] str_array51 = new java.lang.String[] { "hi!" };
    boolean b52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str49, str_array51);
    java.util.ArrayList<java.util.Collections> arraylist_collections53 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array54 = new java.util.Collections[] {  };
    boolean b55 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections53, collections_array54);
    java.util.Collections collections56 = null;
    java.util.Comparator<java.lang.Object> comparator_obj57 = null;
    int i58 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections53, collections56, comparator_obj57);
    boolean b59 = linkedhashset_str49.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections53);
    java.util.Collections collections60 = null;
    java.util.Collections.fill((java.util.List<java.util.Collections>)arraylist_collections53, collections60);
    java.util.Collections collections62 = null;
    java.util.Comparator<java.lang.Object> comparator_obj63 = null;
    java.util.Comparator<java.lang.Object> comparator_obj64 = java.util.Collections.reverseOrder(comparator_obj63);
    int i65 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections53, collections62, comparator_obj64);
    java.util.Comparator<java.lang.Object> comparator_obj66 = java.util.Collections.reverseOrder(comparator_obj64);
    java.util.Comparator<java.lang.Object> comparator_obj67 = java.util.Collections.reverseOrder(comparator_obj64);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b43, comparator_obj64);
    int i69 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections0, collections38, comparator_obj64);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array1);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array13);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array22);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj32);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj34);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj35);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array45);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array51);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array54);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj64);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj66);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj67);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == (-1));

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test288"); }


    java.util.TreeSet<java.lang.Integer> treeset_i0 = new java.util.TreeSet<java.lang.Integer>();
    java.lang.Integer[] i_array2 = new java.lang.Integer[] { (-1) };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)treeset_i0, i_array2);
    java.util.SortedSet<java.lang.Integer> sortedset_i4 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.Integer>)treeset_i0);
    java.util.SortedSet<java.lang.Integer> sortedset_i5 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.Integer>)treeset_i0);
    java.util.Set<java.lang.Integer> set_i6 = java.util.Collections.synchronizedSet((java.util.Set<java.lang.Integer>)sortedset_i5);
    java.util.TreeSet<java.lang.Boolean> treeset_b7 = new java.util.TreeSet<java.lang.Boolean>();
    java.lang.Boolean[] b_array9 = new java.lang.Boolean[] { true };
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)treeset_b7, b_array9);
    java.util.NavigableSet<java.lang.Boolean> navigableset_b11 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.lang.Boolean>)treeset_b7);
    java.util.NavigableSet<java.lang.Boolean> navigableset_b12 = java.util.Collections.synchronizedNavigableSet(navigableset_b11);
    // The following exception was thrown during execution in test generation
    try {
    boolean b13 = java.util.Collections.disjoint((java.util.Collection<java.lang.Integer>)sortedset_i5, (java.util.Collection<java.lang.Boolean>)navigableset_b12);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_i4);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_i5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_i6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_b11);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_b12);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test289"); }


    java.util.Comparator<java.lang.Object> comparator_obj0 = null;
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>(comparator_obj0);
    java.lang.String str3 = treeset_str1.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str5 = treeset_str1.headSet("");
    java.util.Iterator<java.lang.String> iterator_str6 = treeset_str1.descendingIterator();
    boolean b7 = treeset_str1.isEmpty();
    boolean b9 = treeset_str1.add("[hi!]");
    // The following exception was thrown during execution in test generation
    try {
    java.util.NavigableSet<java.lang.String> navigableset_str14 = treeset_str1.subSet("hi!", false, "", true);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test290"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str7 = treeset_str0.descendingSet();
    boolean b9 = treeset_str0.add("");
    java.util.function.Consumer<java.lang.String> consumer_str10 = null;
    // The following exception was thrown during execution in test generation
    try {
    treeset_str0.forEach(consumer_str10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test291"); }


    java.util.List<java.lang.String> list_str2 = java.util.Collections.nCopies(10, "[]");

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test292"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.lang.String str7 = treeset_str0.higher("hi!");
    treeset_str0.clear();
    java.util.Iterator<java.lang.String> iterator_str9 = treeset_str0.descendingIterator();
    java.util.Spliterator<java.lang.String> spliterator_str10 = treeset_str0.spliterator();
    int i11 = treeset_str0.size();
    java.util.SortedSet<java.lang.String> sortedset_str13 = treeset_str0.headSet("");
    java.util.stream.Stream<java.lang.String> stream_str14 = sortedset_str13.stream();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str10);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str13);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str14);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test293"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str7 = treeset_str0.descendingSet();
    java.lang.String str9 = treeset_str0.floor("hi!");
    java.lang.String str10 = treeset_str0.pollFirst();
    java.util.TreeSet<java.lang.String> treeset_str11 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.NavigableSet<java.lang.String> navigableset_str12 = treeset_str0.descendingSet();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str12);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test294"); }


    java.util.Comparator<java.lang.Object> comparator_obj0 = null;
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>(comparator_obj0);
    java.lang.String str3 = treeset_str1.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str5 = treeset_str1.headSet("");
    java.util.TreeSet<java.lang.String> treeset_str6 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str1);
    java.util.ArrayList<java.lang.String> arraylist_str7 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array9 = new java.lang.String[] { "" };
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str7, str_array9);
    java.util.ArrayList<java.lang.Object> arraylist_obj11 = new java.util.ArrayList<java.lang.Object>();
    java.util.ArrayList<java.util.Random> arraylist_random15 = new java.util.ArrayList<java.util.Random>();
    java.util.Random[] random_array16 = new java.util.Random[] {  };
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)arraylist_random15, random_array16);
    java.util.Collections.rotate((java.util.List<java.util.Random>)arraylist_random15, (int)(short)0);
    java.lang.Object[] obj_array29 = new java.lang.Object[] { 10.0f, ' ', 0L, arraylist_random15, (short)1, 100L, (short)0, (-1.0f), (-1L), 1.0f, 100.0f, (short)1, (-1.0f) };
    boolean b30 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>)arraylist_obj11, obj_array29);
    boolean b31 = arraylist_str7.retainAll((java.util.Collection<java.lang.Object>)arraylist_obj11);
    java.util.ArrayList<java.lang.Object[]> arraylist_obj_array32 = new java.util.ArrayList<java.lang.Object[]>();
    java.lang.Object[][] obj_array_array33 = new java.lang.Object[][] {  };
    boolean b34 = java.util.Collections.addAll((java.util.Collection<java.lang.Object[]>)arraylist_obj_array32, obj_array_array33);
    java.util.Collections.copy((java.util.List<java.lang.Object>)arraylist_obj11, (java.util.List<java.lang.Object[]>)arraylist_obj_array32);
    boolean b36 = treeset_str6.retainAll((java.util.Collection<java.lang.Object>)arraylist_obj11);
    boolean b38 = treeset_str6.add("hi!");
    java.util.ArrayList<java.lang.Boolean> arraylist_b39 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array41 = new java.lang.Boolean[] { false };
    boolean b42 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b39, b_array41);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b39);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b39);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b39);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b39);
    // The following exception was thrown during execution in test generation
    try {
    boolean b47 = treeset_str6.containsAll((java.util.Collection<java.lang.Boolean>)arraylist_b39);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random_array16);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array33);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array41);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test295"); }


    java.util.ArrayList<java.util.Collections> arraylist_collections0 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array1 = new java.util.Collections[] {  };
    boolean b2 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections0, collections_array1);
    java.util.Collections collections3 = null;
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    int i5 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections0, collections3, comparator_obj4);
    java.util.List<java.util.Collections> list_collections6 = java.util.Collections.unmodifiableList((java.util.List<java.util.Collections>)arraylist_collections0);
    java.util.Collections collections7 = null;
    java.util.Collections.fill(list_collections6, collections7);
    java.util.Collections collections9 = null;
    java.util.Collections.fill(list_collections6, collections9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array1);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_collections6);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test296"); }


    java.util.SortedSet<java.util.Random> sortedset_random0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.SortedSet<java.util.Random> sortedset_random1 = java.util.Collections.unmodifiableSortedSet(sortedset_random0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test297"); }


    java.util.LinkedHashSet<java.lang.Integer> linkedhashset_i0 = new java.util.LinkedHashSet<java.lang.Integer>();
    java.lang.Integer[] i_array5 = new java.lang.Integer[] { 0, 0, 0, 0 };
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)linkedhashset_i0, i_array5);
    java.util.Set<java.lang.Integer> set_i7 = java.util.Collections.synchronizedSet((java.util.Set<java.lang.Integer>)linkedhashset_i0);
    java.util.List<java.lang.Integer> list_i8 = java.util.Collections.emptyList();
    java.util.ArrayList<java.lang.Boolean> arraylist_b9 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array12 = new java.lang.Boolean[] { true, true };
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b9, b_array12);
    boolean b14 = java.util.Collections.disjoint((java.util.Collection<java.lang.Integer>)list_i8, (java.util.Collection<java.lang.Boolean>)arraylist_b9);
    boolean b15 = java.util.Collections.disjoint((java.util.Collection<java.lang.Integer>)set_i7, (java.util.Collection<java.lang.Boolean>)arraylist_b9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_i7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i8);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test298"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "hi!" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.descendingIterator();
    java.util.Spliterator<java.lang.String> spliterator_str6 = treeset_str0.spliterator();
    java.util.Iterator<java.lang.String> iterator_str7 = treeset_str0.descendingIterator();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str7);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test299"); }


    java.util.TreeSet<java.lang.Long> treeset_long0 = new java.util.TreeSet<java.lang.Long>();
    java.lang.Long[] long_array6 = new java.lang.Long[] { 0L, 10L, 1L, 10L, 100L };
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)treeset_long0, long_array6);
    java.util.NavigableSet<java.lang.Long> navigableset_long8 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long0);
    java.util.NavigableSet<java.lang.Long> navigableset_long9 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long0);
    java.lang.Long long10 = java.util.Collections.max((java.util.Collection<java.lang.Long>)navigableset_long9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_long8);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_long9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L+ "'", long10.equals(100L));

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test300"); }


    java.util.ArrayDeque<java.lang.String> arraydeque_str0 = new java.util.ArrayDeque<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "[]" };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraydeque_str0, str_array2);
    java.util.Queue<java.lang.String> queue_str4 = java.util.Collections.asLifoQueue((java.util.Deque<java.lang.String>)arraydeque_str0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(queue_str4);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test301"); }


    java.util.Comparator<java.lang.Object> comparator_obj0 = null;
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>(comparator_obj0);
    java.lang.String str3 = treeset_str1.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str5 = treeset_str1.headSet("");
    java.lang.String str7 = treeset_str1.higher("[]");
    java.lang.String str9 = treeset_str1.lower("[hi!]");

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test302"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.lang.String str7 = treeset_str0.higher("hi!");
    java.lang.String str8 = treeset_str0.pollFirst();
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    java.util.TreeSet<java.lang.String> treeset_str10 = new java.util.TreeSet<java.lang.String>(comparator_obj9);
    java.lang.String str12 = treeset_str10.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str14 = treeset_str10.headSet("");
    boolean b15 = treeset_str0.addAll((java.util.Collection<java.lang.String>)treeset_str10);
    java.lang.Object[] obj_array16 = treeset_str0.toArray();
    java.util.Set<java.lang.Object[]> set_obj_array17 = java.util.Collections.singleton(obj_array16);
    java.util.Comparator<java.lang.Object[]> comparator_obj_array18 = null;
    java.lang.Object[] obj_array19 = java.util.Collections.max((java.util.Collection<java.lang.Object[]>)set_obj_array17, comparator_obj_array18);
    java.util.Set<java.lang.Object[]> set_obj_array20 = java.util.Collections.unmodifiableSet(set_obj_array17);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str14);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array17);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array20);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test303"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str9 = treeset_str0.headSet("", false);
    boolean b11 = treeset_str0.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str12 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str0);
    java.util.Comparator<?> comparator_obj13 = treeset_str12.comparator();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_obj13);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test304"); }


    java.util.ArrayList<java.lang.Object[]> arraylist_obj_array0 = new java.util.ArrayList<java.lang.Object[]>();
    java.lang.Object[][] obj_array_array1 = new java.lang.Object[][] {  };
    boolean b2 = java.util.Collections.addAll((java.util.Collection<java.lang.Object[]>)arraylist_obj_array0, obj_array_array1);
    java.util.Random random3 = null;
    java.util.Collections.shuffle((java.util.List<java.lang.Object[]>)arraylist_obj_array0, random3);
    java.util.Random random5 = null;
    java.util.Collections.shuffle((java.util.List<java.lang.Object[]>)arraylist_obj_array0, random5);
    java.util.Random random7 = null;
    java.util.Collections.shuffle((java.util.List<java.lang.Object[]>)arraylist_obj_array0, random7);
    java.util.Comparator<java.lang.Object[]> comparator_obj_array9 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object[] obj_array10 = java.util.Collections.max((java.util.Collection<java.lang.Object[]>)arraylist_obj_array0, comparator_obj_array9);
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.util.NoSuchElementException")) {
        org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array1);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test305"); }


    java.util.Comparator<java.lang.Object> comparator_obj0 = null;
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>(comparator_obj0);
    java.lang.String str3 = treeset_str1.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str5 = treeset_str1.headSet("");
    java.util.Iterator<java.lang.String> iterator_str6 = treeset_str1.descendingIterator();
    java.lang.Object obj7 = treeset_str1.clone();
    treeset_str1.clear();
    java.util.function.Consumer<java.lang.String> consumer_str9 = null;
    // The following exception was thrown during execution in test generation
    try {
    treeset_str1.forEach(consumer_str9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj7);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test306"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.lang.String str7 = treeset_str0.higher("hi!");
    treeset_str0.clear();
    java.util.Iterator<java.lang.String> iterator_str9 = treeset_str0.descendingIterator();
    java.util.Spliterator<java.lang.String> spliterator_str10 = treeset_str0.spliterator();
    int i11 = treeset_str0.size();
    java.lang.String str12 = treeset_str0.toString();
    java.util.Comparator<java.lang.Object> comparator_obj13 = null;
    java.util.TreeSet<java.lang.String> treeset_str14 = new java.util.TreeSet<java.lang.String>(comparator_obj13);
    java.lang.String str16 = treeset_str14.higher("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str19 = treeset_str14.headSet("hi!", false);
    java.util.TreeSet<java.lang.String> treeset_str20 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array23 = new java.lang.String[] { "", "" };
    boolean b24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str20, str_array23);
    java.util.Iterator<java.lang.String> iterator_str25 = treeset_str20.iterator();
    java.lang.String str27 = treeset_str20.higher("hi!");
    java.lang.String str28 = treeset_str20.pollFirst();
    java.lang.String str30 = treeset_str20.lower("");
    boolean b31 = treeset_str14.addAll((java.util.Collection<java.lang.String>)treeset_str20);
    int i32 = treeset_str20.size();
    boolean b33 = treeset_str0.addAll((java.util.Collection<java.lang.String>)treeset_str20);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str10);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str19);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array23);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str25);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str30);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test307"); }


    java.util.Comparator<java.lang.Object> comparator_obj0 = null;
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>(comparator_obj0);
    java.lang.String str3 = treeset_str1.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str5 = treeset_str1.headSet("");
    java.util.Iterator<java.lang.String> iterator_str6 = treeset_str1.descendingIterator();
    boolean b7 = treeset_str1.isEmpty();
    boolean b8 = treeset_str1.isEmpty();
    java.lang.String str9 = treeset_str1.pollLast();
    java.util.SortedSet<java.lang.String> sortedset_str12 = treeset_str1.subSet("hi!", "hi!");

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str12);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test308"); }


    java.util.Comparator<java.lang.Object> comparator_obj0 = null;
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>(comparator_obj0);
    java.lang.String str3 = treeset_str1.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str5 = treeset_str1.headSet("");
    java.util.TreeSet<java.lang.String> treeset_str6 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str1);
    java.util.function.Consumer<java.lang.String> consumer_str7 = null;
    // The following exception was thrown during execution in test generation
    try {
    treeset_str6.forEach(consumer_str7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str5);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test309"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.lang.String str7 = treeset_str0.higher("hi!");
    java.lang.String str8 = treeset_str0.pollFirst();
    java.util.Iterator<java.lang.String> iterator_str9 = treeset_str0.iterator();
    java.util.NavigableSet<java.lang.String> navigableset_str12 = treeset_str0.headSet("hi!", true);
    java.util.TreeSet<java.lang.String> treeset_str13 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)navigableset_str12);
    java.util.SortedSet<java.lang.String> sortedset_str15 = treeset_str13.tailSet("");
    java.util.SortedSet<java.lang.String> sortedset_str18 = treeset_str13.subSet("hi!", "hi!");

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str15);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str18);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test310"); }


    java.util.TreeSet<java.util.Random> treeset_random0 = new java.util.TreeSet<java.util.Random>();
    java.util.Random[] random_array1 = new java.util.Random[] {  };
    boolean b2 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)treeset_random0, random_array1);
    java.util.SortedSet<java.util.Random> sortedset_random3 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.util.Random>)treeset_random0);
    java.util.Enumeration<java.util.Random> enumeration_random4 = java.util.Collections.enumeration((java.util.Collection<java.util.Random>)sortedset_random3);
    java.util.SortedSet<java.util.Random> sortedset_random5 = java.util.Collections.unmodifiableSortedSet(sortedset_random3);
    java.util.Enumeration<java.util.Random> enumeration_random6 = java.util.Collections.enumeration((java.util.Collection<java.util.Random>)sortedset_random5);
    java.util.SortedSet<java.util.Random> sortedset_random7 = java.util.Collections.unmodifiableSortedSet(sortedset_random5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random_array1);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_random3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration_random4);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_random5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration_random6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_random7);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test311"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.lang.String str7 = treeset_str0.higher("hi!");
    java.lang.String str8 = treeset_str0.pollFirst();
    java.util.Iterator<java.lang.String> iterator_str9 = treeset_str0.descendingIterator();
    boolean b11 = treeset_str0.remove((java.lang.Object)' ');
    java.util.Spliterator<java.lang.String> spliterator_str12 = treeset_str0.spliterator();
    java.util.SortedSet<java.lang.String> sortedset_str14 = treeset_str0.headSet("[]");
    boolean b15 = treeset_str0.isEmpty();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str14);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test312"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.lang.String str7 = treeset_str0.higher("hi!");
    java.util.Comparator<?> comparator_obj8 = treeset_str0.comparator();
    java.lang.Object obj9 = treeset_str0.clone();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_obj8);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj9);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test313"); }


    java.util.ArrayDeque<java.lang.String> arraydeque_str0 = new java.util.ArrayDeque<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "[hi!]" };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraydeque_str0, str_array2);
    java.util.Queue<java.lang.String> queue_str4 = java.util.Collections.asLifoQueue((java.util.Deque<java.lang.String>)arraydeque_str0);
    java.util.Queue<java.lang.String> queue_str5 = java.util.Collections.asLifoQueue((java.util.Deque<java.lang.String>)arraydeque_str0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(queue_str4);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(queue_str5);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test314"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.lang.String str7 = treeset_str0.higher("hi!");
    java.util.Iterator<java.lang.String> iterator_str8 = treeset_str0.iterator();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str8);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test315"); }


    java.util.Comparator<java.lang.Object> comparator_obj0 = null;
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>(comparator_obj0);
    java.lang.String str3 = treeset_str1.higher("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str6 = treeset_str1.headSet("hi!", false);
    java.util.TreeSet<java.lang.String> treeset_str7 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array10 = new java.lang.String[] { "", "" };
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str7, str_array10);
    java.util.Iterator<java.lang.String> iterator_str12 = treeset_str7.iterator();
    java.lang.String str14 = treeset_str7.higher("hi!");
    java.lang.String str15 = treeset_str7.pollFirst();
    java.lang.String str17 = treeset_str7.lower("");
    boolean b18 = treeset_str1.addAll((java.util.Collection<java.lang.String>)treeset_str7);
    java.util.Spliterator<java.lang.String> spliterator_str19 = treeset_str7.spliterator();
    java.lang.String str21 = treeset_str7.higher("hi!");
    java.lang.String str23 = treeset_str7.floor("[hi!]");

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str19);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test316"); }


    java.util.TreeSet<java.util.Random> treeset_random0 = new java.util.TreeSet<java.util.Random>();
    java.util.Random[] random_array1 = new java.util.Random[] {  };
    boolean b2 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)treeset_random0, random_array1);
    java.util.SortedSet<java.util.Random> sortedset_random3 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.util.Random>)treeset_random0);
    java.lang.Class<java.util.Random> cls4 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.NavigableSet<java.util.Random> navigableset_random5 = java.util.Collections.checkedNavigableSet((java.util.NavigableSet<java.util.Random>)treeset_random0, cls4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random_array1);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_random3);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test317"); }


    java.util.SortedSet<java.lang.Object[]> sortedset_obj_array0 = java.util.Collections.emptySortedSet();
    java.util.Set<java.lang.Object[]> set_obj_array1 = java.util.Collections.unmodifiableSet((java.util.Set<java.lang.Object[]>)sortedset_obj_array0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_obj_array0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array1);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test318"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str9 = treeset_str0.headSet("", false);
    int i11 = java.util.Collections.frequency((java.util.Collection<java.lang.String>)treeset_str0, (java.lang.Object)' ');
    java.util.TreeSet<java.lang.String> treeset_str12 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.lang.String str13 = treeset_str0.pollFirst();
    java.util.NavigableSet<java.lang.String> navigableset_str14 = treeset_str0.descendingSet();
    java.lang.String str16 = treeset_str0.higher("[]");

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str14);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test319"); }


    java.util.ArrayList<java.lang.Long> arraylist_long0 = new java.util.ArrayList<java.lang.Long>();
    java.lang.Long[] long_array5 = new java.lang.Long[] { (-1L), (-1L), 1L, 100L };
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long0, long_array5);
    boolean b9 = java.util.Collections.replaceAll((java.util.List<java.lang.Long>)arraylist_long0, (java.lang.Long)(-1L), (java.lang.Long)0L);
    boolean b12 = java.util.Collections.replaceAll((java.util.List<java.lang.Long>)arraylist_long0, (java.lang.Long)0L, (java.lang.Long)1L);
    java.lang.Long long13 = java.util.Collections.max((java.util.Collection<java.lang.Long>)arraylist_long0);
    boolean b16 = java.util.Collections.replaceAll((java.util.List<java.lang.Long>)arraylist_long0, (java.lang.Long)0L, (java.lang.Long)0L);
    java.lang.Long long17 = java.util.Collections.max((java.util.Collection<java.lang.Long>)arraylist_long0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L+ "'", long13.equals(100L));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L+ "'", long17.equals(100L));

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test320"); }


    java.util.ArrayList<java.lang.Integer> arraylist_i0 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array2 = new java.lang.Integer[] { (-1) };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i0, i_array2);
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array6 = new java.lang.Integer[] { 0 };
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array6);
    java.util.ArrayList<java.lang.Integer> arraylist_i8 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array10 = new java.lang.Integer[] { 1 };
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i8, i_array10);
    int i12 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i4, (java.util.List<java.lang.Integer>)arraylist_i8);
    int i13 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i0, (java.util.List<java.lang.Integer>)arraylist_i4);
    int i15 = java.util.Collections.binarySearch((java.util.List<java.lang.Integer>)arraylist_i4, (java.lang.Integer)(-2));
    int i17 = java.util.Collections.binarySearch((java.util.List<java.lang.Integer>)arraylist_i4, (java.lang.Integer)1);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-2));

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test321"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.lang.String str7 = treeset_str0.higher("hi!");
    java.lang.String str8 = treeset_str0.pollFirst();
    int i9 = treeset_str0.size();
    java.util.Iterator<java.lang.String> iterator_str10 = treeset_str0.descendingIterator();
    java.lang.String str12 = treeset_str0.lower("[hi!]");

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str10);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test322"); }


    java.util.Comparator<java.lang.Object> comparator_obj0 = null;
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>(comparator_obj0);
    java.lang.String str3 = treeset_str1.higher("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str6 = treeset_str1.headSet("hi!", false);
    java.util.TreeSet<java.lang.String> treeset_str7 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array10 = new java.lang.String[] { "", "" };
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str7, str_array10);
    java.util.Iterator<java.lang.String> iterator_str12 = treeset_str7.iterator();
    java.lang.String str14 = treeset_str7.higher("hi!");
    java.lang.String str15 = treeset_str7.pollFirst();
    java.lang.String str17 = treeset_str7.lower("");
    boolean b18 = treeset_str1.addAll((java.util.Collection<java.lang.String>)treeset_str7);
    java.util.Spliterator<java.lang.String> spliterator_str19 = treeset_str7.spliterator();
    java.util.Iterator<java.lang.String> iterator_str20 = treeset_str7.descendingIterator();
    java.util.stream.Stream<java.lang.String> stream_str21 = treeset_str7.stream();
    java.util.SortedSet<java.lang.String> sortedset_str23 = treeset_str7.tailSet("");
    java.util.TreeSet<java.lang.String> treeset_str24 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array27 = new java.lang.String[] { "", "" };
    boolean b28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str24, str_array27);
    java.util.SortedSet<java.lang.String> sortedset_str30 = treeset_str24.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str33 = treeset_str24.headSet("", false);
    int i35 = java.util.Collections.frequency((java.util.Collection<java.lang.String>)treeset_str24, (java.lang.Object)' ');
    boolean b36 = treeset_str7.addAll((java.util.Collection<java.lang.String>)treeset_str24);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str19);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str20);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str21);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str23);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array27);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str30);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str33);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test323"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str7 = treeset_str0.descendingSet();
    java.lang.String str9 = treeset_str0.floor("hi!");
    java.lang.String str10 = treeset_str0.pollFirst();
    java.util.Spliterator<java.lang.String> spliterator_str11 = treeset_str0.spliterator();
    java.lang.String str13 = treeset_str0.higher("hi!");

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str11);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test324"); }


    java.util.LinkedHashSet<java.lang.Object[]> linkedhashset_obj_array0 = new java.util.LinkedHashSet<java.lang.Object[]>();
    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    java.util.TreeSet<java.lang.String> treeset_str2 = new java.util.TreeSet<java.lang.String>(comparator_obj1);
    java.lang.String str4 = treeset_str2.higher("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str7 = treeset_str2.headSet("hi!", false);
    java.util.TreeSet<java.lang.String> treeset_str8 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array11 = new java.lang.String[] { "", "" };
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str8, str_array11);
    java.util.Iterator<java.lang.String> iterator_str13 = treeset_str8.iterator();
    java.lang.String str15 = treeset_str8.higher("hi!");
    java.lang.String str16 = treeset_str8.pollFirst();
    java.lang.String str18 = treeset_str8.lower("");
    boolean b19 = treeset_str2.addAll((java.util.Collection<java.lang.String>)treeset_str8);
    java.util.Iterator<java.lang.String> iterator_str20 = treeset_str8.iterator();
    int i21 = treeset_str8.size();
    treeset_str8.clear();
    java.util.TreeSet<java.lang.String> treeset_str23 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array26 = new java.lang.String[] { "", "" };
    boolean b27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str23, str_array26);
    java.util.SortedSet<java.lang.String> sortedset_str29 = treeset_str23.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str32 = treeset_str23.headSet("", false);
    int i34 = java.util.Collections.frequency((java.util.Collection<java.lang.String>)treeset_str23, (java.lang.Object)' ');
    java.util.TreeSet<java.lang.String> treeset_str35 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str23);
    boolean b36 = treeset_str8.equals((java.lang.Object)treeset_str23);
    java.util.ArrayList<java.lang.String> arraylist_str37 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array39 = new java.lang.String[] { "" };
    boolean b40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str37, str_array39);
    java.util.ArrayList<java.lang.Object> arraylist_obj41 = new java.util.ArrayList<java.lang.Object>();
    java.util.ArrayList<java.util.Random> arraylist_random45 = new java.util.ArrayList<java.util.Random>();
    java.util.Random[] random_array46 = new java.util.Random[] {  };
    boolean b47 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)arraylist_random45, random_array46);
    java.util.Collections.rotate((java.util.List<java.util.Random>)arraylist_random45, (int)(short)0);
    java.lang.Object[] obj_array59 = new java.lang.Object[] { 10.0f, ' ', 0L, arraylist_random45, (short)1, 100L, (short)0, (-1.0f), (-1L), 1.0f, 100.0f, (short)1, (-1.0f) };
    boolean b60 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>)arraylist_obj41, obj_array59);
    boolean b61 = arraylist_str37.retainAll((java.util.Collection<java.lang.Object>)arraylist_obj41);
    boolean b62 = treeset_str23.retainAll((java.util.Collection<java.lang.Object>)arraylist_obj41);
    java.lang.Boolean[] b_array63 = new java.lang.Boolean[] {  };
    boolean b64 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>)arraylist_obj41, b_array63);
    java.util.TreeSet<java.lang.String> treeset_str65 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array68 = new java.lang.String[] { "", "" };
    boolean b69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str65, str_array68);
    java.util.Iterator<java.lang.String> iterator_str70 = treeset_str65.iterator();
    java.lang.String str72 = treeset_str65.higher("hi!");
    java.lang.String str73 = treeset_str65.pollFirst();
    int i74 = treeset_str65.size();
    java.util.stream.Stream<java.lang.String> stream_str75 = treeset_str65.stream();
    java.util.NavigableSet<java.lang.String> navigableset_str78 = treeset_str65.tailSet("hi!", true);
    java.lang.Long[] long_array84 = new java.lang.Long[] { 1L, 1L, 100L, 0L, (-1L) };
    java.lang.Long[] long_array85 = treeset_str65.toArray(long_array84);
    java.lang.Object[][] obj_array_array86 = new java.lang.Object[][] { b_array63, long_array85 };
    boolean b87 = java.util.Collections.addAll((java.util.Collection<java.lang.Object[]>)linkedhashset_obj_array0, obj_array_array86);
    java.util.Set<java.lang.Object[]> set_obj_array88 = java.util.Collections.unmodifiableSet((java.util.Set<java.lang.Object[]>)linkedhashset_obj_array0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str13);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str20);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array26);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str29);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str32);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array39);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random_array46);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array59);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array63);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array68);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str70);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str72);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str73 + "' != '" + ""+ "'", str73.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str75);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str78);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array84);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array85);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array86);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array88);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test325"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str9 = treeset_str0.headSet("", false);
    int i11 = java.util.Collections.frequency((java.util.Collection<java.lang.String>)treeset_str0, (java.lang.Object)' ');
    java.util.TreeSet<java.lang.String> treeset_str12 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    boolean b14 = treeset_str12.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str15 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test326"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.lang.String str7 = treeset_str0.higher("hi!");
    treeset_str0.clear();
    java.util.Iterator<java.lang.String> iterator_str9 = treeset_str0.descendingIterator();
    java.util.Spliterator<java.lang.String> spliterator_str10 = treeset_str0.spliterator();
    int i11 = treeset_str0.size();
    java.util.SortedSet<java.lang.String> sortedset_str13 = treeset_str0.headSet("");
    java.lang.String str15 = treeset_str0.ceiling("");

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str10);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str13);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test327"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str7 = treeset_str0.descendingSet();
    java.lang.String str9 = treeset_str0.higher("");
    java.lang.String str11 = treeset_str0.ceiling("");
    java.util.Comparator<java.lang.String> comparator_str12 = null;
    java.lang.String str13 = java.util.Collections.min((java.util.Collection<java.lang.String>)treeset_str0, comparator_str12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test328"); }


    java.util.Comparator<java.lang.Object> comparator_obj0 = null;
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>(comparator_obj0);
    java.lang.String str3 = treeset_str1.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str5 = treeset_str1.headSet("");
    java.util.Iterator<java.lang.String> iterator_str6 = treeset_str1.descendingIterator();
    java.util.NavigableSet<java.lang.String> navigableset_str7 = treeset_str1.descendingSet();
    treeset_str1.clear();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str7);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test329"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.lang.String str7 = treeset_str0.higher("hi!");
    java.lang.String str8 = treeset_str0.pollFirst();
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    java.util.TreeSet<java.lang.String> treeset_str10 = new java.util.TreeSet<java.lang.String>(comparator_obj9);
    java.lang.String str12 = treeset_str10.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str14 = treeset_str10.headSet("");
    boolean b15 = treeset_str0.addAll((java.util.Collection<java.lang.String>)treeset_str10);
    java.lang.Object[] obj_array16 = treeset_str0.toArray();
    java.util.Comparator<?> comparator_obj17 = treeset_str0.comparator();
    java.util.Comparator<java.lang.Object> comparator_obj18 = null;
    java.util.TreeSet<java.lang.String> treeset_str19 = new java.util.TreeSet<java.lang.String>(comparator_obj18);
    java.lang.String str21 = treeset_str19.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str23 = treeset_str19.headSet("");
    java.util.TreeSet<java.lang.String> treeset_str24 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str19);
    boolean b25 = treeset_str0.addAll((java.util.Collection<java.lang.String>)treeset_str19);
    java.lang.String str27 = treeset_str0.floor("");

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str14);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_obj17);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str23);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test330"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.lang.String str7 = treeset_str0.higher("hi!");
    java.lang.String str8 = treeset_str0.pollFirst();
    int i9 = treeset_str0.size();
    java.util.stream.Stream<java.lang.String> stream_str10 = treeset_str0.stream();
    java.util.NavigableSet<java.lang.String> navigableset_str13 = treeset_str0.tailSet("hi!", true);
    java.util.Spliterator<java.lang.String> spliterator_str14 = treeset_str0.spliterator();
    java.util.NavigableSet<java.lang.String> navigableset_str17 = treeset_str0.headSet("", false);
    java.lang.String str19 = treeset_str0.lower("[hi!]");
    java.util.NavigableSet<java.lang.String> navigableset_str22 = treeset_str0.tailSet("", true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str10);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str13);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str14);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str17);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str22);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test331"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "hi!" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    boolean b5 = treeset_str0.isEmpty();
    java.util.NavigableSet<java.lang.String> navigableset_str8 = treeset_str0.tailSet("[]", true);
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)navigableset_str8);
    java.util.Comparator<java.lang.Object> comparator_obj10 = null;
    java.util.TreeSet<java.lang.String> treeset_str11 = new java.util.TreeSet<java.lang.String>(comparator_obj10);
    java.lang.String str13 = treeset_str11.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str15 = treeset_str11.headSet("");
    java.util.Iterator<java.lang.String> iterator_str16 = treeset_str11.descendingIterator();
    boolean b17 = treeset_str11.isEmpty();
    java.util.SortedSet<java.lang.String> sortedset_str19 = treeset_str11.tailSet("hi!");
    boolean b20 = treeset_str9.addAll((java.util.Collection<java.lang.String>)treeset_str11);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str8);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str15);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str16);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str19);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test332"); }


    java.util.ArrayDeque<java.lang.String> arraydeque_str0 = new java.util.ArrayDeque<java.lang.String>();
    java.lang.String[] str_array4 = new java.lang.String[] { "[hi!]", "[]", "" };
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraydeque_str0, str_array4);
    java.util.Queue<java.lang.String> queue_str6 = java.util.Collections.asLifoQueue((java.util.Deque<java.lang.String>)arraydeque_str0);
    java.util.Queue<java.lang.String> queue_str7 = java.util.Collections.asLifoQueue((java.util.Deque<java.lang.String>)arraydeque_str0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(queue_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(queue_str7);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test333"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array2);
    java.util.ArrayList<java.lang.Object> arraylist_obj4 = new java.util.ArrayList<java.lang.Object>();
    java.util.ArrayList<java.util.Random> arraylist_random8 = new java.util.ArrayList<java.util.Random>();
    java.util.Random[] random_array9 = new java.util.Random[] {  };
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)arraylist_random8, random_array9);
    java.util.Collections.rotate((java.util.List<java.util.Random>)arraylist_random8, (int)(short)0);
    java.lang.Object[] obj_array22 = new java.lang.Object[] { 10.0f, ' ', 0L, arraylist_random8, (short)1, 100L, (short)0, (-1.0f), (-1L), 1.0f, 100.0f, (short)1, (-1.0f) };
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>)arraylist_obj4, obj_array22);
    boolean b24 = arraylist_str0.retainAll((java.util.Collection<java.lang.Object>)arraylist_obj4);
    java.util.List<java.lang.String> list_str25 = java.util.Collections.synchronizedList((java.util.List<java.lang.String>)arraylist_str0);
    java.util.Collection<java.lang.String> collection_str26 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str0);
    java.util.Collections.shuffle((java.util.List<java.lang.String>)arraylist_str0);
    java.util.List<java.lang.String> list_str28 = java.util.Collections.synchronizedList((java.util.List<java.lang.String>)arraylist_str0);
    java.util.function.Predicate<java.lang.Object> predicate_obj29 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b30 = list_str28.removeIf(predicate_obj29);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }


    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random_array9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str25);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str26);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str28);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test334"); }


    java.util.ArrayDeque<java.lang.String> arraydeque_str0 = new java.util.ArrayDeque<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "[]", "[]" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraydeque_str0, str_array3);
    java.util.Queue<java.lang.String> queue_str5 = java.util.Collections.asLifoQueue((java.util.Deque<java.lang.String>)arraydeque_str0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(queue_str5);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test335"); }


    java.util.ArrayList<java.util.Collections> arraylist_collections0 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array1 = new java.util.Collections[] {  };
    boolean b2 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections0, collections_array1);
    java.util.Collections collections3 = null;
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    int i5 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections0, collections3, comparator_obj4);
    java.util.List<java.util.Collections> list_collections6 = java.util.Collections.unmodifiableList((java.util.List<java.util.Collections>)arraylist_collections0);
    java.util.Collections.reverse((java.util.List<java.util.Collections>)arraylist_collections0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array1);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_collections6);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test336"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.lang.String str7 = treeset_str0.higher("hi!");
    java.lang.String str8 = treeset_str0.pollFirst();
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    java.util.TreeSet<java.lang.String> treeset_str10 = new java.util.TreeSet<java.lang.String>(comparator_obj9);
    java.lang.String str12 = treeset_str10.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str14 = treeset_str10.headSet("");
    boolean b15 = treeset_str0.addAll((java.util.Collection<java.lang.String>)treeset_str10);
    java.util.TreeSet<java.lang.String> treeset_str16 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array19 = new java.lang.String[] { "", "" };
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str16, str_array19);
    java.util.Iterator<java.lang.String> iterator_str21 = treeset_str16.iterator();
    java.lang.String str23 = treeset_str16.higher("hi!");
    java.lang.String str24 = treeset_str16.pollFirst();
    int i25 = treeset_str16.size();
    java.util.stream.Stream<java.lang.String> stream_str26 = treeset_str16.stream();
    java.util.NavigableSet<java.lang.String> navigableset_str29 = treeset_str16.tailSet("hi!", true);
    boolean b30 = treeset_str0.addAll((java.util.Collection<java.lang.String>)navigableset_str29);
    java.lang.String str32 = treeset_str0.floor("[]");
    java.util.SortedSet<java.lang.String> sortedset_str34 = treeset_str0.tailSet("");

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str14);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str21);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str26);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str29);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str34);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test337"); }


    java.util.LinkedHashSet<java.lang.String> linkedhashset_str0 = new java.util.LinkedHashSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "hi!" };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str0, str_array2);
    java.util.ArrayList<java.util.Collections> arraylist_collections4 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array5 = new java.util.Collections[] {  };
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections4, collections_array5);
    java.util.Collections collections7 = null;
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    int i9 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections4, collections7, comparator_obj8);
    boolean b10 = linkedhashset_str0.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections4);
    java.util.Collections collections11 = null;
    java.util.Collections.fill((java.util.List<java.util.Collections>)arraylist_collections4, collections11);
    java.util.Collections collections13 = null;
    java.util.Comparator<java.lang.Object> comparator_obj14 = null;
    java.util.Comparator<java.lang.Object> comparator_obj15 = java.util.Collections.reverseOrder(comparator_obj14);
    int i16 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections4, collections13, comparator_obj15);
    java.util.Comparator<java.lang.Object> comparator_obj17 = java.util.Collections.reverseOrder(comparator_obj15);
    java.util.Comparator<java.lang.Object> comparator_obj18 = java.util.Collections.reverseOrder(comparator_obj17);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj15);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj17);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj18);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test338"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str7 = treeset_str0.descendingSet();
    boolean b9 = treeset_str0.add("");
    java.lang.String str11 = treeset_str0.ceiling("[hi!]");

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test339"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.lang.String str7 = treeset_str0.higher("hi!");
    java.lang.String str8 = treeset_str0.pollFirst();
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    java.util.TreeSet<java.lang.String> treeset_str10 = new java.util.TreeSet<java.lang.String>(comparator_obj9);
    java.lang.String str12 = treeset_str10.higher("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str14 = treeset_str10.headSet("");
    boolean b15 = treeset_str0.addAll((java.util.Collection<java.lang.String>)treeset_str10);
    java.util.TreeSet<java.lang.String> treeset_str16 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array19 = new java.lang.String[] { "", "" };
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str16, str_array19);
    java.util.Iterator<java.lang.String> iterator_str21 = treeset_str16.iterator();
    java.lang.String str23 = treeset_str16.higher("hi!");
    java.lang.String str24 = treeset_str16.pollFirst();
    int i25 = treeset_str16.size();
    java.util.stream.Stream<java.lang.String> stream_str26 = treeset_str16.stream();
    java.util.NavigableSet<java.lang.String> navigableset_str29 = treeset_str16.tailSet("hi!", true);
    boolean b30 = treeset_str0.addAll((java.util.Collection<java.lang.String>)navigableset_str29);
    java.lang.String str32 = treeset_str0.floor("[]");
    java.util.ArrayList<java.lang.String> arraylist_str33 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array35 = new java.lang.String[] { "" };
    boolean b36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str33, str_array35);
    java.util.ArrayList<java.lang.Object> arraylist_obj37 = new java.util.ArrayList<java.lang.Object>();
    java.util.ArrayList<java.util.Random> arraylist_random41 = new java.util.ArrayList<java.util.Random>();
    java.util.Random[] random_array42 = new java.util.Random[] {  };
    boolean b43 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)arraylist_random41, random_array42);
    java.util.Collections.rotate((java.util.List<java.util.Random>)arraylist_random41, (int)(short)0);
    java.lang.Object[] obj_array55 = new java.lang.Object[] { 10.0f, ' ', 0L, arraylist_random41, (short)1, 100L, (short)0, (-1.0f), (-1L), 1.0f, 100.0f, (short)1, (-1.0f) };
    boolean b56 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>)arraylist_obj37, obj_array55);
    boolean b57 = arraylist_str33.retainAll((java.util.Collection<java.lang.Object>)arraylist_obj37);
    java.util.Collection<java.lang.String> collection_str58 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str33);
    java.util.stream.Stream<java.lang.String> stream_str59 = arraylist_str33.stream();
    java.util.LinkedHashSet<java.lang.Integer> linkedhashset_i60 = new java.util.LinkedHashSet<java.lang.Integer>();
    java.lang.Integer[] i_array65 = new java.lang.Integer[] { 0, 0, 0, 0 };
    boolean b66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)linkedhashset_i60, i_array65);
    java.util.Set<java.lang.Integer> set_i67 = java.util.Collections.synchronizedSet((java.util.Set<java.lang.Integer>)linkedhashset_i60);
    java.util.ArrayList<java.lang.Boolean> arraylist_b68 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array71 = new java.lang.Boolean[] { false, false };
    boolean b72 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b68, b_array71);
    boolean b73 = java.util.Collections.disjoint((java.util.Collection<java.lang.Integer>)linkedhashset_i60, (java.util.Collection<java.lang.Boolean>)arraylist_b68);
    boolean b74 = arraylist_str33.containsAll((java.util.Collection<java.lang.Boolean>)arraylist_b68);
    java.util.List<java.lang.String> list_str75 = java.util.Collections.synchronizedList((java.util.List<java.lang.String>)arraylist_str33);
    java.util.stream.Stream<java.lang.String> stream_str76 = arraylist_str33.parallelStream();
    boolean b77 = treeset_str0.addAll((java.util.Collection<java.lang.String>)arraylist_str33);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str14);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str21);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str26);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str29);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array35);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random_array42);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array55);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str58);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str59);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array65);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_i67);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array71);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str75);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str76);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test340"); }


    java.util.ArrayList<java.lang.Object[]> arraylist_obj_array0 = new java.util.ArrayList<java.lang.Object[]>();
    java.lang.Object[][] obj_array_array1 = new java.lang.Object[][] {  };
    boolean b2 = java.util.Collections.addAll((java.util.Collection<java.lang.Object[]>)arraylist_obj_array0, obj_array_array1);
    java.util.Random random3 = null;
    java.util.Collections.shuffle((java.util.List<java.lang.Object[]>)arraylist_obj_array0, random3);
    java.util.Random random5 = null;
    java.util.Collections.shuffle((java.util.List<java.lang.Object[]>)arraylist_obj_array0, random5);
    java.util.Random random7 = null;
    java.util.Collections.shuffle((java.util.List<java.lang.Object[]>)arraylist_obj_array0, random7);
    java.util.Random random9 = null;
    java.util.Collections.shuffle((java.util.List<java.lang.Object[]>)arraylist_obj_array0, random9);
    java.util.Random random11 = null;
    java.util.Collections.shuffle((java.util.List<java.lang.Object[]>)arraylist_obj_array0, random11);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array1);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test341"); }


    java.util.ArrayList<java.lang.Boolean> arraylist_b0 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { true, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b0, b_array3);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b0);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b0);
    java.util.Comparator<java.lang.Object> comparator_obj7 = null;
    java.util.Comparator<java.lang.Object> comparator_obj8 = java.util.Collections.reverseOrder(comparator_obj7);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b0, comparator_obj8);
    java.util.ArrayList<java.lang.Integer> arraylist_i10 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array12 = new java.lang.Integer[] { (-1) };
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i10, i_array12);
    java.util.ArrayList<java.lang.Boolean> arraylist_b14 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array16 = new java.lang.Boolean[] { false };
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b14, b_array16);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b14);
    boolean b19 = java.util.Collections.disjoint((java.util.Collection<java.lang.Integer>)arraylist_i10, (java.util.Collection<java.lang.Boolean>)arraylist_b14);
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str20 = new java.util.LinkedHashSet<java.lang.String>();
    java.lang.String[] str_array22 = new java.lang.String[] { "hi!" };
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str20, str_array22);
    java.util.ArrayList<java.util.Collections> arraylist_collections24 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array25 = new java.util.Collections[] {  };
    boolean b26 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections24, collections_array25);
    java.util.Collections collections27 = null;
    java.util.Comparator<java.lang.Object> comparator_obj28 = null;
    int i29 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections24, collections27, comparator_obj28);
    boolean b30 = linkedhashset_str20.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections24);
    java.util.Collections collections31 = null;
    java.util.Collections.fill((java.util.List<java.util.Collections>)arraylist_collections24, collections31);
    java.util.Collections collections33 = null;
    java.util.Comparator<java.lang.Object> comparator_obj34 = null;
    java.util.Comparator<java.lang.Object> comparator_obj35 = java.util.Collections.reverseOrder(comparator_obj34);
    int i36 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections24, collections33, comparator_obj35);
    java.util.Comparator<java.lang.Object> comparator_obj37 = java.util.Collections.reverseOrder(comparator_obj35);
    java.util.Comparator<java.lang.Object> comparator_obj38 = java.util.Collections.reverseOrder(comparator_obj35);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b14, comparator_obj35);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b0, comparator_obj35);
    java.util.Comparator<java.lang.Object> comparator_obj41 = null;
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b0, comparator_obj41);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj8);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array16);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array22);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array25);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj35);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == (-1));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj37);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj38);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test342"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.lang.String str7 = treeset_str0.higher("hi!");
    java.lang.String str8 = treeset_str0.pollFirst();
    int i9 = treeset_str0.size();
    java.util.stream.Stream<java.lang.String> stream_str10 = treeset_str0.stream();
    java.util.NavigableSet<java.lang.String> navigableset_str13 = treeset_str0.tailSet("hi!", true);
    java.lang.Long[] long_array19 = new java.lang.Long[] { 1L, 1L, 100L, 0L, (-1L) };
    java.lang.Long[] long_array20 = treeset_str0.toArray(long_array19);
    java.util.Set<java.lang.Object[]> set_obj_array21 = java.util.Collections.singleton((java.lang.Object[])long_array20);
    java.util.Set<java.lang.Object[]> set_obj_array22 = java.util.Collections.singleton((java.lang.Object[])long_array20);
    java.util.Comparator<java.lang.Object[]> comparator_obj_array23 = null;
    java.lang.Object[] obj_array24 = java.util.Collections.max((java.util.Collection<java.lang.Object[]>)set_obj_array22, comparator_obj_array23);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str10);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str13);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array19);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array20);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array21);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array22);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test343"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str9 = treeset_str0.headSet("", false);
    int i11 = java.util.Collections.frequency((java.util.Collection<java.lang.String>)treeset_str0, (java.lang.Object)' ');
    java.util.TreeSet<java.lang.String> treeset_str12 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    treeset_str12.clear();
    java.lang.String str14 = treeset_str12.pollFirst();

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str9);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test344"); }


    java.util.ArrayList<java.lang.Boolean> arraylist_b0 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array2 = new java.lang.Boolean[] { false };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b0, b_array2);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b0);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b0);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b0);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b0);
    java.util.ArrayList<java.lang.String> arraylist_str8 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array10 = new java.lang.String[] { "" };
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str8, str_array10);
    java.util.ArrayList<java.lang.Object> arraylist_obj12 = new java.util.ArrayList<java.lang.Object>();
    java.util.ArrayList<java.util.Random> arraylist_random16 = new java.util.ArrayList<java.util.Random>();
    java.util.Random[] random_array17 = new java.util.Random[] {  };
    boolean b18 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)arraylist_random16, random_array17);
    java.util.Collections.rotate((java.util.List<java.util.Random>)arraylist_random16, (int)(short)0);
    java.lang.Object[] obj_array30 = new java.lang.Object[] { 10.0f, ' ', 0L, arraylist_random16, (short)1, 100L, (short)0, (-1.0f), (-1L), 1.0f, 100.0f, (short)1, (-1.0f) };
    boolean b31 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>)arraylist_obj12, obj_array30);
    boolean b32 = arraylist_str8.retainAll((java.util.Collection<java.lang.Object>)arraylist_obj12);
    java.util.Collection<java.lang.String> collection_str33 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str8);
    java.util.stream.Stream<java.lang.String> stream_str34 = arraylist_str8.stream();
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str35 = new java.util.LinkedHashSet<java.lang.String>();
    java.lang.String[] str_array37 = new java.lang.String[] { "hi!" };
    boolean b38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str35, str_array37);
    java.util.ArrayList<java.util.Collections> arraylist_collections39 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array40 = new java.util.Collections[] {  };
    boolean b41 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections39, collections_array40);
    java.util.Collections collections42 = null;
    java.util.Comparator<java.lang.Object> comparator_obj43 = null;
    int i44 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections39, collections42, comparator_obj43);
    boolean b45 = linkedhashset_str35.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections39);
    java.util.Collections collections46 = null;
    java.util.Collections.fill((java.util.List<java.util.Collections>)arraylist_collections39, collections46);
    java.util.Collections collections48 = null;
    java.util.Comparator<java.lang.Object> comparator_obj49 = null;
    java.util.Comparator<java.lang.Object> comparator_obj50 = java.util.Collections.reverseOrder(comparator_obj49);
    int i51 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections39, collections48, comparator_obj50);
    java.util.Comparator<java.lang.Object> comparator_obj52 = java.util.Collections.reverseOrder(comparator_obj50);
    int i53 = java.util.Collections.frequency((java.util.Collection<java.lang.String>)arraylist_str8, (java.lang.Object)comparator_obj50);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b0, comparator_obj50);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test345"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.lang.String str7 = treeset_str0.higher("hi!");
    treeset_str0.clear();
    java.util.Iterator<java.lang.String> iterator_str9 = treeset_str0.descendingIterator();
    java.util.Spliterator<java.lang.String> spliterator_str10 = treeset_str0.spliterator();
    int i11 = treeset_str0.size();
    java.lang.String str12 = treeset_str0.toString();
    java.lang.String str14 = treeset_str0.lower("[]");
    java.util.SortedSet<java.lang.String> sortedset_str17 = treeset_str0.subSet("[]", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str17);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test346"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.lang.String str7 = treeset_str0.higher("hi!");
    java.lang.String str8 = treeset_str0.pollFirst();
    int i9 = treeset_str0.size();
    java.util.stream.Stream<java.lang.String> stream_str10 = treeset_str0.stream();
    java.util.NavigableSet<java.lang.String> navigableset_str13 = treeset_str0.tailSet("hi!", true);
    java.lang.Long[] long_array19 = new java.lang.Long[] { 1L, 1L, 100L, 0L, (-1L) };
    java.lang.Long[] long_array20 = treeset_str0.toArray(long_array19);
    java.util.NavigableSet<java.lang.String> navigableset_str25 = treeset_str0.subSet("", false, "", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str25);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test347"); }


    java.util.List<java.lang.Boolean> list_b0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Collections.sort(list_b0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test348"); }


    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str0, str_array3);
    java.util.Iterator<java.lang.String> iterator_str5 = treeset_str0.iterator();
    java.util.TreeSet<java.lang.String> treeset_str6 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array9 = new java.lang.String[] { "", "" };
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str6, str_array9);
    java.util.Iterator<java.lang.String> iterator_str11 = treeset_str6.iterator();
    java.lang.String str13 = treeset_str6.higher("hi!");
    java.lang.String str14 = treeset_str6.pollFirst();
    int i15 = treeset_str6.size();
    java.util.stream.Stream<java.lang.String> stream_str16 = treeset_str6.stream();
    java.util.NavigableSet<java.lang.String> navigableset_str19 = treeset_str6.tailSet("hi!", true);
    java.lang.Long[] long_array25 = new java.lang.Long[] { 1L, 1L, 100L, 0L, (-1L) };
    java.lang.Long[] long_array26 = treeset_str6.toArray(long_array25);
    java.util.Set<java.lang.Object[]> set_obj_array27 = java.util.Collections.singleton((java.lang.Object[])long_array26);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Long[] long_array28 = treeset_str0.toArray(long_array26);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException");
    } catch (java.lang.ArrayStoreException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayStoreException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array27);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test349"); }


    java.util.Collection<java.lang.String> collection_str0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>(collection_str0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test350"); }


    java.util.List<java.lang.Integer> list_i0 = null;
    java.util.ArrayList<java.lang.Integer> arraylist_i1 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array3 = new java.lang.Integer[] { (-1) };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i1, i_array3);
    java.util.ArrayList<java.lang.Boolean> arraylist_b5 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array7 = new java.lang.Boolean[] { false };
    boolean b8 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b5, b_array7);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b5);
    boolean b10 = java.util.Collections.disjoint((java.util.Collection<java.lang.Integer>)arraylist_i1, (java.util.Collection<java.lang.Boolean>)arraylist_b5);
    java.util.ArrayList<java.lang.Integer> arraylist_i11 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array13 = new java.lang.Integer[] { 0 };
    boolean b14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i11, i_array13);
    java.util.ArrayList<java.lang.Integer> arraylist_i15 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array17 = new java.lang.Integer[] { 1 };
    boolean b18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i15, i_array17);
    int i19 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i11, (java.util.List<java.lang.Integer>)arraylist_i15);
    java.util.ArrayList<java.lang.Integer> arraylist_i20 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array22 = new java.lang.Integer[] { (-1) };
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i20, i_array22);
    java.util.ArrayList<java.lang.Integer> arraylist_i24 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array26 = new java.lang.Integer[] { 0 };
    boolean b27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i24, i_array26);
    java.util.ArrayList<java.lang.Integer> arraylist_i28 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array30 = new java.lang.Integer[] { 1 };
    boolean b31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i28, i_array30);
    int i32 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i24, (java.util.List<java.lang.Integer>)arraylist_i28);
    int i33 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i20, (java.util.List<java.lang.Integer>)arraylist_i24);
    int i34 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i15, (java.util.List<java.lang.Integer>)arraylist_i20);
    java.util.ArrayList<java.lang.Integer> arraylist_i35 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array37 = new java.lang.Integer[] { (-1) };
    boolean b38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i35, i_array37);
    java.util.ArrayList<java.lang.Boolean> arraylist_b39 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array41 = new java.lang.Boolean[] { false };
    boolean b42 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b39, b_array41);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b39);
    boolean b44 = java.util.Collections.disjoint((java.util.Collection<java.lang.Integer>)arraylist_i35, (java.util.Collection<java.lang.Boolean>)arraylist_b39);
    boolean b45 = java.util.Collections.disjoint((java.util.Collection<java.lang.Integer>)arraylist_i15, (java.util.Collection<java.lang.Boolean>)arraylist_b39);
    java.util.ArrayList<java.lang.Integer> arraylist_i46 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array48 = new java.lang.Integer[] { 0 };
    boolean b49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i46, i_array48);
    java.util.ArrayList<java.lang.Integer> arraylist_i50 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array52 = new java.lang.Integer[] { 1 };
    boolean b53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i50, i_array52);
    int i54 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i46, (java.util.List<java.lang.Integer>)arraylist_i50);
    int i55 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i15, (java.util.List<java.lang.Integer>)arraylist_i46);
    int i56 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i1, (java.util.List<java.lang.Integer>)arraylist_i15);
    java.util.LinkedHashSet<java.lang.Integer> linkedhashset_i57 = new java.util.LinkedHashSet<java.lang.Integer>();
    java.lang.Integer[] i_array62 = new java.lang.Integer[] { 0, 0, 0, 0 };
    boolean b63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)linkedhashset_i57, i_array62);
    java.util.Set<java.lang.Integer> set_i64 = java.util.Collections.synchronizedSet((java.util.Set<java.lang.Integer>)linkedhashset_i57);
    java.util.ArrayList<java.lang.Boolean> arraylist_b65 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array68 = new java.lang.Boolean[] { false, false };
    boolean b69 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b65, b_array68);
    boolean b70 = java.util.Collections.disjoint((java.util.Collection<java.lang.Integer>)linkedhashset_i57, (java.util.Collection<java.lang.Boolean>)arraylist_b65);
    boolean b71 = java.util.Collections.disjoint((java.util.Collection<java.lang.Integer>)arraylist_i1, (java.util.Collection<java.lang.Boolean>)arraylist_b65);
    // The following exception was thrown during execution in test generation
    try {
    int i72 = java.util.Collections.indexOfSubList(list_i0, (java.util.List<java.lang.Integer>)arraylist_i1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_i64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test351"); }


    java.util.ArrayList<java.lang.Integer> arraylist_i0 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array2 = new java.lang.Integer[] { 0 };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i0, i_array2);
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array6 = new java.lang.Integer[] { 1 };
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array6);
    int i8 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i0, (java.util.List<java.lang.Integer>)arraylist_i4);
    java.lang.Integer i9 = java.util.Collections.min((java.util.Collection<java.lang.Integer>)arraylist_i4);
    java.util.ArrayList<java.lang.Integer> arraylist_i10 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array12 = new java.lang.Integer[] { (-1) };
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i10, i_array12);
    java.util.ArrayList<java.lang.Boolean> arraylist_b14 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array16 = new java.lang.Boolean[] { false };
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b14, b_array16);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b14);
    boolean b19 = java.util.Collections.disjoint((java.util.Collection<java.lang.Integer>)arraylist_i10, (java.util.Collection<java.lang.Boolean>)arraylist_b14);
    java.util.ArrayList<java.lang.Integer> arraylist_i20 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array22 = new java.lang.Integer[] { 0 };
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i20, i_array22);
    java.util.ArrayList<java.lang.Integer> arraylist_i24 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array26 = new java.lang.Integer[] { 1 };
    boolean b27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i24, i_array26);
    int i28 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i20, (java.util.List<java.lang.Integer>)arraylist_i24);
    java.util.ArrayList<java.lang.Integer> arraylist_i29 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array31 = new java.lang.Integer[] { (-1) };
    boolean b32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i29, i_array31);
    java.util.ArrayList<java.lang.Integer> arraylist_i33 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array35 = new java.lang.Integer[] { 0 };
    boolean b36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i33, i_array35);
    java.util.ArrayList<java.lang.Integer> arraylist_i37 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array39 = new java.lang.Integer[] { 1 };
    boolean b40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i37, i_array39);
    int i41 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i33, (java.util.List<java.lang.Integer>)arraylist_i37);
    int i42 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i29, (java.util.List<java.lang.Integer>)arraylist_i33);
    int i43 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i24, (java.util.List<java.lang.Integer>)arraylist_i29);
    java.util.ArrayList<java.lang.Integer> arraylist_i44 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array46 = new java.lang.Integer[] { (-1) };
    boolean b47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i44, i_array46);
    java.util.ArrayList<java.lang.Boolean> arraylist_b48 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array50 = new java.lang.Boolean[] { false };
    boolean b51 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b48, b_array50);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b48);
    boolean b53 = java.util.Collections.disjoint((java.util.Collection<java.lang.Integer>)arraylist_i44, (java.util.Collection<java.lang.Boolean>)arraylist_b48);
    boolean b54 = java.util.Collections.disjoint((java.util.Collection<java.lang.Integer>)arraylist_i24, (java.util.Collection<java.lang.Boolean>)arraylist_b48);
    java.util.ArrayList<java.lang.Integer> arraylist_i55 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array57 = new java.lang.Integer[] { 0 };
    boolean b58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i55, i_array57);
    java.util.ArrayList<java.lang.Integer> arraylist_i59 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array61 = new java.lang.Integer[] { 1 };
    boolean b62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i59, i_array61);
    int i63 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i55, (java.util.List<java.lang.Integer>)arraylist_i59);
    int i64 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i24, (java.util.List<java.lang.Integer>)arraylist_i55);
    int i65 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i10, (java.util.List<java.lang.Integer>)arraylist_i24);
    int i66 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i4, (java.util.List<java.lang.Integer>)arraylist_i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 1+ "'", i9.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == (-1));

  }

}
