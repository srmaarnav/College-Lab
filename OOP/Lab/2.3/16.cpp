/*Write a program to display the integer, float and character using 
overloaded display function.*/

#include<iostream>
using namespace std;

void disp(int a)
{
	cout<<endl<<a;
}
void disp(float a)
{
	cout<<endl<<endl<<a;
}
void disp(char a)
{
	cout<<endl<<endl<<a;
}
int main()
{
	int x=1;
	float y=1.1;
	char z = 'm';

		
	disp(x);
	disp(y);
	disp(z);
}

