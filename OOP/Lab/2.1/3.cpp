/* Write a program to calculate the simple interest from the values of 
principle, time and rate of interest input from the user. [Hint: I=PTR/100]
*/

#include<iostream>
using namespace std;

int main()
{
	int si , p , t , r;
	
	cout << "Enter the principle : ";
	cin >> p;
	
	cout << "Enter the time : ";
	cin >> t;
	
	cout << "Enter the rate of interest : ";
	cin >> r;
	
	si = p*t*r/100;
	
	cout << "The simple interest is " << si;	
}
