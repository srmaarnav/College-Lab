/*Create a class Employee with data members name, age and salary and member functions getdata( ) and putdata( ). Use this class to read and 
display the details of a manager, 3 foreman and 5 workers.*/

#include<iostream>
using namespace std;
class Employee
{
    string name;
    int age, salary;
    public:
    void getdata()
    {
        cout<<"Enter the data of employee name, age & salary"<<endl;
        cin>>name>>age>>salary;
        cout<<endl;
    }
    void putdata()
    {
        cout<<"Name"<<name<<endl;
        cout<<"Age:"<<age<<endl;
        cout<<"salary"<<salary<<endl;
        cout<<endl;
    }

};
int main()
{
    Employee a1, a2, a3;
    a1.getdata();
    a2.getdata();
    a3.getdata();
    a1.putdata();
    a2.putdata();
    a3.putdata();
} 

