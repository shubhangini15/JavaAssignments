    import java.util.*;
	//import java.lang.*;
	import java.io.*;
	
public class KeyPairSomeONeElseCode {
	
	     static boolean solve(int arr[],HashMap<Integer,Integer> hm,int sum)
	     {
	         for(int i=0;i<arr.length;i++)
	         {
	             if(hm.containsKey(arr[i]))
	             {
	                 return true;
	             }
	             hm.put(sum-arr[i],i);
	             System.out.println(sum-arr[i]);
	             System.out.println(i);
	         }
	         return false;
	     }
		public static void main (String[] args)
		 {
		    Scanner sc=new Scanner(System.in);
		    int t=sc.nextInt();
		    while(t-->0)
		    {
		      int n=sc.nextInt();
		      int arr[]=new int[n];
		      int k=sc.nextInt();
		      for(int i=0;i<n;i++)
		      {
		          arr[i]=sc.nextInt();
		      }
		      HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		      boolean b=solve(arr,hm,k);
		      if(b==true)
		      {
		          System.out.println("Yes");
		      }
		      else
		      System.out.println("No");
		    }
		    
		 }
	}

