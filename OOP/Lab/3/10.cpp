/*Create a class named complex with the required data members and member functions to add two complex numbers.*/

#include<iostream>
using namespace std;

class complex 
{
    int r, im;
    
	public:
    void getData()
    {
        cout<<"Enter the real and imaginary part of the number respectively :"<<endl;
        cin>>r;
        cin>>im;
        cout<<endl;
    }
    
    void add(complex c1, complex c2)
    {
        r = c1.r+c2.r;
        im = c1.im + c2.im;
    }
    void display()
	{
        cout<<"The addition of the complex number is "<<r<<" + "<<im<<"i"<<endl;
    }
};
int main()
{
    complex c1, c2, c3;
    c1.getData();
    c2.getData();
    c3.add(c1,c2);
    c3.display();
}

