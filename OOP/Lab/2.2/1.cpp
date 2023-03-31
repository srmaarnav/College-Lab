/* Write a program that reads the two numbers and one arithmetic operator and perform the respective operation. (use switch case statement)
*/

#include<iostream>
using namespace std;

int main()
{
	char c;
	float x,y;
	
	cout << "Enter any arithemetic operators : ";
	cin >> c;
	
	cout <<"Enter two numbers x and y:\n";
	cin >> x >> y;
	
	switch(c)
	{
		case '+':
			cout << "\nx + y = " <<x+y;
			break;
		case '-':
			cout << "\nx - y = " <<x-y;
			break;
		case '*':
			cout << "\nx * y = " <<x*y;
			break;
		case '/':
			cout << "\nx / y = " <<x/y;
			break;
		default:
			cout << "\nInvalid Operator.";
			break;
		return 0;
	}
}
