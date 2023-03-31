/* program to sort elements in ascending order */

#include<stdio.h>
int main()
{
	int i , j , temp , a[5]={10, 5, 100, 120, 20};
	printf("Enter the numbers :\n");
	for(i=0;i<5;i++)
	{
		scanf("%d",&a[i]);
	}
	for(i=0;i<5;i++)
	{
		for(j=i+1;j<5;j++)
		{
			if(a[j]<a[i])
			{
				temp = a[j];
				a[j]=a[i];
				a[i]=temp;
			}
		}
	}
	printf("Sorted arrrays : \n");
	for(i=0;i<5;i++)
	{
		printf("%d  ",a[i]);
	}
}
