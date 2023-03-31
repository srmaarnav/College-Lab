/*Write a program to ask the user for two numbers and print the sum, difference and 
product of those two numbers.*/

#include <iostream>
using namespace std;

int main()
{
	int a , b , sum , diff , prod;
	
	cout << "Enter two numbers : \n";
	cin >> a >> b;

	
	cout << "\nSum = " << a+b;
	cout << "\nDifference = " << a-b;
	cout << "\nProduct = " << a*b;
}

