/* note use isapha and isdigit to determine alphabet or digit */

#include<stdio.h>
#include<conio.h>
#include<ctype.h>
int main()
{
	char ch1;
	
	printf("Press any key: \n");
	ch1= getchar();
	
	if(isalpha(ch1)>0)
		{
			printf("The character is letter.");
		}
	else if(isdigit(ch1)>0)
		{
			printf("The character is digit.");
		}
	else
		{
			printf("The character is not alphanumeric.");
		}
	return 0;
}
