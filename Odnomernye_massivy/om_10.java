//Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
//элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.

package Odnomernye_massivy;

import java.util.Scanner;
public class om_10 {
    public static void task10() {
        System.out.println("Введите количество элементов массива: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] num = new int[n];
        System.out.println("Задайте значения элементов: ");
        for (int i = 0; i < n; i++) {
            num[i] = scan.nextInt();
        }

        System.out.println("массив с нулями:");
        for (int i = 0; i < num.length; i++) {
            if (i % 2 != 0)
                num[i] = 0;
            System.out.print(num[i] + "\n");
        }


        System.out.println("сжатый массив:");
        int count = 1;
        for (int i = 0; i < num.length; i += 2) {
            num[count - 1] = num[i];
            count++;
            System.out.print(num[i] + "\n");
        }
    }
}
