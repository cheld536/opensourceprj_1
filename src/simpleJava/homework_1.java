/*
 * ����Ʈ�����а�
 *  2�г� ������ 2018038014
 * ���¼ҽ�����������Ʈ 
 *  2���� ����
 * */
package simpleJava;
import java.util.Scanner;
public class homework_1 {

	public static void main(String[] args) {
		
		/* 1��
		Scanner s = new Scanner(System.in);
		System.out.println("��ȭ�� �Է��ϼ���.(����: ��)>>");
		int num = s.nextInt();
		double dollar = num / 1100;
		System.out.println(num+"���� $" +dollar+"�Դϴ�.");
		s.close();*/
		
		/*  2�� 
		Scanner s = new Scanner(System.in);
		System.out.println("2�ڸ��� ���� �Է� (10 ~ 99)>>");
		int num = s.nextInt();
		if(num/10==num%10) 						// num�� 10���� ���� ���� ���� �������� ���� ������ num 10�� �ڸ��� 1�� �ڸ��� ����.
		{
			System.out.println("Yes! 10���ڸ��� 1�� �ڸ��� �����ϴ�.");
		}
		else
		{
			System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
		}
		s.close();*/
		
		/*  3��
		Scanner s = new Scanner(System.in);
		System.out.println("�ݾ��� �Է��Ͻÿ�>>");
		
		int num = s.nextInt();
			System.out.println("50000Won   "+num/50000+"mea");
			num%=50000;
			System.out.println("10000Won   "+num/10000+"mae");
			num%=10000;
			System.out.println("1000Won    "+num/1000+"mae");
			num%=1000;
			System.out.println("100Won     "+num/100+"mae");
			num%=100;
			System.out.println("50Won      "+num/50+"mae");
			num%=50;
			System.out.println("10Won      "+num/10+"mae");
			num%=10;
			System.out.println("1Won       "+num/1+"mae");
			s.close();
		*/
		
		
		/*  4��
		Scanner s = new Scanner(System.in);
		int a,b,c;
		System.out.println("���� 3�� �Է�>>");
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		
		if(a < b && b < c)                       // b�� a���� ũ�ų� c���� ���� �� b�� �߰� ���̴�.
		{
			System.out.print("�߰� ����" +b+ " �Դϴ�.");
		}
		if(b < a && a < c)        				 // a�� b���� ũ�ų� c���� ���� �� a�� �߰� ���̴�
		{
			System.out.print("�߰� ����" +a+ " �Դϴ�.");
		}
		else             						 // c�� a���� ũ�ų� b���� ���� �� c�� �߰� ���̴�
		{
			System.out.print("�߰� ���� " +c+ " �Դϴ�.");
		}
		
		s.close();
		*/
		
		/*   5��
		Scanner s = new Scanner(System.in);
		System.out.println("���� 3���� �Է�>>");
		int l1 = s.nextInt();
		int l2 = s.nextInt();
		int l3 = s.nextInt();
		
		if((l1+l2)<l3 || (l1+l3)<l2 || (l2+l3)<l1)
			System.out.println("�ﰢ���� ���� �� �����ϴ�.");
		else
			System.out.println("�ﰢ���� �˴ϴ�.");
		s.close();
		*/
		
		
		Scanner s=new Scanner(System.in); 
		System.out.print("1~99 ������ ������ �Է��Ͻÿ�>>");
		
		int num = s.nextInt();
		
		if(num!=0 && num>=1 && num <= 99)
		{
			int a,b;
			a=num/10;
			b=num/10;
			if((a==3 || a==6 || a==9) && (b==3 || b == 6 || b == 9))
			{
				System.out.println("�ڼ�¦¦");

			}
			else if ((a==3 || a==6 || a==9)||(b==3 || b==6 || b==9))
			{
				System.out.println("�ڼ�¦");
			}
		}
		else {
			System.out.println("������ ������ ������ϴ�.");
		}
		s.close();
		
		
		
		
		
		
		
	}

}
