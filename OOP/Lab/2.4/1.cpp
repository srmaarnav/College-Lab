/*Write a program with two name spaces ( A and B) each defines add function to add two numbers. 
Use add( ) function in each namespace in main method to add two numbers.*/

#include<iostream>
using namespace std;

namespace A
{
	void add(int x , int y)
	{
		cout<<"The sum of x and y is "<<x+y;
	}
}
namespace B
{
	void add(int x , int y)
	{
		cout<<endl<<"The sum of x and y is "<<x+y;
	}
}
int main()
{
	int x=1, y=3, c=2, d=5;
	
	A::add(x,y);
	B::add(c,d);
}


