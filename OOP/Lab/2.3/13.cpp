/*Write a program to find the area of a circle using inline function.*/

#include<iostream>
#define PI 3.14
using namespace std;

inline float area(int r)
{
	return(PI*r*r);
}
int main()
{
	int p,t,r;
	
	cout<<"Enter the radius of circle :";
	cin>>r;
	
	cout<<"The area of circle is "<<area(r);
}


