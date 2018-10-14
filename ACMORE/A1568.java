/*1568:基础练习 时间转换

Description
给定一个以秒为单位的时间t，要求用“<H>:<M>:<S>”的格式来表示这个时间。<H>表示时间，<M>表示分钟，而<S>表示秒，它们都是整数且没有前导的“0”。例如，若t=0，则应输出是“0:0:0”；若t=3661，则输出“1:1:1”。
 
Input
输入只有一行，是一个整数t（0<=t<=86399）。  

Output
输出只有一行，是以“<H>:<M>:<S>”的格式所表示的时间，不包括引号。 

Sample Input
NO.1
0
NO.2
5436 

Sample Output
NO.1
0:0:0  
NO.2
1:30:36  

Source
蓝桥杯
*/

import java.util.Scanner;
public class A1568 {
	public static void main(String[] args) {
		int s = new Scanner(System.in).nextInt();
		System.out.println(s/3600+":"+s%3600/60+":"+s%3600%60);//模:忽略，除:有几个
	}
}