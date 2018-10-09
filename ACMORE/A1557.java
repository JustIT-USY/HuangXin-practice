/*1557:入门训练 圆的面积

Description
给定圆的半径r，求圆的面积。

Input
输入包含一个整数r，表示圆的半径。

Output
输出一行，包含一个实数，四舍五入保留小数点后7位，表示圆的面积。

Sample Input
4

Sample Output
50.2654825
*/

import java.util.Scanner;
class A1557{
	public static void main(String[] args) {
		final double PI = Math.PI;
		int rs = new Scanner(System.in).nextInt();
		System.out.printf("%.7f",PI*rs*rs);
	}
}
