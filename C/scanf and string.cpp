/*program to illustrate gets and puts function to read and write strings*/
// scanf le whitespace paxadi ko ignore garxa


#include<stdio.h>

int main()
{
	char x[20];
	
	printf("Enter any string:\n");	
	scanf("%[a-zA-Z ]",x);
	
	puts("\nThe string you have entered is:");
	puts(x);
	printf("%s",x);
}
