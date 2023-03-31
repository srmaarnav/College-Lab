/* Write a program to read number of days from the user and convert them into months and days.
*/

#include<stdio.h>
int main()
{
	int days , m , ds;
	
	printf("Enter the number of days : ");
	scanf("%d",&days);
	
	m = days/30;
	ds = days%30;
	
	printf("The number of months is %d.\n",m);
	printf("The number of days is %d.\n",ds);
}
