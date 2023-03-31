/*Write a program to compare the two distances taken as input in the program and decide which one is greater than other.*/

#include<iostream>
using namespace std;

class dist
{
	private:
		int x;
	
	public:
		dist(int a)
		{
			x= a;
		}
		void getdata()
		{
			cout<<"The distance is "<<x<<endl<<endl;
		}
		int operator <(dist c)
		{
			if(x>c.x)
				return 1;
			else 
				return 0;
		}
};
int main()
{
	dist c1(10) , c2(50);
	
	c1.getdata();
	c2.getdata();
	
	if(c1<c2)
		cout<<"C1 is the greater one";
	else
		cout<<"C2 is the greater one";
}

