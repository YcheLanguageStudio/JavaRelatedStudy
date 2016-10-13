
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test01"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil9 = new util.IntArrayUtil();
    int[] i_array10 = new int[] {  };
    int i12 = intArrayUtil9.findKthLargestViaQuickSort(i_array10, (-1));
    int[] i_array16 = new int[] { '4', (byte)0 };
    int i17 = intArrayUtil9.findMinSubArrayLen(0, i_array16);
    int i18 = intArrayUtil0.removeDuplicateElements(i_array16);
    util.IntArrayUtil intArrayUtil20 = new util.IntArrayUtil();
    int[] i_array21 = new int[] {  };
    int i23 = intArrayUtil20.findKthLargestViaQuickSort(i_array21, (-1));
    int[] i_array27 = new int[] { '4', (byte)0 };
    int i28 = intArrayUtil20.findMinSubArrayLen(0, i_array27);
    int i29 = intArrayUtil0.findMinSubArrayLen((int)(short)0, i_array27);
    util.IntArrayUtil intArrayUtil30 = new util.IntArrayUtil();
    int[] i_array31 = new int[] {  };
    int i33 = intArrayUtil30.findKthLargestViaQuickSort(i_array31, (-1));
    int[] i_array37 = new int[] { '4', (byte)0 };
    int i38 = intArrayUtil30.findMinSubArrayLen(0, i_array37);
    intArrayUtil0.getNextPermutationNumber(i_array37);
    util.IntArrayUtil intArrayUtil41 = new util.IntArrayUtil();
    int[] i_array42 = new int[] {  };
    int i44 = intArrayUtil41.findKthLargestViaQuickSort(i_array42, (-1));
    int[] i_array48 = new int[] { '4', (byte)0 };
    int i49 = intArrayUtil41.findMinSubArrayLen(0, i_array48);
    util.IntArrayUtil intArrayUtil50 = new util.IntArrayUtil();
    int[] i_array51 = new int[] {  };
    int i53 = intArrayUtil50.findKthLargestViaQuickSort(i_array51, (-1));
    int[] i_array57 = new int[] { '4', (byte)0 };
    int i58 = intArrayUtil50.findMinSubArrayLen(0, i_array57);
    int i59 = intArrayUtil41.removeDuplicateElements(i_array57);
    util.IntArrayUtil intArrayUtil61 = new util.IntArrayUtil();
    int[] i_array62 = new int[] {  };
    int i64 = intArrayUtil61.findKthLargestViaQuickSort(i_array62, (-1));
    int[] i_array68 = new int[] { '4', (byte)0 };
    int i69 = intArrayUtil61.findMinSubArrayLen(0, i_array68);
    int i70 = intArrayUtil41.findMinSubArrayLen((int)(short)0, i_array68);
    util.IntArrayUtil intArrayUtil71 = new util.IntArrayUtil();
    int[] i_array72 = new int[] {  };
    int i74 = intArrayUtil71.findKthLargestViaQuickSort(i_array72, (-1));
    intArrayUtil41.getNextPermutationNumber(i_array72);
    int i76 = intArrayUtil0.findMinSubArrayLen((-5), i_array72);
    int[] i_array78 = null;
    int i79 = intArrayUtil0.findMinSubArrayLen(6, i_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 0);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test02"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil9 = new util.IntArrayUtil();
    int[] i_array10 = new int[] {  };
    int i12 = intArrayUtil9.findKthLargestViaQuickSort(i_array10, (-1));
    int[] i_array16 = new int[] { '4', (byte)0 };
    int i17 = intArrayUtil9.findMinSubArrayLen(0, i_array16);
    int i18 = intArrayUtil0.removeDuplicateElements(i_array16);
    int[] i_array19 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i21 = intArrayUtil0.threeSumClosest(i_array19, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test03"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    util.IntArrayUtil intArrayUtil4 = new util.IntArrayUtil();
    int[] i_array5 = new int[] {  };
    int i7 = intArrayUtil4.findKthLargestViaQuickSort(i_array5, (-1));
    int[] i_array11 = new int[] { '4', (byte)0 };
    int i12 = intArrayUtil4.findMinSubArrayLen(0, i_array11);
    util.IntArrayUtil intArrayUtil13 = new util.IntArrayUtil();
    int[] i_array14 = new int[] {  };
    int i16 = intArrayUtil13.findKthLargestViaQuickSort(i_array14, (-1));
    int[] i_array20 = new int[] { '4', (byte)0 };
    int i21 = intArrayUtil13.findMinSubArrayLen(0, i_array20);
    int i22 = intArrayUtil4.removeDuplicateElements(i_array20);
    util.IntArrayUtil intArrayUtil24 = new util.IntArrayUtil();
    int[] i_array25 = new int[] {  };
    int i27 = intArrayUtil24.findKthLargestViaQuickSort(i_array25, (-1));
    int[] i_array31 = new int[] { '4', (byte)0 };
    int i32 = intArrayUtil24.findMinSubArrayLen(0, i_array31);
    int i33 = intArrayUtil4.findMinSubArrayLen((int)(short)0, i_array31);
    util.IntArrayUtil intArrayUtil34 = new util.IntArrayUtil();
    int[] i_array35 = new int[] {  };
    int i37 = intArrayUtil34.findKthLargestViaQuickSort(i_array35, (-1));
    int[] i_array41 = new int[] { '4', (byte)0 };
    int i42 = intArrayUtil34.findMinSubArrayLen(0, i_array41);
    intArrayUtil4.getNextPermutationNumber(i_array41);
    int i45 = intArrayUtil0.threeSumClosest(i_array41, (int)(short)10);
    util.IntArrayUtil intArrayUtil46 = new util.IntArrayUtil();
    int[] i_array47 = new int[] {  };
    int i49 = intArrayUtil46.findKthLargestViaQuickSort(i_array47, (-1));
    int[] i_array53 = new int[] { '4', (byte)0 };
    int i54 = intArrayUtil46.findMinSubArrayLen(0, i_array53);
    util.IntArrayUtil intArrayUtil55 = new util.IntArrayUtil();
    int[] i_array56 = new int[] {  };
    int i58 = intArrayUtil55.findKthLargestViaQuickSort(i_array56, (-1));
    int[] i_array62 = new int[] { '4', (byte)0 };
    int i63 = intArrayUtil55.findMinSubArrayLen(0, i_array62);
    int i65 = intArrayUtil46.threeSumClosest(i_array62, (int)(short)100);
    intArrayUtil0.getNextPermutationNumber(i_array62);
    util.IntArrayUtil intArrayUtil67 = new util.IntArrayUtil();
    int[] i_array68 = new int[] {  };
    int i70 = intArrayUtil67.findKthLargestViaQuickSort(i_array68, (-1));
    int[] i_array74 = new int[] { '4', (byte)0 };
    int i75 = intArrayUtil67.findMinSubArrayLen(0, i_array74);
    util.IntArrayUtil intArrayUtil77 = new util.IntArrayUtil();
    int[] i_array78 = new int[] {  };
    int i80 = intArrayUtil77.findKthLargestViaQuickSort(i_array78, (-1));
    int i81 = intArrayUtil67.findMinSubArrayLen((int)(byte)-1, i_array78);
    util.IntArrayUtil intArrayUtil82 = new util.IntArrayUtil();
    int[] i_array83 = new int[] {  };
    int i85 = intArrayUtil82.findKthLargestViaQuickSort(i_array83, (-1));
    int[] i_array89 = new int[] { '4', (byte)0 };
    int i90 = intArrayUtil82.findMinSubArrayLen(0, i_array89);
    int i92 = intArrayUtil67.threeSumClosest(i_array89, (int)(byte)100);
    int i94 = intArrayUtil0.threeSumClosest(i_array89, 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i90 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i92 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i94 == 0);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test04"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil9 = new util.IntArrayUtil();
    int[] i_array10 = new int[] {  };
    int i12 = intArrayUtil9.findKthLargestViaQuickSort(i_array10, (-1));
    int[] i_array16 = new int[] { '4', (byte)0 };
    int i17 = intArrayUtil9.findMinSubArrayLen(0, i_array16);
    int i19 = intArrayUtil0.threeSumClosest(i_array16, (int)(short)100);
    int[] i_array20 = null;
    int i21 = intArrayUtil0.findMinViaIteration(i_array20);
    int[] i_array22 = null;
    int i23 = intArrayUtil0.findMinViaIteration(i_array22);
    util.IntArrayUtil intArrayUtil24 = new util.IntArrayUtil();
    util.IntArrayUtil intArrayUtil26 = new util.IntArrayUtil();
    int[] i_array27 = new int[] {  };
    int i29 = intArrayUtil26.findKthLargestViaQuickSort(i_array27, (-1));
    int[] i_array33 = new int[] { '4', (byte)0 };
    int i34 = intArrayUtil26.findMinSubArrayLen(0, i_array33);
    util.IntArrayUtil intArrayUtil35 = new util.IntArrayUtil();
    int[] i_array36 = new int[] {  };
    int i38 = intArrayUtil35.findKthLargestViaQuickSort(i_array36, (-1));
    int[] i_array42 = new int[] { '4', (byte)0 };
    int i43 = intArrayUtil35.findMinSubArrayLen(0, i_array42);
    util.IntArrayUtil intArrayUtil44 = new util.IntArrayUtil();
    int[] i_array45 = new int[] {  };
    int i47 = intArrayUtil44.findKthLargestViaQuickSort(i_array45, (-1));
    int[] i_array51 = new int[] { '4', (byte)0 };
    int i52 = intArrayUtil44.findMinSubArrayLen(0, i_array51);
    int i53 = intArrayUtil35.removeDuplicateElements(i_array51);
    util.IntArrayUtil intArrayUtil55 = new util.IntArrayUtil();
    int[] i_array56 = new int[] {  };
    int i58 = intArrayUtil55.findKthLargestViaQuickSort(i_array56, (-1));
    int[] i_array62 = new int[] { '4', (byte)0 };
    int i63 = intArrayUtil55.findMinSubArrayLen(0, i_array62);
    int i64 = intArrayUtil35.findMinSubArrayLen((int)(short)0, i_array62);
    int i65 = intArrayUtil26.removeDuplicateElements(i_array62);
    util.IntArrayUtil intArrayUtil66 = new util.IntArrayUtil();
    int[] i_array67 = new int[] {  };
    int i69 = intArrayUtil66.findKthLargestViaQuickSort(i_array67, (-1));
    int i70 = intArrayUtil26.removeDuplicateElements(i_array67);
    int i71 = intArrayUtil24.findMinSubArrayLen((int)'a', i_array67);
    intArrayUtil0.getNextPermutationNumber(i_array67);
    int[] i_array73 = null;
    int i74 = intArrayUtil0.findMinViaIteration(i_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == (-1));

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test05"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    int[] i_array9 = null;
    intArrayUtil0.getNextPermutationNumber(i_array9);
    int[] i_array11 = null;
    int i12 = intArrayUtil0.removeDuplicateElements(i_array11);
    util.IntArrayUtil intArrayUtil13 = new util.IntArrayUtil();
    int[] i_array14 = new int[] {  };
    int i16 = intArrayUtil13.findKthLargestViaQuickSort(i_array14, (-1));
    util.IntArrayUtil intArrayUtil17 = new util.IntArrayUtil();
    int[] i_array18 = new int[] {  };
    int i20 = intArrayUtil17.findKthLargestViaQuickSort(i_array18, (-1));
    int[] i_array24 = new int[] { '4', (byte)0 };
    int i25 = intArrayUtil17.findMinSubArrayLen(0, i_array24);
    util.IntArrayUtil intArrayUtil26 = new util.IntArrayUtil();
    int[] i_array27 = new int[] {  };
    int i29 = intArrayUtil26.findKthLargestViaQuickSort(i_array27, (-1));
    int[] i_array33 = new int[] { '4', (byte)0 };
    int i34 = intArrayUtil26.findMinSubArrayLen(0, i_array33);
    int i36 = intArrayUtil17.threeSumClosest(i_array33, (int)(short)100);
    int i37 = intArrayUtil13.removeDuplicateElements(i_array33);
    int[] i_array39 = null;
    int i40 = intArrayUtil13.findMinSubArrayLen((int)(short)0, i_array39);
    int[] i_array42 = null;
    int i43 = intArrayUtil13.findMinSubArrayLen((int)(byte)0, i_array42);
    util.IntArrayUtil intArrayUtil44 = new util.IntArrayUtil();
    int[] i_array45 = new int[] {  };
    int i47 = intArrayUtil44.findKthLargestViaQuickSort(i_array45, (-1));
    int[] i_array51 = new int[] { '4', (byte)0 };
    int i52 = intArrayUtil44.findMinSubArrayLen(0, i_array51);
    util.IntArrayUtil intArrayUtil53 = new util.IntArrayUtil();
    int[] i_array54 = new int[] {  };
    int i56 = intArrayUtil53.findKthLargestViaQuickSort(i_array54, (-1));
    int[] i_array60 = new int[] { '4', (byte)0 };
    int i61 = intArrayUtil53.findMinSubArrayLen(0, i_array60);
    int i62 = intArrayUtil44.removeDuplicateElements(i_array60);
    util.IntArrayUtil intArrayUtil64 = new util.IntArrayUtil();
    int[] i_array65 = new int[] {  };
    int i67 = intArrayUtil64.findKthLargestViaQuickSort(i_array65, (-1));
    int[] i_array71 = new int[] { '4', (byte)0 };
    int i72 = intArrayUtil64.findMinSubArrayLen(0, i_array71);
    int i73 = intArrayUtil44.findMinSubArrayLen((int)(short)0, i_array71);
    util.IntArrayUtil intArrayUtil74 = new util.IntArrayUtil();
    int[] i_array75 = new int[] {  };
    int i77 = intArrayUtil74.findKthLargestViaQuickSort(i_array75, (-1));
    int[] i_array81 = new int[] { '4', (byte)0 };
    int i82 = intArrayUtil74.findMinSubArrayLen(0, i_array81);
    int i83 = intArrayUtil44.findMinViaRecursion(i_array81);
    int i85 = intArrayUtil13.threeSumClosest(i_array81, (int)(short)0);
    intArrayUtil0.getNextPermutationNumber(i_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 0);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test06"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil9 = new util.IntArrayUtil();
    int[] i_array10 = new int[] {  };
    int i12 = intArrayUtil9.findKthLargestViaQuickSort(i_array10, (-1));
    int[] i_array16 = new int[] { '4', (byte)0 };
    int i17 = intArrayUtil9.findMinSubArrayLen(0, i_array16);
    int i19 = intArrayUtil0.threeSumClosest(i_array16, (int)(short)100);
    int[] i_array20 = null;
    int i21 = intArrayUtil0.findMinViaIteration(i_array20);
    util.IntArrayUtil intArrayUtil22 = new util.IntArrayUtil();
    int[] i_array23 = new int[] {  };
    int i25 = intArrayUtil22.findKthLargestViaQuickSort(i_array23, (-1));
    int[] i_array29 = new int[] { '4', (byte)0 };
    int i30 = intArrayUtil22.findMinSubArrayLen(0, i_array29);
    util.IntArrayUtil intArrayUtil31 = new util.IntArrayUtil();
    int[] i_array32 = new int[] {  };
    int i34 = intArrayUtil31.findKthLargestViaQuickSort(i_array32, (-1));
    int[] i_array38 = new int[] { '4', (byte)0 };
    int i39 = intArrayUtil31.findMinSubArrayLen(0, i_array38);
    int i40 = intArrayUtil22.removeDuplicateElements(i_array38);
    util.IntArrayUtil intArrayUtil42 = new util.IntArrayUtil();
    int[] i_array43 = new int[] {  };
    int i45 = intArrayUtil42.findKthLargestViaQuickSort(i_array43, (-1));
    int[] i_array49 = new int[] { '4', (byte)0 };
    int i50 = intArrayUtil42.findMinSubArrayLen(0, i_array49);
    int i51 = intArrayUtil22.findMinSubArrayLen((int)(short)0, i_array49);
    util.IntArrayUtil intArrayUtil52 = new util.IntArrayUtil();
    int[] i_array53 = new int[] {  };
    int i55 = intArrayUtil52.findKthLargestViaQuickSort(i_array53, (-1));
    int i56 = intArrayUtil22.findMinViaIteration(i_array53);
    util.IntArrayUtil intArrayUtil57 = new util.IntArrayUtil();
    int[] i_array58 = new int[] {  };
    int i60 = intArrayUtil57.findKthLargestViaQuickSort(i_array58, (-1));
    int[] i_array64 = new int[] { '4', (byte)0 };
    int i65 = intArrayUtil57.findMinSubArrayLen(0, i_array64);
    util.IntArrayUtil intArrayUtil66 = new util.IntArrayUtil();
    int[] i_array67 = new int[] {  };
    int i69 = intArrayUtil66.findKthLargestViaQuickSort(i_array67, (-1));
    int[] i_array73 = new int[] { '4', (byte)0 };
    int i74 = intArrayUtil66.findMinSubArrayLen(0, i_array73);
    int i75 = intArrayUtil57.removeDuplicateElements(i_array73);
    util.IntArrayUtil intArrayUtil77 = new util.IntArrayUtil();
    int[] i_array78 = new int[] {  };
    int i80 = intArrayUtil77.findKthLargestViaQuickSort(i_array78, (-1));
    int[] i_array84 = new int[] { '4', (byte)0 };
    int i85 = intArrayUtil77.findMinSubArrayLen(0, i_array84);
    int i86 = intArrayUtil57.findMinSubArrayLen((int)(short)0, i_array84);
    util.IntArrayUtil intArrayUtil87 = new util.IntArrayUtil();
    int[] i_array88 = new int[] {  };
    int i90 = intArrayUtil87.findKthLargestViaQuickSort(i_array88, (-1));
    int i92 = intArrayUtil57.threeSumClosest(i_array88, 1);
    intArrayUtil22.getNextPermutationNumber(i_array88);
    int i94 = intArrayUtil0.removeDuplicateElements(i_array88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i86 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i90 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i92 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i94 == 0);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test07"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil10 = new util.IntArrayUtil();
    int[] i_array11 = new int[] {  };
    int i13 = intArrayUtil10.findKthLargestViaQuickSort(i_array11, (-1));
    int i14 = intArrayUtil0.findMinSubArrayLen((int)(byte)-1, i_array11);
    util.IntArrayUtil intArrayUtil15 = new util.IntArrayUtil();
    int[] i_array16 = new int[] {  };
    int i18 = intArrayUtil15.findKthLargestViaQuickSort(i_array16, (-1));
    int[] i_array22 = new int[] { '4', (byte)0 };
    int i23 = intArrayUtil15.findMinSubArrayLen(0, i_array22);
    util.IntArrayUtil intArrayUtil24 = new util.IntArrayUtil();
    int[] i_array25 = new int[] {  };
    int i27 = intArrayUtil24.findKthLargestViaQuickSort(i_array25, (-1));
    int[] i_array31 = new int[] { '4', (byte)0 };
    int i32 = intArrayUtil24.findMinSubArrayLen(0, i_array31);
    int i33 = intArrayUtil15.removeDuplicateElements(i_array31);
    util.IntArrayUtil intArrayUtil34 = new util.IntArrayUtil();
    int[] i_array35 = new int[] {  };
    int i37 = intArrayUtil34.findKthLargestViaQuickSort(i_array35, (-1));
    int i39 = intArrayUtil15.findKthLargestViaQuickSort(i_array35, (-2));
    util.IntArrayUtil intArrayUtil40 = new util.IntArrayUtil();
    int[] i_array41 = new int[] {  };
    int i43 = intArrayUtil40.findKthLargestViaQuickSort(i_array41, (-1));
    int[] i_array47 = new int[] { '4', (byte)0 };
    int i48 = intArrayUtil40.findMinSubArrayLen(0, i_array47);
    util.IntArrayUtil intArrayUtil49 = new util.IntArrayUtil();
    int[] i_array50 = new int[] {  };
    int i52 = intArrayUtil49.findKthLargestViaQuickSort(i_array50, (-1));
    int[] i_array56 = new int[] { '4', (byte)0 };
    int i57 = intArrayUtil49.findMinSubArrayLen(0, i_array56);
    util.IntArrayUtil intArrayUtil58 = new util.IntArrayUtil();
    int[] i_array59 = new int[] {  };
    int i61 = intArrayUtil58.findKthLargestViaQuickSort(i_array59, (-1));
    int[] i_array65 = new int[] { '4', (byte)0 };
    int i66 = intArrayUtil58.findMinSubArrayLen(0, i_array65);
    int i67 = intArrayUtil49.removeDuplicateElements(i_array65);
    util.IntArrayUtil intArrayUtil69 = new util.IntArrayUtil();
    int[] i_array70 = new int[] {  };
    int i72 = intArrayUtil69.findKthLargestViaQuickSort(i_array70, (-1));
    int[] i_array76 = new int[] { '4', (byte)0 };
    int i77 = intArrayUtil69.findMinSubArrayLen(0, i_array76);
    int i78 = intArrayUtil49.findMinSubArrayLen((int)(short)0, i_array76);
    int i79 = intArrayUtil40.removeDuplicateElements(i_array76);
    intArrayUtil15.getNextPermutationNumber(i_array76);
    int i81 = intArrayUtil0.findMinViaRecursion(i_array76);
    int[] i_array82 = null;
    int i83 = intArrayUtil0.findMinViaIteration(i_array82);
    int[] i_array84 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i86 = intArrayUtil0.threeSumClosest(i_array84, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == (-1));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test08"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil10 = new util.IntArrayUtil();
    int[] i_array11 = new int[] {  };
    int i13 = intArrayUtil10.findKthLargestViaQuickSort(i_array11, (-1));
    int i14 = intArrayUtil0.findMinSubArrayLen((int)(byte)-1, i_array11);
    util.IntArrayUtil intArrayUtil15 = new util.IntArrayUtil();
    int[] i_array16 = new int[] {  };
    int i18 = intArrayUtil15.findKthLargestViaQuickSort(i_array16, (-1));
    int i20 = intArrayUtil0.findKthLargestViaQuickSort(i_array16, (-4));
    util.IntArrayUtil intArrayUtil21 = new util.IntArrayUtil();
    int[] i_array22 = new int[] {  };
    int i24 = intArrayUtil21.findKthLargestViaQuickSort(i_array22, (-1));
    int[] i_array28 = new int[] { '4', (byte)0 };
    int i29 = intArrayUtil21.findMinSubArrayLen(0, i_array28);
    util.IntArrayUtil intArrayUtil30 = new util.IntArrayUtil();
    int[] i_array31 = new int[] {  };
    int i33 = intArrayUtil30.findKthLargestViaQuickSort(i_array31, (-1));
    int[] i_array37 = new int[] { '4', (byte)0 };
    int i38 = intArrayUtil30.findMinSubArrayLen(0, i_array37);
    int i39 = intArrayUtil21.removeDuplicateElements(i_array37);
    util.IntArrayUtil intArrayUtil41 = new util.IntArrayUtil();
    int[] i_array42 = new int[] {  };
    int i44 = intArrayUtil41.findKthLargestViaQuickSort(i_array42, (-1));
    int[] i_array48 = new int[] { '4', (byte)0 };
    int i49 = intArrayUtil41.findMinSubArrayLen(0, i_array48);
    int i50 = intArrayUtil21.findMinSubArrayLen((int)(short)0, i_array48);
    util.IntArrayUtil intArrayUtil51 = new util.IntArrayUtil();
    int[] i_array52 = new int[] {  };
    int i54 = intArrayUtil51.findKthLargestViaQuickSort(i_array52, (-1));
    int i56 = intArrayUtil21.threeSumClosest(i_array52, 1);
    int[] i_array57 = null;
    int i58 = intArrayUtil21.findMinViaIteration(i_array57);
    util.IntArrayUtil intArrayUtil59 = new util.IntArrayUtil();
    int[] i_array60 = new int[] {  };
    int i62 = intArrayUtil59.findKthLargestViaQuickSort(i_array60, (-1));
    int[] i_array66 = new int[] { '4', (byte)0 };
    int i67 = intArrayUtil59.findMinSubArrayLen(0, i_array66);
    util.IntArrayUtil intArrayUtil69 = new util.IntArrayUtil();
    int[] i_array70 = new int[] {  };
    int i72 = intArrayUtil69.findKthLargestViaQuickSort(i_array70, (-1));
    int i73 = intArrayUtil59.findMinSubArrayLen((int)(byte)-1, i_array70);
    intArrayUtil21.getNextPermutationNumber(i_array70);
    int i75 = intArrayUtil0.findMinViaIteration(i_array70);
    int[] i_array76 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i77 = intArrayUtil0.findMinViaRecursion(i_array76);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == (-1));

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test09"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    util.IntArrayUtil intArrayUtil2 = new util.IntArrayUtil();
    int[] i_array3 = new int[] {  };
    int i5 = intArrayUtil2.findKthLargestViaQuickSort(i_array3, (-1));
    int[] i_array9 = new int[] { '4', (byte)0 };
    int i10 = intArrayUtil2.findMinSubArrayLen(0, i_array9);
    util.IntArrayUtil intArrayUtil11 = new util.IntArrayUtil();
    int[] i_array12 = new int[] {  };
    int i14 = intArrayUtil11.findKthLargestViaQuickSort(i_array12, (-1));
    int[] i_array18 = new int[] { '4', (byte)0 };
    int i19 = intArrayUtil11.findMinSubArrayLen(0, i_array18);
    int i20 = intArrayUtil2.removeDuplicateElements(i_array18);
    util.IntArrayUtil intArrayUtil22 = new util.IntArrayUtil();
    int[] i_array23 = new int[] {  };
    int i25 = intArrayUtil22.findKthLargestViaQuickSort(i_array23, (-1));
    int[] i_array29 = new int[] { '4', (byte)0 };
    int i30 = intArrayUtil22.findMinSubArrayLen(0, i_array29);
    int i31 = intArrayUtil2.findMinSubArrayLen((int)(short)0, i_array29);
    util.IntArrayUtil intArrayUtil32 = new util.IntArrayUtil();
    int[] i_array33 = new int[] {  };
    int i35 = intArrayUtil32.findKthLargestViaQuickSort(i_array33, (-1));
    int i36 = intArrayUtil2.findMinViaIteration(i_array33);
    int i37 = intArrayUtil0.findMinSubArrayLen(9, i_array33);
    util.IntArrayUtil intArrayUtil38 = new util.IntArrayUtil();
    int[] i_array39 = new int[] {  };
    int i41 = intArrayUtil38.findKthLargestViaQuickSort(i_array39, (-1));
    int[] i_array45 = new int[] { '4', (byte)0 };
    int i46 = intArrayUtil38.findMinSubArrayLen(0, i_array45);
    util.IntArrayUtil intArrayUtil47 = new util.IntArrayUtil();
    int[] i_array48 = new int[] {  };
    int i50 = intArrayUtil47.findKthLargestViaQuickSort(i_array48, (-1));
    int[] i_array54 = new int[] { '4', (byte)0 };
    int i55 = intArrayUtil47.findMinSubArrayLen(0, i_array54);
    int i56 = intArrayUtil38.removeDuplicateElements(i_array54);
    int i57 = intArrayUtil0.findMinViaRecursion(i_array54);
    util.IntArrayUtil intArrayUtil58 = new util.IntArrayUtil();
    int[] i_array59 = new int[] {  };
    int i61 = intArrayUtil58.findKthLargestViaQuickSort(i_array59, (-1));
    util.IntArrayUtil intArrayUtil62 = new util.IntArrayUtil();
    int[] i_array63 = new int[] {  };
    int i65 = intArrayUtil62.findKthLargestViaQuickSort(i_array63, (-1));
    int[] i_array69 = new int[] { '4', (byte)0 };
    int i70 = intArrayUtil62.findMinSubArrayLen(0, i_array69);
    util.IntArrayUtil intArrayUtil71 = new util.IntArrayUtil();
    int[] i_array72 = new int[] {  };
    int i74 = intArrayUtil71.findKthLargestViaQuickSort(i_array72, (-1));
    int[] i_array78 = new int[] { '4', (byte)0 };
    int i79 = intArrayUtil71.findMinSubArrayLen(0, i_array78);
    int i80 = intArrayUtil62.removeDuplicateElements(i_array78);
    util.IntArrayUtil intArrayUtil81 = new util.IntArrayUtil();
    int[] i_array82 = new int[] {  };
    int i84 = intArrayUtil81.findKthLargestViaQuickSort(i_array82, (-1));
    int i86 = intArrayUtil62.findKthLargestViaQuickSort(i_array82, (-2));
    intArrayUtil58.getNextPermutationNumber(i_array82);
    // The following exception was thrown during execution in test generation
    try {
    int i88 = intArrayUtil0.findMinViaRecursion(i_array82);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i84 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i86 == 0);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test10"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil9 = new util.IntArrayUtil();
    int[] i_array10 = new int[] {  };
    int i12 = intArrayUtil9.findKthLargestViaQuickSort(i_array10, (-1));
    int[] i_array16 = new int[] { '4', (byte)0 };
    int i17 = intArrayUtil9.findMinSubArrayLen(0, i_array16);
    util.IntArrayUtil intArrayUtil18 = new util.IntArrayUtil();
    int[] i_array19 = new int[] {  };
    int i21 = intArrayUtil18.findKthLargestViaQuickSort(i_array19, (-1));
    int[] i_array25 = new int[] { '4', (byte)0 };
    int i26 = intArrayUtil18.findMinSubArrayLen(0, i_array25);
    int i27 = intArrayUtil9.removeDuplicateElements(i_array25);
    util.IntArrayUtil intArrayUtil29 = new util.IntArrayUtil();
    int[] i_array30 = new int[] {  };
    int i32 = intArrayUtil29.findKthLargestViaQuickSort(i_array30, (-1));
    int[] i_array36 = new int[] { '4', (byte)0 };
    int i37 = intArrayUtil29.findMinSubArrayLen(0, i_array36);
    int i38 = intArrayUtil9.findMinSubArrayLen((int)(short)0, i_array36);
    int i39 = intArrayUtil0.removeDuplicateElements(i_array36);
    util.IntArrayUtil intArrayUtil40 = new util.IntArrayUtil();
    int[] i_array41 = new int[] {  };
    int i43 = intArrayUtil40.findKthLargestViaQuickSort(i_array41, (-1));
    int[] i_array47 = new int[] { '4', (byte)0 };
    int i48 = intArrayUtil40.findMinSubArrayLen(0, i_array47);
    int i50 = intArrayUtil0.findKthLargestViaQuickSort(i_array47, (-4));
    util.IntArrayUtil intArrayUtil51 = new util.IntArrayUtil();
    int[] i_array52 = new int[] {  };
    int i54 = intArrayUtil51.findKthLargestViaQuickSort(i_array52, (-1));
    int[] i_array58 = new int[] { '4', (byte)0 };
    int i59 = intArrayUtil51.findMinSubArrayLen(0, i_array58);
    util.IntArrayUtil intArrayUtil60 = new util.IntArrayUtil();
    int[] i_array61 = new int[] {  };
    int i63 = intArrayUtil60.findKthLargestViaQuickSort(i_array61, (-1));
    int[] i_array67 = new int[] { '4', (byte)0 };
    int i68 = intArrayUtil60.findMinSubArrayLen(0, i_array67);
    int i70 = intArrayUtil51.threeSumClosest(i_array67, (int)(short)100);
    util.IntArrayUtil intArrayUtil71 = new util.IntArrayUtil();
    int[] i_array72 = new int[] {  };
    int i74 = intArrayUtil71.findKthLargestViaQuickSort(i_array72, (-1));
    int[] i_array78 = new int[] { '4', (byte)0 };
    int i79 = intArrayUtil71.findMinSubArrayLen(0, i_array78);
    util.IntArrayUtil intArrayUtil80 = new util.IntArrayUtil();
    int[] i_array81 = new int[] {  };
    int i83 = intArrayUtil80.findKthLargestViaQuickSort(i_array81, (-1));
    int[] i_array87 = new int[] { '4', (byte)0 };
    int i88 = intArrayUtil80.findMinSubArrayLen(0, i_array87);
    int i89 = intArrayUtil71.removeDuplicateElements(i_array87);
    intArrayUtil51.getNextPermutationNumber(i_array87);
    intArrayUtil0.getNextPermutationNumber(i_array87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i89 == 2);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test11"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil9 = new util.IntArrayUtil();
    int[] i_array10 = new int[] {  };
    int i12 = intArrayUtil9.findKthLargestViaQuickSort(i_array10, (-1));
    int[] i_array16 = new int[] { '4', (byte)0 };
    int i17 = intArrayUtil9.findMinSubArrayLen(0, i_array16);
    int i18 = intArrayUtil0.removeDuplicateElements(i_array16);
    util.IntArrayUtil intArrayUtil20 = new util.IntArrayUtil();
    int[] i_array21 = new int[] {  };
    int i23 = intArrayUtil20.findKthLargestViaQuickSort(i_array21, (-1));
    int[] i_array27 = new int[] { '4', (byte)0 };
    int i28 = intArrayUtil20.findMinSubArrayLen(0, i_array27);
    int i29 = intArrayUtil0.findMinSubArrayLen((int)(short)0, i_array27);
    util.IntArrayUtil intArrayUtil31 = new util.IntArrayUtil();
    int[] i_array32 = new int[] {  };
    int i34 = intArrayUtil31.findKthLargestViaQuickSort(i_array32, (-1));
    int i35 = intArrayUtil0.findMinSubArrayLen(1, i_array32);
    int[] i_array36 = null;
    int i37 = intArrayUtil0.findMinViaIteration(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == (-1));

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test12"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil10 = new util.IntArrayUtil();
    int[] i_array11 = new int[] {  };
    int i13 = intArrayUtil10.findKthLargestViaQuickSort(i_array11, (-1));
    int i14 = intArrayUtil0.findMinSubArrayLen((int)(byte)-1, i_array11);
    util.IntArrayUtil intArrayUtil15 = new util.IntArrayUtil();
    int[] i_array16 = new int[] {  };
    int i18 = intArrayUtil15.findKthLargestViaQuickSort(i_array16, (-1));
    int[] i_array22 = new int[] { '4', (byte)0 };
    int i23 = intArrayUtil15.findMinSubArrayLen(0, i_array22);
    int i25 = intArrayUtil0.threeSumClosest(i_array22, (int)(byte)100);
    util.IntArrayUtil intArrayUtil27 = new util.IntArrayUtil();
    int[] i_array28 = new int[] {  };
    int i30 = intArrayUtil27.findKthLargestViaQuickSort(i_array28, (-1));
    int[] i_array34 = new int[] { '4', (byte)0 };
    int i35 = intArrayUtil27.findMinSubArrayLen(0, i_array34);
    util.IntArrayUtil intArrayUtil36 = new util.IntArrayUtil();
    int[] i_array37 = new int[] {  };
    int i39 = intArrayUtil36.findKthLargestViaQuickSort(i_array37, (-1));
    int[] i_array43 = new int[] { '4', (byte)0 };
    int i44 = intArrayUtil36.findMinSubArrayLen(0, i_array43);
    int[] i_array45 = null;
    intArrayUtil36.getNextPermutationNumber(i_array45);
    util.IntArrayUtil intArrayUtil47 = new util.IntArrayUtil();
    int[] i_array48 = new int[] {  };
    int i50 = intArrayUtil47.findKthLargestViaQuickSort(i_array48, (-1));
    int[] i_array54 = new int[] { '4', (byte)0 };
    int i55 = intArrayUtil47.findMinSubArrayLen(0, i_array54);
    util.IntArrayUtil intArrayUtil56 = new util.IntArrayUtil();
    int[] i_array57 = new int[] {  };
    int i59 = intArrayUtil56.findKthLargestViaQuickSort(i_array57, (-1));
    int[] i_array63 = new int[] { '4', (byte)0 };
    int i64 = intArrayUtil56.findMinSubArrayLen(0, i_array63);
    int i65 = intArrayUtil47.removeDuplicateElements(i_array63);
    util.IntArrayUtil intArrayUtil66 = new util.IntArrayUtil();
    int[] i_array67 = new int[] {  };
    int i69 = intArrayUtil66.findKthLargestViaQuickSort(i_array67, (-1));
    int i71 = intArrayUtil47.findKthLargestViaQuickSort(i_array67, (-2));
    int i73 = intArrayUtil36.threeSumClosest(i_array67, (int)(byte)1);
    int[] i_array75 = null;
    int i76 = intArrayUtil36.findMinSubArrayLen(10, i_array75);
    util.IntArrayUtil intArrayUtil77 = new util.IntArrayUtil();
    int[] i_array78 = new int[] {  };
    int i80 = intArrayUtil77.findKthLargestViaQuickSort(i_array78, (-1));
    int[] i_array84 = new int[] { '4', (byte)0 };
    int i85 = intArrayUtil77.findMinSubArrayLen(0, i_array84);
    util.IntArrayUtil intArrayUtil86 = new util.IntArrayUtil();
    int[] i_array87 = new int[] {  };
    int i89 = intArrayUtil86.findKthLargestViaQuickSort(i_array87, (-1));
    int[] i_array93 = new int[] { '4', (byte)0 };
    int i94 = intArrayUtil86.findMinSubArrayLen(0, i_array93);
    int i95 = intArrayUtil77.removeDuplicateElements(i_array93);
    int i96 = intArrayUtil36.findMinViaIteration(i_array93);
    int i98 = intArrayUtil27.threeSumClosest(i_array93, (-5));
    int i99 = intArrayUtil0.findMinSubArrayLen((int)(byte)0, i_array93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i89 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i94 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i95 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i96 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i98 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i99 == 1);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test13"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil10 = new util.IntArrayUtil();
    int[] i_array11 = new int[] {  };
    int i13 = intArrayUtil10.findKthLargestViaQuickSort(i_array11, (-1));
    int i14 = intArrayUtil0.findMinSubArrayLen((int)(byte)-1, i_array11);
    util.IntArrayUtil intArrayUtil15 = new util.IntArrayUtil();
    int[] i_array16 = new int[] {  };
    int i18 = intArrayUtil15.findKthLargestViaQuickSort(i_array16, (-1));
    int[] i_array22 = new int[] { '4', (byte)0 };
    int i23 = intArrayUtil15.findMinSubArrayLen(0, i_array22);
    util.IntArrayUtil intArrayUtil24 = new util.IntArrayUtil();
    int[] i_array25 = new int[] {  };
    int i27 = intArrayUtil24.findKthLargestViaQuickSort(i_array25, (-1));
    int[] i_array31 = new int[] { '4', (byte)0 };
    int i32 = intArrayUtil24.findMinSubArrayLen(0, i_array31);
    util.IntArrayUtil intArrayUtil33 = new util.IntArrayUtil();
    int[] i_array34 = new int[] {  };
    int i36 = intArrayUtil33.findKthLargestViaQuickSort(i_array34, (-1));
    int[] i_array40 = new int[] { '4', (byte)0 };
    int i41 = intArrayUtil33.findMinSubArrayLen(0, i_array40);
    int i42 = intArrayUtil24.removeDuplicateElements(i_array40);
    util.IntArrayUtil intArrayUtil44 = new util.IntArrayUtil();
    int[] i_array45 = new int[] {  };
    int i47 = intArrayUtil44.findKthLargestViaQuickSort(i_array45, (-1));
    int[] i_array51 = new int[] { '4', (byte)0 };
    int i52 = intArrayUtil44.findMinSubArrayLen(0, i_array51);
    int i53 = intArrayUtil24.findMinSubArrayLen((int)(short)0, i_array51);
    int i54 = intArrayUtil15.removeDuplicateElements(i_array51);
    util.IntArrayUtil intArrayUtil55 = new util.IntArrayUtil();
    int[] i_array56 = new int[] {  };
    int i58 = intArrayUtil55.findKthLargestViaQuickSort(i_array56, (-1));
    int[] i_array62 = new int[] { '4', (byte)0 };
    int i63 = intArrayUtil55.findMinSubArrayLen(0, i_array62);
    util.IntArrayUtil intArrayUtil64 = new util.IntArrayUtil();
    int[] i_array65 = new int[] {  };
    int i67 = intArrayUtil64.findKthLargestViaQuickSort(i_array65, (-1));
    int[] i_array71 = new int[] { '4', (byte)0 };
    int i72 = intArrayUtil64.findMinSubArrayLen(0, i_array71);
    int i74 = intArrayUtil55.threeSumClosest(i_array71, (int)(short)100);
    int i75 = intArrayUtil15.removeDuplicateElements(i_array71);
    int i76 = intArrayUtil0.findMinViaRecursion(i_array71);
    util.IntArrayUtil intArrayUtil77 = new util.IntArrayUtil();
    int[] i_array78 = new int[] {  };
    int i80 = intArrayUtil77.findKthLargestViaQuickSort(i_array78, (-1));
    int[] i_array84 = new int[] { '4', (byte)0 };
    int i85 = intArrayUtil77.findMinSubArrayLen(0, i_array84);
    util.IntArrayUtil intArrayUtil86 = new util.IntArrayUtil();
    int[] i_array87 = new int[] {  };
    int i89 = intArrayUtil86.findKthLargestViaQuickSort(i_array87, (-1));
    int[] i_array93 = new int[] { '4', (byte)0 };
    int i94 = intArrayUtil86.findMinSubArrayLen(0, i_array93);
    int i95 = intArrayUtil77.removeDuplicateElements(i_array93);
    int i96 = intArrayUtil0.findMinViaIteration(i_array93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i89 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i94 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i95 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i96 == 0);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test14"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil9 = new util.IntArrayUtil();
    int[] i_array10 = new int[] {  };
    int i12 = intArrayUtil9.findKthLargestViaQuickSort(i_array10, (-1));
    int[] i_array16 = new int[] { '4', (byte)0 };
    int i17 = intArrayUtil9.findMinSubArrayLen(0, i_array16);
    util.IntArrayUtil intArrayUtil18 = new util.IntArrayUtil();
    int[] i_array19 = new int[] {  };
    int i21 = intArrayUtil18.findKthLargestViaQuickSort(i_array19, (-1));
    int[] i_array25 = new int[] { '4', (byte)0 };
    int i26 = intArrayUtil18.findMinSubArrayLen(0, i_array25);
    int i27 = intArrayUtil9.removeDuplicateElements(i_array25);
    util.IntArrayUtil intArrayUtil29 = new util.IntArrayUtil();
    int[] i_array30 = new int[] {  };
    int i32 = intArrayUtil29.findKthLargestViaQuickSort(i_array30, (-1));
    int[] i_array36 = new int[] { '4', (byte)0 };
    int i37 = intArrayUtil29.findMinSubArrayLen(0, i_array36);
    int i38 = intArrayUtil9.findMinSubArrayLen((int)(short)0, i_array36);
    int i39 = intArrayUtil0.removeDuplicateElements(i_array36);
    util.IntArrayUtil intArrayUtil40 = new util.IntArrayUtil();
    int[] i_array41 = new int[] {  };
    int i43 = intArrayUtil40.findKthLargestViaQuickSort(i_array41, (-1));
    int i44 = intArrayUtil0.removeDuplicateElements(i_array41);
    int[] i_array47 = new int[] { 10, (byte)10 };
    int i49 = intArrayUtil0.findKthLargestViaQuickSort(i_array47, (-1));
    util.IntArrayUtil intArrayUtil50 = new util.IntArrayUtil();
    int[] i_array51 = new int[] {  };
    int i53 = intArrayUtil50.findKthLargestViaQuickSort(i_array51, (-1));
    int[] i_array57 = new int[] { '4', (byte)0 };
    int i58 = intArrayUtil50.findMinSubArrayLen(0, i_array57);
    util.IntArrayUtil intArrayUtil59 = new util.IntArrayUtil();
    int[] i_array60 = new int[] {  };
    int i62 = intArrayUtil59.findKthLargestViaQuickSort(i_array60, (-1));
    int[] i_array66 = new int[] { '4', (byte)0 };
    int i67 = intArrayUtil59.findMinSubArrayLen(0, i_array66);
    int i68 = intArrayUtil50.removeDuplicateElements(i_array66);
    util.IntArrayUtil intArrayUtil70 = new util.IntArrayUtil();
    int[] i_array71 = new int[] {  };
    int i73 = intArrayUtil70.findKthLargestViaQuickSort(i_array71, (-1));
    int[] i_array77 = new int[] { '4', (byte)0 };
    int i78 = intArrayUtil70.findMinSubArrayLen(0, i_array77);
    int i79 = intArrayUtil50.findMinSubArrayLen((int)(short)0, i_array77);
    util.IntArrayUtil intArrayUtil80 = new util.IntArrayUtil();
    int[] i_array81 = new int[] {  };
    int i83 = intArrayUtil80.findKthLargestViaQuickSort(i_array81, (-1));
    int[] i_array87 = new int[] { '4', (byte)0 };
    int i88 = intArrayUtil80.findMinSubArrayLen(0, i_array87);
    intArrayUtil50.getNextPermutationNumber(i_array87);
    int[] i_array96 = new int[] { '4', (byte)100, (short)10, (byte)-1, 10, 'a' };
    int i97 = intArrayUtil50.removeDuplicateElements(i_array96);
    int i98 = intArrayUtil0.findMinViaIteration(i_array96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i97 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i98 == 52);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test15"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    util.IntArrayUtil intArrayUtil2 = new util.IntArrayUtil();
    int[] i_array3 = new int[] {  };
    int i5 = intArrayUtil2.findKthLargestViaQuickSort(i_array3, (-1));
    int[] i_array9 = new int[] { '4', (byte)0 };
    int i10 = intArrayUtil2.findMinSubArrayLen(0, i_array9);
    util.IntArrayUtil intArrayUtil11 = new util.IntArrayUtil();
    int[] i_array12 = new int[] {  };
    int i14 = intArrayUtil11.findKthLargestViaQuickSort(i_array12, (-1));
    int[] i_array18 = new int[] { '4', (byte)0 };
    int i19 = intArrayUtil11.findMinSubArrayLen(0, i_array18);
    util.IntArrayUtil intArrayUtil20 = new util.IntArrayUtil();
    int[] i_array21 = new int[] {  };
    int i23 = intArrayUtil20.findKthLargestViaQuickSort(i_array21, (-1));
    int[] i_array27 = new int[] { '4', (byte)0 };
    int i28 = intArrayUtil20.findMinSubArrayLen(0, i_array27);
    int i29 = intArrayUtil11.removeDuplicateElements(i_array27);
    util.IntArrayUtil intArrayUtil31 = new util.IntArrayUtil();
    int[] i_array32 = new int[] {  };
    int i34 = intArrayUtil31.findKthLargestViaQuickSort(i_array32, (-1));
    int[] i_array38 = new int[] { '4', (byte)0 };
    int i39 = intArrayUtil31.findMinSubArrayLen(0, i_array38);
    int i40 = intArrayUtil11.findMinSubArrayLen((int)(short)0, i_array38);
    int i41 = intArrayUtil2.removeDuplicateElements(i_array38);
    util.IntArrayUtil intArrayUtil42 = new util.IntArrayUtil();
    int[] i_array43 = new int[] {  };
    int i45 = intArrayUtil42.findKthLargestViaQuickSort(i_array43, (-1));
    int[] i_array49 = new int[] { '4', (byte)0 };
    int i50 = intArrayUtil42.findMinSubArrayLen(0, i_array49);
    util.IntArrayUtil intArrayUtil51 = new util.IntArrayUtil();
    int[] i_array52 = new int[] {  };
    int i54 = intArrayUtil51.findKthLargestViaQuickSort(i_array52, (-1));
    int[] i_array58 = new int[] { '4', (byte)0 };
    int i59 = intArrayUtil51.findMinSubArrayLen(0, i_array58);
    int i61 = intArrayUtil42.threeSumClosest(i_array58, (int)(short)100);
    int i62 = intArrayUtil2.removeDuplicateElements(i_array58);
    util.IntArrayUtil intArrayUtil63 = new util.IntArrayUtil();
    int[] i_array64 = new int[] {  };
    int i66 = intArrayUtil63.findKthLargestViaQuickSort(i_array64, (-1));
    int[] i_array70 = new int[] { '4', (byte)0 };
    int i71 = intArrayUtil63.findMinSubArrayLen(0, i_array70);
    util.IntArrayUtil intArrayUtil72 = new util.IntArrayUtil();
    int[] i_array73 = new int[] {  };
    int i75 = intArrayUtil72.findKthLargestViaQuickSort(i_array73, (-1));
    int[] i_array79 = new int[] { '4', (byte)0 };
    int i80 = intArrayUtil72.findMinSubArrayLen(0, i_array79);
    int i81 = intArrayUtil63.removeDuplicateElements(i_array79);
    util.IntArrayUtil intArrayUtil83 = new util.IntArrayUtil();
    int[] i_array84 = new int[] {  };
    int i86 = intArrayUtil83.findKthLargestViaQuickSort(i_array84, (-1));
    int[] i_array90 = new int[] { '4', (byte)0 };
    int i91 = intArrayUtil83.findMinSubArrayLen(0, i_array90);
    int i92 = intArrayUtil63.findMinSubArrayLen((int)(short)0, i_array90);
    util.IntArrayUtil intArrayUtil93 = new util.IntArrayUtil();
    int[] i_array94 = new int[] {  };
    int i96 = intArrayUtil93.findKthLargestViaQuickSort(i_array94, (-1));
    int i97 = intArrayUtil63.findMinViaIteration(i_array94);
    intArrayUtil2.getNextPermutationNumber(i_array94);
    int i99 = intArrayUtil0.findMinSubArrayLen((-5), i_array94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i86 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i91 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i92 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i96 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i97 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i99 == 0);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test16"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil10 = new util.IntArrayUtil();
    int[] i_array11 = new int[] {  };
    int i13 = intArrayUtil10.findKthLargestViaQuickSort(i_array11, (-1));
    int i14 = intArrayUtil0.findMinSubArrayLen((int)(byte)-1, i_array11);
    util.IntArrayUtil intArrayUtil15 = new util.IntArrayUtil();
    int[] i_array16 = new int[] {  };
    int i18 = intArrayUtil15.findKthLargestViaQuickSort(i_array16, (-1));
    int i20 = intArrayUtil0.findKthLargestViaQuickSort(i_array16, (-4));
    util.IntArrayUtil intArrayUtil22 = new util.IntArrayUtil();
    int[] i_array23 = new int[] {  };
    int i25 = intArrayUtil22.findKthLargestViaQuickSort(i_array23, (-1));
    int[] i_array29 = new int[] { '4', (byte)0 };
    int i30 = intArrayUtil22.findMinSubArrayLen(0, i_array29);
    util.IntArrayUtil intArrayUtil31 = new util.IntArrayUtil();
    int[] i_array32 = new int[] {  };
    int i34 = intArrayUtil31.findKthLargestViaQuickSort(i_array32, (-1));
    int[] i_array38 = new int[] { '4', (byte)0 };
    int i39 = intArrayUtil31.findMinSubArrayLen(0, i_array38);
    int i40 = intArrayUtil22.removeDuplicateElements(i_array38);
    util.IntArrayUtil intArrayUtil42 = new util.IntArrayUtil();
    int[] i_array43 = new int[] {  };
    int i45 = intArrayUtil42.findKthLargestViaQuickSort(i_array43, (-1));
    int[] i_array49 = new int[] { '4', (byte)0 };
    int i50 = intArrayUtil42.findMinSubArrayLen(0, i_array49);
    int i51 = intArrayUtil22.findMinSubArrayLen((int)(short)0, i_array49);
    util.IntArrayUtil intArrayUtil52 = new util.IntArrayUtil();
    int[] i_array53 = new int[] {  };
    int i55 = intArrayUtil52.findKthLargestViaQuickSort(i_array53, (-1));
    int i56 = intArrayUtil22.findMinViaIteration(i_array53);
    int i57 = intArrayUtil0.findMinSubArrayLen((-9), i_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test17"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    util.IntArrayUtil intArrayUtil1 = new util.IntArrayUtil();
    int[] i_array2 = new int[] {  };
    int i4 = intArrayUtil1.findKthLargestViaQuickSort(i_array2, (-1));
    int[] i_array8 = new int[] { '4', (byte)0 };
    int i9 = intArrayUtil1.findMinSubArrayLen(0, i_array8);
    util.IntArrayUtil intArrayUtil10 = new util.IntArrayUtil();
    int[] i_array11 = new int[] {  };
    int i13 = intArrayUtil10.findKthLargestViaQuickSort(i_array11, (-1));
    int[] i_array17 = new int[] { '4', (byte)0 };
    int i18 = intArrayUtil10.findMinSubArrayLen(0, i_array17);
    util.IntArrayUtil intArrayUtil19 = new util.IntArrayUtil();
    int[] i_array20 = new int[] {  };
    int i22 = intArrayUtil19.findKthLargestViaQuickSort(i_array20, (-1));
    int[] i_array26 = new int[] { '4', (byte)0 };
    int i27 = intArrayUtil19.findMinSubArrayLen(0, i_array26);
    int i28 = intArrayUtil10.removeDuplicateElements(i_array26);
    util.IntArrayUtil intArrayUtil30 = new util.IntArrayUtil();
    int[] i_array31 = new int[] {  };
    int i33 = intArrayUtil30.findKthLargestViaQuickSort(i_array31, (-1));
    int[] i_array37 = new int[] { '4', (byte)0 };
    int i38 = intArrayUtil30.findMinSubArrayLen(0, i_array37);
    int i39 = intArrayUtil10.findMinSubArrayLen((int)(short)0, i_array37);
    int i40 = intArrayUtil1.removeDuplicateElements(i_array37);
    util.IntArrayUtil intArrayUtil41 = new util.IntArrayUtil();
    int[] i_array42 = new int[] {  };
    int i44 = intArrayUtil41.findKthLargestViaQuickSort(i_array42, (-1));
    int i45 = intArrayUtil1.removeDuplicateElements(i_array42);
    int[] i_array48 = new int[] { 10, (byte)10 };
    int i50 = intArrayUtil1.findKthLargestViaQuickSort(i_array48, (-1));
    intArrayUtil0.getNextPermutationNumber(i_array48);
    int[] i_array53 = null;
    int i54 = intArrayUtil0.findMinSubArrayLen((int)(byte)1, i_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test18"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil9 = new util.IntArrayUtil();
    int[] i_array10 = new int[] {  };
    int i12 = intArrayUtil9.findKthLargestViaQuickSort(i_array10, (-1));
    int[] i_array16 = new int[] { '4', (byte)0 };
    int i17 = intArrayUtil9.findMinSubArrayLen(0, i_array16);
    int i18 = intArrayUtil0.removeDuplicateElements(i_array16);
    util.IntArrayUtil intArrayUtil20 = new util.IntArrayUtil();
    int[] i_array21 = new int[] {  };
    int i23 = intArrayUtil20.findKthLargestViaQuickSort(i_array21, (-1));
    int[] i_array27 = new int[] { '4', (byte)0 };
    int i28 = intArrayUtil20.findMinSubArrayLen(0, i_array27);
    int i29 = intArrayUtil0.findMinSubArrayLen((int)(short)0, i_array27);
    util.IntArrayUtil intArrayUtil30 = new util.IntArrayUtil();
    util.IntArrayUtil intArrayUtil32 = new util.IntArrayUtil();
    int[] i_array33 = new int[] {  };
    int i35 = intArrayUtil32.findKthLargestViaQuickSort(i_array33, (-1));
    int[] i_array39 = new int[] { '4', (byte)0 };
    int i40 = intArrayUtil32.findMinSubArrayLen(0, i_array39);
    util.IntArrayUtil intArrayUtil41 = new util.IntArrayUtil();
    int[] i_array42 = new int[] {  };
    int i44 = intArrayUtil41.findKthLargestViaQuickSort(i_array42, (-1));
    int[] i_array48 = new int[] { '4', (byte)0 };
    int i49 = intArrayUtil41.findMinSubArrayLen(0, i_array48);
    int i50 = intArrayUtil32.removeDuplicateElements(i_array48);
    util.IntArrayUtil intArrayUtil52 = new util.IntArrayUtil();
    int[] i_array53 = new int[] {  };
    int i55 = intArrayUtil52.findKthLargestViaQuickSort(i_array53, (-1));
    int[] i_array59 = new int[] { '4', (byte)0 };
    int i60 = intArrayUtil52.findMinSubArrayLen(0, i_array59);
    int i61 = intArrayUtil32.findMinSubArrayLen((int)(short)0, i_array59);
    util.IntArrayUtil intArrayUtil62 = new util.IntArrayUtil();
    int[] i_array63 = new int[] {  };
    int i65 = intArrayUtil62.findKthLargestViaQuickSort(i_array63, (-1));
    int i66 = intArrayUtil32.findMinViaIteration(i_array63);
    int i67 = intArrayUtil30.findMinSubArrayLen(9, i_array63);
    intArrayUtil0.getNextPermutationNumber(i_array63);
    int[] i_array69 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i71 = intArrayUtil0.threeSumClosest(i_array69, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test19"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    util.IntArrayUtil intArrayUtil2 = new util.IntArrayUtil();
    int[] i_array3 = new int[] {  };
    int i5 = intArrayUtil2.findKthLargestViaQuickSort(i_array3, (-1));
    int[] i_array9 = new int[] { '4', (byte)0 };
    int i10 = intArrayUtil2.findMinSubArrayLen(0, i_array9);
    util.IntArrayUtil intArrayUtil11 = new util.IntArrayUtil();
    int[] i_array12 = new int[] {  };
    int i14 = intArrayUtil11.findKthLargestViaQuickSort(i_array12, (-1));
    int[] i_array18 = new int[] { '4', (byte)0 };
    int i19 = intArrayUtil11.findMinSubArrayLen(0, i_array18);
    int i20 = intArrayUtil2.removeDuplicateElements(i_array18);
    util.IntArrayUtil intArrayUtil22 = new util.IntArrayUtil();
    int[] i_array23 = new int[] {  };
    int i25 = intArrayUtil22.findKthLargestViaQuickSort(i_array23, (-1));
    int[] i_array29 = new int[] { '4', (byte)0 };
    int i30 = intArrayUtil22.findMinSubArrayLen(0, i_array29);
    int i31 = intArrayUtil2.findMinSubArrayLen((int)(short)0, i_array29);
    util.IntArrayUtil intArrayUtil32 = new util.IntArrayUtil();
    int[] i_array33 = new int[] {  };
    int i35 = intArrayUtil32.findKthLargestViaQuickSort(i_array33, (-1));
    int i36 = intArrayUtil2.findMinViaIteration(i_array33);
    int i37 = intArrayUtil0.findMinSubArrayLen(9, i_array33);
    int[] i_array39 = null;
    int i40 = intArrayUtil0.findMinSubArrayLen((-4), i_array39);
    util.IntArrayUtil intArrayUtil41 = new util.IntArrayUtil();
    int[] i_array42 = new int[] {  };
    int i44 = intArrayUtil41.findKthLargestViaQuickSort(i_array42, (-1));
    int[] i_array48 = new int[] { '4', (byte)0 };
    int i49 = intArrayUtil41.findMinSubArrayLen(0, i_array48);
    util.IntArrayUtil intArrayUtil50 = new util.IntArrayUtil();
    int[] i_array51 = new int[] {  };
    int i53 = intArrayUtil50.findKthLargestViaQuickSort(i_array51, (-1));
    int[] i_array57 = new int[] { '4', (byte)0 };
    int i58 = intArrayUtil50.findMinSubArrayLen(0, i_array57);
    int i59 = intArrayUtil41.removeDuplicateElements(i_array57);
    util.IntArrayUtil intArrayUtil61 = new util.IntArrayUtil();
    int[] i_array62 = new int[] {  };
    int i64 = intArrayUtil61.findKthLargestViaQuickSort(i_array62, (-1));
    int[] i_array68 = new int[] { '4', (byte)0 };
    int i69 = intArrayUtil61.findMinSubArrayLen(0, i_array68);
    int i70 = intArrayUtil41.findMinSubArrayLen((int)(short)0, i_array68);
    util.IntArrayUtil intArrayUtil71 = new util.IntArrayUtil();
    int[] i_array72 = new int[] {  };
    int i74 = intArrayUtil71.findKthLargestViaQuickSort(i_array72, (-1));
    int i76 = intArrayUtil41.threeSumClosest(i_array72, 1);
    int[] i_array77 = null;
    int i78 = intArrayUtil41.findMinViaIteration(i_array77);
    int[] i_array80 = new int[] { 100 };
    intArrayUtil41.getNextPermutationNumber(i_array80);
    int i82 = intArrayUtil0.findMinViaIteration(i_array80);
    int[] i_array83 = null;
    intArrayUtil0.getNextPermutationNumber(i_array83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 100);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test20"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    util.IntArrayUtil intArrayUtil4 = new util.IntArrayUtil();
    util.IntArrayUtil intArrayUtil5 = new util.IntArrayUtil();
    int[] i_array6 = new int[] {  };
    int i8 = intArrayUtil5.findKthLargestViaQuickSort(i_array6, (-1));
    int[] i_array12 = new int[] { '4', (byte)0 };
    int i13 = intArrayUtil5.findMinSubArrayLen(0, i_array12);
    util.IntArrayUtil intArrayUtil14 = new util.IntArrayUtil();
    int[] i_array15 = new int[] {  };
    int i17 = intArrayUtil14.findKthLargestViaQuickSort(i_array15, (-1));
    int[] i_array21 = new int[] { '4', (byte)0 };
    int i22 = intArrayUtil14.findMinSubArrayLen(0, i_array21);
    int i23 = intArrayUtil5.removeDuplicateElements(i_array21);
    util.IntArrayUtil intArrayUtil25 = new util.IntArrayUtil();
    int[] i_array26 = new int[] {  };
    int i28 = intArrayUtil25.findKthLargestViaQuickSort(i_array26, (-1));
    int[] i_array32 = new int[] { '4', (byte)0 };
    int i33 = intArrayUtil25.findMinSubArrayLen(0, i_array32);
    int i34 = intArrayUtil5.findMinSubArrayLen((int)(short)0, i_array32);
    util.IntArrayUtil intArrayUtil35 = new util.IntArrayUtil();
    int[] i_array36 = new int[] {  };
    int i38 = intArrayUtil35.findKthLargestViaQuickSort(i_array36, (-1));
    int i40 = intArrayUtil5.threeSumClosest(i_array36, 1);
    util.IntArrayUtil intArrayUtil41 = new util.IntArrayUtil();
    int[] i_array42 = new int[] {  };
    int i44 = intArrayUtil41.findKthLargestViaQuickSort(i_array42, (-1));
    int[] i_array48 = new int[] { '4', (byte)0 };
    int i49 = intArrayUtil41.findMinSubArrayLen(0, i_array48);
    util.IntArrayUtil intArrayUtil50 = new util.IntArrayUtil();
    int[] i_array51 = new int[] {  };
    int i53 = intArrayUtil50.findKthLargestViaQuickSort(i_array51, (-1));
    int[] i_array57 = new int[] { '4', (byte)0 };
    int i58 = intArrayUtil50.findMinSubArrayLen(0, i_array57);
    int i59 = intArrayUtil41.removeDuplicateElements(i_array57);
    util.IntArrayUtil intArrayUtil61 = new util.IntArrayUtil();
    int[] i_array62 = new int[] {  };
    int i64 = intArrayUtil61.findKthLargestViaQuickSort(i_array62, (-1));
    int[] i_array68 = new int[] { '4', (byte)0 };
    int i69 = intArrayUtil61.findMinSubArrayLen(0, i_array68);
    int i70 = intArrayUtil41.findMinSubArrayLen((int)(short)0, i_array68);
    util.IntArrayUtil intArrayUtil71 = new util.IntArrayUtil();
    int[] i_array72 = new int[] {  };
    int i74 = intArrayUtil71.findKthLargestViaQuickSort(i_array72, (-1));
    intArrayUtil41.getNextPermutationNumber(i_array72);
    int i77 = intArrayUtil5.findKthLargestViaQuickSort(i_array72, (-3));
    int[] i_array78 = null;
    int i79 = intArrayUtil5.removeDuplicateElements(i_array78);
    int[] i_array81 = new int[] { ' ' };
    int i82 = intArrayUtil5.findMinViaIteration(i_array81);
    int i84 = intArrayUtil4.findKthLargestViaQuickSort(i_array81, (int)(byte)1);
    int i85 = intArrayUtil0.removeDuplicateElements(i_array81);
    int[] i_array86 = null;
    int i87 = intArrayUtil0.removeDuplicateElements(i_array86);
    int[] i_array89 = null;
    int i90 = intArrayUtil0.findMinSubArrayLen(8, i_array89);
    int[] i_array91 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i92 = intArrayUtil0.findMinViaRecursion(i_array91);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i84 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i90 == 0);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test21"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil9 = new util.IntArrayUtil();
    int[] i_array10 = new int[] {  };
    int i12 = intArrayUtil9.findKthLargestViaQuickSort(i_array10, (-1));
    int[] i_array16 = new int[] { '4', (byte)0 };
    int i17 = intArrayUtil9.findMinSubArrayLen(0, i_array16);
    util.IntArrayUtil intArrayUtil18 = new util.IntArrayUtil();
    int[] i_array19 = new int[] {  };
    int i21 = intArrayUtil18.findKthLargestViaQuickSort(i_array19, (-1));
    int[] i_array25 = new int[] { '4', (byte)0 };
    int i26 = intArrayUtil18.findMinSubArrayLen(0, i_array25);
    int i27 = intArrayUtil9.removeDuplicateElements(i_array25);
    util.IntArrayUtil intArrayUtil29 = new util.IntArrayUtil();
    int[] i_array30 = new int[] {  };
    int i32 = intArrayUtil29.findKthLargestViaQuickSort(i_array30, (-1));
    int[] i_array36 = new int[] { '4', (byte)0 };
    int i37 = intArrayUtil29.findMinSubArrayLen(0, i_array36);
    int i38 = intArrayUtil9.findMinSubArrayLen((int)(short)0, i_array36);
    int i39 = intArrayUtil0.findMinViaIteration(i_array36);
    util.IntArrayUtil intArrayUtil40 = new util.IntArrayUtil();
    util.IntArrayUtil intArrayUtil42 = new util.IntArrayUtil();
    int[] i_array43 = new int[] {  };
    int i45 = intArrayUtil42.findKthLargestViaQuickSort(i_array43, (-1));
    int[] i_array49 = new int[] { '4', (byte)0 };
    int i50 = intArrayUtil42.findMinSubArrayLen(0, i_array49);
    util.IntArrayUtil intArrayUtil51 = new util.IntArrayUtil();
    int[] i_array52 = new int[] {  };
    int i54 = intArrayUtil51.findKthLargestViaQuickSort(i_array52, (-1));
    int[] i_array58 = new int[] { '4', (byte)0 };
    int i59 = intArrayUtil51.findMinSubArrayLen(0, i_array58);
    util.IntArrayUtil intArrayUtil60 = new util.IntArrayUtil();
    int[] i_array61 = new int[] {  };
    int i63 = intArrayUtil60.findKthLargestViaQuickSort(i_array61, (-1));
    int[] i_array67 = new int[] { '4', (byte)0 };
    int i68 = intArrayUtil60.findMinSubArrayLen(0, i_array67);
    int i69 = intArrayUtil51.removeDuplicateElements(i_array67);
    util.IntArrayUtil intArrayUtil71 = new util.IntArrayUtil();
    int[] i_array72 = new int[] {  };
    int i74 = intArrayUtil71.findKthLargestViaQuickSort(i_array72, (-1));
    int[] i_array78 = new int[] { '4', (byte)0 };
    int i79 = intArrayUtil71.findMinSubArrayLen(0, i_array78);
    int i80 = intArrayUtil51.findMinSubArrayLen((int)(short)0, i_array78);
    int i81 = intArrayUtil42.removeDuplicateElements(i_array78);
    int i82 = intArrayUtil40.findMinSubArrayLen(0, i_array78);
    int i84 = intArrayUtil0.threeSumClosest(i_array78, 8);
    int[] i_array85 = null;
    intArrayUtil0.getNextPermutationNumber(i_array85);
    int[] i_array87 = null;
    int i89 = intArrayUtil0.findKthLargestViaQuickSort(i_array87, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i84 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i89 == 0);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test22"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil9 = new util.IntArrayUtil();
    int[] i_array10 = new int[] {  };
    int i12 = intArrayUtil9.findKthLargestViaQuickSort(i_array10, (-1));
    int[] i_array16 = new int[] { '4', (byte)0 };
    int i17 = intArrayUtil9.findMinSubArrayLen(0, i_array16);
    int i19 = intArrayUtil0.threeSumClosest(i_array16, (int)(short)100);
    int[] i_array21 = null;
    int i22 = intArrayUtil0.findMinSubArrayLen(9, i_array21);
    util.IntArrayUtil intArrayUtil24 = new util.IntArrayUtil();
    int[] i_array25 = new int[] {  };
    int i27 = intArrayUtil24.findKthLargestViaQuickSort(i_array25, (-1));
    int[] i_array31 = new int[] { '4', (byte)0 };
    int i32 = intArrayUtil24.findMinSubArrayLen(0, i_array31);
    int[] i_array33 = null;
    intArrayUtil24.getNextPermutationNumber(i_array33);
    int[] i_array35 = null;
    int i36 = intArrayUtil24.removeDuplicateElements(i_array35);
    int[] i_array37 = null;
    int i39 = intArrayUtil24.findKthLargestViaQuickSort(i_array37, 2);
    util.IntArrayUtil intArrayUtil41 = new util.IntArrayUtil();
    int[] i_array42 = new int[] {  };
    int i44 = intArrayUtil41.findKthLargestViaQuickSort(i_array42, (-1));
    int[] i_array48 = new int[] { '4', (byte)0 };
    int i49 = intArrayUtil41.findMinSubArrayLen(0, i_array48);
    util.IntArrayUtil intArrayUtil50 = new util.IntArrayUtil();
    int[] i_array51 = new int[] {  };
    int i53 = intArrayUtil50.findKthLargestViaQuickSort(i_array51, (-1));
    int[] i_array57 = new int[] { '4', (byte)0 };
    int i58 = intArrayUtil50.findMinSubArrayLen(0, i_array57);
    util.IntArrayUtil intArrayUtil59 = new util.IntArrayUtil();
    int[] i_array60 = new int[] {  };
    int i62 = intArrayUtil59.findKthLargestViaQuickSort(i_array60, (-1));
    int[] i_array66 = new int[] { '4', (byte)0 };
    int i67 = intArrayUtil59.findMinSubArrayLen(0, i_array66);
    int i68 = intArrayUtil50.removeDuplicateElements(i_array66);
    util.IntArrayUtil intArrayUtil70 = new util.IntArrayUtil();
    int[] i_array71 = new int[] {  };
    int i73 = intArrayUtil70.findKthLargestViaQuickSort(i_array71, (-1));
    int[] i_array77 = new int[] { '4', (byte)0 };
    int i78 = intArrayUtil70.findMinSubArrayLen(0, i_array77);
    int i79 = intArrayUtil50.findMinSubArrayLen((int)(short)0, i_array77);
    int i80 = intArrayUtil41.findMinViaIteration(i_array77);
    util.IntArrayUtil intArrayUtil82 = new util.IntArrayUtil();
    int[] i_array83 = new int[] {  };
    int i85 = intArrayUtil82.findKthLargestViaQuickSort(i_array83, (-1));
    int[] i_array89 = new int[] { '4', (byte)0 };
    int i90 = intArrayUtil82.findMinSubArrayLen(0, i_array89);
    int i91 = intArrayUtil41.findMinSubArrayLen(5, i_array89);
    util.IntArrayUtil intArrayUtil92 = new util.IntArrayUtil();
    int[] i_array93 = new int[] {  };
    int i95 = intArrayUtil92.findKthLargestViaQuickSort(i_array93, (-1));
    intArrayUtil41.getNextPermutationNumber(i_array93);
    int i97 = intArrayUtil24.findMinSubArrayLen(32, i_array93);
    int i98 = intArrayUtil0.findMinSubArrayLen((int)(short)0, i_array93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i90 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i91 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i95 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i97 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i98 == 0);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test23"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    int[] i_array9 = null;
    intArrayUtil0.getNextPermutationNumber(i_array9);
    util.IntArrayUtil intArrayUtil11 = new util.IntArrayUtil();
    int[] i_array12 = new int[] {  };
    int i14 = intArrayUtil11.findKthLargestViaQuickSort(i_array12, (-1));
    int[] i_array18 = new int[] { '4', (byte)0 };
    int i19 = intArrayUtil11.findMinSubArrayLen(0, i_array18);
    util.IntArrayUtil intArrayUtil20 = new util.IntArrayUtil();
    int[] i_array21 = new int[] {  };
    int i23 = intArrayUtil20.findKthLargestViaQuickSort(i_array21, (-1));
    int[] i_array27 = new int[] { '4', (byte)0 };
    int i28 = intArrayUtil20.findMinSubArrayLen(0, i_array27);
    int i29 = intArrayUtil11.removeDuplicateElements(i_array27);
    util.IntArrayUtil intArrayUtil31 = new util.IntArrayUtil();
    int[] i_array32 = new int[] {  };
    int i34 = intArrayUtil31.findKthLargestViaQuickSort(i_array32, (-1));
    int[] i_array38 = new int[] { '4', (byte)0 };
    int i39 = intArrayUtil31.findMinSubArrayLen(0, i_array38);
    int i40 = intArrayUtil11.findMinSubArrayLen((int)(short)0, i_array38);
    int i41 = intArrayUtil0.findMinViaRecursion(i_array38);
    util.IntArrayUtil intArrayUtil43 = new util.IntArrayUtil();
    int[] i_array44 = new int[] {  };
    int i46 = intArrayUtil43.findKthLargestViaQuickSort(i_array44, (-1));
    int[] i_array50 = new int[] { '4', (byte)0 };
    int i51 = intArrayUtil43.findMinSubArrayLen(0, i_array50);
    util.IntArrayUtil intArrayUtil52 = new util.IntArrayUtil();
    int[] i_array53 = new int[] {  };
    int i55 = intArrayUtil52.findKthLargestViaQuickSort(i_array53, (-1));
    int[] i_array59 = new int[] { '4', (byte)0 };
    int i60 = intArrayUtil52.findMinSubArrayLen(0, i_array59);
    int i61 = intArrayUtil43.removeDuplicateElements(i_array59);
    int i62 = intArrayUtil0.findMinSubArrayLen(10, i_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 1);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test24"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil9 = new util.IntArrayUtil();
    int[] i_array10 = new int[] {  };
    int i12 = intArrayUtil9.findKthLargestViaQuickSort(i_array10, (-1));
    int[] i_array16 = new int[] { '4', (byte)0 };
    int i17 = intArrayUtil9.findMinSubArrayLen(0, i_array16);
    int i18 = intArrayUtil0.removeDuplicateElements(i_array16);
    util.IntArrayUtil intArrayUtil20 = new util.IntArrayUtil();
    int[] i_array21 = new int[] {  };
    int i23 = intArrayUtil20.findKthLargestViaQuickSort(i_array21, (-1));
    int[] i_array27 = new int[] { '4', (byte)0 };
    int i28 = intArrayUtil20.findMinSubArrayLen(0, i_array27);
    int i29 = intArrayUtil0.findMinSubArrayLen((int)(short)0, i_array27);
    util.IntArrayUtil intArrayUtil30 = new util.IntArrayUtil();
    int[] i_array31 = new int[] {  };
    int i33 = intArrayUtil30.findKthLargestViaQuickSort(i_array31, (-1));
    int i35 = intArrayUtil0.threeSumClosest(i_array31, 1);
    int[] i_array36 = null;
    int i37 = intArrayUtil0.findMinViaIteration(i_array36);
    util.IntArrayUtil intArrayUtil39 = new util.IntArrayUtil();
    int[] i_array40 = new int[] {  };
    int i42 = intArrayUtil39.findKthLargestViaQuickSort(i_array40, (-1));
    int[] i_array46 = new int[] { '4', (byte)0 };
    int i47 = intArrayUtil39.findMinSubArrayLen(0, i_array46);
    util.IntArrayUtil intArrayUtil49 = new util.IntArrayUtil();
    int[] i_array50 = new int[] {  };
    int i52 = intArrayUtil49.findKthLargestViaQuickSort(i_array50, (-1));
    int i53 = intArrayUtil39.findMinSubArrayLen((int)(byte)-1, i_array50);
    util.IntArrayUtil intArrayUtil54 = new util.IntArrayUtil();
    int[] i_array55 = new int[] {  };
    int i57 = intArrayUtil54.findKthLargestViaQuickSort(i_array55, (-1));
    int[] i_array61 = new int[] { '4', (byte)0 };
    int i62 = intArrayUtil54.findMinSubArrayLen(0, i_array61);
    util.IntArrayUtil intArrayUtil63 = new util.IntArrayUtil();
    int[] i_array64 = new int[] {  };
    int i66 = intArrayUtil63.findKthLargestViaQuickSort(i_array64, (-1));
    int[] i_array70 = new int[] { '4', (byte)0 };
    int i71 = intArrayUtil63.findMinSubArrayLen(0, i_array70);
    util.IntArrayUtil intArrayUtil72 = new util.IntArrayUtil();
    int[] i_array73 = new int[] {  };
    int i75 = intArrayUtil72.findKthLargestViaQuickSort(i_array73, (-1));
    int[] i_array79 = new int[] { '4', (byte)0 };
    int i80 = intArrayUtil72.findMinSubArrayLen(0, i_array79);
    int i81 = intArrayUtil63.removeDuplicateElements(i_array79);
    util.IntArrayUtil intArrayUtil83 = new util.IntArrayUtil();
    int[] i_array84 = new int[] {  };
    int i86 = intArrayUtil83.findKthLargestViaQuickSort(i_array84, (-1));
    int[] i_array90 = new int[] { '4', (byte)0 };
    int i91 = intArrayUtil83.findMinSubArrayLen(0, i_array90);
    int i92 = intArrayUtil63.findMinSubArrayLen((int)(short)0, i_array90);
    int i93 = intArrayUtil54.removeDuplicateElements(i_array90);
    int i94 = intArrayUtil39.findMinViaIteration(i_array90);
    int i95 = intArrayUtil0.findMinSubArrayLen((-5), i_array90);
    int[] i_array96 = null;
    int i97 = intArrayUtil0.findMinViaIteration(i_array96);
    int[] i_array98 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i99 = intArrayUtil0.findMinViaRecursion(i_array98);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i86 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i91 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i92 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i93 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i94 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i95 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i97 == (-1));

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test25"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    int[] i_array9 = null;
    intArrayUtil0.getNextPermutationNumber(i_array9);
    int[] i_array11 = null;
    int i12 = intArrayUtil0.removeDuplicateElements(i_array11);
    int[] i_array13 = null;
    int i15 = intArrayUtil0.findKthLargestViaQuickSort(i_array13, 2);
    util.IntArrayUtil intArrayUtil16 = new util.IntArrayUtil();
    int[] i_array17 = new int[] {  };
    int i19 = intArrayUtil16.findKthLargestViaQuickSort(i_array17, (-1));
    int[] i_array23 = new int[] { '4', (byte)0 };
    int i24 = intArrayUtil16.findMinSubArrayLen(0, i_array23);
    util.IntArrayUtil intArrayUtil25 = new util.IntArrayUtil();
    int[] i_array26 = new int[] {  };
    int i28 = intArrayUtil25.findKthLargestViaQuickSort(i_array26, (-1));
    int[] i_array32 = new int[] { '4', (byte)0 };
    int i33 = intArrayUtil25.findMinSubArrayLen(0, i_array32);
    int i34 = intArrayUtil16.removeDuplicateElements(i_array32);
    util.IntArrayUtil intArrayUtil36 = new util.IntArrayUtil();
    int[] i_array37 = new int[] {  };
    int i39 = intArrayUtil36.findKthLargestViaQuickSort(i_array37, (-1));
    int[] i_array43 = new int[] { '4', (byte)0 };
    int i44 = intArrayUtil36.findMinSubArrayLen(0, i_array43);
    int i45 = intArrayUtil16.findMinSubArrayLen((int)(short)0, i_array43);
    util.IntArrayUtil intArrayUtil46 = new util.IntArrayUtil();
    int[] i_array47 = new int[] {  };
    int i49 = intArrayUtil46.findKthLargestViaQuickSort(i_array47, (-1));
    int i51 = intArrayUtil16.threeSumClosest(i_array47, 1);
    int[] i_array52 = null;
    int i53 = intArrayUtil16.findMinViaIteration(i_array52);
    util.IntArrayUtil intArrayUtil54 = new util.IntArrayUtil();
    int[] i_array55 = new int[] {  };
    int i57 = intArrayUtil54.findKthLargestViaQuickSort(i_array55, (-1));
    int[] i_array61 = new int[] { '4', (byte)0 };
    int i62 = intArrayUtil54.findMinSubArrayLen(0, i_array61);
    util.IntArrayUtil intArrayUtil63 = new util.IntArrayUtil();
    int[] i_array64 = new int[] {  };
    int i66 = intArrayUtil63.findKthLargestViaQuickSort(i_array64, (-1));
    int[] i_array70 = new int[] { '4', (byte)0 };
    int i71 = intArrayUtil63.findMinSubArrayLen(0, i_array70);
    util.IntArrayUtil intArrayUtil72 = new util.IntArrayUtil();
    int[] i_array73 = new int[] {  };
    int i75 = intArrayUtil72.findKthLargestViaQuickSort(i_array73, (-1));
    int[] i_array79 = new int[] { '4', (byte)0 };
    int i80 = intArrayUtil72.findMinSubArrayLen(0, i_array79);
    int i81 = intArrayUtil63.removeDuplicateElements(i_array79);
    util.IntArrayUtil intArrayUtil83 = new util.IntArrayUtil();
    int[] i_array84 = new int[] {  };
    int i86 = intArrayUtil83.findKthLargestViaQuickSort(i_array84, (-1));
    int[] i_array90 = new int[] { '4', (byte)0 };
    int i91 = intArrayUtil83.findMinSubArrayLen(0, i_array90);
    int i92 = intArrayUtil63.findMinSubArrayLen((int)(short)0, i_array90);
    int i93 = intArrayUtil54.removeDuplicateElements(i_array90);
    int i94 = intArrayUtil16.removeDuplicateElements(i_array90);
    int i95 = intArrayUtil0.removeDuplicateElements(i_array90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i86 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i91 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i92 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i93 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i94 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i95 == 2);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test26"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil9 = new util.IntArrayUtil();
    int[] i_array10 = new int[] {  };
    int i12 = intArrayUtil9.findKthLargestViaQuickSort(i_array10, (-1));
    int[] i_array16 = new int[] { '4', (byte)0 };
    int i17 = intArrayUtil9.findMinSubArrayLen(0, i_array16);
    int i18 = intArrayUtil0.removeDuplicateElements(i_array16);
    util.IntArrayUtil intArrayUtil20 = new util.IntArrayUtil();
    int[] i_array21 = new int[] {  };
    int i23 = intArrayUtil20.findKthLargestViaQuickSort(i_array21, (-1));
    int[] i_array27 = new int[] { '4', (byte)0 };
    int i28 = intArrayUtil20.findMinSubArrayLen(0, i_array27);
    int i29 = intArrayUtil0.findMinSubArrayLen((int)(short)0, i_array27);
    util.IntArrayUtil intArrayUtil30 = new util.IntArrayUtil();
    int[] i_array31 = new int[] {  };
    int i33 = intArrayUtil30.findKthLargestViaQuickSort(i_array31, (-1));
    int[] i_array37 = new int[] { '4', (byte)0 };
    int i38 = intArrayUtil30.findMinSubArrayLen(0, i_array37);
    int i39 = intArrayUtil0.findMinViaRecursion(i_array37);
    util.IntArrayUtil intArrayUtil40 = new util.IntArrayUtil();
    util.IntArrayUtil intArrayUtil41 = new util.IntArrayUtil();
    int[] i_array42 = new int[] {  };
    int i44 = intArrayUtil41.findKthLargestViaQuickSort(i_array42, (-1));
    int[] i_array48 = new int[] { '4', (byte)0 };
    int i49 = intArrayUtil41.findMinSubArrayLen(0, i_array48);
    util.IntArrayUtil intArrayUtil50 = new util.IntArrayUtil();
    int[] i_array51 = new int[] {  };
    int i53 = intArrayUtil50.findKthLargestViaQuickSort(i_array51, (-1));
    int[] i_array57 = new int[] { '4', (byte)0 };
    int i58 = intArrayUtil50.findMinSubArrayLen(0, i_array57);
    util.IntArrayUtil intArrayUtil59 = new util.IntArrayUtil();
    int[] i_array60 = new int[] {  };
    int i62 = intArrayUtil59.findKthLargestViaQuickSort(i_array60, (-1));
    int[] i_array66 = new int[] { '4', (byte)0 };
    int i67 = intArrayUtil59.findMinSubArrayLen(0, i_array66);
    int i68 = intArrayUtil50.removeDuplicateElements(i_array66);
    util.IntArrayUtil intArrayUtil70 = new util.IntArrayUtil();
    int[] i_array71 = new int[] {  };
    int i73 = intArrayUtil70.findKthLargestViaQuickSort(i_array71, (-1));
    int[] i_array77 = new int[] { '4', (byte)0 };
    int i78 = intArrayUtil70.findMinSubArrayLen(0, i_array77);
    int i79 = intArrayUtil50.findMinSubArrayLen((int)(short)0, i_array77);
    int i80 = intArrayUtil41.removeDuplicateElements(i_array77);
    util.IntArrayUtil intArrayUtil81 = new util.IntArrayUtil();
    int[] i_array82 = new int[] {  };
    int i84 = intArrayUtil81.findKthLargestViaQuickSort(i_array82, (-1));
    int i85 = intArrayUtil41.removeDuplicateElements(i_array82);
    int[] i_array88 = new int[] { 10, (byte)10 };
    int i90 = intArrayUtil41.findKthLargestViaQuickSort(i_array88, (-1));
    intArrayUtil40.getNextPermutationNumber(i_array88);
    intArrayUtil0.getNextPermutationNumber(i_array88);
    int[] i_array94 = null;
    int i95 = intArrayUtil0.findMinSubArrayLen(4, i_array94);
    int[] i_array97 = null;
    int i98 = intArrayUtil0.findMinSubArrayLen((int)'#', i_array97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i84 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i90 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i95 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i98 == 0);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test27"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    int[] i_array9 = null;
    intArrayUtil0.getNextPermutationNumber(i_array9);
    int[] i_array11 = null;
    int i12 = intArrayUtil0.removeDuplicateElements(i_array11);
    util.IntArrayUtil intArrayUtil13 = new util.IntArrayUtil();
    int[] i_array14 = new int[] {  };
    int i16 = intArrayUtil13.findKthLargestViaQuickSort(i_array14, (-1));
    int i17 = intArrayUtil0.findMinViaIteration(i_array14);
    util.IntArrayUtil intArrayUtil18 = new util.IntArrayUtil();
    int[] i_array19 = new int[] {  };
    int i21 = intArrayUtil18.findKthLargestViaQuickSort(i_array19, (-1));
    util.IntArrayUtil intArrayUtil22 = new util.IntArrayUtil();
    int[] i_array23 = new int[] {  };
    int i25 = intArrayUtil22.findKthLargestViaQuickSort(i_array23, (-1));
    int[] i_array29 = new int[] { '4', (byte)0 };
    int i30 = intArrayUtil22.findMinSubArrayLen(0, i_array29);
    util.IntArrayUtil intArrayUtil31 = new util.IntArrayUtil();
    int[] i_array32 = new int[] {  };
    int i34 = intArrayUtil31.findKthLargestViaQuickSort(i_array32, (-1));
    int[] i_array38 = new int[] { '4', (byte)0 };
    int i39 = intArrayUtil31.findMinSubArrayLen(0, i_array38);
    int i41 = intArrayUtil22.threeSumClosest(i_array38, (int)(short)100);
    int i42 = intArrayUtil18.removeDuplicateElements(i_array38);
    int[] i_array44 = null;
    int i45 = intArrayUtil18.findMinSubArrayLen((int)' ', i_array44);
    util.IntArrayUtil intArrayUtil46 = new util.IntArrayUtil();
    int[] i_array47 = new int[] {  };
    int i49 = intArrayUtil46.findKthLargestViaQuickSort(i_array47, (-1));
    util.IntArrayUtil intArrayUtil50 = new util.IntArrayUtil();
    int[] i_array51 = new int[] {  };
    int i53 = intArrayUtil50.findKthLargestViaQuickSort(i_array51, (-1));
    int[] i_array57 = new int[] { '4', (byte)0 };
    int i58 = intArrayUtil50.findMinSubArrayLen(0, i_array57);
    util.IntArrayUtil intArrayUtil59 = new util.IntArrayUtil();
    int[] i_array60 = new int[] {  };
    int i62 = intArrayUtil59.findKthLargestViaQuickSort(i_array60, (-1));
    int[] i_array66 = new int[] { '4', (byte)0 };
    int i67 = intArrayUtil59.findMinSubArrayLen(0, i_array66);
    int i68 = intArrayUtil50.removeDuplicateElements(i_array66);
    util.IntArrayUtil intArrayUtil70 = new util.IntArrayUtil();
    int[] i_array71 = new int[] {  };
    int i73 = intArrayUtil70.findKthLargestViaQuickSort(i_array71, (-1));
    int[] i_array77 = new int[] { '4', (byte)0 };
    int i78 = intArrayUtil70.findMinSubArrayLen(0, i_array77);
    int i79 = intArrayUtil50.findMinSubArrayLen((int)(short)0, i_array77);
    util.IntArrayUtil intArrayUtil80 = new util.IntArrayUtil();
    int[] i_array81 = new int[] {  };
    int i83 = intArrayUtil80.findKthLargestViaQuickSort(i_array81, (-1));
    int[] i_array87 = new int[] { '4', (byte)0 };
    int i88 = intArrayUtil80.findMinSubArrayLen(0, i_array87);
    intArrayUtil50.getNextPermutationNumber(i_array87);
    int i91 = intArrayUtil46.threeSumClosest(i_array87, (int)(short)10);
    int i92 = intArrayUtil18.removeDuplicateElements(i_array87);
    int i94 = intArrayUtil0.threeSumClosest(i_array87, (int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i91 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i92 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i94 == 0);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test28"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil9 = new util.IntArrayUtil();
    int[] i_array10 = new int[] {  };
    int i12 = intArrayUtil9.findKthLargestViaQuickSort(i_array10, (-1));
    int[] i_array16 = new int[] { '4', (byte)0 };
    int i17 = intArrayUtil9.findMinSubArrayLen(0, i_array16);
    util.IntArrayUtil intArrayUtil18 = new util.IntArrayUtil();
    int[] i_array19 = new int[] {  };
    int i21 = intArrayUtil18.findKthLargestViaQuickSort(i_array19, (-1));
    int[] i_array25 = new int[] { '4', (byte)0 };
    int i26 = intArrayUtil18.findMinSubArrayLen(0, i_array25);
    int i27 = intArrayUtil9.removeDuplicateElements(i_array25);
    util.IntArrayUtil intArrayUtil29 = new util.IntArrayUtil();
    int[] i_array30 = new int[] {  };
    int i32 = intArrayUtil29.findKthLargestViaQuickSort(i_array30, (-1));
    int[] i_array36 = new int[] { '4', (byte)0 };
    int i37 = intArrayUtil29.findMinSubArrayLen(0, i_array36);
    int i38 = intArrayUtil9.findMinSubArrayLen((int)(short)0, i_array36);
    int i39 = intArrayUtil0.removeDuplicateElements(i_array36);
    util.IntArrayUtil intArrayUtil41 = new util.IntArrayUtil();
    int[] i_array42 = new int[] {  };
    int i44 = intArrayUtil41.findKthLargestViaQuickSort(i_array42, (-1));
    int[] i_array48 = new int[] { '4', (byte)0 };
    int i49 = intArrayUtil41.findMinSubArrayLen(0, i_array48);
    util.IntArrayUtil intArrayUtil51 = new util.IntArrayUtil();
    int[] i_array52 = new int[] {  };
    int i54 = intArrayUtil51.findKthLargestViaQuickSort(i_array52, (-1));
    int i55 = intArrayUtil41.findMinSubArrayLen((int)(byte)-1, i_array52);
    util.IntArrayUtil intArrayUtil56 = new util.IntArrayUtil();
    int[] i_array57 = new int[] {  };
    int i59 = intArrayUtil56.findKthLargestViaQuickSort(i_array57, (-1));
    int[] i_array63 = new int[] { '4', (byte)0 };
    int i64 = intArrayUtil56.findMinSubArrayLen(0, i_array63);
    util.IntArrayUtil intArrayUtil65 = new util.IntArrayUtil();
    int[] i_array66 = new int[] {  };
    int i68 = intArrayUtil65.findKthLargestViaQuickSort(i_array66, (-1));
    int[] i_array72 = new int[] { '4', (byte)0 };
    int i73 = intArrayUtil65.findMinSubArrayLen(0, i_array72);
    int i75 = intArrayUtil56.threeSumClosest(i_array72, (int)(short)100);
    int i77 = intArrayUtil41.threeSumClosest(i_array72, 4);
    int i78 = intArrayUtil0.findMinSubArrayLen((-8), i_array72);
    int[] i_array80 = new int[] { (byte)100 };
    intArrayUtil0.getNextPermutationNumber(i_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array80);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test29"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil9 = new util.IntArrayUtil();
    int[] i_array10 = new int[] {  };
    int i12 = intArrayUtil9.findKthLargestViaQuickSort(i_array10, (-1));
    int[] i_array16 = new int[] { '4', (byte)0 };
    int i17 = intArrayUtil9.findMinSubArrayLen(0, i_array16);
    int i18 = intArrayUtil0.removeDuplicateElements(i_array16);
    util.IntArrayUtil intArrayUtil20 = new util.IntArrayUtil();
    int[] i_array21 = new int[] {  };
    int i23 = intArrayUtil20.findKthLargestViaQuickSort(i_array21, (-1));
    int[] i_array27 = new int[] { '4', (byte)0 };
    int i28 = intArrayUtil20.findMinSubArrayLen(0, i_array27);
    int i29 = intArrayUtil0.findMinSubArrayLen((int)(short)0, i_array27);
    util.IntArrayUtil intArrayUtil30 = new util.IntArrayUtil();
    int[] i_array31 = new int[] {  };
    int i33 = intArrayUtil30.findKthLargestViaQuickSort(i_array31, (-1));
    int[] i_array37 = new int[] { '4', (byte)0 };
    int i38 = intArrayUtil30.findMinSubArrayLen(0, i_array37);
    int i39 = intArrayUtil0.findMinViaRecursion(i_array37);
    int[] i_array40 = null;
    int i41 = intArrayUtil0.removeDuplicateElements(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test30"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    int[] i_array9 = null;
    intArrayUtil0.getNextPermutationNumber(i_array9);
    util.IntArrayUtil intArrayUtil11 = new util.IntArrayUtil();
    int[] i_array12 = new int[] {  };
    int i14 = intArrayUtil11.findKthLargestViaQuickSort(i_array12, (-1));
    int[] i_array18 = new int[] { '4', (byte)0 };
    int i19 = intArrayUtil11.findMinSubArrayLen(0, i_array18);
    util.IntArrayUtil intArrayUtil20 = new util.IntArrayUtil();
    int[] i_array21 = new int[] {  };
    int i23 = intArrayUtil20.findKthLargestViaQuickSort(i_array21, (-1));
    int[] i_array27 = new int[] { '4', (byte)0 };
    int i28 = intArrayUtil20.findMinSubArrayLen(0, i_array27);
    int i29 = intArrayUtil11.removeDuplicateElements(i_array27);
    util.IntArrayUtil intArrayUtil31 = new util.IntArrayUtil();
    int[] i_array32 = new int[] {  };
    int i34 = intArrayUtil31.findKthLargestViaQuickSort(i_array32, (-1));
    int[] i_array38 = new int[] { '4', (byte)0 };
    int i39 = intArrayUtil31.findMinSubArrayLen(0, i_array38);
    int i40 = intArrayUtil11.findMinSubArrayLen((int)(short)0, i_array38);
    int i41 = intArrayUtil0.findMinViaRecursion(i_array38);
    util.IntArrayUtil intArrayUtil42 = new util.IntArrayUtil();
    int[] i_array43 = new int[] {  };
    int i45 = intArrayUtil42.findKthLargestViaQuickSort(i_array43, (-1));
    int[] i_array49 = new int[] { '4', (byte)0 };
    int i50 = intArrayUtil42.findMinSubArrayLen(0, i_array49);
    int i52 = intArrayUtil0.findKthLargestViaQuickSort(i_array49, 0);
    int[] i_array54 = null;
    int i55 = intArrayUtil0.findMinSubArrayLen((-6), i_array54);
    util.IntArrayUtil intArrayUtil56 = new util.IntArrayUtil();
    int[] i_array57 = new int[] {  };
    int i59 = intArrayUtil56.findKthLargestViaQuickSort(i_array57, (-1));
    int[] i_array63 = new int[] { '4', (byte)0 };
    int i64 = intArrayUtil56.findMinSubArrayLen(0, i_array63);
    util.IntArrayUtil intArrayUtil65 = new util.IntArrayUtil();
    int[] i_array66 = new int[] {  };
    int i68 = intArrayUtil65.findKthLargestViaQuickSort(i_array66, (-1));
    int[] i_array72 = new int[] { '4', (byte)0 };
    int i73 = intArrayUtil65.findMinSubArrayLen(0, i_array72);
    util.IntArrayUtil intArrayUtil74 = new util.IntArrayUtil();
    int[] i_array75 = new int[] {  };
    int i77 = intArrayUtil74.findKthLargestViaQuickSort(i_array75, (-1));
    int[] i_array81 = new int[] { '4', (byte)0 };
    int i82 = intArrayUtil74.findMinSubArrayLen(0, i_array81);
    int i83 = intArrayUtil65.removeDuplicateElements(i_array81);
    util.IntArrayUtil intArrayUtil85 = new util.IntArrayUtil();
    int[] i_array86 = new int[] {  };
    int i88 = intArrayUtil85.findKthLargestViaQuickSort(i_array86, (-1));
    int[] i_array92 = new int[] { '4', (byte)0 };
    int i93 = intArrayUtil85.findMinSubArrayLen(0, i_array92);
    int i94 = intArrayUtil65.findMinSubArrayLen((int)(short)0, i_array92);
    int i95 = intArrayUtil56.removeDuplicateElements(i_array92);
    int i96 = intArrayUtil0.findMinViaIteration(i_array92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i93 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i94 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i95 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i96 == 0);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test31"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil9 = new util.IntArrayUtil();
    int[] i_array10 = new int[] {  };
    int i12 = intArrayUtil9.findKthLargestViaQuickSort(i_array10, (-1));
    int[] i_array16 = new int[] { '4', (byte)0 };
    int i17 = intArrayUtil9.findMinSubArrayLen(0, i_array16);
    int i18 = intArrayUtil0.removeDuplicateElements(i_array16);
    util.IntArrayUtil intArrayUtil19 = new util.IntArrayUtil();
    int[] i_array20 = new int[] {  };
    int i22 = intArrayUtil19.findKthLargestViaQuickSort(i_array20, (-1));
    int i24 = intArrayUtil0.findKthLargestViaQuickSort(i_array20, (-2));
    util.IntArrayUtil intArrayUtil25 = new util.IntArrayUtil();
    int[] i_array26 = new int[] {  };
    int i28 = intArrayUtil25.findKthLargestViaQuickSort(i_array26, (-1));
    int[] i_array32 = new int[] { '4', (byte)0 };
    int i33 = intArrayUtil25.findMinSubArrayLen(0, i_array32);
    util.IntArrayUtil intArrayUtil35 = new util.IntArrayUtil();
    int[] i_array36 = new int[] {  };
    int i38 = intArrayUtil35.findKthLargestViaQuickSort(i_array36, (-1));
    int i39 = intArrayUtil25.findMinSubArrayLen((int)(byte)-1, i_array36);
    int i40 = intArrayUtil0.findMinViaIteration(i_array36);
    int[] i_array41 = null;
    int i42 = intArrayUtil0.removeDuplicateElements(i_array41);
    util.IntArrayUtil intArrayUtil43 = new util.IntArrayUtil();
    int[] i_array44 = new int[] {  };
    int i46 = intArrayUtil43.findKthLargestViaQuickSort(i_array44, (-1));
    int[] i_array50 = new int[] { '4', (byte)0 };
    int i51 = intArrayUtil43.findMinSubArrayLen(0, i_array50);
    util.IntArrayUtil intArrayUtil52 = new util.IntArrayUtil();
    int[] i_array53 = new int[] {  };
    int i55 = intArrayUtil52.findKthLargestViaQuickSort(i_array53, (-1));
    int[] i_array59 = new int[] { '4', (byte)0 };
    int i60 = intArrayUtil52.findMinSubArrayLen(0, i_array59);
    int i61 = intArrayUtil43.removeDuplicateElements(i_array59);
    util.IntArrayUtil intArrayUtil63 = new util.IntArrayUtil();
    int[] i_array64 = new int[] {  };
    int i66 = intArrayUtil63.findKthLargestViaQuickSort(i_array64, (-1));
    int[] i_array70 = new int[] { '4', (byte)0 };
    int i71 = intArrayUtil63.findMinSubArrayLen(0, i_array70);
    int i72 = intArrayUtil43.findMinSubArrayLen((int)(short)0, i_array70);
    util.IntArrayUtil intArrayUtil73 = new util.IntArrayUtil();
    int[] i_array74 = new int[] {  };
    int i76 = intArrayUtil73.findKthLargestViaQuickSort(i_array74, (-1));
    int i77 = intArrayUtil43.findMinViaIteration(i_array74);
    int i78 = intArrayUtil0.findMinViaIteration(i_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == (-1));

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test32"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil10 = new util.IntArrayUtil();
    int[] i_array11 = new int[] {  };
    int i13 = intArrayUtil10.findKthLargestViaQuickSort(i_array11, (-1));
    int i14 = intArrayUtil0.findMinSubArrayLen((int)(byte)-1, i_array11);
    util.IntArrayUtil intArrayUtil16 = new util.IntArrayUtil();
    int[] i_array17 = new int[] {  };
    int i19 = intArrayUtil16.findKthLargestViaQuickSort(i_array17, (-1));
    int[] i_array23 = new int[] { '4', (byte)0 };
    int i24 = intArrayUtil16.findMinSubArrayLen(0, i_array23);
    util.IntArrayUtil intArrayUtil25 = new util.IntArrayUtil();
    int[] i_array26 = new int[] {  };
    int i28 = intArrayUtil25.findKthLargestViaQuickSort(i_array26, (-1));
    int[] i_array32 = new int[] { '4', (byte)0 };
    int i33 = intArrayUtil25.findMinSubArrayLen(0, i_array32);
    int i34 = intArrayUtil16.removeDuplicateElements(i_array32);
    util.IntArrayUtil intArrayUtil36 = new util.IntArrayUtil();
    int[] i_array37 = new int[] {  };
    int i39 = intArrayUtil36.findKthLargestViaQuickSort(i_array37, (-1));
    int[] i_array43 = new int[] { '4', (byte)0 };
    int i44 = intArrayUtil36.findMinSubArrayLen(0, i_array43);
    int i45 = intArrayUtil16.findMinSubArrayLen((int)(short)0, i_array43);
    util.IntArrayUtil intArrayUtil46 = new util.IntArrayUtil();
    int[] i_array47 = new int[] {  };
    int i49 = intArrayUtil46.findKthLargestViaQuickSort(i_array47, (-1));
    int i51 = intArrayUtil16.threeSumClosest(i_array47, 1);
    int[] i_array52 = null;
    int i53 = intArrayUtil16.findMinViaIteration(i_array52);
    util.IntArrayUtil intArrayUtil54 = new util.IntArrayUtil();
    int[] i_array55 = new int[] {  };
    int i57 = intArrayUtil54.findKthLargestViaQuickSort(i_array55, (-1));
    int[] i_array61 = new int[] { '4', (byte)0 };
    int i62 = intArrayUtil54.findMinSubArrayLen(0, i_array61);
    util.IntArrayUtil intArrayUtil63 = new util.IntArrayUtil();
    int[] i_array64 = new int[] {  };
    int i66 = intArrayUtil63.findKthLargestViaQuickSort(i_array64, (-1));
    int[] i_array70 = new int[] { '4', (byte)0 };
    int i71 = intArrayUtil63.findMinSubArrayLen(0, i_array70);
    int i72 = intArrayUtil54.removeDuplicateElements(i_array70);
    util.IntArrayUtil intArrayUtil74 = new util.IntArrayUtil();
    int[] i_array75 = new int[] {  };
    int i77 = intArrayUtil74.findKthLargestViaQuickSort(i_array75, (-1));
    int[] i_array81 = new int[] { '4', (byte)0 };
    int i82 = intArrayUtil74.findMinSubArrayLen(0, i_array81);
    int i83 = intArrayUtil54.findMinSubArrayLen((int)(short)0, i_array81);
    util.IntArrayUtil intArrayUtil84 = new util.IntArrayUtil();
    int[] i_array85 = new int[] {  };
    int i87 = intArrayUtil84.findKthLargestViaQuickSort(i_array85, (-1));
    int i88 = intArrayUtil54.findMinViaIteration(i_array85);
    int i90 = intArrayUtil16.findKthLargestViaQuickSort(i_array85, (int)(byte)0);
    int i91 = intArrayUtil0.findMinSubArrayLen(52, i_array85);
    int[] i_array92 = null;
    int i93 = intArrayUtil0.findMinViaIteration(i_array92);
    util.IntArrayUtil intArrayUtil95 = new util.IntArrayUtil();
    int[] i_array96 = new int[] {  };
    int i98 = intArrayUtil95.findKthLargestViaQuickSort(i_array96, (-1));
    int i99 = intArrayUtil0.findMinSubArrayLen(0, i_array96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i90 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i91 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i93 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i98 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i99 == 0);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test33"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    util.IntArrayUtil intArrayUtil4 = new util.IntArrayUtil();
    int[] i_array5 = new int[] {  };
    int i7 = intArrayUtil4.findKthLargestViaQuickSort(i_array5, (-1));
    int[] i_array11 = new int[] { '4', (byte)0 };
    int i12 = intArrayUtil4.findMinSubArrayLen(0, i_array11);
    util.IntArrayUtil intArrayUtil13 = new util.IntArrayUtil();
    int[] i_array14 = new int[] {  };
    int i16 = intArrayUtil13.findKthLargestViaQuickSort(i_array14, (-1));
    int[] i_array20 = new int[] { '4', (byte)0 };
    int i21 = intArrayUtil13.findMinSubArrayLen(0, i_array20);
    int i22 = intArrayUtil4.removeDuplicateElements(i_array20);
    util.IntArrayUtil intArrayUtil24 = new util.IntArrayUtil();
    int[] i_array25 = new int[] {  };
    int i27 = intArrayUtil24.findKthLargestViaQuickSort(i_array25, (-1));
    int[] i_array31 = new int[] { '4', (byte)0 };
    int i32 = intArrayUtil24.findMinSubArrayLen(0, i_array31);
    int i33 = intArrayUtil4.findMinSubArrayLen((int)(short)0, i_array31);
    util.IntArrayUtil intArrayUtil34 = new util.IntArrayUtil();
    int[] i_array35 = new int[] {  };
    int i37 = intArrayUtil34.findKthLargestViaQuickSort(i_array35, (-1));
    int[] i_array41 = new int[] { '4', (byte)0 };
    int i42 = intArrayUtil34.findMinSubArrayLen(0, i_array41);
    intArrayUtil4.getNextPermutationNumber(i_array41);
    int i44 = intArrayUtil0.findMinViaIteration(i_array41);
    util.IntArrayUtil intArrayUtil45 = new util.IntArrayUtil();
    int[] i_array46 = new int[] {  };
    int i48 = intArrayUtil45.findKthLargestViaQuickSort(i_array46, (-1));
    int[] i_array52 = new int[] { '4', (byte)0 };
    int i53 = intArrayUtil45.findMinSubArrayLen(0, i_array52);
    util.IntArrayUtil intArrayUtil54 = new util.IntArrayUtil();
    int[] i_array55 = new int[] {  };
    int i57 = intArrayUtil54.findKthLargestViaQuickSort(i_array55, (-1));
    int[] i_array61 = new int[] { '4', (byte)0 };
    int i62 = intArrayUtil54.findMinSubArrayLen(0, i_array61);
    int i63 = intArrayUtil45.removeDuplicateElements(i_array61);
    util.IntArrayUtil intArrayUtil65 = new util.IntArrayUtil();
    int[] i_array66 = new int[] {  };
    int i68 = intArrayUtil65.findKthLargestViaQuickSort(i_array66, (-1));
    int[] i_array72 = new int[] { '4', (byte)0 };
    int i73 = intArrayUtil65.findMinSubArrayLen(0, i_array72);
    int i74 = intArrayUtil45.findMinSubArrayLen((int)(short)0, i_array72);
    util.IntArrayUtil intArrayUtil75 = new util.IntArrayUtil();
    int[] i_array76 = new int[] {  };
    int i78 = intArrayUtil75.findKthLargestViaQuickSort(i_array76, (-1));
    int i79 = intArrayUtil45.findMinViaIteration(i_array76);
    intArrayUtil0.getNextPermutationNumber(i_array76);
    int[] i_array82 = null;
    int i83 = intArrayUtil0.findMinSubArrayLen(0, i_array82);
    int[] i_array84 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i85 = intArrayUtil0.findMinViaRecursion(i_array84);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 0);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test34"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil9 = new util.IntArrayUtil();
    int[] i_array10 = new int[] {  };
    int i12 = intArrayUtil9.findKthLargestViaQuickSort(i_array10, (-1));
    int[] i_array16 = new int[] { '4', (byte)0 };
    int i17 = intArrayUtil9.findMinSubArrayLen(0, i_array16);
    int i18 = intArrayUtil0.removeDuplicateElements(i_array16);
    util.IntArrayUtil intArrayUtil19 = new util.IntArrayUtil();
    int[] i_array20 = new int[] {  };
    int i22 = intArrayUtil19.findKthLargestViaQuickSort(i_array20, (-1));
    int i24 = intArrayUtil0.findKthLargestViaQuickSort(i_array20, (-2));
    util.IntArrayUtil intArrayUtil25 = new util.IntArrayUtil();
    int[] i_array26 = new int[] {  };
    int i28 = intArrayUtil25.findKthLargestViaQuickSort(i_array26, (-1));
    int[] i_array32 = new int[] { '4', (byte)0 };
    int i33 = intArrayUtil25.findMinSubArrayLen(0, i_array32);
    util.IntArrayUtil intArrayUtil35 = new util.IntArrayUtil();
    int[] i_array36 = new int[] {  };
    int i38 = intArrayUtil35.findKthLargestViaQuickSort(i_array36, (-1));
    int i39 = intArrayUtil25.findMinSubArrayLen((int)(byte)-1, i_array36);
    int i40 = intArrayUtil0.findMinViaIteration(i_array36);
    int[] i_array41 = null;
    int i42 = intArrayUtil0.removeDuplicateElements(i_array41);
    int[] i_array43 = null;
    int i44 = intArrayUtil0.findMinViaIteration(i_array43);
    int[] i_array45 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i47 = intArrayUtil0.threeSumClosest(i_array45, (-9));
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == (-1));

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test35"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil9 = new util.IntArrayUtil();
    int[] i_array10 = new int[] {  };
    int i12 = intArrayUtil9.findKthLargestViaQuickSort(i_array10, (-1));
    int[] i_array16 = new int[] { '4', (byte)0 };
    int i17 = intArrayUtil9.findMinSubArrayLen(0, i_array16);
    int i18 = intArrayUtil0.removeDuplicateElements(i_array16);
    util.IntArrayUtil intArrayUtil20 = new util.IntArrayUtil();
    int[] i_array21 = new int[] {  };
    int i23 = intArrayUtil20.findKthLargestViaQuickSort(i_array21, (-1));
    int[] i_array27 = new int[] { '4', (byte)0 };
    int i28 = intArrayUtil20.findMinSubArrayLen(0, i_array27);
    int i29 = intArrayUtil0.findMinSubArrayLen((int)(short)0, i_array27);
    util.IntArrayUtil intArrayUtil30 = new util.IntArrayUtil();
    int[] i_array31 = new int[] {  };
    int i33 = intArrayUtil30.findKthLargestViaQuickSort(i_array31, (-1));
    int i35 = intArrayUtil0.threeSumClosest(i_array31, 1);
    util.IntArrayUtil intArrayUtil36 = new util.IntArrayUtil();
    int[] i_array37 = new int[] {  };
    int i39 = intArrayUtil36.findKthLargestViaQuickSort(i_array37, (-1));
    int[] i_array43 = new int[] { '4', (byte)0 };
    int i44 = intArrayUtil36.findMinSubArrayLen(0, i_array43);
    util.IntArrayUtil intArrayUtil45 = new util.IntArrayUtil();
    int[] i_array46 = new int[] {  };
    int i48 = intArrayUtil45.findKthLargestViaQuickSort(i_array46, (-1));
    int[] i_array52 = new int[] { '4', (byte)0 };
    int i53 = intArrayUtil45.findMinSubArrayLen(0, i_array52);
    int i54 = intArrayUtil36.removeDuplicateElements(i_array52);
    intArrayUtil0.getNextPermutationNumber(i_array52);
    int[] i_array56 = null;
    intArrayUtil0.getNextPermutationNumber(i_array56);
    util.IntArrayUtil intArrayUtil59 = new util.IntArrayUtil();
    int[] i_array60 = new int[] {  };
    int i62 = intArrayUtil59.findKthLargestViaQuickSort(i_array60, (-1));
    int[] i_array66 = new int[] { '4', (byte)0 };
    int i67 = intArrayUtil59.findMinSubArrayLen(0, i_array66);
    int[] i_array68 = null;
    intArrayUtil59.getNextPermutationNumber(i_array68);
    util.IntArrayUtil intArrayUtil70 = new util.IntArrayUtil();
    int[] i_array71 = new int[] {  };
    int i73 = intArrayUtil70.findKthLargestViaQuickSort(i_array71, (-1));
    int[] i_array77 = new int[] { '4', (byte)0 };
    int i78 = intArrayUtil70.findMinSubArrayLen(0, i_array77);
    util.IntArrayUtil intArrayUtil79 = new util.IntArrayUtil();
    int[] i_array80 = new int[] {  };
    int i82 = intArrayUtil79.findKthLargestViaQuickSort(i_array80, (-1));
    int[] i_array86 = new int[] { '4', (byte)0 };
    int i87 = intArrayUtil79.findMinSubArrayLen(0, i_array86);
    int i88 = intArrayUtil70.removeDuplicateElements(i_array86);
    util.IntArrayUtil intArrayUtil89 = new util.IntArrayUtil();
    int[] i_array90 = new int[] {  };
    int i92 = intArrayUtil89.findKthLargestViaQuickSort(i_array90, (-1));
    int i94 = intArrayUtil70.findKthLargestViaQuickSort(i_array90, (-2));
    int i96 = intArrayUtil59.threeSumClosest(i_array90, (int)(byte)1);
    int i97 = intArrayUtil0.findMinSubArrayLen((int)'#', i_array90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i92 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i94 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i96 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i97 == 0);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test36"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    util.IntArrayUtil intArrayUtil4 = new util.IntArrayUtil();
    int[] i_array5 = new int[] {  };
    int i7 = intArrayUtil4.findKthLargestViaQuickSort(i_array5, (-1));
    int[] i_array11 = new int[] { '4', (byte)0 };
    int i12 = intArrayUtil4.findMinSubArrayLen(0, i_array11);
    util.IntArrayUtil intArrayUtil13 = new util.IntArrayUtil();
    int[] i_array14 = new int[] {  };
    int i16 = intArrayUtil13.findKthLargestViaQuickSort(i_array14, (-1));
    int[] i_array20 = new int[] { '4', (byte)0 };
    int i21 = intArrayUtil13.findMinSubArrayLen(0, i_array20);
    int i23 = intArrayUtil4.threeSumClosest(i_array20, (int)(short)100);
    int i24 = intArrayUtil0.removeDuplicateElements(i_array20);
    int[] i_array26 = null;
    int i27 = intArrayUtil0.findMinSubArrayLen((int)' ', i_array26);
    util.IntArrayUtil intArrayUtil28 = new util.IntArrayUtil();
    int[] i_array29 = new int[] {  };
    int i31 = intArrayUtil28.findKthLargestViaQuickSort(i_array29, (-1));
    int[] i_array35 = new int[] { '4', (byte)0 };
    int i36 = intArrayUtil28.findMinSubArrayLen(0, i_array35);
    util.IntArrayUtil intArrayUtil38 = new util.IntArrayUtil();
    int[] i_array39 = new int[] {  };
    int i41 = intArrayUtil38.findKthLargestViaQuickSort(i_array39, (-1));
    int i42 = intArrayUtil28.findMinSubArrayLen((int)(byte)-1, i_array39);
    util.IntArrayUtil intArrayUtil43 = new util.IntArrayUtil();
    int[] i_array44 = new int[] {  };
    int i46 = intArrayUtil43.findKthLargestViaQuickSort(i_array44, (-1));
    int[] i_array50 = new int[] { '4', (byte)0 };
    int i51 = intArrayUtil43.findMinSubArrayLen(0, i_array50);
    util.IntArrayUtil intArrayUtil52 = new util.IntArrayUtil();
    int[] i_array53 = new int[] {  };
    int i55 = intArrayUtil52.findKthLargestViaQuickSort(i_array53, (-1));
    int[] i_array59 = new int[] { '4', (byte)0 };
    int i60 = intArrayUtil52.findMinSubArrayLen(0, i_array59);
    int i62 = intArrayUtil43.threeSumClosest(i_array59, (int)(short)100);
    int i64 = intArrayUtil28.threeSumClosest(i_array59, 4);
    int[] i_array65 = null;
    int i66 = intArrayUtil28.findMinViaIteration(i_array65);
    util.IntArrayUtil intArrayUtil68 = new util.IntArrayUtil();
    int[] i_array69 = new int[] {  };
    int i71 = intArrayUtil68.findKthLargestViaQuickSort(i_array69, (-1));
    int[] i_array75 = new int[] { '4', (byte)0 };
    int i76 = intArrayUtil68.findMinSubArrayLen(0, i_array75);
    util.IntArrayUtil intArrayUtil77 = new util.IntArrayUtil();
    int[] i_array78 = new int[] {  };
    int i80 = intArrayUtil77.findKthLargestViaQuickSort(i_array78, (-1));
    int[] i_array84 = new int[] { '4', (byte)0 };
    int i85 = intArrayUtil77.findMinSubArrayLen(0, i_array84);
    int i86 = intArrayUtil68.removeDuplicateElements(i_array84);
    util.IntArrayUtil intArrayUtil87 = new util.IntArrayUtil();
    int[] i_array88 = new int[] {  };
    int i90 = intArrayUtil87.findKthLargestViaQuickSort(i_array88, (-1));
    int i92 = intArrayUtil68.findKthLargestViaQuickSort(i_array88, (-2));
    int i93 = intArrayUtil28.findMinSubArrayLen(0, i_array88);
    // The following exception was thrown during execution in test generation
    try {
    int i94 = intArrayUtil0.findMinViaRecursion(i_array88);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i86 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i90 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i92 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i93 == 0);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test37"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    util.IntArrayUtil intArrayUtil1 = new util.IntArrayUtil();
    int[] i_array2 = new int[] {  };
    int i4 = intArrayUtil1.findKthLargestViaQuickSort(i_array2, (-1));
    int[] i_array8 = new int[] { '4', (byte)0 };
    int i9 = intArrayUtil1.findMinSubArrayLen(0, i_array8);
    util.IntArrayUtil intArrayUtil11 = new util.IntArrayUtil();
    int[] i_array12 = new int[] {  };
    int i14 = intArrayUtil11.findKthLargestViaQuickSort(i_array12, (-1));
    int i15 = intArrayUtil1.findMinSubArrayLen((int)(byte)-1, i_array12);
    util.IntArrayUtil intArrayUtil16 = new util.IntArrayUtil();
    int[] i_array17 = new int[] {  };
    int i19 = intArrayUtil16.findKthLargestViaQuickSort(i_array17, (-1));
    int[] i_array23 = new int[] { '4', (byte)0 };
    int i24 = intArrayUtil16.findMinSubArrayLen(0, i_array23);
    util.IntArrayUtil intArrayUtil25 = new util.IntArrayUtil();
    int[] i_array26 = new int[] {  };
    int i28 = intArrayUtil25.findKthLargestViaQuickSort(i_array26, (-1));
    int[] i_array32 = new int[] { '4', (byte)0 };
    int i33 = intArrayUtil25.findMinSubArrayLen(0, i_array32);
    int i35 = intArrayUtil16.threeSumClosest(i_array32, (int)(short)100);
    int i37 = intArrayUtil1.threeSumClosest(i_array32, 4);
    util.IntArrayUtil intArrayUtil38 = new util.IntArrayUtil();
    int[] i_array39 = new int[] {  };
    int i41 = intArrayUtil38.findKthLargestViaQuickSort(i_array39, (-1));
    int[] i_array45 = new int[] { '4', (byte)0 };
    int i46 = intArrayUtil38.findMinSubArrayLen(0, i_array45);
    util.IntArrayUtil intArrayUtil47 = new util.IntArrayUtil();
    int[] i_array48 = new int[] {  };
    int i50 = intArrayUtil47.findKthLargestViaQuickSort(i_array48, (-1));
    int[] i_array54 = new int[] { '4', (byte)0 };
    int i55 = intArrayUtil47.findMinSubArrayLen(0, i_array54);
    int i56 = intArrayUtil38.removeDuplicateElements(i_array54);
    util.IntArrayUtil intArrayUtil58 = new util.IntArrayUtil();
    int[] i_array59 = new int[] {  };
    int i61 = intArrayUtil58.findKthLargestViaQuickSort(i_array59, (-1));
    int[] i_array65 = new int[] { '4', (byte)0 };
    int i66 = intArrayUtil58.findMinSubArrayLen(0, i_array65);
    int i67 = intArrayUtil38.findMinSubArrayLen((int)(short)0, i_array65);
    util.IntArrayUtil intArrayUtil68 = new util.IntArrayUtil();
    int[] i_array69 = new int[] {  };
    int i71 = intArrayUtil68.findKthLargestViaQuickSort(i_array69, (-1));
    int[] i_array75 = new int[] { '4', (byte)0 };
    int i76 = intArrayUtil68.findMinSubArrayLen(0, i_array75);
    intArrayUtil38.getNextPermutationNumber(i_array75);
    int i78 = intArrayUtil1.findMinViaIteration(i_array75);
    // The following exception was thrown during execution in test generation
    try {
    int i80 = intArrayUtil0.findKthLargestViaQuickSort(i_array75, 9);
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
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 0);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test38"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil9 = new util.IntArrayUtil();
    int[] i_array10 = new int[] {  };
    int i12 = intArrayUtil9.findKthLargestViaQuickSort(i_array10, (-1));
    int[] i_array16 = new int[] { '4', (byte)0 };
    int i17 = intArrayUtil9.findMinSubArrayLen(0, i_array16);
    util.IntArrayUtil intArrayUtil18 = new util.IntArrayUtil();
    int[] i_array19 = new int[] {  };
    int i21 = intArrayUtil18.findKthLargestViaQuickSort(i_array19, (-1));
    int[] i_array25 = new int[] { '4', (byte)0 };
    int i26 = intArrayUtil18.findMinSubArrayLen(0, i_array25);
    int i27 = intArrayUtil9.removeDuplicateElements(i_array25);
    util.IntArrayUtil intArrayUtil29 = new util.IntArrayUtil();
    int[] i_array30 = new int[] {  };
    int i32 = intArrayUtil29.findKthLargestViaQuickSort(i_array30, (-1));
    int[] i_array36 = new int[] { '4', (byte)0 };
    int i37 = intArrayUtil29.findMinSubArrayLen(0, i_array36);
    int i38 = intArrayUtil9.findMinSubArrayLen((int)(short)0, i_array36);
    int i39 = intArrayUtil0.removeDuplicateElements(i_array36);
    util.IntArrayUtil intArrayUtil41 = new util.IntArrayUtil();
    int[] i_array42 = new int[] {  };
    int i44 = intArrayUtil41.findKthLargestViaQuickSort(i_array42, (-1));
    int[] i_array48 = new int[] { '4', (byte)0 };
    int i49 = intArrayUtil41.findMinSubArrayLen(0, i_array48);
    util.IntArrayUtil intArrayUtil51 = new util.IntArrayUtil();
    int[] i_array52 = new int[] {  };
    int i54 = intArrayUtil51.findKthLargestViaQuickSort(i_array52, (-1));
    int i55 = intArrayUtil41.findMinSubArrayLen((int)(byte)-1, i_array52);
    util.IntArrayUtil intArrayUtil56 = new util.IntArrayUtil();
    int[] i_array57 = new int[] {  };
    int i59 = intArrayUtil56.findKthLargestViaQuickSort(i_array57, (-1));
    int[] i_array63 = new int[] { '4', (byte)0 };
    int i64 = intArrayUtil56.findMinSubArrayLen(0, i_array63);
    util.IntArrayUtil intArrayUtil65 = new util.IntArrayUtil();
    int[] i_array66 = new int[] {  };
    int i68 = intArrayUtil65.findKthLargestViaQuickSort(i_array66, (-1));
    int[] i_array72 = new int[] { '4', (byte)0 };
    int i73 = intArrayUtil65.findMinSubArrayLen(0, i_array72);
    int i75 = intArrayUtil56.threeSumClosest(i_array72, (int)(short)100);
    int i77 = intArrayUtil41.threeSumClosest(i_array72, 4);
    int i78 = intArrayUtil0.findMinSubArrayLen((-8), i_array72);
    int[] i_array79 = null;
    int i80 = intArrayUtil0.removeDuplicateElements(i_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 0);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test39"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    int[] i_array9 = null;
    intArrayUtil0.getNextPermutationNumber(i_array9);
    int[] i_array11 = null;
    int i12 = intArrayUtil0.removeDuplicateElements(i_array11);
    util.IntArrayUtil intArrayUtil13 = new util.IntArrayUtil();
    int[] i_array14 = new int[] {  };
    int i16 = intArrayUtil13.findKthLargestViaQuickSort(i_array14, (-1));
    int i17 = intArrayUtil0.findMinViaIteration(i_array14);
    util.IntArrayUtil intArrayUtil18 = new util.IntArrayUtil();
    int[] i_array19 = new int[] {  };
    int i21 = intArrayUtil18.findKthLargestViaQuickSort(i_array19, (-1));
    int[] i_array25 = new int[] { '4', (byte)0 };
    int i26 = intArrayUtil18.findMinSubArrayLen(0, i_array25);
    util.IntArrayUtil intArrayUtil28 = new util.IntArrayUtil();
    int[] i_array29 = new int[] {  };
    int i31 = intArrayUtil28.findKthLargestViaQuickSort(i_array29, (-1));
    int i32 = intArrayUtil18.findMinSubArrayLen((int)(byte)-1, i_array29);
    util.IntArrayUtil intArrayUtil33 = new util.IntArrayUtil();
    int[] i_array34 = new int[] {  };
    int i36 = intArrayUtil33.findKthLargestViaQuickSort(i_array34, (-1));
    int[] i_array40 = new int[] { '4', (byte)0 };
    int i41 = intArrayUtil33.findMinSubArrayLen(0, i_array40);
    util.IntArrayUtil intArrayUtil42 = new util.IntArrayUtil();
    int[] i_array43 = new int[] {  };
    int i45 = intArrayUtil42.findKthLargestViaQuickSort(i_array43, (-1));
    int[] i_array49 = new int[] { '4', (byte)0 };
    int i50 = intArrayUtil42.findMinSubArrayLen(0, i_array49);
    util.IntArrayUtil intArrayUtil51 = new util.IntArrayUtil();
    int[] i_array52 = new int[] {  };
    int i54 = intArrayUtil51.findKthLargestViaQuickSort(i_array52, (-1));
    int[] i_array58 = new int[] { '4', (byte)0 };
    int i59 = intArrayUtil51.findMinSubArrayLen(0, i_array58);
    int i60 = intArrayUtil42.removeDuplicateElements(i_array58);
    util.IntArrayUtil intArrayUtil62 = new util.IntArrayUtil();
    int[] i_array63 = new int[] {  };
    int i65 = intArrayUtil62.findKthLargestViaQuickSort(i_array63, (-1));
    int[] i_array69 = new int[] { '4', (byte)0 };
    int i70 = intArrayUtil62.findMinSubArrayLen(0, i_array69);
    int i71 = intArrayUtil42.findMinSubArrayLen((int)(short)0, i_array69);
    int i72 = intArrayUtil33.removeDuplicateElements(i_array69);
    int i73 = intArrayUtil18.findMinViaIteration(i_array69);
    int i74 = intArrayUtil0.removeDuplicateElements(i_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 2);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test40"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    int[] i_array9 = null;
    intArrayUtil0.getNextPermutationNumber(i_array9);
    util.IntArrayUtil intArrayUtil12 = new util.IntArrayUtil();
    int[] i_array13 = new int[] {  };
    int i15 = intArrayUtil12.findKthLargestViaQuickSort(i_array13, (-1));
    int[] i_array19 = new int[] { '4', (byte)0 };
    int i20 = intArrayUtil12.findMinSubArrayLen(0, i_array19);
    int[] i_array21 = null;
    intArrayUtil12.getNextPermutationNumber(i_array21);
    int[] i_array23 = null;
    int i24 = intArrayUtil12.removeDuplicateElements(i_array23);
    util.IntArrayUtil intArrayUtil25 = new util.IntArrayUtil();
    int[] i_array26 = new int[] {  };
    int i28 = intArrayUtil25.findKthLargestViaQuickSort(i_array26, (-1));
    int i29 = intArrayUtil12.findMinViaIteration(i_array26);
    int i30 = intArrayUtil0.findMinSubArrayLen((int)(short)-1, i_array26);
    util.IntArrayUtil intArrayUtil31 = new util.IntArrayUtil();
    int[] i_array32 = new int[] {  };
    int i34 = intArrayUtil31.findKthLargestViaQuickSort(i_array32, (-1));
    int[] i_array38 = new int[] { '4', (byte)0 };
    int i39 = intArrayUtil31.findMinSubArrayLen(0, i_array38);
    util.IntArrayUtil intArrayUtil40 = new util.IntArrayUtil();
    int[] i_array41 = new int[] {  };
    int i43 = intArrayUtil40.findKthLargestViaQuickSort(i_array41, (-1));
    int[] i_array47 = new int[] { '4', (byte)0 };
    int i48 = intArrayUtil40.findMinSubArrayLen(0, i_array47);
    int i50 = intArrayUtil31.threeSumClosest(i_array47, (int)(short)100);
    int[] i_array51 = null;
    int i52 = intArrayUtil31.findMinViaIteration(i_array51);
    util.IntArrayUtil intArrayUtil53 = new util.IntArrayUtil();
    int[] i_array54 = new int[] {  };
    int i56 = intArrayUtil53.findKthLargestViaQuickSort(i_array54, (-1));
    int[] i_array60 = new int[] { '4', (byte)0 };
    int i61 = intArrayUtil53.findMinSubArrayLen(0, i_array60);
    util.IntArrayUtil intArrayUtil62 = new util.IntArrayUtil();
    int[] i_array63 = new int[] {  };
    int i65 = intArrayUtil62.findKthLargestViaQuickSort(i_array63, (-1));
    int[] i_array69 = new int[] { '4', (byte)0 };
    int i70 = intArrayUtil62.findMinSubArrayLen(0, i_array69);
    int i71 = intArrayUtil53.removeDuplicateElements(i_array69);
    int i72 = intArrayUtil31.findMinViaRecursion(i_array69);
    intArrayUtil0.getNextPermutationNumber(i_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 0);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test41"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil9 = new util.IntArrayUtil();
    int[] i_array10 = new int[] {  };
    int i12 = intArrayUtil9.findKthLargestViaQuickSort(i_array10, (-1));
    util.IntArrayUtil intArrayUtil13 = new util.IntArrayUtil();
    int[] i_array14 = new int[] {  };
    int i16 = intArrayUtil13.findKthLargestViaQuickSort(i_array14, (-1));
    int[] i_array20 = new int[] { '4', (byte)0 };
    int i21 = intArrayUtil13.findMinSubArrayLen(0, i_array20);
    util.IntArrayUtil intArrayUtil22 = new util.IntArrayUtil();
    int[] i_array23 = new int[] {  };
    int i25 = intArrayUtil22.findKthLargestViaQuickSort(i_array23, (-1));
    int[] i_array29 = new int[] { '4', (byte)0 };
    int i30 = intArrayUtil22.findMinSubArrayLen(0, i_array29);
    int i31 = intArrayUtil13.removeDuplicateElements(i_array29);
    util.IntArrayUtil intArrayUtil33 = new util.IntArrayUtil();
    int[] i_array34 = new int[] {  };
    int i36 = intArrayUtil33.findKthLargestViaQuickSort(i_array34, (-1));
    int[] i_array40 = new int[] { '4', (byte)0 };
    int i41 = intArrayUtil33.findMinSubArrayLen(0, i_array40);
    int i42 = intArrayUtil13.findMinSubArrayLen((int)(short)0, i_array40);
    util.IntArrayUtil intArrayUtil43 = new util.IntArrayUtil();
    int[] i_array44 = new int[] {  };
    int i46 = intArrayUtil43.findKthLargestViaQuickSort(i_array44, (-1));
    int[] i_array50 = new int[] { '4', (byte)0 };
    int i51 = intArrayUtil43.findMinSubArrayLen(0, i_array50);
    intArrayUtil13.getNextPermutationNumber(i_array50);
    int i53 = intArrayUtil9.findMinViaIteration(i_array50);
    util.IntArrayUtil intArrayUtil54 = new util.IntArrayUtil();
    int[] i_array55 = new int[] {  };
    int i57 = intArrayUtil54.findKthLargestViaQuickSort(i_array55, (-1));
    int[] i_array61 = new int[] { '4', (byte)0 };
    int i62 = intArrayUtil54.findMinSubArrayLen(0, i_array61);
    util.IntArrayUtil intArrayUtil63 = new util.IntArrayUtil();
    int[] i_array64 = new int[] {  };
    int i66 = intArrayUtil63.findKthLargestViaQuickSort(i_array64, (-1));
    int[] i_array70 = new int[] { '4', (byte)0 };
    int i71 = intArrayUtil63.findMinSubArrayLen(0, i_array70);
    int i72 = intArrayUtil54.removeDuplicateElements(i_array70);
    util.IntArrayUtil intArrayUtil74 = new util.IntArrayUtil();
    int[] i_array75 = new int[] {  };
    int i77 = intArrayUtil74.findKthLargestViaQuickSort(i_array75, (-1));
    int[] i_array81 = new int[] { '4', (byte)0 };
    int i82 = intArrayUtil74.findMinSubArrayLen(0, i_array81);
    int i83 = intArrayUtil54.findMinSubArrayLen((int)(short)0, i_array81);
    util.IntArrayUtil intArrayUtil84 = new util.IntArrayUtil();
    int[] i_array85 = new int[] {  };
    int i87 = intArrayUtil84.findKthLargestViaQuickSort(i_array85, (-1));
    int i88 = intArrayUtil54.findMinViaIteration(i_array85);
    intArrayUtil9.getNextPermutationNumber(i_array85);
    int[] i_array91 = new int[] { 52 };
    int i93 = intArrayUtil9.findKthLargestViaQuickSort(i_array91, (int)(short)0);
    intArrayUtil0.getNextPermutationNumber(i_array91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i93 == 0);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test42"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil9 = new util.IntArrayUtil();
    int[] i_array10 = new int[] {  };
    int i12 = intArrayUtil9.findKthLargestViaQuickSort(i_array10, (-1));
    int[] i_array16 = new int[] { '4', (byte)0 };
    int i17 = intArrayUtil9.findMinSubArrayLen(0, i_array16);
    int i18 = intArrayUtil0.removeDuplicateElements(i_array16);
    util.IntArrayUtil intArrayUtil20 = new util.IntArrayUtil();
    int[] i_array21 = new int[] {  };
    int i23 = intArrayUtil20.findKthLargestViaQuickSort(i_array21, (-1));
    int[] i_array27 = new int[] { '4', (byte)0 };
    int i28 = intArrayUtil20.findMinSubArrayLen(0, i_array27);
    int i29 = intArrayUtil0.findMinSubArrayLen((int)(short)0, i_array27);
    util.IntArrayUtil intArrayUtil30 = new util.IntArrayUtil();
    util.IntArrayUtil intArrayUtil32 = new util.IntArrayUtil();
    int[] i_array33 = new int[] {  };
    int i35 = intArrayUtil32.findKthLargestViaQuickSort(i_array33, (-1));
    int[] i_array39 = new int[] { '4', (byte)0 };
    int i40 = intArrayUtil32.findMinSubArrayLen(0, i_array39);
    util.IntArrayUtil intArrayUtil41 = new util.IntArrayUtil();
    int[] i_array42 = new int[] {  };
    int i44 = intArrayUtil41.findKthLargestViaQuickSort(i_array42, (-1));
    int[] i_array48 = new int[] { '4', (byte)0 };
    int i49 = intArrayUtil41.findMinSubArrayLen(0, i_array48);
    int i50 = intArrayUtil32.removeDuplicateElements(i_array48);
    util.IntArrayUtil intArrayUtil52 = new util.IntArrayUtil();
    int[] i_array53 = new int[] {  };
    int i55 = intArrayUtil52.findKthLargestViaQuickSort(i_array53, (-1));
    int[] i_array59 = new int[] { '4', (byte)0 };
    int i60 = intArrayUtil52.findMinSubArrayLen(0, i_array59);
    int i61 = intArrayUtil32.findMinSubArrayLen((int)(short)0, i_array59);
    util.IntArrayUtil intArrayUtil62 = new util.IntArrayUtil();
    int[] i_array63 = new int[] {  };
    int i65 = intArrayUtil62.findKthLargestViaQuickSort(i_array63, (-1));
    int i66 = intArrayUtil32.findMinViaIteration(i_array63);
    int i67 = intArrayUtil30.findMinSubArrayLen(9, i_array63);
    intArrayUtil0.getNextPermutationNumber(i_array63);
    int[] i_array70 = null;
    int i71 = intArrayUtil0.findMinSubArrayLen(32, i_array70);
    int[] i_array77 = new int[] { (byte)10, 100, 10, 32, 'a' };
    int i78 = intArrayUtil0.findMinViaRecursion(i_array77);
    util.IntArrayUtil intArrayUtil79 = new util.IntArrayUtil();
    int[] i_array80 = new int[] {  };
    int i82 = intArrayUtil79.findKthLargestViaQuickSort(i_array80, (-1));
    int[] i_array86 = new int[] { '4', (byte)0 };
    int i87 = intArrayUtil79.findMinSubArrayLen(0, i_array86);
    int[] i_array88 = null;
    intArrayUtil79.getNextPermutationNumber(i_array88);
    int[] i_array90 = null;
    int i91 = intArrayUtil79.removeDuplicateElements(i_array90);
    util.IntArrayUtil intArrayUtil92 = new util.IntArrayUtil();
    int[] i_array93 = new int[] {  };
    int i95 = intArrayUtil92.findKthLargestViaQuickSort(i_array93, (-1));
    int i96 = intArrayUtil79.findMinViaIteration(i_array93);
    intArrayUtil0.getNextPermutationNumber(i_array93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i91 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i95 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i96 == (-1));

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test43"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil9 = new util.IntArrayUtil();
    int[] i_array10 = new int[] {  };
    int i12 = intArrayUtil9.findKthLargestViaQuickSort(i_array10, (-1));
    int[] i_array16 = new int[] { '4', (byte)0 };
    int i17 = intArrayUtil9.findMinSubArrayLen(0, i_array16);
    util.IntArrayUtil intArrayUtil18 = new util.IntArrayUtil();
    int[] i_array19 = new int[] {  };
    int i21 = intArrayUtil18.findKthLargestViaQuickSort(i_array19, (-1));
    int[] i_array25 = new int[] { '4', (byte)0 };
    int i26 = intArrayUtil18.findMinSubArrayLen(0, i_array25);
    int i27 = intArrayUtil9.removeDuplicateElements(i_array25);
    util.IntArrayUtil intArrayUtil29 = new util.IntArrayUtil();
    int[] i_array30 = new int[] {  };
    int i32 = intArrayUtil29.findKthLargestViaQuickSort(i_array30, (-1));
    int[] i_array36 = new int[] { '4', (byte)0 };
    int i37 = intArrayUtil29.findMinSubArrayLen(0, i_array36);
    int i38 = intArrayUtil9.findMinSubArrayLen((int)(short)0, i_array36);
    int i39 = intArrayUtil0.findMinViaIteration(i_array36);
    util.IntArrayUtil intArrayUtil40 = new util.IntArrayUtil();
    int[] i_array41 = new int[] {  };
    int i43 = intArrayUtil40.findKthLargestViaQuickSort(i_array41, (-1));
    int[] i_array47 = new int[] { '4', (byte)0 };
    int i48 = intArrayUtil40.findMinSubArrayLen(0, i_array47);
    util.IntArrayUtil intArrayUtil49 = new util.IntArrayUtil();
    int[] i_array50 = new int[] {  };
    int i52 = intArrayUtil49.findKthLargestViaQuickSort(i_array50, (-1));
    int[] i_array56 = new int[] { '4', (byte)0 };
    int i57 = intArrayUtil49.findMinSubArrayLen(0, i_array56);
    util.IntArrayUtil intArrayUtil58 = new util.IntArrayUtil();
    int[] i_array59 = new int[] {  };
    int i61 = intArrayUtil58.findKthLargestViaQuickSort(i_array59, (-1));
    int[] i_array65 = new int[] { '4', (byte)0 };
    int i66 = intArrayUtil58.findMinSubArrayLen(0, i_array65);
    int i67 = intArrayUtil49.removeDuplicateElements(i_array65);
    util.IntArrayUtil intArrayUtil69 = new util.IntArrayUtil();
    int[] i_array70 = new int[] {  };
    int i72 = intArrayUtil69.findKthLargestViaQuickSort(i_array70, (-1));
    int[] i_array76 = new int[] { '4', (byte)0 };
    int i77 = intArrayUtil69.findMinSubArrayLen(0, i_array76);
    int i78 = intArrayUtil49.findMinSubArrayLen((int)(short)0, i_array76);
    int i79 = intArrayUtil40.removeDuplicateElements(i_array76);
    int i80 = intArrayUtil0.removeDuplicateElements(i_array76);
    int[] i_array81 = null;
    int i82 = intArrayUtil0.findMinViaIteration(i_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == (-1));

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test44"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil10 = new util.IntArrayUtil();
    int[] i_array11 = new int[] {  };
    int i13 = intArrayUtil10.findKthLargestViaQuickSort(i_array11, (-1));
    int i14 = intArrayUtil0.findMinSubArrayLen((int)(byte)-1, i_array11);
    util.IntArrayUtil intArrayUtil15 = new util.IntArrayUtil();
    int[] i_array16 = new int[] {  };
    int i18 = intArrayUtil15.findKthLargestViaQuickSort(i_array16, (-1));
    int[] i_array22 = new int[] { '4', (byte)0 };
    int i23 = intArrayUtil15.findMinSubArrayLen(0, i_array22);
    int i25 = intArrayUtil0.threeSumClosest(i_array22, (int)(byte)100);
    util.IntArrayUtil intArrayUtil26 = new util.IntArrayUtil();
    int[] i_array27 = new int[] {  };
    int i29 = intArrayUtil26.findKthLargestViaQuickSort(i_array27, (-1));
    int[] i_array33 = new int[] { '4', (byte)0 };
    int i34 = intArrayUtil26.findMinSubArrayLen(0, i_array33);
    int[] i_array35 = null;
    intArrayUtil26.getNextPermutationNumber(i_array35);
    util.IntArrayUtil intArrayUtil37 = new util.IntArrayUtil();
    int[] i_array38 = new int[] {  };
    int i40 = intArrayUtil37.findKthLargestViaQuickSort(i_array38, (-1));
    int[] i_array44 = new int[] { '4', (byte)0 };
    int i45 = intArrayUtil37.findMinSubArrayLen(0, i_array44);
    util.IntArrayUtil intArrayUtil46 = new util.IntArrayUtil();
    int[] i_array47 = new int[] {  };
    int i49 = intArrayUtil46.findKthLargestViaQuickSort(i_array47, (-1));
    int[] i_array53 = new int[] { '4', (byte)0 };
    int i54 = intArrayUtil46.findMinSubArrayLen(0, i_array53);
    int i55 = intArrayUtil37.removeDuplicateElements(i_array53);
    util.IntArrayUtil intArrayUtil57 = new util.IntArrayUtil();
    int[] i_array58 = new int[] {  };
    int i60 = intArrayUtil57.findKthLargestViaQuickSort(i_array58, (-1));
    int[] i_array64 = new int[] { '4', (byte)0 };
    int i65 = intArrayUtil57.findMinSubArrayLen(0, i_array64);
    int i66 = intArrayUtil37.findMinSubArrayLen((int)(short)0, i_array64);
    int i67 = intArrayUtil26.findMinViaRecursion(i_array64);
    int i69 = intArrayUtil0.threeSumClosest(i_array64, 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 0);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test45"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil10 = new util.IntArrayUtil();
    int[] i_array11 = new int[] {  };
    int i13 = intArrayUtil10.findKthLargestViaQuickSort(i_array11, (-1));
    int i14 = intArrayUtil0.findMinSubArrayLen((int)(byte)-1, i_array11);
    util.IntArrayUtil intArrayUtil16 = new util.IntArrayUtil();
    int[] i_array17 = new int[] {  };
    int i19 = intArrayUtil16.findKthLargestViaQuickSort(i_array17, (-1));
    int[] i_array23 = new int[] { '4', (byte)0 };
    int i24 = intArrayUtil16.findMinSubArrayLen(0, i_array23);
    util.IntArrayUtil intArrayUtil25 = new util.IntArrayUtil();
    int[] i_array26 = new int[] {  };
    int i28 = intArrayUtil25.findKthLargestViaQuickSort(i_array26, (-1));
    int[] i_array32 = new int[] { '4', (byte)0 };
    int i33 = intArrayUtil25.findMinSubArrayLen(0, i_array32);
    int i34 = intArrayUtil16.removeDuplicateElements(i_array32);
    util.IntArrayUtil intArrayUtil36 = new util.IntArrayUtil();
    int[] i_array37 = new int[] {  };
    int i39 = intArrayUtil36.findKthLargestViaQuickSort(i_array37, (-1));
    int[] i_array43 = new int[] { '4', (byte)0 };
    int i44 = intArrayUtil36.findMinSubArrayLen(0, i_array43);
    int i45 = intArrayUtil16.findMinSubArrayLen((int)(short)0, i_array43);
    util.IntArrayUtil intArrayUtil46 = new util.IntArrayUtil();
    int[] i_array47 = new int[] {  };
    int i49 = intArrayUtil46.findKthLargestViaQuickSort(i_array47, (-1));
    int i51 = intArrayUtil16.threeSumClosest(i_array47, 1);
    int[] i_array52 = null;
    int i53 = intArrayUtil16.findMinViaIteration(i_array52);
    util.IntArrayUtil intArrayUtil54 = new util.IntArrayUtil();
    int[] i_array55 = new int[] {  };
    int i57 = intArrayUtil54.findKthLargestViaQuickSort(i_array55, (-1));
    int[] i_array61 = new int[] { '4', (byte)0 };
    int i62 = intArrayUtil54.findMinSubArrayLen(0, i_array61);
    util.IntArrayUtil intArrayUtil63 = new util.IntArrayUtil();
    int[] i_array64 = new int[] {  };
    int i66 = intArrayUtil63.findKthLargestViaQuickSort(i_array64, (-1));
    int[] i_array70 = new int[] { '4', (byte)0 };
    int i71 = intArrayUtil63.findMinSubArrayLen(0, i_array70);
    int i72 = intArrayUtil54.removeDuplicateElements(i_array70);
    util.IntArrayUtil intArrayUtil74 = new util.IntArrayUtil();
    int[] i_array75 = new int[] {  };
    int i77 = intArrayUtil74.findKthLargestViaQuickSort(i_array75, (-1));
    int[] i_array81 = new int[] { '4', (byte)0 };
    int i82 = intArrayUtil74.findMinSubArrayLen(0, i_array81);
    int i83 = intArrayUtil54.findMinSubArrayLen((int)(short)0, i_array81);
    util.IntArrayUtil intArrayUtil84 = new util.IntArrayUtil();
    int[] i_array85 = new int[] {  };
    int i87 = intArrayUtil84.findKthLargestViaQuickSort(i_array85, (-1));
    int i88 = intArrayUtil54.findMinViaIteration(i_array85);
    int i90 = intArrayUtil16.findKthLargestViaQuickSort(i_array85, (int)(byte)0);
    int i91 = intArrayUtil0.findMinSubArrayLen(52, i_array85);
    int[] i_array92 = null;
    int i93 = intArrayUtil0.findMinViaIteration(i_array92);
    int[] i_array95 = null;
    int i96 = intArrayUtil0.findMinSubArrayLen(32, i_array95);
    int[] i_array97 = null;
    int i98 = intArrayUtil0.findMinViaIteration(i_array97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i90 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i91 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i93 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i96 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i98 == (-1));

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test46"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = null;
    int i2 = intArrayUtil0.findMinViaIteration(i_array1);
    util.IntArrayUtil intArrayUtil3 = new util.IntArrayUtil();
    int[] i_array4 = new int[] {  };
    int i6 = intArrayUtil3.findKthLargestViaQuickSort(i_array4, (-1));
    int[] i_array10 = new int[] { '4', (byte)0 };
    int i11 = intArrayUtil3.findMinSubArrayLen(0, i_array10);
    util.IntArrayUtil intArrayUtil13 = new util.IntArrayUtil();
    int[] i_array14 = new int[] {  };
    int i16 = intArrayUtil13.findKthLargestViaQuickSort(i_array14, (-1));
    int i17 = intArrayUtil3.findMinSubArrayLen((int)(byte)-1, i_array14);
    util.IntArrayUtil intArrayUtil18 = new util.IntArrayUtil();
    int[] i_array19 = new int[] {  };
    int i21 = intArrayUtil18.findKthLargestViaQuickSort(i_array19, (-1));
    int[] i_array25 = new int[] { '4', (byte)0 };
    int i26 = intArrayUtil18.findMinSubArrayLen(0, i_array25);
    int i28 = intArrayUtil3.threeSumClosest(i_array25, (int)(byte)100);
    util.IntArrayUtil intArrayUtil30 = new util.IntArrayUtil();
    int[] i_array31 = new int[] {  };
    int i33 = intArrayUtil30.findKthLargestViaQuickSort(i_array31, (-1));
    int[] i_array37 = new int[] { '4', (byte)0 };
    int i38 = intArrayUtil30.findMinSubArrayLen(0, i_array37);
    util.IntArrayUtil intArrayUtil39 = new util.IntArrayUtil();
    int[] i_array40 = new int[] {  };
    int i42 = intArrayUtil39.findKthLargestViaQuickSort(i_array40, (-1));
    int[] i_array46 = new int[] { '4', (byte)0 };
    int i47 = intArrayUtil39.findMinSubArrayLen(0, i_array46);
    util.IntArrayUtil intArrayUtil48 = new util.IntArrayUtil();
    int[] i_array49 = new int[] {  };
    int i51 = intArrayUtil48.findKthLargestViaQuickSort(i_array49, (-1));
    int[] i_array55 = new int[] { '4', (byte)0 };
    int i56 = intArrayUtil48.findMinSubArrayLen(0, i_array55);
    int i57 = intArrayUtil39.removeDuplicateElements(i_array55);
    util.IntArrayUtil intArrayUtil59 = new util.IntArrayUtil();
    int[] i_array60 = new int[] {  };
    int i62 = intArrayUtil59.findKthLargestViaQuickSort(i_array60, (-1));
    int[] i_array66 = new int[] { '4', (byte)0 };
    int i67 = intArrayUtil59.findMinSubArrayLen(0, i_array66);
    int i68 = intArrayUtil39.findMinSubArrayLen((int)(short)0, i_array66);
    int i69 = intArrayUtil30.removeDuplicateElements(i_array66);
    int i70 = intArrayUtil3.findMinSubArrayLen(100, i_array66);
    int i71 = intArrayUtil0.findMinViaRecursion(i_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test47"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    util.IntArrayUtil intArrayUtil2 = new util.IntArrayUtil();
    int[] i_array3 = new int[] {  };
    int i5 = intArrayUtil2.findKthLargestViaQuickSort(i_array3, (-1));
    int[] i_array9 = new int[] { '4', (byte)0 };
    int i10 = intArrayUtil2.findMinSubArrayLen(0, i_array9);
    util.IntArrayUtil intArrayUtil11 = new util.IntArrayUtil();
    int[] i_array12 = new int[] {  };
    int i14 = intArrayUtil11.findKthLargestViaQuickSort(i_array12, (-1));
    int[] i_array18 = new int[] { '4', (byte)0 };
    int i19 = intArrayUtil11.findMinSubArrayLen(0, i_array18);
    util.IntArrayUtil intArrayUtil20 = new util.IntArrayUtil();
    int[] i_array21 = new int[] {  };
    int i23 = intArrayUtil20.findKthLargestViaQuickSort(i_array21, (-1));
    int[] i_array27 = new int[] { '4', (byte)0 };
    int i28 = intArrayUtil20.findMinSubArrayLen(0, i_array27);
    int i29 = intArrayUtil11.removeDuplicateElements(i_array27);
    util.IntArrayUtil intArrayUtil31 = new util.IntArrayUtil();
    int[] i_array32 = new int[] {  };
    int i34 = intArrayUtil31.findKthLargestViaQuickSort(i_array32, (-1));
    int[] i_array38 = new int[] { '4', (byte)0 };
    int i39 = intArrayUtil31.findMinSubArrayLen(0, i_array38);
    int i40 = intArrayUtil11.findMinSubArrayLen((int)(short)0, i_array38);
    int i41 = intArrayUtil2.removeDuplicateElements(i_array38);
    util.IntArrayUtil intArrayUtil42 = new util.IntArrayUtil();
    int[] i_array43 = new int[] {  };
    int i45 = intArrayUtil42.findKthLargestViaQuickSort(i_array43, (-1));
    int i46 = intArrayUtil2.removeDuplicateElements(i_array43);
    int i47 = intArrayUtil0.findMinSubArrayLen((int)'a', i_array43);
    int[] i_array48 = null;
    intArrayUtil0.getNextPermutationNumber(i_array48);
    int[] i_array50 = null;
    int i51 = intArrayUtil0.removeDuplicateElements(i_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test48"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil10 = new util.IntArrayUtil();
    int[] i_array11 = new int[] {  };
    int i13 = intArrayUtil10.findKthLargestViaQuickSort(i_array11, (-1));
    int i14 = intArrayUtil0.findMinSubArrayLen((int)(byte)-1, i_array11);
    util.IntArrayUtil intArrayUtil15 = new util.IntArrayUtil();
    int[] i_array16 = new int[] {  };
    int i18 = intArrayUtil15.findKthLargestViaQuickSort(i_array16, (-1));
    int[] i_array22 = new int[] { '4', (byte)0 };
    int i23 = intArrayUtil15.findMinSubArrayLen(0, i_array22);
    util.IntArrayUtil intArrayUtil24 = new util.IntArrayUtil();
    int[] i_array25 = new int[] {  };
    int i27 = intArrayUtil24.findKthLargestViaQuickSort(i_array25, (-1));
    int[] i_array31 = new int[] { '4', (byte)0 };
    int i32 = intArrayUtil24.findMinSubArrayLen(0, i_array31);
    int i34 = intArrayUtil15.threeSumClosest(i_array31, (int)(short)100);
    int i36 = intArrayUtil0.threeSumClosest(i_array31, 4);
    int[] i_array37 = null;
    int i38 = intArrayUtil0.findMinViaIteration(i_array37);
    util.IntArrayUtil intArrayUtil39 = new util.IntArrayUtil();
    int[] i_array40 = new int[] {  };
    int i42 = intArrayUtil39.findKthLargestViaQuickSort(i_array40, (-1));
    int[] i_array46 = new int[] { '4', (byte)0 };
    int i47 = intArrayUtil39.findMinSubArrayLen(0, i_array46);
    intArrayUtil0.getNextPermutationNumber(i_array46);
    util.IntArrayUtil intArrayUtil49 = new util.IntArrayUtil();
    int[] i_array50 = new int[] {  };
    int i52 = intArrayUtil49.findKthLargestViaQuickSort(i_array50, (-1));
    int[] i_array56 = new int[] { '4', (byte)0 };
    int i57 = intArrayUtil49.findMinSubArrayLen(0, i_array56);
    util.IntArrayUtil intArrayUtil58 = new util.IntArrayUtil();
    int[] i_array59 = new int[] {  };
    int i61 = intArrayUtil58.findKthLargestViaQuickSort(i_array59, (-1));
    int[] i_array65 = new int[] { '4', (byte)0 };
    int i66 = intArrayUtil58.findMinSubArrayLen(0, i_array65);
    int i67 = intArrayUtil49.removeDuplicateElements(i_array65);
    util.IntArrayUtil intArrayUtil69 = new util.IntArrayUtil();
    int[] i_array70 = new int[] {  };
    int i72 = intArrayUtil69.findKthLargestViaQuickSort(i_array70, (-1));
    int[] i_array76 = new int[] { '4', (byte)0 };
    int i77 = intArrayUtil69.findMinSubArrayLen(0, i_array76);
    int i78 = intArrayUtil49.findMinSubArrayLen((int)(short)0, i_array76);
    util.IntArrayUtil intArrayUtil79 = new util.IntArrayUtil();
    int[] i_array80 = new int[] {  };
    int i82 = intArrayUtil79.findKthLargestViaQuickSort(i_array80, (-1));
    intArrayUtil49.getNextPermutationNumber(i_array80);
    int i85 = intArrayUtil0.threeSumClosest(i_array80, 32);
    int[] i_array86 = null;
    int i87 = intArrayUtil0.removeDuplicateElements(i_array86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 0);

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test49"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    util.IntArrayUtil intArrayUtil2 = new util.IntArrayUtil();
    int[] i_array3 = new int[] {  };
    int i5 = intArrayUtil2.findKthLargestViaQuickSort(i_array3, (-1));
    int[] i_array9 = new int[] { '4', (byte)0 };
    int i10 = intArrayUtil2.findMinSubArrayLen(0, i_array9);
    util.IntArrayUtil intArrayUtil11 = new util.IntArrayUtil();
    int[] i_array12 = new int[] {  };
    int i14 = intArrayUtil11.findKthLargestViaQuickSort(i_array12, (-1));
    int[] i_array18 = new int[] { '4', (byte)0 };
    int i19 = intArrayUtil11.findMinSubArrayLen(0, i_array18);
    int i20 = intArrayUtil2.removeDuplicateElements(i_array18);
    util.IntArrayUtil intArrayUtil22 = new util.IntArrayUtil();
    int[] i_array23 = new int[] {  };
    int i25 = intArrayUtil22.findKthLargestViaQuickSort(i_array23, (-1));
    int[] i_array29 = new int[] { '4', (byte)0 };
    int i30 = intArrayUtil22.findMinSubArrayLen(0, i_array29);
    int i31 = intArrayUtil2.findMinSubArrayLen((int)(short)0, i_array29);
    util.IntArrayUtil intArrayUtil32 = new util.IntArrayUtil();
    int[] i_array33 = new int[] {  };
    int i35 = intArrayUtil32.findKthLargestViaQuickSort(i_array33, (-1));
    int i36 = intArrayUtil2.findMinViaIteration(i_array33);
    int i37 = intArrayUtil0.findMinSubArrayLen(9, i_array33);
    util.IntArrayUtil intArrayUtil39 = new util.IntArrayUtil();
    int[] i_array40 = new int[] {  };
    int i42 = intArrayUtil39.findKthLargestViaQuickSort(i_array40, (-1));
    int[] i_array46 = new int[] { '4', (byte)0 };
    int i47 = intArrayUtil39.findMinSubArrayLen(0, i_array46);
    util.IntArrayUtil intArrayUtil49 = new util.IntArrayUtil();
    int[] i_array50 = new int[] {  };
    int i52 = intArrayUtil49.findKthLargestViaQuickSort(i_array50, (-1));
    int i53 = intArrayUtil39.findMinSubArrayLen((int)(byte)-1, i_array50);
    util.IntArrayUtil intArrayUtil54 = new util.IntArrayUtil();
    int[] i_array55 = new int[] {  };
    int i57 = intArrayUtil54.findKthLargestViaQuickSort(i_array55, (-1));
    int[] i_array61 = new int[] { '4', (byte)0 };
    int i62 = intArrayUtil54.findMinSubArrayLen(0, i_array61);
    util.IntArrayUtil intArrayUtil63 = new util.IntArrayUtil();
    int[] i_array64 = new int[] {  };
    int i66 = intArrayUtil63.findKthLargestViaQuickSort(i_array64, (-1));
    int[] i_array70 = new int[] { '4', (byte)0 };
    int i71 = intArrayUtil63.findMinSubArrayLen(0, i_array70);
    util.IntArrayUtil intArrayUtil72 = new util.IntArrayUtil();
    int[] i_array73 = new int[] {  };
    int i75 = intArrayUtil72.findKthLargestViaQuickSort(i_array73, (-1));
    int[] i_array79 = new int[] { '4', (byte)0 };
    int i80 = intArrayUtil72.findMinSubArrayLen(0, i_array79);
    int i81 = intArrayUtil63.removeDuplicateElements(i_array79);
    util.IntArrayUtil intArrayUtil83 = new util.IntArrayUtil();
    int[] i_array84 = new int[] {  };
    int i86 = intArrayUtil83.findKthLargestViaQuickSort(i_array84, (-1));
    int[] i_array90 = new int[] { '4', (byte)0 };
    int i91 = intArrayUtil83.findMinSubArrayLen(0, i_array90);
    int i92 = intArrayUtil63.findMinSubArrayLen((int)(short)0, i_array90);
    int i93 = intArrayUtil54.removeDuplicateElements(i_array90);
    int i94 = intArrayUtil39.findMinViaIteration(i_array90);
    int i95 = intArrayUtil0.findMinSubArrayLen((-1), i_array90);
    int[] i_array97 = null;
    int i98 = intArrayUtil0.findMinSubArrayLen((int)(byte)1, i_array97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i86 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i91 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i92 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i93 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i94 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i95 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i98 == 0);

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test50"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil9 = new util.IntArrayUtil();
    int[] i_array10 = new int[] {  };
    int i12 = intArrayUtil9.findKthLargestViaQuickSort(i_array10, (-1));
    int[] i_array16 = new int[] { '4', (byte)0 };
    int i17 = intArrayUtil9.findMinSubArrayLen(0, i_array16);
    int i19 = intArrayUtil0.threeSumClosest(i_array16, (int)(short)100);
    util.IntArrayUtil intArrayUtil20 = new util.IntArrayUtil();
    int[] i_array21 = new int[] {  };
    int i23 = intArrayUtil20.findKthLargestViaQuickSort(i_array21, (-1));
    util.IntArrayUtil intArrayUtil24 = new util.IntArrayUtil();
    int[] i_array25 = new int[] {  };
    int i27 = intArrayUtil24.findKthLargestViaQuickSort(i_array25, (-1));
    int[] i_array31 = new int[] { '4', (byte)0 };
    int i32 = intArrayUtil24.findMinSubArrayLen(0, i_array31);
    util.IntArrayUtil intArrayUtil33 = new util.IntArrayUtil();
    int[] i_array34 = new int[] {  };
    int i36 = intArrayUtil33.findKthLargestViaQuickSort(i_array34, (-1));
    int[] i_array40 = new int[] { '4', (byte)0 };
    int i41 = intArrayUtil33.findMinSubArrayLen(0, i_array40);
    int i42 = intArrayUtil24.removeDuplicateElements(i_array40);
    util.IntArrayUtil intArrayUtil44 = new util.IntArrayUtil();
    int[] i_array45 = new int[] {  };
    int i47 = intArrayUtil44.findKthLargestViaQuickSort(i_array45, (-1));
    int[] i_array51 = new int[] { '4', (byte)0 };
    int i52 = intArrayUtil44.findMinSubArrayLen(0, i_array51);
    int i53 = intArrayUtil24.findMinSubArrayLen((int)(short)0, i_array51);
    util.IntArrayUtil intArrayUtil54 = new util.IntArrayUtil();
    int[] i_array55 = new int[] {  };
    int i57 = intArrayUtil54.findKthLargestViaQuickSort(i_array55, (-1));
    int[] i_array61 = new int[] { '4', (byte)0 };
    int i62 = intArrayUtil54.findMinSubArrayLen(0, i_array61);
    intArrayUtil24.getNextPermutationNumber(i_array61);
    int i64 = intArrayUtil20.findMinViaIteration(i_array61);
    util.IntArrayUtil intArrayUtil65 = new util.IntArrayUtil();
    int[] i_array66 = new int[] {  };
    int i68 = intArrayUtil65.findKthLargestViaQuickSort(i_array66, (-1));
    int[] i_array72 = new int[] { '4', (byte)0 };
    int i73 = intArrayUtil65.findMinSubArrayLen(0, i_array72);
    util.IntArrayUtil intArrayUtil74 = new util.IntArrayUtil();
    int[] i_array75 = new int[] {  };
    int i77 = intArrayUtil74.findKthLargestViaQuickSort(i_array75, (-1));
    int[] i_array81 = new int[] { '4', (byte)0 };
    int i82 = intArrayUtil74.findMinSubArrayLen(0, i_array81);
    int i83 = intArrayUtil65.removeDuplicateElements(i_array81);
    int i84 = intArrayUtil20.findMinViaIteration(i_array81);
    int i85 = intArrayUtil0.removeDuplicateElements(i_array81);
    int[] i_array86 = null;
    int i87 = intArrayUtil0.findMinViaIteration(i_array86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i84 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == (-1));

  }

  @Test
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test51"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    int[] i_array9 = null;
    intArrayUtil0.getNextPermutationNumber(i_array9);
    util.IntArrayUtil intArrayUtil11 = new util.IntArrayUtil();
    int[] i_array12 = new int[] {  };
    int i14 = intArrayUtil11.findKthLargestViaQuickSort(i_array12, (-1));
    int[] i_array18 = new int[] { '4', (byte)0 };
    int i19 = intArrayUtil11.findMinSubArrayLen(0, i_array18);
    util.IntArrayUtil intArrayUtil20 = new util.IntArrayUtil();
    int[] i_array21 = new int[] {  };
    int i23 = intArrayUtil20.findKthLargestViaQuickSort(i_array21, (-1));
    int[] i_array27 = new int[] { '4', (byte)0 };
    int i28 = intArrayUtil20.findMinSubArrayLen(0, i_array27);
    int i29 = intArrayUtil11.removeDuplicateElements(i_array27);
    util.IntArrayUtil intArrayUtil31 = new util.IntArrayUtil();
    int[] i_array32 = new int[] {  };
    int i34 = intArrayUtil31.findKthLargestViaQuickSort(i_array32, (-1));
    int[] i_array38 = new int[] { '4', (byte)0 };
    int i39 = intArrayUtil31.findMinSubArrayLen(0, i_array38);
    int i40 = intArrayUtil11.findMinSubArrayLen((int)(short)0, i_array38);
    util.IntArrayUtil intArrayUtil41 = new util.IntArrayUtil();
    int[] i_array42 = new int[] {  };
    int i44 = intArrayUtil41.findKthLargestViaQuickSort(i_array42, (-1));
    intArrayUtil11.getNextPermutationNumber(i_array42);
    int i47 = intArrayUtil0.threeSumClosest(i_array42, (-7));
    util.IntArrayUtil intArrayUtil48 = new util.IntArrayUtil();
    int[] i_array49 = new int[] {  };
    int i51 = intArrayUtil48.findKthLargestViaQuickSort(i_array49, (-1));
    int[] i_array55 = new int[] { '4', (byte)0 };
    int i56 = intArrayUtil48.findMinSubArrayLen(0, i_array55);
    util.IntArrayUtil intArrayUtil58 = new util.IntArrayUtil();
    int[] i_array59 = new int[] {  };
    int i61 = intArrayUtil58.findKthLargestViaQuickSort(i_array59, (-1));
    int i62 = intArrayUtil48.findMinSubArrayLen((int)(byte)-1, i_array59);
    util.IntArrayUtil intArrayUtil63 = new util.IntArrayUtil();
    int[] i_array64 = new int[] {  };
    int i66 = intArrayUtil63.findKthLargestViaQuickSort(i_array64, (-1));
    int[] i_array70 = new int[] { '4', (byte)0 };
    int i71 = intArrayUtil63.findMinSubArrayLen(0, i_array70);
    int i73 = intArrayUtil48.threeSumClosest(i_array70, (int)(byte)100);
    intArrayUtil0.getNextPermutationNumber(i_array70);
    int[] i_array76 = null;
    int i77 = intArrayUtil0.findMinSubArrayLen((int)(short)0, i_array76);
    int[] i_array78 = null;
    int i79 = intArrayUtil0.findMinViaIteration(i_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == (-1));

  }

  @Test
  public void test52() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test52"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    int[] i_array9 = null;
    intArrayUtil0.getNextPermutationNumber(i_array9);
    int[] i_array11 = null;
    int i12 = intArrayUtil0.removeDuplicateElements(i_array11);
    util.IntArrayUtil intArrayUtil13 = new util.IntArrayUtil();
    int[] i_array14 = new int[] {  };
    int i16 = intArrayUtil13.findKthLargestViaQuickSort(i_array14, (-1));
    int[] i_array20 = new int[] { '4', (byte)0 };
    int i21 = intArrayUtil13.findMinSubArrayLen(0, i_array20);
    util.IntArrayUtil intArrayUtil22 = new util.IntArrayUtil();
    int[] i_array23 = new int[] {  };
    int i25 = intArrayUtil22.findKthLargestViaQuickSort(i_array23, (-1));
    int[] i_array29 = new int[] { '4', (byte)0 };
    int i30 = intArrayUtil22.findMinSubArrayLen(0, i_array29);
    int i31 = intArrayUtil13.removeDuplicateElements(i_array29);
    util.IntArrayUtil intArrayUtil33 = new util.IntArrayUtil();
    int[] i_array34 = new int[] {  };
    int i36 = intArrayUtil33.findKthLargestViaQuickSort(i_array34, (-1));
    int[] i_array40 = new int[] { '4', (byte)0 };
    int i41 = intArrayUtil33.findMinSubArrayLen(0, i_array40);
    int i42 = intArrayUtil13.findMinSubArrayLen((int)(short)0, i_array40);
    util.IntArrayUtil intArrayUtil44 = new util.IntArrayUtil();
    int[] i_array45 = new int[] {  };
    int i47 = intArrayUtil44.findKthLargestViaQuickSort(i_array45, (-1));
    int i48 = intArrayUtil13.findMinSubArrayLen(1, i_array45);
    util.IntArrayUtil intArrayUtil49 = new util.IntArrayUtil();
    int[] i_array50 = new int[] {  };
    int i52 = intArrayUtil49.findKthLargestViaQuickSort(i_array50, (-1));
    int[] i_array56 = new int[] { '4', (byte)0 };
    int i57 = intArrayUtil49.findMinSubArrayLen(0, i_array56);
    util.IntArrayUtil intArrayUtil59 = new util.IntArrayUtil();
    int[] i_array60 = new int[] {  };
    int i62 = intArrayUtil59.findKthLargestViaQuickSort(i_array60, (-1));
    int i63 = intArrayUtil49.findMinSubArrayLen((int)(byte)-1, i_array60);
    util.IntArrayUtil intArrayUtil64 = new util.IntArrayUtil();
    int[] i_array65 = new int[] {  };
    int i67 = intArrayUtil64.findKthLargestViaQuickSort(i_array65, (-1));
    int[] i_array71 = new int[] { '4', (byte)0 };
    int i72 = intArrayUtil64.findMinSubArrayLen(0, i_array71);
    util.IntArrayUtil intArrayUtil73 = new util.IntArrayUtil();
    int[] i_array74 = new int[] {  };
    int i76 = intArrayUtil73.findKthLargestViaQuickSort(i_array74, (-1));
    int[] i_array80 = new int[] { '4', (byte)0 };
    int i81 = intArrayUtil73.findMinSubArrayLen(0, i_array80);
    int i83 = intArrayUtil64.threeSumClosest(i_array80, (int)(short)100);
    int i85 = intArrayUtil49.threeSumClosest(i_array80, 4);
    intArrayUtil13.getNextPermutationNumber(i_array80);
    intArrayUtil0.getNextPermutationNumber(i_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 0);

  }

  @Test
  public void test53() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test53"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil9 = new util.IntArrayUtil();
    int[] i_array10 = new int[] {  };
    int i12 = intArrayUtil9.findKthLargestViaQuickSort(i_array10, (-1));
    int[] i_array16 = new int[] { '4', (byte)0 };
    int i17 = intArrayUtil9.findMinSubArrayLen(0, i_array16);
    int i18 = intArrayUtil0.removeDuplicateElements(i_array16);
    util.IntArrayUtil intArrayUtil20 = new util.IntArrayUtil();
    int[] i_array21 = new int[] {  };
    int i23 = intArrayUtil20.findKthLargestViaQuickSort(i_array21, (-1));
    int[] i_array27 = new int[] { '4', (byte)0 };
    int i28 = intArrayUtil20.findMinSubArrayLen(0, i_array27);
    int i29 = intArrayUtil0.findMinSubArrayLen((int)(short)0, i_array27);
    util.IntArrayUtil intArrayUtil31 = new util.IntArrayUtil();
    int[] i_array32 = new int[] {  };
    int i34 = intArrayUtil31.findKthLargestViaQuickSort(i_array32, (-1));
    int[] i_array38 = new int[] { '4', (byte)0 };
    int i39 = intArrayUtil31.findMinSubArrayLen(0, i_array38);
    util.IntArrayUtil intArrayUtil40 = new util.IntArrayUtil();
    int[] i_array41 = new int[] {  };
    int i43 = intArrayUtil40.findKthLargestViaQuickSort(i_array41, (-1));
    int[] i_array47 = new int[] { '4', (byte)0 };
    int i48 = intArrayUtil40.findMinSubArrayLen(0, i_array47);
    int i49 = intArrayUtil31.removeDuplicateElements(i_array47);
    util.IntArrayUtil intArrayUtil51 = new util.IntArrayUtil();
    int[] i_array52 = new int[] {  };
    int i54 = intArrayUtil51.findKthLargestViaQuickSort(i_array52, (-1));
    int[] i_array58 = new int[] { '4', (byte)0 };
    int i59 = intArrayUtil51.findMinSubArrayLen(0, i_array58);
    int i60 = intArrayUtil31.findMinSubArrayLen((int)(short)0, i_array58);
    util.IntArrayUtil intArrayUtil61 = new util.IntArrayUtil();
    int[] i_array62 = new int[] {  };
    int i64 = intArrayUtil61.findKthLargestViaQuickSort(i_array62, (-1));
    int[] i_array68 = new int[] { '4', (byte)0 };
    int i69 = intArrayUtil61.findMinSubArrayLen(0, i_array68);
    int i70 = intArrayUtil31.findMinViaRecursion(i_array68);
    int i71 = intArrayUtil0.findMinSubArrayLen((int)'#', i_array68);
    util.IntArrayUtil intArrayUtil72 = new util.IntArrayUtil();
    int[] i_array73 = new int[] {  };
    int i75 = intArrayUtil72.findKthLargestViaQuickSort(i_array73, (-1));
    int[] i_array79 = new int[] { '4', (byte)0 };
    int i80 = intArrayUtil72.findMinSubArrayLen(0, i_array79);
    util.IntArrayUtil intArrayUtil82 = new util.IntArrayUtil();
    int[] i_array83 = new int[] {  };
    int i85 = intArrayUtil82.findKthLargestViaQuickSort(i_array83, (-1));
    int i86 = intArrayUtil72.findMinSubArrayLen((int)(byte)-1, i_array83);
    util.IntArrayUtil intArrayUtil87 = new util.IntArrayUtil();
    int[] i_array88 = new int[] {  };
    int i90 = intArrayUtil87.findKthLargestViaQuickSort(i_array88, (-1));
    int i92 = intArrayUtil72.findKthLargestViaQuickSort(i_array88, (-4));
    int i94 = intArrayUtil0.threeSumClosest(i_array88, 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i86 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i90 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i92 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i94 == 0);

  }

  @Test
  public void test54() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test54"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil9 = new util.IntArrayUtil();
    int[] i_array10 = new int[] {  };
    int i12 = intArrayUtil9.findKthLargestViaQuickSort(i_array10, (-1));
    int[] i_array16 = new int[] { '4', (byte)0 };
    int i17 = intArrayUtil9.findMinSubArrayLen(0, i_array16);
    int i18 = intArrayUtil0.removeDuplicateElements(i_array16);
    util.IntArrayUtil intArrayUtil20 = new util.IntArrayUtil();
    int[] i_array21 = new int[] {  };
    int i23 = intArrayUtil20.findKthLargestViaQuickSort(i_array21, (-1));
    int[] i_array27 = new int[] { '4', (byte)0 };
    int i28 = intArrayUtil20.findMinSubArrayLen(0, i_array27);
    int i29 = intArrayUtil0.findMinSubArrayLen((int)(short)0, i_array27);
    util.IntArrayUtil intArrayUtil31 = new util.IntArrayUtil();
    int[] i_array32 = new int[] {  };
    int i34 = intArrayUtil31.findKthLargestViaQuickSort(i_array32, (-1));
    int i35 = intArrayUtil0.findMinSubArrayLen(1, i_array32);
    util.IntArrayUtil intArrayUtil36 = new util.IntArrayUtil();
    int[] i_array37 = new int[] {  };
    int i39 = intArrayUtil36.findKthLargestViaQuickSort(i_array37, (-1));
    int[] i_array43 = new int[] { '4', (byte)0 };
    int i44 = intArrayUtil36.findMinSubArrayLen(0, i_array43);
    util.IntArrayUtil intArrayUtil45 = new util.IntArrayUtil();
    int[] i_array46 = new int[] {  };
    int i48 = intArrayUtil45.findKthLargestViaQuickSort(i_array46, (-1));
    int[] i_array52 = new int[] { '4', (byte)0 };
    int i53 = intArrayUtil45.findMinSubArrayLen(0, i_array52);
    int i54 = intArrayUtil36.removeDuplicateElements(i_array52);
    util.IntArrayUtil intArrayUtil56 = new util.IntArrayUtil();
    int[] i_array57 = new int[] {  };
    int i59 = intArrayUtil56.findKthLargestViaQuickSort(i_array57, (-1));
    int[] i_array63 = new int[] { '4', (byte)0 };
    int i64 = intArrayUtil56.findMinSubArrayLen(0, i_array63);
    int i65 = intArrayUtil36.findMinSubArrayLen((int)(short)0, i_array63);
    util.IntArrayUtil intArrayUtil66 = new util.IntArrayUtil();
    int[] i_array67 = new int[] {  };
    int i69 = intArrayUtil66.findKthLargestViaQuickSort(i_array67, (-1));
    int i71 = intArrayUtil36.threeSumClosest(i_array67, 1);
    int[] i_array72 = null;
    int i73 = intArrayUtil36.findMinViaIteration(i_array72);
    util.IntArrayUtil intArrayUtil74 = new util.IntArrayUtil();
    int[] i_array75 = new int[] {  };
    int i77 = intArrayUtil74.findKthLargestViaQuickSort(i_array75, (-1));
    int[] i_array81 = new int[] { '4', (byte)0 };
    int i82 = intArrayUtil74.findMinSubArrayLen(0, i_array81);
    util.IntArrayUtil intArrayUtil83 = new util.IntArrayUtil();
    int[] i_array84 = new int[] {  };
    int i86 = intArrayUtil83.findKthLargestViaQuickSort(i_array84, (-1));
    int[] i_array90 = new int[] { '4', (byte)0 };
    int i91 = intArrayUtil83.findMinSubArrayLen(0, i_array90);
    int i93 = intArrayUtil74.threeSumClosest(i_array90, (int)(short)100);
    int i94 = intArrayUtil36.removeDuplicateElements(i_array90);
    int i95 = intArrayUtil0.findMinViaIteration(i_array90);
    int[] i_array96 = null;
    int i97 = intArrayUtil0.findMinViaIteration(i_array96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i86 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i91 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i93 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i94 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i95 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i97 == (-1));

  }

  @Test
  public void test55() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test55"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    util.IntArrayUtil intArrayUtil1 = new util.IntArrayUtil();
    int[] i_array2 = new int[] {  };
    int i4 = intArrayUtil1.findKthLargestViaQuickSort(i_array2, (-1));
    util.IntArrayUtil intArrayUtil5 = new util.IntArrayUtil();
    int[] i_array6 = new int[] {  };
    int i8 = intArrayUtil5.findKthLargestViaQuickSort(i_array6, (-1));
    int[] i_array12 = new int[] { '4', (byte)0 };
    int i13 = intArrayUtil5.findMinSubArrayLen(0, i_array12);
    util.IntArrayUtil intArrayUtil14 = new util.IntArrayUtil();
    int[] i_array15 = new int[] {  };
    int i17 = intArrayUtil14.findKthLargestViaQuickSort(i_array15, (-1));
    int[] i_array21 = new int[] { '4', (byte)0 };
    int i22 = intArrayUtil14.findMinSubArrayLen(0, i_array21);
    int i23 = intArrayUtil5.removeDuplicateElements(i_array21);
    util.IntArrayUtil intArrayUtil25 = new util.IntArrayUtil();
    int[] i_array26 = new int[] {  };
    int i28 = intArrayUtil25.findKthLargestViaQuickSort(i_array26, (-1));
    int[] i_array32 = new int[] { '4', (byte)0 };
    int i33 = intArrayUtil25.findMinSubArrayLen(0, i_array32);
    int i34 = intArrayUtil5.findMinSubArrayLen((int)(short)0, i_array32);
    util.IntArrayUtil intArrayUtil35 = new util.IntArrayUtil();
    int[] i_array36 = new int[] {  };
    int i38 = intArrayUtil35.findKthLargestViaQuickSort(i_array36, (-1));
    int[] i_array42 = new int[] { '4', (byte)0 };
    int i43 = intArrayUtil35.findMinSubArrayLen(0, i_array42);
    intArrayUtil5.getNextPermutationNumber(i_array42);
    int i45 = intArrayUtil1.findMinViaIteration(i_array42);
    util.IntArrayUtil intArrayUtil46 = new util.IntArrayUtil();
    int[] i_array47 = new int[] {  };
    int i49 = intArrayUtil46.findKthLargestViaQuickSort(i_array47, (-1));
    int[] i_array53 = new int[] { '4', (byte)0 };
    int i54 = intArrayUtil46.findMinSubArrayLen(0, i_array53);
    int i56 = intArrayUtil1.threeSumClosest(i_array53, (int)' ');
    util.IntArrayUtil intArrayUtil57 = new util.IntArrayUtil();
    int[] i_array58 = new int[] {  };
    int i60 = intArrayUtil57.findKthLargestViaQuickSort(i_array58, (-1));
    int[] i_array64 = new int[] { '4', (byte)0 };
    int i65 = intArrayUtil57.findMinSubArrayLen(0, i_array64);
    util.IntArrayUtil intArrayUtil66 = new util.IntArrayUtil();
    int[] i_array67 = new int[] {  };
    int i69 = intArrayUtil66.findKthLargestViaQuickSort(i_array67, (-1));
    int[] i_array73 = new int[] { '4', (byte)0 };
    int i74 = intArrayUtil66.findMinSubArrayLen(0, i_array73);
    int i75 = intArrayUtil57.removeDuplicateElements(i_array73);
    util.IntArrayUtil intArrayUtil77 = new util.IntArrayUtil();
    int[] i_array78 = new int[] {  };
    int i80 = intArrayUtil77.findKthLargestViaQuickSort(i_array78, (-1));
    int[] i_array84 = new int[] { '4', (byte)0 };
    int i85 = intArrayUtil77.findMinSubArrayLen(0, i_array84);
    int i86 = intArrayUtil57.findMinSubArrayLen((int)(short)0, i_array84);
    util.IntArrayUtil intArrayUtil87 = new util.IntArrayUtil();
    int[] i_array88 = new int[] {  };
    int i90 = intArrayUtil87.findKthLargestViaQuickSort(i_array88, (-1));
    int i91 = intArrayUtil57.findMinViaIteration(i_array88);
    int i92 = intArrayUtil1.findMinViaIteration(i_array88);
    intArrayUtil0.getNextPermutationNumber(i_array88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i86 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i90 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i91 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i92 == (-1));

  }

  @Test
  public void test56() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test56"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    int[] i_array9 = null;
    intArrayUtil0.getNextPermutationNumber(i_array9);
    util.IntArrayUtil intArrayUtil12 = new util.IntArrayUtil();
    int[] i_array13 = new int[] {  };
    int i15 = intArrayUtil12.findKthLargestViaQuickSort(i_array13, (-1));
    util.IntArrayUtil intArrayUtil16 = new util.IntArrayUtil();
    int[] i_array17 = new int[] {  };
    int i19 = intArrayUtil16.findKthLargestViaQuickSort(i_array17, (-1));
    int[] i_array23 = new int[] { '4', (byte)0 };
    int i24 = intArrayUtil16.findMinSubArrayLen(0, i_array23);
    util.IntArrayUtil intArrayUtil25 = new util.IntArrayUtil();
    int[] i_array26 = new int[] {  };
    int i28 = intArrayUtil25.findKthLargestViaQuickSort(i_array26, (-1));
    int[] i_array32 = new int[] { '4', (byte)0 };
    int i33 = intArrayUtil25.findMinSubArrayLen(0, i_array32);
    int i35 = intArrayUtil16.threeSumClosest(i_array32, (int)(short)100);
    int i36 = intArrayUtil12.removeDuplicateElements(i_array32);
    int i37 = intArrayUtil0.findMinSubArrayLen(7, i_array32);
    util.IntArrayUtil intArrayUtil38 = new util.IntArrayUtil();
    int[] i_array39 = new int[] {  };
    int i41 = intArrayUtil38.findKthLargestViaQuickSort(i_array39, (-1));
    int[] i_array45 = new int[] { '4', (byte)0 };
    int i46 = intArrayUtil38.findMinSubArrayLen(0, i_array45);
    util.IntArrayUtil intArrayUtil47 = new util.IntArrayUtil();
    int[] i_array48 = new int[] {  };
    int i50 = intArrayUtil47.findKthLargestViaQuickSort(i_array48, (-1));
    int[] i_array54 = new int[] { '4', (byte)0 };
    int i55 = intArrayUtil47.findMinSubArrayLen(0, i_array54);
    int i56 = intArrayUtil38.removeDuplicateElements(i_array54);
    util.IntArrayUtil intArrayUtil58 = new util.IntArrayUtil();
    int[] i_array59 = new int[] {  };
    int i61 = intArrayUtil58.findKthLargestViaQuickSort(i_array59, (-1));
    int[] i_array65 = new int[] { '4', (byte)0 };
    int i66 = intArrayUtil58.findMinSubArrayLen(0, i_array65);
    int i67 = intArrayUtil38.findMinSubArrayLen((int)(short)0, i_array65);
    util.IntArrayUtil intArrayUtil68 = new util.IntArrayUtil();
    int[] i_array69 = new int[] {  };
    int i71 = intArrayUtil68.findKthLargestViaQuickSort(i_array69, (-1));
    int[] i_array75 = new int[] { '4', (byte)0 };
    int i76 = intArrayUtil68.findMinSubArrayLen(0, i_array75);
    util.IntArrayUtil intArrayUtil77 = new util.IntArrayUtil();
    int[] i_array78 = new int[] {  };
    int i80 = intArrayUtil77.findKthLargestViaQuickSort(i_array78, (-1));
    int[] i_array84 = new int[] { '4', (byte)0 };
    int i85 = intArrayUtil77.findMinSubArrayLen(0, i_array84);
    int i87 = intArrayUtil68.threeSumClosest(i_array84, (int)(short)100);
    int i88 = intArrayUtil38.findMinViaRecursion(i_array84);
    intArrayUtil0.getNextPermutationNumber(i_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == 0);

  }

  @Test
  public void test57() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test57"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil9 = new util.IntArrayUtil();
    int[] i_array10 = new int[] {  };
    int i12 = intArrayUtil9.findKthLargestViaQuickSort(i_array10, (-1));
    int[] i_array16 = new int[] { '4', (byte)0 };
    int i17 = intArrayUtil9.findMinSubArrayLen(0, i_array16);
    int i18 = intArrayUtil0.removeDuplicateElements(i_array16);
    util.IntArrayUtil intArrayUtil19 = new util.IntArrayUtil();
    int[] i_array20 = new int[] {  };
    int i22 = intArrayUtil19.findKthLargestViaQuickSort(i_array20, (-1));
    int i24 = intArrayUtil0.findKthLargestViaQuickSort(i_array20, (-2));
    util.IntArrayUtil intArrayUtil25 = new util.IntArrayUtil();
    int[] i_array26 = new int[] {  };
    int i28 = intArrayUtil25.findKthLargestViaQuickSort(i_array26, (-1));
    int[] i_array32 = new int[] { '4', (byte)0 };
    int i33 = intArrayUtil25.findMinSubArrayLen(0, i_array32);
    util.IntArrayUtil intArrayUtil35 = new util.IntArrayUtil();
    int[] i_array36 = new int[] {  };
    int i38 = intArrayUtil35.findKthLargestViaQuickSort(i_array36, (-1));
    int i39 = intArrayUtil25.findMinSubArrayLen((int)(byte)-1, i_array36);
    int i40 = intArrayUtil0.findMinViaIteration(i_array36);
    util.IntArrayUtil intArrayUtil41 = new util.IntArrayUtil();
    int[] i_array42 = new int[] {  };
    int i44 = intArrayUtil41.findKthLargestViaQuickSort(i_array42, (-1));
    int[] i_array48 = new int[] { '4', (byte)0 };
    int i49 = intArrayUtil41.findMinSubArrayLen(0, i_array48);
    util.IntArrayUtil intArrayUtil50 = new util.IntArrayUtil();
    int[] i_array51 = new int[] {  };
    int i53 = intArrayUtil50.findKthLargestViaQuickSort(i_array51, (-1));
    int[] i_array57 = new int[] { '4', (byte)0 };
    int i58 = intArrayUtil50.findMinSubArrayLen(0, i_array57);
    util.IntArrayUtil intArrayUtil59 = new util.IntArrayUtil();
    int[] i_array60 = new int[] {  };
    int i62 = intArrayUtil59.findKthLargestViaQuickSort(i_array60, (-1));
    int[] i_array66 = new int[] { '4', (byte)0 };
    int i67 = intArrayUtil59.findMinSubArrayLen(0, i_array66);
    int i68 = intArrayUtil50.removeDuplicateElements(i_array66);
    util.IntArrayUtil intArrayUtil70 = new util.IntArrayUtil();
    int[] i_array71 = new int[] {  };
    int i73 = intArrayUtil70.findKthLargestViaQuickSort(i_array71, (-1));
    int[] i_array77 = new int[] { '4', (byte)0 };
    int i78 = intArrayUtil70.findMinSubArrayLen(0, i_array77);
    int i79 = intArrayUtil50.findMinSubArrayLen((int)(short)0, i_array77);
    int i80 = intArrayUtil41.removeDuplicateElements(i_array77);
    int[] i_array85 = new int[] { ' ', (byte)-1, '#', (byte)100 };
    int i86 = intArrayUtil41.findMinViaRecursion(i_array85);
    int i87 = intArrayUtil0.findMinViaRecursion(i_array85);
    int[] i_array89 = null;
    int i90 = intArrayUtil0.findMinSubArrayLen((-7), i_array89);
    int[] i_array91 = null;
    int i92 = intArrayUtil0.removeDuplicateElements(i_array91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i86 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i90 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i92 == 0);

  }

  @Test
  public void test58() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test58"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil9 = new util.IntArrayUtil();
    int[] i_array10 = new int[] {  };
    int i12 = intArrayUtil9.findKthLargestViaQuickSort(i_array10, (-1));
    int[] i_array16 = new int[] { '4', (byte)0 };
    int i17 = intArrayUtil9.findMinSubArrayLen(0, i_array16);
    int i19 = intArrayUtil0.threeSumClosest(i_array16, (int)(short)100);
    int[] i_array21 = null;
    int i22 = intArrayUtil0.findMinSubArrayLen(9, i_array21);
    util.IntArrayUtil intArrayUtil23 = new util.IntArrayUtil();
    int[] i_array24 = new int[] {  };
    int i26 = intArrayUtil23.findKthLargestViaQuickSort(i_array24, (-1));
    int[] i_array30 = new int[] { '4', (byte)0 };
    int i31 = intArrayUtil23.findMinSubArrayLen(0, i_array30);
    util.IntArrayUtil intArrayUtil32 = new util.IntArrayUtil();
    int[] i_array33 = new int[] {  };
    int i35 = intArrayUtil32.findKthLargestViaQuickSort(i_array33, (-1));
    int[] i_array39 = new int[] { '4', (byte)0 };
    int i40 = intArrayUtil32.findMinSubArrayLen(0, i_array39);
    int i42 = intArrayUtil23.threeSumClosest(i_array39, (int)(short)100);
    int i43 = intArrayUtil0.removeDuplicateElements(i_array39);
    util.IntArrayUtil intArrayUtil44 = new util.IntArrayUtil();
    util.IntArrayUtil intArrayUtil46 = new util.IntArrayUtil();
    int[] i_array47 = new int[] {  };
    int i49 = intArrayUtil46.findKthLargestViaQuickSort(i_array47, (-1));
    int[] i_array53 = new int[] { '4', (byte)0 };
    int i54 = intArrayUtil46.findMinSubArrayLen(0, i_array53);
    util.IntArrayUtil intArrayUtil55 = new util.IntArrayUtil();
    int[] i_array56 = new int[] {  };
    int i58 = intArrayUtil55.findKthLargestViaQuickSort(i_array56, (-1));
    int[] i_array62 = new int[] { '4', (byte)0 };
    int i63 = intArrayUtil55.findMinSubArrayLen(0, i_array62);
    int i64 = intArrayUtil46.removeDuplicateElements(i_array62);
    util.IntArrayUtil intArrayUtil66 = new util.IntArrayUtil();
    int[] i_array67 = new int[] {  };
    int i69 = intArrayUtil66.findKthLargestViaQuickSort(i_array67, (-1));
    int[] i_array73 = new int[] { '4', (byte)0 };
    int i74 = intArrayUtil66.findMinSubArrayLen(0, i_array73);
    int i75 = intArrayUtil46.findMinSubArrayLen((int)(short)0, i_array73);
    util.IntArrayUtil intArrayUtil76 = new util.IntArrayUtil();
    int[] i_array77 = new int[] {  };
    int i79 = intArrayUtil76.findKthLargestViaQuickSort(i_array77, (-1));
    int i80 = intArrayUtil46.findMinViaIteration(i_array77);
    int i81 = intArrayUtil44.findMinSubArrayLen(9, i_array77);
    intArrayUtil0.getNextPermutationNumber(i_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 0);

  }

  @Test
  public void test59() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test59"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    int[] i_array9 = null;
    intArrayUtil0.getNextPermutationNumber(i_array9);
    int[] i_array11 = null;
    int i12 = intArrayUtil0.removeDuplicateElements(i_array11);
    util.IntArrayUtil intArrayUtil13 = new util.IntArrayUtil();
    int[] i_array14 = new int[] {  };
    int i16 = intArrayUtil13.findKthLargestViaQuickSort(i_array14, (-1));
    int[] i_array20 = new int[] { '4', (byte)0 };
    int i21 = intArrayUtil13.findMinSubArrayLen(0, i_array20);
    util.IntArrayUtil intArrayUtil23 = new util.IntArrayUtil();
    int[] i_array24 = new int[] {  };
    int i26 = intArrayUtil23.findKthLargestViaQuickSort(i_array24, (-1));
    int i27 = intArrayUtil13.findMinSubArrayLen((int)(byte)-1, i_array24);
    util.IntArrayUtil intArrayUtil28 = new util.IntArrayUtil();
    int[] i_array29 = new int[] {  };
    int i31 = intArrayUtil28.findKthLargestViaQuickSort(i_array29, (-1));
    int[] i_array35 = new int[] { '4', (byte)0 };
    int i36 = intArrayUtil28.findMinSubArrayLen(0, i_array35);
    util.IntArrayUtil intArrayUtil37 = new util.IntArrayUtil();
    int[] i_array38 = new int[] {  };
    int i40 = intArrayUtil37.findKthLargestViaQuickSort(i_array38, (-1));
    int[] i_array44 = new int[] { '4', (byte)0 };
    int i45 = intArrayUtil37.findMinSubArrayLen(0, i_array44);
    int i47 = intArrayUtil28.threeSumClosest(i_array44, (int)(short)100);
    int i49 = intArrayUtil13.threeSumClosest(i_array44, 4);
    int[] i_array50 = null;
    int i51 = intArrayUtil13.findMinViaIteration(i_array50);
    util.IntArrayUtil intArrayUtil52 = new util.IntArrayUtil();
    int[] i_array53 = new int[] {  };
    int i55 = intArrayUtil52.findKthLargestViaQuickSort(i_array53, (-1));
    int[] i_array59 = new int[] { '4', (byte)0 };
    int i60 = intArrayUtil52.findMinSubArrayLen(0, i_array59);
    util.IntArrayUtil intArrayUtil61 = new util.IntArrayUtil();
    int[] i_array62 = new int[] {  };
    int i64 = intArrayUtil61.findKthLargestViaQuickSort(i_array62, (-1));
    int[] i_array68 = new int[] { '4', (byte)0 };
    int i69 = intArrayUtil61.findMinSubArrayLen(0, i_array68);
    int i71 = intArrayUtil52.threeSumClosest(i_array68, (int)(short)100);
    util.IntArrayUtil intArrayUtil72 = new util.IntArrayUtil();
    int[] i_array73 = new int[] {  };
    int i75 = intArrayUtil72.findKthLargestViaQuickSort(i_array73, (-1));
    int[] i_array79 = new int[] { '4', (byte)0 };
    int i80 = intArrayUtil72.findMinSubArrayLen(0, i_array79);
    util.IntArrayUtil intArrayUtil81 = new util.IntArrayUtil();
    int[] i_array82 = new int[] {  };
    int i84 = intArrayUtil81.findKthLargestViaQuickSort(i_array82, (-1));
    int[] i_array88 = new int[] { '4', (byte)0 };
    int i89 = intArrayUtil81.findMinSubArrayLen(0, i_array88);
    int i90 = intArrayUtil72.removeDuplicateElements(i_array88);
    intArrayUtil52.getNextPermutationNumber(i_array88);
    int i93 = intArrayUtil13.threeSumClosest(i_array88, (-6));
    int i94 = intArrayUtil0.findMinViaRecursion(i_array88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i84 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i89 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i90 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i93 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i94 == 0);

  }

  @Test
  public void test60() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test60"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil9 = new util.IntArrayUtil();
    int[] i_array10 = new int[] {  };
    int i12 = intArrayUtil9.findKthLargestViaQuickSort(i_array10, (-1));
    int[] i_array16 = new int[] { '4', (byte)0 };
    int i17 = intArrayUtil9.findMinSubArrayLen(0, i_array16);
    int i19 = intArrayUtil0.threeSumClosest(i_array16, (int)(short)100);
    int[] i_array21 = null;
    int i22 = intArrayUtil0.findMinSubArrayLen(9, i_array21);
    util.IntArrayUtil intArrayUtil23 = new util.IntArrayUtil();
    int[] i_array24 = new int[] {  };
    int i26 = intArrayUtil23.findKthLargestViaQuickSort(i_array24, (-1));
    int[] i_array30 = new int[] { '4', (byte)0 };
    int i31 = intArrayUtil23.findMinSubArrayLen(0, i_array30);
    util.IntArrayUtil intArrayUtil33 = new util.IntArrayUtil();
    int[] i_array34 = new int[] {  };
    int i36 = intArrayUtil33.findKthLargestViaQuickSort(i_array34, (-1));
    int i37 = intArrayUtil23.findMinSubArrayLen((int)(byte)-1, i_array34);
    util.IntArrayUtil intArrayUtil38 = new util.IntArrayUtil();
    int[] i_array39 = new int[] {  };
    int i41 = intArrayUtil38.findKthLargestViaQuickSort(i_array39, (-1));
    int[] i_array45 = new int[] { '4', (byte)0 };
    int i46 = intArrayUtil38.findMinSubArrayLen(0, i_array45);
    util.IntArrayUtil intArrayUtil47 = new util.IntArrayUtil();
    int[] i_array48 = new int[] {  };
    int i50 = intArrayUtil47.findKthLargestViaQuickSort(i_array48, (-1));
    int[] i_array54 = new int[] { '4', (byte)0 };
    int i55 = intArrayUtil47.findMinSubArrayLen(0, i_array54);
    int i56 = intArrayUtil38.removeDuplicateElements(i_array54);
    util.IntArrayUtil intArrayUtil58 = new util.IntArrayUtil();
    int[] i_array59 = new int[] {  };
    int i61 = intArrayUtil58.findKthLargestViaQuickSort(i_array59, (-1));
    int[] i_array65 = new int[] { '4', (byte)0 };
    int i66 = intArrayUtil58.findMinSubArrayLen(0, i_array65);
    int i67 = intArrayUtil38.findMinSubArrayLen((int)(short)0, i_array65);
    util.IntArrayUtil intArrayUtil68 = new util.IntArrayUtil();
    int[] i_array69 = new int[] {  };
    int i71 = intArrayUtil68.findKthLargestViaQuickSort(i_array69, (-1));
    int[] i_array75 = new int[] { '4', (byte)0 };
    int i76 = intArrayUtil68.findMinSubArrayLen(0, i_array75);
    intArrayUtil38.getNextPermutationNumber(i_array75);
    int i79 = intArrayUtil23.threeSumClosest(i_array75, 0);
    int i80 = intArrayUtil0.findMinViaRecursion(i_array75);
    int[] i_array81 = null;
    int i83 = intArrayUtil0.findKthLargestViaQuickSort(i_array81, 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 0);

  }

  @Test
  public void test61() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test61"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil9 = new util.IntArrayUtil();
    int[] i_array10 = new int[] {  };
    int i12 = intArrayUtil9.findKthLargestViaQuickSort(i_array10, (-1));
    int[] i_array16 = new int[] { '4', (byte)0 };
    int i17 = intArrayUtil9.findMinSubArrayLen(0, i_array16);
    int i19 = intArrayUtil0.threeSumClosest(i_array16, (int)(short)100);
    util.IntArrayUtil intArrayUtil21 = new util.IntArrayUtil();
    int[] i_array22 = new int[] {  };
    int i24 = intArrayUtil21.findKthLargestViaQuickSort(i_array22, (-1));
    int[] i_array28 = new int[] { '4', (byte)0 };
    int i29 = intArrayUtil21.findMinSubArrayLen(0, i_array28);
    util.IntArrayUtil intArrayUtil30 = new util.IntArrayUtil();
    int[] i_array31 = new int[] {  };
    int i33 = intArrayUtil30.findKthLargestViaQuickSort(i_array31, (-1));
    int[] i_array37 = new int[] { '4', (byte)0 };
    int i38 = intArrayUtil30.findMinSubArrayLen(0, i_array37);
    int i39 = intArrayUtil21.removeDuplicateElements(i_array37);
    util.IntArrayUtil intArrayUtil41 = new util.IntArrayUtil();
    int[] i_array42 = new int[] {  };
    int i44 = intArrayUtil41.findKthLargestViaQuickSort(i_array42, (-1));
    int[] i_array48 = new int[] { '4', (byte)0 };
    int i49 = intArrayUtil41.findMinSubArrayLen(0, i_array48);
    int i50 = intArrayUtil21.findMinSubArrayLen((int)(short)0, i_array48);
    util.IntArrayUtil intArrayUtil51 = new util.IntArrayUtil();
    int[] i_array52 = new int[] {  };
    int i54 = intArrayUtil51.findKthLargestViaQuickSort(i_array52, (-1));
    int[] i_array58 = new int[] { '4', (byte)0 };
    int i59 = intArrayUtil51.findMinSubArrayLen(0, i_array58);
    intArrayUtil21.getNextPermutationNumber(i_array58);
    util.IntArrayUtil intArrayUtil61 = new util.IntArrayUtil();
    int[] i_array62 = new int[] {  };
    int i64 = intArrayUtil61.findKthLargestViaQuickSort(i_array62, (-1));
    int[] i_array68 = new int[] { '4', (byte)0 };
    int i69 = intArrayUtil61.findMinSubArrayLen(0, i_array68);
    util.IntArrayUtil intArrayUtil70 = new util.IntArrayUtil();
    int[] i_array71 = new int[] {  };
    int i73 = intArrayUtil70.findKthLargestViaQuickSort(i_array71, (-1));
    int[] i_array77 = new int[] { '4', (byte)0 };
    int i78 = intArrayUtil70.findMinSubArrayLen(0, i_array77);
    int i80 = intArrayUtil61.threeSumClosest(i_array77, (int)(short)100);
    int i82 = intArrayUtil21.threeSumClosest(i_array77, (-3));
    int i83 = intArrayUtil0.findMinSubArrayLen((int)'a', i_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 0);

  }

  @Test
  public void test62() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test62"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    util.IntArrayUtil intArrayUtil4 = new util.IntArrayUtil();
    int[] i_array5 = new int[] {  };
    int i7 = intArrayUtil4.findKthLargestViaQuickSort(i_array5, (-1));
    int[] i_array11 = new int[] { '4', (byte)0 };
    int i12 = intArrayUtil4.findMinSubArrayLen(0, i_array11);
    util.IntArrayUtil intArrayUtil14 = new util.IntArrayUtil();
    int[] i_array15 = new int[] {  };
    int i17 = intArrayUtil14.findKthLargestViaQuickSort(i_array15, (-1));
    int i18 = intArrayUtil4.findMinSubArrayLen((int)(byte)-1, i_array15);
    util.IntArrayUtil intArrayUtil19 = new util.IntArrayUtil();
    int[] i_array20 = new int[] {  };
    int i22 = intArrayUtil19.findKthLargestViaQuickSort(i_array20, (-1));
    int[] i_array26 = new int[] { '4', (byte)0 };
    int i27 = intArrayUtil19.findMinSubArrayLen(0, i_array26);
    util.IntArrayUtil intArrayUtil28 = new util.IntArrayUtil();
    int[] i_array29 = new int[] {  };
    int i31 = intArrayUtil28.findKthLargestViaQuickSort(i_array29, (-1));
    int[] i_array35 = new int[] { '4', (byte)0 };
    int i36 = intArrayUtil28.findMinSubArrayLen(0, i_array35);
    int i38 = intArrayUtil19.threeSumClosest(i_array35, (int)(short)100);
    int i40 = intArrayUtil4.threeSumClosest(i_array35, 4);
    util.IntArrayUtil intArrayUtil41 = new util.IntArrayUtil();
    int[] i_array42 = new int[] {  };
    int i44 = intArrayUtil41.findKthLargestViaQuickSort(i_array42, (-1));
    util.IntArrayUtil intArrayUtil45 = new util.IntArrayUtil();
    int[] i_array46 = new int[] {  };
    int i48 = intArrayUtil45.findKthLargestViaQuickSort(i_array46, (-1));
    int[] i_array52 = new int[] { '4', (byte)0 };
    int i53 = intArrayUtil45.findMinSubArrayLen(0, i_array52);
    util.IntArrayUtil intArrayUtil54 = new util.IntArrayUtil();
    int[] i_array55 = new int[] {  };
    int i57 = intArrayUtil54.findKthLargestViaQuickSort(i_array55, (-1));
    int[] i_array61 = new int[] { '4', (byte)0 };
    int i62 = intArrayUtil54.findMinSubArrayLen(0, i_array61);
    int i64 = intArrayUtil45.threeSumClosest(i_array61, (int)(short)100);
    int i65 = intArrayUtil41.removeDuplicateElements(i_array61);
    int i67 = intArrayUtil4.findKthLargestViaQuickSort(i_array61, (-3));
    intArrayUtil0.getNextPermutationNumber(i_array61);
    int[] i_array69 = null;
    int i71 = intArrayUtil0.findKthLargestViaQuickSort(i_array69, 1);
    int[] i_array72 = null;
    intArrayUtil0.getNextPermutationNumber(i_array72);
    int[] i_array74 = new int[] {  };
    int i76 = intArrayUtil0.threeSumClosest(i_array74, (int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 0);

  }

  @Test
  public void test63() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test63"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil9 = new util.IntArrayUtil();
    int[] i_array10 = new int[] {  };
    int i12 = intArrayUtil9.findKthLargestViaQuickSort(i_array10, (-1));
    int[] i_array16 = new int[] { '4', (byte)0 };
    int i17 = intArrayUtil9.findMinSubArrayLen(0, i_array16);
    int i18 = intArrayUtil0.removeDuplicateElements(i_array16);
    util.IntArrayUtil intArrayUtil20 = new util.IntArrayUtil();
    int[] i_array21 = new int[] {  };
    int i23 = intArrayUtil20.findKthLargestViaQuickSort(i_array21, (-1));
    int[] i_array27 = new int[] { '4', (byte)0 };
    int i28 = intArrayUtil20.findMinSubArrayLen(0, i_array27);
    int i29 = intArrayUtil0.findMinSubArrayLen((int)(short)0, i_array27);
    util.IntArrayUtil intArrayUtil30 = new util.IntArrayUtil();
    int[] i_array31 = new int[] {  };
    int i33 = intArrayUtil30.findKthLargestViaQuickSort(i_array31, (-1));
    int i35 = intArrayUtil0.threeSumClosest(i_array31, 1);
    int[] i_array36 = null;
    int i37 = intArrayUtil0.findMinViaIteration(i_array36);
    util.IntArrayUtil intArrayUtil38 = new util.IntArrayUtil();
    int[] i_array39 = new int[] {  };
    int i41 = intArrayUtil38.findKthLargestViaQuickSort(i_array39, (-1));
    int[] i_array45 = new int[] { '4', (byte)0 };
    int i46 = intArrayUtil38.findMinSubArrayLen(0, i_array45);
    util.IntArrayUtil intArrayUtil47 = new util.IntArrayUtil();
    int[] i_array48 = new int[] {  };
    int i50 = intArrayUtil47.findKthLargestViaQuickSort(i_array48, (-1));
    int[] i_array54 = new int[] { '4', (byte)0 };
    int i55 = intArrayUtil47.findMinSubArrayLen(0, i_array54);
    int i56 = intArrayUtil38.removeDuplicateElements(i_array54);
    util.IntArrayUtil intArrayUtil58 = new util.IntArrayUtil();
    int[] i_array59 = new int[] {  };
    int i61 = intArrayUtil58.findKthLargestViaQuickSort(i_array59, (-1));
    int[] i_array65 = new int[] { '4', (byte)0 };
    int i66 = intArrayUtil58.findMinSubArrayLen(0, i_array65);
    int i67 = intArrayUtil38.findMinSubArrayLen((int)(short)0, i_array65);
    util.IntArrayUtil intArrayUtil68 = new util.IntArrayUtil();
    int[] i_array69 = new int[] {  };
    int i71 = intArrayUtil68.findKthLargestViaQuickSort(i_array69, (-1));
    int i72 = intArrayUtil38.findMinViaIteration(i_array69);
    int i74 = intArrayUtil0.findKthLargestViaQuickSort(i_array69, (int)(byte)0);
    int[] i_array75 = null;
    int i77 = intArrayUtil0.findKthLargestViaQuickSort(i_array75, (-2));
    int[] i_array78 = new int[] {  };
    int i80 = intArrayUtil0.threeSumClosest(i_array78, (int)(byte)0);
    int[] i_array81 = null;
    int i83 = intArrayUtil0.findKthLargestViaQuickSort(i_array81, (int)'4');
    int[] i_array84 = null;
    int i86 = intArrayUtil0.findKthLargestViaQuickSort(i_array84, (int)' ');
    int[] i_array87 = null;
    int i88 = intArrayUtil0.findMinViaIteration(i_array87);
    int[] i_array89 = null;
    int i91 = intArrayUtil0.findKthLargestViaQuickSort(i_array89, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i86 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i91 == 0);

  }

  @Test
  public void test64() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test64"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil10 = new util.IntArrayUtil();
    int[] i_array11 = new int[] {  };
    int i13 = intArrayUtil10.findKthLargestViaQuickSort(i_array11, (-1));
    int i14 = intArrayUtil0.findMinSubArrayLen((int)(byte)-1, i_array11);
    util.IntArrayUtil intArrayUtil15 = new util.IntArrayUtil();
    int[] i_array16 = new int[] {  };
    int i18 = intArrayUtil15.findKthLargestViaQuickSort(i_array16, (-1));
    int[] i_array22 = new int[] { '4', (byte)0 };
    int i23 = intArrayUtil15.findMinSubArrayLen(0, i_array22);
    util.IntArrayUtil intArrayUtil25 = new util.IntArrayUtil();
    int[] i_array26 = new int[] {  };
    int i28 = intArrayUtil25.findKthLargestViaQuickSort(i_array26, (-1));
    int i29 = intArrayUtil15.findMinSubArrayLen((int)(byte)-1, i_array26);
    util.IntArrayUtil intArrayUtil30 = new util.IntArrayUtil();
    int[] i_array31 = new int[] {  };
    int i33 = intArrayUtil30.findKthLargestViaQuickSort(i_array31, (-1));
    int[] i_array37 = new int[] { '4', (byte)0 };
    int i38 = intArrayUtil30.findMinSubArrayLen(0, i_array37);
    util.IntArrayUtil intArrayUtil39 = new util.IntArrayUtil();
    int[] i_array40 = new int[] {  };
    int i42 = intArrayUtil39.findKthLargestViaQuickSort(i_array40, (-1));
    int[] i_array46 = new int[] { '4', (byte)0 };
    int i47 = intArrayUtil39.findMinSubArrayLen(0, i_array46);
    util.IntArrayUtil intArrayUtil48 = new util.IntArrayUtil();
    int[] i_array49 = new int[] {  };
    int i51 = intArrayUtil48.findKthLargestViaQuickSort(i_array49, (-1));
    int[] i_array55 = new int[] { '4', (byte)0 };
    int i56 = intArrayUtil48.findMinSubArrayLen(0, i_array55);
    int i57 = intArrayUtil39.removeDuplicateElements(i_array55);
    util.IntArrayUtil intArrayUtil59 = new util.IntArrayUtil();
    int[] i_array60 = new int[] {  };
    int i62 = intArrayUtil59.findKthLargestViaQuickSort(i_array60, (-1));
    int[] i_array66 = new int[] { '4', (byte)0 };
    int i67 = intArrayUtil59.findMinSubArrayLen(0, i_array66);
    int i68 = intArrayUtil39.findMinSubArrayLen((int)(short)0, i_array66);
    int i69 = intArrayUtil30.removeDuplicateElements(i_array66);
    int i70 = intArrayUtil15.findMinViaIteration(i_array66);
    intArrayUtil0.getNextPermutationNumber(i_array66);
    int[] i_array73 = new int[] { 0 };
    int i74 = intArrayUtil0.removeDuplicateElements(i_array73);
    int[] i_array75 = null;
    int i76 = intArrayUtil0.findMinViaIteration(i_array75);
    int[] i_array77 = null;
    int i78 = intArrayUtil0.findMinViaIteration(i_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == (-1));

  }

  @Test
  public void test65() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test65"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil10 = new util.IntArrayUtil();
    int[] i_array11 = new int[] {  };
    int i13 = intArrayUtil10.findKthLargestViaQuickSort(i_array11, (-1));
    int i14 = intArrayUtil0.findMinSubArrayLen((int)(byte)-1, i_array11);
    util.IntArrayUtil intArrayUtil15 = new util.IntArrayUtil();
    int[] i_array16 = new int[] {  };
    int i18 = intArrayUtil15.findKthLargestViaQuickSort(i_array16, (-1));
    int[] i_array22 = new int[] { '4', (byte)0 };
    int i23 = intArrayUtil15.findMinSubArrayLen(0, i_array22);
    util.IntArrayUtil intArrayUtil24 = new util.IntArrayUtil();
    int[] i_array25 = new int[] {  };
    int i27 = intArrayUtil24.findKthLargestViaQuickSort(i_array25, (-1));
    int[] i_array31 = new int[] { '4', (byte)0 };
    int i32 = intArrayUtil24.findMinSubArrayLen(0, i_array31);
    int i34 = intArrayUtil15.threeSumClosest(i_array31, (int)(short)100);
    int i36 = intArrayUtil0.threeSumClosest(i_array31, 4);
    int[] i_array37 = null;
    int i38 = intArrayUtil0.findMinViaIteration(i_array37);
    util.IntArrayUtil intArrayUtil39 = new util.IntArrayUtil();
    int[] i_array40 = new int[] {  };
    int i42 = intArrayUtil39.findKthLargestViaQuickSort(i_array40, (-1));
    int[] i_array46 = new int[] { '4', (byte)0 };
    int i47 = intArrayUtil39.findMinSubArrayLen(0, i_array46);
    intArrayUtil0.getNextPermutationNumber(i_array46);
    util.IntArrayUtil intArrayUtil49 = new util.IntArrayUtil();
    int[] i_array50 = new int[] {  };
    int i52 = intArrayUtil49.findKthLargestViaQuickSort(i_array50, (-1));
    int[] i_array56 = new int[] { '4', (byte)0 };
    int i57 = intArrayUtil49.findMinSubArrayLen(0, i_array56);
    util.IntArrayUtil intArrayUtil58 = new util.IntArrayUtil();
    int[] i_array59 = new int[] {  };
    int i61 = intArrayUtil58.findKthLargestViaQuickSort(i_array59, (-1));
    int[] i_array65 = new int[] { '4', (byte)0 };
    int i66 = intArrayUtil58.findMinSubArrayLen(0, i_array65);
    int i67 = intArrayUtil49.removeDuplicateElements(i_array65);
    util.IntArrayUtil intArrayUtil69 = new util.IntArrayUtil();
    int[] i_array70 = new int[] {  };
    int i72 = intArrayUtil69.findKthLargestViaQuickSort(i_array70, (-1));
    int[] i_array76 = new int[] { '4', (byte)0 };
    int i77 = intArrayUtil69.findMinSubArrayLen(0, i_array76);
    int i78 = intArrayUtil49.findMinSubArrayLen((int)(short)0, i_array76);
    util.IntArrayUtil intArrayUtil79 = new util.IntArrayUtil();
    int[] i_array80 = new int[] {  };
    int i82 = intArrayUtil79.findKthLargestViaQuickSort(i_array80, (-1));
    intArrayUtil49.getNextPermutationNumber(i_array80);
    int i85 = intArrayUtil0.threeSumClosest(i_array80, 32);
    int[] i_array88 = new int[] { (byte)1, (short)10 };
    int i89 = intArrayUtil0.findMinViaIteration(i_array88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i89 == 1);

  }

  @Test
  public void test66() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test66"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    int[] i_array9 = null;
    intArrayUtil0.getNextPermutationNumber(i_array9);
    util.IntArrayUtil intArrayUtil11 = new util.IntArrayUtil();
    int[] i_array12 = new int[] {  };
    int i14 = intArrayUtil11.findKthLargestViaQuickSort(i_array12, (-1));
    int[] i_array18 = new int[] { '4', (byte)0 };
    int i19 = intArrayUtil11.findMinSubArrayLen(0, i_array18);
    util.IntArrayUtil intArrayUtil20 = new util.IntArrayUtil();
    int[] i_array21 = new int[] {  };
    int i23 = intArrayUtil20.findKthLargestViaQuickSort(i_array21, (-1));
    int[] i_array27 = new int[] { '4', (byte)0 };
    int i28 = intArrayUtil20.findMinSubArrayLen(0, i_array27);
    int i29 = intArrayUtil11.removeDuplicateElements(i_array27);
    util.IntArrayUtil intArrayUtil31 = new util.IntArrayUtil();
    int[] i_array32 = new int[] {  };
    int i34 = intArrayUtil31.findKthLargestViaQuickSort(i_array32, (-1));
    int[] i_array38 = new int[] { '4', (byte)0 };
    int i39 = intArrayUtil31.findMinSubArrayLen(0, i_array38);
    int i40 = intArrayUtil11.findMinSubArrayLen((int)(short)0, i_array38);
    util.IntArrayUtil intArrayUtil41 = new util.IntArrayUtil();
    int[] i_array42 = new int[] {  };
    int i44 = intArrayUtil41.findKthLargestViaQuickSort(i_array42, (-1));
    intArrayUtil11.getNextPermutationNumber(i_array42);
    int i47 = intArrayUtil0.threeSumClosest(i_array42, (-7));
    util.IntArrayUtil intArrayUtil48 = new util.IntArrayUtil();
    int[] i_array49 = new int[] {  };
    int i51 = intArrayUtil48.findKthLargestViaQuickSort(i_array49, (-1));
    int[] i_array55 = new int[] { '4', (byte)0 };
    int i56 = intArrayUtil48.findMinSubArrayLen(0, i_array55);
    util.IntArrayUtil intArrayUtil58 = new util.IntArrayUtil();
    int[] i_array59 = new int[] {  };
    int i61 = intArrayUtil58.findKthLargestViaQuickSort(i_array59, (-1));
    int i62 = intArrayUtil48.findMinSubArrayLen((int)(byte)-1, i_array59);
    util.IntArrayUtil intArrayUtil63 = new util.IntArrayUtil();
    int[] i_array64 = new int[] {  };
    int i66 = intArrayUtil63.findKthLargestViaQuickSort(i_array64, (-1));
    int[] i_array70 = new int[] { '4', (byte)0 };
    int i71 = intArrayUtil63.findMinSubArrayLen(0, i_array70);
    int i73 = intArrayUtil48.threeSumClosest(i_array70, (int)(byte)100);
    intArrayUtil0.getNextPermutationNumber(i_array70);
    int[] i_array76 = null;
    int i77 = intArrayUtil0.findMinSubArrayLen((int)(short)0, i_array76);
    int[] i_array78 = null;
    int i79 = intArrayUtil0.removeDuplicateElements(i_array78);
    int[] i_array80 = null;
    int i81 = intArrayUtil0.removeDuplicateElements(i_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 0);

  }

  @Test
  public void test67() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test67"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil9 = new util.IntArrayUtil();
    int[] i_array10 = new int[] {  };
    int i12 = intArrayUtil9.findKthLargestViaQuickSort(i_array10, (-1));
    int[] i_array16 = new int[] { '4', (byte)0 };
    int i17 = intArrayUtil9.findMinSubArrayLen(0, i_array16);
    util.IntArrayUtil intArrayUtil18 = new util.IntArrayUtil();
    int[] i_array19 = new int[] {  };
    int i21 = intArrayUtil18.findKthLargestViaQuickSort(i_array19, (-1));
    int[] i_array25 = new int[] { '4', (byte)0 };
    int i26 = intArrayUtil18.findMinSubArrayLen(0, i_array25);
    int i27 = intArrayUtil9.removeDuplicateElements(i_array25);
    util.IntArrayUtil intArrayUtil29 = new util.IntArrayUtil();
    int[] i_array30 = new int[] {  };
    int i32 = intArrayUtil29.findKthLargestViaQuickSort(i_array30, (-1));
    int[] i_array36 = new int[] { '4', (byte)0 };
    int i37 = intArrayUtil29.findMinSubArrayLen(0, i_array36);
    int i38 = intArrayUtil9.findMinSubArrayLen((int)(short)0, i_array36);
    int i39 = intArrayUtil0.removeDuplicateElements(i_array36);
    util.IntArrayUtil intArrayUtil40 = new util.IntArrayUtil();
    int[] i_array41 = new int[] {  };
    int i43 = intArrayUtil40.findKthLargestViaQuickSort(i_array41, (-1));
    int i44 = intArrayUtil0.removeDuplicateElements(i_array41);
    int[] i_array47 = new int[] { 10, (byte)10 };
    int i49 = intArrayUtil0.findKthLargestViaQuickSort(i_array47, (-1));
    util.IntArrayUtil intArrayUtil50 = new util.IntArrayUtil();
    int[] i_array51 = new int[] {  };
    int i53 = intArrayUtil50.findKthLargestViaQuickSort(i_array51, (-1));
    util.IntArrayUtil intArrayUtil54 = new util.IntArrayUtil();
    int[] i_array55 = new int[] {  };
    int i57 = intArrayUtil54.findKthLargestViaQuickSort(i_array55, (-1));
    int[] i_array61 = new int[] { '4', (byte)0 };
    int i62 = intArrayUtil54.findMinSubArrayLen(0, i_array61);
    util.IntArrayUtil intArrayUtil63 = new util.IntArrayUtil();
    int[] i_array64 = new int[] {  };
    int i66 = intArrayUtil63.findKthLargestViaQuickSort(i_array64, (-1));
    int[] i_array70 = new int[] { '4', (byte)0 };
    int i71 = intArrayUtil63.findMinSubArrayLen(0, i_array70);
    int i73 = intArrayUtil54.threeSumClosest(i_array70, (int)(short)100);
    int i74 = intArrayUtil50.removeDuplicateElements(i_array70);
    util.IntArrayUtil intArrayUtil76 = new util.IntArrayUtil();
    int[] i_array77 = new int[] {  };
    int i79 = intArrayUtil76.findKthLargestViaQuickSort(i_array77, (-1));
    int[] i_array83 = new int[] { '4', (byte)0 };
    int i84 = intArrayUtil76.findMinSubArrayLen(0, i_array83);
    util.IntArrayUtil intArrayUtil85 = new util.IntArrayUtil();
    int[] i_array86 = new int[] {  };
    int i88 = intArrayUtil85.findKthLargestViaQuickSort(i_array86, (-1));
    int[] i_array92 = new int[] { '4', (byte)0 };
    int i93 = intArrayUtil85.findMinSubArrayLen(0, i_array92);
    int i95 = intArrayUtil76.threeSumClosest(i_array92, (int)(short)100);
    int i96 = intArrayUtil50.findMinSubArrayLen(1, i_array92);
    intArrayUtil0.getNextPermutationNumber(i_array92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i84 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i93 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i95 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i96 == 1);

  }

  @Test
  public void test68() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test68"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    util.IntArrayUtil intArrayUtil1 = new util.IntArrayUtil();
    int[] i_array2 = new int[] {  };
    int i4 = intArrayUtil1.findKthLargestViaQuickSort(i_array2, (-1));
    int[] i_array8 = new int[] { '4', (byte)0 };
    int i9 = intArrayUtil1.findMinSubArrayLen(0, i_array8);
    util.IntArrayUtil intArrayUtil11 = new util.IntArrayUtil();
    int[] i_array12 = new int[] {  };
    int i14 = intArrayUtil11.findKthLargestViaQuickSort(i_array12, (-1));
    int i15 = intArrayUtil1.findMinSubArrayLen((int)(byte)-1, i_array12);
    util.IntArrayUtil intArrayUtil16 = new util.IntArrayUtil();
    int[] i_array17 = new int[] {  };
    int i19 = intArrayUtil16.findKthLargestViaQuickSort(i_array17, (-1));
    int[] i_array23 = new int[] { '4', (byte)0 };
    int i24 = intArrayUtil16.findMinSubArrayLen(0, i_array23);
    util.IntArrayUtil intArrayUtil25 = new util.IntArrayUtil();
    int[] i_array26 = new int[] {  };
    int i28 = intArrayUtil25.findKthLargestViaQuickSort(i_array26, (-1));
    int[] i_array32 = new int[] { '4', (byte)0 };
    int i33 = intArrayUtil25.findMinSubArrayLen(0, i_array32);
    int i35 = intArrayUtil16.threeSumClosest(i_array32, (int)(short)100);
    int i37 = intArrayUtil1.threeSumClosest(i_array32, 4);
    util.IntArrayUtil intArrayUtil38 = new util.IntArrayUtil();
    int[] i_array39 = new int[] {  };
    int i41 = intArrayUtil38.findKthLargestViaQuickSort(i_array39, (-1));
    util.IntArrayUtil intArrayUtil42 = new util.IntArrayUtil();
    int[] i_array43 = new int[] {  };
    int i45 = intArrayUtil42.findKthLargestViaQuickSort(i_array43, (-1));
    int[] i_array49 = new int[] { '4', (byte)0 };
    int i50 = intArrayUtil42.findMinSubArrayLen(0, i_array49);
    util.IntArrayUtil intArrayUtil51 = new util.IntArrayUtil();
    int[] i_array52 = new int[] {  };
    int i54 = intArrayUtil51.findKthLargestViaQuickSort(i_array52, (-1));
    int[] i_array58 = new int[] { '4', (byte)0 };
    int i59 = intArrayUtil51.findMinSubArrayLen(0, i_array58);
    int i61 = intArrayUtil42.threeSumClosest(i_array58, (int)(short)100);
    int i62 = intArrayUtil38.removeDuplicateElements(i_array58);
    int i64 = intArrayUtil1.findKthLargestViaQuickSort(i_array58, (-3));
    util.IntArrayUtil intArrayUtil66 = new util.IntArrayUtil();
    int[] i_array67 = new int[] {  };
    int i69 = intArrayUtil66.findKthLargestViaQuickSort(i_array67, (-1));
    int[] i_array73 = new int[] { '4', (byte)0 };
    int i74 = intArrayUtil66.findMinSubArrayLen(0, i_array73);
    util.IntArrayUtil intArrayUtil75 = new util.IntArrayUtil();
    int[] i_array76 = new int[] {  };
    int i78 = intArrayUtil75.findKthLargestViaQuickSort(i_array76, (-1));
    int[] i_array82 = new int[] { '4', (byte)0 };
    int i83 = intArrayUtil75.findMinSubArrayLen(0, i_array82);
    int i84 = intArrayUtil66.removeDuplicateElements(i_array82);
    int i85 = intArrayUtil1.findMinSubArrayLen((int)(short)-1, i_array82);
    int i86 = intArrayUtil0.findMinViaIteration(i_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i84 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i86 == 0);

  }

  @Test
  public void test69() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test69"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil9 = new util.IntArrayUtil();
    int[] i_array10 = new int[] {  };
    int i12 = intArrayUtil9.findKthLargestViaQuickSort(i_array10, (-1));
    int[] i_array16 = new int[] { '4', (byte)0 };
    int i17 = intArrayUtil9.findMinSubArrayLen(0, i_array16);
    int i18 = intArrayUtil0.removeDuplicateElements(i_array16);
    util.IntArrayUtil intArrayUtil20 = new util.IntArrayUtil();
    int[] i_array21 = new int[] {  };
    int i23 = intArrayUtil20.findKthLargestViaQuickSort(i_array21, (-1));
    int[] i_array27 = new int[] { '4', (byte)0 };
    int i28 = intArrayUtil20.findMinSubArrayLen(0, i_array27);
    int i29 = intArrayUtil0.findMinSubArrayLen((int)(short)0, i_array27);
    util.IntArrayUtil intArrayUtil30 = new util.IntArrayUtil();
    int[] i_array31 = new int[] {  };
    int i33 = intArrayUtil30.findKthLargestViaQuickSort(i_array31, (-1));
    int i35 = intArrayUtil0.threeSumClosest(i_array31, 1);
    int[] i_array36 = null;
    int i37 = intArrayUtil0.findMinViaIteration(i_array36);
    int[] i_array39 = null;
    int i40 = intArrayUtil0.findMinSubArrayLen((-4), i_array39);
    int[] i_array41 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i43 = intArrayUtil0.threeSumClosest(i_array41, 2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);

  }

  @Test
  public void test70() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test70"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    int[] i_array9 = null;
    intArrayUtil0.getNextPermutationNumber(i_array9);
    util.IntArrayUtil intArrayUtil11 = new util.IntArrayUtil();
    int[] i_array12 = new int[] {  };
    int i14 = intArrayUtil11.findKthLargestViaQuickSort(i_array12, (-1));
    int[] i_array18 = new int[] { '4', (byte)0 };
    int i19 = intArrayUtil11.findMinSubArrayLen(0, i_array18);
    util.IntArrayUtil intArrayUtil20 = new util.IntArrayUtil();
    int[] i_array21 = new int[] {  };
    int i23 = intArrayUtil20.findKthLargestViaQuickSort(i_array21, (-1));
    int[] i_array27 = new int[] { '4', (byte)0 };
    int i28 = intArrayUtil20.findMinSubArrayLen(0, i_array27);
    int i29 = intArrayUtil11.removeDuplicateElements(i_array27);
    util.IntArrayUtil intArrayUtil31 = new util.IntArrayUtil();
    int[] i_array32 = new int[] {  };
    int i34 = intArrayUtil31.findKthLargestViaQuickSort(i_array32, (-1));
    int[] i_array38 = new int[] { '4', (byte)0 };
    int i39 = intArrayUtil31.findMinSubArrayLen(0, i_array38);
    int i40 = intArrayUtil11.findMinSubArrayLen((int)(short)0, i_array38);
    util.IntArrayUtil intArrayUtil41 = new util.IntArrayUtil();
    int[] i_array42 = new int[] {  };
    int i44 = intArrayUtil41.findKthLargestViaQuickSort(i_array42, (-1));
    intArrayUtil11.getNextPermutationNumber(i_array42);
    int i47 = intArrayUtil0.threeSumClosest(i_array42, (-7));
    util.IntArrayUtil intArrayUtil48 = new util.IntArrayUtil();
    int[] i_array49 = new int[] {  };
    int i51 = intArrayUtil48.findKthLargestViaQuickSort(i_array49, (-1));
    int[] i_array55 = new int[] { '4', (byte)0 };
    int i56 = intArrayUtil48.findMinSubArrayLen(0, i_array55);
    util.IntArrayUtil intArrayUtil58 = new util.IntArrayUtil();
    int[] i_array59 = new int[] {  };
    int i61 = intArrayUtil58.findKthLargestViaQuickSort(i_array59, (-1));
    int i62 = intArrayUtil48.findMinSubArrayLen((int)(byte)-1, i_array59);
    util.IntArrayUtil intArrayUtil63 = new util.IntArrayUtil();
    int[] i_array64 = new int[] {  };
    int i66 = intArrayUtil63.findKthLargestViaQuickSort(i_array64, (-1));
    int[] i_array70 = new int[] { '4', (byte)0 };
    int i71 = intArrayUtil63.findMinSubArrayLen(0, i_array70);
    int i73 = intArrayUtil48.threeSumClosest(i_array70, (int)(byte)100);
    intArrayUtil0.getNextPermutationNumber(i_array70);
    int[] i_array76 = null;
    int i77 = intArrayUtil0.findMinSubArrayLen((int)(short)0, i_array76);
    int[] i_array78 = null;
    int i79 = intArrayUtil0.removeDuplicateElements(i_array78);
    int[] i_array80 = null;
    intArrayUtil0.getNextPermutationNumber(i_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 0);

  }

  @Test
  public void test71() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test71"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil9 = new util.IntArrayUtil();
    int[] i_array10 = new int[] {  };
    int i12 = intArrayUtil9.findKthLargestViaQuickSort(i_array10, (-1));
    int[] i_array16 = new int[] { '4', (byte)0 };
    int i17 = intArrayUtil9.findMinSubArrayLen(0, i_array16);
    int i18 = intArrayUtil0.removeDuplicateElements(i_array16);
    util.IntArrayUtil intArrayUtil19 = new util.IntArrayUtil();
    int[] i_array20 = new int[] {  };
    int i22 = intArrayUtil19.findKthLargestViaQuickSort(i_array20, (-1));
    int i24 = intArrayUtil0.findKthLargestViaQuickSort(i_array20, (-2));
    util.IntArrayUtil intArrayUtil25 = new util.IntArrayUtil();
    int[] i_array26 = new int[] {  };
    int i28 = intArrayUtil25.findKthLargestViaQuickSort(i_array26, (-1));
    int[] i_array32 = new int[] { '4', (byte)0 };
    int i33 = intArrayUtil25.findMinSubArrayLen(0, i_array32);
    util.IntArrayUtil intArrayUtil35 = new util.IntArrayUtil();
    int[] i_array36 = new int[] {  };
    int i38 = intArrayUtil35.findKthLargestViaQuickSort(i_array36, (-1));
    int i39 = intArrayUtil25.findMinSubArrayLen((int)(byte)-1, i_array36);
    int i40 = intArrayUtil0.findMinViaIteration(i_array36);
    int[] i_array41 = null;
    int i42 = intArrayUtil0.removeDuplicateElements(i_array41);
    int[] i_array43 = null;
    int i44 = intArrayUtil0.findMinViaIteration(i_array43);
    util.IntArrayUtil intArrayUtil45 = new util.IntArrayUtil();
    int[] i_array46 = new int[] {  };
    int i48 = intArrayUtil45.findKthLargestViaQuickSort(i_array46, (-1));
    int[] i_array52 = new int[] { '4', (byte)0 };
    int i53 = intArrayUtil45.findMinSubArrayLen(0, i_array52);
    util.IntArrayUtil intArrayUtil54 = new util.IntArrayUtil();
    int[] i_array55 = new int[] {  };
    int i57 = intArrayUtil54.findKthLargestViaQuickSort(i_array55, (-1));
    int[] i_array61 = new int[] { '4', (byte)0 };
    int i62 = intArrayUtil54.findMinSubArrayLen(0, i_array61);
    int i63 = intArrayUtil45.removeDuplicateElements(i_array61);
    util.IntArrayUtil intArrayUtil65 = new util.IntArrayUtil();
    int[] i_array66 = new int[] {  };
    int i68 = intArrayUtil65.findKthLargestViaQuickSort(i_array66, (-1));
    int[] i_array72 = new int[] { '4', (byte)0 };
    int i73 = intArrayUtil65.findMinSubArrayLen(0, i_array72);
    int i74 = intArrayUtil45.findMinSubArrayLen((int)(short)0, i_array72);
    util.IntArrayUtil intArrayUtil75 = new util.IntArrayUtil();
    int[] i_array76 = new int[] {  };
    int i78 = intArrayUtil75.findKthLargestViaQuickSort(i_array76, (-1));
    int[] i_array82 = new int[] { '4', (byte)0 };
    int i83 = intArrayUtil75.findMinSubArrayLen(0, i_array82);
    util.IntArrayUtil intArrayUtil85 = new util.IntArrayUtil();
    int[] i_array86 = new int[] {  };
    int i88 = intArrayUtil85.findKthLargestViaQuickSort(i_array86, (-1));
    int i89 = intArrayUtil75.findMinSubArrayLen((int)(byte)-1, i_array86);
    int i90 = intArrayUtil45.removeDuplicateElements(i_array86);
    int i92 = intArrayUtil0.findKthLargestViaQuickSort(i_array86, (-7));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i89 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i90 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i92 == 0);

  }

  @Test
  public void test72() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test72"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    util.IntArrayUtil intArrayUtil4 = new util.IntArrayUtil();
    int[] i_array5 = new int[] {  };
    int i7 = intArrayUtil4.findKthLargestViaQuickSort(i_array5, (-1));
    int[] i_array11 = new int[] { '4', (byte)0 };
    int i12 = intArrayUtil4.findMinSubArrayLen(0, i_array11);
    util.IntArrayUtil intArrayUtil13 = new util.IntArrayUtil();
    int[] i_array14 = new int[] {  };
    int i16 = intArrayUtil13.findKthLargestViaQuickSort(i_array14, (-1));
    int[] i_array20 = new int[] { '4', (byte)0 };
    int i21 = intArrayUtil13.findMinSubArrayLen(0, i_array20);
    int i22 = intArrayUtil4.removeDuplicateElements(i_array20);
    util.IntArrayUtil intArrayUtil24 = new util.IntArrayUtil();
    int[] i_array25 = new int[] {  };
    int i27 = intArrayUtil24.findKthLargestViaQuickSort(i_array25, (-1));
    int[] i_array31 = new int[] { '4', (byte)0 };
    int i32 = intArrayUtil24.findMinSubArrayLen(0, i_array31);
    int i33 = intArrayUtil4.findMinSubArrayLen((int)(short)0, i_array31);
    util.IntArrayUtil intArrayUtil34 = new util.IntArrayUtil();
    int[] i_array35 = new int[] {  };
    int i37 = intArrayUtil34.findKthLargestViaQuickSort(i_array35, (-1));
    int[] i_array41 = new int[] { '4', (byte)0 };
    int i42 = intArrayUtil34.findMinSubArrayLen(0, i_array41);
    intArrayUtil4.getNextPermutationNumber(i_array41);
    int i44 = intArrayUtil0.findMinViaIteration(i_array41);
    util.IntArrayUtil intArrayUtil45 = new util.IntArrayUtil();
    int[] i_array46 = new int[] {  };
    int i48 = intArrayUtil45.findKthLargestViaQuickSort(i_array46, (-1));
    int[] i_array52 = new int[] { '4', (byte)0 };
    int i53 = intArrayUtil45.findMinSubArrayLen(0, i_array52);
    int i55 = intArrayUtil0.threeSumClosest(i_array52, (int)' ');
    util.IntArrayUtil intArrayUtil56 = new util.IntArrayUtil();
    int[] i_array57 = new int[] {  };
    int i59 = intArrayUtil56.findKthLargestViaQuickSort(i_array57, (-1));
    int[] i_array63 = new int[] { '4', (byte)0 };
    int i64 = intArrayUtil56.findMinSubArrayLen(0, i_array63);
    int i66 = intArrayUtil0.findKthLargestViaQuickSort(i_array63, 0);
    int[] i_array67 = null;
    int i68 = intArrayUtil0.findMinViaIteration(i_array67);
    int[] i_array70 = null;
    int i71 = intArrayUtil0.findMinSubArrayLen((-7), i_array70);
    int[] i_array73 = null;
    int i74 = intArrayUtil0.findMinSubArrayLen(32, i_array73);
    int[] i_array75 = null;
    intArrayUtil0.getNextPermutationNumber(i_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 0);

  }

  @Test
  public void test73() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test73"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil9 = new util.IntArrayUtil();
    int[] i_array10 = new int[] {  };
    int i12 = intArrayUtil9.findKthLargestViaQuickSort(i_array10, (-1));
    int[] i_array16 = new int[] { '4', (byte)0 };
    int i17 = intArrayUtil9.findMinSubArrayLen(0, i_array16);
    int i19 = intArrayUtil0.threeSumClosest(i_array16, (int)(short)100);
    util.IntArrayUtil intArrayUtil20 = new util.IntArrayUtil();
    int[] i_array21 = new int[] {  };
    int i23 = intArrayUtil20.findKthLargestViaQuickSort(i_array21, (-1));
    int[] i_array27 = new int[] { '4', (byte)0 };
    int i28 = intArrayUtil20.findMinSubArrayLen(0, i_array27);
    util.IntArrayUtil intArrayUtil29 = new util.IntArrayUtil();
    int[] i_array30 = new int[] {  };
    int i32 = intArrayUtil29.findKthLargestViaQuickSort(i_array30, (-1));
    int[] i_array36 = new int[] { '4', (byte)0 };
    int i37 = intArrayUtil29.findMinSubArrayLen(0, i_array36);
    util.IntArrayUtil intArrayUtil38 = new util.IntArrayUtil();
    int[] i_array39 = new int[] {  };
    int i41 = intArrayUtil38.findKthLargestViaQuickSort(i_array39, (-1));
    int[] i_array45 = new int[] { '4', (byte)0 };
    int i46 = intArrayUtil38.findMinSubArrayLen(0, i_array45);
    int i47 = intArrayUtil29.removeDuplicateElements(i_array45);
    util.IntArrayUtil intArrayUtil49 = new util.IntArrayUtil();
    int[] i_array50 = new int[] {  };
    int i52 = intArrayUtil49.findKthLargestViaQuickSort(i_array50, (-1));
    int[] i_array56 = new int[] { '4', (byte)0 };
    int i57 = intArrayUtil49.findMinSubArrayLen(0, i_array56);
    int i58 = intArrayUtil29.findMinSubArrayLen((int)(short)0, i_array56);
    int i59 = intArrayUtil20.removeDuplicateElements(i_array56);
    int[] i_array60 = null;
    int i61 = intArrayUtil20.findMinViaIteration(i_array60);
    util.IntArrayUtil intArrayUtil62 = new util.IntArrayUtil();
    int[] i_array63 = new int[] {  };
    int i65 = intArrayUtil62.findKthLargestViaQuickSort(i_array63, (-1));
    int[] i_array69 = new int[] { '4', (byte)0 };
    int i70 = intArrayUtil62.findMinSubArrayLen(0, i_array69);
    util.IntArrayUtil intArrayUtil71 = new util.IntArrayUtil();
    int[] i_array72 = new int[] {  };
    int i74 = intArrayUtil71.findKthLargestViaQuickSort(i_array72, (-1));
    int[] i_array78 = new int[] { '4', (byte)0 };
    int i79 = intArrayUtil71.findMinSubArrayLen(0, i_array78);
    int i80 = intArrayUtil62.removeDuplicateElements(i_array78);
    util.IntArrayUtil intArrayUtil82 = new util.IntArrayUtil();
    int[] i_array83 = new int[] {  };
    int i85 = intArrayUtil82.findKthLargestViaQuickSort(i_array83, (-1));
    int[] i_array89 = new int[] { '4', (byte)0 };
    int i90 = intArrayUtil82.findMinSubArrayLen(0, i_array89);
    int i91 = intArrayUtil62.findMinSubArrayLen((int)(short)0, i_array89);
    util.IntArrayUtil intArrayUtil92 = new util.IntArrayUtil();
    int[] i_array93 = new int[] {  };
    int i95 = intArrayUtil92.findKthLargestViaQuickSort(i_array93, (-1));
    intArrayUtil62.getNextPermutationNumber(i_array93);
    int i97 = intArrayUtil20.findMinViaIteration(i_array93);
    intArrayUtil0.getNextPermutationNumber(i_array93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i90 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i91 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i95 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i97 == (-1));

  }

  @Test
  public void test74() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test74"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    util.IntArrayUtil intArrayUtil2 = new util.IntArrayUtil();
    int[] i_array3 = new int[] {  };
    int i5 = intArrayUtil2.findKthLargestViaQuickSort(i_array3, (-1));
    int[] i_array9 = new int[] { '4', (byte)0 };
    int i10 = intArrayUtil2.findMinSubArrayLen(0, i_array9);
    util.IntArrayUtil intArrayUtil11 = new util.IntArrayUtil();
    int[] i_array12 = new int[] {  };
    int i14 = intArrayUtil11.findKthLargestViaQuickSort(i_array12, (-1));
    int[] i_array18 = new int[] { '4', (byte)0 };
    int i19 = intArrayUtil11.findMinSubArrayLen(0, i_array18);
    int i20 = intArrayUtil2.removeDuplicateElements(i_array18);
    util.IntArrayUtil intArrayUtil22 = new util.IntArrayUtil();
    int[] i_array23 = new int[] {  };
    int i25 = intArrayUtil22.findKthLargestViaQuickSort(i_array23, (-1));
    int[] i_array29 = new int[] { '4', (byte)0 };
    int i30 = intArrayUtil22.findMinSubArrayLen(0, i_array29);
    int i31 = intArrayUtil2.findMinSubArrayLen((int)(short)0, i_array29);
    util.IntArrayUtil intArrayUtil32 = new util.IntArrayUtil();
    int[] i_array33 = new int[] {  };
    int i35 = intArrayUtil32.findKthLargestViaQuickSort(i_array33, (-1));
    int i36 = intArrayUtil2.findMinViaIteration(i_array33);
    int i37 = intArrayUtil0.findMinSubArrayLen(9, i_array33);
    util.IntArrayUtil intArrayUtil38 = new util.IntArrayUtil();
    int[] i_array39 = new int[] {  };
    int i41 = intArrayUtil38.findKthLargestViaQuickSort(i_array39, (-1));
    int[] i_array45 = new int[] { '4', (byte)0 };
    int i46 = intArrayUtil38.findMinSubArrayLen(0, i_array45);
    util.IntArrayUtil intArrayUtil47 = new util.IntArrayUtil();
    int[] i_array48 = new int[] {  };
    int i50 = intArrayUtil47.findKthLargestViaQuickSort(i_array48, (-1));
    int[] i_array54 = new int[] { '4', (byte)0 };
    int i55 = intArrayUtil47.findMinSubArrayLen(0, i_array54);
    util.IntArrayUtil intArrayUtil56 = new util.IntArrayUtil();
    int[] i_array57 = new int[] {  };
    int i59 = intArrayUtil56.findKthLargestViaQuickSort(i_array57, (-1));
    int[] i_array63 = new int[] { '4', (byte)0 };
    int i64 = intArrayUtil56.findMinSubArrayLen(0, i_array63);
    int i65 = intArrayUtil47.removeDuplicateElements(i_array63);
    util.IntArrayUtil intArrayUtil67 = new util.IntArrayUtil();
    int[] i_array68 = new int[] {  };
    int i70 = intArrayUtil67.findKthLargestViaQuickSort(i_array68, (-1));
    int[] i_array74 = new int[] { '4', (byte)0 };
    int i75 = intArrayUtil67.findMinSubArrayLen(0, i_array74);
    int i76 = intArrayUtil47.findMinSubArrayLen((int)(short)0, i_array74);
    int i77 = intArrayUtil38.removeDuplicateElements(i_array74);
    util.IntArrayUtil intArrayUtil78 = new util.IntArrayUtil();
    int[] i_array79 = new int[] {  };
    int i81 = intArrayUtil78.findKthLargestViaQuickSort(i_array79, (-1));
    int[] i_array85 = new int[] { '4', (byte)0 };
    int i86 = intArrayUtil78.findMinSubArrayLen(0, i_array85);
    util.IntArrayUtil intArrayUtil87 = new util.IntArrayUtil();
    int[] i_array88 = new int[] {  };
    int i90 = intArrayUtil87.findKthLargestViaQuickSort(i_array88, (-1));
    int[] i_array94 = new int[] { '4', (byte)0 };
    int i95 = intArrayUtil87.findMinSubArrayLen(0, i_array94);
    int i97 = intArrayUtil78.threeSumClosest(i_array94, (int)(short)100);
    int i98 = intArrayUtil38.removeDuplicateElements(i_array94);
    int i99 = intArrayUtil0.findMinViaRecursion(i_array94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i86 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i90 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i95 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i97 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i98 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i99 == 0);

  }

  @Test
  public void test75() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test75"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    int[] i_array9 = null;
    intArrayUtil0.getNextPermutationNumber(i_array9);
    int[] i_array11 = null;
    int i12 = intArrayUtil0.removeDuplicateElements(i_array11);
    util.IntArrayUtil intArrayUtil13 = new util.IntArrayUtil();
    int[] i_array14 = new int[] {  };
    int i16 = intArrayUtil13.findKthLargestViaQuickSort(i_array14, (-1));
    int i17 = intArrayUtil0.findMinViaIteration(i_array14);
    util.IntArrayUtil intArrayUtil18 = new util.IntArrayUtil();
    int[] i_array19 = new int[] {  };
    int i21 = intArrayUtil18.findKthLargestViaQuickSort(i_array19, (-1));
    int[] i_array25 = new int[] { '4', (byte)0 };
    int i26 = intArrayUtil18.findMinSubArrayLen(0, i_array25);
    int[] i_array27 = null;
    intArrayUtil18.getNextPermutationNumber(i_array27);
    int[] i_array29 = null;
    int i30 = intArrayUtil18.removeDuplicateElements(i_array29);
    util.IntArrayUtil intArrayUtil31 = new util.IntArrayUtil();
    int[] i_array32 = new int[] {  };
    int i34 = intArrayUtil31.findKthLargestViaQuickSort(i_array32, (-1));
    int i35 = intArrayUtil18.findMinViaIteration(i_array32);
    int i36 = intArrayUtil0.findMinViaIteration(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == (-1));

  }

  @Test
  public void test76() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test76"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil9 = new util.IntArrayUtil();
    int[] i_array10 = new int[] {  };
    int i12 = intArrayUtil9.findKthLargestViaQuickSort(i_array10, (-1));
    int[] i_array16 = new int[] { '4', (byte)0 };
    int i17 = intArrayUtil9.findMinSubArrayLen(0, i_array16);
    int i18 = intArrayUtil0.removeDuplicateElements(i_array16);
    util.IntArrayUtil intArrayUtil20 = new util.IntArrayUtil();
    int[] i_array21 = new int[] {  };
    int i23 = intArrayUtil20.findKthLargestViaQuickSort(i_array21, (-1));
    int[] i_array27 = new int[] { '4', (byte)0 };
    int i28 = intArrayUtil20.findMinSubArrayLen(0, i_array27);
    int i29 = intArrayUtil0.findMinSubArrayLen((int)(short)0, i_array27);
    util.IntArrayUtil intArrayUtil31 = new util.IntArrayUtil();
    int[] i_array32 = new int[] {  };
    int i34 = intArrayUtil31.findKthLargestViaQuickSort(i_array32, (-1));
    int i35 = intArrayUtil0.findMinSubArrayLen(1, i_array32);
    util.IntArrayUtil intArrayUtil36 = new util.IntArrayUtil();
    int[] i_array37 = new int[] {  };
    int i39 = intArrayUtil36.findKthLargestViaQuickSort(i_array37, (-1));
    int[] i_array43 = new int[] { '4', (byte)0 };
    int i44 = intArrayUtil36.findMinSubArrayLen(0, i_array43);
    util.IntArrayUtil intArrayUtil46 = new util.IntArrayUtil();
    int[] i_array47 = new int[] {  };
    int i49 = intArrayUtil46.findKthLargestViaQuickSort(i_array47, (-1));
    int i50 = intArrayUtil36.findMinSubArrayLen((int)(byte)-1, i_array47);
    util.IntArrayUtil intArrayUtil51 = new util.IntArrayUtil();
    int[] i_array52 = new int[] {  };
    int i54 = intArrayUtil51.findKthLargestViaQuickSort(i_array52, (-1));
    int[] i_array58 = new int[] { '4', (byte)0 };
    int i59 = intArrayUtil51.findMinSubArrayLen(0, i_array58);
    util.IntArrayUtil intArrayUtil60 = new util.IntArrayUtil();
    int[] i_array61 = new int[] {  };
    int i63 = intArrayUtil60.findKthLargestViaQuickSort(i_array61, (-1));
    int[] i_array67 = new int[] { '4', (byte)0 };
    int i68 = intArrayUtil60.findMinSubArrayLen(0, i_array67);
    int i70 = intArrayUtil51.threeSumClosest(i_array67, (int)(short)100);
    int i72 = intArrayUtil36.threeSumClosest(i_array67, 4);
    intArrayUtil0.getNextPermutationNumber(i_array67);
    int[] i_array74 = null;
    intArrayUtil0.getNextPermutationNumber(i_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 0);

  }

  @Test
  public void test77() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test77"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil9 = new util.IntArrayUtil();
    int[] i_array10 = new int[] {  };
    int i12 = intArrayUtil9.findKthLargestViaQuickSort(i_array10, (-1));
    int[] i_array16 = new int[] { '4', (byte)0 };
    int i17 = intArrayUtil9.findMinSubArrayLen(0, i_array16);
    int i18 = intArrayUtil0.removeDuplicateElements(i_array16);
    util.IntArrayUtil intArrayUtil20 = new util.IntArrayUtil();
    int[] i_array21 = new int[] {  };
    int i23 = intArrayUtil20.findKthLargestViaQuickSort(i_array21, (-1));
    int[] i_array27 = new int[] { '4', (byte)0 };
    int i28 = intArrayUtil20.findMinSubArrayLen(0, i_array27);
    int i29 = intArrayUtil0.findMinSubArrayLen((int)(short)0, i_array27);
    int[] i_array30 = null;
    intArrayUtil0.getNextPermutationNumber(i_array30);
    int[] i_array32 = null;
    int i34 = intArrayUtil0.findKthLargestViaQuickSort(i_array32, (-4));
    util.IntArrayUtil intArrayUtil35 = new util.IntArrayUtil();
    int[] i_array36 = new int[] {  };
    int i38 = intArrayUtil35.findKthLargestViaQuickSort(i_array36, (-1));
    int[] i_array42 = new int[] { '4', (byte)0 };
    int i43 = intArrayUtil35.findMinSubArrayLen(0, i_array42);
    util.IntArrayUtil intArrayUtil44 = new util.IntArrayUtil();
    int[] i_array45 = new int[] {  };
    int i47 = intArrayUtil44.findKthLargestViaQuickSort(i_array45, (-1));
    int[] i_array51 = new int[] { '4', (byte)0 };
    int i52 = intArrayUtil44.findMinSubArrayLen(0, i_array51);
    util.IntArrayUtil intArrayUtil53 = new util.IntArrayUtil();
    int[] i_array54 = new int[] {  };
    int i56 = intArrayUtil53.findKthLargestViaQuickSort(i_array54, (-1));
    int[] i_array60 = new int[] { '4', (byte)0 };
    int i61 = intArrayUtil53.findMinSubArrayLen(0, i_array60);
    int i62 = intArrayUtil44.removeDuplicateElements(i_array60);
    util.IntArrayUtil intArrayUtil64 = new util.IntArrayUtil();
    int[] i_array65 = new int[] {  };
    int i67 = intArrayUtil64.findKthLargestViaQuickSort(i_array65, (-1));
    int[] i_array71 = new int[] { '4', (byte)0 };
    int i72 = intArrayUtil64.findMinSubArrayLen(0, i_array71);
    int i73 = intArrayUtil44.findMinSubArrayLen((int)(short)0, i_array71);
    int i74 = intArrayUtil35.removeDuplicateElements(i_array71);
    util.IntArrayUtil intArrayUtil75 = new util.IntArrayUtil();
    int[] i_array76 = new int[] {  };
    int i78 = intArrayUtil75.findKthLargestViaQuickSort(i_array76, (-1));
    int i79 = intArrayUtil35.removeDuplicateElements(i_array76);
    int[] i_array82 = new int[] { 10, (byte)10 };
    int i84 = intArrayUtil35.findKthLargestViaQuickSort(i_array82, (-1));
    int i85 = intArrayUtil0.findMinViaIteration(i_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i84 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 10);

  }

  @Test
  public void test78() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test78"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    util.IntArrayUtil intArrayUtil4 = new util.IntArrayUtil();
    int[] i_array5 = new int[] {  };
    int i7 = intArrayUtil4.findKthLargestViaQuickSort(i_array5, (-1));
    int[] i_array11 = new int[] { '4', (byte)0 };
    int i12 = intArrayUtil4.findMinSubArrayLen(0, i_array11);
    util.IntArrayUtil intArrayUtil13 = new util.IntArrayUtil();
    int[] i_array14 = new int[] {  };
    int i16 = intArrayUtil13.findKthLargestViaQuickSort(i_array14, (-1));
    int[] i_array20 = new int[] { '4', (byte)0 };
    int i21 = intArrayUtil13.findMinSubArrayLen(0, i_array20);
    int i23 = intArrayUtil4.threeSumClosest(i_array20, (int)(short)100);
    int i24 = intArrayUtil0.removeDuplicateElements(i_array20);
    util.IntArrayUtil intArrayUtil25 = new util.IntArrayUtil();
    int[] i_array26 = new int[] {  };
    int i28 = intArrayUtil25.findKthLargestViaQuickSort(i_array26, (-1));
    util.IntArrayUtil intArrayUtil29 = new util.IntArrayUtil();
    int[] i_array30 = new int[] {  };
    int i32 = intArrayUtil29.findKthLargestViaQuickSort(i_array30, (-1));
    int[] i_array36 = new int[] { '4', (byte)0 };
    int i37 = intArrayUtil29.findMinSubArrayLen(0, i_array36);
    util.IntArrayUtil intArrayUtil38 = new util.IntArrayUtil();
    int[] i_array39 = new int[] {  };
    int i41 = intArrayUtil38.findKthLargestViaQuickSort(i_array39, (-1));
    int[] i_array45 = new int[] { '4', (byte)0 };
    int i46 = intArrayUtil38.findMinSubArrayLen(0, i_array45);
    int i48 = intArrayUtil29.threeSumClosest(i_array45, (int)(short)100);
    int i49 = intArrayUtil25.removeDuplicateElements(i_array45);
    int[] i_array51 = null;
    int i52 = intArrayUtil25.findMinSubArrayLen((int)' ', i_array51);
    util.IntArrayUtil intArrayUtil53 = new util.IntArrayUtil();
    int[] i_array54 = new int[] {  };
    int i56 = intArrayUtil53.findKthLargestViaQuickSort(i_array54, (-1));
    util.IntArrayUtil intArrayUtil57 = new util.IntArrayUtil();
    int[] i_array58 = new int[] {  };
    int i60 = intArrayUtil57.findKthLargestViaQuickSort(i_array58, (-1));
    int[] i_array64 = new int[] { '4', (byte)0 };
    int i65 = intArrayUtil57.findMinSubArrayLen(0, i_array64);
    util.IntArrayUtil intArrayUtil66 = new util.IntArrayUtil();
    int[] i_array67 = new int[] {  };
    int i69 = intArrayUtil66.findKthLargestViaQuickSort(i_array67, (-1));
    int[] i_array73 = new int[] { '4', (byte)0 };
    int i74 = intArrayUtil66.findMinSubArrayLen(0, i_array73);
    int i75 = intArrayUtil57.removeDuplicateElements(i_array73);
    util.IntArrayUtil intArrayUtil77 = new util.IntArrayUtil();
    int[] i_array78 = new int[] {  };
    int i80 = intArrayUtil77.findKthLargestViaQuickSort(i_array78, (-1));
    int[] i_array84 = new int[] { '4', (byte)0 };
    int i85 = intArrayUtil77.findMinSubArrayLen(0, i_array84);
    int i86 = intArrayUtil57.findMinSubArrayLen((int)(short)0, i_array84);
    util.IntArrayUtil intArrayUtil87 = new util.IntArrayUtil();
    int[] i_array88 = new int[] {  };
    int i90 = intArrayUtil87.findKthLargestViaQuickSort(i_array88, (-1));
    int i91 = intArrayUtil57.findMinViaIteration(i_array88);
    int i92 = intArrayUtil53.findMinViaIteration(i_array88);
    int i93 = intArrayUtil25.findMinViaIteration(i_array88);
    intArrayUtil0.getNextPermutationNumber(i_array88);
    int[] i_array95 = null;
    int i97 = intArrayUtil0.findKthLargestViaQuickSort(i_array95, (-7));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i86 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i90 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i91 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i92 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i93 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i97 == 0);

  }

  @Test
  public void test79() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test79"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil9 = new util.IntArrayUtil();
    int[] i_array10 = new int[] {  };
    int i12 = intArrayUtil9.findKthLargestViaQuickSort(i_array10, (-1));
    util.IntArrayUtil intArrayUtil13 = new util.IntArrayUtil();
    int[] i_array14 = new int[] {  };
    int i16 = intArrayUtil13.findKthLargestViaQuickSort(i_array14, (-1));
    int[] i_array20 = new int[] { '4', (byte)0 };
    int i21 = intArrayUtil13.findMinSubArrayLen(0, i_array20);
    util.IntArrayUtil intArrayUtil23 = new util.IntArrayUtil();
    int[] i_array24 = new int[] {  };
    int i26 = intArrayUtil23.findKthLargestViaQuickSort(i_array24, (-1));
    int i27 = intArrayUtil13.findMinSubArrayLen((int)(byte)-1, i_array24);
    util.IntArrayUtil intArrayUtil28 = new util.IntArrayUtil();
    int[] i_array29 = new int[] {  };
    int i31 = intArrayUtil28.findKthLargestViaQuickSort(i_array29, (-1));
    int[] i_array35 = new int[] { '4', (byte)0 };
    int i36 = intArrayUtil28.findMinSubArrayLen(0, i_array35);
    util.IntArrayUtil intArrayUtil37 = new util.IntArrayUtil();
    int[] i_array38 = new int[] {  };
    int i40 = intArrayUtil37.findKthLargestViaQuickSort(i_array38, (-1));
    int[] i_array44 = new int[] { '4', (byte)0 };
    int i45 = intArrayUtil37.findMinSubArrayLen(0, i_array44);
    int i47 = intArrayUtil28.threeSumClosest(i_array44, (int)(short)100);
    int i49 = intArrayUtil13.threeSumClosest(i_array44, 4);
    util.IntArrayUtil intArrayUtil50 = new util.IntArrayUtil();
    int[] i_array51 = new int[] {  };
    int i53 = intArrayUtil50.findKthLargestViaQuickSort(i_array51, (-1));
    util.IntArrayUtil intArrayUtil54 = new util.IntArrayUtil();
    int[] i_array55 = new int[] {  };
    int i57 = intArrayUtil54.findKthLargestViaQuickSort(i_array55, (-1));
    int[] i_array61 = new int[] { '4', (byte)0 };
    int i62 = intArrayUtil54.findMinSubArrayLen(0, i_array61);
    util.IntArrayUtil intArrayUtil63 = new util.IntArrayUtil();
    int[] i_array64 = new int[] {  };
    int i66 = intArrayUtil63.findKthLargestViaQuickSort(i_array64, (-1));
    int[] i_array70 = new int[] { '4', (byte)0 };
    int i71 = intArrayUtil63.findMinSubArrayLen(0, i_array70);
    int i73 = intArrayUtil54.threeSumClosest(i_array70, (int)(short)100);
    int i74 = intArrayUtil50.removeDuplicateElements(i_array70);
    int i76 = intArrayUtil13.findKthLargestViaQuickSort(i_array70, (-3));
    intArrayUtil9.getNextPermutationNumber(i_array70);
    int i78 = intArrayUtil0.findMinViaIteration(i_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 0);

  }

  @Test
  public void test80() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test80"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    int[] i_array9 = null;
    intArrayUtil0.getNextPermutationNumber(i_array9);
    util.IntArrayUtil intArrayUtil11 = new util.IntArrayUtil();
    int[] i_array12 = new int[] {  };
    int i14 = intArrayUtil11.findKthLargestViaQuickSort(i_array12, (-1));
    int[] i_array18 = new int[] { '4', (byte)0 };
    int i19 = intArrayUtil11.findMinSubArrayLen(0, i_array18);
    util.IntArrayUtil intArrayUtil20 = new util.IntArrayUtil();
    int[] i_array21 = new int[] {  };
    int i23 = intArrayUtil20.findKthLargestViaQuickSort(i_array21, (-1));
    int[] i_array27 = new int[] { '4', (byte)0 };
    int i28 = intArrayUtil20.findMinSubArrayLen(0, i_array27);
    util.IntArrayUtil intArrayUtil30 = new util.IntArrayUtil();
    int[] i_array31 = new int[] {  };
    int i33 = intArrayUtil30.findKthLargestViaQuickSort(i_array31, (-1));
    int i34 = intArrayUtil20.findMinSubArrayLen((int)(byte)-1, i_array31);
    util.IntArrayUtil intArrayUtil35 = new util.IntArrayUtil();
    int[] i_array36 = new int[] {  };
    int i38 = intArrayUtil35.findKthLargestViaQuickSort(i_array36, (-1));
    int[] i_array42 = new int[] { '4', (byte)0 };
    int i43 = intArrayUtil35.findMinSubArrayLen(0, i_array42);
    util.IntArrayUtil intArrayUtil44 = new util.IntArrayUtil();
    int[] i_array45 = new int[] {  };
    int i47 = intArrayUtil44.findKthLargestViaQuickSort(i_array45, (-1));
    int[] i_array51 = new int[] { '4', (byte)0 };
    int i52 = intArrayUtil44.findMinSubArrayLen(0, i_array51);
    int i54 = intArrayUtil35.threeSumClosest(i_array51, (int)(short)100);
    int i56 = intArrayUtil20.threeSumClosest(i_array51, 4);
    util.IntArrayUtil intArrayUtil57 = new util.IntArrayUtil();
    int[] i_array58 = new int[] {  };
    int i60 = intArrayUtil57.findKthLargestViaQuickSort(i_array58, (-1));
    int[] i_array64 = new int[] { '4', (byte)0 };
    int i65 = intArrayUtil57.findMinSubArrayLen(0, i_array64);
    util.IntArrayUtil intArrayUtil66 = new util.IntArrayUtil();
    int[] i_array67 = new int[] {  };
    int i69 = intArrayUtil66.findKthLargestViaQuickSort(i_array67, (-1));
    int[] i_array73 = new int[] { '4', (byte)0 };
    int i74 = intArrayUtil66.findMinSubArrayLen(0, i_array73);
    int i76 = intArrayUtil57.threeSumClosest(i_array73, (int)(short)100);
    int i77 = intArrayUtil20.findMinViaRecursion(i_array73);
    int i78 = intArrayUtil11.findMinViaRecursion(i_array73);
    int i79 = intArrayUtil0.findMinViaIteration(i_array73);
    int[] i_array80 = null;
    int i81 = intArrayUtil0.removeDuplicateElements(i_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 0);

  }

  @Test
  public void test81() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test81"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil9 = new util.IntArrayUtil();
    int[] i_array10 = new int[] {  };
    int i12 = intArrayUtil9.findKthLargestViaQuickSort(i_array10, (-1));
    int[] i_array16 = new int[] { '4', (byte)0 };
    int i17 = intArrayUtil9.findMinSubArrayLen(0, i_array16);
    int i18 = intArrayUtil0.removeDuplicateElements(i_array16);
    util.IntArrayUtil intArrayUtil20 = new util.IntArrayUtil();
    int[] i_array21 = new int[] {  };
    int i23 = intArrayUtil20.findKthLargestViaQuickSort(i_array21, (-1));
    int[] i_array27 = new int[] { '4', (byte)0 };
    int i28 = intArrayUtil20.findMinSubArrayLen(0, i_array27);
    int i29 = intArrayUtil0.findMinSubArrayLen((int)(short)0, i_array27);
    util.IntArrayUtil intArrayUtil30 = new util.IntArrayUtil();
    int[] i_array31 = new int[] {  };
    int i33 = intArrayUtil30.findKthLargestViaQuickSort(i_array31, (-1));
    intArrayUtil0.getNextPermutationNumber(i_array31);
    util.IntArrayUtil intArrayUtil35 = new util.IntArrayUtil();
    int[] i_array36 = new int[] {  };
    int i38 = intArrayUtil35.findKthLargestViaQuickSort(i_array36, (-1));
    int[] i_array42 = new int[] { '4', (byte)0 };
    int i43 = intArrayUtil35.findMinSubArrayLen(0, i_array42);
    util.IntArrayUtil intArrayUtil44 = new util.IntArrayUtil();
    int[] i_array45 = new int[] {  };
    int i47 = intArrayUtil44.findKthLargestViaQuickSort(i_array45, (-1));
    int[] i_array51 = new int[] { '4', (byte)0 };
    int i52 = intArrayUtil44.findMinSubArrayLen(0, i_array51);
    int i54 = intArrayUtil35.threeSumClosest(i_array51, (int)(short)100);
    int[] i_array56 = null;
    int i57 = intArrayUtil35.findMinSubArrayLen(9, i_array56);
    util.IntArrayUtil intArrayUtil58 = new util.IntArrayUtil();
    int[] i_array59 = new int[] {  };
    int i61 = intArrayUtil58.findKthLargestViaQuickSort(i_array59, (-1));
    int[] i_array65 = new int[] { '4', (byte)0 };
    int i66 = intArrayUtil58.findMinSubArrayLen(0, i_array65);
    util.IntArrayUtil intArrayUtil67 = new util.IntArrayUtil();
    int[] i_array68 = new int[] {  };
    int i70 = intArrayUtil67.findKthLargestViaQuickSort(i_array68, (-1));
    int[] i_array74 = new int[] { '4', (byte)0 };
    int i75 = intArrayUtil67.findMinSubArrayLen(0, i_array74);
    int i77 = intArrayUtil58.threeSumClosest(i_array74, (int)(short)100);
    int i78 = intArrayUtil35.removeDuplicateElements(i_array74);
    int i79 = intArrayUtil0.findMinViaRecursion(i_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 0);

  }

  @Test
  public void test82() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test82"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    int[] i_array9 = null;
    intArrayUtil0.getNextPermutationNumber(i_array9);
    util.IntArrayUtil intArrayUtil11 = new util.IntArrayUtil();
    int[] i_array12 = new int[] {  };
    int i14 = intArrayUtil11.findKthLargestViaQuickSort(i_array12, (-1));
    int[] i_array18 = new int[] { '4', (byte)0 };
    int i19 = intArrayUtil11.findMinSubArrayLen(0, i_array18);
    util.IntArrayUtil intArrayUtil20 = new util.IntArrayUtil();
    int[] i_array21 = new int[] {  };
    int i23 = intArrayUtil20.findKthLargestViaQuickSort(i_array21, (-1));
    int[] i_array27 = new int[] { '4', (byte)0 };
    int i28 = intArrayUtil20.findMinSubArrayLen(0, i_array27);
    int i29 = intArrayUtil11.removeDuplicateElements(i_array27);
    util.IntArrayUtil intArrayUtil31 = new util.IntArrayUtil();
    int[] i_array32 = new int[] {  };
    int i34 = intArrayUtil31.findKthLargestViaQuickSort(i_array32, (-1));
    int[] i_array38 = new int[] { '4', (byte)0 };
    int i39 = intArrayUtil31.findMinSubArrayLen(0, i_array38);
    int i40 = intArrayUtil11.findMinSubArrayLen((int)(short)0, i_array38);
    util.IntArrayUtil intArrayUtil41 = new util.IntArrayUtil();
    int[] i_array42 = new int[] {  };
    int i44 = intArrayUtil41.findKthLargestViaQuickSort(i_array42, (-1));
    int i46 = intArrayUtil11.threeSumClosest(i_array42, 1);
    util.IntArrayUtil intArrayUtil47 = new util.IntArrayUtil();
    int[] i_array48 = new int[] {  };
    int i50 = intArrayUtil47.findKthLargestViaQuickSort(i_array48, (-1));
    int[] i_array54 = new int[] { '4', (byte)0 };
    int i55 = intArrayUtil47.findMinSubArrayLen(0, i_array54);
    util.IntArrayUtil intArrayUtil56 = new util.IntArrayUtil();
    int[] i_array57 = new int[] {  };
    int i59 = intArrayUtil56.findKthLargestViaQuickSort(i_array57, (-1));
    int[] i_array63 = new int[] { '4', (byte)0 };
    int i64 = intArrayUtil56.findMinSubArrayLen(0, i_array63);
    int i65 = intArrayUtil47.removeDuplicateElements(i_array63);
    util.IntArrayUtil intArrayUtil67 = new util.IntArrayUtil();
    int[] i_array68 = new int[] {  };
    int i70 = intArrayUtil67.findKthLargestViaQuickSort(i_array68, (-1));
    int[] i_array74 = new int[] { '4', (byte)0 };
    int i75 = intArrayUtil67.findMinSubArrayLen(0, i_array74);
    int i76 = intArrayUtil47.findMinSubArrayLen((int)(short)0, i_array74);
    util.IntArrayUtil intArrayUtil77 = new util.IntArrayUtil();
    int[] i_array78 = new int[] {  };
    int i80 = intArrayUtil77.findKthLargestViaQuickSort(i_array78, (-1));
    intArrayUtil47.getNextPermutationNumber(i_array78);
    int i83 = intArrayUtil11.findKthLargestViaQuickSort(i_array78, (-3));
    int[] i_array84 = null;
    int i85 = intArrayUtil11.removeDuplicateElements(i_array84);
    int[] i_array91 = new int[] { '#', (byte)10, ' ', 10, (-1) };
    int i92 = intArrayUtil11.removeDuplicateElements(i_array91);
    intArrayUtil0.getNextPermutationNumber(i_array91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i92 == 5);

  }

  @Test
  public void test83() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test83"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil10 = new util.IntArrayUtil();
    int[] i_array11 = new int[] {  };
    int i13 = intArrayUtil10.findKthLargestViaQuickSort(i_array11, (-1));
    int i14 = intArrayUtil0.findMinSubArrayLen((int)(byte)-1, i_array11);
    util.IntArrayUtil intArrayUtil15 = new util.IntArrayUtil();
    int[] i_array16 = new int[] {  };
    int i18 = intArrayUtil15.findKthLargestViaQuickSort(i_array16, (-1));
    int i20 = intArrayUtil0.findKthLargestViaQuickSort(i_array16, (-4));
    util.IntArrayUtil intArrayUtil21 = new util.IntArrayUtil();
    int[] i_array22 = new int[] {  };
    int i24 = intArrayUtil21.findKthLargestViaQuickSort(i_array22, (-1));
    int[] i_array28 = new int[] { '4', (byte)0 };
    int i29 = intArrayUtil21.findMinSubArrayLen(0, i_array28);
    util.IntArrayUtil intArrayUtil30 = new util.IntArrayUtil();
    int[] i_array31 = new int[] {  };
    int i33 = intArrayUtil30.findKthLargestViaQuickSort(i_array31, (-1));
    int[] i_array37 = new int[] { '4', (byte)0 };
    int i38 = intArrayUtil30.findMinSubArrayLen(0, i_array37);
    int i39 = intArrayUtil21.removeDuplicateElements(i_array37);
    util.IntArrayUtil intArrayUtil41 = new util.IntArrayUtil();
    int[] i_array42 = new int[] {  };
    int i44 = intArrayUtil41.findKthLargestViaQuickSort(i_array42, (-1));
    int[] i_array48 = new int[] { '4', (byte)0 };
    int i49 = intArrayUtil41.findMinSubArrayLen(0, i_array48);
    int i50 = intArrayUtil21.findMinSubArrayLen((int)(short)0, i_array48);
    util.IntArrayUtil intArrayUtil51 = new util.IntArrayUtil();
    int[] i_array52 = new int[] {  };
    int i54 = intArrayUtil51.findKthLargestViaQuickSort(i_array52, (-1));
    int[] i_array58 = new int[] { '4', (byte)0 };
    int i59 = intArrayUtil51.findMinSubArrayLen(0, i_array58);
    util.IntArrayUtil intArrayUtil60 = new util.IntArrayUtil();
    int[] i_array61 = new int[] {  };
    int i63 = intArrayUtil60.findKthLargestViaQuickSort(i_array61, (-1));
    int[] i_array67 = new int[] { '4', (byte)0 };
    int i68 = intArrayUtil60.findMinSubArrayLen(0, i_array67);
    int i69 = intArrayUtil51.removeDuplicateElements(i_array67);
    int i71 = intArrayUtil21.threeSumClosest(i_array67, 100);
    intArrayUtil0.getNextPermutationNumber(i_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);

  }

  @Test
  public void test84() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test84"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil9 = new util.IntArrayUtil();
    int[] i_array10 = new int[] {  };
    int i12 = intArrayUtil9.findKthLargestViaQuickSort(i_array10, (-1));
    int[] i_array16 = new int[] { '4', (byte)0 };
    int i17 = intArrayUtil9.findMinSubArrayLen(0, i_array16);
    util.IntArrayUtil intArrayUtil18 = new util.IntArrayUtil();
    int[] i_array19 = new int[] {  };
    int i21 = intArrayUtil18.findKthLargestViaQuickSort(i_array19, (-1));
    int[] i_array25 = new int[] { '4', (byte)0 };
    int i26 = intArrayUtil18.findMinSubArrayLen(0, i_array25);
    int i27 = intArrayUtil9.removeDuplicateElements(i_array25);
    util.IntArrayUtil intArrayUtil29 = new util.IntArrayUtil();
    int[] i_array30 = new int[] {  };
    int i32 = intArrayUtil29.findKthLargestViaQuickSort(i_array30, (-1));
    int[] i_array36 = new int[] { '4', (byte)0 };
    int i37 = intArrayUtil29.findMinSubArrayLen(0, i_array36);
    int i38 = intArrayUtil9.findMinSubArrayLen((int)(short)0, i_array36);
    int i39 = intArrayUtil0.removeDuplicateElements(i_array36);
    util.IntArrayUtil intArrayUtil41 = new util.IntArrayUtil();
    int[] i_array42 = new int[] {  };
    int i44 = intArrayUtil41.findKthLargestViaQuickSort(i_array42, (-1));
    int[] i_array48 = new int[] { '4', (byte)0 };
    int i49 = intArrayUtil41.findMinSubArrayLen(0, i_array48);
    util.IntArrayUtil intArrayUtil50 = new util.IntArrayUtil();
    int[] i_array51 = new int[] {  };
    int i53 = intArrayUtil50.findKthLargestViaQuickSort(i_array51, (-1));
    int[] i_array57 = new int[] { '4', (byte)0 };
    int i58 = intArrayUtil50.findMinSubArrayLen(0, i_array57);
    int i60 = intArrayUtil41.threeSumClosest(i_array57, (int)(short)100);
    int i61 = intArrayUtil0.findMinSubArrayLen((-4), i_array57);
    util.IntArrayUtil intArrayUtil63 = new util.IntArrayUtil();
    int[] i_array64 = new int[] {  };
    int i66 = intArrayUtil63.findKthLargestViaQuickSort(i_array64, (-1));
    util.IntArrayUtil intArrayUtil67 = new util.IntArrayUtil();
    int[] i_array68 = new int[] {  };
    int i70 = intArrayUtil67.findKthLargestViaQuickSort(i_array68, (-1));
    int[] i_array74 = new int[] { '4', (byte)0 };
    int i75 = intArrayUtil67.findMinSubArrayLen(0, i_array74);
    util.IntArrayUtil intArrayUtil76 = new util.IntArrayUtil();
    int[] i_array77 = new int[] {  };
    int i79 = intArrayUtil76.findKthLargestViaQuickSort(i_array77, (-1));
    int[] i_array83 = new int[] { '4', (byte)0 };
    int i84 = intArrayUtil76.findMinSubArrayLen(0, i_array83);
    int i86 = intArrayUtil67.threeSumClosest(i_array83, (int)(short)100);
    int i87 = intArrayUtil63.removeDuplicateElements(i_array83);
    int i88 = intArrayUtil0.findMinSubArrayLen((int)(short)10, i_array83);
    util.IntArrayUtil intArrayUtil89 = new util.IntArrayUtil();
    int[] i_array90 = new int[] {  };
    int i92 = intArrayUtil89.findKthLargestViaQuickSort(i_array90, (-1));
    int i93 = intArrayUtil0.removeDuplicateElements(i_array90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i84 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i86 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i92 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i93 == 0);

  }

  @Test
  public void test85() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test85"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil9 = new util.IntArrayUtil();
    int[] i_array10 = new int[] {  };
    int i12 = intArrayUtil9.findKthLargestViaQuickSort(i_array10, (-1));
    int[] i_array16 = new int[] { '4', (byte)0 };
    int i17 = intArrayUtil9.findMinSubArrayLen(0, i_array16);
    int i18 = intArrayUtil0.removeDuplicateElements(i_array16);
    util.IntArrayUtil intArrayUtil20 = new util.IntArrayUtil();
    int[] i_array21 = new int[] {  };
    int i23 = intArrayUtil20.findKthLargestViaQuickSort(i_array21, (-1));
    int[] i_array27 = new int[] { '4', (byte)0 };
    int i28 = intArrayUtil20.findMinSubArrayLen(0, i_array27);
    int i29 = intArrayUtil0.findMinSubArrayLen((int)(short)0, i_array27);
    util.IntArrayUtil intArrayUtil30 = new util.IntArrayUtil();
    int[] i_array31 = new int[] {  };
    int i33 = intArrayUtil30.findKthLargestViaQuickSort(i_array31, (-1));
    int[] i_array37 = new int[] { '4', (byte)0 };
    int i38 = intArrayUtil30.findMinSubArrayLen(0, i_array37);
    util.IntArrayUtil intArrayUtil39 = new util.IntArrayUtil();
    int[] i_array40 = new int[] {  };
    int i42 = intArrayUtil39.findKthLargestViaQuickSort(i_array40, (-1));
    int[] i_array46 = new int[] { '4', (byte)0 };
    int i47 = intArrayUtil39.findMinSubArrayLen(0, i_array46);
    int i48 = intArrayUtil30.removeDuplicateElements(i_array46);
    int i50 = intArrayUtil0.threeSumClosest(i_array46, 100);
    util.IntArrayUtil intArrayUtil51 = new util.IntArrayUtil();
    util.IntArrayUtil intArrayUtil53 = new util.IntArrayUtil();
    int[] i_array54 = new int[] {  };
    int i56 = intArrayUtil53.findKthLargestViaQuickSort(i_array54, (-1));
    int[] i_array60 = new int[] { '4', (byte)0 };
    int i61 = intArrayUtil53.findMinSubArrayLen(0, i_array60);
    util.IntArrayUtil intArrayUtil62 = new util.IntArrayUtil();
    int[] i_array63 = new int[] {  };
    int i65 = intArrayUtil62.findKthLargestViaQuickSort(i_array63, (-1));
    int[] i_array69 = new int[] { '4', (byte)0 };
    int i70 = intArrayUtil62.findMinSubArrayLen(0, i_array69);
    util.IntArrayUtil intArrayUtil71 = new util.IntArrayUtil();
    int[] i_array72 = new int[] {  };
    int i74 = intArrayUtil71.findKthLargestViaQuickSort(i_array72, (-1));
    int[] i_array78 = new int[] { '4', (byte)0 };
    int i79 = intArrayUtil71.findMinSubArrayLen(0, i_array78);
    int i80 = intArrayUtil62.removeDuplicateElements(i_array78);
    util.IntArrayUtil intArrayUtil82 = new util.IntArrayUtil();
    int[] i_array83 = new int[] {  };
    int i85 = intArrayUtil82.findKthLargestViaQuickSort(i_array83, (-1));
    int[] i_array89 = new int[] { '4', (byte)0 };
    int i90 = intArrayUtil82.findMinSubArrayLen(0, i_array89);
    int i91 = intArrayUtil62.findMinSubArrayLen((int)(short)0, i_array89);
    int i92 = intArrayUtil53.removeDuplicateElements(i_array89);
    int i93 = intArrayUtil51.findMinSubArrayLen(0, i_array89);
    int i94 = intArrayUtil0.findMinViaRecursion(i_array89);
    int[] i_array95 = null;
    intArrayUtil0.getNextPermutationNumber(i_array95);
    int[] i_array97 = null;
    intArrayUtil0.getNextPermutationNumber(i_array97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i90 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i91 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i92 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i93 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i94 == 0);

  }

  @Test
  public void test86() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test86"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    int[] i_array9 = null;
    intArrayUtil0.getNextPermutationNumber(i_array9);
    int[] i_array11 = null;
    int i12 = intArrayUtil0.removeDuplicateElements(i_array11);
    int[] i_array13 = null;
    int i15 = intArrayUtil0.findKthLargestViaQuickSort(i_array13, 2);
    util.IntArrayUtil intArrayUtil16 = new util.IntArrayUtil();
    int[] i_array17 = new int[] {  };
    int i19 = intArrayUtil16.findKthLargestViaQuickSort(i_array17, (-1));
    int[] i_array23 = new int[] { '4', (byte)0 };
    int i24 = intArrayUtil16.findMinSubArrayLen(0, i_array23);
    util.IntArrayUtil intArrayUtil26 = new util.IntArrayUtil();
    int[] i_array27 = new int[] {  };
    int i29 = intArrayUtil26.findKthLargestViaQuickSort(i_array27, (-1));
    int i30 = intArrayUtil16.findMinSubArrayLen((int)(byte)-1, i_array27);
    util.IntArrayUtil intArrayUtil31 = new util.IntArrayUtil();
    int[] i_array32 = new int[] {  };
    int i34 = intArrayUtil31.findKthLargestViaQuickSort(i_array32, (-1));
    int[] i_array38 = new int[] { '4', (byte)0 };
    int i39 = intArrayUtil31.findMinSubArrayLen(0, i_array38);
    util.IntArrayUtil intArrayUtil40 = new util.IntArrayUtil();
    int[] i_array41 = new int[] {  };
    int i43 = intArrayUtil40.findKthLargestViaQuickSort(i_array41, (-1));
    int[] i_array47 = new int[] { '4', (byte)0 };
    int i48 = intArrayUtil40.findMinSubArrayLen(0, i_array47);
    int i50 = intArrayUtil31.threeSumClosest(i_array47, (int)(short)100);
    int i52 = intArrayUtil16.threeSumClosest(i_array47, 4);
    util.IntArrayUtil intArrayUtil53 = new util.IntArrayUtil();
    int[] i_array54 = new int[] {  };
    int i56 = intArrayUtil53.findKthLargestViaQuickSort(i_array54, (-1));
    util.IntArrayUtil intArrayUtil57 = new util.IntArrayUtil();
    int[] i_array58 = new int[] {  };
    int i60 = intArrayUtil57.findKthLargestViaQuickSort(i_array58, (-1));
    int[] i_array64 = new int[] { '4', (byte)0 };
    int i65 = intArrayUtil57.findMinSubArrayLen(0, i_array64);
    util.IntArrayUtil intArrayUtil66 = new util.IntArrayUtil();
    int[] i_array67 = new int[] {  };
    int i69 = intArrayUtil66.findKthLargestViaQuickSort(i_array67, (-1));
    int[] i_array73 = new int[] { '4', (byte)0 };
    int i74 = intArrayUtil66.findMinSubArrayLen(0, i_array73);
    int i76 = intArrayUtil57.threeSumClosest(i_array73, (int)(short)100);
    int i77 = intArrayUtil53.removeDuplicateElements(i_array73);
    int i79 = intArrayUtil16.findKthLargestViaQuickSort(i_array73, (-3));
    int i80 = intArrayUtil0.findMinViaRecursion(i_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 0);

  }

  @Test
  public void test87() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test87"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil9 = new util.IntArrayUtil();
    int[] i_array10 = new int[] {  };
    int i12 = intArrayUtil9.findKthLargestViaQuickSort(i_array10, (-1));
    int[] i_array16 = new int[] { '4', (byte)0 };
    int i17 = intArrayUtil9.findMinSubArrayLen(0, i_array16);
    int i18 = intArrayUtil0.removeDuplicateElements(i_array16);
    util.IntArrayUtil intArrayUtil20 = new util.IntArrayUtil();
    int[] i_array21 = new int[] {  };
    int i23 = intArrayUtil20.findKthLargestViaQuickSort(i_array21, (-1));
    int[] i_array27 = new int[] { '4', (byte)0 };
    int i28 = intArrayUtil20.findMinSubArrayLen(0, i_array27);
    int i29 = intArrayUtil0.findMinSubArrayLen((int)(short)0, i_array27);
    util.IntArrayUtil intArrayUtil30 = new util.IntArrayUtil();
    int[] i_array31 = new int[] {  };
    int i33 = intArrayUtil30.findKthLargestViaQuickSort(i_array31, (-1));
    int i35 = intArrayUtil0.threeSumClosest(i_array31, 1);
    int[] i_array36 = null;
    int i37 = intArrayUtil0.findMinViaIteration(i_array36);
    util.IntArrayUtil intArrayUtil38 = new util.IntArrayUtil();
    int[] i_array39 = new int[] {  };
    int i41 = intArrayUtil38.findKthLargestViaQuickSort(i_array39, (-1));
    int[] i_array45 = new int[] { '4', (byte)0 };
    int i46 = intArrayUtil38.findMinSubArrayLen(0, i_array45);
    util.IntArrayUtil intArrayUtil47 = new util.IntArrayUtil();
    int[] i_array48 = new int[] {  };
    int i50 = intArrayUtil47.findKthLargestViaQuickSort(i_array48, (-1));
    int[] i_array54 = new int[] { '4', (byte)0 };
    int i55 = intArrayUtil47.findMinSubArrayLen(0, i_array54);
    util.IntArrayUtil intArrayUtil56 = new util.IntArrayUtil();
    int[] i_array57 = new int[] {  };
    int i59 = intArrayUtil56.findKthLargestViaQuickSort(i_array57, (-1));
    int[] i_array63 = new int[] { '4', (byte)0 };
    int i64 = intArrayUtil56.findMinSubArrayLen(0, i_array63);
    int i65 = intArrayUtil47.removeDuplicateElements(i_array63);
    util.IntArrayUtil intArrayUtil67 = new util.IntArrayUtil();
    int[] i_array68 = new int[] {  };
    int i70 = intArrayUtil67.findKthLargestViaQuickSort(i_array68, (-1));
    int[] i_array74 = new int[] { '4', (byte)0 };
    int i75 = intArrayUtil67.findMinSubArrayLen(0, i_array74);
    int i76 = intArrayUtil47.findMinSubArrayLen((int)(short)0, i_array74);
    int i77 = intArrayUtil38.removeDuplicateElements(i_array74);
    int i78 = intArrayUtil0.removeDuplicateElements(i_array74);
    int[] i_array79 = null;
    int i81 = intArrayUtil0.findKthLargestViaQuickSort(i_array79, 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 0);

  }

  @Test
  public void test88() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test88"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil9 = new util.IntArrayUtil();
    int[] i_array10 = new int[] {  };
    int i12 = intArrayUtil9.findKthLargestViaQuickSort(i_array10, (-1));
    int[] i_array16 = new int[] { '4', (byte)0 };
    int i17 = intArrayUtil9.findMinSubArrayLen(0, i_array16);
    util.IntArrayUtil intArrayUtil18 = new util.IntArrayUtil();
    int[] i_array19 = new int[] {  };
    int i21 = intArrayUtil18.findKthLargestViaQuickSort(i_array19, (-1));
    int[] i_array25 = new int[] { '4', (byte)0 };
    int i26 = intArrayUtil18.findMinSubArrayLen(0, i_array25);
    int i27 = intArrayUtil9.removeDuplicateElements(i_array25);
    util.IntArrayUtil intArrayUtil29 = new util.IntArrayUtil();
    int[] i_array30 = new int[] {  };
    int i32 = intArrayUtil29.findKthLargestViaQuickSort(i_array30, (-1));
    int[] i_array36 = new int[] { '4', (byte)0 };
    int i37 = intArrayUtil29.findMinSubArrayLen(0, i_array36);
    int i38 = intArrayUtil9.findMinSubArrayLen((int)(short)0, i_array36);
    int i39 = intArrayUtil0.findMinViaIteration(i_array36);
    util.IntArrayUtil intArrayUtil41 = new util.IntArrayUtil();
    int[] i_array42 = new int[] {  };
    int i44 = intArrayUtil41.findKthLargestViaQuickSort(i_array42, (-1));
    int[] i_array48 = new int[] { '4', (byte)0 };
    int i49 = intArrayUtil41.findMinSubArrayLen(0, i_array48);
    int i50 = intArrayUtil0.findMinSubArrayLen(5, i_array48);
    util.IntArrayUtil intArrayUtil51 = new util.IntArrayUtil();
    int[] i_array52 = new int[] {  };
    int i54 = intArrayUtil51.findKthLargestViaQuickSort(i_array52, (-1));
    int[] i_array58 = new int[] { '4', (byte)0 };
    int i59 = intArrayUtil51.findMinSubArrayLen(0, i_array58);
    util.IntArrayUtil intArrayUtil60 = new util.IntArrayUtil();
    int[] i_array61 = new int[] {  };
    int i63 = intArrayUtil60.findKthLargestViaQuickSort(i_array61, (-1));
    int[] i_array67 = new int[] { '4', (byte)0 };
    int i68 = intArrayUtil60.findMinSubArrayLen(0, i_array67);
    util.IntArrayUtil intArrayUtil69 = new util.IntArrayUtil();
    int[] i_array70 = new int[] {  };
    int i72 = intArrayUtil69.findKthLargestViaQuickSort(i_array70, (-1));
    int[] i_array76 = new int[] { '4', (byte)0 };
    int i77 = intArrayUtil69.findMinSubArrayLen(0, i_array76);
    int i78 = intArrayUtil60.removeDuplicateElements(i_array76);
    util.IntArrayUtil intArrayUtil80 = new util.IntArrayUtil();
    int[] i_array81 = new int[] {  };
    int i83 = intArrayUtil80.findKthLargestViaQuickSort(i_array81, (-1));
    int[] i_array87 = new int[] { '4', (byte)0 };
    int i88 = intArrayUtil80.findMinSubArrayLen(0, i_array87);
    int i89 = intArrayUtil60.findMinSubArrayLen((int)(short)0, i_array87);
    int i90 = intArrayUtil51.findMinViaIteration(i_array87);
    int i91 = intArrayUtil0.findMinViaIteration(i_array87);
    int[] i_array93 = null;
    int i94 = intArrayUtil0.findMinSubArrayLen((int)(short)-1, i_array93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i89 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i90 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i91 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i94 == 0);

  }

  @Test
  public void test89() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test89"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    int[] i_array9 = null;
    intArrayUtil0.getNextPermutationNumber(i_array9);
    int[] i_array11 = null;
    int i12 = intArrayUtil0.removeDuplicateElements(i_array11);
    util.IntArrayUtil intArrayUtil13 = new util.IntArrayUtil();
    int[] i_array14 = new int[] {  };
    int i16 = intArrayUtil13.findKthLargestViaQuickSort(i_array14, (-1));
    int[] i_array20 = new int[] { '4', (byte)0 };
    int i21 = intArrayUtil13.findMinSubArrayLen(0, i_array20);
    util.IntArrayUtil intArrayUtil22 = new util.IntArrayUtil();
    int[] i_array23 = new int[] {  };
    int i25 = intArrayUtil22.findKthLargestViaQuickSort(i_array23, (-1));
    int[] i_array29 = new int[] { '4', (byte)0 };
    int i30 = intArrayUtil22.findMinSubArrayLen(0, i_array29);
    util.IntArrayUtil intArrayUtil32 = new util.IntArrayUtil();
    int[] i_array33 = new int[] {  };
    int i35 = intArrayUtil32.findKthLargestViaQuickSort(i_array33, (-1));
    int i36 = intArrayUtil22.findMinSubArrayLen((int)(byte)-1, i_array33);
    util.IntArrayUtil intArrayUtil37 = new util.IntArrayUtil();
    int[] i_array38 = new int[] {  };
    int i40 = intArrayUtil37.findKthLargestViaQuickSort(i_array38, (-1));
    int[] i_array44 = new int[] { '4', (byte)0 };
    int i45 = intArrayUtil37.findMinSubArrayLen(0, i_array44);
    util.IntArrayUtil intArrayUtil46 = new util.IntArrayUtil();
    int[] i_array47 = new int[] {  };
    int i49 = intArrayUtil46.findKthLargestViaQuickSort(i_array47, (-1));
    int[] i_array53 = new int[] { '4', (byte)0 };
    int i54 = intArrayUtil46.findMinSubArrayLen(0, i_array53);
    int i56 = intArrayUtil37.threeSumClosest(i_array53, (int)(short)100);
    int i58 = intArrayUtil22.threeSumClosest(i_array53, 4);
    util.IntArrayUtil intArrayUtil59 = new util.IntArrayUtil();
    int[] i_array60 = new int[] {  };
    int i62 = intArrayUtil59.findKthLargestViaQuickSort(i_array60, (-1));
    int[] i_array66 = new int[] { '4', (byte)0 };
    int i67 = intArrayUtil59.findMinSubArrayLen(0, i_array66);
    util.IntArrayUtil intArrayUtil68 = new util.IntArrayUtil();
    int[] i_array69 = new int[] {  };
    int i71 = intArrayUtil68.findKthLargestViaQuickSort(i_array69, (-1));
    int[] i_array75 = new int[] { '4', (byte)0 };
    int i76 = intArrayUtil68.findMinSubArrayLen(0, i_array75);
    int i78 = intArrayUtil59.threeSumClosest(i_array75, (int)(short)100);
    int i79 = intArrayUtil22.findMinViaRecursion(i_array75);
    int i80 = intArrayUtil13.findMinViaRecursion(i_array75);
    int i81 = intArrayUtil0.removeDuplicateElements(i_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 2);

  }

  @Test
  public void test90() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test90"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil10 = new util.IntArrayUtil();
    int[] i_array11 = new int[] {  };
    int i13 = intArrayUtil10.findKthLargestViaQuickSort(i_array11, (-1));
    int i14 = intArrayUtil0.findMinSubArrayLen((int)(byte)-1, i_array11);
    util.IntArrayUtil intArrayUtil15 = new util.IntArrayUtil();
    int[] i_array16 = new int[] {  };
    int i18 = intArrayUtil15.findKthLargestViaQuickSort(i_array16, (-1));
    int[] i_array22 = new int[] { '4', (byte)0 };
    int i23 = intArrayUtil15.findMinSubArrayLen(0, i_array22);
    util.IntArrayUtil intArrayUtil24 = new util.IntArrayUtil();
    int[] i_array25 = new int[] {  };
    int i27 = intArrayUtil24.findKthLargestViaQuickSort(i_array25, (-1));
    int[] i_array31 = new int[] { '4', (byte)0 };
    int i32 = intArrayUtil24.findMinSubArrayLen(0, i_array31);
    int i34 = intArrayUtil15.threeSumClosest(i_array31, (int)(short)100);
    int i36 = intArrayUtil0.threeSumClosest(i_array31, 4);
    util.IntArrayUtil intArrayUtil37 = new util.IntArrayUtil();
    int[] i_array38 = new int[] {  };
    int i40 = intArrayUtil37.findKthLargestViaQuickSort(i_array38, (-1));
    int[] i_array44 = new int[] { '4', (byte)0 };
    int i45 = intArrayUtil37.findMinSubArrayLen(0, i_array44);
    int[] i_array46 = null;
    intArrayUtil37.getNextPermutationNumber(i_array46);
    util.IntArrayUtil intArrayUtil48 = new util.IntArrayUtil();
    int[] i_array49 = new int[] {  };
    int i51 = intArrayUtil48.findKthLargestViaQuickSort(i_array49, (-1));
    int[] i_array55 = new int[] { '4', (byte)0 };
    int i56 = intArrayUtil48.findMinSubArrayLen(0, i_array55);
    util.IntArrayUtil intArrayUtil57 = new util.IntArrayUtil();
    int[] i_array58 = new int[] {  };
    int i60 = intArrayUtil57.findKthLargestViaQuickSort(i_array58, (-1));
    int[] i_array64 = new int[] { '4', (byte)0 };
    int i65 = intArrayUtil57.findMinSubArrayLen(0, i_array64);
    int i66 = intArrayUtil48.removeDuplicateElements(i_array64);
    util.IntArrayUtil intArrayUtil68 = new util.IntArrayUtil();
    int[] i_array69 = new int[] {  };
    int i71 = intArrayUtil68.findKthLargestViaQuickSort(i_array69, (-1));
    int[] i_array75 = new int[] { '4', (byte)0 };
    int i76 = intArrayUtil68.findMinSubArrayLen(0, i_array75);
    int i77 = intArrayUtil48.findMinSubArrayLen((int)(short)0, i_array75);
    util.IntArrayUtil intArrayUtil78 = new util.IntArrayUtil();
    int[] i_array79 = new int[] {  };
    int i81 = intArrayUtil78.findKthLargestViaQuickSort(i_array79, (-1));
    intArrayUtil48.getNextPermutationNumber(i_array79);
    int i84 = intArrayUtil37.threeSumClosest(i_array79, (-7));
    int i85 = intArrayUtil0.findMinViaIteration(i_array79);
    int[] i_array86 = null;
    intArrayUtil0.getNextPermutationNumber(i_array86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i84 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == (-1));

  }

  @Test
  public void test91() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test91"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    util.IntArrayUtil intArrayUtil4 = new util.IntArrayUtil();
    int[] i_array5 = new int[] {  };
    int i7 = intArrayUtil4.findKthLargestViaQuickSort(i_array5, (-1));
    int[] i_array11 = new int[] { '4', (byte)0 };
    int i12 = intArrayUtil4.findMinSubArrayLen(0, i_array11);
    util.IntArrayUtil intArrayUtil13 = new util.IntArrayUtil();
    int[] i_array14 = new int[] {  };
    int i16 = intArrayUtil13.findKthLargestViaQuickSort(i_array14, (-1));
    int[] i_array20 = new int[] { '4', (byte)0 };
    int i21 = intArrayUtil13.findMinSubArrayLen(0, i_array20);
    int i23 = intArrayUtil4.threeSumClosest(i_array20, (int)(short)100);
    int i24 = intArrayUtil0.removeDuplicateElements(i_array20);
    int[] i_array26 = null;
    int i27 = intArrayUtil0.findMinSubArrayLen((int)' ', i_array26);
    util.IntArrayUtil intArrayUtil28 = new util.IntArrayUtil();
    int[] i_array29 = new int[] {  };
    int i31 = intArrayUtil28.findKthLargestViaQuickSort(i_array29, (-1));
    int[] i_array35 = new int[] { '4', (byte)0 };
    int i36 = intArrayUtil28.findMinSubArrayLen(0, i_array35);
    util.IntArrayUtil intArrayUtil37 = new util.IntArrayUtil();
    int[] i_array38 = new int[] {  };
    int i40 = intArrayUtil37.findKthLargestViaQuickSort(i_array38, (-1));
    int[] i_array44 = new int[] { '4', (byte)0 };
    int i45 = intArrayUtil37.findMinSubArrayLen(0, i_array44);
    int i46 = intArrayUtil28.removeDuplicateElements(i_array44);
    util.IntArrayUtil intArrayUtil48 = new util.IntArrayUtil();
    int[] i_array49 = new int[] {  };
    int i51 = intArrayUtil48.findKthLargestViaQuickSort(i_array49, (-1));
    int[] i_array55 = new int[] { '4', (byte)0 };
    int i56 = intArrayUtil48.findMinSubArrayLen(0, i_array55);
    int i57 = intArrayUtil28.findMinSubArrayLen((int)(short)0, i_array55);
    util.IntArrayUtil intArrayUtil59 = new util.IntArrayUtil();
    int[] i_array60 = new int[] {  };
    int i62 = intArrayUtil59.findKthLargestViaQuickSort(i_array60, (-1));
    int i63 = intArrayUtil28.findMinSubArrayLen(1, i_array60);
    int i65 = intArrayUtil0.threeSumClosest(i_array60, (-2));
    util.IntArrayUtil intArrayUtil66 = new util.IntArrayUtil();
    int[] i_array67 = new int[] {  };
    int i69 = intArrayUtil66.findKthLargestViaQuickSort(i_array67, (-1));
    int[] i_array73 = new int[] { '4', (byte)0 };
    int i74 = intArrayUtil66.findMinSubArrayLen(0, i_array73);
    util.IntArrayUtil intArrayUtil75 = new util.IntArrayUtil();
    int[] i_array76 = new int[] {  };
    int i78 = intArrayUtil75.findKthLargestViaQuickSort(i_array76, (-1));
    int[] i_array82 = new int[] { '4', (byte)0 };
    int i83 = intArrayUtil75.findMinSubArrayLen(0, i_array82);
    int i84 = intArrayUtil66.removeDuplicateElements(i_array82);
    util.IntArrayUtil intArrayUtil86 = new util.IntArrayUtil();
    int[] i_array87 = new int[] {  };
    int i89 = intArrayUtil86.findKthLargestViaQuickSort(i_array87, (-1));
    int[] i_array93 = new int[] { '4', (byte)0 };
    int i94 = intArrayUtil86.findMinSubArrayLen(0, i_array93);
    int i95 = intArrayUtil66.findMinSubArrayLen((int)(short)0, i_array93);
    intArrayUtil0.getNextPermutationNumber(i_array93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i84 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i89 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i94 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i95 == 1);

  }

}
