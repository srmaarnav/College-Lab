/*Write a object-oriented program to find the area and volume of  two different room.*/

#include<iostream>
using namespace std;

class Room
{
	public:
		int length , breadth , height;
		
		void getdata()
		{
			cout<<"Enter the dimensions of the room :"<<endl;
			cin>>length>>breadth>>height;
			cout<<endl;
		}
		
		int area()
		{
			int area;
			
			area = length * breadth;
			return area;
		}
		
		int volume()
		{
			int vol;
			vol = length * breadth * height;
			return vol;
		}
};
int main()
{
	Room r[2];
	int j=0 , area , vol;
	
	for(j=0;j<2;j++)
	{
		r[j].getdata();
		area = r[j].area();
		cout<<"The required area of the room is "<<area<<endl;
		vol = r[j].volume();
		cout<<"The required volume of the room is "<<vol<<endl<<endl;
	}
}

