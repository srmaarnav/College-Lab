/*Write a function calculateArea() which receives length and breadth of a 
rectangle as its arguments and returns area of the rectangle.*/

#include<iostream>
using namespace std;

int calculateArea(int a, int b)
{
	return(a*b);
}
int main()
{
	int l , b;
	
	cout<<"Enter the length and breadth of a rectangle :"<<endl;
	cin>>l>>b;
	
	cout<<endl<<"The area of rectangle is "<<calculateArea(l,b);	
}

