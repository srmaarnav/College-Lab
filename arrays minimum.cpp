#include<stdio.h>
int main()
{
	int i , a[10] , min;
	
	printf("Enter array elements :\n");
	for(i=0;i<10;i++)
	{
		scanf("%d",&a[i]);
	}
	min = a[0];
	
	for (i=0;i<10;i++)
	{
		if(a[i]<min)
		{
			min = a[i];
		}
	}
	printf("Minimun elements = %d",min);
}
