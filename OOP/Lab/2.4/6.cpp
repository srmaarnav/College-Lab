/*WAP that contains the function larger that receives the pointer of two variables and decides the largest of two.*/

#include<iostream>
using namespace std;

int largest(int *p , int * ptr)
{
	if((*p)>*ptr)
		return *p;
	else
		return *ptr;
}
int main()
{
	int a,b;
	cout<<"Enter any numbers :"<<endl;
	cin>>a>>b;
	
	cout<<"The largest number is "<<largest(&a,&b);
}
