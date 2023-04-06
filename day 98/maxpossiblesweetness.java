/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Candy{
    int price,sweet;
}
class Hello implements Comparator<Candy>{
    public int compare(Candy c1,Candy c2){
        if(c1.price>c2.price)
        {
            return 1;
        }
        else if(c1.price < c2.price)
        {
            return -1;
        }
        else {
            if(c1.sweet>c2.sweet)
            return 1;
            else 
            return -1;
        }
    }
}
class Codechef
{
    Input1 aa;
    public void calc() throws Exception{
        int n=ni();
        int d=ni();
        List<Candy> adj=new ArrayList<>();
        Candy h1;
        int i;
        for(i=0;i<n;i++)
        {
            h1=new Candy();
            h1.price=ni();
            adj.add(h1);
        }
        for(i=0;i<n;i++)
        {
            adj.get(i).sweet=ni();
        }
        Collections.sort(adj,new Hello());
        
    
        int maxS[]=new int[adj.size()];
        maxS[0]=adj.get(0).sweet;
        i=1;
        while(i<n)
        {
            maxS[i]=Math.max(maxS[i-1],adj.get(i).sweet);
            i++;
        }
        int tp,trem,tans,ans,lo,hi,mid,r1;
        lo=hi=mid=r1=tp=trem=tans=ans=0;
        ans=0;
        for(i=n-1;i>0;i--){
            tp=adj.get(i).price;
            if(tp>d)
            continue;
            ans=Math.max(ans,maxS[i]);
            if(tp==d){
                continue;
            }
    
            trem=d-tp;
            lo=0;
            hi=i-1;
            mid=0;
            r1=-1;
            while(lo<=hi){
                mid=(lo+hi)/2;
                if(adj.get(mid).price>trem){
                    hi=mid-1;
                }
                else 
                {
                    r1=mid;
                    lo=mid+1;
                }
            }
            if(r1!=-1){
                ans=Math.max(ans,maxS[r1]+adj.get(i).sweet);
            }
        }
        if(adj.get(0).price<=d)
        ans=Math.max(ans,adj.get(0).sweet);
        System.out.println(ans);
        
        
    }
    public void run() throws Exception{
        aa=new Input1();
        int t=ni();
        while(t-->0){
            calc();
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try{
		    new Codechef().run();
		}
		catch(Exception ee){
		    
		}
	}
	public int ni() throws Exception{
	    return Integer.parseInt(aa.next());
	}
	class Input1{
	    BufferedReader br;
	    StringTokenizer str;
	    public Input1(){
	        br=new BufferedReader(new InputStreamReader(System.in));
	    }
	    public String next() throws Exception{
	        while(str==null || !str.hasMoreTokens()){
	            str=new StringTokenizer(br.readLine());
	        }
	        return str.nextToken();
	    }
	}
}