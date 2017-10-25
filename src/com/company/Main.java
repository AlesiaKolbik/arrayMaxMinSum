package com.company;

public class Main {

    public static void main(String[] args) {
        int[] num = {3, 10, 9, 4, 4, 2, 5, 8};
        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
            }
        }
        System.out.println("Максимальное значение в массиве равно "+ max );
        int min = num[0];
        for (int j = 0; j < num.length; j++) {
            if (min > num[j]) {
                min = num[j];
            }
        }
        System.out.println("Минимальное значение в массиве равно "+ min );
        int sum = 0;
        
          }
        System.out.println(" "+ sum );
    }
}
