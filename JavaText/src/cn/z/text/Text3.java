package cn.z.text;

import java.util.Scanner;

/**
 * ʹ���������5��ѧ����ƽ���֡���߷ֺ���ͷ�
 * @author Administrator
 *����:
 *  ����һ������Ϊ5����������
	��������float���ͱ��������ڱ����ܳɼ�ƽ���֣���ʼֵ��Ϊ0
	��������int���ͱ��������ڱ�����߷ֺ���ͷ֣���ʼֵ��Ϊ0
	�ӿ���̨��������ѧ���ĳɼ�
	ͨ��ѭ��ʹ�����5��Ԫ����ӵõ��ܳɼ�
	ͨ��ѭ���������鲢�Ƚ�Ԫ�ش�С���õ���߷ֺ���ͷ�
 */

public class Text3 {

	public static void main(String[] args) {
		//���峤��Ϊ5����������
		int[]scores=new int[5];
		//�ܳɼ�
		float total=0;
		//ƽ����
		float avg=0;
		//��߷�
		int max=0;
		//��ͷ�
		int min=0;
		//����Scanner����
		Scanner scanner=new Scanner(System.in);
		//�����ʾ��Ϣ
		System.out.println("������5��ѧ���ĳɼ�");
		//����forѭ���õ��ܳɼ�
		for (int i = 0; i < scores.length; i++) {
			scores[i]=scanner.nextInt();
		}
		//������߷ֺ���ͷ�
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
		//����ƽ���ɼ�
		avg=total/5;
		//�������ѧ�����ܳɼ���ƽ���֣���߷ֺ���ͷ�
		System.out.println("�ܳɼ�:"+total);
		System.out.println("ƽ����:"+avg);
		System.out.println("��߷�:"+max);
		System.out.println("��ͷ�:"+min);
	}

}
