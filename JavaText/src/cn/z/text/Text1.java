package cn.z.text;
/**
 * 循环输出数组元素
 * @author Administrator
 *1.初始化整形数组
 *2.以循环变量i为数组元素下标，循环输出数组元素
 */
public class Text1 {

	public static void main(String[] args) {
		int scores[]={75,67,90,100,0};//创建有五个元素的整形数组
		for (int i = 0; i < scores.length; i++) { //length的长度等于5
			//每次循环i的值相当于数组下标
			System.out.println("scores["+i+"]="+scores[i]);
			
		}

	}

}
