package Lv1;

import java.util.Scanner;

public class Lv1_1 {
	public int solution(String t,String p) {
		int n = p.length(),cnt = 0;
		for(int i=0; i<=t.length()-p.length(); i++) {
			String nst = t.substring(i, i+n);
			if(Long.valueOf(nst) <= Long.valueOf(p)) cnt++;
		}
		return cnt;
	}
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String t = kb.next();
		String p = kb.next();
		Lv1_1 solution = new Lv1_1();
		System.out.println(solution.solution(t,p));
	}

}
