/*1567:基础练习 数列排序

Description
给定一个长度为n的数列，将这个数列按从小到大的顺序排列。1<=n<=200

Input
第二行包含n个整数，为待排序的数，每个整数的绝对值小于10000。

Output
输出一行，按从小到大的顺序输出排序后的数列。

Sample Input
5
8 3 6 4 9

Sample Output
3 4 6 8 9

Source
蓝桥杯
*/

import java.util.Scanner;
public class A1567 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr = new int[a];
		for(int i=0;i<a;i++) {
			int z = sc.nextInt();
			if(Math.abs(a)<10000)
				arr[i] = z;
		}
		for(int i=0;i<a-1;i++) {//冒泡排序
			for(int o=0;o<a-1-i;o++) {
				if(arr[o]>arr[o+1]) {
					int temp = arr[o];
					arr[o] = arr[o+1];
					arr[o+1] = temp;
				}
			}
		}
		for (int i=0;i<a;i++) {
			if(i>0)System.out.print(" ");
			System.out.print(arr[i]);//输出格式需要注意
		}
	}
}