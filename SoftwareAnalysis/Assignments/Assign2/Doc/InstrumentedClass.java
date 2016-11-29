//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package tests.homework;

import profiler.StatementMarker;

public class IntArrayUtil {
    public IntArrayUtil() {
        StatementMarker.markStatement("tests.homework.IntArrayUtil", 0);
        StatementMarker.markBranch("tests.homework.IntArrayUtil", 0);
        super();
        StatementMarker.markStatement("tests.homework.IntArrayUtil", 1);
        StatementMarker.markBranch("tests.homework.IntArrayUtil", 1);
    }

    public int findKthLargestViaQuickSort(int[] var1, int var2) {
        StatementMarker.markStatement("tests.homework.IntArrayUtil", 2);
        StatementMarker.markBranch("tests.homework.IntArrayUtil", 2);
        StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 2);
        if(var2 >= 1) {
            StatementMarker.markStatement("tests.homework.IntArrayUtil", 3);
            StatementMarker.markBranch("tests.homework.IntArrayUtil", 3);
            StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 3);
            if(var1 != null) {
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 5);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 5);
                int var10001 = var1.length;
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 6);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 6);
                var10001 -= var2;
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 7);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 7);
                ++var10001;
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 8);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 8);
                int var10004 = var1.length;
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 9);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 9);
                --var10004;
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 10);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 10);
                int var10000 = this.findKthViaQuickSort(var10001, var1, 0, var10004);
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 11);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 11);
                StatementMarker.report();
                return var10000;
            }
        }

        StatementMarker.markStatement("tests.homework.IntArrayUtil", 4);
        StatementMarker.markBranch("tests.homework.IntArrayUtil", 4);
        StatementMarker.report();
        return 0;
    }

    private int findKthViaQuickSort(int var1, int[] var2, int var3, int var4) {
        StatementMarker.markStatement("tests.homework.IntArrayUtil", 12);
        StatementMarker.markBranch("tests.homework.IntArrayUtil", 12);
        int var5 = var2[var4];
        StatementMarker.markStatement("tests.homework.IntArrayUtil", 13);
        StatementMarker.markBranch("tests.homework.IntArrayUtil", 13);
        int var6 = var3;
        StatementMarker.markStatement("tests.homework.IntArrayUtil", 14);
        StatementMarker.markBranch("tests.homework.IntArrayUtil", 14);
        int var7 = var4;
        StatementMarker.markStatement("tests.homework.IntArrayUtil", 15);
        StatementMarker.markBranch("tests.homework.IntArrayUtil", 15);

        while(true) {
            while(true) {
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 17);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 17);
                int var10000 = var2[var6];
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 18);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 18);
                StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 18);
                if(var10000 < var5) {
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 19);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 19);
                    StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 19);
                    if(var6 < var7) {
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 16);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 16);
                        ++var6;
                        continue;
                    }

                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 20);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 20);
                }

                while(true) {
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 22);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 22);
                    var10000 = var2[var7];
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 23);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 23);
                    StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 23);
                    if(var10000 < var5) {
                        break;
                    }

                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 24);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 24);
                    StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 24);
                    if(var7 <= var6) {
                        break;
                    }

                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 21);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 21);
                    --var7;
                }

                StatementMarker.markStatement("tests.homework.IntArrayUtil", 25);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 25);
                StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 25);
                if(var6 == var7) {
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 26);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 26);
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 29);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 29);
                    this.swap(var2, var6, var4);
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 30);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 30);
                    int var10001 = var6 + 1;
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 31);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 31);
                    StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 31);
                    if(var1 == var10001) {
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 32);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 32);
                        StatementMarker.report();
                        return var5;
                    }

                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 33);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 33);
                    var10001 = var6 + 1;
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 34);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 34);
                    StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 34);
                    if(var1 < var10001) {
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 35);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 35);
                        int var10004 = var6 - 1;
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 36);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 36);
                        var10000 = this.findKthViaQuickSort(var1, var2, var3, var10004);
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 37);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 37);
                        StatementMarker.report();
                        return var10000;
                    }

                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 38);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 38);
                    int var10003 = var6 + 1;
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 39);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 39);
                    var10000 = this.findKthViaQuickSort(var1, var2, var10003, var4);
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 40);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 40);
                    StatementMarker.report();
                    return var10000;
                }

                StatementMarker.markStatement("tests.homework.IntArrayUtil", 27);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 27);
                this.swap(var2, var6, var7);
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 28);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 28);
            }
        }
    }

    private void swap(int[] var1, int var2, int var3) {
        StatementMarker.markStatement("tests.homework.IntArrayUtil", 41);
        StatementMarker.markBranch("tests.homework.IntArrayUtil", 41);
        int var10002 = var1[var2];
        StatementMarker.markStatement("tests.homework.IntArrayUtil", 42);
        StatementMarker.markBranch("tests.homework.IntArrayUtil", 42);
        int var10005 = var1[var3];
        StatementMarker.markStatement("tests.homework.IntArrayUtil", 43);
        StatementMarker.markBranch("tests.homework.IntArrayUtil", 43);
        var1[var2] = var10005;
        StatementMarker.markStatement("tests.homework.IntArrayUtil", 44);
        StatementMarker.markBranch("tests.homework.IntArrayUtil", 44);
        var1[var3] = var10002;
        StatementMarker.markStatement("tests.homework.IntArrayUtil", 45);
        StatementMarker.markBranch("tests.homework.IntArrayUtil", 45);
        StatementMarker.report();
    }

    public int findMinViaRecursion(int[] var1) {
        StatementMarker.markStatement("tests.homework.IntArrayUtil", 46);
        StatementMarker.markBranch("tests.homework.IntArrayUtil", 46);
        int var10003 = var1.length;
        StatementMarker.markStatement("tests.homework.IntArrayUtil", 47);
        StatementMarker.markBranch("tests.homework.IntArrayUtil", 47);
        --var10003;
        StatementMarker.markStatement("tests.homework.IntArrayUtil", 48);
        StatementMarker.markBranch("tests.homework.IntArrayUtil", 48);
        int var10000 = this.findMinViaRecursion(var1, 0, var10003);
        StatementMarker.markStatement("tests.homework.IntArrayUtil", 49);
        StatementMarker.markBranch("tests.homework.IntArrayUtil", 49);
        StatementMarker.report();
        return var10000;
    }

    private int findMinViaRecursion(int[] var1, int var2, int var3) {
        StatementMarker.markStatement("tests.homework.IntArrayUtil", 50);
        StatementMarker.markBranch("tests.homework.IntArrayUtil", 50);
        StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 50);
        int var10000;
        if(var2 == var3) {
            StatementMarker.markStatement("tests.homework.IntArrayUtil", 51);
            StatementMarker.markBranch("tests.homework.IntArrayUtil", 51);
            var10000 = var1[var2];
            StatementMarker.markStatement("tests.homework.IntArrayUtil", 52);
            StatementMarker.markBranch("tests.homework.IntArrayUtil", 52);
            StatementMarker.report();
            return var10000;
        } else {
            StatementMarker.markStatement("tests.homework.IntArrayUtil", 53);
            StatementMarker.markBranch("tests.homework.IntArrayUtil", 53);
            var10000 = var3 - var2;
            StatementMarker.markStatement("tests.homework.IntArrayUtil", 54);
            StatementMarker.markBranch("tests.homework.IntArrayUtil", 54);
            StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 54);
            int var10001;
            if(var10000 == 1) {
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 55);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 55);
                var10001 = var1[var2];
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 56);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 56);
                int var10002 = var1[var3];
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 57);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 57);
                var10000 = this.min(var10001, var10002);
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 58);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 58);
                StatementMarker.report();
                return var10000;
            } else {
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 59);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 59);
                var10001 = var3 - var2;
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 60);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 60);
                var10001 /= 2;
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 61);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 61);
                int var4 = var2 + var10001;
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 62);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 62);
                var10000 = var1[var2];
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 63);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 63);
                var10001 = var1[var3];
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 64);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 64);
                StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 64);
                if(var10000 < var10001) {
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 65);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 65);
                    var10000 = var1[var2];
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 66);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 66);
                    StatementMarker.report();
                    return var10000;
                } else {
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 67);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 67);
                    var10000 = var1[var4];
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 68);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 68);
                    var10001 = var1[var2];
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 69);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 69);
                    StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 69);
                    if(var10000 > var10001) {
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 70);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 70);
                        var10000 = this.findMinViaRecursion(var1, var4, var3);
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 71);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 71);
                        StatementMarker.report();
                        return var10000;
                    } else {
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 72);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 72);
                        var10000 = this.findMinViaRecursion(var1, var2, var4);
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 73);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 73);
                        StatementMarker.report();
                        return var10000;
                    }
                }
            }
        }
    }

    public int findMinViaIteration(int[] var1) {
        StatementMarker.markStatement("tests.homework.IntArrayUtil", 74);
        StatementMarker.markBranch("tests.homework.IntArrayUtil", 74);
        StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 74);
        if(var1 != null) {
            StatementMarker.markStatement("tests.homework.IntArrayUtil", 75);
            StatementMarker.markBranch("tests.homework.IntArrayUtil", 75);
            int var10000 = var1.length;
            StatementMarker.markStatement("tests.homework.IntArrayUtil", 76);
            StatementMarker.markBranch("tests.homework.IntArrayUtil", 76);
            StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 76);
            if(var10000 != 0) {
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 78);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 78);
                var10000 = var1.length;
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 79);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 79);
                StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 79);
                if(var10000 == 1) {
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 80);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 80);
                    var10000 = var1[0];
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 81);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 81);
                    StatementMarker.report();
                    return var10000;
                }

                StatementMarker.markStatement("tests.homework.IntArrayUtil", 82);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 82);
                int var4 = 0;
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 83);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 83);
                var10000 = var1.length;
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 84);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 84);
                int var2 = var10000 - 1;
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 85);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 85);
                var10000 = var1[var4];
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 86);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 86);
                int var10001 = var1[var2];
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 87);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 87);
                StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 87);
                if(var10000 < var10001) {
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 88);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 88);
                    var10000 = var1[var4];
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 89);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 89);
                    StatementMarker.report();
                    return var10000;
                }

                while(true) {
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 103);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 103);
                    StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 103);
                    if(var4 > var2) {
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 104);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 104);
                        var10000 = var1[var4];
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 105);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 105);
                        StatementMarker.report();
                        return var10000;
                    }

                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 90);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 90);
                    var10000 = var2 - var4;
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 91);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 91);
                    StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 91);
                    if(var10000 == 1) {
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 92);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 92);
                        var10000 = var1[var2];
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 93);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 93);
                        StatementMarker.report();
                        return var10000;
                    }

                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 94);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 94);
                    var10001 = var2 - var4;
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 95);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 95);
                    var10001 /= 2;
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 96);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 96);
                    int var3 = var4 + var10001;
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 97);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 97);
                    var10000 = var1[var3];
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 98);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 98);
                    var10001 = var1[var2];
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 99);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 99);
                    StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 99);
                    if(var10000 > var10001) {
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 100);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 100);
                        var4 = var3;
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 101);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 101);
                    } else {
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 102);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 102);
                        var2 = var3;
                    }
                }
            }
        }

        StatementMarker.markStatement("tests.homework.IntArrayUtil", 77);
        StatementMarker.markBranch("tests.homework.IntArrayUtil", 77);
        StatementMarker.report();
        return -1;
    }

    public int removeDuplicateElements(int[] var1) {
        StatementMarker.markStatement("tests.homework.IntArrayUtil", 106);
        StatementMarker.markBranch("tests.homework.IntArrayUtil", 106);
        StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 106);
        if(var1 != null) {
            StatementMarker.markStatement("tests.homework.IntArrayUtil", 107);
            StatementMarker.markBranch("tests.homework.IntArrayUtil", 107);
            int var10000 = var1.length;
            StatementMarker.markStatement("tests.homework.IntArrayUtil", 108);
            StatementMarker.markBranch("tests.homework.IntArrayUtil", 108);
            StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 108);
            if(var10000 != 0) {
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 110);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 110);
                int var7 = var1[0];
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 111);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 111);
                boolean var2 = false;
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 112);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 112);
                int var3 = 0;
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 113);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 113);
                int var4 = 1;
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 114);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 114);
                int var5 = 1;
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 115);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 115);

                while(true) {
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 132);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 132);
                    int var10001 = var1.length;
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 133);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 133);
                    StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 133);
                    if(var5 >= var10001) {
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 134);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 134);
                        var10000 = var1.length;
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 135);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 135);
                        var10000 -= var3;
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 136);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 136);
                        StatementMarker.report();
                        return var10000;
                    }

                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 116);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 116);
                    int var6 = var1[var5];
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 117);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 117);
                    StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 117);
                    if(var6 == var7) {
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 118);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 118);
                        StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 118);
                        if(!var2) {
                            StatementMarker.markStatement("tests.homework.IntArrayUtil", 119);
                            StatementMarker.markBranch("tests.homework.IntArrayUtil", 119);
                            var2 = true;
                            StatementMarker.markStatement("tests.homework.IntArrayUtil", 120);
                            StatementMarker.markBranch("tests.homework.IntArrayUtil", 120);
                            var10001 = var4;
                            StatementMarker.markStatement("tests.homework.IntArrayUtil", 121);
                            StatementMarker.markBranch("tests.homework.IntArrayUtil", 121);
                            ++var4;
                            StatementMarker.markStatement("tests.homework.IntArrayUtil", 122);
                            StatementMarker.markBranch("tests.homework.IntArrayUtil", 122);
                            var1[var10001] = var6;
                            StatementMarker.markStatement("tests.homework.IntArrayUtil", 123);
                            StatementMarker.markBranch("tests.homework.IntArrayUtil", 123);
                        } else {
                            StatementMarker.markStatement("tests.homework.IntArrayUtil", 124);
                            StatementMarker.markBranch("tests.homework.IntArrayUtil", 124);
                            ++var3;
                            StatementMarker.markStatement("tests.homework.IntArrayUtil", 125);
                            StatementMarker.markBranch("tests.homework.IntArrayUtil", 125);
                        }
                    } else {
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 126);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 126);
                        var7 = var6;
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 127);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 127);
                        var10001 = var4;
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 128);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 128);
                        ++var4;
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 129);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 129);
                        var1[var10001] = var6;
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 130);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 130);
                        var2 = false;
                    }

                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 131);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 131);
                    ++var5;
                }
            }
        }

        StatementMarker.markStatement("tests.homework.IntArrayUtil", 109);
        StatementMarker.markBranch("tests.homework.IntArrayUtil", 109);
        StatementMarker.report();
        return 0;
    }

    public int findMinSubArrayLen(int var1, int[] var2) {
        StatementMarker.markStatement("tests.homework.IntArrayUtil", 137);
        StatementMarker.markBranch("tests.homework.IntArrayUtil", 137);
        StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 137);
        if(var2 != null) {
            StatementMarker.markStatement("tests.homework.IntArrayUtil", 138);
            StatementMarker.markBranch("tests.homework.IntArrayUtil", 138);
            int var10000 = var2.length;
            StatementMarker.markStatement("tests.homework.IntArrayUtil", 139);
            StatementMarker.markBranch("tests.homework.IntArrayUtil", 139);
            StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 139);
            if(var10000 != 0) {
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 141);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 141);
                var10000 = var2.length;
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 142);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 142);
                StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 142);
                if(var10000 == 1) {
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 143);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 143);
                    var10000 = var2[0];
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 144);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 144);
                    StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 144);
                    if(var10000 < var1) {
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 145);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 145);
                        StatementMarker.report();
                        return 0;
                    }
                }

                StatementMarker.markStatement("tests.homework.IntArrayUtil", 146);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 146);
                int var3 = var2.length;
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 147);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 147);
                int var4 = 0;
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 148);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 148);
                int var5 = var2[0];
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 149);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 149);
                int var6 = 0;
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 150);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 150);

                while(true) {
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 179);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 179);
                    int var10001 = var2.length;
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 180);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 180);
                    StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 180);
                    if(var6 >= var10001) {
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 181);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 181);
                        StatementMarker.report();
                        return var3;
                    }

                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 151);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 151);
                    StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 151);
                    if(var4 == var6) {
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 152);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 152);
                        var10000 = var2[var4];
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 153);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 153);
                        StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 153);
                        if(var10000 >= var1) {
                            StatementMarker.markStatement("tests.homework.IntArrayUtil", 154);
                            StatementMarker.markBranch("tests.homework.IntArrayUtil", 154);
                            StatementMarker.report();
                            return 1;
                        }

                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 155);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 155);
                        ++var6;
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 156);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 156);
                        var10001 = var2.length;
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 157);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 157);
                        StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 157);
                        if(var6 >= var10001) {
                            StatementMarker.markStatement("tests.homework.IntArrayUtil", 161);
                            StatementMarker.markBranch("tests.homework.IntArrayUtil", 161);
                            StatementMarker.report();
                            return var3;
                        }

                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 158);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 158);
                        var10001 = var2[var6];
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 159);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 159);
                        var5 += var10001;
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 160);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 160);
                    } else {
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 162);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 162);
                        StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 162);
                        if(var5 >= var1) {
                            StatementMarker.markStatement("tests.homework.IntArrayUtil", 163);
                            StatementMarker.markBranch("tests.homework.IntArrayUtil", 163);
                            var10001 = var6 - var4;
                            StatementMarker.markStatement("tests.homework.IntArrayUtil", 164);
                            StatementMarker.markBranch("tests.homework.IntArrayUtil", 164);
                            ++var10001;
                            StatementMarker.markStatement("tests.homework.IntArrayUtil", 165);
                            StatementMarker.markBranch("tests.homework.IntArrayUtil", 165);
                            var3 = this.min(var10001, var3);
                            StatementMarker.markStatement("tests.homework.IntArrayUtil", 166);
                            StatementMarker.markBranch("tests.homework.IntArrayUtil", 166);
                            var10001 = var2[var4];
                            StatementMarker.markStatement("tests.homework.IntArrayUtil", 167);
                            StatementMarker.markBranch("tests.homework.IntArrayUtil", 167);
                            var5 -= var10001;
                            StatementMarker.markStatement("tests.homework.IntArrayUtil", 168);
                            StatementMarker.markBranch("tests.homework.IntArrayUtil", 168);
                            ++var4;
                            StatementMarker.markStatement("tests.homework.IntArrayUtil", 169);
                            StatementMarker.markBranch("tests.homework.IntArrayUtil", 169);
                        } else {
                            StatementMarker.markStatement("tests.homework.IntArrayUtil", 170);
                            StatementMarker.markBranch("tests.homework.IntArrayUtil", 170);
                            ++var6;
                            StatementMarker.markStatement("tests.homework.IntArrayUtil", 171);
                            StatementMarker.markBranch("tests.homework.IntArrayUtil", 171);
                            var10001 = var2.length;
                            StatementMarker.markStatement("tests.homework.IntArrayUtil", 172);
                            StatementMarker.markBranch("tests.homework.IntArrayUtil", 172);
                            StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 172);
                            if(var6 >= var10001) {
                                StatementMarker.markStatement("tests.homework.IntArrayUtil", 176);
                                StatementMarker.markBranch("tests.homework.IntArrayUtil", 176);
                                StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 176);
                                if(var4 == 0) {
                                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 177);
                                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 177);
                                    StatementMarker.report();
                                    return 0;
                                }

                                StatementMarker.markStatement("tests.homework.IntArrayUtil", 178);
                                StatementMarker.markBranch("tests.homework.IntArrayUtil", 178);
                                StatementMarker.report();
                                return var3;
                            }

                            StatementMarker.markStatement("tests.homework.IntArrayUtil", 173);
                            StatementMarker.markBranch("tests.homework.IntArrayUtil", 173);
                            var10001 = var2[var6];
                            StatementMarker.markStatement("tests.homework.IntArrayUtil", 174);
                            StatementMarker.markBranch("tests.homework.IntArrayUtil", 174);
                            var5 += var10001;
                            StatementMarker.markStatement("tests.homework.IntArrayUtil", 175);
                            StatementMarker.markBranch("tests.homework.IntArrayUtil", 175);
                        }
                    }
                }
            }
        }

        StatementMarker.markStatement("tests.homework.IntArrayUtil", 140);
        StatementMarker.markBranch("tests.homework.IntArrayUtil", 140);
        StatementMarker.report();
        return 0;
    }

    private int min(int var1, int var2) {
        StatementMarker.markStatement("tests.homework.IntArrayUtil", 182);
        StatementMarker.markBranch("tests.homework.IntArrayUtil", 182);
        StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 182);
        if(var1 >= var2) {
            StatementMarker.markStatement("tests.homework.IntArrayUtil", 183);
            StatementMarker.markBranch("tests.homework.IntArrayUtil", 183);
            StatementMarker.report();
            return var2;
        } else {
            StatementMarker.markStatement("tests.homework.IntArrayUtil", 184);
            StatementMarker.markBranch("tests.homework.IntArrayUtil", 184);
            StatementMarker.report();
            return var1;
        }
    }

    public void getNextPermutationNumber(int[] var1) {
        StatementMarker.markStatement("tests.homework.IntArrayUtil", 185);
        StatementMarker.markBranch("tests.homework.IntArrayUtil", 185);
        StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 185);
        if(var1 != null) {
            StatementMarker.markStatement("tests.homework.IntArrayUtil", 186);
            StatementMarker.markBranch("tests.homework.IntArrayUtil", 186);
            int var10000 = var1.length;
            StatementMarker.markStatement("tests.homework.IntArrayUtil", 187);
            StatementMarker.markBranch("tests.homework.IntArrayUtil", 187);
            StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 187);
            if(var10000 >= 2) {
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 189);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 189);
                int var2 = 0;
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 190);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 190);
                var10000 = var1.length;
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 191);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 191);
                int var3 = var10000 - 2;
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 192);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 192);

                int var10001;
                int var10002;
                while(true) {
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 200);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 200);
                    StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 200);
                    if(var3 < 0) {
                        break;
                    }

                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 193);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 193);
                    var10000 = var1[var3];
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 194);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 194);
                    var10002 = var3 + 1;
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 195);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 195);
                    var10001 = var1[var10002];
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 196);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 196);
                    StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 196);
                    if(var10000 < var10001) {
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 197);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 197);
                        var2 = var3;
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 198);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 198);
                        break;
                    }

                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 199);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 199);
                    --var3;
                }

                StatementMarker.markStatement("tests.homework.IntArrayUtil", 201);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 201);
                int var4 = 0;
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 202);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 202);
                var10000 = var1.length;
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 203);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 203);
                var3 = var10000 - 1;
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 204);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 204);

                while(true) {
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 211);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 211);
                    StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 211);
                    if(var3 <= var2) {
                        break;
                    }

                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 205);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 205);
                    var10000 = var1[var3];
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 206);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 206);
                    var10001 = var1[var2];
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 207);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 207);
                    StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 207);
                    if(var10000 > var10001) {
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 208);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 208);
                        var4 = var3;
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 209);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 209);
                        break;
                    }

                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 210);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 210);
                    --var3;
                }

                StatementMarker.markStatement("tests.homework.IntArrayUtil", 212);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 212);
                StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 212);
                int var10003;
                if(var2 != 0) {
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 213);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 213);
                    StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 213);
                    if(var4 != 0) {
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 218);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 218);
                        var10002 = var1[var2];
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 219);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 219);
                        int var10005 = var1[var4];
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 220);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 220);
                        var1[var2] = var10005;
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 221);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 221);
                        var1[var4] = var10002;
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 222);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 222);
                        var10001 = var1.length;
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 223);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 223);
                        --var10001;
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 224);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 224);
                        StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 224);
                        if(var2 < var10001) {
                            StatementMarker.markStatement("tests.homework.IntArrayUtil", 225);
                            StatementMarker.markBranch("tests.homework.IntArrayUtil", 225);
                            var10002 = var2 + 1;
                            StatementMarker.markStatement("tests.homework.IntArrayUtil", 226);
                            StatementMarker.markBranch("tests.homework.IntArrayUtil", 226);
                            var10003 = var1.length;
                            StatementMarker.markStatement("tests.homework.IntArrayUtil", 227);
                            StatementMarker.markBranch("tests.homework.IntArrayUtil", 227);
                            --var10003;
                            StatementMarker.markStatement("tests.homework.IntArrayUtil", 228);
                            StatementMarker.markBranch("tests.homework.IntArrayUtil", 228);
                            this.reverse(var1, var10002, var10003);
                        }

                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 229);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 229);
                        StatementMarker.report();
                        return;
                    }
                }

                StatementMarker.markStatement("tests.homework.IntArrayUtil", 214);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 214);
                var10003 = var1.length;
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 215);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 215);
                --var10003;
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 216);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 216);
                this.reverse(var1, 0, var10003);
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 217);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 217);
                StatementMarker.report();
                return;
            }
        }

        StatementMarker.markStatement("tests.homework.IntArrayUtil", 188);
        StatementMarker.markBranch("tests.homework.IntArrayUtil", 188);
        StatementMarker.report();
    }

    private void reverse(int[] var1, int var2, int var3) {
        StatementMarker.markStatement("tests.homework.IntArrayUtil", 230);
        StatementMarker.markBranch("tests.homework.IntArrayUtil", 230);

        while(true) {
            StatementMarker.markStatement("tests.homework.IntArrayUtil", 237);
            StatementMarker.markBranch("tests.homework.IntArrayUtil", 237);
            StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 237);
            if(var2 >= var3) {
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 238);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 238);
                StatementMarker.report();
                return;
            }

            StatementMarker.markStatement("tests.homework.IntArrayUtil", 231);
            StatementMarker.markBranch("tests.homework.IntArrayUtil", 231);
            int var10002 = var1[var2];
            StatementMarker.markStatement("tests.homework.IntArrayUtil", 232);
            StatementMarker.markBranch("tests.homework.IntArrayUtil", 232);
            int var10005 = var1[var3];
            StatementMarker.markStatement("tests.homework.IntArrayUtil", 233);
            StatementMarker.markBranch("tests.homework.IntArrayUtil", 233);
            var1[var2] = var10005;
            StatementMarker.markStatement("tests.homework.IntArrayUtil", 234);
            StatementMarker.markBranch("tests.homework.IntArrayUtil", 234);
            var1[var3] = var10002;
            StatementMarker.markStatement("tests.homework.IntArrayUtil", 235);
            StatementMarker.markBranch("tests.homework.IntArrayUtil", 235);
            ++var2;
            StatementMarker.markStatement("tests.homework.IntArrayUtil", 236);
            StatementMarker.markBranch("tests.homework.IntArrayUtil", 236);
            --var3;
        }
    }

    public int threeSumClosest(int[] var1, int var2) {
        StatementMarker.markStatement("tests.homework.IntArrayUtil", 239);
        StatementMarker.markBranch("tests.homework.IntArrayUtil", 239);
        int var3 = 2147483647;
        StatementMarker.markStatement("tests.homework.IntArrayUtil", 240);
        StatementMarker.markBranch("tests.homework.IntArrayUtil", 240);
        int var4 = 0;
        StatementMarker.markStatement("tests.homework.IntArrayUtil", 241);
        StatementMarker.markBranch("tests.homework.IntArrayUtil", 241);
        this.MergeSort(var1);
        StatementMarker.markStatement("tests.homework.IntArrayUtil", 242);
        StatementMarker.markBranch("tests.homework.IntArrayUtil", 242);
        int var5 = 0;
        StatementMarker.markStatement("tests.homework.IntArrayUtil", 243);
        StatementMarker.markBranch("tests.homework.IntArrayUtil", 243);

        while(true) {
            StatementMarker.markStatement("tests.homework.IntArrayUtil", 266);
            StatementMarker.markBranch("tests.homework.IntArrayUtil", 266);
            int var10001 = var1.length;
            StatementMarker.markStatement("tests.homework.IntArrayUtil", 267);
            StatementMarker.markBranch("tests.homework.IntArrayUtil", 267);
            StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 267);
            if(var5 >= var10001) {
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 268);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 268);
                StatementMarker.report();
                return var4;
            }

            StatementMarker.markStatement("tests.homework.IntArrayUtil", 244);
            StatementMarker.markBranch("tests.homework.IntArrayUtil", 244);
            int var6 = var5 + 1;
            StatementMarker.markStatement("tests.homework.IntArrayUtil", 245);
            StatementMarker.markBranch("tests.homework.IntArrayUtil", 245);
            int var10000 = var1.length;
            StatementMarker.markStatement("tests.homework.IntArrayUtil", 246);
            StatementMarker.markBranch("tests.homework.IntArrayUtil", 246);
            int var7 = var10000 - 1;
            StatementMarker.markStatement("tests.homework.IntArrayUtil", 247);
            StatementMarker.markBranch("tests.homework.IntArrayUtil", 247);

            while(true) {
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 264);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 264);
                StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 264);
                if(var6 >= var7) {
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 265);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 265);
                    ++var5;
                    break;
                }

                StatementMarker.markStatement("tests.homework.IntArrayUtil", 248);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 248);
                var10000 = var1[var5];
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 249);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 249);
                var10001 = var1[var6];
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 250);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 250);
                var10000 += var10001;
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 251);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 251);
                var10001 = var1[var7];
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 252);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 252);
                int var8 = var10000 + var10001;
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 253);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 253);
                var10001 = var8 - var2;
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 254);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 254);
                int var9 = this.abs(var10001);
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 255);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 255);
                StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 255);
                if(var9 == 0) {
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 256);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 256);
                    StatementMarker.report();
                    return var8;
                }

                StatementMarker.markStatement("tests.homework.IntArrayUtil", 257);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 257);
                StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 257);
                if(var9 >= var3) {
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 258);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 258);
                    var3 = var9;
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 259);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 259);
                    var4 = var8;
                }

                StatementMarker.markStatement("tests.homework.IntArrayUtil", 260);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 260);
                StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 260);
                if(var8 <= var2) {
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 261);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 261);
                    ++var6;
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 262);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 262);
                } else {
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 263);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 263);
                    --var7;
                }
            }
        }
    }

    private int abs(int var1) {
        StatementMarker.markStatement("tests.homework.IntArrayUtil", 269);
        StatementMarker.markBranch("tests.homework.IntArrayUtil", 269);
        StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 269);
        if(var1 < 0) {
            StatementMarker.markStatement("tests.homework.IntArrayUtil", 270);
            StatementMarker.markBranch("tests.homework.IntArrayUtil", 270);
            int var10000 = -var1;
            StatementMarker.markStatement("tests.homework.IntArrayUtil", 271);
            StatementMarker.markBranch("tests.homework.IntArrayUtil", 271);
            StatementMarker.report();
            return var10000;
        } else {
            StatementMarker.markStatement("tests.homework.IntArrayUtil", 272);
            StatementMarker.markBranch("tests.homework.IntArrayUtil", 272);
            StatementMarker.report();
            return var1;
        }
    }

    private void MergeSort(int[] var1) {
        StatementMarker.markStatement("tests.homework.IntArrayUtil", 273);
        StatementMarker.markBranch("tests.homework.IntArrayUtil", 273);
        int var10002 = var1.length;
        StatementMarker.markStatement("tests.homework.IntArrayUtil", 274);
        StatementMarker.markBranch("tests.homework.IntArrayUtil", 274);
        this.MergeSort(0, var10002, var1);
        StatementMarker.markStatement("tests.homework.IntArrayUtil", 275);
        StatementMarker.markBranch("tests.homework.IntArrayUtil", 275);
        StatementMarker.report();
    }

    private void MergeSort(int var1, int var2, int[] var3) {
        StatementMarker.markStatement("tests.homework.IntArrayUtil", 276);
        StatementMarker.markBranch("tests.homework.IntArrayUtil", 276);
        StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 276);
        int var10001;
        int var4;
        if(var2 > 2) {
            StatementMarker.markStatement("tests.homework.IntArrayUtil", 277);
            StatementMarker.markBranch("tests.homework.IntArrayUtil", 277);
            int var10000 = var2 / 2;
            StatementMarker.markStatement("tests.homework.IntArrayUtil", 278);
            StatementMarker.markBranch("tests.homework.IntArrayUtil", 278);
            double var5 = (double)var10000;
            StatementMarker.markStatement("tests.homework.IntArrayUtil", 279);
            StatementMarker.markBranch("tests.homework.IntArrayUtil", 279);
            var5 = Math.floor(var5);
            StatementMarker.markStatement("tests.homework.IntArrayUtil", 280);
            StatementMarker.markBranch("tests.homework.IntArrayUtil", 280);
            var4 = (int)var5;
            StatementMarker.markStatement("tests.homework.IntArrayUtil", 281);
            StatementMarker.markBranch("tests.homework.IntArrayUtil", 281);
            StatementMarker.markStatement("tests.homework.IntArrayUtil", 282);
            StatementMarker.markBranch("tests.homework.IntArrayUtil", 282);
            this.MergeSort(var1, var4, var3);
            StatementMarker.markStatement("tests.homework.IntArrayUtil", 283);
            StatementMarker.markBranch("tests.homework.IntArrayUtil", 283);
            var10001 = var1 + var4;
            StatementMarker.markStatement("tests.homework.IntArrayUtil", 284);
            StatementMarker.markBranch("tests.homework.IntArrayUtil", 284);
            var2 -= var4;
            this.MergeSort(var10001, var2, var3);
            StatementMarker.markStatement("tests.homework.IntArrayUtil", 285);
            StatementMarker.markBranch("tests.homework.IntArrayUtil", 285);
            int var10003 = var1 + var4;
            StatementMarker.markStatement("tests.homework.IntArrayUtil", 286);
            StatementMarker.markBranch("tests.homework.IntArrayUtil", 286);
            this.mergeWithExtraStorage(var1, var4, var10003, var2, var3);
            StatementMarker.markStatement("tests.homework.IntArrayUtil", 287);
            StatementMarker.markBranch("tests.homework.IntArrayUtil", 287);
        } else {
            StatementMarker.markStatement("tests.homework.IntArrayUtil", 288);
            StatementMarker.markBranch("tests.homework.IntArrayUtil", 288);
            StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 288);
            if(var2 == 2) {
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 289);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 289);
                var10001 = var1 + 1;
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 290);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 290);
                var4 = var3[var10001];
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 291);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 291);
                var10001 = var3[var1];
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 292);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 292);
                StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 292);
                if(var4 < var10001) {
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 293);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 293);
                    var10001 = var1 + 1;
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 294);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 294);
                    int var10002 = var3[var1];
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 295);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 295);
                    var3[var10001] = var10002;
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 296);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 296);
                    var3[var1] = var4;
                }
            }
        }

        StatementMarker.markStatement("tests.homework.IntArrayUtil", 297);
        StatementMarker.markBranch("tests.homework.IntArrayUtil", 297);
        StatementMarker.report();
    }

    private void mergeWithExtraStorage(int var1, int var2, int var3, int var4, int[] var5) {
        StatementMarker.markStatement("tests.homework.IntArrayUtil", 298);
        StatementMarker.markBranch("tests.homework.IntArrayUtil", 298);
        int var12 = 0;
        StatementMarker.markStatement("tests.homework.IntArrayUtil", 299);
        StatementMarker.markBranch("tests.homework.IntArrayUtil", 299);
        int var10000 = var2 + var4;
        StatementMarker.markStatement("tests.homework.IntArrayUtil", 300);
        StatementMarker.markBranch("tests.homework.IntArrayUtil", 300);
        Integer[] var6 = new Integer[var10000];
        StatementMarker.markStatement("tests.homework.IntArrayUtil", 301);
        StatementMarker.markBranch("tests.homework.IntArrayUtil", 301);
        int var7 = var1;
        StatementMarker.markStatement("tests.homework.IntArrayUtil", 302);
        StatementMarker.markBranch("tests.homework.IntArrayUtil", 302);
        int var8 = var3;
        StatementMarker.markStatement("tests.homework.IntArrayUtil", 303);
        StatementMarker.markBranch("tests.homework.IntArrayUtil", 303);
        int var9 = var1 + var2;
        StatementMarker.markStatement("tests.homework.IntArrayUtil", 304);
        StatementMarker.markBranch("tests.homework.IntArrayUtil", 304);
        var3 += var4;
        StatementMarker.markStatement("tests.homework.IntArrayUtil", 305);
        StatementMarker.markBranch("tests.homework.IntArrayUtil", 305);

        while(true) {
            while(true) {
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 340);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 340);
                StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 340);
                if(var7 >= var9) {
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 341);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 341);
                    StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 341);
                    if(var8 >= var3) {
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 342);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 342);
                        int var13 = 0;
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 343);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 343);
                        var10000 = var1 + var2;
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 344);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 344);
                        var9 = var10000 + var4;
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 345);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 345);
                        int var14 = var1;
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 346);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 346);

                        while(true) {
                            StatementMarker.markStatement("tests.homework.IntArrayUtil", 353);
                            StatementMarker.markBranch("tests.homework.IntArrayUtil", 353);
                            StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 353);
                            if(var14 >= var9) {
                                StatementMarker.markStatement("tests.homework.IntArrayUtil", 354);
                                StatementMarker.markBranch("tests.homework.IntArrayUtil", 354);
                                StatementMarker.report();
                                return;
                            }

                            StatementMarker.markStatement("tests.homework.IntArrayUtil", 347);
                            StatementMarker.markBranch("tests.homework.IntArrayUtil", 347);
                            int var10003 = var13;
                            StatementMarker.markStatement("tests.homework.IntArrayUtil", 348);
                            StatementMarker.markBranch("tests.homework.IntArrayUtil", 348);
                            ++var13;
                            StatementMarker.markStatement("tests.homework.IntArrayUtil", 349);
                            StatementMarker.markBranch("tests.homework.IntArrayUtil", 349);
                            Integer var10002 = var6[var10003];
                            StatementMarker.markStatement("tests.homework.IntArrayUtil", 350);
                            StatementMarker.markBranch("tests.homework.IntArrayUtil", 350);
                            int var15 = var10002.intValue();
                            StatementMarker.markStatement("tests.homework.IntArrayUtil", 351);
                            StatementMarker.markBranch("tests.homework.IntArrayUtil", 351);
                            var5[var14] = var15;
                            StatementMarker.markStatement("tests.homework.IntArrayUtil", 352);
                            StatementMarker.markBranch("tests.homework.IntArrayUtil", 352);
                            ++var14;
                        }
                    }
                }

                StatementMarker.markStatement("tests.homework.IntArrayUtil", 306);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 306);
                Integer var10 = null;
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 307);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 307);
                StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 307);
                if(var7 < var9) {
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 308);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 308);
                    var10000 = var5[var7];
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 309);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 309);
                    var10 = Integer.valueOf(var10000);
                }

                StatementMarker.markStatement("tests.homework.IntArrayUtil", 310);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 310);
                Integer var11 = null;
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 311);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 311);
                StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 311);
                if(var8 < var3) {
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 312);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 312);
                    var10000 = var5[var8];
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 313);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 313);
                    var11 = Integer.valueOf(var10000);
                }

                StatementMarker.markStatement("tests.homework.IntArrayUtil", 314);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 314);
                StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 314);
                int var10001;
                if(var10 != null) {
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 315);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 315);
                    StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 315);
                    if(var11 == null) {
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 316);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 316);
                        var10001 = var12;
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 317);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 317);
                        ++var12;
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 318);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 318);
                        var6[var10001] = var10;
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 319);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 319);
                        ++var7;
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 320);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 320);
                        continue;
                    }
                }

                StatementMarker.markStatement("tests.homework.IntArrayUtil", 321);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 321);
                StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 321);
                if(var11 != null) {
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 322);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 322);
                    StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 322);
                    if(var10 == null) {
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 323);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 323);
                        var10001 = var12;
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 324);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 324);
                        ++var12;
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 325);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 325);
                        var6[var10001] = var11;
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 326);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 326);
                        ++var8;
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 327);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 327);
                        continue;
                    }
                }

                StatementMarker.markStatement("tests.homework.IntArrayUtil", 328);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 328);
                StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 328);
                if(var11 != null) {
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 329);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 329);
                    var10000 = var11.compareTo(var10);
                    StatementMarker.markStatement("tests.homework.IntArrayUtil", 330);
                    StatementMarker.markBranch("tests.homework.IntArrayUtil", 330);
                    StatementMarker.markIfStatement("tests.homework.IntArrayUtil", 330);
                    if(var10000 <= 0) {
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 331);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 331);
                        var10001 = var12;
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 332);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 332);
                        ++var12;
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 333);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 333);
                        var6[var10001] = var11;
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 334);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 334);
                        ++var8;
                        StatementMarker.markStatement("tests.homework.IntArrayUtil", 335);
                        StatementMarker.markBranch("tests.homework.IntArrayUtil", 335);
                        continue;
                    }
                }

                StatementMarker.markStatement("tests.homework.IntArrayUtil", 336);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 336);
                var10001 = var12;
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 337);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 337);
                ++var12;
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 338);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 338);
                var6[var10001] = var10;
                StatementMarker.markStatement("tests.homework.IntArrayUtil", 339);
                StatementMarker.markBranch("tests.homework.IntArrayUtil", 339);
                ++var7;
            }
        }
    }
}
