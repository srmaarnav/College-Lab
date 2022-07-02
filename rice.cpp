/*The price of one kg of  rice is Rs. 16.75 and one kg of sugar is Rs. 15. Write a program to get these values from the user and display the prices as follows.
	***LIST OF ITEMS***
	Item		price
	Rice		Rs. 16.75
	Sugar		Rs 15.00
*/

#include<stdio.h>
int main()
{
	float r, s;
	
	printf("Enter the price of rice Rs.");
	scanf("%f",&r);
	
	printf("Enter the price of sugar Rs.");
	scanf("%f",&s);
	
	printf("***LIST OF ITEMS***\n");
	printf("Item \t \t Price\n");
	printf("Rice \t \t Rs.%f\n",r);
	printf("Sugar \t \t Rs.%f\n",s);
}
