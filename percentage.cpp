/* If the marks obtained by a student in five different subjects are input through the keyboard,
 find out the aggregate marks and percentage marks obtained by the student. Assume that the maximum marks that can be obtained by a student in each subject is 100.*/
 
#include<stdio.h>

int main()
{
	float a, b, c, d, e, am, p;
	
	printf("Input the marks of students in five subjects respectively:");
	scanf("%f %f %f %f %f", &a, &b, &c, &d, &e);
	
	am = a+b+c+d+e;
	
	p = (am/500)*100;
	
	printf("\nThe aggregate marks obtained by the student is %f", am);
	
	printf("\nThe student obtained %f percentage in the examination.", p);
}
