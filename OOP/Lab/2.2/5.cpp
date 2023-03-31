/*Write a program to find the sum of square of first n natural numbers.
*/

#include<iostream>
using namespace std;

int main()
{
	int n , sum=0 ,i;
	
	cout << "Enter any number : ";
	cin >> n;
	
	for(i=1;i<=n;i++)
	{
		sum += i*i;
	}
	cout << "The sum of square of first "<<n<<" natural numbers is "<< sum;
}
