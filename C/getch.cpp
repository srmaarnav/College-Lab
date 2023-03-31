/* program to illustrate character I/O */

#include<stdio.h>
#include<conio.h>

int main()
{
	char y;
	printf("Enter your character:\n");
	y=getch();
	printf("\nThe character you have entered is:");
	putch(y);
}
