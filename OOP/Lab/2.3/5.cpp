/*Write a function prime( ) that returns 1 if its argument is a prime number 
and returns zero otherwise.*/

#include<iostream>
using namespace std;
int prime(int n)
{
    int r=0;
    for (int i = 1; i <= n; i++)
    {
        if (n%i == 0)
        {
            r++;
        }
    }
    if (r == 2)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}
int main(){
    int a;
    cout<<"Enter the number ";
    cin>>a;
    cout<<prime(a);
    cout<<endl;
    cout<<"1 = prime number      0 = not prime number";
}
