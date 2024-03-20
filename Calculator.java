class Calculator {
    public static void main(String calculate[]) {
        int total = add(5, 6);
        System.out.println(total);
        int total1 = add(5, 6, 7);
        System.out.println(total1);
        int total2 = sub(66, 36);
        System.out.println(total2);
        int total3 = sub(66, 36, 20);
        System.out.println(total3);
        int total4 = mul(23, 3);
        System.out.println(total4);
        int total5 = mul(23, 3, 6);
        System.out.println(total5);
        int total6 = div(40, 2);
        System.out.println(total6);
        int total7 = div(40, 2, 2);
        System.out.println(total7);
        double total8 = mod(100, 3);
        System.out.println(total8);
        int total9 = sqr(4);
        System.out.println(total9);
        double total10 = sqrt(9);
        System.out.println(total10);
        double total11 = n(30);
        System.out.println(total11);
    }

    // method overloads with three parameters
    public static int add(int num1, int num2, int num3) {
        int total = num1 + num2 + num3;
        return total;
    }

    public static int sub(int num1, int num2, int num3) {
        int total = num1 - num2 - num3;
        return total;
    }

    public static int mul(int num1, int num2, int num3) {
        int total = num1 * num2 * num3;
        return total;
    }

    public static int div(int num1, int num2, int num3) {
        int total = num1 / num2 / num3;
        return total;
    }

    // existing methods with two parameters
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int sub(int num1, int num2) {
        return num1 - num2;
    }

    public static int mul(int num1, int num2) {
        return num1 * num2;
    }

    public static int div(int num1, int num2) {
        return num1 / num2;
    }

    // remaining methods with existing signatures
    public static double mod(int num1, int num2) {
        return num1 % num2;
    }

    public static int sqr(int num) {
        return num * num * num;
    }

    public static double sqrt(double num1) {
        return Math.sqrt(num1);
    }

    public static double n(double num1) {
        return 1.0 / num1;
    }
}
