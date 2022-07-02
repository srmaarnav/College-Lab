/* distance between two cities */

#include <stdio.h>
int main()
{
	float d, m, f, i ,c ;
	printf("Enter the distance between two cities in kilometer:");
	scanf("%f", &d);
	
	printf("The distance in kilometer is %f",d);
	
	m=d*1000;
	printf("\nThe distance in meter is %f",m);
	
	f=3280*d;
	printf("\nThe distance in feet is %f",f);

	i=39370.08*d;
	printf("\nThe distance in inches is %f",i);	
	
	c=100000*d;
	printf("\nThe distance in centimeter is %f",c);
	
	printf("\nThe distance in meter is %f, the distance in feet is %f, the distance in inches is %f and in centimeter is %f.", m, f, i, c);

	return 0;
}
