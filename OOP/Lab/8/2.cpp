/*Write a C++ program to illustrate the opening, writing and reading  and closing of  file.*/

#include<iostream>
#include<fstream>
using namespace std;

int main()
{
    string name, email;
    
    ofstream outfile;
    outfile.open("2.doc");
    cout<<"Enter the name: ";
    cin>>name;
    cout<<"Enter the email: ";
    cin>>email;

    outfile<<name<<endl;
    outfile<<email<<endl;
    cout<<"Done"<<endl;

    outfile.close();


    ifstream infile;
    infile.open("2.doc");

    infile>>name;
    infile>>email;
    cout<<endl;
    cout<<endl;
    cout<<"----Data from file----"<<endl;
    cout<<"Name: "<<name<<endl;
    cout<<"Email: "<<email<<endl;

    infile.close();
    return 0;
}

