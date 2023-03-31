/*Write a C++ program to illustrate modulo division of objects using operator overloading.*/

#include<iostream>
using namespace std;

class mod
{
	private :
		int a;
	public:
		mod(int c)
		{
			a=c;
		}
		mod operator %(mod n)
		{
			mod n1(0);
			
			n1.a = a % n.a;
		}
		void display()
		{
			cout<<"The modulo is "<<a<<endl;
		}
};
int main()
{
	mod n1(15) , n2(10) , n3(0);
	
	n3 = n1%n2;
	
	n3.display();
}
