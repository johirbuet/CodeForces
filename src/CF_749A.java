import java.util.ArrayList;
import java.util.Scanner;

public class CF_749A {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> list=new ArrayList<>();
		int count=0;
		while(n!=0)
		{
			
			if(n==3)
			{
				n=n-3;
				list.add(3);
			}
			else
			{
				n=n-2;
				list.add(2);
			}
			count++;
		}
		System.out.println(count);
		for (Integer integer : list) {
			System.out.print(integer+" ");
		}
	}
}
