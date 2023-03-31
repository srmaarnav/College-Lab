/*Write a function Reverse() which receives number n as its arguments 
and returns reverse of n (e.g., if n=123 then reverse of n =321)*/

#include<iostream>
using namespace std;

int Reverse(int n)
{
	int  sum = 0, rem;
	
	while (n != 0)
	{
		rem = n % 10;
		sum       = sum*10 + rem;
		n         = n / 10;
   }
   return sum;
}
int main()
{
	int x;
	
	cout<<"Enter any number :";
	cin>>x;
	
	cout<<endl<<"The reverse of "<<x<<" is "<<Reverse(x);
}


