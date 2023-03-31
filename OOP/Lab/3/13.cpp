/*Create a class named Currency with the required data members & member functions to add two currency entered by the user in RS and paisa format.*/

#include<iostream>
using namespace std;

class Currency 
{
    int rs, p;
    
	public:
    void getData()
    {
        cout<<"Enter the currency in rupees and paisa respectively :"<<endl;
        cin>>rs>>p;
        cout<<endl;
    }
    
    void add(Currency c1, Currency c2)
    {
        rs = c1.rs + c2.rs;
        p = c1.p + c2.p;
    }
    void display()
	{
        cout<<"The sum of the time is Rs. "<<rs<<" and "<<p<<" Paisa"<<endl;
    }
};
int main()
{
    Currency c1 , c2 , c3;
    c1.getData();
    c2.getData();
    c3.add(c1,c2);
    c3.display();
}


