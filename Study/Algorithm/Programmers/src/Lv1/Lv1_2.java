package Lv1;

import java.util.Scanner;

public class Lv1_2 {
	public int solution(int number,int limit,int power) { 
		int answer = 0;
		int i = 1,cnt = 0;
		while(i <= number) {
			int sqt = (int)Math.sqrt(i);
			for(int j=1; j<=sqt; j++) {
				if(i == 1) {
					cnt = 1;
					break;
				}
				if(j != 1 && j*j == i) cnt +=1;
				else if(i%j == 0) cnt +=2; 
			}
			if(cnt > limit) answer += power;
			else answer += cnt;
			cnt = 0;
			i++;
		}
		
		return answer;
	}
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int number = kb.nextInt();
		int limit = kb.nextInt();
		int power = kb.nextInt();
		Lv1_2 solution = new Lv1_2();
		System.out.println(solution.solution(number,limit,power));
	}

}
