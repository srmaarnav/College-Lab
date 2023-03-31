/*Write a function factorial() which receives number n as its arguments 
and returns factorial of n (e.g., if n=5 then factorial of n =120)*/

#include<iostream>
using namespace std;

int factorial(int x)
{
	int i, f=1;
	
	for(i=1;i<=x;i++)
	{
		f=f*i;
	}
	return f;
}
int main()
{
	int a;
	
	cout<<"Enter any number : ";
	cin>>a;
	
	cout<<endl<<"The factorial of "<<a<<" is "<<factorial(a);
}

