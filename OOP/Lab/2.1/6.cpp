/*Write a program to identifies user inputted number whether it is odd or even.
*/

#include<iostream>
using namespace std;

int main()
{
	int a , b ;
	
	cout << "Enter any number : \n";
	cin >> a ;
	
	if ((a%2) ==0)
		cout << "The entered number is even.";
	
	else
		cout << "The entered number is odd.";
}
