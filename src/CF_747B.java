import java.util.Scanner;
import java.util.regex.Pattern;

public class CF_747B {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		int l=s.length();
		int esize=l/4;
		String result=s;
		String [] codes={"A","C","G","T"};
		for(int i=0;i<4;i++)
		{
			String temp=result.replaceAll(codes[i],"");
			int r=s.length()-temp.length();
			for(int k=esize - r;k>0;k--)
			{
				final String re=Pattern.quote("?");
				result=result.replaceFirst(re, codes[i]);
			}
		}
		if(result.replaceAll("A","").length()==n-esize && result.replaceAll("C","").length()==n-esize
				&& result.replaceAll("G","").length()==n-esize && result.replaceAll("T","").length()==n-esize && n%4==0 && result.replaceAll(Pattern.quote("?"),"").length()==n)
		{
			System.out.println(result);
		}
		else
		{
			System.out.println("===");
		}
		
		sc.close();
	}

}
