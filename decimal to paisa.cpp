/* Write a program to read the price of an item in decimal form (like 15.95 Rs) and print the output in Paisa (like 1595 Paisa).
*/

#include<stdio.h>

int main()
{
	float i, o;
	
	printf("The price of the item is Rs.");
	scanf("%f", &i);
	
	o=i*100;
	
	printf("\nThe price of the item is %f paisa.", o);
}
