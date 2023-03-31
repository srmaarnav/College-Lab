/*Write a program to convert an object of  dollar class to object of rupees class. Assume that dollar class has data members dol and cent an 
rupees class have data members rs and paisa.*/

#include<iostream>
using namespace std;

class dollar
{
	float d , c ;
	
	public:
		dollar(int a , int b)
		{
			d=a;
			c=b;
		}
		float getdata()
		{
			float a;
			a = d + c/100;
			return a;
		}
};
class rupee
{
	int r , p;
	
	public:
		rupee()
		{
			r=0;
			p=0;
		}
		rupee(dollar e)
		{
			float x;
			
			x = e.getdata();
			
			x = x*108;
						
			r=int(x);
			p=(x-r)*100;
		}
		void display()
		{
			cout<<"The required dollar is "<<r<<" rupees and "<<p<<" paisa";
		}
};
int main()
{
	dollar d(15.0,4);
	rupee r = d;
	
	r.display();
}

