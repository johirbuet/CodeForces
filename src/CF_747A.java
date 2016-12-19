import java.util.Scanner;

public class CF_747A {

	/**
	 * {@link http://codeforces.com/problemset/problem/747/A}
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=1;
		int b=n/a;
		while(a*a<=n)
		{
			if(n%a==0)
			{
				b=n/a;
			}
			a++;
		}
		a=n/b;
		System.out.println(a+" "+b);
	}

}
