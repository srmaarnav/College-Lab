/*Write a program to  convert object from a class that represents 
weight of gold in Nepal tola, to object of a class that represents 
international gold measurement of weight in gram scale( 1 tola = 
11.664 gram) */

#include<iostream>
using namespace std;

class tola
{
	int t;
	
	public:
		tola(int d)
		{
			t = d;
		}
		int getdata()
		{
			return t;
		 } 
};

class gram
{
	int g;
	
	public:
		gram()
		{
			g = 0;
		}
		gram(tola to)
		{
			int gm;
			gm = to.getdata();
			
			g = gm*11.664;
		}
		void display()
		{
			cout<<"Gram : "<<g;
		}
};

int main()
{
	tola c(100);
	gram f = c;
	
	f.display();
}



