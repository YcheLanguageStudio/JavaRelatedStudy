
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
    util.IntArrayUtil intArrayUtil5 = new util.IntArrayUtil();
    int[] i_array6 = new int[] {  };
    int i8 = intArrayUtil5.findKthLargestViaQuickSort(i_array6, (-1));
    util.IntArrayUtil intArrayUtil9 = new util.IntArrayUtil();
    int[] i_array10 = new int[] {  };
    int i12 = intArrayUtil9.findKthLargestViaQuickSort(i_array10, (-1));
    int[] i_array16 = new int[] { '4', (byte)0 };
    int i17 = intArrayUtil9.findMinSubArrayLen(0, i_array16);
    util.IntArrayUtil intArrayUtil19 = new util.IntArrayUtil();
    int[] i_array20 = new int[] {  };
    int i22 = intArrayUtil19.findKthLargestViaQuickSort(i_array20, (-1));
    int i23 = intArrayUtil9.findMinSubArrayLen((int)(byte)-1, i_array20);
    int i24 = intArrayUtil5.findMinViaIteration(i_array20);
    util.IntArrayUtil intArrayUtil25 = new util.IntArrayUtil();
    int[] i_array26 = new int[] {  };
    int i28 = intArrayUtil25.findKthLargestViaQuickSort(i_array26, (-1));
    int[] i_array32 = new int[] { '4', (byte)0 };
    int i33 = intArrayUtil25.findMinSubArrayLen(0, i_array32);
    util.IntArrayUtil intArrayUtil34 = new util.IntArrayUtil();
    int[] i_array35 = new int[] {  };
    int i37 = intArrayUtil34.findKthLargestViaQuickSort(i_array35, (-1));
    int[] i_array41 = new int[] { '4', (byte)0 };
    int i42 = intArrayUtil34.findMinSubArrayLen(0, i_array41);
    int i43 = intArrayUtil25.removeDuplicateElements(i_array41);
    util.IntArrayUtil intArrayUtil45 = new util.IntArrayUtil();
    int[] i_array46 = new int[] {  };
    int i48 = intArrayUtil45.findKthLargestViaQuickSort(i_array46, (-1));
    int[] i_array52 = new int[] { '4', (byte)0 };
    int i53 = intArrayUtil45.findMinSubArrayLen(0, i_array52);
    int i54 = intArrayUtil25.findMinSubArrayLen((int)'#', i_array52);
    int[] i_array58 = new int[] { 2, (short)100, 1 };
    int i60 = intArrayUtil25.findKthLargestViaQuickSort(i_array58, 2);
    int[] i_array61 = null;
    int i62 = intArrayUtil25.findMinViaIteration(i_array61);
    util.IntArrayUtil intArrayUtil63 = new util.IntArrayUtil();
    int[] i_array64 = new int[] {  };
    int i66 = intArrayUtil63.findKthLargestViaQuickSort(i_array64, (-1));
    util.IntArrayUtil intArrayUtil67 = new util.IntArrayUtil();
    int[] i_array68 = new int[] {  };
    int i70 = intArrayUtil67.findKthLargestViaQuickSort(i_array68, (-1));
    int[] i_array74 = new int[] { '4', (byte)0 };
    int i75 = intArrayUtil67.findMinSubArrayLen(0, i_array74);
    util.IntArrayUtil intArrayUtil77 = new util.IntArrayUtil();
    int[] i_array78 = new int[] {  };
    int i80 = intArrayUtil77.findKthLargestViaQuickSort(i_array78, (-1));
    int i81 = intArrayUtil67.findMinSubArrayLen((int)(byte)-1, i_array78);
    int i83 = intArrayUtil63.threeSumClosest(i_array78, (int)(byte)1);
    int i85 = intArrayUtil25.threeSumClosest(i_array78, 0);
    int i87 = intArrayUtil5.threeSumClosest(i_array78, (int)(byte)1);
    int i88 = intArrayUtil0.findMinSubArrayLen(0, i_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
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
    org.junit.Assert.assertTrue(i43 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == (-1));
    
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
    org.junit.Assert.assertNotNull(i_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == 0);

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
    int i38 = intArrayUtil9.findMinSubArrayLen((int)'#', i_array36);
    util.IntArrayUtil intArrayUtil39 = new util.IntArrayUtil();
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
    int i78 = intArrayUtil49.findMinSubArrayLen((int)'#', i_array76);
    int i79 = intArrayUtil40.findMinViaIteration(i_array76);
    int i80 = intArrayUtil39.removeDuplicateElements(i_array76);
    int i82 = intArrayUtil9.threeSumClosest(i_array76, 1);
    int i83 = intArrayUtil0.removeDuplicateElements(i_array76);
    int[] i_array84 = null;
    int i85 = intArrayUtil0.findMinViaIteration(i_array84);
    
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
    org.junit.Assert.assertTrue(i79 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == (-1));

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test03"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
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
    util.IntArrayUtil intArrayUtil28 = new util.IntArrayUtil();
    int[] i_array29 = new int[] {  };
    int i31 = intArrayUtil28.findKthLargestViaQuickSort(i_array29, (-1));
    int[] i_array35 = new int[] { '4', (byte)0 };
    int i36 = intArrayUtil28.findMinSubArrayLen(0, i_array35);
    int i37 = intArrayUtil19.removeDuplicateElements(i_array35);
    util.IntArrayUtil intArrayUtil39 = new util.IntArrayUtil();
    int[] i_array40 = new int[] {  };
    int i42 = intArrayUtil39.findKthLargestViaQuickSort(i_array40, (-1));
    int[] i_array46 = new int[] { '4', (byte)0 };
    int i47 = intArrayUtil39.findMinSubArrayLen(0, i_array46);
    int i48 = intArrayUtil19.findMinSubArrayLen((int)'#', i_array46);
    int i49 = intArrayUtil10.findMinViaIteration(i_array46);
    util.IntArrayUtil intArrayUtil50 = new util.IntArrayUtil();
    int[] i_array51 = new int[] {  };
    int i53 = intArrayUtil50.findKthLargestViaQuickSort(i_array51, (-1));
    int i55 = intArrayUtil10.threeSumClosest(i_array51, (int)(byte)10);
    util.IntArrayUtil intArrayUtil56 = new util.IntArrayUtil();
    int[] i_array57 = new int[] {  };
    int i59 = intArrayUtil56.findKthLargestViaQuickSort(i_array57, (-1));
    int[] i_array63 = new int[] { '4', (byte)0 };
    int i64 = intArrayUtil56.findMinSubArrayLen(0, i_array63);
    int i65 = intArrayUtil10.findMinViaRecursion(i_array63);
    int i66 = intArrayUtil0.findMinSubArrayLen((int)(byte)1, i_array63);
    int[] i_array67 = null;
    int i68 = intArrayUtil0.removeDuplicateElements(i_array67);
    int[] i_array74 = new int[] { 10, (byte)0, (byte)1, ' ', 3 };
    int i75 = intArrayUtil0.removeDuplicateElements(i_array74);
    
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
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
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
    org.junit.Assert.assertTrue(i65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 5);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test04"); }


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
    int i20 = intArrayUtil0.threeSumClosest(i_array15, (int)(byte)1);
    util.IntArrayUtil intArrayUtil21 = new util.IntArrayUtil();
    int[] i_array22 = new int[] {  };
    int i24 = intArrayUtil21.findKthLargestViaQuickSort(i_array22, (-1));
    util.IntArrayUtil intArrayUtil25 = new util.IntArrayUtil();
    int[] i_array26 = new int[] {  };
    int i28 = intArrayUtil25.findKthLargestViaQuickSort(i_array26, (-1));
    int[] i_array32 = new int[] { '4', (byte)0 };
    int i33 = intArrayUtil25.findMinSubArrayLen(0, i_array32);
    util.IntArrayUtil intArrayUtil35 = new util.IntArrayUtil();
    int[] i_array36 = new int[] {  };
    int i38 = intArrayUtil35.findKthLargestViaQuickSort(i_array36, (-1));
    int i39 = intArrayUtil25.findMinSubArrayLen((int)(byte)-1, i_array36);
    int i41 = intArrayUtil21.threeSumClosest(i_array36, (int)(byte)1);
    intArrayUtil0.getNextPermutationNumber(i_array36);
    util.IntArrayUtil intArrayUtil43 = new util.IntArrayUtil();
    int[] i_array44 = new int[] {  };
    int i46 = intArrayUtil43.findKthLargestViaQuickSort(i_array44, (-1));
    int[] i_array50 = new int[] { '4', (byte)0 };
    int i51 = intArrayUtil43.findMinSubArrayLen(0, i_array50);
    util.IntArrayUtil intArrayUtil52 = new util.IntArrayUtil();
    int[] i_array53 = new int[] {  };
    int i55 = intArrayUtil52.findKthLargestViaQuickSort(i_array53, (-1));
    int i56 = intArrayUtil43.findMinViaIteration(i_array53);
    int i57 = intArrayUtil0.findMinViaIteration(i_array53);
    int[] i_array59 = new int[] { 10 };
    int i60 = intArrayUtil0.removeDuplicateElements(i_array59);
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
    int i79 = intArrayUtil61.removeDuplicateElements(i_array77);
    int i81 = intArrayUtil0.threeSumClosest(i_array77, 3);
    
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
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
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
    org.junit.Assert.assertTrue(i56 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == (-1));
    
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
    org.junit.Assert.assertNotNull(i_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 0);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test05"); }


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
    int i29 = intArrayUtil0.findMinSubArrayLen((int)'#', i_array27);
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
    int i70 = intArrayUtil41.findMinSubArrayLen((int)'#', i_array68);
    int i71 = intArrayUtil32.removeDuplicateElements(i_array68);
    int i72 = intArrayUtil30.findMinSubArrayLen((int)(byte)0, i_array68);
    util.IntArrayUtil intArrayUtil73 = new util.IntArrayUtil();
    int[] i_array74 = new int[] {  };
    int i76 = intArrayUtil73.findKthLargestViaQuickSort(i_array74, (-1));
    int[] i_array80 = new int[] { '4', (byte)0 };
    int i81 = intArrayUtil73.findMinSubArrayLen(0, i_array80);
    int i82 = intArrayUtil30.findMinViaRecursion(i_array80);
    int i84 = intArrayUtil0.findKthLargestViaQuickSort(i_array80, (-1));
    util.IntArrayUtil intArrayUtil85 = new util.IntArrayUtil();
    int[] i_array86 = new int[] {  };
    int i88 = intArrayUtil85.findKthLargestViaQuickSort(i_array86, (-1));
    int[] i_array92 = new int[] { '4', (byte)0 };
    int i93 = intArrayUtil85.findMinSubArrayLen(0, i_array92);
    int i95 = intArrayUtil0.threeSumClosest(i_array92, 100);
    int[] i_array96 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i98 = intArrayUtil0.threeSumClosest(i_array96, 10);
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
    org.junit.Assert.assertTrue(i71 == 2);
    
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
    org.junit.Assert.assertTrue(i82 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i84 == 0);
    
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

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test06"); }


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
    int i19 = intArrayUtil0.findMinViaIteration(i_array15);
    int[] i_array20 = null;
    intArrayUtil0.getNextPermutationNumber(i_array20);
    util.IntArrayUtil intArrayUtil22 = new util.IntArrayUtil();
    int[] i_array23 = new int[] {  };
    int i25 = intArrayUtil22.findKthLargestViaQuickSort(i_array23, (-1));
    int[] i_array29 = new int[] { '4', (byte)0 };
    int i30 = intArrayUtil22.findMinSubArrayLen(0, i_array29);
    util.IntArrayUtil intArrayUtil32 = new util.IntArrayUtil();
    int[] i_array33 = new int[] {  };
    int i35 = intArrayUtil32.findKthLargestViaQuickSort(i_array33, (-1));
    int i36 = intArrayUtil22.findMinSubArrayLen((int)(byte)-1, i_array33);
    util.IntArrayUtil intArrayUtil38 = new util.IntArrayUtil();
    int[] i_array39 = new int[] {  };
    int i41 = intArrayUtil38.findKthLargestViaQuickSort(i_array39, (-1));
    int[] i_array45 = new int[] { '4', (byte)0 };
    int i46 = intArrayUtil38.findMinSubArrayLen(0, i_array45);
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
    int i67 = intArrayUtil38.findMinSubArrayLen((-1), i_array64);
    int i68 = intArrayUtil22.findMinSubArrayLen((int)(byte)10, i_array64);
    intArrayUtil0.getNextPermutationNumber(i_array64);
    int[] i_array70 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i71 = intArrayUtil0.findMinViaRecursion(i_array70);
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
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-1));
    
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
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 1);
    
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
    org.junit.Assert.assertTrue(i67 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 1);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test07"); }


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
    int i39 = intArrayUtil10.findMinSubArrayLen((int)'#', i_array37);
    int i40 = intArrayUtil1.removeDuplicateElements(i_array37);
    int i42 = intArrayUtil0.threeSumClosest(i_array37, 10);
    int[] i_array43 = null;
    intArrayUtil0.getNextPermutationNumber(i_array43);
    util.IntArrayUtil intArrayUtil45 = new util.IntArrayUtil();
    int[] i_array46 = new int[] {  };
    int i48 = intArrayUtil45.findKthLargestViaQuickSort(i_array46, (-1));
    int[] i_array52 = new int[] { '4', (byte)0 };
    int i53 = intArrayUtil45.findMinSubArrayLen(0, i_array52);
    util.IntArrayUtil intArrayUtil55 = new util.IntArrayUtil();
    int[] i_array56 = new int[] {  };
    int i58 = intArrayUtil55.findKthLargestViaQuickSort(i_array56, (-1));
    int i59 = intArrayUtil45.findMinSubArrayLen((int)(byte)-1, i_array56);
    int[] i_array60 = null;
    int i62 = intArrayUtil45.findKthLargestViaQuickSort(i_array60, (int)(short)-1);
    int[] i_array68 = new int[] { 1, 6, (byte)0, 1 };
    int i69 = intArrayUtil45.findMinSubArrayLen((int)(short)0, i_array68);
    int i71 = intArrayUtil0.threeSumClosest(i_array68, (int)(short)10);
    
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
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);

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
    int[] i_array22 = new int[] { '4', (byte)0 };
    int i23 = intArrayUtil15.findMinSubArrayLen(0, i_array22);
    util.IntArrayUtil intArrayUtil25 = new util.IntArrayUtil();
    int[] i_array26 = new int[] {  };
    int i28 = intArrayUtil25.findKthLargestViaQuickSort(i_array26, (-1));
    int i29 = intArrayUtil15.findMinSubArrayLen((int)(byte)-1, i_array26);
    int i31 = intArrayUtil0.threeSumClosest(i_array26, (int)(short)1);
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
    int i52 = intArrayUtil0.threeSumClosest(i_array48, 2);
    int[] i_array54 = null;
    int i55 = intArrayUtil0.findMinSubArrayLen((int)(short)10, i_array54);
    int[] i_array56 = null;
    int i58 = intArrayUtil0.findKthLargestViaQuickSort(i_array56, 10);
    
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
    org.junit.Assert.assertTrue(i31 == 0);
    
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
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 0);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test09"); }


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
    int i39 = intArrayUtil10.findMinSubArrayLen((int)'#', i_array37);
    int i40 = intArrayUtil1.findMinViaIteration(i_array37);
    intArrayUtil0.getNextPermutationNumber(i_array37);
    int[] i_array42 = null;
    intArrayUtil0.getNextPermutationNumber(i_array42);
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
    int i74 = intArrayUtil45.findMinSubArrayLen((int)'#', i_array72);
    util.IntArrayUtil intArrayUtil75 = new util.IntArrayUtil();
    int[] i_array76 = new int[] {  };
    int i78 = intArrayUtil75.findKthLargestViaQuickSort(i_array76, (-1));
    int[] i_array82 = new int[] { '4', (byte)0 };
    int i83 = intArrayUtil75.findMinSubArrayLen(0, i_array82);
    util.IntArrayUtil intArrayUtil84 = new util.IntArrayUtil();
    int[] i_array85 = new int[] {  };
    int i87 = intArrayUtil84.findKthLargestViaQuickSort(i_array85, (-1));
    int[] i_array91 = new int[] { '4', (byte)0 };
    int i92 = intArrayUtil84.findMinSubArrayLen(0, i_array91);
    int i93 = intArrayUtil75.removeDuplicateElements(i_array91);
    int i95 = intArrayUtil45.threeSumClosest(i_array91, (int)(byte)-1);
    int i96 = intArrayUtil0.findMinSubArrayLen((int)(byte)10, i_array91);
    
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
    org.junit.Assert.assertTrue(i40 == 0);
    
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
    org.junit.Assert.assertNotNull(i_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i92 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i93 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i95 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i96 == 1);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test10"); }


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
    int i20 = intArrayUtil0.threeSumClosest(i_array15, (int)(byte)1);
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
    int i40 = intArrayUtil21.threeSumClosest(i_array37, (int)(byte)0);
    int[] i_array41 = null;
    intArrayUtil21.getNextPermutationNumber(i_array41);
    util.IntArrayUtil intArrayUtil43 = new util.IntArrayUtil();
    int[] i_array44 = new int[] {  };
    int i46 = intArrayUtil43.findKthLargestViaQuickSort(i_array44, (-1));
    int[] i_array50 = new int[] { '4', (byte)0 };
    int i51 = intArrayUtil43.findMinSubArrayLen(0, i_array50);
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
    util.IntArrayUtil intArrayUtil73 = new util.IntArrayUtil();
    int[] i_array74 = new int[] {  };
    int i76 = intArrayUtil73.findKthLargestViaQuickSort(i_array74, (-1));
    int[] i_array80 = new int[] { '4', (byte)0 };
    int i81 = intArrayUtil73.findMinSubArrayLen(0, i_array80);
    int i82 = intArrayUtil53.findMinSubArrayLen((int)'#', i_array80);
    int i83 = intArrayUtil43.findMinSubArrayLen(0, i_array80);
    int i84 = intArrayUtil21.findMinViaRecursion(i_array80);
    int i86 = intArrayUtil0.threeSumClosest(i_array80, 5);
    
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
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 1);
    
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
    org.junit.Assert.assertNotNull(i_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i84 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i86 == 0);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test11"); }


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
    int i20 = intArrayUtil1.threeSumClosest(i_array17, (int)(byte)0);
    intArrayUtil0.getNextPermutationNumber(i_array17);
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
    int i51 = intArrayUtil22.findMinSubArrayLen((int)'#', i_array49);
    int[] i_array55 = new int[] { 2, (short)100, 1 };
    int i57 = intArrayUtil22.findKthLargestViaQuickSort(i_array55, 2);
    int[] i_array61 = new int[] { (short)1, 10, 6 };
    int i62 = intArrayUtil22.findMinViaRecursion(i_array61);
    intArrayUtil0.getNextPermutationNumber(i_array61);
    util.IntArrayUtil intArrayUtil64 = new util.IntArrayUtil();
    int[] i_array65 = new int[] {  };
    int i67 = intArrayUtil64.findKthLargestViaQuickSort(i_array65, (-1));
    util.IntArrayUtil intArrayUtil68 = new util.IntArrayUtil();
    int[] i_array69 = new int[] {  };
    int i71 = intArrayUtil68.findKthLargestViaQuickSort(i_array69, (-1));
    int[] i_array75 = new int[] { '4', (byte)0 };
    int i76 = intArrayUtil68.findMinSubArrayLen(0, i_array75);
    util.IntArrayUtil intArrayUtil78 = new util.IntArrayUtil();
    int[] i_array79 = new int[] {  };
    int i81 = intArrayUtil78.findKthLargestViaQuickSort(i_array79, (-1));
    int i82 = intArrayUtil68.findMinSubArrayLen((int)(byte)-1, i_array79);
    int i83 = intArrayUtil64.findMinViaIteration(i_array79);
    int i84 = intArrayUtil0.removeDuplicateElements(i_array79);
    util.IntArrayUtil intArrayUtil85 = new util.IntArrayUtil();
    int[] i_array86 = new int[] {  };
    int i88 = intArrayUtil85.findKthLargestViaQuickSort(i_array86, (-1));
    int[] i_array92 = new int[] { '4', (byte)0 };
    int i93 = intArrayUtil85.findMinSubArrayLen(0, i_array92);
    int i94 = intArrayUtil0.findMinViaIteration(i_array92);
    
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
    org.junit.Assert.assertNotNull(i_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i84 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i93 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i94 == 0);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test12"); }


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
    int i29 = intArrayUtil0.findMinSubArrayLen((int)'#', i_array27);
    util.IntArrayUtil intArrayUtil30 = new util.IntArrayUtil();
    int[] i_array31 = new int[] {  };
    int i33 = intArrayUtil30.findKthLargestViaQuickSort(i_array31, (-1));
    int[] i_array37 = new int[] { '4', (byte)0 };
    int i38 = intArrayUtil30.findMinSubArrayLen(0, i_array37);
    intArrayUtil0.getNextPermutationNumber(i_array37);
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
    int i58 = intArrayUtil40.removeDuplicateElements(i_array56);
    util.IntArrayUtil intArrayUtil60 = new util.IntArrayUtil();
    int[] i_array61 = new int[] {  };
    int i63 = intArrayUtil60.findKthLargestViaQuickSort(i_array61, (-1));
    int[] i_array67 = new int[] { '4', (byte)0 };
    int i68 = intArrayUtil60.findMinSubArrayLen(0, i_array67);
    int i69 = intArrayUtil40.findMinSubArrayLen((int)'#', i_array67);
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
    int i90 = intArrayUtil40.threeSumClosest(i_array86, (int)(byte)-1);
    intArrayUtil0.getNextPermutationNumber(i_array86);
    int[] i_array93 = null;
    int i94 = intArrayUtil0.findMinSubArrayLen((int)(byte)100, i_array93);
    int[] i_array96 = null;
    int i97 = intArrayUtil0.findMinSubArrayLen(1, i_array96);
    
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
    org.junit.Assert.assertTrue(i58 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 1);
    
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
    org.junit.Assert.assertTrue(i90 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i94 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i97 == 0);

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
    int[] i_array15 = null;
    int i17 = intArrayUtil0.findKthLargestViaQuickSort(i_array15, (int)(short)-1);
    int[] i_array23 = new int[] { 1, 6, (byte)0, 1 };
    int i24 = intArrayUtil0.findMinSubArrayLen((int)(short)0, i_array23);
    int[] i_array25 = null;
    int i26 = intArrayUtil0.removeDuplicateElements(i_array25);
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
    int i57 = intArrayUtil28.findMinSubArrayLen((int)'#', i_array55);
    int[] i_array61 = new int[] { 2, (short)100, 1 };
    int i63 = intArrayUtil28.findKthLargestViaQuickSort(i_array61, 2);
    int[] i_array64 = null;
    int i65 = intArrayUtil28.findMinViaIteration(i_array64);
    util.IntArrayUtil intArrayUtil66 = new util.IntArrayUtil();
    int[] i_array67 = new int[] {  };
    int i69 = intArrayUtil66.findKthLargestViaQuickSort(i_array67, (-1));
    util.IntArrayUtil intArrayUtil70 = new util.IntArrayUtil();
    int[] i_array71 = new int[] {  };
    int i73 = intArrayUtil70.findKthLargestViaQuickSort(i_array71, (-1));
    int[] i_array77 = new int[] { '4', (byte)0 };
    int i78 = intArrayUtil70.findMinSubArrayLen(0, i_array77);
    util.IntArrayUtil intArrayUtil80 = new util.IntArrayUtil();
    int[] i_array81 = new int[] {  };
    int i83 = intArrayUtil80.findKthLargestViaQuickSort(i_array81, (-1));
    int i84 = intArrayUtil70.findMinSubArrayLen((int)(byte)-1, i_array81);
    int i86 = intArrayUtil66.threeSumClosest(i_array81, (int)(byte)1);
    int i88 = intArrayUtil28.threeSumClosest(i_array81, 0);
    int i89 = intArrayUtil0.findMinSubArrayLen((int)(byte)0, i_array81);
    int[] i_array90 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i92 = intArrayUtil0.threeSumClosest(i_array90, 0);
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
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
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
    org.junit.Assert.assertNotNull(i_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i84 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i86 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i89 == 0);

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
    int i18 = intArrayUtil0.removeDuplicateElements(i_array16);
    util.IntArrayUtil intArrayUtil19 = new util.IntArrayUtil();
    int[] i_array20 = new int[] {  };
    int i22 = intArrayUtil19.findKthLargestViaQuickSort(i_array20, (-1));
    int[] i_array26 = new int[] { '4', (byte)0 };
    int i27 = intArrayUtil19.findMinSubArrayLen(0, i_array26);
    util.IntArrayUtil intArrayUtil29 = new util.IntArrayUtil();
    int[] i_array30 = new int[] {  };
    int i32 = intArrayUtil29.findKthLargestViaQuickSort(i_array30, (-1));
    int i33 = intArrayUtil19.findMinSubArrayLen((int)(byte)-1, i_array30);
    util.IntArrayUtil intArrayUtil34 = new util.IntArrayUtil();
    int[] i_array35 = new int[] {  };
    int i37 = intArrayUtil34.findKthLargestViaQuickSort(i_array35, (-1));
    int[] i_array41 = new int[] { '4', (byte)0 };
    int i42 = intArrayUtil34.findMinSubArrayLen(0, i_array41);
    util.IntArrayUtil intArrayUtil43 = new util.IntArrayUtil();
    int[] i_array44 = new int[] {  };
    int i46 = intArrayUtil43.findKthLargestViaQuickSort(i_array44, (-1));
    int[] i_array50 = new int[] { '4', (byte)0 };
    int i51 = intArrayUtil43.findMinSubArrayLen(0, i_array50);
    int i53 = intArrayUtil34.threeSumClosest(i_array50, (int)(byte)0);
    int i55 = intArrayUtil19.threeSumClosest(i_array50, (int)'a');
    int i57 = intArrayUtil0.findKthLargestViaQuickSort(i_array50, (int)(byte)-1);
    util.IntArrayUtil intArrayUtil58 = new util.IntArrayUtil();
    int[] i_array59 = new int[] {  };
    int i61 = intArrayUtil58.findKthLargestViaQuickSort(i_array59, (-1));
    int i62 = intArrayUtil0.removeDuplicateElements(i_array59);
    util.IntArrayUtil intArrayUtil63 = new util.IntArrayUtil();
    int[] i_array64 = new int[] {  };
    int i66 = intArrayUtil63.findKthLargestViaQuickSort(i_array64, (-1));
    int[] i_array70 = new int[] { '4', (byte)0 };
    int i71 = intArrayUtil63.findMinSubArrayLen(0, i_array70);
    util.IntArrayUtil intArrayUtil73 = new util.IntArrayUtil();
    int[] i_array74 = new int[] {  };
    int i76 = intArrayUtil73.findKthLargestViaQuickSort(i_array74, (-1));
    int[] i_array80 = new int[] { '4', (byte)0 };
    int i81 = intArrayUtil73.findMinSubArrayLen(0, i_array80);
    util.IntArrayUtil intArrayUtil82 = new util.IntArrayUtil();
    int[] i_array83 = new int[] {  };
    int i85 = intArrayUtil82.findKthLargestViaQuickSort(i_array83, (-1));
    int[] i_array89 = new int[] { '4', (byte)0 };
    int i90 = intArrayUtil82.findMinSubArrayLen(0, i_array89);
    int i91 = intArrayUtil73.removeDuplicateElements(i_array89);
    int i92 = intArrayUtil63.findMinSubArrayLen((-1), i_array89);
    int i93 = intArrayUtil0.findMinViaIteration(i_array89);
    
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
    org.junit.Assert.assertNotNull(i_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
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
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
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
    org.junit.Assert.assertNotNull(i_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i90 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i91 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i92 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i93 == 0);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test15"); }


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
    int i38 = intArrayUtil9.findMinSubArrayLen((int)'#', i_array36);
    int i39 = intArrayUtil0.removeDuplicateElements(i_array36);
    util.IntArrayUtil intArrayUtil40 = new util.IntArrayUtil();
    int[] i_array41 = new int[] {  };
    int i43 = intArrayUtil40.findKthLargestViaQuickSort(i_array41, (-1));
    int[] i_array47 = new int[] { '4', (byte)0 };
    int i48 = intArrayUtil40.findMinSubArrayLen(0, i_array47);
    util.IntArrayUtil intArrayUtil50 = new util.IntArrayUtil();
    int[] i_array51 = new int[] {  };
    int i53 = intArrayUtil50.findKthLargestViaQuickSort(i_array51, (-1));
    int i54 = intArrayUtil40.findMinSubArrayLen((int)(byte)-1, i_array51);
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
    int i74 = intArrayUtil55.threeSumClosest(i_array71, (int)(byte)0);
    int i76 = intArrayUtil40.threeSumClosest(i_array71, (int)'a');
    int i77 = intArrayUtil0.findMinViaRecursion(i_array71);
    int[] i_array78 = null;
    int i79 = intArrayUtil0.removeDuplicateElements(i_array78);
    
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
    org.junit.Assert.assertNotNull(i_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
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
    org.junit.Assert.assertTrue(i76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 0);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test16"); }


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
    int i39 = intArrayUtil10.findMinSubArrayLen((int)'#', i_array37);
    int i40 = intArrayUtil1.findMinViaIteration(i_array37);
    intArrayUtil0.getNextPermutationNumber(i_array37);
    util.IntArrayUtil intArrayUtil43 = new util.IntArrayUtil();
    int[] i_array44 = new int[] {  };
    int i46 = intArrayUtil43.findKthLargestViaQuickSort(i_array44, (-1));
    int[] i_array50 = new int[] { '4', (byte)0 };
    int i51 = intArrayUtil43.findMinSubArrayLen(0, i_array50);
    util.IntArrayUtil intArrayUtil53 = new util.IntArrayUtil();
    int[] i_array54 = new int[] {  };
    int i56 = intArrayUtil53.findKthLargestViaQuickSort(i_array54, (-1));
    int i57 = intArrayUtil43.findMinSubArrayLen((int)(byte)-1, i_array54);
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
    int i77 = intArrayUtil58.threeSumClosest(i_array74, (int)(byte)0);
    int i79 = intArrayUtil43.threeSumClosest(i_array74, (int)'a');
    int i80 = intArrayUtil0.findMinSubArrayLen(52, i_array74);
    int[] i_array81 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i82 = intArrayUtil0.findMinViaRecursion(i_array81);
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
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
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
    org.junit.Assert.assertTrue(i79 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 1);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test17"); }


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
    int i20 = intArrayUtil0.threeSumClosest(i_array15, (int)(byte)1);
    int[] i_array21 = null;
    int i22 = intArrayUtil0.removeDuplicateElements(i_array21);
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
    int i41 = intArrayUtil23.removeDuplicateElements(i_array39);
    util.IntArrayUtil intArrayUtil42 = new util.IntArrayUtil();
    int[] i_array43 = new int[] {  };
    int i45 = intArrayUtil42.findKthLargestViaQuickSort(i_array43, (-1));
    util.IntArrayUtil intArrayUtil46 = new util.IntArrayUtil();
    int[] i_array47 = new int[] {  };
    int i49 = intArrayUtil46.findKthLargestViaQuickSort(i_array47, (-1));
    int[] i_array53 = new int[] { '4', (byte)0 };
    int i54 = intArrayUtil46.findMinSubArrayLen(0, i_array53);
    util.IntArrayUtil intArrayUtil56 = new util.IntArrayUtil();
    int[] i_array57 = new int[] {  };
    int i59 = intArrayUtil56.findKthLargestViaQuickSort(i_array57, (-1));
    int i60 = intArrayUtil46.findMinSubArrayLen((int)(byte)-1, i_array57);
    int i61 = intArrayUtil42.findMinViaIteration(i_array57);
    int i62 = intArrayUtil23.removeDuplicateElements(i_array57);
    int i64 = intArrayUtil0.findKthLargestViaQuickSort(i_array57, (int)(short)-1);
    
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
    org.junit.Assert.assertTrue(i20 == 0);
    
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
    org.junit.Assert.assertTrue(i41 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array43);
    
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
    org.junit.Assert.assertNotNull(i_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test18"); }


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
    int i19 = intArrayUtil0.findMinViaIteration(i_array15);
    int[] i_array20 = null;
    intArrayUtil0.getNextPermutationNumber(i_array20);
    util.IntArrayUtil intArrayUtil22 = new util.IntArrayUtil();
    int[] i_array23 = new int[] {  };
    int i25 = intArrayUtil22.findKthLargestViaQuickSort(i_array23, (-1));
    int[] i_array29 = new int[] { '4', (byte)0 };
    int i30 = intArrayUtil22.findMinSubArrayLen(0, i_array29);
    util.IntArrayUtil intArrayUtil31 = new util.IntArrayUtil();
    int[] i_array32 = new int[] {  };
    int i34 = intArrayUtil31.findKthLargestViaQuickSort(i_array32, (-1));
    int i35 = intArrayUtil22.findMinViaIteration(i_array32);
    int i36 = intArrayUtil0.findMinViaIteration(i_array32);
    int[] i_array37 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i38 = intArrayUtil0.findMinViaRecursion(i_array37);
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
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-1));
    
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
    org.junit.Assert.assertTrue(i35 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == (-1));

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test19"); }


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
    int i29 = intArrayUtil0.findMinSubArrayLen((int)'#', i_array27);
    util.IntArrayUtil intArrayUtil30 = new util.IntArrayUtil();
    int[] i_array31 = new int[] {  };
    int i33 = intArrayUtil30.findKthLargestViaQuickSort(i_array31, (-1));
    int[] i_array37 = new int[] { '4', (byte)0 };
    int i38 = intArrayUtil30.findMinSubArrayLen(0, i_array37);
    intArrayUtil0.getNextPermutationNumber(i_array37);
    int[] i_array42 = new int[] { (byte)0, (byte)10 };
    int i44 = intArrayUtil0.threeSumClosest(i_array42, (int)'#');
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
    util.IntArrayUtil intArrayUtil64 = new util.IntArrayUtil();
    int[] i_array65 = new int[] {  };
    int i67 = intArrayUtil64.findKthLargestViaQuickSort(i_array65, (-1));
    int[] i_array71 = new int[] { '4', (byte)0 };
    int i72 = intArrayUtil64.findMinSubArrayLen(0, i_array71);
    int i73 = intArrayUtil55.removeDuplicateElements(i_array71);
    util.IntArrayUtil intArrayUtil75 = new util.IntArrayUtil();
    int[] i_array76 = new int[] {  };
    int i78 = intArrayUtil75.findKthLargestViaQuickSort(i_array76, (-1));
    int[] i_array82 = new int[] { '4', (byte)0 };
    int i83 = intArrayUtil75.findMinSubArrayLen(0, i_array82);
    int i84 = intArrayUtil55.findMinSubArrayLen((int)'#', i_array82);
    int i85 = intArrayUtil46.removeDuplicateElements(i_array82);
    int i86 = intArrayUtil0.findMinSubArrayLen((int)(byte)1, i_array82);
    int[] i_array88 = null;
    int i89 = intArrayUtil0.findMinSubArrayLen(1, i_array88);
    
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
    org.junit.Assert.assertNotNull(i_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i84 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i86 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i89 == 0);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test20"); }


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
    int i29 = intArrayUtil0.findMinSubArrayLen((int)'#', i_array27);
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
    int i50 = intArrayUtil0.threeSumClosest(i_array46, (int)(byte)-1);
    util.IntArrayUtil intArrayUtil51 = new util.IntArrayUtil();
    int[] i_array52 = new int[] {  };
    int i54 = intArrayUtil51.findKthLargestViaQuickSort(i_array52, (-1));
    util.IntArrayUtil intArrayUtil55 = new util.IntArrayUtil();
    int[] i_array56 = new int[] {  };
    int i58 = intArrayUtil55.findKthLargestViaQuickSort(i_array56, (-1));
    int[] i_array62 = new int[] { '4', (byte)0 };
    int i63 = intArrayUtil55.findMinSubArrayLen(0, i_array62);
    util.IntArrayUtil intArrayUtil65 = new util.IntArrayUtil();
    int[] i_array66 = new int[] {  };
    int i68 = intArrayUtil65.findKthLargestViaQuickSort(i_array66, (-1));
    int i69 = intArrayUtil55.findMinSubArrayLen((int)(byte)-1, i_array66);
    int i71 = intArrayUtil51.threeSumClosest(i_array66, (int)(byte)1);
    intArrayUtil0.getNextPermutationNumber(i_array66);
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
    org.junit.Assert.assertNotNull(i_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == (-1));

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test21"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = null;
    intArrayUtil0.getNextPermutationNumber(i_array1);
    util.IntArrayUtil intArrayUtil3 = new util.IntArrayUtil();
    int[] i_array4 = new int[] {  };
    int i6 = intArrayUtil3.findKthLargestViaQuickSort(i_array4, (-1));
    int[] i_array10 = new int[] { '4', (byte)0 };
    int i11 = intArrayUtil3.findMinSubArrayLen(0, i_array10);
    util.IntArrayUtil intArrayUtil12 = new util.IntArrayUtil();
    int[] i_array13 = new int[] {  };
    int i15 = intArrayUtil12.findKthLargestViaQuickSort(i_array13, (-1));
    int[] i_array19 = new int[] { '4', (byte)0 };
    int i20 = intArrayUtil12.findMinSubArrayLen(0, i_array19);
    int i21 = intArrayUtil3.removeDuplicateElements(i_array19);
    util.IntArrayUtil intArrayUtil23 = new util.IntArrayUtil();
    int[] i_array24 = new int[] {  };
    int i26 = intArrayUtil23.findKthLargestViaQuickSort(i_array24, (-1));
    int[] i_array30 = new int[] { '4', (byte)0 };
    int i31 = intArrayUtil23.findMinSubArrayLen(0, i_array30);
    int i32 = intArrayUtil3.findMinSubArrayLen((int)'#', i_array30);
    util.IntArrayUtil intArrayUtil33 = new util.IntArrayUtil();
    int[] i_array34 = new int[] {  };
    int i36 = intArrayUtil33.findKthLargestViaQuickSort(i_array34, (-1));
    int[] i_array40 = new int[] { '4', (byte)0 };
    int i41 = intArrayUtil33.findMinSubArrayLen(0, i_array40);
    intArrayUtil3.getNextPermutationNumber(i_array40);
    int i43 = intArrayUtil0.findMinViaIteration(i_array40);
    util.IntArrayUtil intArrayUtil45 = new util.IntArrayUtil();
    int[] i_array46 = new int[] {  };
    int i48 = intArrayUtil45.findKthLargestViaQuickSort(i_array46, (-1));
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
    int i78 = intArrayUtil49.findMinSubArrayLen((int)'#', i_array76);
    util.IntArrayUtil intArrayUtil79 = new util.IntArrayUtil();
    int[] i_array80 = new int[] {  };
    int i82 = intArrayUtil79.findKthLargestViaQuickSort(i_array80, (-1));
    int[] i_array86 = new int[] { '4', (byte)0 };
    int i87 = intArrayUtil79.findMinSubArrayLen(0, i_array86);
    intArrayUtil49.getNextPermutationNumber(i_array86);
    int i89 = intArrayUtil45.findMinViaIteration(i_array86);
    int i90 = intArrayUtil0.findMinSubArrayLen(4, i_array86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);
    
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
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);
    
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
    org.junit.Assert.assertNotNull(i_array86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i89 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i90 == 1);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test22"); }


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
    int[] i_array32 = new int[] { '4', (byte)0 };
    int i33 = intArrayUtil25.findMinSubArrayLen(0, i_array32);
    util.IntArrayUtil intArrayUtil34 = new util.IntArrayUtil();
    int[] i_array35 = new int[] {  };
    int i37 = intArrayUtil34.findKthLargestViaQuickSort(i_array35, (-1));
    int[] i_array41 = new int[] { '4', (byte)0 };
    int i42 = intArrayUtil34.findMinSubArrayLen(0, i_array41);
    int i43 = intArrayUtil25.removeDuplicateElements(i_array41);
    int i44 = intArrayUtil15.findMinSubArrayLen((-1), i_array41);
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
    int i74 = intArrayUtil45.findMinSubArrayLen((int)'#', i_array72);
    util.IntArrayUtil intArrayUtil75 = new util.IntArrayUtil();
    int[] i_array76 = new int[] {  };
    int i78 = intArrayUtil75.findKthLargestViaQuickSort(i_array76, (-1));
    int[] i_array82 = new int[] { '4', (byte)0 };
    int i83 = intArrayUtil75.findMinSubArrayLen(0, i_array82);
    util.IntArrayUtil intArrayUtil84 = new util.IntArrayUtil();
    int[] i_array85 = new int[] {  };
    int i87 = intArrayUtil84.findKthLargestViaQuickSort(i_array85, (-1));
    int[] i_array91 = new int[] { '4', (byte)0 };
    int i92 = intArrayUtil84.findMinSubArrayLen(0, i_array91);
    int i93 = intArrayUtil75.removeDuplicateElements(i_array91);
    int i95 = intArrayUtil45.threeSumClosest(i_array91, (int)(byte)-1);
    intArrayUtil15.getNextPermutationNumber(i_array91);
    int i97 = intArrayUtil0.removeDuplicateElements(i_array91);
    
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
    org.junit.Assert.assertNotNull(i_array32);
    
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
    org.junit.Assert.assertTrue(i43 == 2);
    
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
    org.junit.Assert.assertNotNull(i_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i92 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i93 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i95 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i97 == 2);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test23"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = null;
    intArrayUtil0.getNextPermutationNumber(i_array1);
    util.IntArrayUtil intArrayUtil3 = new util.IntArrayUtil();
    int[] i_array4 = new int[] {  };
    int i6 = intArrayUtil3.findKthLargestViaQuickSort(i_array4, (-1));
    int[] i_array10 = new int[] { '4', (byte)0 };
    int i11 = intArrayUtil3.findMinSubArrayLen(0, i_array10);
    util.IntArrayUtil intArrayUtil12 = new util.IntArrayUtil();
    int[] i_array13 = new int[] {  };
    int i15 = intArrayUtil12.findKthLargestViaQuickSort(i_array13, (-1));
    int[] i_array19 = new int[] { '4', (byte)0 };
    int i20 = intArrayUtil12.findMinSubArrayLen(0, i_array19);
    int i21 = intArrayUtil3.removeDuplicateElements(i_array19);
    util.IntArrayUtil intArrayUtil23 = new util.IntArrayUtil();
    int[] i_array24 = new int[] {  };
    int i26 = intArrayUtil23.findKthLargestViaQuickSort(i_array24, (-1));
    int[] i_array30 = new int[] { '4', (byte)0 };
    int i31 = intArrayUtil23.findMinSubArrayLen(0, i_array30);
    int i32 = intArrayUtil3.findMinSubArrayLen((int)'#', i_array30);
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
    int i51 = intArrayUtil33.removeDuplicateElements(i_array49);
    int i53 = intArrayUtil3.threeSumClosest(i_array49, (int)(byte)-1);
    util.IntArrayUtil intArrayUtil54 = new util.IntArrayUtil();
    int[] i_array55 = new int[] {  };
    int i57 = intArrayUtil54.findKthLargestViaQuickSort(i_array55, (-1));
    util.IntArrayUtil intArrayUtil58 = new util.IntArrayUtil();
    int[] i_array59 = new int[] {  };
    int i61 = intArrayUtil58.findKthLargestViaQuickSort(i_array59, (-1));
    int[] i_array65 = new int[] { '4', (byte)0 };
    int i66 = intArrayUtil58.findMinSubArrayLen(0, i_array65);
    util.IntArrayUtil intArrayUtil68 = new util.IntArrayUtil();
    int[] i_array69 = new int[] {  };
    int i71 = intArrayUtil68.findKthLargestViaQuickSort(i_array69, (-1));
    int i72 = intArrayUtil58.findMinSubArrayLen((int)(byte)-1, i_array69);
    int i74 = intArrayUtil54.threeSumClosest(i_array69, (int)(byte)1);
    intArrayUtil3.getNextPermutationNumber(i_array69);
    int i76 = intArrayUtil0.findMinViaIteration(i_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);
    
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
    org.junit.Assert.assertNotNull(i_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array55);
    
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
    org.junit.Assert.assertNotNull(i_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == (-1));

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test24"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil10 = new util.IntArrayUtil();
    int[] i_array11 = new int[] {  };
    int i13 = intArrayUtil10.findKthLargestViaQuickSort(i_array11, (-1));
    int i14 = intArrayUtil0.findMinSubArrayLen((int)(byte)-1, i_array11);
    int[] i_array15 = null;
    int i16 = intArrayUtil0.removeDuplicateElements(i_array15);
    util.IntArrayUtil intArrayUtil17 = new util.IntArrayUtil();
    int[] i_array18 = new int[] {  };
    int i20 = intArrayUtil17.findKthLargestViaQuickSort(i_array18, (-1));
    int[] i_array24 = new int[] { '4', (byte)0 };
    int i25 = intArrayUtil17.findMinSubArrayLen(0, i_array24);
    util.IntArrayUtil intArrayUtil27 = new util.IntArrayUtil();
    int[] i_array28 = new int[] {  };
    int i30 = intArrayUtil27.findKthLargestViaQuickSort(i_array28, (-1));
    int i31 = intArrayUtil17.findMinSubArrayLen((int)(byte)-1, i_array28);
    util.IntArrayUtil intArrayUtil32 = new util.IntArrayUtil();
    int[] i_array33 = new int[] {  };
    int i35 = intArrayUtil32.findKthLargestViaQuickSort(i_array33, (-1));
    int[] i_array39 = new int[] { '4', (byte)0 };
    int i40 = intArrayUtil32.findMinSubArrayLen(0, i_array39);
    util.IntArrayUtil intArrayUtil42 = new util.IntArrayUtil();
    int[] i_array43 = new int[] {  };
    int i45 = intArrayUtil42.findKthLargestViaQuickSort(i_array43, (-1));
    int i46 = intArrayUtil32.findMinSubArrayLen((int)(byte)-1, i_array43);
    int i48 = intArrayUtil17.threeSumClosest(i_array43, (int)(short)1);
    util.IntArrayUtil intArrayUtil49 = new util.IntArrayUtil();
    int[] i_array50 = new int[] {  };
    int i52 = intArrayUtil49.findKthLargestViaQuickSort(i_array50, (-1));
    util.IntArrayUtil intArrayUtil53 = new util.IntArrayUtil();
    int[] i_array54 = new int[] {  };
    int i56 = intArrayUtil53.findKthLargestViaQuickSort(i_array54, (-1));
    int[] i_array60 = new int[] { '4', (byte)0 };
    int i61 = intArrayUtil53.findMinSubArrayLen(0, i_array60);
    util.IntArrayUtil intArrayUtil63 = new util.IntArrayUtil();
    int[] i_array64 = new int[] {  };
    int i66 = intArrayUtil63.findKthLargestViaQuickSort(i_array64, (-1));
    int i67 = intArrayUtil53.findMinSubArrayLen((int)(byte)-1, i_array64);
    int i69 = intArrayUtil49.threeSumClosest(i_array64, (int)(byte)1);
    util.IntArrayUtil intArrayUtil70 = new util.IntArrayUtil();
    int[] i_array71 = new int[] {  };
    int i73 = intArrayUtil70.findKthLargestViaQuickSort(i_array71, (-1));
    util.IntArrayUtil intArrayUtil74 = new util.IntArrayUtil();
    int[] i_array75 = new int[] {  };
    int i77 = intArrayUtil74.findKthLargestViaQuickSort(i_array75, (-1));
    int[] i_array81 = new int[] { '4', (byte)0 };
    int i82 = intArrayUtil74.findMinSubArrayLen(0, i_array81);
    util.IntArrayUtil intArrayUtil84 = new util.IntArrayUtil();
    int[] i_array85 = new int[] {  };
    int i87 = intArrayUtil84.findKthLargestViaQuickSort(i_array85, (-1));
    int i88 = intArrayUtil74.findMinSubArrayLen((int)(byte)-1, i_array85);
    int i90 = intArrayUtil70.threeSumClosest(i_array85, (int)(byte)1);
    int i91 = intArrayUtil49.findMinViaIteration(i_array85);
    int i93 = intArrayUtil17.threeSumClosest(i_array85, 6);
    int i94 = intArrayUtil0.removeDuplicateElements(i_array85);
    
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
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i90 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i91 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i93 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i94 == 0);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test25"); }


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
    int i29 = intArrayUtil0.findMinSubArrayLen((int)'#', i_array27);
    int[] i_array33 = new int[] { 2, (short)100, 1 };
    int i35 = intArrayUtil0.findKthLargestViaQuickSort(i_array33, 2);
    util.IntArrayUtil intArrayUtil36 = new util.IntArrayUtil();
    int[] i_array37 = new int[] {  };
    int i39 = intArrayUtil36.findKthLargestViaQuickSort(i_array37, (-1));
    int[] i_array43 = new int[] { '4', (byte)0 };
    int i44 = intArrayUtil36.findMinSubArrayLen(0, i_array43);
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
    int i65 = intArrayUtil36.findMinSubArrayLen((-1), i_array62);
    // The following exception was thrown during execution in test generation
    try {
    int i67 = intArrayUtil0.findKthLargestViaQuickSort(i_array62, 100);
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
    org.junit.Assert.assertTrue(i35 == 2);
    
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
    org.junit.Assert.assertTrue(i65 == 1);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test26"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil10 = new util.IntArrayUtil();
    int[] i_array11 = new int[] {  };
    int i13 = intArrayUtil10.findKthLargestViaQuickSort(i_array11, (-1));
    int i14 = intArrayUtil0.findMinSubArrayLen((int)(byte)-1, i_array11);
    int[] i_array15 = null;
    int i17 = intArrayUtil0.findKthLargestViaQuickSort(i_array15, (int)(short)-1);
    util.IntArrayUtil intArrayUtil18 = new util.IntArrayUtil();
    int[] i_array19 = new int[] {  };
    int i21 = intArrayUtil18.findKthLargestViaQuickSort(i_array19, (-1));
    int[] i_array25 = new int[] { '4', (byte)0 };
    int i26 = intArrayUtil18.findMinSubArrayLen(0, i_array25);
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
    int i45 = intArrayUtil27.removeDuplicateElements(i_array43);
    util.IntArrayUtil intArrayUtil47 = new util.IntArrayUtil();
    int[] i_array48 = new int[] {  };
    int i50 = intArrayUtil47.findKthLargestViaQuickSort(i_array48, (-1));
    int[] i_array54 = new int[] { '4', (byte)0 };
    int i55 = intArrayUtil47.findMinSubArrayLen(0, i_array54);
    int i56 = intArrayUtil27.findMinSubArrayLen((int)'#', i_array54);
    int i57 = intArrayUtil18.removeDuplicateElements(i_array54);
    util.IntArrayUtil intArrayUtil58 = new util.IntArrayUtil();
    int[] i_array59 = new int[] {  };
    int i61 = intArrayUtil58.findKthLargestViaQuickSort(i_array59, (-1));
    int i62 = intArrayUtil18.removeDuplicateElements(i_array59);
    util.IntArrayUtil intArrayUtil63 = new util.IntArrayUtil();
    int[] i_array64 = new int[] {  };
    int i66 = intArrayUtil63.findKthLargestViaQuickSort(i_array64, (-1));
    int i67 = intArrayUtil18.findMinViaIteration(i_array64);
    util.IntArrayUtil intArrayUtil68 = new util.IntArrayUtil();
    int[] i_array69 = new int[] {  };
    int i71 = intArrayUtil68.findKthLargestViaQuickSort(i_array69, (-1));
    util.IntArrayUtil intArrayUtil72 = new util.IntArrayUtil();
    int[] i_array73 = new int[] {  };
    int i75 = intArrayUtil72.findKthLargestViaQuickSort(i_array73, (-1));
    int[] i_array79 = new int[] { '4', (byte)0 };
    int i80 = intArrayUtil72.findMinSubArrayLen(0, i_array79);
    util.IntArrayUtil intArrayUtil82 = new util.IntArrayUtil();
    int[] i_array83 = new int[] {  };
    int i85 = intArrayUtil82.findKthLargestViaQuickSort(i_array83, (-1));
    int i86 = intArrayUtil72.findMinSubArrayLen((int)(byte)-1, i_array83);
    int i88 = intArrayUtil68.threeSumClosest(i_array83, (int)(byte)1);
    int i89 = intArrayUtil18.findMinViaIteration(i_array83);
    util.IntArrayUtil intArrayUtil90 = new util.IntArrayUtil();
    int[] i_array91 = new int[] {  };
    int i93 = intArrayUtil90.findKthLargestViaQuickSort(i_array91, (-1));
    int i95 = intArrayUtil18.threeSumClosest(i_array91, (int)(short)-1);
    int i97 = intArrayUtil0.threeSumClosest(i_array91, (int)(byte)1);
    int[] i_array98 = null;
    intArrayUtil0.getNextPermutationNumber(i_array98);
    
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
    org.junit.Assert.assertTrue(i45 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 2);
    
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
    org.junit.Assert.assertTrue(i67 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array69);
    
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
    org.junit.Assert.assertNotNull(i_array83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i86 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i89 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i93 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i95 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i97 == 0);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test27"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil10 = new util.IntArrayUtil();
    int[] i_array11 = new int[] {  };
    int i13 = intArrayUtil10.findKthLargestViaQuickSort(i_array11, (-1));
    int i14 = intArrayUtil0.findMinSubArrayLen((int)(byte)-1, i_array11);
    int[] i_array15 = null;
    int i17 = intArrayUtil0.findKthLargestViaQuickSort(i_array15, (int)(short)-1);
    int[] i_array23 = new int[] { 1, 6, (byte)0, 1 };
    int i24 = intArrayUtil0.findMinSubArrayLen((int)(short)0, i_array23);
    int[] i_array25 = null;
    int i26 = intArrayUtil0.removeDuplicateElements(i_array25);
    int[] i_array27 = null;
    int i28 = intArrayUtil0.findMinViaIteration(i_array27);
    util.IntArrayUtil intArrayUtil29 = new util.IntArrayUtil();
    int[] i_array30 = new int[] {  };
    int i32 = intArrayUtil29.findKthLargestViaQuickSort(i_array30, (-1));
    int[] i_array36 = new int[] { '4', (byte)0 };
    int i37 = intArrayUtil29.findMinSubArrayLen(0, i_array36);
    util.IntArrayUtil intArrayUtil39 = new util.IntArrayUtil();
    int[] i_array40 = new int[] {  };
    int i42 = intArrayUtil39.findKthLargestViaQuickSort(i_array40, (-1));
    int i43 = intArrayUtil29.findMinSubArrayLen((int)(byte)-1, i_array40);
    util.IntArrayUtil intArrayUtil44 = new util.IntArrayUtil();
    int[] i_array45 = new int[] {  };
    int i47 = intArrayUtil44.findKthLargestViaQuickSort(i_array45, (-1));
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
    int i86 = intArrayUtil57.findMinSubArrayLen((int)'#', i_array84);
    int i87 = intArrayUtil48.removeDuplicateElements(i_array84);
    intArrayUtil44.getNextPermutationNumber(i_array84);
    int i89 = intArrayUtil29.findMinViaRecursion(i_array84);
    int i91 = intArrayUtil0.findKthLargestViaQuickSort(i_array84, (int)(short)1);
    
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
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array45);
    
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
    org.junit.Assert.assertTrue(i87 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i89 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i91 == 52);

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
    int i18 = intArrayUtil0.removeDuplicateElements(i_array16);
    util.IntArrayUtil intArrayUtil19 = new util.IntArrayUtil();
    int[] i_array20 = new int[] {  };
    int i22 = intArrayUtil19.findKthLargestViaQuickSort(i_array20, (-1));
    int[] i_array26 = new int[] { '4', (byte)0 };
    int i27 = intArrayUtil19.findMinSubArrayLen(0, i_array26);
    util.IntArrayUtil intArrayUtil29 = new util.IntArrayUtil();
    int[] i_array30 = new int[] {  };
    int i32 = intArrayUtil29.findKthLargestViaQuickSort(i_array30, (-1));
    int i33 = intArrayUtil19.findMinSubArrayLen((int)(byte)-1, i_array30);
    util.IntArrayUtil intArrayUtil34 = new util.IntArrayUtil();
    int[] i_array35 = new int[] {  };
    int i37 = intArrayUtil34.findKthLargestViaQuickSort(i_array35, (-1));
    int[] i_array41 = new int[] { '4', (byte)0 };
    int i42 = intArrayUtil34.findMinSubArrayLen(0, i_array41);
    util.IntArrayUtil intArrayUtil43 = new util.IntArrayUtil();
    int[] i_array44 = new int[] {  };
    int i46 = intArrayUtil43.findKthLargestViaQuickSort(i_array44, (-1));
    int[] i_array50 = new int[] { '4', (byte)0 };
    int i51 = intArrayUtil43.findMinSubArrayLen(0, i_array50);
    int i53 = intArrayUtil34.threeSumClosest(i_array50, (int)(byte)0);
    int i55 = intArrayUtil19.threeSumClosest(i_array50, (int)'a');
    int i57 = intArrayUtil0.findKthLargestViaQuickSort(i_array50, (int)(byte)-1);
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
    int i76 = intArrayUtil58.removeDuplicateElements(i_array74);
    int i77 = intArrayUtil0.findMinViaRecursion(i_array74);
    util.IntArrayUtil intArrayUtil79 = new util.IntArrayUtil();
    int[] i_array80 = new int[] {  };
    int i82 = intArrayUtil79.findKthLargestViaQuickSort(i_array80, (-1));
    int[] i_array86 = new int[] { '4', (byte)0 };
    int i87 = intArrayUtil79.findMinSubArrayLen(0, i_array86);
    int i88 = intArrayUtil0.findMinSubArrayLen((int)(byte)-1, i_array86);
    int[] i_array89 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i90 = intArrayUtil0.findMinViaRecursion(i_array89);
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
    org.junit.Assert.assertNotNull(i_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
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
    org.junit.Assert.assertTrue(i55 == 0);
    
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
    org.junit.Assert.assertTrue(i76 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == 1);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test29"); }


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
    int i20 = intArrayUtil1.threeSumClosest(i_array17, (int)(byte)0);
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
    int i40 = intArrayUtil21.threeSumClosest(i_array37, (int)(byte)0);
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
    int i70 = intArrayUtil41.findMinSubArrayLen((int)'#', i_array68);
    int i71 = intArrayUtil21.removeDuplicateElements(i_array68);
    int[] i_array72 = null;
    int i73 = intArrayUtil21.removeDuplicateElements(i_array72);
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
    int i92 = intArrayUtil74.removeDuplicateElements(i_array90);
    int i93 = intArrayUtil21.findMinViaRecursion(i_array90);
    int i94 = intArrayUtil1.findMinViaIteration(i_array90);
    int i95 = intArrayUtil0.findMinViaRecursion(i_array90);
    int[] i_array96 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i98 = intArrayUtil0.threeSumClosest(i_array96, 4);
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
    org.junit.Assert.assertTrue(i71 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 0);
    
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
    org.junit.Assert.assertTrue(i92 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i93 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i94 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i95 == 0);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test30"); }


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
    int[] i_array26 = new int[] { '4', (byte)0 };
    int i27 = intArrayUtil19.findMinSubArrayLen(0, i_array26);
    util.IntArrayUtil intArrayUtil28 = new util.IntArrayUtil();
    int[] i_array29 = new int[] {  };
    int i31 = intArrayUtil28.findKthLargestViaQuickSort(i_array29, (-1));
    int[] i_array35 = new int[] { '4', (byte)0 };
    int i36 = intArrayUtil28.findMinSubArrayLen(0, i_array35);
    int i37 = intArrayUtil19.removeDuplicateElements(i_array35);
    util.IntArrayUtil intArrayUtil39 = new util.IntArrayUtil();
    int[] i_array40 = new int[] {  };
    int i42 = intArrayUtil39.findKthLargestViaQuickSort(i_array40, (-1));
    int[] i_array46 = new int[] { '4', (byte)0 };
    int i47 = intArrayUtil39.findMinSubArrayLen(0, i_array46);
    int i48 = intArrayUtil19.findMinSubArrayLen((int)'#', i_array46);
    int i50 = intArrayUtil0.findKthLargestViaQuickSort(i_array46, 1);
    util.IntArrayUtil intArrayUtil51 = new util.IntArrayUtil();
    util.IntArrayUtil intArrayUtil52 = new util.IntArrayUtil();
    int[] i_array53 = new int[] {  };
    int i55 = intArrayUtil52.findKthLargestViaQuickSort(i_array53, (-1));
    int[] i_array59 = new int[] { '4', (byte)0 };
    int i60 = intArrayUtil52.findMinSubArrayLen(0, i_array59);
    util.IntArrayUtil intArrayUtil62 = new util.IntArrayUtil();
    int[] i_array63 = new int[] {  };
    int i65 = intArrayUtil62.findKthLargestViaQuickSort(i_array63, (-1));
    int i66 = intArrayUtil52.findMinSubArrayLen((int)(byte)-1, i_array63);
    int[] i_array67 = null;
    int i69 = intArrayUtil52.findKthLargestViaQuickSort(i_array67, (int)(short)-1);
    int[] i_array75 = new int[] { 1, 6, (byte)0, 1 };
    int i76 = intArrayUtil52.findMinSubArrayLen((int)(short)0, i_array75);
    intArrayUtil51.getNextPermutationNumber(i_array75);
    intArrayUtil0.getNextPermutationNumber(i_array75);
    
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
    org.junit.Assert.assertTrue(i37 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 1);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test31"); }


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
    int i51 = intArrayUtil22.findMinSubArrayLen((int)'#', i_array49);
    int i52 = intArrayUtil13.removeDuplicateElements(i_array49);
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
    int i73 = intArrayUtil54.threeSumClosest(i_array70, (int)(byte)0);
    int i74 = intArrayUtil13.findMinSubArrayLen((int)(short)0, i_array70);
    int i75 = intArrayUtil4.findMinViaIteration(i_array70);
    int i76 = intArrayUtil0.findMinViaRecursion(i_array70);
    
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
    org.junit.Assert.assertTrue(i52 == 2);
    
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
    org.junit.Assert.assertTrue(i74 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 0);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test32"); }


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
    int i19 = intArrayUtil0.findMinViaIteration(i_array15);
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
    int i38 = intArrayUtil20.removeDuplicateElements(i_array36);
    util.IntArrayUtil intArrayUtil40 = new util.IntArrayUtil();
    int[] i_array41 = new int[] {  };
    int i43 = intArrayUtil40.findKthLargestViaQuickSort(i_array41, (-1));
    int[] i_array47 = new int[] { '4', (byte)0 };
    int i48 = intArrayUtil40.findMinSubArrayLen(0, i_array47);
    int i49 = intArrayUtil20.findMinSubArrayLen((int)'#', i_array47);
    int[] i_array53 = new int[] { 2, (short)100, 1 };
    int i55 = intArrayUtil20.findKthLargestViaQuickSort(i_array53, 2);
    util.IntArrayUtil intArrayUtil56 = new util.IntArrayUtil();
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
    int i76 = intArrayUtil57.threeSumClosest(i_array73, (int)(byte)0);
    intArrayUtil56.getNextPermutationNumber(i_array73);
    intArrayUtil20.getNextPermutationNumber(i_array73);
    int i79 = intArrayUtil0.removeDuplicateElements(i_array73);
    
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
    org.junit.Assert.assertTrue(i19 == (-1));
    
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
    org.junit.Assert.assertTrue(i38 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array53);
    
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
    org.junit.Assert.assertTrue(i79 == 2);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test33"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    util.IntArrayUtil intArrayUtil1 = new util.IntArrayUtil();
    int[] i_array2 = new int[] {  };
    int i4 = intArrayUtil1.findKthLargestViaQuickSort(i_array2, (-1));
    int[] i_array8 = new int[] { '4', (byte)0 };
    int i9 = intArrayUtil1.findMinSubArrayLen(0, i_array8);
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
    int i30 = intArrayUtil1.findMinSubArrayLen((-1), i_array27);
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
    util.IntArrayUtil intArrayUtil49 = new util.IntArrayUtil();
    int[] i_array50 = new int[] {  };
    int i52 = intArrayUtil49.findKthLargestViaQuickSort(i_array50, (-1));
    int[] i_array56 = new int[] { '4', (byte)0 };
    int i57 = intArrayUtil49.findMinSubArrayLen(0, i_array56);
    int i58 = intArrayUtil40.removeDuplicateElements(i_array56);
    util.IntArrayUtil intArrayUtil60 = new util.IntArrayUtil();
    int[] i_array61 = new int[] {  };
    int i63 = intArrayUtil60.findKthLargestViaQuickSort(i_array61, (-1));
    int[] i_array67 = new int[] { '4', (byte)0 };
    int i68 = intArrayUtil60.findMinSubArrayLen(0, i_array67);
    int i69 = intArrayUtil40.findMinSubArrayLen((int)'#', i_array67);
    int i70 = intArrayUtil31.removeDuplicateElements(i_array67);
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
    int i90 = intArrayUtil31.findMinViaRecursion(i_array87);
    int i91 = intArrayUtil1.findMinViaIteration(i_array87);
    int i92 = intArrayUtil0.findMinViaIteration(i_array87);
    int[] i_array93 = null;
    int i94 = intArrayUtil0.removeDuplicateElements(i_array93);
    
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
    org.junit.Assert.assertTrue(i58 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 2);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i90 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i91 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i92 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i94 == 0);

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
    int i19 = intArrayUtil0.threeSumClosest(i_array16, (int)(byte)0);
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
    int i38 = intArrayUtil20.removeDuplicateElements(i_array36);
    util.IntArrayUtil intArrayUtil40 = new util.IntArrayUtil();
    int[] i_array41 = new int[] {  };
    int i43 = intArrayUtil40.findKthLargestViaQuickSort(i_array41, (-1));
    int[] i_array47 = new int[] { '4', (byte)0 };
    int i48 = intArrayUtil40.findMinSubArrayLen(0, i_array47);
    int i49 = intArrayUtil20.findMinSubArrayLen((int)'#', i_array47);
    int i50 = intArrayUtil0.removeDuplicateElements(i_array47);
    util.IntArrayUtil intArrayUtil52 = new util.IntArrayUtil();
    int[] i_array53 = new int[] {  };
    int i55 = intArrayUtil52.findKthLargestViaQuickSort(i_array53, (-1));
    int i56 = intArrayUtil0.findMinSubArrayLen((int)' ', i_array53);
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
    int i76 = intArrayUtil0.removeDuplicateElements(i_array73);
    int[] i_array77 = null;
    int i79 = intArrayUtil0.findKthLargestViaQuickSort(i_array77, 100);
    util.IntArrayUtil intArrayUtil80 = new util.IntArrayUtil();
    int[] i_array81 = new int[] {  };
    int i83 = intArrayUtil80.findKthLargestViaQuickSort(i_array81, (-1));
    int[] i_array87 = new int[] { '4', (byte)0 };
    int i88 = intArrayUtil80.findMinSubArrayLen(0, i_array87);
    util.IntArrayUtil intArrayUtil90 = new util.IntArrayUtil();
    int[] i_array91 = new int[] {  };
    int i93 = intArrayUtil90.findKthLargestViaQuickSort(i_array91, (-1));
    int i94 = intArrayUtil80.findMinSubArrayLen((int)(byte)-1, i_array91);
    int i96 = intArrayUtil0.threeSumClosest(i_array91, 3);
    
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
    org.junit.Assert.assertTrue(i38 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
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
    org.junit.Assert.assertTrue(i76 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i93 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i94 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i96 == 0);

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
    int i38 = intArrayUtil9.findMinSubArrayLen((int)'#', i_array36);
    int i39 = intArrayUtil0.removeDuplicateElements(i_array36);
    util.IntArrayUtil intArrayUtil40 = new util.IntArrayUtil();
    int[] i_array41 = new int[] {  };
    int i43 = intArrayUtil40.findKthLargestViaQuickSort(i_array41, (-1));
    int i44 = intArrayUtil0.removeDuplicateElements(i_array41);
    util.IntArrayUtil intArrayUtil45 = new util.IntArrayUtil();
    int[] i_array46 = new int[] {  };
    int i48 = intArrayUtil45.findKthLargestViaQuickSort(i_array46, (-1));
    int i49 = intArrayUtil0.findMinViaIteration(i_array46);
    util.IntArrayUtil intArrayUtil50 = new util.IntArrayUtil();
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
    util.IntArrayUtil intArrayUtil70 = new util.IntArrayUtil();
    int[] i_array71 = new int[] {  };
    int i73 = intArrayUtil70.findKthLargestViaQuickSort(i_array71, (-1));
    int[] i_array77 = new int[] { '4', (byte)0 };
    int i78 = intArrayUtil70.findMinSubArrayLen(0, i_array77);
    int i79 = intArrayUtil61.removeDuplicateElements(i_array77);
    util.IntArrayUtil intArrayUtil81 = new util.IntArrayUtil();
    int[] i_array82 = new int[] {  };
    int i84 = intArrayUtil81.findKthLargestViaQuickSort(i_array82, (-1));
    int[] i_array88 = new int[] { '4', (byte)0 };
    int i89 = intArrayUtil81.findMinSubArrayLen(0, i_array88);
    int i90 = intArrayUtil61.findMinSubArrayLen((int)'#', i_array88);
    int i91 = intArrayUtil52.removeDuplicateElements(i_array88);
    int i92 = intArrayUtil50.findMinSubArrayLen((int)(byte)0, i_array88);
    int i93 = intArrayUtil0.findMinViaIteration(i_array88);
    util.IntArrayUtil intArrayUtil95 = new util.IntArrayUtil();
    int[] i_array96 = new int[] {  };
    int i98 = intArrayUtil95.findKthLargestViaQuickSort(i_array96, (-1));
    int i99 = intArrayUtil0.findMinSubArrayLen((int)(short)100, i_array96);
    
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
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == (-1));
    
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
    org.junit.Assert.assertNotNull(i_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i84 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i89 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i90 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i91 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i92 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i93 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i98 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i99 == 0);

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
    util.IntArrayUtil intArrayUtil14 = new util.IntArrayUtil();
    int[] i_array15 = new int[] {  };
    int i17 = intArrayUtil14.findKthLargestViaQuickSort(i_array15, (-1));
    int i18 = intArrayUtil4.findMinSubArrayLen((int)(byte)-1, i_array15);
    int i20 = intArrayUtil0.threeSumClosest(i_array15, (int)(byte)1);
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
    util.IntArrayUtil intArrayUtil39 = new util.IntArrayUtil();
    int[] i_array40 = new int[] {  };
    int i42 = intArrayUtil39.findKthLargestViaQuickSort(i_array40, (-1));
    int[] i_array46 = new int[] { '4', (byte)0 };
    int i47 = intArrayUtil39.findMinSubArrayLen(0, i_array46);
    int i48 = intArrayUtil30.removeDuplicateElements(i_array46);
    util.IntArrayUtil intArrayUtil50 = new util.IntArrayUtil();
    int[] i_array51 = new int[] {  };
    int i53 = intArrayUtil50.findKthLargestViaQuickSort(i_array51, (-1));
    int[] i_array57 = new int[] { '4', (byte)0 };
    int i58 = intArrayUtil50.findMinSubArrayLen(0, i_array57);
    int i59 = intArrayUtil30.findMinSubArrayLen((int)'#', i_array57);
    int i60 = intArrayUtil21.removeDuplicateElements(i_array57);
    util.IntArrayUtil intArrayUtil61 = new util.IntArrayUtil();
    int[] i_array62 = new int[] {  };
    int i64 = intArrayUtil61.findKthLargestViaQuickSort(i_array62, (-1));
    int i65 = intArrayUtil21.removeDuplicateElements(i_array62);
    util.IntArrayUtil intArrayUtil66 = new util.IntArrayUtil();
    int[] i_array67 = new int[] {  };
    int i69 = intArrayUtil66.findKthLargestViaQuickSort(i_array67, (-1));
    int i70 = intArrayUtil21.findMinViaIteration(i_array67);
    util.IntArrayUtil intArrayUtil71 = new util.IntArrayUtil();
    int[] i_array72 = new int[] {  };
    int i74 = intArrayUtil71.findKthLargestViaQuickSort(i_array72, (-1));
    util.IntArrayUtil intArrayUtil75 = new util.IntArrayUtil();
    int[] i_array76 = new int[] {  };
    int i78 = intArrayUtil75.findKthLargestViaQuickSort(i_array76, (-1));
    int[] i_array82 = new int[] { '4', (byte)0 };
    int i83 = intArrayUtil75.findMinSubArrayLen(0, i_array82);
    util.IntArrayUtil intArrayUtil85 = new util.IntArrayUtil();
    int[] i_array86 = new int[] {  };
    int i88 = intArrayUtil85.findKthLargestViaQuickSort(i_array86, (-1));
    int i89 = intArrayUtil75.findMinSubArrayLen((int)(byte)-1, i_array86);
    int i91 = intArrayUtil71.threeSumClosest(i_array86, (int)(byte)1);
    int i92 = intArrayUtil21.findMinViaIteration(i_array86);
    util.IntArrayUtil intArrayUtil93 = new util.IntArrayUtil();
    int[] i_array94 = new int[] {  };
    int i96 = intArrayUtil93.findKthLargestViaQuickSort(i_array94, (-1));
    int i98 = intArrayUtil21.threeSumClosest(i_array94, (int)(short)-1);
    int i99 = intArrayUtil0.findMinViaIteration(i_array94);
    
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
    org.junit.Assert.assertNotNull(i_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 0);
    
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
    org.junit.Assert.assertTrue(i91 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i92 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i96 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i98 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i99 == (-1));

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
    int i39 = intArrayUtil10.findMinSubArrayLen((int)'#', i_array37);
    int i40 = intArrayUtil1.findMinViaIteration(i_array37);
    intArrayUtil0.getNextPermutationNumber(i_array37);
    int[] i_array42 = null;
    int i43 = intArrayUtil0.findMinViaIteration(i_array42);
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
    util.IntArrayUtil intArrayUtil62 = new util.IntArrayUtil();
    int[] i_array63 = new int[] {  };
    int i65 = intArrayUtil62.findKthLargestViaQuickSort(i_array63, (-1));
    int[] i_array69 = new int[] { '4', (byte)0 };
    int i70 = intArrayUtil62.findMinSubArrayLen(0, i_array69);
    int i71 = intArrayUtil53.removeDuplicateElements(i_array69);
    util.IntArrayUtil intArrayUtil73 = new util.IntArrayUtil();
    int[] i_array74 = new int[] {  };
    int i76 = intArrayUtil73.findKthLargestViaQuickSort(i_array74, (-1));
    int[] i_array80 = new int[] { '4', (byte)0 };
    int i81 = intArrayUtil73.findMinSubArrayLen(0, i_array80);
    int i82 = intArrayUtil53.findMinSubArrayLen((int)'#', i_array80);
    int i83 = intArrayUtil44.removeDuplicateElements(i_array80);
    util.IntArrayUtil intArrayUtil84 = new util.IntArrayUtil();
    int[] i_array85 = new int[] {  };
    int i87 = intArrayUtil84.findKthLargestViaQuickSort(i_array85, (-1));
    int i88 = intArrayUtil44.removeDuplicateElements(i_array85);
    util.IntArrayUtil intArrayUtil89 = new util.IntArrayUtil();
    int[] i_array90 = new int[] {  };
    int i92 = intArrayUtil89.findKthLargestViaQuickSort(i_array90, (-1));
    int i93 = intArrayUtil44.findMinViaIteration(i_array90);
    // The following exception was thrown during execution in test generation
    try {
    int i95 = intArrayUtil0.findKthLargestViaQuickSort(i_array90, 1);
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
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == (-1));
    
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
    org.junit.Assert.assertNotNull(i_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i92 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i93 == (-1));

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
    int i13 = intArrayUtil0.findMinViaIteration(i_array10);
    util.IntArrayUtil intArrayUtil15 = new util.IntArrayUtil();
    int[] i_array16 = new int[] {  };
    int i18 = intArrayUtil15.findKthLargestViaQuickSort(i_array16, (-1));
    util.IntArrayUtil intArrayUtil19 = new util.IntArrayUtil();
    int[] i_array20 = new int[] {  };
    int i22 = intArrayUtil19.findKthLargestViaQuickSort(i_array20, (-1));
    int[] i_array26 = new int[] { '4', (byte)0 };
    int i27 = intArrayUtil19.findMinSubArrayLen(0, i_array26);
    util.IntArrayUtil intArrayUtil29 = new util.IntArrayUtil();
    int[] i_array30 = new int[] {  };
    int i32 = intArrayUtil29.findKthLargestViaQuickSort(i_array30, (-1));
    int i33 = intArrayUtil19.findMinSubArrayLen((int)(byte)-1, i_array30);
    int i35 = intArrayUtil15.threeSumClosest(i_array30, (int)(byte)1);
    util.IntArrayUtil intArrayUtil36 = new util.IntArrayUtil();
    int[] i_array37 = new int[] {  };
    int i39 = intArrayUtil36.findKthLargestViaQuickSort(i_array37, (-1));
    int[] i_array43 = new int[] { '4', (byte)0 };
    int i44 = intArrayUtil36.findMinSubArrayLen(0, i_array43);
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
    int i65 = intArrayUtil36.findMinSubArrayLen((-1), i_array62);
    int i66 = intArrayUtil15.removeDuplicateElements(i_array62);
    int i67 = intArrayUtil0.findMinSubArrayLen((int)(short)10, i_array62);
    
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
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
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
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
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
    org.junit.Assert.assertTrue(i65 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 1);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test39"); }


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
    int i20 = intArrayUtil0.threeSumClosest(i_array15, (int)(byte)1);
    util.IntArrayUtil intArrayUtil21 = new util.IntArrayUtil();
    int[] i_array22 = new int[] {  };
    int i24 = intArrayUtil21.findKthLargestViaQuickSort(i_array22, (-1));
    util.IntArrayUtil intArrayUtil25 = new util.IntArrayUtil();
    int[] i_array26 = new int[] {  };
    int i28 = intArrayUtil25.findKthLargestViaQuickSort(i_array26, (-1));
    int[] i_array32 = new int[] { '4', (byte)0 };
    int i33 = intArrayUtil25.findMinSubArrayLen(0, i_array32);
    util.IntArrayUtil intArrayUtil35 = new util.IntArrayUtil();
    int[] i_array36 = new int[] {  };
    int i38 = intArrayUtil35.findKthLargestViaQuickSort(i_array36, (-1));
    int i39 = intArrayUtil25.findMinSubArrayLen((int)(byte)-1, i_array36);
    int i41 = intArrayUtil21.threeSumClosest(i_array36, (int)(byte)1);
    intArrayUtil0.getNextPermutationNumber(i_array36);
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
    int i91 = intArrayUtil62.findMinSubArrayLen((int)'#', i_array89);
    int i93 = intArrayUtil43.findKthLargestViaQuickSort(i_array89, 1);
    int i95 = intArrayUtil0.threeSumClosest(i_array89, (int)(byte)-1);
    int[] i_array96 = null;
    intArrayUtil0.getNextPermutationNumber(i_array96);
    int[] i_array98 = null;
    int i99 = intArrayUtil0.findMinViaIteration(i_array98);
    
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
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
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
    org.junit.Assert.assertTrue(i93 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i95 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i99 == (-1));

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test40"); }


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
    int[] i_array26 = new int[] { '4', (byte)0 };
    int i27 = intArrayUtil19.findMinSubArrayLen(0, i_array26);
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
    int i57 = intArrayUtil28.findMinSubArrayLen((int)'#', i_array55);
    int i58 = intArrayUtil19.removeDuplicateElements(i_array55);
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
    int i79 = intArrayUtil60.threeSumClosest(i_array76, (int)(byte)0);
    int i80 = intArrayUtil19.findMinSubArrayLen((int)(short)0, i_array76);
    int i81 = intArrayUtil0.removeDuplicateElements(i_array76);
    int[] i_array82 = null;
    int i83 = intArrayUtil0.removeDuplicateElements(i_array82);
    int[] i_array84 = null;
    int i85 = intArrayUtil0.removeDuplicateElements(i_array84);
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
    org.junit.Assert.assertTrue(i18 == 2);
    
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
    org.junit.Assert.assertTrue(i58 == 2);
    
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
    org.junit.Assert.assertTrue(i79 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == (-1));

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
    int[] i_array16 = new int[] { '4', (byte)0 };
    int i17 = intArrayUtil9.findMinSubArrayLen(0, i_array16);
    int i18 = intArrayUtil0.removeDuplicateElements(i_array16);
    util.IntArrayUtil intArrayUtil20 = new util.IntArrayUtil();
    int[] i_array21 = new int[] {  };
    int i23 = intArrayUtil20.findKthLargestViaQuickSort(i_array21, (-1));
    int[] i_array27 = new int[] { '4', (byte)0 };
    int i28 = intArrayUtil20.findMinSubArrayLen(0, i_array27);
    int i29 = intArrayUtil0.findMinSubArrayLen((int)'#', i_array27);
    int[] i_array33 = new int[] { 2, (short)100, 1 };
    int i35 = intArrayUtil0.findKthLargestViaQuickSort(i_array33, 2);
    int[] i_array39 = new int[] { (short)1, 10, 6 };
    int i40 = intArrayUtil0.findMinViaRecursion(i_array39);
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
    int i80 = intArrayUtil51.findMinSubArrayLen((int)'#', i_array78);
    int i81 = intArrayUtil42.findMinViaIteration(i_array78);
    util.IntArrayUtil intArrayUtil82 = new util.IntArrayUtil();
    int[] i_array83 = new int[] {  };
    int i85 = intArrayUtil82.findKthLargestViaQuickSort(i_array83, (-1));
    int i87 = intArrayUtil42.threeSumClosest(i_array83, (int)(byte)10);
    int i88 = intArrayUtil0.findMinSubArrayLen((int)(short)0, i_array83);
    
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
    org.junit.Assert.assertTrue(i35 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);
    
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
    org.junit.Assert.assertTrue(i81 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == 0);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test42"); }


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
    int i39 = intArrayUtil10.findMinSubArrayLen((int)'#', i_array37);
    int i40 = intArrayUtil1.removeDuplicateElements(i_array37);
    int i42 = intArrayUtil0.threeSumClosest(i_array37, 10);
    int[] i_array43 = null;
    int i44 = intArrayUtil0.removeDuplicateElements(i_array43);
    
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
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test43"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = null;
    intArrayUtil0.getNextPermutationNumber(i_array1);
    util.IntArrayUtil intArrayUtil4 = new util.IntArrayUtil();
    int[] i_array5 = new int[] {  };
    int i7 = intArrayUtil4.findKthLargestViaQuickSort(i_array5, (-1));
    int[] i_array11 = new int[] { '4', (byte)0 };
    int i12 = intArrayUtil4.findMinSubArrayLen(0, i_array11);
    util.IntArrayUtil intArrayUtil14 = new util.IntArrayUtil();
    int[] i_array15 = new int[] {  };
    int i17 = intArrayUtil14.findKthLargestViaQuickSort(i_array15, (-1));
    int i18 = intArrayUtil4.findMinSubArrayLen((int)(byte)-1, i_array15);
    util.IntArrayUtil intArrayUtil20 = new util.IntArrayUtil();
    int[] i_array21 = new int[] {  };
    int i23 = intArrayUtil20.findKthLargestViaQuickSort(i_array21, (-1));
    int[] i_array27 = new int[] { '4', (byte)0 };
    int i28 = intArrayUtil20.findMinSubArrayLen(0, i_array27);
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
    int i49 = intArrayUtil20.findMinSubArrayLen((-1), i_array46);
    int i50 = intArrayUtil4.findMinSubArrayLen((int)(byte)10, i_array46);
    int[] i_array51 = null;
    intArrayUtil4.getNextPermutationNumber(i_array51);
    util.IntArrayUtil intArrayUtil53 = new util.IntArrayUtil();
    int[] i_array54 = new int[] {  };
    int i56 = intArrayUtil53.findKthLargestViaQuickSort(i_array54, (-1));
    int[] i_array60 = new int[] { '4', (byte)0 };
    int i61 = intArrayUtil53.findMinSubArrayLen(0, i_array60);
    util.IntArrayUtil intArrayUtil63 = new util.IntArrayUtil();
    int[] i_array64 = new int[] {  };
    int i66 = intArrayUtil63.findKthLargestViaQuickSort(i_array64, (-1));
    int i67 = intArrayUtil53.findMinSubArrayLen((int)(byte)-1, i_array64);
    util.IntArrayUtil intArrayUtil68 = new util.IntArrayUtil();
    int[] i_array69 = new int[] {  };
    int i71 = intArrayUtil68.findKthLargestViaQuickSort(i_array69, (-1));
    int[] i_array75 = new int[] { '4', (byte)0 };
    int i76 = intArrayUtil68.findMinSubArrayLen(0, i_array75);
    util.IntArrayUtil intArrayUtil78 = new util.IntArrayUtil();
    int[] i_array79 = new int[] {  };
    int i81 = intArrayUtil78.findKthLargestViaQuickSort(i_array79, (-1));
    int i82 = intArrayUtil68.findMinSubArrayLen((int)(byte)-1, i_array79);
    int i84 = intArrayUtil53.threeSumClosest(i_array79, (int)(short)1);
    intArrayUtil4.getNextPermutationNumber(i_array79);
    int i86 = intArrayUtil0.findMinSubArrayLen((int)(short)100, i_array79);
    int[] i_array87 = null;
    int i88 = intArrayUtil0.removeDuplicateElements(i_array87);
    
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
    org.junit.Assert.assertTrue(i49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i84 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i86 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == 0);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test44"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil9 = new util.IntArrayUtil();
    int[] i_array10 = new int[] {  };
    int i12 = intArrayUtil9.findKthLargestViaQuickSort(i_array10, (-1));
    int i13 = intArrayUtil0.findMinViaIteration(i_array10);
    util.IntArrayUtil intArrayUtil14 = new util.IntArrayUtil();
    int[] i_array15 = new int[] {  };
    int i17 = intArrayUtil14.findKthLargestViaQuickSort(i_array15, (-1));
    util.IntArrayUtil intArrayUtil18 = new util.IntArrayUtil();
    int[] i_array19 = new int[] {  };
    int i21 = intArrayUtil18.findKthLargestViaQuickSort(i_array19, (-1));
    int[] i_array25 = new int[] { '4', (byte)0 };
    int i26 = intArrayUtil18.findMinSubArrayLen(0, i_array25);
    util.IntArrayUtil intArrayUtil28 = new util.IntArrayUtil();
    int[] i_array29 = new int[] {  };
    int i31 = intArrayUtil28.findKthLargestViaQuickSort(i_array29, (-1));
    int i32 = intArrayUtil18.findMinSubArrayLen((int)(byte)-1, i_array29);
    int i34 = intArrayUtil14.threeSumClosest(i_array29, (int)(byte)1);
    int i35 = intArrayUtil0.findMinViaIteration(i_array29);
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
    int i55 = intArrayUtil36.threeSumClosest(i_array52, (int)(byte)0);
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
    int i74 = intArrayUtil56.removeDuplicateElements(i_array72);
    util.IntArrayUtil intArrayUtil76 = new util.IntArrayUtil();
    int[] i_array77 = new int[] {  };
    int i79 = intArrayUtil76.findKthLargestViaQuickSort(i_array77, (-1));
    int[] i_array83 = new int[] { '4', (byte)0 };
    int i84 = intArrayUtil76.findMinSubArrayLen(0, i_array83);
    int i85 = intArrayUtil56.findMinSubArrayLen((int)'#', i_array83);
    int i86 = intArrayUtil36.removeDuplicateElements(i_array83);
    int i87 = intArrayUtil0.findMinViaIteration(i_array83);
    int[] i_array89 = null;
    int i90 = intArrayUtil0.findMinSubArrayLen((int)(short)1, i_array89);
    
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
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
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
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == (-1));
    
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
    org.junit.Assert.assertTrue(i85 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i86 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i90 == 0);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test45"); }


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
    int i19 = intArrayUtil0.findMinViaIteration(i_array15);
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
    int i58 = intArrayUtil29.findMinSubArrayLen((int)'#', i_array56);
    int i59 = intArrayUtil20.findMinViaIteration(i_array56);
    util.IntArrayUtil intArrayUtil60 = new util.IntArrayUtil();
    int[] i_array61 = new int[] {  };
    int i63 = intArrayUtil60.findKthLargestViaQuickSort(i_array61, (-1));
    int i65 = intArrayUtil20.threeSumClosest(i_array61, (int)(byte)10);
    int[] i_array67 = null;
    int i68 = intArrayUtil20.findMinSubArrayLen(2, i_array67);
    int[] i_array75 = new int[] { 10, '4', 100, (short)-1, (byte)10, '4' };
    int i76 = intArrayUtil20.removeDuplicateElements(i_array75);
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
    int i96 = intArrayUtil77.threeSumClosest(i_array93, (int)(byte)0);
    int i97 = intArrayUtil20.findMinViaRecursion(i_array93);
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
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-1));
    
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
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 6);
    
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
    org.junit.Assert.assertTrue(i96 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i97 == 0);

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test46"); }


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
    int i40 = intArrayUtil11.findMinSubArrayLen((int)'#', i_array38);
    int i41 = intArrayUtil2.removeDuplicateElements(i_array38);
    int i42 = intArrayUtil0.findMinSubArrayLen((int)(byte)0, i_array38);
    int[] i_array44 = null;
    int i45 = intArrayUtil0.findMinSubArrayLen((int)'4', i_array44);
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
    util.IntArrayUtil intArrayUtil64 = new util.IntArrayUtil();
    int[] i_array65 = new int[] {  };
    int i67 = intArrayUtil64.findKthLargestViaQuickSort(i_array65, (-1));
    int[] i_array71 = new int[] { '4', (byte)0 };
    int i72 = intArrayUtil64.findMinSubArrayLen(0, i_array71);
    int i73 = intArrayUtil55.removeDuplicateElements(i_array71);
    util.IntArrayUtil intArrayUtil75 = new util.IntArrayUtil();
    int[] i_array76 = new int[] {  };
    int i78 = intArrayUtil75.findKthLargestViaQuickSort(i_array76, (-1));
    int[] i_array82 = new int[] { '4', (byte)0 };
    int i83 = intArrayUtil75.findMinSubArrayLen(0, i_array82);
    int i84 = intArrayUtil55.findMinSubArrayLen((int)'#', i_array82);
    int i85 = intArrayUtil46.removeDuplicateElements(i_array82);
    int i86 = intArrayUtil0.findMinViaRecursion(i_array82);
    int[] i_array87 = null;
    int i88 = intArrayUtil0.findMinViaIteration(i_array87);
    
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
    org.junit.Assert.assertNotNull(i_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i84 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i86 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == (-1));

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test47"); }


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
    util.IntArrayUtil intArrayUtil23 = new util.IntArrayUtil();
    int[] i_array24 = new int[] {  };
    int i26 = intArrayUtil23.findKthLargestViaQuickSort(i_array24, (-1));
    int[] i_array30 = new int[] { '4', (byte)0 };
    int i31 = intArrayUtil23.findMinSubArrayLen(0, i_array30);
    util.IntArrayUtil intArrayUtil33 = new util.IntArrayUtil();
    int[] i_array34 = new int[] {  };
    int i36 = intArrayUtil33.findKthLargestViaQuickSort(i_array34, (-1));
    int i37 = intArrayUtil23.findMinSubArrayLen((int)(byte)-1, i_array34);
    int i38 = intArrayUtil19.findMinViaIteration(i_array34);
    int i39 = intArrayUtil0.removeDuplicateElements(i_array34);
    int[] i_array40 = null;
    int i41 = intArrayUtil0.findMinViaIteration(i_array40);
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
    int i61 = intArrayUtil0.removeDuplicateElements(i_array58);
    int[] i_array62 = null;
    int i63 = intArrayUtil0.findMinViaIteration(i_array62);
    
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
    org.junit.Assert.assertTrue(i38 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == (-1));
    
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
    org.junit.Assert.assertTrue(i61 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == (-1));

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
    int i50 = intArrayUtil31.threeSumClosest(i_array47, (int)(byte)0);
    int i52 = intArrayUtil16.threeSumClosest(i_array47, (int)'a');
    int i53 = intArrayUtil0.findMinSubArrayLen(6, i_array47);
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
    int i83 = intArrayUtil54.findMinSubArrayLen((int)'#', i_array81);
    int i84 = intArrayUtil0.removeDuplicateElements(i_array81);
    int[] i_array85 = null;
    int i87 = intArrayUtil0.findKthLargestViaQuickSort(i_array85, (int)(short)10);
    
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
    org.junit.Assert.assertTrue(i84 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 0);

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test49"); }


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
    int i29 = intArrayUtil0.findMinSubArrayLen((int)'#', i_array27);
    int[] i_array33 = new int[] { 2, (short)100, 1 };
    int i35 = intArrayUtil0.findKthLargestViaQuickSort(i_array33, 2);
    int[] i_array36 = null;
    int i37 = intArrayUtil0.findMinViaIteration(i_array36);
    util.IntArrayUtil intArrayUtil38 = new util.IntArrayUtil();
    int[] i_array39 = new int[] {  };
    int i41 = intArrayUtil38.findKthLargestViaQuickSort(i_array39, (-1));
    util.IntArrayUtil intArrayUtil42 = new util.IntArrayUtil();
    int[] i_array43 = new int[] {  };
    int i45 = intArrayUtil42.findKthLargestViaQuickSort(i_array43, (-1));
    int[] i_array49 = new int[] { '4', (byte)0 };
    int i50 = intArrayUtil42.findMinSubArrayLen(0, i_array49);
    util.IntArrayUtil intArrayUtil52 = new util.IntArrayUtil();
    int[] i_array53 = new int[] {  };
    int i55 = intArrayUtil52.findKthLargestViaQuickSort(i_array53, (-1));
    int i56 = intArrayUtil42.findMinSubArrayLen((int)(byte)-1, i_array53);
    int i58 = intArrayUtil38.threeSumClosest(i_array53, (int)(byte)1);
    util.IntArrayUtil intArrayUtil59 = new util.IntArrayUtil();
    int[] i_array60 = new int[] {  };
    int i62 = intArrayUtil59.findKthLargestViaQuickSort(i_array60, (-1));
    int[] i_array66 = new int[] { '4', (byte)0 };
    int i67 = intArrayUtil59.findMinSubArrayLen(0, i_array66);
    util.IntArrayUtil intArrayUtil69 = new util.IntArrayUtil();
    int[] i_array70 = new int[] {  };
    int i72 = intArrayUtil69.findKthLargestViaQuickSort(i_array70, (-1));
    int[] i_array76 = new int[] { '4', (byte)0 };
    int i77 = intArrayUtil69.findMinSubArrayLen(0, i_array76);
    util.IntArrayUtil intArrayUtil78 = new util.IntArrayUtil();
    int[] i_array79 = new int[] {  };
    int i81 = intArrayUtil78.findKthLargestViaQuickSort(i_array79, (-1));
    int[] i_array85 = new int[] { '4', (byte)0 };
    int i86 = intArrayUtil78.findMinSubArrayLen(0, i_array85);
    int i87 = intArrayUtil69.removeDuplicateElements(i_array85);
    int i88 = intArrayUtil59.findMinSubArrayLen((-1), i_array85);
    int i89 = intArrayUtil38.removeDuplicateElements(i_array85);
    int i91 = intArrayUtil0.threeSumClosest(i_array85, 52);
    
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
    org.junit.Assert.assertTrue(i35 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == (-1));
    
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
    org.junit.Assert.assertNotNull(i_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
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
    org.junit.Assert.assertNotNull(i_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i86 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i89 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i91 == 0);

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
    int i18 = intArrayUtil0.removeDuplicateElements(i_array16);
    util.IntArrayUtil intArrayUtil20 = new util.IntArrayUtil();
    int[] i_array21 = new int[] {  };
    int i23 = intArrayUtil20.findKthLargestViaQuickSort(i_array21, (-1));
    int[] i_array27 = new int[] { '4', (byte)0 };
    int i28 = intArrayUtil20.findMinSubArrayLen(0, i_array27);
    int i29 = intArrayUtil0.findMinSubArrayLen((int)'#', i_array27);
    util.IntArrayUtil intArrayUtil30 = new util.IntArrayUtil();
    int[] i_array31 = new int[] {  };
    int i33 = intArrayUtil30.findKthLargestViaQuickSort(i_array31, (-1));
    int[] i_array37 = new int[] { '4', (byte)0 };
    int i38 = intArrayUtil30.findMinSubArrayLen(0, i_array37);
    intArrayUtil0.getNextPermutationNumber(i_array37);
    int[] i_array40 = null;
    int i41 = intArrayUtil0.removeDuplicateElements(i_array40);
    int[] i_array42 = null;
    int i43 = intArrayUtil0.findMinViaIteration(i_array42);
    
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
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == (-1));

  }

  @Test
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test51"); }


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
    int i20 = intArrayUtil0.threeSumClosest(i_array15, (int)(byte)1);
    util.IntArrayUtil intArrayUtil21 = new util.IntArrayUtil();
    int[] i_array22 = new int[] {  };
    int i24 = intArrayUtil21.findKthLargestViaQuickSort(i_array22, (-1));
    util.IntArrayUtil intArrayUtil25 = new util.IntArrayUtil();
    int[] i_array26 = new int[] {  };
    int i28 = intArrayUtil25.findKthLargestViaQuickSort(i_array26, (-1));
    int[] i_array32 = new int[] { '4', (byte)0 };
    int i33 = intArrayUtil25.findMinSubArrayLen(0, i_array32);
    util.IntArrayUtil intArrayUtil35 = new util.IntArrayUtil();
    int[] i_array36 = new int[] {  };
    int i38 = intArrayUtil35.findKthLargestViaQuickSort(i_array36, (-1));
    int i39 = intArrayUtil25.findMinSubArrayLen((int)(byte)-1, i_array36);
    int i41 = intArrayUtil21.threeSumClosest(i_array36, (int)(byte)1);
    intArrayUtil0.getNextPermutationNumber(i_array36);
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
    int i91 = intArrayUtil62.findMinSubArrayLen((int)'#', i_array89);
    int i93 = intArrayUtil43.findKthLargestViaQuickSort(i_array89, 1);
    int i95 = intArrayUtil0.threeSumClosest(i_array89, (int)(byte)-1);
    int[] i_array96 = null;
    int i97 = intArrayUtil0.removeDuplicateElements(i_array96);
    
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
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
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
    org.junit.Assert.assertTrue(i93 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i95 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i97 == 0);

  }

  @Test
  public void test52() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test52"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    int[] i_array7 = new int[] { '4', (byte)0 };
    int i8 = intArrayUtil0.findMinSubArrayLen(0, i_array7);
    util.IntArrayUtil intArrayUtil10 = new util.IntArrayUtil();
    int[] i_array11 = new int[] {  };
    int i13 = intArrayUtil10.findKthLargestViaQuickSort(i_array11, (-1));
    int i14 = intArrayUtil0.findMinSubArrayLen((int)(byte)-1, i_array11);
    int[] i_array15 = null;
    int i17 = intArrayUtil0.findKthLargestViaQuickSort(i_array15, (int)(short)-1);
    util.IntArrayUtil intArrayUtil18 = new util.IntArrayUtil();
    int[] i_array19 = new int[] {  };
    int i21 = intArrayUtil18.findKthLargestViaQuickSort(i_array19, (-1));
    int[] i_array25 = new int[] { '4', (byte)0 };
    int i26 = intArrayUtil18.findMinSubArrayLen(0, i_array25);
    int i27 = intArrayUtil0.removeDuplicateElements(i_array25);
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
    intArrayUtil0.getNextPermutationNumber(i_array44);
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
    util.IntArrayUtil intArrayUtil72 = new util.IntArrayUtil();
    int[] i_array73 = new int[] {  };
    int i75 = intArrayUtil72.findKthLargestViaQuickSort(i_array73, (-1));
    int[] i_array79 = new int[] { '4', (byte)0 };
    int i80 = intArrayUtil72.findMinSubArrayLen(0, i_array79);
    int i82 = intArrayUtil63.threeSumClosest(i_array79, (int)(byte)0);
    int i84 = intArrayUtil48.threeSumClosest(i_array79, (int)'a');
    int i85 = intArrayUtil0.findMinViaRecursion(i_array79);
    
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
    org.junit.Assert.assertTrue(i27 == 2);
    
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
    org.junit.Assert.assertNotNull(i_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i84 == 0);
    
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
    int i29 = intArrayUtil0.findMinSubArrayLen((int)'#', i_array27);
    util.IntArrayUtil intArrayUtil30 = new util.IntArrayUtil();
    int[] i_array31 = new int[] {  };
    int i33 = intArrayUtil30.findKthLargestViaQuickSort(i_array31, (-1));
    int[] i_array37 = new int[] { '4', (byte)0 };
    int i38 = intArrayUtil30.findMinSubArrayLen(0, i_array37);
    intArrayUtil0.getNextPermutationNumber(i_array37);
    int[] i_array42 = new int[] { (byte)0, (byte)10 };
    int i44 = intArrayUtil0.threeSumClosest(i_array42, (int)'#');
    util.IntArrayUtil intArrayUtil45 = new util.IntArrayUtil();
    int[] i_array46 = new int[] {  };
    int i48 = intArrayUtil45.findKthLargestViaQuickSort(i_array46, (-1));
    int[] i_array52 = new int[] { '4', (byte)0 };
    int i53 = intArrayUtil45.findMinSubArrayLen(0, i_array52);
    util.IntArrayUtil intArrayUtil55 = new util.IntArrayUtil();
    int[] i_array56 = new int[] {  };
    int i58 = intArrayUtil55.findKthLargestViaQuickSort(i_array56, (-1));
    int i59 = intArrayUtil45.findMinSubArrayLen((int)(byte)-1, i_array56);
    int i60 = intArrayUtil0.removeDuplicateElements(i_array56);
    int[] i_array62 = null;
    int i63 = intArrayUtil0.findMinSubArrayLen(2, i_array62);
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
    int i82 = intArrayUtil64.removeDuplicateElements(i_array80);
    int i83 = intArrayUtil0.findMinViaRecursion(i_array80);
    util.IntArrayUtil intArrayUtil84 = new util.IntArrayUtil();
    int[] i_array85 = new int[] {  };
    int i87 = intArrayUtil84.findKthLargestViaQuickSort(i_array85, (-1));
    int[] i_array91 = new int[] { '4', (byte)0 };
    int i92 = intArrayUtil84.findMinSubArrayLen(0, i_array91);
    util.IntArrayUtil intArrayUtil94 = new util.IntArrayUtil();
    int[] i_array95 = new int[] {  };
    int i97 = intArrayUtil94.findKthLargestViaQuickSort(i_array95, (-1));
    int i98 = intArrayUtil84.findMinSubArrayLen((int)(byte)-1, i_array95);
    int i99 = intArrayUtil0.removeDuplicateElements(i_array95);
    
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
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);
    
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
    org.junit.Assert.assertTrue(i82 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i92 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array95);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i97 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i98 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i99 == 0);

  }

  @Test
  public void test54() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test54"); }


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
    int i20 = intArrayUtil0.threeSumClosest(i_array15, (int)(byte)1);
    int[] i_array21 = null;
    int i22 = intArrayUtil0.removeDuplicateElements(i_array21);
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
    int i61 = intArrayUtil32.findMinSubArrayLen((int)'#', i_array59);
    int i62 = intArrayUtil23.findMinViaIteration(i_array59);
    util.IntArrayUtil intArrayUtil63 = new util.IntArrayUtil();
    int[] i_array64 = new int[] {  };
    int i66 = intArrayUtil63.findKthLargestViaQuickSort(i_array64, (-1));
    int i68 = intArrayUtil23.threeSumClosest(i_array64, (int)(byte)10);
    int[] i_array70 = null;
    int i71 = intArrayUtil23.findMinSubArrayLen(2, i_array70);
    util.IntArrayUtil intArrayUtil72 = new util.IntArrayUtil();
    int[] i_array73 = new int[] {  };
    int i75 = intArrayUtil72.findKthLargestViaQuickSort(i_array73, (-1));
    int[] i_array79 = new int[] { '4', (byte)0 };
    int i80 = intArrayUtil72.findMinSubArrayLen(0, i_array79);
    int i81 = intArrayUtil23.findMinViaRecursion(i_array79);
    int i83 = intArrayUtil0.threeSumClosest(i_array79, 5);
    
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
    org.junit.Assert.assertTrue(i20 == 0);
    
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
    org.junit.Assert.assertTrue(i62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 0);
    
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
    org.junit.Assert.assertTrue(i81 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 0);

  }

  @Test
  public void test55() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test55"); }


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
    int i19 = intArrayUtil0.threeSumClosest(i_array16, (int)(byte)0);
    int[] i_array20 = null;
    intArrayUtil0.getNextPermutationNumber(i_array20);
    util.IntArrayUtil intArrayUtil22 = new util.IntArrayUtil();
    util.IntArrayUtil intArrayUtil23 = new util.IntArrayUtil();
    int[] i_array24 = new int[] {  };
    int i26 = intArrayUtil23.findKthLargestViaQuickSort(i_array24, (-1));
    int[] i_array30 = new int[] { '4', (byte)0 };
    int i31 = intArrayUtil23.findMinSubArrayLen(0, i_array30);
    util.IntArrayUtil intArrayUtil33 = new util.IntArrayUtil();
    int[] i_array34 = new int[] {  };
    int i36 = intArrayUtil33.findKthLargestViaQuickSort(i_array34, (-1));
    int i37 = intArrayUtil23.findMinSubArrayLen((int)(byte)-1, i_array34);
    int[] i_array38 = null;
    int i40 = intArrayUtil23.findKthLargestViaQuickSort(i_array38, (int)(short)-1);
    int[] i_array46 = new int[] { 1, 6, (byte)0, 1 };
    int i47 = intArrayUtil23.findMinSubArrayLen((int)(short)0, i_array46);
    intArrayUtil22.getNextPermutationNumber(i_array46);
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
    util.IntArrayUtil intArrayUtil67 = new util.IntArrayUtil();
    int[] i_array68 = new int[] {  };
    int i70 = intArrayUtil67.findKthLargestViaQuickSort(i_array68, (-1));
    int[] i_array74 = new int[] { '4', (byte)0 };
    int i75 = intArrayUtil67.findMinSubArrayLen(0, i_array74);
    int i76 = intArrayUtil58.removeDuplicateElements(i_array74);
    util.IntArrayUtil intArrayUtil78 = new util.IntArrayUtil();
    int[] i_array79 = new int[] {  };
    int i81 = intArrayUtil78.findKthLargestViaQuickSort(i_array79, (-1));
    int[] i_array85 = new int[] { '4', (byte)0 };
    int i86 = intArrayUtil78.findMinSubArrayLen(0, i_array85);
    int i87 = intArrayUtil58.findMinSubArrayLen((int)'#', i_array85);
    int i88 = intArrayUtil49.findMinViaIteration(i_array85);
    util.IntArrayUtil intArrayUtil89 = new util.IntArrayUtil();
    int[] i_array90 = new int[] {  };
    int i92 = intArrayUtil89.findKthLargestViaQuickSort(i_array90, (-1));
    int i94 = intArrayUtil49.threeSumClosest(i_array90, (int)(byte)10);
    int i95 = intArrayUtil22.findMinViaIteration(i_array90);
    intArrayUtil0.getNextPermutationNumber(i_array90);
    
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
    org.junit.Assert.assertTrue(i40 == 0);
    
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
    org.junit.Assert.assertNotNull(i_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i86 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i92 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i94 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i95 == (-1));

  }

  @Test
  public void test56() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test56"); }


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
    int[] i_array19 = null;
    int i21 = intArrayUtil4.findKthLargestViaQuickSort(i_array19, (int)(short)-1);
    int[] i_array27 = new int[] { 1, 6, (byte)0, 1 };
    int i28 = intArrayUtil4.findMinSubArrayLen((int)(short)0, i_array27);
    int[] i_array29 = null;
    int i30 = intArrayUtil4.removeDuplicateElements(i_array29);
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
    util.IntArrayUtil intArrayUtil49 = new util.IntArrayUtil();
    int[] i_array50 = new int[] {  };
    int i52 = intArrayUtil49.findKthLargestViaQuickSort(i_array50, (-1));
    int[] i_array56 = new int[] { '4', (byte)0 };
    int i57 = intArrayUtil49.findMinSubArrayLen(0, i_array56);
    int i58 = intArrayUtil40.removeDuplicateElements(i_array56);
    util.IntArrayUtil intArrayUtil60 = new util.IntArrayUtil();
    int[] i_array61 = new int[] {  };
    int i63 = intArrayUtil60.findKthLargestViaQuickSort(i_array61, (-1));
    int[] i_array67 = new int[] { '4', (byte)0 };
    int i68 = intArrayUtil60.findMinSubArrayLen(0, i_array67);
    int i69 = intArrayUtil40.findMinSubArrayLen((int)'#', i_array67);
    int i70 = intArrayUtil31.findMinViaIteration(i_array67);
    util.IntArrayUtil intArrayUtil71 = new util.IntArrayUtil();
    int[] i_array72 = new int[] {  };
    int i74 = intArrayUtil71.findKthLargestViaQuickSort(i_array72, (-1));
    int i76 = intArrayUtil31.threeSumClosest(i_array72, (int)(byte)10);
    int[] i_array78 = null;
    int i79 = intArrayUtil31.findMinSubArrayLen(2, i_array78);
    int[] i_array86 = new int[] { 10, '4', 100, (short)-1, (byte)10, '4' };
    int i87 = intArrayUtil31.removeDuplicateElements(i_array86);
    intArrayUtil4.getNextPermutationNumber(i_array86);
    intArrayUtil0.getNextPermutationNumber(i_array86);
    
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
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
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
    org.junit.Assert.assertNotNull(i_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 6);

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
    int i38 = intArrayUtil9.findMinSubArrayLen((int)'#', i_array36);
    int i39 = intArrayUtil0.findMinViaIteration(i_array36);
    util.IntArrayUtil intArrayUtil40 = new util.IntArrayUtil();
    int[] i_array41 = new int[] {  };
    int i43 = intArrayUtil40.findKthLargestViaQuickSort(i_array41, (-1));
    int[] i_array47 = new int[] { '4', (byte)0 };
    int i48 = intArrayUtil40.findMinSubArrayLen(0, i_array47);
    util.IntArrayUtil intArrayUtil50 = new util.IntArrayUtil();
    int[] i_array51 = new int[] {  };
    int i53 = intArrayUtil50.findKthLargestViaQuickSort(i_array51, (-1));
    int i54 = intArrayUtil40.findMinSubArrayLen((int)(byte)-1, i_array51);
    util.IntArrayUtil intArrayUtil56 = new util.IntArrayUtil();
    int[] i_array57 = new int[] {  };
    int i59 = intArrayUtil56.findKthLargestViaQuickSort(i_array57, (-1));
    int[] i_array63 = new int[] { '4', (byte)0 };
    int i64 = intArrayUtil56.findMinSubArrayLen(0, i_array63);
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
    int i85 = intArrayUtil56.findMinSubArrayLen((-1), i_array82);
    int i86 = intArrayUtil40.findMinSubArrayLen((int)(byte)10, i_array82);
    int i88 = intArrayUtil0.findKthLargestViaQuickSort(i_array82, (-1));
    int[] i_array89 = null;
    int i91 = intArrayUtil0.findKthLargestViaQuickSort(i_array89, (int)(byte)10);
    
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
    org.junit.Assert.assertNotNull(i_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 1);
    
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
    org.junit.Assert.assertTrue(i86 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i91 == 0);

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
    int i18 = intArrayUtil0.removeDuplicateElements(i_array16);
    util.IntArrayUtil intArrayUtil20 = new util.IntArrayUtil();
    int[] i_array21 = new int[] {  };
    int i23 = intArrayUtil20.findKthLargestViaQuickSort(i_array21, (-1));
    int[] i_array27 = new int[] { '4', (byte)0 };
    int i28 = intArrayUtil20.findMinSubArrayLen(0, i_array27);
    int i29 = intArrayUtil0.findMinSubArrayLen((int)'#', i_array27);
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
    int i50 = intArrayUtil0.threeSumClosest(i_array46, (int)(byte)-1);
    int[] i_array57 = new int[] { 100, 'a', 1, (short)0, 'a' };
    int i58 = intArrayUtil0.findMinSubArrayLen((int)(byte)100, i_array57);
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
    util.IntArrayUtil intArrayUtil77 = new util.IntArrayUtil();
    int[] i_array78 = new int[] {  };
    int i80 = intArrayUtil77.findKthLargestViaQuickSort(i_array78, (-1));
    int[] i_array84 = new int[] { '4', (byte)0 };
    int i85 = intArrayUtil77.findMinSubArrayLen(0, i_array84);
    int i86 = intArrayUtil68.removeDuplicateElements(i_array84);
    util.IntArrayUtil intArrayUtil88 = new util.IntArrayUtil();
    int[] i_array89 = new int[] {  };
    int i91 = intArrayUtil88.findKthLargestViaQuickSort(i_array89, (-1));
    int[] i_array95 = new int[] { '4', (byte)0 };
    int i96 = intArrayUtil88.findMinSubArrayLen(0, i_array95);
    int i97 = intArrayUtil68.findMinSubArrayLen((int)'#', i_array95);
    int i98 = intArrayUtil59.removeDuplicateElements(i_array95);
    int i99 = intArrayUtil0.removeDuplicateElements(i_array95);
    
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
    org.junit.Assert.assertNotNull(i_array89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i91 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array95);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i96 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i97 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i98 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i99 == 2);

  }

  @Test
  public void test59() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test59"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = null;
    intArrayUtil0.getNextPermutationNumber(i_array1);
    util.IntArrayUtil intArrayUtil3 = new util.IntArrayUtil();
    int[] i_array4 = new int[] {  };
    int i6 = intArrayUtil3.findKthLargestViaQuickSort(i_array4, (-1));
    int[] i_array10 = new int[] { '4', (byte)0 };
    int i11 = intArrayUtil3.findMinSubArrayLen(0, i_array10);
    util.IntArrayUtil intArrayUtil12 = new util.IntArrayUtil();
    int[] i_array13 = new int[] {  };
    int i15 = intArrayUtil12.findKthLargestViaQuickSort(i_array13, (-1));
    int[] i_array19 = new int[] { '4', (byte)0 };
    int i20 = intArrayUtil12.findMinSubArrayLen(0, i_array19);
    util.IntArrayUtil intArrayUtil21 = new util.IntArrayUtil();
    int[] i_array22 = new int[] {  };
    int i24 = intArrayUtil21.findKthLargestViaQuickSort(i_array22, (-1));
    int[] i_array28 = new int[] { '4', (byte)0 };
    int i29 = intArrayUtil21.findMinSubArrayLen(0, i_array28);
    int i30 = intArrayUtil12.removeDuplicateElements(i_array28);
    util.IntArrayUtil intArrayUtil32 = new util.IntArrayUtil();
    int[] i_array33 = new int[] {  };
    int i35 = intArrayUtil32.findKthLargestViaQuickSort(i_array33, (-1));
    int[] i_array39 = new int[] { '4', (byte)0 };
    int i40 = intArrayUtil32.findMinSubArrayLen(0, i_array39);
    int i41 = intArrayUtil12.findMinSubArrayLen((int)'#', i_array39);
    int i42 = intArrayUtil3.removeDuplicateElements(i_array39);
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
    int i63 = intArrayUtil44.threeSumClosest(i_array60, (int)(byte)0);
    int i64 = intArrayUtil3.findMinSubArrayLen((int)(short)0, i_array60);
    int i65 = intArrayUtil0.removeDuplicateElements(i_array60);
    int[] i_array66 = null;
    int i67 = intArrayUtil0.findMinViaIteration(i_array66);
    int[] i_array68 = null;
    int i69 = intArrayUtil0.removeDuplicateElements(i_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);
    
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
    org.junit.Assert.assertNotNull(i_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 0);

  }

  @Test
  public void test60() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test60"); }


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
    int i20 = intArrayUtil0.threeSumClosest(i_array15, (int)(byte)1);
    util.IntArrayUtil intArrayUtil21 = new util.IntArrayUtil();
    int[] i_array22 = new int[] {  };
    int i24 = intArrayUtil21.findKthLargestViaQuickSort(i_array22, (-1));
    util.IntArrayUtil intArrayUtil25 = new util.IntArrayUtil();
    int[] i_array26 = new int[] {  };
    int i28 = intArrayUtil25.findKthLargestViaQuickSort(i_array26, (-1));
    int[] i_array32 = new int[] { '4', (byte)0 };
    int i33 = intArrayUtil25.findMinSubArrayLen(0, i_array32);
    util.IntArrayUtil intArrayUtil35 = new util.IntArrayUtil();
    int[] i_array36 = new int[] {  };
    int i38 = intArrayUtil35.findKthLargestViaQuickSort(i_array36, (-1));
    int i39 = intArrayUtil25.findMinSubArrayLen((int)(byte)-1, i_array36);
    int i41 = intArrayUtil21.threeSumClosest(i_array36, (int)(byte)1);
    intArrayUtil0.getNextPermutationNumber(i_array36);
    util.IntArrayUtil intArrayUtil43 = new util.IntArrayUtil();
    int[] i_array44 = new int[] {  };
    int i46 = intArrayUtil43.findKthLargestViaQuickSort(i_array44, (-1));
    int[] i_array50 = new int[] { '4', (byte)0 };
    int i51 = intArrayUtil43.findMinSubArrayLen(0, i_array50);
    util.IntArrayUtil intArrayUtil52 = new util.IntArrayUtil();
    int[] i_array53 = new int[] {  };
    int i55 = intArrayUtil52.findKthLargestViaQuickSort(i_array53, (-1));
    int i56 = intArrayUtil43.findMinViaIteration(i_array53);
    int i57 = intArrayUtil0.findMinViaIteration(i_array53);
    util.IntArrayUtil intArrayUtil58 = new util.IntArrayUtil();
    util.IntArrayUtil intArrayUtil59 = new util.IntArrayUtil();
    int[] i_array60 = new int[] {  };
    int i62 = intArrayUtil59.findKthLargestViaQuickSort(i_array60, (-1));
    int[] i_array66 = new int[] { '4', (byte)0 };
    int i67 = intArrayUtil59.findMinSubArrayLen(0, i_array66);
    util.IntArrayUtil intArrayUtil69 = new util.IntArrayUtil();
    int[] i_array70 = new int[] {  };
    int i72 = intArrayUtil69.findKthLargestViaQuickSort(i_array70, (-1));
    int i73 = intArrayUtil59.findMinSubArrayLen((int)(byte)-1, i_array70);
    int[] i_array74 = null;
    int i76 = intArrayUtil59.findKthLargestViaQuickSort(i_array74, (int)(short)-1);
    int[] i_array82 = new int[] { 1, 6, (byte)0, 1 };
    int i83 = intArrayUtil59.findMinSubArrayLen((int)(short)0, i_array82);
    intArrayUtil58.getNextPermutationNumber(i_array82);
    intArrayUtil0.getNextPermutationNumber(i_array82);
    
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
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
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
    org.junit.Assert.assertTrue(i56 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == (-1));
    
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
    org.junit.Assert.assertTrue(i76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 1);

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
    int i18 = intArrayUtil0.removeDuplicateElements(i_array16);
    util.IntArrayUtil intArrayUtil20 = new util.IntArrayUtil();
    int[] i_array21 = new int[] {  };
    int i23 = intArrayUtil20.findKthLargestViaQuickSort(i_array21, (-1));
    int[] i_array27 = new int[] { '4', (byte)0 };
    int i28 = intArrayUtil20.findMinSubArrayLen(0, i_array27);
    int i29 = intArrayUtil0.findMinSubArrayLen((int)'#', i_array27);
    util.IntArrayUtil intArrayUtil30 = new util.IntArrayUtil();
    int[] i_array31 = new int[] {  };
    int i33 = intArrayUtil30.findKthLargestViaQuickSort(i_array31, (-1));
    int[] i_array37 = new int[] { '4', (byte)0 };
    int i38 = intArrayUtil30.findMinSubArrayLen(0, i_array37);
    intArrayUtil0.getNextPermutationNumber(i_array37);
    util.IntArrayUtil intArrayUtil41 = new util.IntArrayUtil();
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
    int i80 = intArrayUtil51.findMinSubArrayLen((int)'#', i_array78);
    int i81 = intArrayUtil42.findMinViaIteration(i_array78);
    int i82 = intArrayUtil41.removeDuplicateElements(i_array78);
    int i83 = intArrayUtil0.findMinSubArrayLen(100, i_array78);
    int[] i_array84 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i86 = intArrayUtil0.threeSumClosest(i_array84, (int)(byte)10);
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
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
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
    org.junit.Assert.assertTrue(i81 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 0);

  }

  @Test
  public void test62() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test62"); }


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
    int i19 = intArrayUtil0.threeSumClosest(i_array16, (int)(byte)0);
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
    int i58 = intArrayUtil29.findMinSubArrayLen((int)'#', i_array56);
    int i59 = intArrayUtil20.removeDuplicateElements(i_array56);
    util.IntArrayUtil intArrayUtil60 = new util.IntArrayUtil();
    int[] i_array61 = new int[] {  };
    int i63 = intArrayUtil60.findKthLargestViaQuickSort(i_array61, (-1));
    int i64 = intArrayUtil20.removeDuplicateElements(i_array61);
    util.IntArrayUtil intArrayUtil65 = new util.IntArrayUtil();
    int[] i_array66 = new int[] {  };
    int i68 = intArrayUtil65.findKthLargestViaQuickSort(i_array66, (-1));
    int i69 = intArrayUtil20.findMinViaIteration(i_array66);
    int i71 = intArrayUtil0.threeSumClosest(i_array66, (int)(byte)1);
    int[] i_array72 = null;
    intArrayUtil0.getNextPermutationNumber(i_array72);
    
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
    org.junit.Assert.assertNotNull(i_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);

  }

  @Test
  public void test63() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test63"); }


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
    int i44 = intArrayUtil26.removeDuplicateElements(i_array42);
    int i45 = intArrayUtil16.findMinSubArrayLen((-1), i_array42);
    int i46 = intArrayUtil0.findMinSubArrayLen((int)(byte)10, i_array42);
    int[] i_array47 = null;
    intArrayUtil0.getNextPermutationNumber(i_array47);
    int[] i_array49 = null;
    intArrayUtil0.getNextPermutationNumber(i_array49);
    util.IntArrayUtil intArrayUtil51 = new util.IntArrayUtil();
    int[] i_array52 = new int[] {  };
    int i54 = intArrayUtil51.findKthLargestViaQuickSort(i_array52, (-1));
    int[] i_array58 = new int[] { '4', (byte)0 };
    int i59 = intArrayUtil51.findMinSubArrayLen(0, i_array58);
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
    int i79 = intArrayUtil61.removeDuplicateElements(i_array77);
    int i80 = intArrayUtil51.findMinSubArrayLen((-1), i_array77);
    int i82 = intArrayUtil0.findKthLargestViaQuickSort(i_array77, (int)(byte)-1);
    
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
    org.junit.Assert.assertTrue(i44 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 1);
    
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
    org.junit.Assert.assertTrue(i79 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 0);

  }

  @Test
  public void test64() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test64"); }


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
    int[] i_array26 = new int[] { '4', (byte)0 };
    int i27 = intArrayUtil19.findMinSubArrayLen(0, i_array26);
    util.IntArrayUtil intArrayUtil29 = new util.IntArrayUtil();
    int[] i_array30 = new int[] {  };
    int i32 = intArrayUtil29.findKthLargestViaQuickSort(i_array30, (-1));
    int i33 = intArrayUtil19.findMinSubArrayLen((int)(byte)-1, i_array30);
    util.IntArrayUtil intArrayUtil34 = new util.IntArrayUtil();
    int[] i_array35 = new int[] {  };
    int i37 = intArrayUtil34.findKthLargestViaQuickSort(i_array35, (-1));
    int[] i_array41 = new int[] { '4', (byte)0 };
    int i42 = intArrayUtil34.findMinSubArrayLen(0, i_array41);
    util.IntArrayUtil intArrayUtil43 = new util.IntArrayUtil();
    int[] i_array44 = new int[] {  };
    int i46 = intArrayUtil43.findKthLargestViaQuickSort(i_array44, (-1));
    int[] i_array50 = new int[] { '4', (byte)0 };
    int i51 = intArrayUtil43.findMinSubArrayLen(0, i_array50);
    int i53 = intArrayUtil34.threeSumClosest(i_array50, (int)(byte)0);
    int i55 = intArrayUtil19.threeSumClosest(i_array50, (int)'a');
    int i57 = intArrayUtil0.findKthLargestViaQuickSort(i_array50, (int)(byte)-1);
    util.IntArrayUtil intArrayUtil58 = new util.IntArrayUtil();
    int[] i_array59 = new int[] {  };
    int i61 = intArrayUtil58.findKthLargestViaQuickSort(i_array59, (-1));
    int i62 = intArrayUtil0.removeDuplicateElements(i_array59);
    int[] i_array63 = null;
    intArrayUtil0.getNextPermutationNumber(i_array63);
    
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
    org.junit.Assert.assertNotNull(i_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
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
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 0);

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
    util.IntArrayUtil intArrayUtil34 = new util.IntArrayUtil();
    int[] i_array35 = new int[] {  };
    int i37 = intArrayUtil34.findKthLargestViaQuickSort(i_array35, (-1));
    int[] i_array41 = new int[] { '4', (byte)0 };
    int i42 = intArrayUtil34.findMinSubArrayLen(0, i_array41);
    int i43 = intArrayUtil25.removeDuplicateElements(i_array41);
    util.IntArrayUtil intArrayUtil45 = new util.IntArrayUtil();
    int[] i_array46 = new int[] {  };
    int i48 = intArrayUtil45.findKthLargestViaQuickSort(i_array46, (-1));
    int[] i_array52 = new int[] { '4', (byte)0 };
    int i53 = intArrayUtil45.findMinSubArrayLen(0, i_array52);
    int i54 = intArrayUtil25.findMinSubArrayLen((int)'#', i_array52);
    int i55 = intArrayUtil16.findMinViaIteration(i_array52);
    intArrayUtil15.getNextPermutationNumber(i_array52);
    int i57 = intArrayUtil0.removeDuplicateElements(i_array52);
    util.IntArrayUtil intArrayUtil58 = new util.IntArrayUtil();
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
    int i78 = intArrayUtil59.threeSumClosest(i_array75, (int)(byte)0);
    intArrayUtil58.getNextPermutationNumber(i_array75);
    int i80 = intArrayUtil0.removeDuplicateElements(i_array75);
    
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
    org.junit.Assert.assertNotNull(i_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
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
    org.junit.Assert.assertTrue(i80 == 2);

  }

  @Test
  public void test66() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test66"); }


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
    int i38 = intArrayUtil9.findMinSubArrayLen((int)'#', i_array36);
    int i39 = intArrayUtil0.removeDuplicateElements(i_array36);
    util.IntArrayUtil intArrayUtil40 = new util.IntArrayUtil();
    int[] i_array41 = new int[] {  };
    int i43 = intArrayUtil40.findKthLargestViaQuickSort(i_array41, (-1));
    int i44 = intArrayUtil0.removeDuplicateElements(i_array41);
    util.IntArrayUtil intArrayUtil45 = new util.IntArrayUtil();
    int[] i_array46 = new int[] {  };
    int i48 = intArrayUtil45.findKthLargestViaQuickSort(i_array46, (-1));
    int i49 = intArrayUtil0.findMinViaIteration(i_array46);
    util.IntArrayUtil intArrayUtil50 = new util.IntArrayUtil();
    int[] i_array51 = new int[] {  };
    int i53 = intArrayUtil50.findKthLargestViaQuickSort(i_array51, (-1));
    util.IntArrayUtil intArrayUtil54 = new util.IntArrayUtil();
    int[] i_array55 = new int[] {  };
    int i57 = intArrayUtil54.findKthLargestViaQuickSort(i_array55, (-1));
    int[] i_array61 = new int[] { '4', (byte)0 };
    int i62 = intArrayUtil54.findMinSubArrayLen(0, i_array61);
    util.IntArrayUtil intArrayUtil64 = new util.IntArrayUtil();
    int[] i_array65 = new int[] {  };
    int i67 = intArrayUtil64.findKthLargestViaQuickSort(i_array65, (-1));
    int i68 = intArrayUtil54.findMinSubArrayLen((int)(byte)-1, i_array65);
    int i70 = intArrayUtil50.threeSumClosest(i_array65, (int)(byte)1);
    util.IntArrayUtil intArrayUtil71 = new util.IntArrayUtil();
    int[] i_array72 = new int[] {  };
    int i74 = intArrayUtil71.findKthLargestViaQuickSort(i_array72, (-1));
    util.IntArrayUtil intArrayUtil75 = new util.IntArrayUtil();
    int[] i_array76 = new int[] {  };
    int i78 = intArrayUtil75.findKthLargestViaQuickSort(i_array76, (-1));
    int[] i_array82 = new int[] { '4', (byte)0 };
    int i83 = intArrayUtil75.findMinSubArrayLen(0, i_array82);
    util.IntArrayUtil intArrayUtil85 = new util.IntArrayUtil();
    int[] i_array86 = new int[] {  };
    int i88 = intArrayUtil85.findKthLargestViaQuickSort(i_array86, (-1));
    int i89 = intArrayUtil75.findMinSubArrayLen((int)(byte)-1, i_array86);
    int i91 = intArrayUtil71.threeSumClosest(i_array86, (int)(byte)1);
    intArrayUtil50.getNextPermutationNumber(i_array86);
    int i93 = intArrayUtil0.removeDuplicateElements(i_array86);
    
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
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == (-1));
    
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
    org.junit.Assert.assertNotNull(i_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 0);
    
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
    org.junit.Assert.assertTrue(i91 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i93 == 0);

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
    int i18 = intArrayUtil0.removeDuplicateElements(i_array16);
    util.IntArrayUtil intArrayUtil19 = new util.IntArrayUtil();
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
    int i58 = intArrayUtil29.findMinSubArrayLen((int)'#', i_array56);
    int i59 = intArrayUtil20.findMinViaIteration(i_array56);
    int i60 = intArrayUtil19.removeDuplicateElements(i_array56);
    intArrayUtil0.getNextPermutationNumber(i_array56);
    util.IntArrayUtil intArrayUtil62 = new util.IntArrayUtil();
    int[] i_array63 = new int[] {  };
    int i65 = intArrayUtil62.findKthLargestViaQuickSort(i_array63, (-1));
    util.IntArrayUtil intArrayUtil66 = new util.IntArrayUtil();
    int[] i_array67 = new int[] {  };
    int i69 = intArrayUtil66.findKthLargestViaQuickSort(i_array67, (-1));
    int[] i_array73 = new int[] { '4', (byte)0 };
    int i74 = intArrayUtil66.findMinSubArrayLen(0, i_array73);
    util.IntArrayUtil intArrayUtil76 = new util.IntArrayUtil();
    int[] i_array77 = new int[] {  };
    int i79 = intArrayUtil76.findKthLargestViaQuickSort(i_array77, (-1));
    int i80 = intArrayUtil66.findMinSubArrayLen((int)(byte)-1, i_array77);
    int i81 = intArrayUtil62.findMinViaIteration(i_array77);
    int[] i_array82 = null;
    intArrayUtil62.getNextPermutationNumber(i_array82);
    util.IntArrayUtil intArrayUtil84 = new util.IntArrayUtil();
    int[] i_array85 = new int[] {  };
    int i87 = intArrayUtil84.findKthLargestViaQuickSort(i_array85, (-1));
    int[] i_array91 = new int[] { '4', (byte)0 };
    int i92 = intArrayUtil84.findMinSubArrayLen(0, i_array91);
    util.IntArrayUtil intArrayUtil93 = new util.IntArrayUtil();
    int[] i_array94 = new int[] {  };
    int i96 = intArrayUtil93.findKthLargestViaQuickSort(i_array94, (-1));
    int i97 = intArrayUtil84.findMinViaIteration(i_array94);
    int i98 = intArrayUtil62.findMinViaIteration(i_array94);
    // The following exception was thrown during execution in test generation
    try {
    int i99 = intArrayUtil0.findMinViaRecursion(i_array94);
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
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array63);
    
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
    org.junit.Assert.assertNotNull(i_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i92 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i96 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i97 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i98 == (-1));

  }

  @Test
  public void test68() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test68"); }


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
    int i19 = intArrayUtil0.findMinViaIteration(i_array15);
    int[] i_array20 = null;
    intArrayUtil0.getNextPermutationNumber(i_array20);
    util.IntArrayUtil intArrayUtil22 = new util.IntArrayUtil();
    int[] i_array23 = new int[] {  };
    int i25 = intArrayUtil22.findKthLargestViaQuickSort(i_array23, (-1));
    int[] i_array29 = new int[] { '4', (byte)0 };
    int i30 = intArrayUtil22.findMinSubArrayLen(0, i_array29);
    util.IntArrayUtil intArrayUtil31 = new util.IntArrayUtil();
    int[] i_array32 = new int[] {  };
    int i34 = intArrayUtil31.findKthLargestViaQuickSort(i_array32, (-1));
    int i35 = intArrayUtil22.findMinViaIteration(i_array32);
    int i36 = intArrayUtil0.findMinViaIteration(i_array32);
    util.IntArrayUtil intArrayUtil37 = new util.IntArrayUtil();
    int[] i_array38 = new int[] {  };
    int i40 = intArrayUtil37.findKthLargestViaQuickSort(i_array38, (-1));
    util.IntArrayUtil intArrayUtil41 = new util.IntArrayUtil();
    int[] i_array42 = new int[] {  };
    int i44 = intArrayUtil41.findKthLargestViaQuickSort(i_array42, (-1));
    int[] i_array48 = new int[] { '4', (byte)0 };
    int i49 = intArrayUtil41.findMinSubArrayLen(0, i_array48);
    util.IntArrayUtil intArrayUtil51 = new util.IntArrayUtil();
    int[] i_array52 = new int[] {  };
    int i54 = intArrayUtil51.findKthLargestViaQuickSort(i_array52, (-1));
    int i55 = intArrayUtil41.findMinSubArrayLen((int)(byte)-1, i_array52);
    int i57 = intArrayUtil37.threeSumClosest(i_array52, (int)(byte)1);
    util.IntArrayUtil intArrayUtil58 = new util.IntArrayUtil();
    int[] i_array59 = new int[] {  };
    int i61 = intArrayUtil58.findKthLargestViaQuickSort(i_array59, (-1));
    int[] i_array65 = new int[] { '4', (byte)0 };
    int i66 = intArrayUtil58.findMinSubArrayLen(0, i_array65);
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
    int i87 = intArrayUtil58.findMinSubArrayLen((-1), i_array84);
    int i88 = intArrayUtil37.removeDuplicateElements(i_array84);
    int i89 = intArrayUtil0.removeDuplicateElements(i_array84);
    
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
    org.junit.Assert.assertTrue(i19 == (-1));
    
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
    org.junit.Assert.assertTrue(i35 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
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
    org.junit.Assert.assertNotNull(i_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
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
    org.junit.Assert.assertTrue(i87 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i89 == 2);

  }

  @Test
  public void test69() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test69"); }


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
    int i19 = intArrayUtil0.findMinViaIteration(i_array15);
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
    int i53 = intArrayUtil24.findMinSubArrayLen((int)'#', i_array51);
    util.IntArrayUtil intArrayUtil54 = new util.IntArrayUtil();
    int[] i_array55 = new int[] {  };
    int i57 = intArrayUtil54.findKthLargestViaQuickSort(i_array55, (-1));
    int[] i_array61 = new int[] { '4', (byte)0 };
    int i62 = intArrayUtil54.findMinSubArrayLen(0, i_array61);
    intArrayUtil24.getNextPermutationNumber(i_array61);
    int i64 = intArrayUtil20.findMinViaIteration(i_array61);
    int i65 = intArrayUtil0.findMinViaRecursion(i_array61);
    
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
    org.junit.Assert.assertTrue(i19 == (-1));
    
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
    org.junit.Assert.assertTrue(i65 == 0);

  }

  @Test
  public void test70() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test70"); }


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
    int i19 = intArrayUtil0.findMinViaIteration(i_array15);
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
    int i38 = intArrayUtil20.removeDuplicateElements(i_array36);
    util.IntArrayUtil intArrayUtil40 = new util.IntArrayUtil();
    int[] i_array41 = new int[] {  };
    int i43 = intArrayUtil40.findKthLargestViaQuickSort(i_array41, (-1));
    int[] i_array47 = new int[] { '4', (byte)0 };
    int i48 = intArrayUtil40.findMinSubArrayLen(0, i_array47);
    int i49 = intArrayUtil20.findMinSubArrayLen((int)'#', i_array47);
    int[] i_array53 = new int[] { 2, (short)100, 1 };
    int i55 = intArrayUtil20.findKthLargestViaQuickSort(i_array53, 2);
    int[] i_array56 = null;
    int i57 = intArrayUtil20.findMinViaIteration(i_array56);
    util.IntArrayUtil intArrayUtil58 = new util.IntArrayUtil();
    int[] i_array59 = new int[] {  };
    int i61 = intArrayUtil58.findKthLargestViaQuickSort(i_array59, (-1));
    util.IntArrayUtil intArrayUtil62 = new util.IntArrayUtil();
    int[] i_array63 = new int[] {  };
    int i65 = intArrayUtil62.findKthLargestViaQuickSort(i_array63, (-1));
    int[] i_array69 = new int[] { '4', (byte)0 };
    int i70 = intArrayUtil62.findMinSubArrayLen(0, i_array69);
    util.IntArrayUtil intArrayUtil72 = new util.IntArrayUtil();
    int[] i_array73 = new int[] {  };
    int i75 = intArrayUtil72.findKthLargestViaQuickSort(i_array73, (-1));
    int i76 = intArrayUtil62.findMinSubArrayLen((int)(byte)-1, i_array73);
    int i78 = intArrayUtil58.threeSumClosest(i_array73, (int)(byte)1);
    int i80 = intArrayUtil20.threeSumClosest(i_array73, 0);
    int i82 = intArrayUtil0.threeSumClosest(i_array73, (int)(byte)1);
    int[] i_array83 = null;
    int i84 = intArrayUtil0.removeDuplicateElements(i_array83);
    int[] i_array85 = null;
    int i87 = intArrayUtil0.findKthLargestViaQuickSort(i_array85, (int)(byte)-1);
    int[] i_array88 = null;
    intArrayUtil0.getNextPermutationNumber(i_array88);
    
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
    org.junit.Assert.assertTrue(i19 == (-1));
    
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
    org.junit.Assert.assertTrue(i38 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == (-1));
    
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
    org.junit.Assert.assertNotNull(i_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i84 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 0);

  }

  @Test
  public void test71() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test71"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = null;
    intArrayUtil0.getNextPermutationNumber(i_array1);
    int[] i_array3 = null;
    intArrayUtil0.getNextPermutationNumber(i_array3);
    int[] i_array6 = null;
    int i7 = intArrayUtil0.findMinSubArrayLen((int)'4', i_array6);
    util.IntArrayUtil intArrayUtil8 = new util.IntArrayUtil();
    int[] i_array9 = new int[] {  };
    int i11 = intArrayUtil8.findKthLargestViaQuickSort(i_array9, (-1));
    int[] i_array15 = new int[] { '4', (byte)0 };
    int i16 = intArrayUtil8.findMinSubArrayLen(0, i_array15);
    util.IntArrayUtil intArrayUtil18 = new util.IntArrayUtil();
    int[] i_array19 = new int[] {  };
    int i21 = intArrayUtil18.findKthLargestViaQuickSort(i_array19, (-1));
    int[] i_array25 = new int[] { '4', (byte)0 };
    int i26 = intArrayUtil18.findMinSubArrayLen(0, i_array25);
    util.IntArrayUtil intArrayUtil27 = new util.IntArrayUtil();
    int[] i_array28 = new int[] {  };
    int i30 = intArrayUtil27.findKthLargestViaQuickSort(i_array28, (-1));
    int[] i_array34 = new int[] { '4', (byte)0 };
    int i35 = intArrayUtil27.findMinSubArrayLen(0, i_array34);
    int i36 = intArrayUtil18.removeDuplicateElements(i_array34);
    util.IntArrayUtil intArrayUtil38 = new util.IntArrayUtil();
    int[] i_array39 = new int[] {  };
    int i41 = intArrayUtil38.findKthLargestViaQuickSort(i_array39, (-1));
    int[] i_array45 = new int[] { '4', (byte)0 };
    int i46 = intArrayUtil38.findMinSubArrayLen(0, i_array45);
    int i47 = intArrayUtil18.findMinSubArrayLen((int)'#', i_array45);
    int i48 = intArrayUtil8.findMinSubArrayLen(0, i_array45);
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
    util.IntArrayUtil intArrayUtil67 = new util.IntArrayUtil();
    int[] i_array68 = new int[] {  };
    int i70 = intArrayUtil67.findKthLargestViaQuickSort(i_array68, (-1));
    int[] i_array74 = new int[] { '4', (byte)0 };
    int i75 = intArrayUtil67.findMinSubArrayLen(0, i_array74);
    int i76 = intArrayUtil58.removeDuplicateElements(i_array74);
    util.IntArrayUtil intArrayUtil78 = new util.IntArrayUtil();
    int[] i_array79 = new int[] {  };
    int i81 = intArrayUtil78.findKthLargestViaQuickSort(i_array79, (-1));
    int[] i_array85 = new int[] { '4', (byte)0 };
    int i86 = intArrayUtil78.findMinSubArrayLen(0, i_array85);
    int i87 = intArrayUtil58.findMinSubArrayLen((int)'#', i_array85);
    int i88 = intArrayUtil49.removeDuplicateElements(i_array85);
    int i89 = intArrayUtil8.removeDuplicateElements(i_array85);
    int i90 = intArrayUtil0.findMinViaIteration(i_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 1);
    
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
    org.junit.Assert.assertNotNull(i_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i86 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i89 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i90 == 0);

  }

  @Test
  public void test72() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test72"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
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
    int i24 = intArrayUtil5.threeSumClosest(i_array21, (int)(byte)0);
    util.IntArrayUtil intArrayUtil25 = new util.IntArrayUtil();
    int[] i_array26 = new int[] {  };
    int i28 = intArrayUtil25.findKthLargestViaQuickSort(i_array26, (-1));
    int[] i_array32 = new int[] { '4', (byte)0 };
    int i33 = intArrayUtil25.findMinSubArrayLen(0, i_array32);
    util.IntArrayUtil intArrayUtil34 = new util.IntArrayUtil();
    int[] i_array35 = new int[] {  };
    int i37 = intArrayUtil34.findKthLargestViaQuickSort(i_array35, (-1));
    int[] i_array41 = new int[] { '4', (byte)0 };
    int i42 = intArrayUtil34.findMinSubArrayLen(0, i_array41);
    util.IntArrayUtil intArrayUtil43 = new util.IntArrayUtil();
    int[] i_array44 = new int[] {  };
    int i46 = intArrayUtil43.findKthLargestViaQuickSort(i_array44, (-1));
    int[] i_array50 = new int[] { '4', (byte)0 };
    int i51 = intArrayUtil43.findMinSubArrayLen(0, i_array50);
    int i52 = intArrayUtil34.removeDuplicateElements(i_array50);
    util.IntArrayUtil intArrayUtil54 = new util.IntArrayUtil();
    int[] i_array55 = new int[] {  };
    int i57 = intArrayUtil54.findKthLargestViaQuickSort(i_array55, (-1));
    int[] i_array61 = new int[] { '4', (byte)0 };
    int i62 = intArrayUtil54.findMinSubArrayLen(0, i_array61);
    int i63 = intArrayUtil34.findMinSubArrayLen((int)'#', i_array61);
    int i64 = intArrayUtil25.removeDuplicateElements(i_array61);
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
    int i84 = intArrayUtil25.findMinViaRecursion(i_array81);
    intArrayUtil5.getNextPermutationNumber(i_array81);
    int i86 = intArrayUtil0.findMinSubArrayLen(0, i_array81);
    int[] i_array87 = null;
    int i88 = intArrayUtil0.findMinViaIteration(i_array87);
    
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
    org.junit.Assert.assertNotNull(i_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
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
    org.junit.Assert.assertTrue(i52 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 2);
    
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
    org.junit.Assert.assertTrue(i86 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == (-1));

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
    int i13 = intArrayUtil0.findMinViaIteration(i_array10);
    util.IntArrayUtil intArrayUtil14 = new util.IntArrayUtil();
    int[] i_array15 = new int[] {  };
    int i17 = intArrayUtil14.findKthLargestViaQuickSort(i_array15, (-1));
    int[] i_array21 = new int[] { '4', (byte)0 };
    int i22 = intArrayUtil14.findMinSubArrayLen(0, i_array21);
    util.IntArrayUtil intArrayUtil23 = new util.IntArrayUtil();
    int[] i_array24 = new int[] {  };
    int i26 = intArrayUtil23.findKthLargestViaQuickSort(i_array24, (-1));
    int[] i_array30 = new int[] { '4', (byte)0 };
    int i31 = intArrayUtil23.findMinSubArrayLen(0, i_array30);
    int i32 = intArrayUtil14.removeDuplicateElements(i_array30);
    util.IntArrayUtil intArrayUtil34 = new util.IntArrayUtil();
    int[] i_array35 = new int[] {  };
    int i37 = intArrayUtil34.findKthLargestViaQuickSort(i_array35, (-1));
    int[] i_array41 = new int[] { '4', (byte)0 };
    int i42 = intArrayUtil34.findMinSubArrayLen(0, i_array41);
    int i43 = intArrayUtil14.findMinSubArrayLen((int)'#', i_array41);
    int[] i_array47 = new int[] { 2, (short)100, 1 };
    int i49 = intArrayUtil14.findKthLargestViaQuickSort(i_array47, 2);
    util.IntArrayUtil intArrayUtil50 = new util.IntArrayUtil();
    int[] i_array51 = new int[] {  };
    int i53 = intArrayUtil50.findKthLargestViaQuickSort(i_array51, (-1));
    int[] i_array57 = new int[] { '4', (byte)0 };
    int i58 = intArrayUtil50.findMinSubArrayLen(0, i_array57);
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
    int i79 = intArrayUtil50.findMinSubArrayLen((-1), i_array76);
    intArrayUtil14.getNextPermutationNumber(i_array76);
    int i81 = intArrayUtil0.removeDuplicateElements(i_array76);
    
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
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 1);
    
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
    org.junit.Assert.assertTrue(i79 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 2);

  }

  @Test
  public void test74() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test74"); }


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
    int i34 = intArrayUtil15.threeSumClosest(i_array31, (int)(byte)0);
    int i36 = intArrayUtil0.threeSumClosest(i_array31, (int)'a');
    util.IntArrayUtil intArrayUtil37 = new util.IntArrayUtil();
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
    int i57 = intArrayUtil38.threeSumClosest(i_array54, (int)(byte)0);
    intArrayUtil37.getNextPermutationNumber(i_array54);
    int i60 = intArrayUtil0.threeSumClosest(i_array54, 2);
    int[] i_array62 = null;
    int i63 = intArrayUtil0.findMinSubArrayLen(0, i_array62);
    int[] i_array64 = null;
    int i65 = intArrayUtil0.findMinViaIteration(i_array64);
    util.IntArrayUtil intArrayUtil66 = new util.IntArrayUtil();
    int[] i_array67 = new int[] {  };
    int i69 = intArrayUtil66.findKthLargestViaQuickSort(i_array67, (-1));
    util.IntArrayUtil intArrayUtil70 = new util.IntArrayUtil();
    int[] i_array71 = new int[] {  };
    int i73 = intArrayUtil70.findKthLargestViaQuickSort(i_array71, (-1));
    int[] i_array77 = new int[] { '4', (byte)0 };
    int i78 = intArrayUtil70.findMinSubArrayLen(0, i_array77);
    util.IntArrayUtil intArrayUtil80 = new util.IntArrayUtil();
    int[] i_array81 = new int[] {  };
    int i83 = intArrayUtil80.findKthLargestViaQuickSort(i_array81, (-1));
    int i84 = intArrayUtil70.findMinSubArrayLen((int)(byte)-1, i_array81);
    int i85 = intArrayUtil66.findMinViaIteration(i_array81);
    int i86 = intArrayUtil0.findMinViaIteration(i_array81);
    util.IntArrayUtil intArrayUtil87 = new util.IntArrayUtil();
    int[] i_array88 = new int[] {  };
    int i90 = intArrayUtil87.findKthLargestViaQuickSort(i_array88, (-1));
    int i92 = intArrayUtil0.findKthLargestViaQuickSort(i_array88, 0);
    
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
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i84 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i86 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i90 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i92 == 0);

  }

  @Test
  public void test75() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test75"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    util.IntArrayUtil intArrayUtil4 = new util.IntArrayUtil();
    int[] i_array5 = new int[] {  };
    int i7 = intArrayUtil4.findKthLargestViaQuickSort(i_array5, (-1));
    util.IntArrayUtil intArrayUtil8 = new util.IntArrayUtil();
    int[] i_array9 = new int[] {  };
    int i11 = intArrayUtil8.findKthLargestViaQuickSort(i_array9, (-1));
    int[] i_array15 = new int[] { '4', (byte)0 };
    int i16 = intArrayUtil8.findMinSubArrayLen(0, i_array15);
    util.IntArrayUtil intArrayUtil17 = new util.IntArrayUtil();
    int[] i_array18 = new int[] {  };
    int i20 = intArrayUtil17.findKthLargestViaQuickSort(i_array18, (-1));
    int[] i_array24 = new int[] { '4', (byte)0 };
    int i25 = intArrayUtil17.findMinSubArrayLen(0, i_array24);
    int i26 = intArrayUtil8.removeDuplicateElements(i_array24);
    util.IntArrayUtil intArrayUtil28 = new util.IntArrayUtil();
    int[] i_array29 = new int[] {  };
    int i31 = intArrayUtil28.findKthLargestViaQuickSort(i_array29, (-1));
    int[] i_array35 = new int[] { '4', (byte)0 };
    int i36 = intArrayUtil28.findMinSubArrayLen(0, i_array35);
    int i37 = intArrayUtil8.findMinSubArrayLen((int)'#', i_array35);
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
    int i76 = intArrayUtil47.findMinSubArrayLen((int)'#', i_array74);
    int i77 = intArrayUtil38.removeDuplicateElements(i_array74);
    int i78 = intArrayUtil8.findMinViaIteration(i_array74);
    int i80 = intArrayUtil4.findKthLargestViaQuickSort(i_array74, (int)(short)-1);
    int i81 = intArrayUtil0.findMinViaIteration(i_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1);
    
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
    org.junit.Assert.assertTrue(i78 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 0);

  }

  @Test
  public void test76() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test76"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    int[] i_array1 = new int[] {  };
    int i3 = intArrayUtil0.findKthLargestViaQuickSort(i_array1, (-1));
    util.IntArrayUtil intArrayUtil5 = new util.IntArrayUtil();
    int[] i_array6 = new int[] {  };
    int i8 = intArrayUtil5.findKthLargestViaQuickSort(i_array6, (-1));
    int[] i_array12 = new int[] { '4', (byte)0 };
    int i13 = intArrayUtil5.findMinSubArrayLen(0, i_array12);
    util.IntArrayUtil intArrayUtil14 = new util.IntArrayUtil();
    int[] i_array15 = new int[] {  };
    int i17 = intArrayUtil14.findKthLargestViaQuickSort(i_array15, (-1));
    int i18 = intArrayUtil5.findMinViaIteration(i_array15);
    util.IntArrayUtil intArrayUtil19 = new util.IntArrayUtil();
    int[] i_array20 = new int[] {  };
    int i22 = intArrayUtil19.findKthLargestViaQuickSort(i_array20, (-1));
    util.IntArrayUtil intArrayUtil23 = new util.IntArrayUtil();
    int[] i_array24 = new int[] {  };
    int i26 = intArrayUtil23.findKthLargestViaQuickSort(i_array24, (-1));
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
    int i45 = intArrayUtil27.removeDuplicateElements(i_array43);
    util.IntArrayUtil intArrayUtil47 = new util.IntArrayUtil();
    int[] i_array48 = new int[] {  };
    int i50 = intArrayUtil47.findKthLargestViaQuickSort(i_array48, (-1));
    int[] i_array54 = new int[] { '4', (byte)0 };
    int i55 = intArrayUtil47.findMinSubArrayLen(0, i_array54);
    int i56 = intArrayUtil27.findMinSubArrayLen((int)'#', i_array54);
    util.IntArrayUtil intArrayUtil57 = new util.IntArrayUtil();
    int[] i_array58 = new int[] {  };
    int i60 = intArrayUtil57.findKthLargestViaQuickSort(i_array58, (-1));
    int[] i_array64 = new int[] { '4', (byte)0 };
    int i65 = intArrayUtil57.findMinSubArrayLen(0, i_array64);
    intArrayUtil27.getNextPermutationNumber(i_array64);
    int i67 = intArrayUtil23.findMinViaIteration(i_array64);
    intArrayUtil19.getNextPermutationNumber(i_array64);
    int i69 = intArrayUtil5.findMinViaRecursion(i_array64);
    util.IntArrayUtil intArrayUtil70 = new util.IntArrayUtil();
    int[] i_array71 = new int[] {  };
    int i73 = intArrayUtil70.findKthLargestViaQuickSort(i_array71, (-1));
    util.IntArrayUtil intArrayUtil74 = new util.IntArrayUtil();
    int[] i_array75 = new int[] {  };
    int i77 = intArrayUtil74.findKthLargestViaQuickSort(i_array75, (-1));
    int[] i_array81 = new int[] { '4', (byte)0 };
    int i82 = intArrayUtil74.findMinSubArrayLen(0, i_array81);
    util.IntArrayUtil intArrayUtil84 = new util.IntArrayUtil();
    int[] i_array85 = new int[] {  };
    int i87 = intArrayUtil84.findKthLargestViaQuickSort(i_array85, (-1));
    int i88 = intArrayUtil74.findMinSubArrayLen((int)(byte)-1, i_array85);
    int i90 = intArrayUtil70.threeSumClosest(i_array85, (int)(byte)1);
    intArrayUtil5.getNextPermutationNumber(i_array85);
    int i92 = intArrayUtil0.findMinSubArrayLen(6, i_array85);
    
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
    org.junit.Assert.assertTrue(i18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
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
    org.junit.Assert.assertTrue(i45 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 1);
    
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
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i90 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i92 == 0);

  }

  @Test
  public void test77() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test77"); }


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
    int i16 = intArrayUtil0.removeDuplicateElements(i_array12);
    util.IntArrayUtil intArrayUtil17 = new util.IntArrayUtil();
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
    int i57 = intArrayUtil28.findMinSubArrayLen((int)'#', i_array55);
    int i58 = intArrayUtil19.removeDuplicateElements(i_array55);
    int i59 = intArrayUtil17.findMinSubArrayLen((int)(byte)0, i_array55);
    util.IntArrayUtil intArrayUtil60 = new util.IntArrayUtil();
    util.IntArrayUtil intArrayUtil61 = new util.IntArrayUtil();
    int[] i_array62 = new int[] {  };
    int i64 = intArrayUtil61.findKthLargestViaQuickSort(i_array62, (-1));
    int[] i_array68 = new int[] { '4', (byte)0 };
    int i69 = intArrayUtil61.findMinSubArrayLen(0, i_array68);
    util.IntArrayUtil intArrayUtil71 = new util.IntArrayUtil();
    int[] i_array72 = new int[] {  };
    int i74 = intArrayUtil71.findKthLargestViaQuickSort(i_array72, (-1));
    int i75 = intArrayUtil61.findMinSubArrayLen((int)(byte)-1, i_array72);
    int[] i_array76 = null;
    int i78 = intArrayUtil61.findKthLargestViaQuickSort(i_array76, (int)(short)-1);
    int[] i_array84 = new int[] { 1, 6, (byte)0, 1 };
    int i85 = intArrayUtil61.findMinSubArrayLen((int)(short)0, i_array84);
    intArrayUtil60.getNextPermutationNumber(i_array84);
    int i88 = intArrayUtil17.threeSumClosest(i_array84, 0);
    int i89 = intArrayUtil0.findMinViaRecursion(i_array84);
    
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
    org.junit.Assert.assertTrue(i16 == 0);
    
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
    org.junit.Assert.assertTrue(i58 == 2);
    
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
    org.junit.Assert.assertNotNull(i_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i89 == 0);

  }

  @Test
  public void test78() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test78"); }


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
    int i44 = intArrayUtil26.removeDuplicateElements(i_array42);
    int i45 = intArrayUtil16.findMinSubArrayLen((-1), i_array42);
    int i46 = intArrayUtil0.findMinSubArrayLen((int)(byte)10, i_array42);
    int[] i_array47 = null;
    intArrayUtil0.getNextPermutationNumber(i_array47);
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
    util.IntArrayUtil intArrayUtil67 = new util.IntArrayUtil();
    int[] i_array68 = new int[] {  };
    int i70 = intArrayUtil67.findKthLargestViaQuickSort(i_array68, (-1));
    int[] i_array74 = new int[] { '4', (byte)0 };
    int i75 = intArrayUtil67.findMinSubArrayLen(0, i_array74);
    int i76 = intArrayUtil58.removeDuplicateElements(i_array74);
    util.IntArrayUtil intArrayUtil78 = new util.IntArrayUtil();
    int[] i_array79 = new int[] {  };
    int i81 = intArrayUtil78.findKthLargestViaQuickSort(i_array79, (-1));
    int[] i_array85 = new int[] { '4', (byte)0 };
    int i86 = intArrayUtil78.findMinSubArrayLen(0, i_array85);
    int i87 = intArrayUtil58.findMinSubArrayLen((int)'#', i_array85);
    int i88 = intArrayUtil49.removeDuplicateElements(i_array85);
    int i90 = intArrayUtil0.threeSumClosest(i_array85, (int)(short)10);
    
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
    org.junit.Assert.assertTrue(i44 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 1);
    
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
    org.junit.Assert.assertNotNull(i_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i86 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i90 == 0);

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
    int[] i_array16 = new int[] { '4', (byte)0 };
    int i17 = intArrayUtil9.findMinSubArrayLen(0, i_array16);
    int i18 = intArrayUtil0.removeDuplicateElements(i_array16);
    util.IntArrayUtil intArrayUtil20 = new util.IntArrayUtil();
    int[] i_array21 = new int[] {  };
    int i23 = intArrayUtil20.findKthLargestViaQuickSort(i_array21, (-1));
    int[] i_array27 = new int[] { '4', (byte)0 };
    int i28 = intArrayUtil20.findMinSubArrayLen(0, i_array27);
    int i29 = intArrayUtil0.findMinSubArrayLen((int)'#', i_array27);
    util.IntArrayUtil intArrayUtil30 = new util.IntArrayUtil();
    int[] i_array31 = new int[] {  };
    int i33 = intArrayUtil30.findKthLargestViaQuickSort(i_array31, (-1));
    int[] i_array37 = new int[] { '4', (byte)0 };
    int i38 = intArrayUtil30.findMinSubArrayLen(0, i_array37);
    intArrayUtil0.getNextPermutationNumber(i_array37);
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
    int i59 = intArrayUtil40.threeSumClosest(i_array56, (int)(byte)0);
    int i61 = intArrayUtil0.threeSumClosest(i_array56, (int)(byte)0);
    int[] i_array62 = null;
    int i63 = intArrayUtil0.removeDuplicateElements(i_array62);
    int[] i_array64 = null;
    int i65 = intArrayUtil0.removeDuplicateElements(i_array64);
    util.IntArrayUtil intArrayUtil66 = new util.IntArrayUtil();
    int[] i_array67 = new int[] {  };
    int i69 = intArrayUtil66.findKthLargestViaQuickSort(i_array67, (-1));
    int[] i_array73 = new int[] { '4', (byte)0 };
    int i74 = intArrayUtil66.findMinSubArrayLen(0, i_array73);
    intArrayUtil0.getNextPermutationNumber(i_array73);
    int[] i_array76 = null;
    int i77 = intArrayUtil0.removeDuplicateElements(i_array76);
    
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
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
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
    org.junit.Assert.assertTrue(i77 == 0);

  }

  @Test
  public void test80() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test80"); }


    util.IntArrayUtil intArrayUtil0 = new util.IntArrayUtil();
    util.IntArrayUtil intArrayUtil1 = new util.IntArrayUtil();
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
    int i40 = intArrayUtil11.findMinSubArrayLen((int)'#', i_array38);
    int i41 = intArrayUtil2.findMinViaIteration(i_array38);
    intArrayUtil1.getNextPermutationNumber(i_array38);
    util.IntArrayUtil intArrayUtil44 = new util.IntArrayUtil();
    int[] i_array45 = new int[] {  };
    int i47 = intArrayUtil44.findKthLargestViaQuickSort(i_array45, (-1));
    int[] i_array51 = new int[] { '4', (byte)0 };
    int i52 = intArrayUtil44.findMinSubArrayLen(0, i_array51);
    util.IntArrayUtil intArrayUtil54 = new util.IntArrayUtil();
    int[] i_array55 = new int[] {  };
    int i57 = intArrayUtil54.findKthLargestViaQuickSort(i_array55, (-1));
    int i58 = intArrayUtil44.findMinSubArrayLen((int)(byte)-1, i_array55);
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
    int i78 = intArrayUtil59.threeSumClosest(i_array75, (int)(byte)0);
    int i80 = intArrayUtil44.threeSumClosest(i_array75, (int)'a');
    int i81 = intArrayUtil1.findMinSubArrayLen(52, i_array75);
    intArrayUtil0.getNextPermutationNumber(i_array75);
    
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
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
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
    org.junit.Assert.assertTrue(i80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 1);

  }

  @Test
  public void test81() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test81"); }


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
    int i19 = intArrayUtil0.findMinViaIteration(i_array15);
    int[] i_array20 = null;
    intArrayUtil0.getNextPermutationNumber(i_array20);
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
    int i51 = intArrayUtil22.findMinSubArrayLen((int)'#', i_array49);
    util.IntArrayUtil intArrayUtil52 = new util.IntArrayUtil();
    int[] i_array53 = new int[] {  };
    int i55 = intArrayUtil52.findKthLargestViaQuickSort(i_array53, (-1));
    int[] i_array59 = new int[] { '4', (byte)0 };
    int i60 = intArrayUtil52.findMinSubArrayLen(0, i_array59);
    intArrayUtil22.getNextPermutationNumber(i_array59);
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
    int i81 = intArrayUtil62.threeSumClosest(i_array78, (int)(byte)0);
    int i83 = intArrayUtil22.threeSumClosest(i_array78, (int)(byte)0);
    int[] i_array84 = null;
    int i85 = intArrayUtil22.removeDuplicateElements(i_array84);
    util.IntArrayUtil intArrayUtil86 = new util.IntArrayUtil();
    int[] i_array87 = new int[] {  };
    int i89 = intArrayUtil86.findKthLargestViaQuickSort(i_array87, (-1));
    int[] i_array93 = new int[] { '4', (byte)0 };
    int i94 = intArrayUtil86.findMinSubArrayLen(0, i_array93);
    int i95 = intArrayUtil22.findMinViaRecursion(i_array93);
    int i96 = intArrayUtil0.findMinViaIteration(i_array93);
    
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
    org.junit.Assert.assertTrue(i19 == (-1));
    
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
    org.junit.Assert.assertNotNull(i_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 1);
    
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
    org.junit.Assert.assertTrue(i81 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i89 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i94 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i95 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i96 == 0);

  }

}
