/*Write a program which has three user-defined functions named readData( ), processData( ), 
and displayData(). Use readData( ) function to read the two fractional numbers from keyboard, 
processData( ) to sum these numbers and displayData()  to display the sum*/

#include<iostream>
using namespace std;
float processData(float a, float b);
float displayData(float a);
float readData()
{
	float a , b;
	
	cout<<"Enter any two fractional numbers : "<<endl;
	cin>>a>>b;
	
	processData(a,b);
}
float processData(float a, float b)
{
	float sum;
	sum=a+b;
	displayData(sum);
	
}
float displayData(float a)
{
	cout<<endl<<"The sum of numbers is "<<a;
}
int main()
{	
	readData();
}
