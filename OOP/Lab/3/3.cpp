/*Define a class Circle with radius and area as data members and  getdata, calArea and Display as member fuctions. Use this class to calculate 
the area of  three circles.*/


#include<iostream>
#define PI 3.14
using namespace std;

class circle
{
	public:
		float r , a;
	
	void getdata()
	{
		cout<<"Enter the radius of the circle : ";
		cin>>r;
	}
	float area()
	{
		a = PI*r*r;
		return(a);
	}
	void display()
	{
		cout<<"The area of the required circle is "<<a;
	}
};
int main()
{
	circle c1,c2,c3;
	
	c1.getdata();
	c1.area();
	c1.display();
	cout<<endl<<endl;
	
	c2.getdata();
	c2.area();
	c2.display();
	cout<<endl<<endl;
	
	c3.getdata();
	c3.area();
	c3.display();
}
