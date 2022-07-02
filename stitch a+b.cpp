/* switch statement */

#include<stdio.h>
int main()
{
	int a, b;
	printf("Enter any two number:\n");
	scanf("%d %d",&a,&b);
	
	switch(a+b)
	{
		case 4:
			printf("Switch expression a's value matched with case 4.");
			break;
		case 6:
			printf("Switch expression a's value matched with case 6.");
			break;
		case 8:
			printf("Switch expression a's value matched with case 8.");
			break;
		default:
			printf("You have entered a number other than 4, 6 and 8.");
			
	}
	printf("\nThe statement is always executed.");
}
