/*Write a C++ program to illustrate the overloading of postfix increment operator.*/

#include<iostream>
using namespace std;

class counter
{
	private :
		int count;
	public:
		counter()
		{
			count=10;
		}
		int get_count()
		{
			return count;
		}
		void operator ++(int)
		{
			count++;
		}
};
int main()
{
	counter c1;
	
	cout<<"Value of count before increment "<<endl;
	cout<<"c1 count = "<<c1.get_count()<<endl;
	c1++;
	cout<<"Value of count after increment "<<endl;
	cout<<"c1 count = "<<c1.get_count()<<endl;
}

