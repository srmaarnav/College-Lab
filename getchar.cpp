/* program to illustrate character I/O */

#include<stdio.h>

int main()
{
	char y[10];
	printf("Enter your character:");
	y[10]=getchar();
	printf("The character you have entered is:");
	putchar(y[10]);
}
