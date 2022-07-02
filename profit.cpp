/* If the total selling price of 15 items and the total profit earned on them is input through the keyboard, write a program to find the cost price of one item.
*/

#include<stdio.h>
int main()
{
	float sp, p, c, cp;
	
	printf("The total selling price of the 15 items is Rs.");
	scanf("%f", &sp);
	
	printf("The total profit earned on the items is Rs.");
	scanf("%f", &p);
	
	cp=sp-p;
	
	c=cp/15;
	
	printf("\nThe cost price of one item is Rs.%f",c);	
}
