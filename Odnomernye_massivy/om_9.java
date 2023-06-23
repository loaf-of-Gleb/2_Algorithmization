// В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
//чисел несколько, то определить наименьшее из них.

package Odnomernye_massivy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class om_9 {
    public static void task9() {
        System.out.println("Введите количество элементов: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Integer[] num = new Integer[n];
        System.out.println("Задайте значения элементов... или не задавайте, я вам не господин:");
        for (int i = 0; i < n; i++) {
            num[i] = scan.nextInt();
        }


        Arrays.sort(num, Collections.reverseOrder());
        int k = num[1];
        int t = 1;
        int countt = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (num[i] == num[j])
                    countt++;
            }
            if (((t == countt) && (k > num[i])) || (t < countt)) {
                k = num[i];
                t = countt;
            }
            countt = 0;
        }
        System.out.print(" самое маленькое из самых часто повторяющихся чисел: " + k + " \n количество повторений " + t );
    }
}
