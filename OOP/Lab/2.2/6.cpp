/*Write a program to take a number from the user 
and then count the number of digits in that number.*/

#include<iostream>
using namespace std;

int main()
{
	int c=0;
	long long num;
	
	cout << "Enter any number : ";
	cin >> num;
	
	do{
		num/=10;
		++c;
	}while(num != 0);
  
	cout << "The number of digit in the entered number is "<< c;
}

