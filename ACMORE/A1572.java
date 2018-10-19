/*1572:基础练习 矩形面积交

Description
平面上有两个矩形，它们的边平行于直角坐标系的X轴或Y轴。对于每个矩形，我们
给出它的一对相对顶点的坐标，请你编程算出两个矩形的交的面积。

Input
输入仅包含两行，每行描述一个矩形。
在每行中，给出矩形的一对相对顶点的坐标，每个点的坐标都用两个绝对值不超过10^7的实数表示。

Output
输出仅包含一个实数，为交的面积，保留到小数后两位。

Sample Input
1 1 3 3
2 2 4 4

Sample Output
1.00

Source
蓝桥杯
*/

import java.util.Scanner;
class A1572{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] x = new double[4];
		double[] y = new double[4];
		double[] z = new double[4];
		for (int i=0;i<4;i++) {
			x[i] = sc.nextDouble();
			y[i] = sc.nextDouble();
		}

		z[0] = Math.max(Math.min(x[0], x[1]),Math.min(x[2], x[3]));//矩形对角线两点
		z[1] = Math.min(Math.max(x[0], x[1]),Math.max(x[2], x[3]));
		z[2] = Math.max(Math.min(y[0], y[1]),Math.min(y[2], y[3]));
		z[3] = Math.min(Math.max(y[0], y[1]),Math.max(y[2], y[3]));
		
		if(z[1]>z[0] && z[3]>z[2]) System.out.printf("%.2f\n",(z[1]-z[0])*(z[3]-z[2]));//注意格式化输出，一般都用printf
		else System.out.println("0.00");//不可直接用sysou语句输出非字符串0.00
	}
}