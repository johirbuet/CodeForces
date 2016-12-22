import java.util.Scanner;

public class CF_732A {

	/**
	 * {@link http://codeforces.com/problemset/problem/732/A}
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int r=sc.nextInt();
		int price=0;
		int count=10;
		for(int i=1;i<10;i++)
		{
			price+=k;
			if((price-r)%10==0 || price %10==0)
			{
				count=i;
				break;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
