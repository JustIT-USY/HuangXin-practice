/*1570:基础练习 分解质因数

Description
求出区间[a,b]中所有整数的质因数分解。  

Input
输入两个整数a，b。  

Output
每行输出一个数的分解，形如k=a1*a2*a3...(a1<=a2<=a3...，k也是从小到大的)(具体可看样例)  

Sample Input
3 10  

Sample Output
3=3  
4=2*2  
5=5  
6=2*3  
7=7  
8=2*2*2  
9=3*3  
10=2*5  

Hint
提示
先筛出所有素数，然后再分解。
数据规模和约定
2<=a<=b<=10000

Source
蓝桥杯
*/

import java.util.Scanner;
class A1570{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		for(int i=a;i<=b;i++) {
			System.out.print(i+"="+fun(i)+"\r\n");
		}
	}
	static String fun(int i) {//特种部队写法
		for(int o=2;o<i;o++) {
			if(i%o==0) return o+"*"+fun(i/o);
		}return i+"";//循环中所有都不满足if语句
	}
}