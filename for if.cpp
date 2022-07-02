/* program to calculate the sum if maximum of 5 numbers if user enters negative number 
return the sum of previously entered positive numbers to the user*/

#include<stdio.h>
int main()
{
	int i , x , sum=0;
	
	for(i=1;i<=5;i++)
	{
		printf("Enter your numbers:");
		scanf("%d",&x);
		
		if (x<0)
		{
			break;
		}
		sum=sum+x;
	}
	printf("\nSum = %d",sum);
}

