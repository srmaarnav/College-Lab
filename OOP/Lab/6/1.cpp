/*Create a  base class called shape. Use this class to store two double type 
values that could be used to compute the area of figures. Derive two specific 
classes called triangle and rectangle from the base shape. Add to the base
class, a member function get_data( ) to initialize base class data members 
and another member function display_area( ) to compute and display the area
of figure. Make display_area( ) as a virtual function and redefine this 
function in the derived classes to suit their requirements.*/

#include<iostream>
using namespace std;

class shape
{
	protected:
		double x , y;
	public:
		void get_data(int a , int b)
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
}

