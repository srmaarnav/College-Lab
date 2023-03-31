/*Customize the above program so that throw point outside the try block ( i.e., used function to divide and call this function from try block).*/

#include<iostream>
using namespace std;

void divide(int a, int b)
{
    if (b==0)
    {
        throw b;
    }
    else
    {
        cout<<"Result is "<<(float)a/b<<endl;
    }
}

int main()
{
    int a, b;
    cout<<"Enter any two number "<<endl;
    cin>>a>>b;
    try
    {
        divide(a, b);
    }
    catch(int e)
    {
        cerr<<"Divide by zero is not possible b = "<<e<<endl;
    }
}

