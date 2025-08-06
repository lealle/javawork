package _02_repetitive;

public class T05_break {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 1;
		for(i =1; i<=100; i++)
		{
			sum += i ;
			if(sum >1000) 
				break;
			
		}
		System.out.println(i);
		System.out.println(sum);
		
		

		//이름 지워주는것 이름이 달린쪽으로 break 
		outer : for (int k = 2; k<10 ; k++) {
			for (int j = 1; j<10 ; j++) {
				System.out.printf("%d*%d=%2d\n",k,j,k*j);
				if(j==5)
					break outer;
			}
		}
		
		for (int k = 2; k<10 ; k++) {
			if(k==5)
				break;
			for (int j = 1; j<10 ; j++) {
				System.out.printf("%d*%d=%2d\n",k,j,k*j);
			}
			System.out.println();		
		}
	
		
	}
}
