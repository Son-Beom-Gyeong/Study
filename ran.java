package ����;
import java.util.*;
public class ran {
	public static void main(String[] args) {
		int[] num; //Ʃ�� ����
		int[] count; // Ʃ�� ����
		int[] test;
		Random r = new Random(); //���� ��ü ����
		Scanner sc = new Scanner(System.in); //��ĳ��
		System.out.print("���ڸ� �Է��ϼ���");
		int N = sc.nextInt(); //N�� �Է� ���� ����
		num = new int[N]; //N��ŭ�� ������ num �迭�� �Ҵ�
		test = new int[N];
		System.out.println("input N :"+ N);
		System.out.print("Random number: ");
		
		for(int k=0; k<N; k++){						
			num[k] = r.nextInt(21); //21�̸��� �ڿ����� num�� ����
			System.out.print(num[k] + " ");//num �� ����
			if(k==N-1){
				System.out.println("\n"); //���������� �� �� ��
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
		
	

		

		
		
	
		
	
		
		

		
		



