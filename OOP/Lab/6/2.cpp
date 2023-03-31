/*Extend the above program to display the area of circles. This requires 
addition of  a new derived class circle that computes the area of a circle. 
Remember , for a circle we need only one value, its radius, but the get_data
(  ) function in the  base class requires two values to be passed. ( Hint: 
Make the second argument of get_data( ) as default one with zero value.)*/

#include<iostream>
#define PI 3.14
using namespace std;

class shape
{
	protected:
		double x , y;
	public:
		void get_data(int a , int b=0)
		{
			x=a;
			y=b;
		}
		virtual void display_area()=0;		
};

class triangle: public shape
{
	public:
		void display_area()
		{
			cout<<"The area of triangle is "<<(x*y/2);
		}
};

class rectangle: public shape
{
	public:
		void display_area()
		{
			cout<<"The area of rectangle is "<<(x*y);
		}
};

class circle: public shape
{
	public:
		void display_area()
		{
			cout<<"The area of circle is "<<(PI*x*x);
		}
};

int main()
{
	triangle t;
	shape *s = &t;
	s->get_data(5,6);
	t.display_area();
	
	cout<<endl<<endl;
	
	rectangle r;
	s = &r;
	s->get_data(8,9);
	r.display_area();
	
	cout<<endl<<endl;
	
	circle c;
	s = &c;
	s->get_data(7);
	c.display_area();
}

