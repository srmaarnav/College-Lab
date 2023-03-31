/*Write a program to illustrate the concept of aggregation.*/

#include<iostream>
using namespace std;

class employee
{
	private:
		int eid;
		
	public:
		void getdata()
		{
			cout<<"Enter eid of employee : ";
			cin>>eid;
		}
		void display()
		{
			cout<<"Employee id : "<<eid<<endl;
		}
};

class company
{
	private:
		char name[20];
		employee e;
	public:
		void input()
		{
			e.getdata();
			cout<<"Enter the name of company : ";
			cin>>name;
		}
		void display()
		{
			e.display();
			cout<<"Company Name : "<<name<<endl;
		}
};

int main()
{
	company c;
	
	c.input();
	cout<<"-------------------------------------"<<endl;
	c.display();
}

