/*Write a program that takes two amount (can be in RS and PS) as input and decide which one is less.*/

#include<iostream>
using namespace std;

class Currency
{
	private:
		int rs , p;
	
	public:
		Currency(int a, int b)
		{
			rs = a;
			p = b;
		}
		void getdata()
		{
			cout<<"The currency is Rs. "<<rs<<" and "<<p<<" paisa"<<endl<<endl;
		}
		int operator <(Currency c)
		{
			p = rs*100+p;
			c.p = c.rs*100+c.p;
			
			if(p<c.p)
				return 1;
			else 
				return 0;
		}
};
int main()
{
	Currency c1(10,50) , c2(50,60);
	
	c1.getdata();
	c2.getdata();
	
	if(c1<c2)
		cout<<"C1 is the lesser one";
	else
		cout<<"C2 is the lesser one";
}

