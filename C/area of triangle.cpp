/* Write a program to read three sides of a triangle and calculate the area ( Note:  area= sqrt(s*(s-a)*(s-b)*(s-c)) where, s=(a+b+c)/2).
*/

#include<stdio.h>
#include<math.h>
int main()
{
	float a, b, c, s, area;
	
	printf("Enter the three sides of the triangle:");
	scanf("%f %f %f", &a, &b, &c);
	
	s = (a+b+c)/2;
	
	area = sqrt(s*(s-a)*(s-b)*(s-c));
	
	printf("\nThe area of traingle is: %fsq.cm.",area);
	
}
