/*1561:基础练习 数列特征
Description
给出n个数，找出这n个数的最大值，最小值，和。

Input
第一行为整数n，表示数的个数。
第二行有n个数，为给定的n个数，每个数的绝对值都小于10000。

Output
输出三行，每行一个整数。第一行表示这些数中的最大值，第二行表示这些数中的最小值，第三行表示这些数的和。

Sample Input
5
1 3 -2 4 5

Sample Output
5
-2
11

Hint
数据规模与约定
1 <= n <= 10000。
*/
import java.util.Scanner;
class A1561{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();//先录入第一个数，并设其为最大值和最小值
		int max = a;
		int min = a;
		int sum = 0;
		for(int i=1;i<n;i++) {//后面录入的数字个数=总个数-1，所以i=1
			int t = sc.nextInt();
			if(t>max)max = t;//特种部队写法
			if(t<min)min = t;
			sum += t;
		}
		System.out.println(max+"\r\n"+min+"\r\n"+sum+"\r\n");//\r\n：换行
	}
}