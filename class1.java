package 공부;
import java.util.*;
public class class1 {
	public static void main(String[] args) {
		int N;
		N=5;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("홀수를 입력하세요");
		int input = sc.nextInt(); 
		while(input %2 == 0){
			System.out.print("홀수를 입력하세요");
			input = sc.nextInt();
		
		}	
		N = input;
		//System.out.println(N);
		
		for(int i =0; i<N/2+1;i++){
			if(i>=1){
				System.out.println("");
			}
			for(int k =0; k<N;k++){
				if(k<N/2-i || k>N/2+i){
					System.out.print(" ");
					}
				else{
					System.out.print("*"); //다이아몬드 위
				}
			}
		}
		for(int i=N/2; i>=1; i--){
			System.out.println("");
			for(int k=0; k<N; k++){
				if(k<=N/2-i || k>=N/2+i){
					System.out.print(" ");
				}
				else{
					System.out.print("*"); //다이아몬드 아래
			}				
			}		
			}
			}
}
		
	
	
					
			
				
				
		
	

