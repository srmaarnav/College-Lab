/*Write a C++ program to multiply two objects.*/

#include<iostream>
using namespace std;

class num
{
	private :
		int a;
	public:
		num(int c)
		{
			a=c;
		}
		num operator *(num n)
		{
			num n1(0);
			
			n1.a = a * n.a;
		}
		void display()
		{
			cout<<"The product is "<<a<<endl;
		}
};
int main()
{
	num n1(15) , n2(10) , n3(0);
	
	n3 = n1*n2;
	
	n3.display();
}


