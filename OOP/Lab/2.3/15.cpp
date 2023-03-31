/*Write a program to find the minimum value among the inputs given. Your 
program should contain two functions with  signature int min (int, int) 
and int min (int , int, int) i.e., the first function takes 2 arguments and 
second function takes three arguments and both returns minimum.. Use the 
concept of function overloading.*/

#include<iostream>
using namespace std;

int min(int a, int b)
{
	if(a<b)
		return a;
	else
		return b;
}
int min(int a, int b, int c)
{
	if((a<b)&&(a<c))
		return a;
	if((b<a)&&(b<c))
		return b;
	if((c<b)&&(c<a))
		return c;
}
int main()
{
	int x, y , z;
	
	cout<<"Enter three numbers x, y and z :"<<endl;
	cin>>x>>y>>z;
	
	cout<<endl<<"The smallest number between x and y is "<<min(x,y);
	
	cout<<endl<<"The smallest number between x , y and z is "<<min(x,y,z);	
}

