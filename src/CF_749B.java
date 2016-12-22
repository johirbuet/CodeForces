import java.awt.Point;
import java.util.Scanner;

public class CF_749B {
/**
 * {@link http://codeforces.com/contest/749/problem/B}
 * @param args
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ax=sc.nextInt();
		int ay=sc.nextInt();
		int bx=sc.nextInt();
		int by=sc.nextInt();
		int cx=sc.nextInt();
		int cy=sc.nextInt();
		int count =0;
	
		//CASE AD and BC are diagonals
		int dx1=cx+bx-ax;
		int dy1=cy+by-ay;
		count ++;
		//CASE AC and BD are diagonals
		int dx2=cx+ax-bx;
		int dy2=cy+ay-by;
		count++;
		//CASE AB and CD are diagonals
		int dx3=ax+bx-cx;
		int dy3=ay+by-cy;
		count++;
		System.out.println(count);
		System.out.println(dx1+" "+dy1);
		System.out.println(dx2+" "+dy2);
		System.out.println(dx3+" "+dy3);
		
	}

}
