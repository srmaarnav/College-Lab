#include<stdio.h>
int main()
{
	char c[40];
	
	printf("Enter a long string:\n");
	
	scanf("%[a-z ]",c);
	printf("THe string is : %s",c);

}
