/*Write a program to perform basic mathematical (+, -, / , %) operation using 
the concept of Hierarchical inheritance*/

#include<iostream>
using namespace std;

class operation
{

	public:
		int a,b;
		
		void getop()
		{
			cout<<"Enter the operands : "<<endl;
			cin>>a>>b;
		}
};

class add : public operation
{
	
	public:
		void sum()
		{
			cout<<"For addition"<<endl;
			getop();
			
			cout<<"The sum of the operands is "<<a+b;
		}
};

class sub : public operation
{
	
	public:
		void diff()
		{
			cout<<"For subtraction"<<endl;
			getop();
			
			cout<<"The difference of the operands is "<<a-b;
		}
};

class divide : public operation
{
	
	public:
		void div()
		{
			cout<<"For division"<<endl;
			getop();
			
			cout<<"The division of the operands is "<<a/b;
		}
};

class modulo : public operation
{
	
	public:
		void mod()
		{
			cout<<"For remainder"<<endl;
			getop();
			
			cout<<"The remainder of the operands is "<<a%b;
		}
};

int main()
{
	add a1;
	a1.sum();
	cout<<endl<<endl;
	
	sub s1;
	s1.diff();
	cout<<endl<<endl;

	divide d1;
	d1.div();
	cout<<endl<<endl;
	
	modulo m1;
	m1.mod();
	cout<<endl<<endl;
}

