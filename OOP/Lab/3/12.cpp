/*Create a class named Time with the required data members and member functions to add two time entered by the user in hour and minutes format.*/

#include<iostream>
using namespace std;

class Time 
{
    int hr, min;
    
	public:
    void getData()
    {
        cout<<"Enter the time in hours and minutes respectively :"<<endl;
        cin>>hr>>min;
        cout<<endl;
    }
    
    void add(Time t1, Time t2)
    {
        hr = t1.hr + t2.hr;
        min = t1.min + t2.min;
    }
    void display()
	{
        cout<<"The sum of the time is "<<hr<<" hours and "<<min<<" minutes"<<endl;
    }
};
int main()
{
    Time t1 , t2 , t3;
    t1.getData();
    t2.getData();
    t3.add(t1,t2);
    t3.display();
}



