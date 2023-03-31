/*Write a program to find the largest of three numbers using the concept of function with default 
argument.*/

#include<iostream>
using namespace std;

int large(int a, int b, int c=100)
{
	if((a>b)&&(a>c))
		return a;
	if((b>a)&&(b>c))
		return a;
	if((c>a)&&(c>b))
		return c;
}
int main()
{
	int x , y , z;
	
	cout<<"Enter any three numbers : "<<endl;
	cin>>x>>y>>z;
	
	cout<<endl<<"The largest number is "<<large(x,y);
}

