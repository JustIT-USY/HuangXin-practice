/*1573:基础练习 完美的代价

Description
回文串，是一种特殊的字符串，它从左往右读和从右往左读是一样的。小龙龙认为回文串才是完美的。现在给你一个串，它不一定是回文的，请你计算最少的交换次数使得该串变成一个完美的回文串。
交换的定义是：交换两个相邻的字符
例如mamad
第一次交换 ad : mamda
第二次交换 md : madma
第三次交换 ma : madam (回文！完美！)

Input
第一行是一个整数N，表示接下来的字符串的长度(N <= 8000)
第二行是一个字符串，长度为N.只包含小写字母

Output
如果可能，输出最少的交换次数。
否则输出Impossible

Sample Input
5
mamad

Sample Output
3

Source
蓝桥杯
*/

import java.util.*;
class A1573 {
      public static void main(String[] args){
            int len = new Scanner(System.in).nextInt();
            
            String str = new Scanner(System.in).nextLine();

            char[] ss=str.toCharArray();
            int c=0;//单个数出现次数
            int time=0;//交换次数
            int k=len-1;//对应i在后端的位置
            int i,j;
            boolean flag=true;
            for(i=0;i<k&&flag;i++){
                  for(j=k;j>=i;j--){//i&j彼此互相相向而碰
                        if(i==j){//没有找到
                              c++;
                              if(len%2==0||c>1){//为偶数串 或 奇数串出现两次及以上单个数
                                    flag=false;
                                    break;
                              }
                              time+=Math.abs(len/2-i);
                        }else if(ss[i]==ss[j]){//找到相同
                              for(int z=j;z<k;z++){
                                    ss[z]=ss[z+1];
                                    time++;
                              }
                              k--;
                              break;
                        }
                  }
            }if(flag) System.out.println(time);
            else System.out.println("Impossible");
      }     
}