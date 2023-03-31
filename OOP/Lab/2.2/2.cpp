/*Write a program that will ask for the
 roll number and marks obtained by a student in seven 
 different subjects and display the percentage score of that student.
*/

#include<iostream>
using namespace std;

int main()
{
	int a , b , sum=0 , i;
	float percent;
	
	cout << "Enter the Roll Number: ";
	cin >> a;
	
	cout << "\nEnter the marks of students in the seven subjects :\n";
	
	for(i=0;i<7;i++)
	{
		cin >> b;
		sum = sum+b;
	}
	
	percent = sum/7;

	cout << "\nThe percentage obtained by student number " << a <<" is " << percent;
}


