/*Write a function sumOfDgits() which receives number n as its 
arguments and returns sum of digits of n (e.g., n= 123 then sum 
of digits= 1+2+3=6).*/

#include<iostream>
using namespace std;

int sumofDigits(int n)
{
	int  sum = 0, rem;
	
	while (n != 0)
	{
		rem = n % 10;
		sum       = sum + rem;
		n         = n / 10;
   }
   return sum;
}
int main()
{
	int x;
	
	cout<<"Enter any number :";
	cin>>x;
	
	cout<<endl<<"The sum of digits of "<<x<<" is "<<sumofDigits(x);
}

