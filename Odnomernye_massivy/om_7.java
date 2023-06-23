//Даны действительные числа a1,a2,...,an. Найти max(a1+a2n,a2+a2n−1,...,an+an+1

package Odnomernye_massivy;

import java.util.Scanner;
public class om_7 {
    public static void task7() {
        System.out.println("Введите количество элементов:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double[] num = new double[n];
        System.out.println("Задайте значения элементам: ");
        for (int i = 0; i < n; i++) {
            num[i] = scan.nextDouble();
        }

        double s = num[0] + num[num.length - 1];
        for (int i = 1; i < num.length / 2; i++) {
            double s1 = num[i] + num[num.length - i - 1];
            if (s1 > s) {
                s = s1;
            }
        }
        System.out.println("Ответ= " + s);
    }
}
