//Дана последовательность целых чисел a1,a2,...,an.Образовать новую последовательность,
// выбросив из исходной те члены, которые равны min(a1,a2,...,an)

package Odnomernye_massivy;

import java.util.Scanner;
public class om_8 {
    public static void task8() {
        System.out.println("Введите количество элементов последовательности: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] num = new int[n];
        System.out.println("Задайте значения элементам: ");
        for (int i = 0; i < n; i++) {
            num[i] = scan.nextInt();
        }


        int min = num[0];
        for (int i = 0; i < n; i++) {
            if (min > num[i]) {
                min = num[i];
            }
        }
        System.out.println("Минимальный элемент в последовательности = " + min);
        System.out.println("Новая последовательность: ");
        for (int i = 0; i < n; i++) {
            if (num[i] != min) {
                System.out.print(num[i] + "\n");
            }
        }
    }
}
//я не уверен, что правильно понял задание