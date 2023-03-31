/* Write a program that requests two float type numbers from the user and then divides the first number by the second and display the result along with the numbers.
*/

#include<stdio.h>
int main()
{
	float a, b, d; 
	
	printf("Enter two float numbers.");
	scanf("%f %f", &a, &b);
	
	d=a/b;
	
	printf("When %f id divided by %f, the result is %f",a ,b, d);
}
