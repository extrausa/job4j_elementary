package ru.job4j.ex;
//0.6. Error - исключения, связанные с работой виртуальной машины [#363103]
public class FactRec {
    public static int calc(int n) {
        if (n == 0 || n == 1){
            return 1;
        } else {
            return calc(n - 1) * n;
        }
    }

    public static void main(String[] args) {
        int rsl = calc(3);
        System.out.println(rsl);
    }
}
