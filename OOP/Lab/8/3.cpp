/*Write a C++ program to illustrate the opening, writing and reading  and closing of  binary file.*/

#include<iostream>
#include<fstream>
#include<cstring>
using namespace std;

int main()
{
    string name;
    int age;
    float salary;

    ofstream outfile("3.dat", ios::binary);
    cout<<"Enter the name: ";
    cin>>name;
    cout<<"Enter the age: ";
    cin>>age;
    cout<<"Enter the salary: ";
    cin>>salary;

    outfile.write((char*)&name, sizeof(name));
    outfile.write((char*)&age, sizeof(age));
    outfile.write((char*)&salary, sizeof(salary));
    outfile.close();


    ifstream infile("3.dat", ios::binary);
    infile.read((char*)&name, sizeof(name));
    infile.read((char*)&age, sizeof(age));
    infile.read((char*)&salary, sizeof(salary));
    
    cout<<endl;
    cout<<endl;
    cout<<"-----Data from file-----"<<endl;
    cout<<"Name: "<<name<<endl;
    cout<<"Age: "<<age<<endl;
    cout<<"Salary: "<<salary<<endl;
    
    infile.close();
    return 0;
}

