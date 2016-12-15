import java.util.Scanner;

public class CF_740B {
	/**
	 * {@link http://codeforces.com/contest/740/problem/B}
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int res=0;
		int [] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++)
		{
			int l=sc.nextInt();
			int r=sc.nextInt();
			int sum=0;
			for(int j=l;j<=r;j++)
			{
				sum+=a[j-1];
			}
			if(sum>0)
			{
				res+=sum;
			}
		}
		System.out.println(res);
	}

}
