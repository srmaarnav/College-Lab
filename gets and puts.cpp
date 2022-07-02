/*program to illustrate gets and puts function to read and write strings*/

#include<stdio.h>

int main()
{
	char x[20];
	
	//scanf("%[a-zA-Z ]",x//
	//not include a and b : ("%[^ab]",x]
	
	
	puts("Enter any string:");	
	gets(x);
	
	puts("\nThe string you have entered is:");
	puts(x);

}
