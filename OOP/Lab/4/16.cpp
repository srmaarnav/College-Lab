/*Write a C++ program to illustrate the overloading of relational 
operator ==.*/

#include<iostream>
using namespace std;

class is_equal
{
	int data;
	
	public:
		is_equal(int d)
		{
			data = d;
		}
		int getdata()
		{
			return data;
		}
		int operator ==(is_equal d)
		{
			if(data==d.data)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
};
int main()
{
	is_equal d1(100) , d2(1000);
	
	cout<<"Data present in objects "<<endl;
	cout<<"d1 data = "<<d1.getdata()<<endl;
	cout<<"d2 data = "<<d2.getdata()<<endl;
	
	if(d1==d2)
	{
		cout<<endl<<"d1 object is equal to d2."<<endl;
	}
	else 
	{
		cout<<endl<<"d1 object is not equal to d2."<<endl;
	}
	return 0;
}


