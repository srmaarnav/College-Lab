/*Write a class Item with data members numbers and cost and  members functions getdata( ) and putdata . Read the data for 
two Items and display the Item details.*/

#include<iostream>
using namespace std;

class Item
{
	public:
		int numbers , costs;
		
		void getdata()
		{
			cout<<"Enter the number and costs of the items :"<<endl;
			cin>>numbers>>costs;
			cout<<endl;
		}
		
		void putdata()
		{
			cout<<endl<<"The details for the item is as follows: "<<endl<<"Numbers : "<<numbers<<endl<<"Cost : "<<costs<<endl;
		}
};
int main()
{
	Item i[2];
	int j=0;
	
	for(j=0;j<2;j++)
	{
		i[j].getdata();
	}
	
	for(j=0;j<2;j++)
	{
		i[j].putdata();
	}
}

