1576:基础练习 FJ的字符串

Description
FJ在沙盘上写了这样一些字符串：
A1 = “A”
A2 = “ABA”
A3 = “ABACABA”
A4 = “ABACABADABACABA”
… …
你能找出其中的规律并写所有的数列AN吗？
Input
仅有一个数：N ≤ 26。
Output
请输出相应的字符串AN，以一个换行符结束。输出中不得含有多余的空格或换行、回车符。
Sample Input
3
Sample Output
ABACABA
Source
蓝桥杯

import java.util.Scanner;
class A1576{
     public static void main(String[] args) {
           System.out.println(getStr(new Scanner(System.in).nextInt()));
     }
     
     public static String getStr(int n) {
           if(n==1) return "A";
           else return getStr(n-1)+(char)(n-1+'A')+getStr(n-1);
     }
}