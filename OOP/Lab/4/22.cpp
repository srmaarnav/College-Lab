/*Write a program to convert object from class that represents 
temperature in Celsius scale to object of a class that represents it 
in Fahrenheit scale.*/

#include<iostream>
using namespace std;

class celsius
{
	int c;
	
	public:
		celsius(int d)
		{
			c = d;
		}
		int getdata()
		{
			return c;
		 } 
};

class fahren
{
	int f;
	
	public:
		fahren()
		{
			f = 0;
		}
		fahren(celsius cs)
		{
			int c;
			c = cs.getdata();
			
			f = (c*9/5) + 32;
		}
		void display()
		{
			cout<<"Fahrenheit : "<<f;
		}
};

int main()
{
	celsius c(100);
	fahren f = c;
	
	f.display();
}


