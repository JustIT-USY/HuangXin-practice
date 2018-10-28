1577:基础练习 芯片测试

Description
有n（2≤n≤20）块芯片，有好有坏，已知好芯片比坏芯片多。
每个芯片都能用来测试其他芯片。用好芯片测试其他芯片时，能正确给出被测试芯片是好还是坏。而用坏芯片测试其他芯片时，会随机给出好或是坏的测试结果（即此结果与被测试芯片实际的好坏无关）。
给出所有芯片的测试结果，问哪些芯片是好芯片。

Input
输入数据第一行为一个整数n，表示芯片个数。
第二行到第n+1行为n*n的一张表，每行n个数据。表中的每个数据为0或1，在这n行

中的第i行第j列（1≤i, j≤n）的数据表示用第i块芯片测试第j块芯片时得到的测试结果，1

表示好，0表示坏，i=j时一律为1（并不表示该芯片对本身的测试结果。芯片不能对本身

进行测试）。
Output
按从小到大的顺序输出所有好芯片的编号
Sample Input
3
1 0 1
0 1 0
1 0 1
Sample Output
1 3
Source
蓝桥杯

import java.util.Scanner;
class A1577 {
     public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
           int[][] a = new int[n][n];
           
           int[][] jud = new int[n][2];//对错计数
           
           for(int i=0;i<n;i++) {
                for(int j=0;j<n;j++) {
                     int in = sc.nextInt();
                     if(in==0) jud[j][1] += 1;
                     else if(in==1) jud[j][0] += 1;
                }
           }
           
           for(int i=0;i<n;i++) {
                if(jud[i][0]>jud[i][1]) System.out.print(i+1+" ");//不知道为什么，平时答案最后面一个数字不能有空格，但这个例外，可能是不可控吧
           }
     }
}