/*Write a program to find the maximum of two numbers  using function template.*/

#include<iostream>
using namespace std;

template<class T>
T maxx(T a, T b)
{
    T max;
    if(a>b)
    {
        max =  a;
    }
    else
        max = b;
    return max;
}

int main()
{
    int x, y;
    cout<<"Enter any two number "<<endl;
    cin>>x>>y;
    cout<<"The max number is "<<maxx(x,y)<<endl;
}
