/*Create a person class with attributes id and name and member function to set
 the member variables and to display those variables. Then create 
class student with member variables grade and addresses which inherits 
person class publically.*/


#include<iostream>
using namespace std;

class person
{
	private:
		int id;
		char name[20];
	
	public:
		void getdata()
		{
			cout<<"Enter the name of the person : ";
			cin>>name;
			cout<<"Enter the id of the person : ";
			cin>>id;
		}
		void readdata()
		{
			cout<<endl<<"Name : "<<name;
			cout<<endl<<"Id : "<<id;
		}
};

class student: public person
{
	private:
		char grade , address[20];
		
	public:
		void input()
		{
			getdata();
			cout<<"Enter the grade of the person : ";
			cin>>grade;
			cout<<"Enter the address of the person : ";
			cin>>address;
		}
		void showdata()
		{
			readdata();
			cout<<endl<<"Grade : "<<grade;
			cout<<endl<<"Address : "<<address;
		}
};

int main()
{
	student s;
	
	s.input();
	cout<<endl<<"--------------Personal Details-----------------";
	s.showdata();
}


