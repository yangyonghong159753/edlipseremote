package cn.z.text;
/**
 * �����������������飬�ӿ���̨���ռ���������������������������ѭ����ֵ
 * ʵ�ֲ������£�
 * 1.������������
 * 2.����Scanner����
 * 3.��ѭ������i��Ϊ�����±꣬ѭ�����ռ������룬��Ϊ����Ԫ�ظ�ֵ
 */

import java.util.Scanner;

public class Text {

	//qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq
	public static void main(String[] args) {
		int scores[]=new int[5];  //��������Ϊ5����������
		Scanner scanner=new Scanner(System.in);  //����scanner����
		for (int i = 0; i <scores.length; i++) {  //scores.length�ĳ��ȵ�������ĳ���5
			scores[i]=scanner.nextInt();  //���ܼ���¼������
		}
		
	}

}
