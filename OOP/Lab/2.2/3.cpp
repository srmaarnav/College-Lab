/*Write a program that reads weight and height of boys in a class and 
then count the number of boys whose weight is less than 50 kg and height 
is greater than 170 cm.*/

#include<iostream>
using namespace std;

int main()
{
	int i , n , w , h , c=0;
	
	cout << "Enter the number of boys in the class : ";
	cin >> n;
	
	for(i=0;i<n;i++)
	{
		cout << "\nEnter the weight and height of boy no. " << i+1 << endl;
		cin >> w >> h;
		
		if((w<=50)&&(h>170))
			c++;	
	}	
	
	cout << "\nThe number of students whose weight is less than 50 kg and height is greater than 170 cm is "<<c;
}

