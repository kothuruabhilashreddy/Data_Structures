/****** Problem Name: Count Subarrays
		Problem Code: SUBINC	******/

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
	    int n;
	    n=sc.nextInt();
	    sc.nextLine();
	    long key=sc.nextInt();  // first element
	    long add=1,count=1;
	    for(int i=1;i<n;i++)
	    {
	        int val=sc.nextInt();
	        if(val<key)
	        add=1;
	        else
	        add++;
	        key=val;
	        count+=add;
	    }
	    System.out.println(count);
	    }
		
	}
}

