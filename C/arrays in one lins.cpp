#include<stdio.h>
int main()
{
	int marks[5]={60,70,80,90,85} , i, sum=0;
	
	for (i=0;i<5;i++)
	{
		printf("%d\n",marks[i]);	
		sum = sum+marks[i];
	}
	printf("The sum is %d",sum);	
}
