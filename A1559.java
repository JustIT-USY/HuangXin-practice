/*1559:基础练习 01字串

Description
对于长度为5位的一个01串，每一位都可能是0或1，一共有32种可能。它们的前几个是：
00000
00001
00010
00011
00100
请按从小到大的顺序输出这32种01串。

Input
本试题没有输入。

Output
输出32行，按从小到大的顺序每行一个长度为5的01串。

Sample Output
00000
00001
00010
00011
*/
class A1559{
//首先就要想到11111字串就是32的二进制数值
	public static void main(String[] args) {
		String[] n = new String[5];
		for(int i=0;i<32;i++) {
			int ii = i;
			for(int j=0;j<5;j++) {将十进制转换成对应的二进制字串，进制转换本质即 除与取模 某一值
				n[j]=ii%2+"";
				ii = ii / 2;
			}
			System.out.println(n[4]+n[3]+n[2]+n[1]+n[0]);
		}
	}
}