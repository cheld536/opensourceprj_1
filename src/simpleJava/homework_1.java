/*
 * ����Ʈ�����а�
 *  2�г� ������ 2018038014
 * ���¼ҽ�����������Ʈ 
 *  2���� ����
 * */
package simpleJava;
import java.util.Scanner;
public class homework_1 {
	public static boolean inRect(int x, int y, int rectx1, int rectx2, int recty1, int recty2)
	{
		if((x>=rectx1 && x<=rectx2)&&(y>=recty1 && y<=recty2))
			return true;
		else
			return false;
	}

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
		
		/*   6��
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
		*/
		
		/*8��
		System.out.println("�� �� (x1,y1), (x2,y2)�� ��ǥ�� �Է��Ͻÿ� >> ");
		Scanner s=new Scanner(System.in);
		
		int x1 = s.nextInt();
		int y1 = s.nextInt();
		int x2 = s.nextInt();
		int y2 = s.nextInt();
		
		if(inRect(x1,y2,100,100,200,200) || inRect(x2,y2,100,100,200,200) || inRect(x1,y2,100,100,200,200) || inRect(x2,y1,100,100,200,200))
			System.out.println("�簢���� ��Ĩ�ϴ�.");
		else if((inRect(x1,y1,100,100,200,200)) && inRect(x2,y2,100,100,200,200) && inRect(x2,y1,100,100,200,200) && inRect(x1,y2,100,100,200,200))
			System.out.println("�簢���� ��Ĩ�ϴ�.");
		else if ((inRect(100,100,x1,y1,x2,y2)) && inRect(100,200,x1,y1,x2,y2) && inRect(200,100,x1,y1,x2,y2) && inRect(200,200,x1,y1,x2,y2))
			System.out.println("�簢���� ��Ĩ�ϴ�.");
		else 
			System.out.println("�簢���� ��ġ�� �ʽ��ϴ�.");
		s.close();
		*/
		
		System.out.println("ù ��° ���� �߽ɰ� ������ �Է�>>");
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int x1 = s.nextInt();
		double r = s.nextDouble();
		
		System.out.println("�� ��° ���� �߽ɰ� ������ �Է�>>");
		int y = s.nextInt();
		int y1 =s.nextInt();
		double r1 = s.nextDouble();
		double distance = 0.0;
		distance = Math.sqrt((x=x1)*(x-x1)+(y-y1)*(y-y1));
		if (distance <= r+r1)
			System.out.println(" �� ���� ���� ��ģ��.");
		else 
			System.out.println(" �� ���� ���� �Ȱ�ģ��.");
		s.close();
		
		
		
		
		
	}

}
