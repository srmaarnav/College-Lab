//LAB 2. Implement a C program to construct a DFA that accepts strings consisting of alphabet {a, b} and ending with "aba".

#include<stdio.h>
#define EOS '\0'
int main()
{
    char c, inpstr[50];
    int i=0, q=0;
     printf("\nEnter the string under the alphabet {a,b}: ");
    scanf("%s", inpstr);
    c = inpstr[i];
    printf("\nThe string %s", inpstr);
    while (c != EOS) {
        if(q==0 && c=='a')
        q = 1;
        else if(q==0 && c=='b')
        q = 0;
        else if(q==1 && c=='a')
        q = 1;
        else if(q==1 && c=='b')
        q = 2;
        else if(q==2 && c=='a')
        q = 3;
        else if(q==2 && c=='b')
        q = 0;
        else if(q==3 && c=='a')
        q = 1;
        else if(q==3 && c=='b')
        q = 0;
        else{
            q = 4;
            break;
            }
            i++;
            c = inpstr[i];
    }
        if(q==3)
        printf(" is accepted!");
        else
        printf(" is not accepted!");
}
