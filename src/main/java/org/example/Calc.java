package org.example;

public class Calc {

    public int summ(int a, int b) {
        int result;
        result = a + b;
        System.out.println("Сумма " + a + " и " + b + " равна " + result);
        // System.out.printf("Сумма %d и %d равна %d", a, b, result);
        return result;
    }

    public int subt(int c, int d) {
        int result2;
        result2 = c - d;
        System.out.println("Разница " + c + " и " + d + " равна " + result2);
        return result2;
    }
}
