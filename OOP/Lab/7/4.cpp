/*Write function template for finding the minimum value contained in an array.*/

#include<iostream>
using namespace std;

template<class T>
T maxx(T a[], int n)
{
    T max = a[0];
    for (int i = 0; i < n; i++)
    {
        if(max>a[i])
        {
            max =  a[i];
        }
    }
    return max;
}

int main()
{
    int n, x[100];
    cout<<"Enter the size of array "<<endl;
    cin>>n;
    cout<<"Enter the element of array "<<endl;
    for (int i = 0; i < n; i++)
    {
        cin>>x[i];
    }
    cout<<"The minimum number is "<<maxx(x,n)<<endl;
}

