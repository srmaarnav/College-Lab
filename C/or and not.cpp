/*program to illustrate || */

#include<stdio.h>
int main()
{
	int a=4 , b=2 , x=30 , y=10;
	
	printf("(a<b)||(x>y) = %d\n", (a<b)||(x>y));
	printf("(a<b)&&(x>y) = %d\n", (a<b)&&(x>y));
	printf("!(a<b) = %d", !(a<b));
}
