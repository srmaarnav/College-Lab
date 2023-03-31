/*Write a program to illustrate the random access of file.*/

#include<iostream>
#include<fstream>
using namespace std;

class student
{
    string name;
    int roll;
    public:
    void read_data()
    {
        cout<<"Enter name: ";
        cin>>name;
        cout<<"Enter roll no.: ";
        cin>>roll;
    }
    void show_data()
    {
        cout<<"Name: "<<name<<endl;
        cout<<"Roll no.: "<<roll<<endl;
    }
};

void write_file()
{
    student s;
    ofstream outfile("6.dat", ios::binary|ios::app);
    s.read_data();
    outfile.write((char*)&s, sizeof(s));
}

void read_file()
{
    student s;
    cout<<endl;
    cout<<endl;
    cout<<"----Data from file----"<<endl;
    ifstream infile("6.dat", ios::binary);
    while(!infile.eof())
    {
        if(infile.read((char*)&s, sizeof(s)> 0))
            s.show_data();
    }
}

void read_one_rec_data()
{
    student s;
    int n;
    ifstream infile("class_data.dat", ios::binary);
    cout<<endl;
    cout<<"Enter the record no.: ";
    cin>>n;
    infile.seekg((n-1)*sizeof(s));
    infile.read((char*)&s, sizeof(s));
    s.show_data();
}

int main()
{
    int choice;
    cout<<"Student record system "<<endl;
    cout<<"Select one option below:"<<endl;
    cout<<"1 to write record to file"<<endl;
    cout<<"2 to read record to file"<<endl;
    cout<<"3 to read one record data"<<endl;
    cout<<"4 to exit"<<endl;
    
    while (true)
    {
        cout<<endl;
        cout<<"Enter your choice: ";
        cin>>choice;
        switch (choice)
        {
            case 1:
                write_file();
                break;
            case 2:
                read_file();
                break;
            case 3:
                read_one_rec_data();
                break;
            case 4:
                exit(0);
                break;
            default:
                cout<<"Enter correct  option";
                break;
        }
    }
    return 0;
}
