/*1560:������ϰ ��ĸͼ��

Description
������ĸ�������һЩ������ͼ�Σ����������һ�����ӣ�
ABCDEFG
BABCDEF
CBABCDE
DCBABCD
EDCBABC
����һ��5��7�е�ͼ�Σ����ҳ����ͼ�εĹ��ɣ������һ��n��m�е�ͼ�Ρ�

Input
����һ�У�������������n��m���ֱ��ʾ��Ҫ�����ͼ�ε�������������

Output
���n�У�ÿ��m���ַ���Ϊ���ͼ�Ρ�

Sample Input
5 7

Sample Output
ABCDEFG
BABCDEF
CBABCDE
DCBABCD
EDCBABC

Hint
���ݹ�ģ��Լ��
1 <= n, m <= 26��
*/
import java.util.Scanner;
class A1560{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();//row
		int c = sc.nextInt();//col
		//�����ת��Ϊ����������ǰ���뵱ǰ�еĹ�ϵ��a-b
		for(int a=0;a<r;a++) {
			for(int b=0;b<c;b++) {
				System.out.print((char)(Math.abs(a-b)+'A'));//��ĸ�ַ���ASCII����������ֵ�����ģ���Ȼ����ͨ����ֵ�����ûض�Ӧ�ַ�
			}
			System.out.println();//����
		}
	}
}