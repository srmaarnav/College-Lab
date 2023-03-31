/*Write a program to display the value and address of a  variable using pointer variable.*/

#include<iostream>
using namespace std;

int main()
{
	int a;
	int *p;
	
	cout<<"Enter any number : ";
	cin>>a;
	
	p = &a;
	
	cout<<endl<<"The value of integer is "<<a;
	cout<<endl<<"The address of integer is "<<p;
}

