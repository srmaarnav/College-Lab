/*Write a program to convert 100.25 rupee into the object of class 
Currency with data members RS and paisa.*/

#include<iostream>
using namespace std;

class currency
{
	int rs , paisa;
	
	public:
		currency(float m)
		{
			rs = int(m);
			paisa = 100*(m-rs);			
		}
		void display()
		{
			cout<<"Rupees : "<<rs<<endl<<"Paisa : "<<paisa<<endl;
		}
};
int main()
{
	float f=100.25;
	
	currency c = f;
	
	c.display();
	return 0;
}

