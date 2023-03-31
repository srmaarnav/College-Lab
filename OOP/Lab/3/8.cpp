/*Write a class rectangle with data members length and breadth and member functions readdata( ) , area( ), perimeter( ) and display( ). Use this 
class to calculate the area of  three rectangles of different dimension.*/

#include<iostream>
using namespace std;

class Rectangle
{
	public:
		int length , breadth;
		
		void getdata()
		{
			cout<<"Enter the length and breadth of the rectangle :"<<endl;
			cin>>length>>breadth;
			cout<<endl;
		}
		
		int area()
		{
			int area;
			
			area = length * breadth;
			return area;
		}
};
int main()
{
	Rectangle r[3];
	int j=0 , area;
	
	for(j=0;j<3;j++)
	{
		r[j].getdata();
		area = r[j].area();
		cout<<"The required area of the rectangle is "<<area<<endl<<endl;
	}
	
}

