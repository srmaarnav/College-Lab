#include<stdio.h>
int main()
{
	int n, i, sum=0;
	printf("Enter your number : ");
	scanf("%d",&n);
	
	for(i=1 ; i<=n ; i++)
	{
		sum = sum+i ;
	}
	printf("Sum = %d",sum);
}
