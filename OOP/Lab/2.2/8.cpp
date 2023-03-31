/*Write a program to check whether a number entered by the user 
is Armstrong number [e.g., 153 =13+53+33] or not.*/

#include<iostream>
using namespace std;

int main()
{
	int n, t, result = 0, rem;
	
	cout << "Enter any number : ";
	cin >> n;
	
	t=n;
	

    while (t != 0) 
	{
	    rem = t % 10;
        
        result += rem * rem * rem;
        t /= 10;
    }

    if (result == n)
        cout << n << " is an Armstrong number.";
    else
        cout << n << " is not an Armstrong number.";

    return 0;
}


