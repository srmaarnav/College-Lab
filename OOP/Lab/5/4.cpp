/*Write a to illustrate the use of constructors in multiple inheritance*/

#include<iostream>
using namespace std;

class A
{
	protected:
		int x;
	
	public:
		A(int a)
		{
			x=a;	
		}
};

class B
{
	protected:
		int y;
	
	public:
		B(int b)
		{
			y=b;
		}
};

class C: public A, public B
{
	int z;
	
	public:
		C(int a , int b , int c):A(a), B(b)
		{
			z=c;
		}
		
		void show()
		{
			cout<<"X = "<<x<<endl;
			cout<<"Y = "<<y<<endl;
			cout<<"Z = "<<z<<endl;
		}
};

int main()
{
	C c1(1,2,3);
	
	c1.show();
}


