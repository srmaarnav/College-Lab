/* program to illustrate rading and writing mixed type of data */
/* to read and display float as it is %g */
#include<stdio.h>
int main()
{
	int x;
	char c;
	float y;
	char name[20];
	
	printf("Enter your data in order of integer, character, float number and name :\n");
	scanf("%d %c %f %s", &x , &c , &y , name);
	
	printf("Integer data: %d \nCharacter data: %c \nFloating Point data: %g \nString: %s", x , c , y , name);
	
	printf("The data is: \n %d \n %c \n %g \n %s",x,c,y,name);
}
