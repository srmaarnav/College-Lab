/* Write a program to read two integer number ( number of male and female ) and finds the ratio between them to express as floating point value.
*/

#include <stdio.h>
int main() 
{
	int m, f;
	float ratio;
   
	printf("Number of males: "); 
    scanf("%d", &m);
    printf("Number of females: ");
    scanf("%d", &f);
   
   if(f != 0)
     {
   		ratio = (float)m/(float)f;
		printf("\nThe ratio of number of males to females is %.1f\n.", ratio);
	 } 
	else 
	 {
	 		printf("Division not possible.\n");
	  }
  return 0;
}

