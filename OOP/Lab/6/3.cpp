/*Create an abstract base class place with data members name, address and 
mobile and member function getdata( ) and display as pure virtual function.
 Based on this class, derive a new Classes KTM and MNR  to inherit all 
 features .*/
 
#include<iostream>
using namespace std;

class place
{
	protected:
		char name[20], address[20], mobile[10];
	public:
		void getdata()
		{
			cout<<"Enter the name : ";
			cin>>name;
			cout<<"Enter the address : ";
			cin>>address;
			cout<<"Enter the mobile number : ";
			cin>>mobile;
		}
		virtual void display()=0;
};

class ktm: public place
{
	public:
		void display()
		{
			cout<<"Kathmandu"<<endl;
			cout<<"Name : "<<name<<endl;
			cout<<"Address : "<<address<<endl;
			cout<<"Mobile Number : "<<mobile<<endl; 
		}
};

class mnr: public place
{
	public:
		void display()
		{
			cout<<"Mahendranagar"<<endl;
			cout<<"Name : "<<name<<endl;
			cout<<"Address : "<<address<<endl;
			cout<<"Mobile Number : "<<mobile<<endl; 
		}
};

int main()
{
	cout<<"For Kathmandu"<<endl;
	ktm k;
	place *p = &k;
	p->getdata();
	
	cout<<endl;
	
	cout<<"For Mahendranagar"<<endl;
	mnr m;
	p = &m;
	p->getdata();
	
	cout<<endl<<endl;
	k.display();
	cout<<endl;
	m.display();
	
}

