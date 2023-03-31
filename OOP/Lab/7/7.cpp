/*Write a program to read different value of a variable such as o, 1,  -1, etc . Throw and catch the different types of exceptions depend on the value of a variable such as if 0 then throw integer exception, if 1 throw character exception and so on ( note: use multiple catch blocks).*/

#include<iostream>
using namespace std;

void num(int a)
{
    if(a==1)
    {
        throw "a";
    }
    else if (a==0)
    {
        throw a;
    }
    else if (a==-1)
    {
        throw 5.5;
    }
    else
    {
        cout<<"The input is invalid "<<endl;
    }
}

int main()
{
    int a;
    cout<<"Enter -1, 0 or 1 "<<endl;
    cin>>a;
    try
    {
        num(a);
    }
    catch(char const* e)
    {
        cout<<"The character is "<<e<<endl;
    }
    catch(int e)
    {
        cout<<"The integer is "<<e<<endl;
    }
    catch(double e)
    {
        cout<<"The double is "<<e<<endl;
    }
}

