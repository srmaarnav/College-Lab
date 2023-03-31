/* Write a program to calculate the average of set of N input numbers.
*/

#include<stdio.h>
int main()
{
	float num, sum=0, average;
	int i, n;
	
	printf("Enter the value of N:");
	scanf("%d",&n);
	
	printf("\nEnter the %d numbers:\n",n);
	
	for (i=1;i<=n;i++)
	{
		scanf("%f",&num);
		sum=sum+num;
	}
	average=sum/n;
	printf("The average of the given set of %d numbers is %f",n,average);
}
