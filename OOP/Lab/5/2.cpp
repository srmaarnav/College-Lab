/*Create class polygon based on this class, derive two base classes Rectangle 
and Triangle to calculate area with necessary data members and member function
. (note: area of rectangle=L*b and area of triangle= (l*b/2)).*/

#include<iostream>
using namespace std;

class polygon
{
	public:
		int l , b;
		void getdata()
		{
			cout<<"Enter the length and breadth of the polygon : "<<endl;
			cin>>l>>b;
		}
};

class rectangle: private polygon
{
	public:
		void areaofrect()
		{
			getdata();
			cout<<endl<<"The area of rectangle is : "<<l*b;	
		}	
};

class triangle: private polygon
{
	public:
		void areatri()
		{
			getdata();
			cout<<endl<<"The area of triangle is : "<<(l*b)/2;
		}
};

int main()
{
	cout<<"For Rectangle"<<endl;
	rectangle r1;
	r1.areaofrect();
	cout<<endl<<"------------------------------------"<<endl;
	cout<<"For Triangle"<<endl;
	triangle t1;
	t1.areatri();
}

