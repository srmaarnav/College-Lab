/*Create a class named Length with the required data  members and member functions  to add two lengths given by the  user in feet and inches 
format.*/

#include<iostream>
using namespace std;

class length 
{
    int f, in;
    
	public:
    void getData()
    {
        cout<<"Enter the length in feet and inches respectively :"<<endl;
        cin>>f>>in;
        cout<<endl;
    }
    
    void add(length l1, length l2)
    {
        f = l1.f + l2.f;
        in = l1.in + l2.in;
    }
    void display()
	{
        cout<<"The sum of the lengths is "<<f<<" feet and "<<in<<" inches"<<endl;
    }
};
int main()
{
    length l1 , l2 , l3;
    l1.getData();
    l2.getData();
    l3.add(l1,l2);
    l3.display();
}


