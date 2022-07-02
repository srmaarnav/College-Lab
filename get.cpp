/* Write a program to read different characters by using getchar(), getch(), and getche() functions and then output
 the characters on the screen by using putchar() and putch() functions.
*/

#include<stdio.h>
#include<conio.h>

int main()
{
	char x , y , z;
	printf("Enter your character:");
	x=getchar();
	printf("\nEnter your character:\n");
	y=getch();
	printf("\nEnter your character:\n");
	z=getche();
	
	printf("\nThe character using getchar() is:");
	putchar(x);
	
	printf("\nThe character using getch() is:");
	putch(y);
	
	printf("\nThe character using getche() is:");
	putchar(z);
	
	
}
