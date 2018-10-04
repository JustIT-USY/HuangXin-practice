/*1563:基础练习 回文数
Description
1221是一个非常特殊的数，它从左边读和从右边读是一样的，编程求所有这样的四位十进制数。

Output
按从小到大的顺序输出满足条件的四位十进制数。

Sample Output
1221
*/

public class A1563 {
	public static void main(String[] args) {
		for(int i=10;i<=99;i++) {//只看这个四位数的一半
			StringBuffer sb = new StringBuffer(i+"");//int转字符串
			String s2 = sb.reverse().toString();
			System.out.println(i+s2);//拼装
		}
	}
}