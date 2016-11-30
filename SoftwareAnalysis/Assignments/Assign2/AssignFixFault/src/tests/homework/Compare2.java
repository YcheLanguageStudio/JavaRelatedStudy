package tests.homework;

/**
 * Created by cheyulin on 11/30/16.
 */
public class Compare2 {
    public int threeSumClosest(int[] nums, int target) {
        int var3 = 2147483647;
        int var4 = 0;
        this.MergeSort(0, nums.length, nums);

        for (int var5 = 0; var5 < nums.length; ++var5) {
            int var6 = var5 + 1;
            int var7 = nums.length - 1;

            while (var6 < var7) {
                int var8;
                int var9;
                if ((var9 = (var9 = (var8 = nums[var5] + nums[var6] + nums[var7]) - target) < 0 ? -var9 : var9) == 0) {
                    return var8;
                }

                if (var9 < var3) {
                    var3 = var9;
                    var4 = var8;
                }

                if (var8 <= target) {
                    ++var6;
                } else {
                    --var7;
                }
            }
        }

        return var4;
    }

    private static int abs(int a) {
        return a < 0 ? -a : a;
    }

    private void MergeSort(int[] unsorted) {
        this.MergeSort(0, unsorted.length, unsorted);
    }

    private void MergeSort(int start, int length, int[] unsorted) {
        int var4;
        if (length <= 2) {
            if (length == 2 && (var4 = unsorted[start + 1]) < unsorted[start]) {
                unsorted[start + 1] = unsorted[start];
                unsorted[start] = var4;
            }

        } else {
            var4 = (int) Math.floor((double) (length / 2));
            length -= var4;
            this.MergeSort(start, var4, unsorted);
            this.MergeSort(start + var4, length, unsorted);
            int var10001 = var4;
            int var10002 = start + var4;
            int[] var5 = unsorted;
            var4 = length;
            int var13 = var10002;
            length = var10001;
            int var6 = 0;
            Integer[] var7 = new Integer[length + var4];
            int var8 = start;
            int var9 = var13;
            int var10 = start + length;
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
                int var15 = start + length + var4;

                for (start = start; start < var15; ++start) {
                    var5[start] = var7[var14++].intValue();
                }

                return;
            }
        }
    }

    private static void mergeWithExtraStorage(int aStart, int aLength, int bStart, int bLength, int[] unsorted) {
        int var5 = 0;
        Integer[] var6 = new Integer[aLength + bLength];
        int var7 = aStart;
        int var8 = bStart;
        int var9 = aStart + aLength;
        bStart += bLength;

        while (true) {
            while (var7 < var9 || var8 < bStart) {
                Integer var10 = null;
                if (var7 < var9) {
                    var10 = Integer.valueOf(unsorted[var7]);
                }

                Integer var11 = null;
                if (var8 < bStart) {
                    var11 = Integer.valueOf(unsorted[var8]);
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
            int var13 = aStart + aLength + bLength;

            for (aStart = aStart; aStart < var13; ++aStart) {
                unsorted[aStart] = var6[var12++].intValue();
            }

            return;
        }
    }
}
