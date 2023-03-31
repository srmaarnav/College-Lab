/*Write a program to read and display 3 objects of item class containing data member item, name ,code and price.*/

#include<iostream>
using namespace std;

class Item
{
	public:
		int code , price;
		char name[20];
		
		void getdata()
		{
			cout<<"Enter the name, code and price of the items :"<<endl;
			cin>>name>>code>>price;
			cout<<endl;
		}
		
		void display()
		{
			cout<<endl<<"The details for the item is as follows: "<<endl<<"Name : "<<name<<endl<<"Code : "<<code<<endl<<"Price : "<<price<<endl;
		}
};
int main()
{
	Item i[3];
	int j=0;
	
	for(j=0;j<3;j++)
	{
		i[j].getdata();
	}
	
	for(j=0;j<3;j++)
	{
		i[j].display();
	}
}

