/*Write a program to find the volume  of cube (l*l*l), rectangular box (l*b*h) 
and cylinder (PI * r*r*h) by using overloaded function area.*/

#include<iostream>
#define PI 3.14
using namespace std;

void vol(int l)
{
	cout<<"The volume of cube is "<<l*l*l;
}
void vol(int l, int b, int h)
{
	cout<<endl<<"The volume of rectangular box is "<<l*b*h;
}
void vol(int r, int h)
{
	cout<<endl<<"The volume of cylinder is "<<PI*r*r*h;
}
int main()
{
	int l=10 , b = 5 , h = 8 , r = 7;
	
	vol(l);
	vol(l,b,h);
	vol(r,h);
}

