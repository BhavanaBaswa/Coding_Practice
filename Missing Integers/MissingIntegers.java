import java.util.*;
public class MissingIntegers
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int N,i;
		N=sc.nextInt();
		int [] arr=new int[N];
		for(i=0;i<N;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max=0,j;
		for(i=0;i<N;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		int [] flag=new int[max+1];
		for(j=0;j<=max;j++){
			flag[j]=0;
		}
		for(j=0;j<N;j++){
			flag[arr[j]]=flag[arr[j]]+1;
		}
		int MissedCount=0,k;
		int[] missedEles=new int[max];
		for(j=1;j<=max;j++){
			if(flag[j]==0)
			{
				missedEles[MissedCount]=j;
				MissedCount=MissedCount+1;
			}
		}
		if(MissedCount==0)
		{
			System.out.println("No Missed Elements");
			return;
		}
		for(k=0;k<MissedCount;k++){
			System.out.println(missedEles[k]);
		}
	}
}