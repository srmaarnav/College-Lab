/* goto statement */

#include<stdio.h>
int main()
{
	int i , x , sum=0 ;
	float avg;
	
	for(i=1;i<=5;i++)
	{
		printf("Enter your number:");
		scanf("%d",&x);
		if(x<0)
		{
			goto xyz;
		}
		sum=sum+x;
	}
	xyz:
		avg = (float)sum/(i-1);
		printf("Sum = %d \nAverage = %f",sum,avg);
}
