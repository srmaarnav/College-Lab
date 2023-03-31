/*Write a program to calculate area and perimeter of  a circle .
[ Hint area= PI*r*r and perimeter= 2*PI*r].
*/

#include<iostream>
#define PI 3.14
using namespace std;

int main()
{
	float r , area , perimeter;
	
	cout << "Enter the radius : ";
	cin >> r;
	
	area = PI * r * r ;
	perimeter = 2 * PI * r;
	
	cout << "\nThe area of circle is " << area << "\nThe perimeter of circle is " << perimeter;	
}
