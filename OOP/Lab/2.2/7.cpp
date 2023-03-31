/*Write a program to find the sum of digits of a number entered by the user.
*/

#include <iostream>
using namespace std;

int main()
{
	int n, t, sum = 0, rem;
	
	cout << "Enter any number : ";
	cin >> n;
	
	t=n;
	while (t != 0)
	{
		rem = t % 10;
		sum       = sum + rem;
		t         = t / 10;
   }

   cout <<"The sum of digits of "<<n<<" is "<<sum;

   return 0;
}
