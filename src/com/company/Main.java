package com.company;

public class Main {

    public static void main(String[] args) {
        int[] num = {10, 1, 1, 0};
        int max = num[0];
        int indOfMax = 0;
        int min = num[0];
        int indOfMin = 0;
        for (int i = 0; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
                indOfMax = i;
            }
            if (min > num[i]) {
                min = num[i];
                indOfMin = i;
            }
        }
        System.out.println("Максимальное значение в массиве равно " + max);
        System.out.println("Минимальное значение в массиве равно " + min);
        int sum = 0;
        if (indOfMax < indOfMin) {
            for (int i = indOfMax + 1; i < indOfMin; i++) {
                sum += num[i];
            }
        } else {
            for (int i = indOfMin + 1; i < indOfMax; i++) {
                sum += num[i];
            }
        }
        System.out.println("Сумма чисел между min и max равна " + sum);
    }


}
