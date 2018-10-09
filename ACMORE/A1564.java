/*1564:基础练习 特殊回文数

Description
123321是一个非常特殊的数，它从左边读和从右边读是一样的。
输入一个正整数n， 编程求所有这样的五位和六位十进制数，满足各位数字之和等于n 。

Input
输入一行，包含一个正整数n。

Output
按从小到大的顺序输出满足条件的整数，每个整数占一行。

Sample Input
52

Sample Output
899998
989989
998899

Hint
数据规模和约定
1<=n<=54。

import java.util.Scanner;
public class A1564 {
	public static void main(String[] args) {
		int a = new Scanner(System.in).nextInt();
		for(int i=10000;i<=999999;i++) {
			int ge = i%10;
			int shi = i/10%10;//获取对应位的数值
			int bai = i/100%10;
			int qian = i/1000%10;
			int wan = i/10000%10;
			int shiwan = i/100000;
			if(i<100000 && ge==wan && shi==qian && ge+shi+bai+qian+wan==a) {
				System.out.println(i);
			}else if(i>=100000 && ge==shiwan && shi==wan && bai==qian && ge+shi+bai+qian+wan+shiwan==a) {
				System.out.println(i);
			}
		}
	}
}
