/*
1555:入门训练 Fibonacci数列

Description
Fibonacci数列的递推公式为：Fn=Fn-1+Fn-2，其中F1=F2=1。
当n比较大时，Fn也非常大，现在我们想知道，Fn除以10007的余数是多少。

Input
输入包含一个整数n。

Output
输出一行，包含一个整数，表示Fn除以10007的余数。

Sample Input
10

Sample Output
55

*/
import java.util.Scanner;
public class A1555 {
	public static void main(String[] args) {
		int a = 1;//F1
		int b = 1;//F2
		int n = new Scanner(System.in).nextInt();
		for(int i=3;i<n;i++) {//大概这么个意思：不是一定要求出Fn的值才能求余数，直接从前面的数就开始求余数，最后到Fn时求的余数就是答案
			int t = b;
			b = (a+b)%10007;
			a = t;
		}
		System.out.println(b);
	}
}

