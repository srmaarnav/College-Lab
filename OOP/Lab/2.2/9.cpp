/*Write a program to reverse the number entered by the user.*/

#include<iostream>
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
		sum       = sum*10 + rem;
		t         = t / 10;
   }

   cout <<"The reverse of "<<n<<" is "<<sum;

   return 0;
}
