/*Write a program to find the average of the private data members of two 
different classes using friend function.*/

#include<iostream>
using namespace std;

class beta;
class alpha
{
	private:
		float data;
	public:
		void setdata(int d)
		{
			data=d;
		}
		friend float avg(alpha , beta); 
};
class beta
{
	private:
		float data;
	public:
		void setdata(int d)
		{
			data = d;
		}
		friend float avg(alpha , beta);
};

float avg(alpha a , beta b)
{
	return (a.data+b.data)/2;
}

int main()
{
	alpha a;
	a.setdata(4);
	beta b;
	b.setdata(5);
	
	cout<<"Average : "<<avg(a,b);
	return 0;	
}

