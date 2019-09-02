package cn.z.text;
/**
 * 分析：创建整形数组，从控制台接收键盘输入的整型数，并对数组进行循环赋值
 * 实现步骤如下：
 * 1.创建整型数组
 * 2.创建Scanner对象
 * 3.将循环变量i作为数组下标，循环接收键盘输入，并为数组元素赋值
 */

import java.util.Scanner;

public class Text {

	//qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq
	public static void main(String[] args) {
		int scores[]=new int[5];  //创建长度为5的整形数组
		Scanner scanner=new Scanner(System.in);  //创建scanner对象
		for (int i = 0; i <scores.length; i++) {  //scores.length的长度等于数组的长度5
			scores[i]=scanner.nextInt();  //接受键盘录入数据
		}
		
	}

}
