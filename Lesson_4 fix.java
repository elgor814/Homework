class Num1 {
    public static void main(String[] args) {


        System.out.println("       task 1 ");
        printThreeWords("Orange ");
        printThreeWords("Banana");
        printThreeWords("Apple");

        System.out.println("       task 2");
        checkSumSign(3, -9);

        System.out.println("       task 3 ");
        printColor(-5);

        System.out.println();
        System.out.println("       task 4 ");
        compareNumbers(7, -25);

        System.out.println("       task 5 ");
        numBetween10or20(6, 25);
        //System.out.println(TrueFalse(q, w));

        System.out.println("       task 6 ");
        pozitivOrNegativ(0);

        System.out.println("       task 7 ");
        returnPozitivOrNegativ(7);

        System.out.println("       task 8 ");
        String str = "qwerty ";
        printLine(str, 5);

        System.out.println();
        System.out.println("       task 9 ");
        myMethod(200);

        System.out.println("       task 10 ");
        task10();

        System.out.println("       task 11 ");
        task11();

        System.out.println();
        System.out.println("       task 12");
        task12();

        System.out.println();
        System.out.println("       task 13 ");
        task13();

        System.out.println("       task 14 ");
        metArr(5, 10);
    }

    // method 1
    static void printThreeWords(String fruit) { // num 1
        System.out.println(fruit);
    }

    // method 2
    static void checkSumSign(int a, int b) { // num 2
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else
            System.out.println("Сумма отрицательная");
    }

    // method 3
    static void printColor(int value) {
        if (value <= 0) {
            System.out.print("Красный");
        } else if (value > 100) {
            System.out.print("Зеленый");
        } else {
            System.out.print("Желтый");
        }
    }

    // method 4
    static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else System.out.println("a < b");
    }

    // method 5
    static boolean numBetween10or20(int a, int b) {
        if (a + b >= 10 && a + b <= 20) ;
    }

    //method 6
    static void pozitivOrNegativ(int a) {
        if (a >= 0) System.out.println("Число положительное");

        else System.out.println("Число отрицательное");
    }

    // method 7
    static boolean returnPozitivOrNegativ(int a) {
        return (a < 0);
    }

    // method 8
    static void printLine(String str1, int a) {
        for (int i = 1; i <= a; i++)
            System.out.print(str1);
    }

    // method 9
    static boolean myMethod(int year) {
        if ((year % 4 == 0 || year % 100 == 0) && year % 400 == 0)
            return true;
        else
            return false;
    }

    // method 10
    static void task10() {
        int[] array1 = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i <= array1.length - 1; i++) {
            if (array1[i] == 0) array1[i] = 1;
            else array1[i] = 0;
            System.out.println(array1[i]);
        }
    }

    // method 11
    static void task11() {
        int[] myArray = new int[100]; // Создаем массив длиной 5

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1; // Заполняем массив значениями от 1 до 5
        }
        System.out.print("Значения массива:");
        System.out.print("[");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.print("]");
    }

    // method 12
    static void task12() {
        int[] array1 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < 6) {
                array1[i] *= 2;
            }
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
    }

    //method 13
    static void task13() {

        int size = 5;
        int[][] squareArray = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || i + j == squareArray.length - 1) {
                    squareArray[i][j] = 1;
                }
                System.out.print(squareArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    // method14
    static int[] metArr(int len, int initialValue) {
        int[] newArr = new int[len];
        for (int i = 0; i < len; i++) {
            newArr[i] = initialValue;
            //System.out.println(arr[i]);
        }
        return newArr;
    }

}

