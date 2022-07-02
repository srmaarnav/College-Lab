/* Write a program to decide whether a input number is less than 100 or not.
*/

#include<stdio.h>
int  main()
{
	float num;
	printf("Enter the number:");
	scanf("%f", &num);
	
	if(num<100)
	{
		printf("The number is less than 100.");
	}
	else if(num>100)
	{
		printf("The number is more than 100.");
	}
	else
	{
		printf("The number is equal to 100");
	}
}
