/*Write a program to find the sum and average of all the elements of an array using pointer.*/

#include<iostream>
using namespace std;
int main()
{
    float x[5], sum=0.0, avg;
    int i;
    float *px, *psum, *pavg;

    px = &x[0];
    psum = &sum;
	pavg = &avg;

    cout<<"Enter array Elements: "<<endl;
    for (i=0;i<5;i++)
    {
        scanf("%f",(x+i));
        *psum += *(x + i);
    }

    *pavg = *psum / 5;
    cout<<"Sum= "<<*psum<<endl<<"Average= "<<*pavg;

    return 0;
}

