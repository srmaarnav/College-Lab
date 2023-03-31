/*Create a class Temp with the required data members and member functions that are used to convert temperature given in Fahrenheit to Celsius. 
[c=(f-32/1.8]*/


#include<iostream>
using namespace std;

class c
{
	float f;
	public:
		void input()
		{
			cout<<"Enter the tempreature in fahrenheit : ";
			cin>>f;
		}
		float convert()
		{
			return((f-32)/1.8);
		}
};
int main()
{
	c a1;
	
	a1.input();
	
	cout<<"The tempreature in celsius is "<<a1.convert();
}
