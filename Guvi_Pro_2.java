package Coditiy;

import java.util.*;

public class Guvi_Pro_2 
{
	public static void main(String[] arg)
	{
		Scanner x=new Scanner(System.in);
		
		int h=x.nextInt();
		
		int [] a=new int[h];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=x.nextInt();
		}
		
		Arrays.sort(a);
		
		int t=a[0],count=0,max=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		
		int[] r=new int[max];
		
		for(int i=0;i<a.length;i++)
		{
			if(t==a[i])
			{
				count++;
			}
			else
			{
				r[a[i-1]-1]=count;
				count=1;
				t=a[i];
			}
		}
		r[a[a.length-1]-1]=count;
		//mini.put(a[a.length-1],count);
		
//		for(int i=0;i<r.length;i++)
//		{
//			System.out.println((i+1)+" - "+i+" - "+r[i]);
//		}
//		System.out.println("---------");
		
		//boolean f=false;
		
		int[] ar=new int[max];
		
		int n=r.length;
		int mi=0,cnt=0,mix=0;
		int min = 1000000;
		for (int i = 0; i < n; i++)
		{
			
			//int tpm=0;
			//cvv=0;
			min=10000;
			if(r[i]==0)
				continue;
			for (int j = 0; j < n; j++)
			{
				if((r[j]<=min && r[j]!=0) && (r[j]>mix ))
				{
					min=r[j];
					//System.out.println("j -> "+j+" ");
					mi=j;
				}
			}
			
			for(int j=0;j<n;j++)
			{
				if(min==r[j] && j!=mi)
				{
					if(min!=10000)
					    ar[cnt++]=j;
					break;
				}
			}
			
			//System.out.println("min -> "+min+" @index - "+mi);
			
			//min=r[mi];
			mix=min;
			if(min!=10000)
		    ar[cnt++]=mi;
		}
		
		//System.out.println("----------");
		
		for(int i=0;i<cnt;i++)
		{
			System.out.println((ar[i]+1));
		}
		
		
		x.close();
	}
}
