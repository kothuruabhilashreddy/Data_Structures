/******		Problem Name: Chef and String
		Problem Code: XYSTR	******/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int t;
	    Scanner sc=new Scanner(System.in);
	    t=sc.nextInt();
	    sc.nextLine();
	    while(t-- >0) {
	    String s=sc.nextLine();
		int n=s.length();
		int c=0;
		for(int i=1;i<n;i++)
		{
		    if(s.charAt(i)!=s.charAt(i-1))
		    {
		        c++;i++;
		    }
		}
		System.out.println(c);
	    }
	}
}

