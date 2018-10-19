/*1571:基础练习 矩阵乘法

Description
给定一个N阶矩阵A，输出A的M次幂（M是非负整数）
例如：
A =
1 2
3 4
A的2次幂
7 10
15 22

Input
第一行是一个正整数N、M（1<=N<=30, 0<=M<=5），表示矩阵A的阶数和要求的幂数
接下来N行，每行N个绝对值不超过10的非负整数，描述矩阵A的值

Output
　输出共N行，每行N个整数，表示A的M次幂所对应的矩阵。相邻的数之间用一个空格隔开

Sample Input
2 2
1 2
3 4

Sample Output
7 10
15 22

Source
蓝桥杯
*/


import java.util.Scanner;
class A1571 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();//矩阵边长
		int b = sc.nextInt();//矩阵幂数
		long[][] x = new long[a][a];
		long[][] y = new long[a][a];
		long[][] z = new long[a][a];
		
		int i,j,m;
		for(i=0;i<a;i++) {//存入初始矩阵部分
			for(j=0;j<a;j++) {
				x[i][j] = y[i][j] = sc.nextLong();
				z[i][j] = 0;
			}
		}
		
		for(m=1;m<b;m++) {//幂运算部分
			for(i=0;i<a;i++) {
				for(j=0;j<a;j++) {
					z[i][j] = 0;
					for(int o=0;o<a;o++) {
						z[i][j] += y[i][o]*x[o][j];
					}
				}
			}
			for(i=0;i<a;i++) {
				for(j=0;j<a;j++) {
					y[i][j] = z[i][j];
				}
			}
		}
		
		for(i=0;i<a;i++) {//判断幂数部分
			for(j=0;j<a;j++) {
				if(b==0) {
					if(i==j) System.out.print("1 ");
					else System.out.print("0 ");
				}else if(b==1) {
					System.out.print(x[i][j]+" ");
				}else {
					System.out.print(z[i][j]+" ");
				}
			}
			System.out.println();
		}
	}
}