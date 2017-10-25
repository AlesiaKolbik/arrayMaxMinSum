package com.company;

public class Main {

    public static void main(String[] args) {
        int[] num = {3, 10, 9, 4, 4, 2, 5, 8};
        int max = num[0];
        int indOfMax = 0;
        int min = num[0];
        int indOfMin = 0;
        for (int i = 0; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
                indOfMax =i;
            }
             if (min > num[i]) {
                 min = num[i];
                 indOfMin=i;
                }
        }
        System.out.println("Максимальное значение в массиве равно " + max);
        System.out.println("Минимальное значение в массиве равно " + min);
        int sum = 0;
        if (indOfMax < indOfMin) {
            for (int s= indOfMax+1; s < indOfMin; s++) {
                sum += num[s];
            }
        } else {
            for (int s = indOfMin+1; s < indOfMax; s++) {
                sum += num[s];
            }
        }
        System.out.println("Сумма чисел между min и max равна " + sum);
    }


}
