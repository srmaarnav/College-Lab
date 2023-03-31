/*Write a program to illustrate use of destructors in multiple inheritance*/

#include<iostream>
using namespace std;

class A
{
	public:
		~A()
		{
			cout<<"Class A Destructor"<<endl;
		}
};

class B
{
	public:
		~B()
		{
			cout<<"Class B Destructor"<<endl;
		}
};

class C : public A , public B
{
	public:
		~C()
		{
			cout<<"Class C Destructor"<<endl;
		}
};

int main()
{
	C x;
}

