/*Write a program to compute addition of two complex numbers using operator overloading.*/

#include<iostream>
using namespace std;

class complex
{
	private :
		int r , im;
	public:
		void getdata()
		{
			cout<<"Enter the real and imaginary part of the number :"<<endl;
			cin>>r>>im;
			cout<<endl;
		}
		complex operator +(complex c)
		{
			complex c1;
			
			c1.r = r+c.r;
			c1.im = im + c.im;
			return c1;
		}
		void display()
		{
			cout<<endl<<"The sum of the imaginary number is "<<r<<" + "<<im<<"i";
		}
};
int main()
{
	complex c1, c2, c3;
	c1.getdata();
	c2.getdata();
	c3 = c1+c2;
	
	c3.display();
}
