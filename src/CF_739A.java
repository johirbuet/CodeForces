import java.util.Scanner;

public class CF_739A {

	/**
	 * http://codeforces.com/problemset/problem/739/A
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int ans=Integer.MAX_VALUE;
		for(int i=0;i<m;i++)
		{
			int l=sc.nextInt();
			int r=sc.nextInt();
			ans=Math.min(ans, r-l+1);
		}
		System.out.println(ans);
		int cnt=0;
		for(int i=0;i<n;i++)
		{
			System.out.print(cnt+" ");
			cnt++;
			cnt=cnt%ans;
		}
		System.out.println();
		sc.close();
	}

}
