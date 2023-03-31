/*Write a function sumNatural( ) which receives number n as its arguments 
and returns sum of first  n natural numbers (e.g., if n=5 then sum of 
first natural number =1+2+3+4+5=15)*/

#include<iostream>
using namespace std;

int sumNatural(int n)
{
	int sum=0 ,i;
	
	for(i=1;i<=n;i++)
	{
		sum += i;
	}
	return sum;
}
int main()
{
	int n;
	
	cout<<"Enter any number : ";
	cin>>n;
	
	cout<<endl<<"The sum of first "<<n<<" number is "<<sumNatural(n);
}

