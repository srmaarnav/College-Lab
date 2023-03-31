/*Write a program to swap two number by using call by reference.*/

#include<iostream>
using namespace std;

void exc(int &a, int &b)
{
	int temp;
	
	temp=a;
	a=b;
	b=temp;
}
int main()
{
	int x=5 , y=3;
	
	exc(x,y);
	
	cout<<"After calling function"<<endl<<"x= "<<x<<endl<<"y= "<<y;
}

