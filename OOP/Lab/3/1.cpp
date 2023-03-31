/*Write a object oriented program to read two numbers from the keyboard and display the larger value on the screen.
*/
#include <iostream>
using namespace std;
class num
{
	int a,b;
	public:
		void input()
		{
			cout<<"Enter any two numbers :"<<endl;
			cin>>a>>b;
		}
		int large()
		{
			if(a>b)
				return a;
			else
				return b;
		}
};
int main()
{
	int c;
	num a1;
	
	a1.input();
	
	c=a1.large();
	
	cout<<endl<<"The largest number is "<<c;
}
