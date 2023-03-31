/* Write a program to read two integer value m and n and decide and print whether m is a multiple of n.
 */
 
#include<stdio.h>
int main()
{
	int m , n , r;
	
	printf("Enter two numbers M and N:\n");
	
	printf("M:");
	scanf("%d",&m);
	printf("N:");
	scanf("%d",&n);
	
	r = m % n;
	
	if(r==0)
		{
			printf("M is a multiple of N.");
		}
	else
		{
			printf("M is not a multiple of N.");
		}
	
}
