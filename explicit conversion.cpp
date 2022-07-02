/* program to illustrate explicit type conversion */

#include<stdio.h>
int main()
{
	int a , b;
	float result;
	
	printf("Enter any two numbers:\n");
	scanf("%d %d", &a , &b);
	
	result = (float)a/b;
	
	printf("\nResult = %g",result);
}
