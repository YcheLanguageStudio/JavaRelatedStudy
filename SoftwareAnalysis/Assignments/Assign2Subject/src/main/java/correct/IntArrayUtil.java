package correct;

/**
 * Created by cheyulin on 11/23/16.
 */

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class IntArrayUtil {
    public int findKthLargestViaQuickSort(int[] var1, int var2) {
        return var2 > 0 && var1 != null ? this.a(var1.length - var2 + 1, var1, 0, var1.length - 1) : 0;
    }

    private int a(int var1, int[] var2, int var3, int var4) {
        label40:
        while (true) {
            int var5 = var2[var4];
            int var6 = var3;
            int var7 = var4;

            while (true) {
                while (var2[var6] >= var5 || var6 >= var7) {
                    while (var2[var7] >= var5 && var7 > var6) {
                        --var7;
                    }

                    if (var6 == var7) {
                        a(var2, var6, var4);
                        if (var1 == var6 + 1) {
                            return var5;
                        }

                        if (var1 < var6 + 1) {
                            var4 = var6 - 1;
                            var3 = var3;
                            var2 = var2;
                            var1 = var1;

                            continue label40;
                        }

                        var3 = var6 + 1;
                        var2 = var2;
                        var1 = var1;

                        continue label40;
                    }

                    a(var2, var6, var7);
                }

                ++var6;
            }
        }
    }

    private static void a(int[] var0, int var1, int var2) {
        int var3 = var0[var1];
        var0[var1] = var0[var2];
        var0[var2] = var3;
    }

    public int findMinViaRecursion(int[] var1) {
        return this.b(var1, 0, var1.length - 1);
    }

    private int b(int[] var1, int var2, int var3) {
        while (var2 != var3) {
            if (var3 - var2 == 1) {
                return a(var1[var2], var1[var3]);
            }

            int var4 = var2 + (var3 - var2) / 2;
            if (var1[var2] < var1[var3]) {
                return var1[var2];
            }

            if (var1[var4] > var1[var2]) {
                var2 = var4;
                var1 = var1;

            } else {
                var3 = var4;
                var2 = var2;
                var1 = var1;

            }
        }

        return var1[var2];
    }

    public int findMinViaIteration(int[] var1) {
        if (var1 != null && var1.length != 0) {
            if (var1.length == 1) {
                return var1[0];
            } else {
                int var2 = 0;
                int var3 = var1.length - 1;
                if (var1[0] < var1[var3]) {
                    return var1[0];
                } else {
                    while (var2 <= var3) {
                        if (var3 - var2 == 1) {
                            return var1[var3];
                        }

                        int var4 = var2 + (var3 - var2) / 2;
                        if (var1[var4] > var1[var3]) {
                            var2 = var4;
                        } else {
                            var3 = var4;
                        }
                    }

                    return var1[var2];
                }
            }
        } else {
            return -1;
        }
    }

    public int removeDuplicateElements(int[] var1) {
        if (var1 != null && var1.length != 0) {
            int var2 = var1[0];
            boolean var3 = false;
            int var4 = 0;
            int var5 = 1;

            for (int var6 = 1; var6 < var1.length; ++var6) {
                int var7;
                if ((var7 = var1[var6]) == var2) {
                    if (!var3) {
                        var3 = true;
                        var1[var5++] = var7;
                    } else {
                        ++var4;
                    }
                } else {
                    var2 = var7;
                    var1[var5++] = var7;
                    var3 = false;
                }
            }

            return var1.length - var4;
        } else {
            return 0;
        }
    }

    public int findMinSubArrayLen(int var1, int[] var2) {
        if (var2 != null && var2.length != 0) {
            if (var2.length == 1 && var2[0] < var1) {
                return 0;
            } else {
                int var3 = var2.length;
                int var4 = 0;
                int var5 = var2[0];
                int var6 = 0;

                while (var6 < var2.length) {
                    if (var4 == var6) {
                        if (var2[var4] >= var1) {
                            return 1;
                        }

                        ++var6;
                        if (var6 >= var2.length) {
                            return var3;
                        }

                        var5 += var2[var6];
                    } else if (var5 >= var1) {
                        var3 = a(var6 - var4 + 1, var3);
                        var5 -= var2[var4];
                        ++var4;
                    } else {
                        ++var6;
                        if (var6 >= var2.length) {
                            if (var4 == 0) {
                                return 0;
                            }

                            return var3;
                        }

                        var5 += var2[var6];
                    }
                }

                return var3;
            }
        } else {
            return 0;
        }
    }

    private static int a(int var0, int var1) {
        return var0 >= var1 ? var1 : var0;
    }

    public void getNextPermutationNumber(int[] var1) {
        if (var1 != null && var1.length >= 2) {
            int var2 = 0;

            int var3;
            for (var3 = var1.length - 2; var3 >= 0; --var3) {
                if (var1[var3] < var1[var3 + 1]) {
                    var2 = var3;
                    break;
                }
            }

            var3 = 0;

            int var4;
            for (var4 = var1.length - 1; var4 > var2; --var4) {
                if (var1[var4] > var1[var2]) {
                    var3 = var4;
                    break;
                }
            }

            if (var2 == 0 && var3 == 0) {
                c(var1, 0, var1.length - 1);
            } else {
                var4 = var1[var2];
                var1[var2] = var1[var3];
                var1[var3] = var4;
                if (var2 < var1.length - 1) {
                    c(var1, var2 + 1, var1.length - 1);
                }

            }
        }
    }

    private static void c(int[] var0, int var1, int var2) {
        while (var1 < var2) {
            int var3 = var0[var1];
            var0[var1] = var0[var2];
            var0[var2] = var3;
            ++var1;
            --var2;
        }

    }

    public int threeSumClosest(int[] var1, int var2) {
        int var3 = 2147483647;
        int var4 = 0;
        this.a(0, var1.length, var1);

        for (int var5 = 0; var5 < var1.length; ++var5) {
            int var6 = var5 + 1;
            int var7 = var1.length - 1;

            while (var6 < var7) {
                int var8;
                int var9;
                if ((var9 = (var9 = (var8 = var1[var5] + var1[var6] + var1[var7]) - var2) < 0 ? -var9 : var9) == 0) {
                    return var8;
                }

                if (var9 < var3) {
                    var3 = var9;
                    var4 = var8;
                }

                if (var8 <= var2) {
                    ++var6;
                } else {
                    --var7;
                }
            }
        }

        return var4;
    }

    private static int a(int var0) {
        return var0 < 0 ? -var0 : var0;
    }

    private void a(int[] var1) {
        this.a(0, var1.length, var1);
    }

    private void a(int var1, int var2, int[] var3) {
        int var4;
        if (var2 <= 2) {
            if (var2 == 2 && (var4 = var3[var1 + 1]) < var3[var1]) {
                var3[var1 + 1] = var3[var1];
                var3[var1] = var4;
            }

        } else {
            var4 = (int) Math.floor((double) (var2 / 2));
            var2 -= var4;
            this.a(var1, var4, var3);
            this.a(var1 + var4, var2, var3);
            int var10001 = var4;
            int var10002 = var1 + var4;
            int[] var5 = var3;
            var4 = var2;
            int var13 = var10002;
            var2 = var10001;
            int var6 = 0;
            Integer[] var7 = new Integer[var2 + var4];
            int var8 = var1;
            int var9 = var13;
            int var10 = var1 + var2;
            var13 += var4;

            while (true) {
                while (var8 < var10 || var9 < var13) {
                    Integer var11 = null;
                    if (var8 < var10) {
                        var11 = Integer.valueOf(var5[var8]);
                    }

                    Integer var12 = null;
                    if (var9 < var13) {
                        var12 = Integer.valueOf(var5[var9]);
                    }

                    if (var11 == null || var12 != null) {
                        if (var12 != null && var11 == null) {
                            var7[var6++] = var12;
                            ++var9;
                            continue;
                        }

                        if (var12 != null && var12.compareTo(var11) <= 0) {
                            var7[var6++] = var12;
                            ++var9;
                            continue;
                        }
                    }

                    var7[var6++] = var11;
                    ++var8;
                }

                int var14 = 0;
                int var15 = var1 + var2 + var4;

                for (var1 = var1; var1 < var15; ++var1) {
                    var5[var1] = var7[var14++].intValue();
                }

                return;
            }
        }
    }

    private static void a(int var0, int var1, int var2, int var3, int[] var4) {
        int var5 = 0;
        Integer[] var6 = new Integer[var1 + var3];
        int var7 = var0;
        int var8 = var2;
        int var9 = var0 + var1;
        var2 += var3;

        while (true) {
            while (var7 < var9 || var8 < var2) {
                Integer var10 = null;
                if (var7 < var9) {
                    var10 = Integer.valueOf(var4[var7]);
                }

                Integer var11 = null;
                if (var8 < var2) {
                    var11 = Integer.valueOf(var4[var8]);
                }

                if (var10 == null || var11 != null) {
                    if (var11 != null && var10 == null) {
                        var6[var5++] = var11;
                        ++var8;
                        continue;
                    }

                    if (var11 != null && var11.compareTo(var10) <= 0) {
                        var6[var5++] = var11;
                        ++var8;
                        continue;
                    }
                }

                var6[var5++] = var10;
                ++var7;
            }

            int var12 = 0;
            int var13 = var0 + var1 + var3;

            for (var0 = var0; var0 < var13; ++var0) {
                var4[var0] = var6[var12++].intValue();
            }

            return;
        }
    }
}
