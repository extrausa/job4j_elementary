package ru.job4j.temp;

public class Cycle {
    public static int sum(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num = num / 10;
        }

        return sum;
    }

    public static int count(int a, int b) {
        int count = 0;
        for (int i = a; i <= b ; i++) {
            if (i % 2 == 1) {
                count ++;
            }

        }
        return count;

    }

    public static int countSection(int length, int section) {
        int count = 0;
        while (length > 0) {
            length = length - section;
            if (length < 0) {
               break;
            }
            count++;
        }
        return count;
    }

    public static int sum(int a, int b) {
        int summ = 0;
        int point = 1;
        for (int i = a; i <= b; i++) {
           if (point % 2 != 0) {
               summ += i;

           }
           point++;


        }
        return summ;

    }

    public static int checkStrings(String left, String right) {
        int summ = 0;
        int lengthLeft = left.length();
        int lengthRight = right.length();
        for (int i = 0; i < left.length(); i++) {
           if (left.charAt(i) != right.charAt(i)) {
               summ++;
           }
        }
        return summ;
    }
    public static String code(String s) {
        if (s == null || s=="") {
            return s = "empty";
        }
        if (s.length() > 0 & s.length() <= 4) {
            return s;
        } else {
            StringBuilder strBilder = new StringBuilder(s);
            for (int i = 0; i < s.length() - 4; i++) {
                //char c = strBilder.charAt(i);
                strBilder.setCharAt(i, '#');
            }
            return strBilder.toString();
        }

        //return s;
    }

    public static boolean check(int i) {
        String a = Integer.toString(i);
        for (int j = 0; j < a.length() / 2; j++) {

            if (a.charAt(j) != a.charAt((a.length() - 1) - j)) {
                return false;
            }

            
        }
        return true;
    }

    public static String collect(String s) {
        String[] array;
        String separator = " ";
        array = s.split(separator);
        StringBuilder str = new StringBuilder(s);
        str.delete(0, s.length());
        for (int i = 0; i < array.length; i++) {

            str.append(array[i].charAt(0));

        }
        return str.toString();
    }

    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != i + 1) {
                return false;
            }
        }
        return true;
    }
    public static void printCrossEl(int[] left, int[] right) {
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                    System.out.println(left[i]);
                }

            }

        }
    }
}
