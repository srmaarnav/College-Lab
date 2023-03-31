/*Write a program to illustrate the overloading of  stream operators.*/

#include<iostream>
using namespace std;

class times
{
    int hr, min, sec;
    public:
    times()
    {
        cout<<"Enter the hour, minute & second "<<endl;
        cin>>hr>>min>>sec;
    }
    friend ostream& operator <<(ostream& os, times& tm);
};

ostream& operator <<(ostream& os, times& tm)
{
    os<<tm.hr<<":"<<tm.min<<":"<<tm.sec;
    return os;
}

int main()
{
    times t;
    cout<<t;
}
