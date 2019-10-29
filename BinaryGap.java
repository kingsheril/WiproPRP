package Coditiy;

public class BinaryGap 
{
	public static void main(String[] args) 
	{
		Solution s=new Solution();
		
		int N=1041;
		
		System.out.println(s.solution(N));
	}
}

class Solution {
    public int solution(int N) {
        String s="";
        int r=0;
        while(N!=0)
        {
            if(N%2==0)
            {
                s="0"+s;
            }
            else
            {
                s="1"+s;
            }
            N=N/2;
        }
        int c=0;
        boolean b=true;
        for(int i=1;i<s.length();i++)
        {
        	if(s.charAt(i)=='1')
        	{
        		if(c>r)
    			{
    				r=c;
    				
    			}
        		c=0;
        	}
        	else
        	{
        		c++;
        	}
        }
        
        System.out.println(s);
        
        return r;
    }
}
