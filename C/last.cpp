/* Write a program to count and print the number of negative and positive numbers  in a given set of numbers.
 Test your program with a suitable set of numbers. Use scanf to read the numbers. Reading should be terminated when the value of 0 is encountered.
*/

#include<stdio.h>
int main()
{
	int i, num, count1=0, count2=0;
	
	printf("Enter your numbers:\n");
	
	for(i=0; i<=100;i++)
	{
		scanf("%d",&num);
		if(num<0)
		{
			count1++;
		}
		else if (num>0)
		{
			count2++;
		}
		else
		{
			break;
		}
	}
	
	printf("Stopping the reading after encountering 0.\n");
	printf("\nOccurence  of");
	printf("\nNegative Numbers = %d times",count1);
	printf("\nPositive Numbers = %d times",count2);
}
