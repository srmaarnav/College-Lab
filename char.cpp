/* program to illustrate character I/O */

#include<stdio.h>

int main()
{
	char y;
	printf("Enter your character:");
	y=getchar();
	printf("The character you have entered is:");
	putchar(y);
}
