package cn.z.text;
/**
 * 创建整型数组，使用增强for循环输出数组元素。
 * 分析：
 * 以此取出数组scores中各个元素的并赋给整型变量i，同时输出其值
 * @author Administrator
 *
 */
public class Text2 {

	public static void main(String[] args) {
		// 初始化整形数组
		int scores[]={75,67,90,100,0};
		//使用增强for循环
		for(int i:scores){
			System.out.println("数组元素值依次为:"+i);
		}	
	}

}
