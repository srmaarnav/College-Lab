/*Write a program designing a class student With  Roll, Name and marks as data members and  getdata( ),  showdata( ) as member functions. Read 
the data for five students and display the roll , name and marks of those students whose marks is greater than 70.*/


#include<iostream>
using namespace std;

class student
{
	public:
		int roll , marks;
		char name[15];
		
		void getdata()
		{
			cout<<"Enter the name, roll number and marks of the students respectively :"<<endl;
			cin>>name;
			cin>>roll;
			cin>>marks;
		}
		
		void showdata()
		{
			if(marks>70)
			{
				cout<<"The details of students with marks more than 70 is: "<<endl<<"Name : "<<name<<endl<<"Roll Number : "<<roll<<endl<<"Marks : "<<marks;
			}
		}
};
int main()
{
	student s[5];
	int i;
	
	for(i=0;i<5;i++)
	{
		s[i].getdata();
	}
	
	for(i=0;i<5;i++)
	{
		cout<<endl<<endl;
		s[i].showdata();
	}
}
