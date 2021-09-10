/*
 * 소프트웨어학과
 *  2학년 김윤희 2018038014
 * 오픈소스개발프로젝트 
 *  2주차 과제
 * */
package simpleJava;
import java.util.Scanner;
public class homework_1 {

	public static void main(String[] args) {
		
		/* 1번
		Scanner s = new Scanner(System.in);
		System.out.println("원화를 입력하세요.(단위: 원)>>");
		int num = s.nextInt();
		double dollar = num / 1100;
		System.out.println(num+"원운 $" +dollar+"입니다.");
		s.close();*/
		
		/*  2번 
		Scanner s = new Scanner(System.in);
		System.out.println("2자리의 정수 입력 (10 ~ 99)>>");
		int num = s.nextInt();
		if(num/10==num%10) 						// num을 10으로 나눈 몫의 갑과 나머지의 값이 같으면 num 10의 자리와 1의 자리가 같다.
		{
			System.out.println("Yes! 10의자리와 1의 자리가 같습니다.");
		}
		else
		{
			System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
		}
		s.close();*/
		
		/*  3번
		Scanner s = new Scanner(System.in);
		System.out.println("금액을 입력하시오>>");
		
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
		
		
		/*  4번
		Scanner s = new Scanner(System.in);
		int a,b,c;
		System.out.println("정수 3개 입력>>");
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		
		if(a < b && b < c)                       // b가 a보다 크거나 c보다 작을 떄 b가 중간 값이다.
		{
			System.out.print("중간 값은" +b+ " 입니다.");
		}
		if(b < a && a < c)        				 // a가 b보다 크거나 c보다 작을 떄 a가 중간 값이다
		{
			System.out.print("중간 값은" +a+ " 입니다.");
		}
		else             						 // c가 a보다 크거나 b보다 작을 떄 c가 중간 값이다
		{
			System.out.print("중간 값은 " +c+ " 입니다.");
		}
		
		s.close();
		*/
		
		/*   5번
		Scanner s = new Scanner(System.in);
		System.out.println("정수 3개를 입력>>");
		int l1 = s.nextInt();
		int l2 = s.nextInt();
		int l3 = s.nextInt();
		
		if((l1+l2)<l3 || (l1+l3)<l2 || (l2+l3)<l1)
			System.out.println("삼각형을 만들 수 없습니다.");
		else
			System.out.println("삼각형이 됩니다.");
		s.close();
		*/
		
		
		Scanner s=new Scanner(System.in); 
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		
		int num = s.nextInt();
		
		if(num!=0 && num>=1 && num <= 99)
		{
			int a,b;
			a=num/10;
			b=num/10;
			if((a==3 || a==6 || a==9) && (b==3 || b == 6 || b == 9))
			{
				System.out.println("박수짝짝");

			}
			else if ((a==3 || a==6 || a==9)||(b==3 || b==6 || b==9))
			{
				System.out.println("박수짝");
			}
		}
		else {
			System.out.println("숫자의 범위를 벗어났습니다.");
		}
		s.close();
		
		
		
		
		
		
		
	}

}
