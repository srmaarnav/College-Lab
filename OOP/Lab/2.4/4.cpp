/*Write a program to find the sum and average of all the elements of an array by passing through function using pointer.*/

#include<iostream>
using namespace std;
double Average(int *arr, int size);

int main ()
{
	int i, n;
    double avg;
	cout<<"Enter The Size Of Array :";
	cin>>n;
	int average[n];
	cout<<endl<<"Enter The Array Elements :"<<endl; 
	
	for(i=0; i<n; i++)
	{
	cin>>average[i];
	}
	
	cout << endl<<"Average Value of An Array Is: " << Average(average , n)<< endl;
	return 0;
}

double Average(int *arr, int size)
{
	int i, sum = 0;
	double avg;
	
	for (i = 0; i < size; ++i)
	{
		sum += arr[i];
    }
	
	avg = double(sum) / size;
	
	return avg;
}
