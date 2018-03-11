package 공부;
import java.util.*;
public class ran {
	public static void main(String[] args) {
		int[] num; //튜플 선언
		int[] count; // 튜플 선언
		int[] test;
		Random r = new Random(); //랜덤 객체 생성
		Scanner sc = new Scanner(System.in); //스캐너
		System.out.print("숫자를 입력하세요");
		int N = sc.nextInt(); //N에 입력 수를 대입
		num = new int[N]; //N만큼의 공간을 num 배열에 할당
		test = new int[N];
		System.out.println("input N :"+ N);
		System.out.print("Random number: ");
		
		for(int k=0; k<N; k++){						
			num[k] = r.nextInt(21); //21미만의 자연수를 num에 대입
			System.out.print(num[k] + " ");//num 값 보기
			if(k==N-1){
				System.out.println("\n"); //마지막에는 한 줄 뜀
			}
			}
			
		for(int i=0; i<num.length; i++){
			int cnt = 0;
			for(int z=0; z<num.length; z++){
				if(num[i]==num[z]){
					cnt++;	
					System.out.println(num[i] + "-"
							+ "" + cnt++);
				}
			}
		
		}
		//System.out.println(Arrays.toString(num));		
	}
		
}
		
	

		

		
		
	
		
	
		
		

		
		



