/* program to illustrate exclusive type conversion */

#include<stdio.h>
int main()
{
	int a;
	float b ,result;
	
	printf("Enter any two numbers(the second one as a float number):\n");
	scanf("%d %f", &a , &b);
	
	result = a+b;
	
	printf("\nResult = %g",result);
}
