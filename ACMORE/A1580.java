1580:基础练习 报时助手
Description
给定当前的时间，请用英文的读法将它读出来。
时间用时h和分m表示，在英文的读法中，读一个时间的方法是：
如果m为0，则将时读出来，然后加上“o'clock”，如3:00读作“three o'clock”。
如果m不为0，则将时读出来，然后将分读出来，如5:30读作“five thirty”。
时和分的读法使用的是英文数字的读法，其中0~20读作：
0:zero, 1: one, 2:two, 3:three, 4:four, 5:five, 6:six, 7:seven, 8:eight, 9:nine, 10:ten, 11:eleven, 12:twelve, 13:thirteen, 14:fourteen, 15:fifteen, 16:sixteen, 17:seventeen, 18:eighteen, 19:nineteen, 20:twenty。
30读作thirty，40读作forty，50读作fifty。
对于大于20小于60的数字，首先读整十的数，然后再加上个位数。如31首先读30再加1的读法，读作“thirty one”。
按上面的规则21:54读作“twenty one fifty four”，9:07读作“nine seven”，0:15读作“zero fifteen”。
Input
输入包含两个非负整数h和m，表示时间的时和分。非零的数字前没有前导0。h小于24，m小于60。
Output
输出时间时刻的英文。
Sample Input
0 15
Sample Output
zero fifteen
Source
蓝桥杯

import java.util.Scanner;
public class A1580 {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int h = sc.nextInt();
            int m = sc.nextInt();
            String a[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
                        "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty" };
            if (h >= 0 && h <= 20) System.out.print(a[h] + " ");
            else if (h == 21) System.out.print(a[20] + " " + a[1] + " ");
            else if (h == 22) System.out.print(a[20] + " " + a[2] + " ");
            else if (h == 23) System.out.print(a[20] + " " + a[3] + " ");
            else if (h == 24) System.out.print(a[20] + " " + a[4] + " ");
            if (m == 0) System.out.print("o'clock");
            else if (m > 0 && m <= 20) System.out.print(a[m]);
            else if (m > 20 && m < 30) System.out.print(a[20] + " " + a[m - 20]);
            else if (m == 30) System.out.print("thirty");
            else if (m > 30 && m < 40) System.out.print("thirty " + a[m - 30]);
            else if (m == 40) System.out.print("forty");
            else if (m > 40 && m < 50) System.out.print("forty " + a[m - 40]);
            else if (m == 50) System.out.print("fifty");
            else if (m > 50 && m < 60) System.out.print("fifty " + a[m - 50]);
      }
}