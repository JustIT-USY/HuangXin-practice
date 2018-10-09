/*
1556:入门训练 序列求和

Description
求1+2+3+...+n的值。 
 
Input
输入包括一个整数n。   

Output
输出一行，包括一个整数，表示1+2+3+...+n的值。   

Sample Input
第一组：
4 

第二组：
​100  ​

Sample Output
第一组：
10 ​
第二组：
5050 ​

*/
import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		long rs = new Scanner(System.in).nextLong();//链式编程
		System.out.println((1+rs)*rs/2);//等差数列求和
	}
}
