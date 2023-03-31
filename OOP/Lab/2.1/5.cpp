/*Write a program that identifies largest of three input numbers.
*/

#include<iostream>
using namespace std;

int main()
{
	int a , b , c;
	
	cout << "Enter any three numbers : \n";
	cin >> a >> b >> c;
	
	if((a>b) && (a>c))
		cout << "\nThe largest number is " << a;
		
	if((b>a) && (b>c))
		cout << "\nThe largest number is " << b;
		
	if((c>a) && (c>b))
		cout << "\nThe largest number is " << c;
}
