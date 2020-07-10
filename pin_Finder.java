import java.util.Scanner;
public class pin_Finder {

	public static void main(String[] args) 
	{
        
		int i=0,j,k,rem,u,t,h,temp,pin;
		int input1=123;
		int input2=582;
		int input3=175;
		int arr[]= new int[10];
		while(input1>0)
		{
			rem=input1%10;
			arr[i]=rem;
			input1=input1/10;
			i++;
		}
		
		while(input2>0)
		{
			rem=input2%10;
			arr[i]=rem;
			input2=input2/10;
			i++;
		}
		while(input3>0)
		{
			rem=input3%10;
			arr[i]=rem;
			input3=input3/10;
			i++;
		}
		u=small(arr[0],arr[3],arr[6]);
		t=small(arr[1],arr[4],arr[7]);
		h=small(arr[2],arr[5],arr[8]);
		for(j=0;j<9;j++)
		{
			for(k=j+1;k<9;k++)
			{
				if(arr[j]<arr[k])
				{
					temp=arr[j];
					arr[j]=arr[k];
					arr[k]=temp;
				}
			}
		}
		pin=1000*arr[0]+100*h+10*t+u;
		System.out.println(pin);
	}
	
	static int small(int a,int b,int c)
	{
		if(a<b && a<c)
		{
			return a;
		}
		if(b<a && b<c)
		{
			return b;
		}
		if(c<a && c<b)
		{
			return c;
		}
		return c;
	}

}
