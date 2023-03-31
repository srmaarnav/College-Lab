/*Write a function which receives a float and  an integer from main(), 
finds the product of these two and returns the product  which is 
printed through main().*/

#include<iostream>
using namespace std;

float prod(int x, float y)
{
	return(x*y);
}
int main()
{
	int x;
	float y;
	
	cout<<"Enter an integer and a float number :"<<endl;
	cin >>x >> y;
	
	cout<<endl<<"Their product is "<<prod(x,y); 
}

