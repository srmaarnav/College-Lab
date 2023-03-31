/*Write a program to convert 10.5 kg weight into the object 
of class Convert with data members kg and gram.*/

#include<iostream>
using namespace std;

class weight
{
	int kg , gram;
	
	public:
		weight(float m)
		{
			kg = int(m);
			gram = 1000*(m-kg);			
		}
		void display()
		{
			cout<<"Kilogram : "<<kg<<endl<<"Gram : "<<gram<<endl;
		}
};
int main()
{
	float f=10.5;
	weight w = f;
	
	w.display();
	return 0;
}
