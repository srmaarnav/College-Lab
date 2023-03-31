/*Write a program to find the simple interest using inline function.*/

#include<iostream>
using namespace std;

inline int si(int p, int t , int r)
{
	return(p*t*r/100);
}
int main()
{
	int p,t,r;
	
	cout<<"Enter the principle, rate of interest and time :"<<endl;
	cin>>p>>t>>r;
	
	cout<<"The simple interest is "<<si(p,t,r);
}

