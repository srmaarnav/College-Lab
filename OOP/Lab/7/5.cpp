/*Write a program to read two numbers from the user then divide first number by second number only if second number is not zero. If second number is zero then throw divide by zero exception and handle it.*/

#include<iostream>
using namespace std;

int main()
{
    int a, b;
    cout<<"Enter any two number "<<endl;
    cin>>a>>b;
    try
    {
        if(b==0)
        {
            throw b;
        }
        else
        {
            cout<<"Result is "<<(float)a/b<<endl;
        }
    }
    catch(int e)
    {
        cout<<"Divide by zero is not possible b = "<<e<<endl;
    }
}

