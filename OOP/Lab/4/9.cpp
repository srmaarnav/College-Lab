/*Write a C++ program to illustrate normal division of objects using operator overloading.*/

#include<iostream>
using namespace std;

class div
{
	private :
		int a;
	public:
		div(int c)
		{
			a=c;
		}
		div operator /(div n)
		{
			div n1(0);
			
			n1.a = a / n.a;
		}
		void display()
		{
			cout<<"The quotient is "<<a<<endl;
		}
};
int main()
{
	div n1(15),n2(10),n3(0);
	
	n3 = n1/n2;
	
	n3.display();
}

