/*1560:基础练习 字母图形

Description
利用字母可以组成一些美丽的图形，下面给出了一个例子：
ABCDEFG
BABCDEF
CBABCDE
DCBABCD
EDCBABC
这是一个5行7列的图形，请找出这个图形的规律，并输出一个n行m列的图形。

Input
输入一行，包含两个整数n和m，分别表示你要输出的图形的行数的列数。

Output
输出n行，每个m个字符，为你的图形。

Sample Input
5 7

Sample Output
ABCDEFG
BABCDEF
CBABCDE
DCBABCD
EDCBABC

Hint
数据规模与约定
1 <= n, m <= 26。
*/
import java.util.Scanner;
class A1560{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();//row
		int c = sc.nextInt();//col
		//问题可转换为所遍历到当前行与当前列的关系：a-b
		for(int a=0;a<r;a++) {
			for(int b=0;b<c;b++) {
				System.out.print((char)(Math.abs(a-b)+'A'));//字母字符在ASCII表中是有数值索引的，自然可以通过数值索引拿回对应字符
			}
			System.out.println();//换行
		}
	}
}