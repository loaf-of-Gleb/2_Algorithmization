//Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i

package Odnomernye_massivy;

import java.util.Scanner;
public class om_5 {
    public static void task5() {
        System.out.println("Введите количество элементов: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] num = new int[n];
        System.out.println("Задайте значения элементам: ");
        for (int i = 0; i < n; i++) {
            num[i] = scan.nextInt();
        }

        System.out.println("Результат: ");
        for (int i = 0; i < n; i++) {
            if (num[i] > i) {
                System.out.print(num[i] + " ");
            }
        }
    }

}
