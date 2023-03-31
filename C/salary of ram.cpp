/* program to calculate gross salary of Ram from input of his basic salary*/

#include <stdio.h>

int main()
{
	float basic, gross, dear, house ;
	//basic = 1000;//
	
	printf ("Enter the basic salary of Ram:");
	scanf ("%f", &basic);
	
	dear = basic*30/100;
	house = basic*10/100;
	gross = basic + dear + house;
	
	printf("\nThe gross salary of Ram is %g", gross);
	
	return 0;
}
