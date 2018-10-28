1579:基础练习 回形取数
Description
回形取数就是沿矩阵的边取数，若当前方向上无数可取或已经取过，则左转90度。一开始位于矩阵左上角，方向向下。
Input
输入第一行是两个不超过200的正整数m, n，表示矩阵的行和列。接下来m行每行n个整数，表示这个矩阵。
Output
输出只有一行，共mn个数，为输入矩阵回形取数得到的结果。数之间用一个空格分隔，行末不要有多余的空格。
Sample Input
No.1
3 3
1 2 3
4 5 6
7 8 9

No.2
3 2
1 2
3 4
5 6
Sample Output
No.1
1 4 7 8 9 6 3 2 5

No.2
1 3 5 6 4 2
Source
蓝桥杯

import java.util.Scanner;
public class A1579 {
      public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int m = in.nextInt();
            int n = in.nextInt();
            int a[][] = new int[m][n];
            for (int i = 0; i < m; i++) {
                  for (int j = 0; j < n; j++) {
                        a[i][j] = in.nextInt();
                  }
            }
            int i = 0;
            int j = 0;
            int num = 0;
            int om = 0;
            int on = 1;
            int sum = n * m;
            while (num < sum) {
                  while (i < m && num < sum) {// 往下
                        if (num == sum - 1) {
                              System.out.print(a[i++][j]);
                              return;
                        }
                        System.out.print(a[i++][j] + " ");
                        num++;
                  }
                  i--;
                  j++;
                  m--;// 行数减一
                  while (j < n && num < sum) {// 往右
                        if (num == sum - 1) {
                              System.out.print(a[i][j++]);
                              return;
                        }
                        System.out.print(a[i][j++] + " ");
                        num++;
                  }
                  j--;
                  i--;
                  n--;// 列数减一
                  while (i >= om && num < sum) {// 往上
                        if (num == sum - 1) {
                              System.out.print(a[i--][j]);
                              return;
                        }
                        System.out.print(a[i--][j] + " ");
                        num++;
                  }
                  j--;
                  i++;
                  om++;// 上边界加1，每次往上输出一列，om++；
                  while (j >= on && num < sum) {// 往左
                        if (num == sum - 1) {
                              System.out.print(a[i][j--]);
                              return;
                        }
                        System.out.print(a[i][j--] + " ");
                        num++;
                  }
                  j++;
                  i++;
                  on++;// 左边界加1
            }
      }
}