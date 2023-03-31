/*Write a program to swap the private data members of two different classes 
using friend function.*/

#include<iostream>
using namespace std;
class B;
class A
{
  int a,b;
  friend void swap(A&,B&); 
  public:
  A()
  {
    a=1;
    b=2;
  }
  void display()
  {
	cout<<"a = "<<a<<endl;
    cout<<"b = "<<b<<endl;
  }
};
class B
{
    int c,d;
    friend void swap(A&,B&);
    public:
    B()
	{
    	c=3;
        d=4;
    }
    void display(){
    cout<<"c = "<<c<<endl;
    cout<<"d = "<<d<<endl;
  }
};
int main()
{
    A A1;
    B B1;
    cout<<"----------BEFORE SWAP-----------"<<endl;
    A1.display();
    B1.display();
    swap(A1,B1);
    cout<<"----------AFTER SWAP-----------"<<endl;
    A1.display();
    B1.display();
    return 0;
}
void swap(A &obj1,B &obj2)
{
    int temp[2];
    temp[0]=obj1.a;
    temp[1]=obj1.b;
    obj1.a=obj2.c;
    obj1.b=obj2.d;
    obj2.c=temp[0];
    obj2.d=temp[1];
}
