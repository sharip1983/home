package ru.sharip.se;

public class homework2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 0;
        arr[3] = 0;
        arr[4] = 1;
        arr[5] = 0;
        arr[6] = 1;
        arr[7] = 1;
        arr[8] = 0;
        arr[9] = 0;
        swap(arr);

        int[] multiple = new int[8];
        int factor = 3;
        multipleFill(multiple, factor);

        int[] compare = new int[12];
        compare[0] = 1;
        compare[1] = 5;
        compare[2] = 3;
        compare[3] = 2;
        compare[4] = 11;
        compare[5] = 4;
        compare[6] = 5;
        compare[7] = 2;
        compare[8] = 4;
        compare[9] = 8;
        compare[10] = 9;
        compare[11] = 1;
        compareSix(compare);

        int[][] square = new int[5][5];
        swapDiag(square);

        minmax(compare);

        int[] balance = new int[5];
        balance[0] = 4;
        balance[1] = 3;
        balance[2] = 0;
        balance[3] = 2;
        balance[4] = 5;
        boolean check = checkBalance(balance);
        System.out.println(check);

        int mover = 3;
        moveElements(compare, mover);

        int[][] helix = new int[4][8];
        fillHelix(helix);


    }

    private static void moveElements(int[] compare, int mover) {
    }

    private static void fillHelix(int[][] helix) {
    }

    public static void swap(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    public static int[] multipleFill(int[] arr, int factor) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * factor;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return arr;
    }

    public static int[] compareSix(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] *= 2;
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        return arr;
    }

    public static int[][] swapDiag(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((i == j) || (i + j == arr.length - 1)) arr[i][j] = 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        return arr;
    }

    public static void minmax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];

        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }

    public static boolean checkBalance(int[] arr) {
        boolean res = false;
        int sum = 0;
        int balance = 0;
        for (int i = 0; i < arr.length; i++) {
            balance += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            balance -= arr[i];
            sum += arr[i];
            System.out.println(sum + " " + balance);
            if (balance == sum) {
                res = true;
                break;
            }

        }
        return res;
    }
}