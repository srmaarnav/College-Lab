/* program to find volume of sphere  */

#include <stdio.h>
int main()

{
	const float PI = 3.14;		
	float r, v, a;
	printf("Enter the radius of sphere:");
	scanf("%f",&r);
	
	v = 4*PI*r*r*r/3;
	a = 4*PI*r*r;
	
	printf("\nThe volume of sphere is %f and its area is %f",v,a);
	
	return 0;
	
}
