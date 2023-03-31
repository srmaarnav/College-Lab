/*Write a program to convert kilogram into gram using user defined to 
user defined data conversion.(1kg = 1000gm).*/

#include<iostream>
using namespace std;

class kilogram
{
	int kg;
	
	public:
		kilogram(int d)
		{
			kg = d;
		}
		int getdata()
		{
			return kg;
		 } 
};

class gram
{
	int gm;
	
	public:
		gram()
		{
			gm = 0;
		}
		gram(kilogram kg)
		{
			int g;
			g = kg.getdata();
			
			gm = g*1000;
		}
		void display()
		{
			cout<<"Gram : "<<gm;
		}
};

int main()
{
	kilogram k(12);
	gram g = k;
	
	g.display();
}

