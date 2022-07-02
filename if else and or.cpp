/*if else */

#include<stdio.h>
int main()
{
	int a=4 , b=2 , x=30 , y=10;
	
	if((a>b)&&(x>y))//&& and || or
	{
		printf("a+b+x+y = %d", a+b+x+y);
	}
	else
	{
		printf("a+b+x-y = %d", a+b+x-y);
	}
}
