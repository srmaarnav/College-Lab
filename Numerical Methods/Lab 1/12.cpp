/*Newton Raphson*/

/* C Program for the function  4x3+2x2+3x+6*/

#include<stdio.h>
#include<conio.h>
#include<math.h>

#define F(x) (a3*x*x*x+a2*x*x+a1*x+a0)
#define FD(x) (3*a3*x*x+2*a2*x+a1)

float a0 , a1 , a2 , a3;

int main()
{
	int i;
	float x0 , x1 , fx0 , fdx0 , E , Er;
	
	printf("Enter the coefficients a3, a2, a1, and a0:\n");
	scanf("%d %d %d %d",&a3,&a2,&a1,&a0);
	
	printf("Enter initial guess and E :\n");
	scanf("%f %f",&x0,&E);
	
	while(1)
	{
		fx0 = F(x0);fdx0 = FD(x0); 
		
		x1 = x0-fx0/fdx0;
		
		Er = (x1-x0)/x1;
		
		if(fabs(Er)<E)
			printf("Roots = %f\n",x1);
			break;
		
		x0=x1;
		
		if(i==10)
			break;
		
	}
	getch();
}
