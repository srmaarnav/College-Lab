/*Write a program to read number of employees, n, working in a company. Reserve the memory required to store age of n employees using new operator.
Read age of n employees from user and count the number of employees of age above 60 years.*/

#include<iostream>
using namespace std;

int main()
{
	int n , i , count =0;
	
	cout<<"Enter the no. of employees : ";
	cin>>n;
	
	int *age = new int[n];
	
	cout<<"Enter the ages :"<<endl;
	for(i=0;i<n;i++)
	{
		cin>>*age;
		if(*age>60)
			count++;
	}
	cout<<"The employees above 60 years old are "<<count;
}

