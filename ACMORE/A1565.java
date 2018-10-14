/*1565:基础练习 十六进制转十进制

Description
从键盘输入一个不超过8位的正的十六进制数字符串，将它转换为正的十进制数后输出。
注：十六进制数中的10~15分别用大写的英文字母A、B、C、D、E、F表示。

Input
十六进制数字符串

Output
十进制数

Sample Input
FFFF

Sample Output
65535

Source
蓝桥杯
/*
import java.util.Scanner;
class A1565{
	public static void main(String[] args) {
		String input = new Scanner(System.in).nextLine();
		System.out.println(Long.parseLong(input,16));//16进制转10进制，int可能装不下所以用long；而parseLong方法的重载可传入指定参数自动转化成10进制数
	}
}