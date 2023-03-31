/*Write a program to find the maximum of  two data members of a classes using the concept of a template.*/

#include<iostream>
using namespace std;

template<class T>
class maxx 
{
    T a, b;
    public:
    maxx(T x, T y)
    {
        a = x;
        b = y;
    }
    T get_max()
    {
        T m;
        m = (a>b)?a:b;
        return m;
    }
};

int main()
{
    int p,q;
    cout<<"Enter any number "<<endl;
    cin>>p>>q;
    maxx<int>o(p,q);
    cout<<"The maximum number is "<<o.get_max()<<endl;
}
