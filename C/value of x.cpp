/* Write a c program that evaluate the expression: x=a-b/3+c*2-1 and display the result on the screen. Note take the value of variables from the user.
*/

#include<stdio.h>
int main()
{
	int a , b ,c , x;
	
	printf("Enter the value of the numbers.\n");
	printf("A : ");
	scanf("%d",&a);
	
	printf("B : ");
	scanf("%d",&b);
	
	printf("C : ");
	scanf("%d",&c);
	
	x = a-b/3+c*2-1 ;
	
	printf("The value of a-b/3+c*2-1 is x = %d.",x);
}
