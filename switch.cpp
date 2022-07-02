/* switch statement */

#include<stdio.h>
int main()
{
	int a ;
	printf("Enter any number: ");
	scanf("%d",&a);
	
	switch(a)
	{
		case 1:
			printf("Switch expression a's value matched with case 1.");
			break;
		case 2:
			printf("Switch expression a's value matched with case 2.");
			break;
		case 3:
			printf("Switch expression a's value matched with case 3.");
			break;
		default:
			printf("You have entered a number other than 1, 2 and 3.");
			
	}
	printf("\nThe statement is always executed.");
}
