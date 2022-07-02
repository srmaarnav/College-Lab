/* program to count the number of odd and en=ven numbers in the input array*/
#include<stdio.h>
int main()
{
	int a[10] , i , eCount=0 , oCount=0;
	
	printf("Enter array elements :\n");
	for(i=0;i<10;i++)
	{
		scanf("%d",&a[i]);
		
		if(a[i]%2==0)
		{
			eCount++;
		}
		else
		{
			oCount++;
		}
	}
	printf("\nThere are %d even and %d odd numbers in the entered array.",eCount,oCount);
}
