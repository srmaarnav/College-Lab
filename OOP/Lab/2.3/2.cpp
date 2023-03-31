/*Write a function areaOfCircle( ) which accepts radius of float value 
and returns the area of the circle. Use this function to calculate 
area of two circles having different  radii.*/

#include<iostream>
#define PI 3.14
using namespace std;

float areaofcircle(float r)
{
	return(PI*r*r);
}
int main()
{
	float r;
	
	cout<<"Enter the radius of circle :";
	cin>>r;
	
	cout<<endl<<"The area of circle is "<<areaofcircle(r);
}


