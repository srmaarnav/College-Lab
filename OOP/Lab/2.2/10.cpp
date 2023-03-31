/*Write a program to calculate the sum of 5 numbers, if user enters negative 
number then display the sum of  previous entered numbers [note: use loop, if 
and break statement]*/

#include<iostream>
using namespace std;
int main()
{
	int num,sum=0,i;
	cout << "Enter Postive numbers to add : \n";
	
	for(i=0;i<5;i++)
	{
		cin >> num;
		if(num<0)
		{
			break;
		}
		sum=sum+num;
	}
	cout << "\nThe sum of the numbers is "<< sum;
	return 0;
}

