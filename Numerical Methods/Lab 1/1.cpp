/*bisection method*/
/* C Program for the function  4x3+2x2+3x+6*/


#include<stdio.h>
#include<conio.h>

int a0, a1, a2, a3;

float f(float x)
{
	return (a3*x*x*x+a2*x*x+a1*x+a0);
	
}

int main()
{
	float xl, xm, xu, fxl, fxm, fxu, E, Error;
	
	printf("Enter the coefficients a3, a2, a1 and a 0: \n");
	scanf("%d %d %d %d", &a3,&a2,&a1,&a0);
	
	printf("Enter initial bracket and E: \n");
	scanf ("%f %f %f", &xl, &xu, &E);
	
	fxl = f(xl);fxu = f(xu);
	
	while(1)
	{
		fxl = f(xl);f(xu);
		xm = (xl + xu)/2;
		
		fxm = f(xm);
		
		if((fxl*fxm)==0)
		            printf("Root= %f\n",xm);
		else if ((fxl*fxm)<0)
		        xu = xm;
		else
		        xl = xm;
		Error = (xu-xl)/xu;
		if(Error<E)
		{
		  printf("Root= %f\n",xm);
		  break;	
		}				  
    }
    getch();
}
