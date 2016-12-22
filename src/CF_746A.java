import java.util.Scanner;

public class CF_746A {

	/**
	 * {@link http://codeforces.com/problemset/problem/746/A}
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int at=0;
		for(int i=1;i<=a;i++)
		{
			if(2*i<=b && 4*i<=c)
			{
				at=i;
			}
		}
		System.out.println(7*at);
		sc.close();
	}

}
