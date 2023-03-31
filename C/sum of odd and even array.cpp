/* sum of even and odd numbers in the array*/
/* program to count the number of odd and en=ven numbers in the input array*/
#include<stdio.h>
int main()
{
	int a[10] , i , esum=0 , osum=0;
	
	printf("Enter array elements :\n");
	for(i=0;i<10;i++)
	{
		scanf("%d",&a[i]);
		
		if(a[i]%2==0)
		{
			esum = esum + a[i];
		}
		else
		{
			osum = osum +a[i];
		}
	}
	printf("\nThe sum of even numbers in the array is %d and the sum of odd numbers in the array is %d.",esum,osum);
}
