/*Write a C++ program to illustrate the overloading of assignment 
operator.*/

#include<iostream>
using namespace std;

class dist
{
	int feet , inch;
	
	public:
		dist(int f , int i)
		{
			feet = f;
			inch = i;
		}
		void operator =(dist &d)
		{
			feet = d.feet;
			inch = d.inch;
		}
		void display()
		{
			cout<<"Feet : "<<feet<<"        Inches : "<<inch<<endl;
		}
};
int main()
{
	dist d1(12,5) , d2(15,4);
	
	cout<<"First distance : "<<endl;
	d1.display();
	
	cout<<endl<<"Second distance : "<<endl;
	d2.display();
	
	d1=d2;
	
	cout<<endl<<"New first distance : "<<endl;
	d1.display();
}

