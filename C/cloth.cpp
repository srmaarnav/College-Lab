/* A cloth shop during festival seasons offers a discount of 10% on all purchases made in that shop. 
The total amount  after discount for a customer is given as Rs.1000.5. Write a program to calculate and display the discount, and  amount before discount. */

#include<stdio.h>

int main()
{
	const float a=1000.5;
	
	float d, i;
	
	printf("The price of the cloth for the customer is %f.\n",a);
	
	i=a*10/9;
	d=i-a;
	
	printf("The initial price of the cloth is %f.", i);
	printf("\nThe discounted amount is %f.", d);
}

