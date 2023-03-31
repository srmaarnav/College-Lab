/*Create a class Integer with data members m and n . Use the concept of constructor to set the value of data members and then perform addition 
operation on the data members and display the result. ( modify the program to illustrate the concept of various types of constructors, destructor, 
and the concept of constructor with default argument).*/

#include<iostream>
using namespace std;
class integer{
    int m, n;
    public:
    integer()
    {
    cout<<"Enter two value of to add"<<endl;
    cin>>m>>n;
    }
    void add()
    {
    cout<<m+n;
    }
};
int main()
{
    integer a;
    a.add();
}

