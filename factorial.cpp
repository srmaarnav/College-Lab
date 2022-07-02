/* program to illustrate while loop */

#include<stdio.h>
int main()
{
	int x, n , fact=1 ;
	printf("Enter any number to find its factorial :\n");
	scanf("%d",&n);
	x=n;
	while(n>0)
	{
		fact=fact*n;
		n--;
	}	
	printf("The factorial of the entered number is %d! = %d.",x ,fact);
}
