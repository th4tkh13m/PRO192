package loopdemo;

public class Loopdemo {
    public static void main(String[] args) {
        int[] myArr = { 1, 2, 3, 4, 5 };

        System.out.println("Sum by while: " + sumByWhile(myArr));
        System.out.println("Sum by For: " + sumByFor(myArr));
        System.out.println("Sum by doWhile: " + sumByDoWhile(myArr));
    }

    private static int sumByFor(int[] myArr) {
        int sum = 0;
        for (int i = 0; i < myArr.length; i++) {
            sum = sum + myArr[i];

        }
        return sum;
    }

    private static int sumByWhile(int[] myArr) {
        int sum = 0;
        int i = 0;

        int n = myArr.length - 1;

        while (i <= n) {
            sum = sum + myArr[i];
            i++;
        }
        return sum;
    }

    private static int sumByDoWhile(int[] myArr) {
        int sum = 0;
        int i = 0;
        int n = myArr.length - 1;

        do {
            sum = sum + myArr[i];
            i++;
        } while (i <= n);

        return sum;
    }
}
