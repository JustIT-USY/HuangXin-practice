1578:基础练习 龟兔赛跑预测

Description
话说这个世界上有各种各样的兔子和乌龟，但是研究发现，所有的兔子和乌龟都有一个共同的特点——喜欢赛跑。于是世界上各个角落都不断在发生着乌龟和兔子的比赛，小华对此很感兴趣，于是决定研究不同兔子和乌龟的赛跑。他发现，兔子虽然跑比乌龟快，但它们有众所周知的毛病——骄傲且懒惰，于是在与乌龟的比赛中，一旦任一秒结束后兔子发现自己领先t米或以上，它们就会停下来休息s秒。对于不同的兔子，t，s的数值是不同的，但是所有的乌龟却是一致——它们不到终点决不停止。
然而有些比赛相当漫长，全程观看会耗费大量时间，而小华发现只要在每场比赛开始后记录下兔子和乌龟的数据——兔子的速度v1（表示每秒兔子能跑v1米），乌龟的速度v2，以及兔子对应的t，s值，以及赛道的长度l——就能预测出比赛的结果。但是小华很懒，不想通过手工计算推测出比赛的结果，于是他找到了你——清华大学计算机系的高才生——请求帮助，请你写一个程序，对于输入的一场比赛的数据v1，v2，t，s，l，预测该场比赛的结果。
Input
输入只有一行，包含用空格隔开的五个正整数v1，v2，t，s，l，其中(v1,v2<=100;t<=300;s<=10;l<=10000且为v1,v2的公倍数)
Output
输出包含两行，第一行输出比赛结果——一个大写字母“T”或“R”或“D”，分别表示乌龟获胜，兔子获胜，或者两者同时到达终点。
第二行输出一个正整数，表示获胜者（或者双方同时）到达终点所耗费的时间（秒数）。
Sample Input
第一组数据
10 5 5 2 20

第二组数据
10 5 5 1 20

第三组数据
10 5 5 3 20
Sample Output
第一组数据
D
4

第二组数据
R
3

第三组数据
T
4
Hint
注意：
样例输入输出分别有三组数据，程序每次运行计算一组数据即可，不需要全部读入后输出
Source
蓝桥杯

import java.util.Scanner;
class A1578 {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int t = sc.nextInt();
            int s = sc.nextInt();
            int l = sc.nextInt();
            if ((v1 * (l / v1) - v2 * (l / v1)) <= t) {// 终点时，距离之差仍然小于t，就是距离从0开始单调递增但不超过t
                  System.out.println("R");
                  System.out.println(l / v1);
            } else { // 第二种情况 ，拉开t米后才到达终点（即兔子有过一次以上的休息）
                  int i = 1, s_Count = 0, m = 0;// 定义i为时间，s_Count为兔子休息的次数
                  while (v1 * i < l) { // 定义外层循环，判断兔子跑的距离是否到达终点
                        m = s_Count * s * v2 + v2 * i;//m为乌龟随时间的变化而距离起点的距离
                        while ((v1 * i - m >= t)) {//可能2秒了 乌龟仍然没把距离拉近至t内，兔子休息所以i不变
                              m = m + v2 * s; // 乌龟继续走s秒
                              s_Count++;
                              if (m >= l) {//乌龟到了终点
                                    System.out.println("T");
                                    System.out.println(l / v2);
                                    System.exit(0); // 直接结束程序
                              }
                        }
                        i = i + 1; // 兔子再走一秒后继续判断
                  }
                  if (l / v2 == (s_Count * s + l / v1)) { // 到达终点时，判断乌龟和兔子走的时间是否一样，乌龟先到的情况在循环中()
                        System.out.println("D");
                        System.out.println(l / v2);
                  } else {
                        System.out.println("R");
                        System.out.println(s_Count * s + l / v1);
                  }
            }
      }
}