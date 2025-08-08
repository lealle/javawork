package _02_Array;

import java.util.Arrays;
import java.util.Scanner;

public class T00_problem1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		1. 길이 10인 배열을 선언하고 1~10까지 반복문을 
//		   이용하여 순서대로 넣고 출력하기
		
		int arrayInt1[] = new int[10];
		for(int i = 0; i<10 ; i++) {
			arrayInt1[i] = i+1;
		}
		
		System.out.println(Arrays.toString(arrayInt1));
		
		//
//		2. 길이 10인 배열을 선언하고 1~10까지 값을 반복문을
//		   이용하여 역순으로 배열 인덱스에 넣고 값 출력
//
		int arrayInt2[] = new int[10];
		for(int i = 10; i>1 ; i--) {
			arrayInt2[10-i] = i;
		}
		
		System.out.println(Arrays.toString(arrayInt2));
		
		
		
		
		
//		3. 사용자로 부터 입력받은 수 만큼 배열을 만들고
//		   1~입력받은 수를 차례대로 넣어 출력
//
		
		
		System.out.print("배열을 입력하세요 : ");
		int num3 = scan.nextInt();
		int arrayInt3[] = new int[num3];
		for(int i = 0; i<arrayInt3.length ; i++) {
			arrayInt3[i] = i+1;
		}
		// 0으로 받는문제
		
		System.out.println(Arrays.toString(arrayInt3));
		
		
//		4. 길이가 5일 배열에 사과,귤,포도,복숭아,참외로 초기화한후
//		   배열 인덱스를 이용하여 귤 출력
//
		String[] strarr = {"사과","귤","포도","복숭아","참외"};
		System.out.println(strarr[1]);
		
		
//		5. 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
//		   개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력
//		   ex)
//		   문자열 : application
//		   문자 : i
//		   application에 i가 존재하는 위치(인덱스) : 4 8 
//		   i 개수 : 2
		
		System.out.print("문자열 : ");
		String name = scan.next();
		System.out.print("문자 : ");
		char name_part = scan.next().charAt(0);
		
		
		char[] finder = name.toCharArray();
		
		int sum5 = 0;
		String index = "";
		for(int i=0; i<name.length(); i++) {
			if(finder[i] == name_part) {
				sum5++;
				index = index + i + " ";
				
			}
		}
		
		System.out.println("application에 "+ name_part+"가 존재하는 위치(인덱스) : " + index );
		System.out.println(name_part +" 개수 : "+sum5);
		
		
//		6. 배열에 요일(월,화,수,목,금,토,일)을 초기화하여 넣고 사용자로 부터 0~6사이의 숫자를 입력받아
//		   숫자와 같은 요일 출력
//		   ex.
//		   0 ~ 6 사이 숫자 입력 : 4			
//		   금요일
//		   0 ~ 6 사이 숫자 입력 : 7
//		   잘못 입력하셨습니다.
//
		
		while(true) {
			
			char day[] = {'월','화','수','목','금','토','일'};
			System.out.print("0 ~ 6 사이 숫자 입력 : ");
			int num6 = scan.nextInt();
			if( 0<=num6 && num6 <=6) {
				System.out.println(day[num6]);
				break;
			}
			else {
				System.out.println("잘못 입력하셨습니다.");		
			}		
		}
		
		
//		7. 사용자로 부터 배열의 크기를 입력받아 그 배열의 갯수만큼 숫자로 입력받아 배열에 저장하고
//		   배열 전체의 합 출력
//
		
		int sum7 = 0;
		System.out.print("배열의 크기를 입력 : ");
		int num7 = scan.nextInt();
		int arrayInt7[] = new int[num7];
		for(int i = 0; i<arrayInt7.length ; i++) {
			System.out.print("숫자를 입력 : ");
			int num77 = scan.nextInt();
			arrayInt1[i] = num77;
			sum7 +=num77;
		}
		
		System.out.println("배열의 합 : "+sum7);
		
		
		
//		8. 3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
//		   중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
//		   단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
//		   다시 정수를 받도록 하세요. 
//
//		   ex.
//		   정수 : 4
//		   다시 입력하세요.
//		   정수 : -6
//		   다시 입력하세요.
//		   정수 : 5
//		   1, 2, 3, 2, 1

		// 이런식으로도 가능 
//		int[] iArrr = new int[num8];
//		for(int i=0; i<iArrr.length; i++) {
//			
//		}
		
		
		int a = 0;
		do {
			System.out.print("3이상인 홀수 자연수 입력 : ");
			int num8 = scan.nextInt();
			if(num8%2 == 0 || num8 < 3) {
				continue;
			}
			else {
				a = 1;
				for (int i=1; i <= (num8/2 + 1) ; i++) {
					System.out.print(i+", ");
				}
				for (int i=(num8/2); i >= 1  ; i--) {
					if(i == 1) {
						System.out.println(i);
						break;
					}
					System.out.print(i+", ");
				}
	
			}
			
		}while(a == 0);
		
		
//		9. 사용자가 입력한 값이 배열에 있는지 검색하여
//		   있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
//		   단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
//		   ex.
//		   치킨 이름을 입력하세요 : 양념			
//		   양념치킨 배달 가능
//
//		   치킨 이름을 입력하세요 : 불닭
//		   불닭치킨은 없는 메뉴입니다.
//
		
		boolean bool9 = false;
		String[] chicken = {"양념" , "불닭", "후라이드", "고추바사삭", "황금올리브"};
		System.out.print("치킨 이름을 입력하세요 : ");
		String favor_chicken = scan.next();
		
		// for (String ch : chicken) 으로 하면 안됨 왜 안되는지 알아보기
		
		for(int i=0; i<chicken.length; i++) {
			if(favor_chicken.equals(chicken[i])) {
				bool9 = true;
			}
		}
		
		if(bool9 == true) {
			System.out.println(favor_chicken+"치킨 배달 가능");

		}else {
			System.out.println(favor_chicken+"치킨은 없는 메뉴입니다.");
			
		}
		
		
		
		
		
		
//		10. 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//		     1~10 사이의 난수를 발생시켜 배열에 초기화 후
//		     배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
//
//		     ex.
//		     5 3 2 7 4 8 6 10 9 10 
//		     최대값 : 10
//		     최소값 : 2
		int num10[]= new int[10];
		
		for(int i=0; i<num10.length; i++) {
			int num1010 = (int)(Math.random()*10 + 1);
			num10[i] = num1010;
			System.out.print(num10[i]+ " ");
		}
		System.out.println();
		int min = 2555;
		int max = -2555;
		for(int numnum : num10) {
			if(numnum > max) {
				max = numnum;
			}
			if(numnum < min) {
				min = numnum;
			}
		}
		
		System.out.printf("최대값 : %d\n최소값 : %d\n", max, min);
		
		
		
//
//		11. 사용자로부터 정수값 5개 배열에 입력
//		   오름차순 정렬로 정렬하기
		
		//교수님이 하신 방식
		/*
		 * for(int i=0; i<arr.length; i++) { for(int j=0; j<arr.length-i-1; j++) {
		 * if(arr[j+1] < arr[j]) { int c = 0; c = arr[j]; arr[j] = arr[j+1]; arr[j+1] =
		 * c;
		 * 
		 * } } }
		 */
		
		System.out.print("5개의 정수값을 입력하세요 (공백사용하여) : ");
		int nume1 = scan.nextInt();
		int nume2 = scan.nextInt();
		int nume3 = scan.nextInt();
		int nume4 = scan.nextInt();
		int nume5 = scan.nextInt();
		
		int nume[] = {nume1, nume2, nume3, nume4, nume5};
		
		
		// flag 정렬을 마쳤으면 종료하게 해주는 인자
		// 그리고 flag 로 인해 원래 계속 돌아가던 코드가 count 로 얼마나 돌아갔는지 셀 수 있음 
		for(int i = 3 ; i>0 ; i--) {
//			boolean flag = false;
//			int count = 0;
			for(int j=0; j<=i; j++) {
				
				if(nume[j+1] < nume[j])
				{
					int c = 0;
					c = nume[j+1];
					nume[j+1] = nume[j];
					nume[j] = c;
					//flag = true
				}
			}
//			count++;
//			if(!flag)
//				break;
		}
		
		System.out.println(Arrays.toString(nume));

		
//
//		12. 각 학생별 국어 영어 수학점수의 총점과 평균을 구하고
//		   각 과목별 총점과 평균을 구해 아래와 같이 출력하기
//		   점수는 2차원 배열로 마음대로 넣는다.
//
//		  번호  국어  영어  수학  총점  평균
//		-----------------------------------------
//		   1     95    100     78   273  83.3
//		   2     68     57    100   273  83.3
//		   3     62     97     85    273  83.3
//		   4     85     83     69    273  83.3
//		   5     86     74     38    273  83.3
//		------------------------------------------
//		총점   479   500   387 
//		평균  95.0  100.0  78.3
		
		int twodi_arr[][] = {
				{95, 100, 78,},
				{68,57,100},
				{62,97,85},
				{85,83,69},
				{86,74,38}
		};
		
		int studentsum[] = {0,0,0,0,0};
		int subjectsum[] = {0,0,0};
		for(int i=0; i < twodi_arr.length ; i++) {
			for(int j=0; j< twodi_arr[i].length; j++) {
				subjectsum[j] +=twodi_arr[i][j];
				studentsum[i] += twodi_arr[i][j];
			}
		}
		
		System.out.println("번호  국어  영어  수학  총점  평균");
		System.out.println("-----------------------------------------");
		
		System.out.println();
		System.out.println();
		
		for(int i=0; i < twodi_arr.length ; i++) {
			System.out.print(i+1+"     ");	
			for(int j=0; j< twodi_arr[i].length; j++) {
				System.out.print(twodi_arr[i][j]+"    ");	
			}
			// System.out.print(studentsum[i]+"     "+(double)studentsum[i]/3.0);	
			System.out.printf("%d      %.1f",studentsum[i], (double)studentsum[i]/3.0);	
			
			System.out.println();
		}
		System.out.println("-----------------------------------------");
		System.out.printf("총점 : %d %d %d",subjectsum[0],subjectsum[1],subjectsum[2]);
		System.out.println();
		System.out.printf("평균 : %.1f %.1f %.1f",subjectsum[0]/5.0,subjectsum[1]/5.0,subjectsum[2]/5.0 );
		
		
		
		
		
		// 
		
		//
		
	}

}
