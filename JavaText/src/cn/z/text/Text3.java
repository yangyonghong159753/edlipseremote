package cn.z.text;

import java.util.Scanner;

/**
 * 使用数组计算5名学生的平均分、最高分和最低分
 * @author Administrator
 *分析:
 *  定义一个长度为5的整型数组
	定义两个float类型变量，用于保存总成绩平均分，初始值均为0
	定义两个int类型变量，用于保存最高分和最低分，初始值均为0
	从控制台接收五名学生的成绩
	通过循环使数组的5个元素相加得到总成绩
	通过循环遍历数组并比较元素大小，得到最高分和最低分
 */

public class Text3 {

	public static void main(String[] args) {
		//定义长度为5的整型数组
		int[]scores=new int[5];
		//总成绩
		float total=0;
		//平均分
		float avg=0;
		//最高分
		int max=0;
		//最低分
		int min=0;
		//创建Scanner对象
		Scanner scanner=new Scanner(System.in);
		//输出提示信息
		System.out.println("请输入5个学生的成绩");
		//创建for循环得到总成绩
		for (int i = 0; i < scores.length; i++) {
			scores[i]=scanner.nextInt();
		}
		//计算最高分和最低分
		max=scores[0];
		min=scores[0];
		for (int j = 0; j < scores.length; j++) {
			total+=scores[j];
			if(scores[j]>max){
				max=scores[j];
			}
			if(scores[j]<min){
				min=scores[j];	
			}
		}  
		//计算平均成绩
		avg=total/5;
		//输出五名学生的总成绩，平均分，最高分和最低分
		System.out.println("总成绩:"+total);
		System.out.println("平均分:"+avg);
		System.out.println("最高分:"+max);
		System.out.println("最低分:"+min);
	}

}
