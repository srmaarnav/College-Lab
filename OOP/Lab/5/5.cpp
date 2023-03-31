/*Write a to illustrate the use of constructors in multilevel inheritance*/

#include<iostream>
using namespace std;

class A
{
	protected:
		int ad;
	public:
		A(int a)
		{
			ad=a;
		}
};

class B : public A
{
	protected:
		int bd;
	public:
		B(int b , int a):A(a)
		{
			bd=b;
		}
};

class C : public B
{
	private:
		int cd;
	public:
		C(int a , int b , int c):B(b,a)
		{
			cd=c;
		}
		void show()
		{
			cout<<"ad = "<<ad<<endl;
			cout<<"bd = "<<bd<<endl;
			cout<<"cd = "<<cd<<endl;
		}
};

int main()
{
	C c(1,2,3);
	
	c.show();
}
