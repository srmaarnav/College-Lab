/*Write a program to count the number of objects created for a class using the static members of  class.*/

#include<iostream>
using namespace std;
class item
{
    string name;
    int code, price;
    static int count;
    
    public:
    void getdata()
    {
        cout<<"Enter the item name, code and its price"<<endl;
        cin>>name>>code>>price;
        cout<<endl;
    }
    void co()
    {
        count++;
    }
    void display()
    {
    	cout<<"Total number of items is "<<count<<endl;
    } 
};
int item::count;
int main()
{
    item a1, a2, a3;
    a1.getdata();
    a2.getdata();
    a3.getdata();
    
	a1.co();
    a2.co();
    a3.co();
    a3.display();
}

