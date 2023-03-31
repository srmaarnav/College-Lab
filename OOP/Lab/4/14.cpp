/*Write a C++ program to illustrate the overloading of relational 
operator <=.*/

#include<iostream>
using namespace std;

class lessor_equal
{
	int data;
	
	public:
		lessor_equal(int d)
		{
			data = d;
		}
		int getdata()
		{
			return data;
		}
		int operator <=(lessor_equal d)
		{
			if(data<=d.data)
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
	lessor_equal d1(100) , d2(100);
	
	cout<<"Data present in objects "<<endl;
	cout<<"d1 data = "<<d1.getdata()<<endl;
	cout<<"d2 data = "<<d2.getdata()<<endl;
	
	if(d1<=d2)
	{
		cout<<endl<<"d1 object is the less or equal to d2."<<endl;
	}
	else 
	{
		cout<<endl<<"d2 object is not less or equal to d1."<<endl;
	}
	return 0;
}

