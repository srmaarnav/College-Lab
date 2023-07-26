//LAB 5. Implement a C program for a DFA that accepts strings with an odd number of "0"s and an odd number of "1"s.

#include<stdio.h>
#define EOS '\0'
int main(){
    char c, inpstr[50];
    int i=0, q=0;
    printf("Enter String of you choice under the alphabet {0,1}: ");
    scanf("%s", inpstr);
    c = inpstr[i];
    printf("\n The string you entered i.e %s", inpstr);
    while (c != EOS) {
        if(q==0 && c=='0')
        q =1;
        else if(q==0 && c=='1')
        q = 2;
        else if(q==1 && c=='0')
        q = 0;
        else if(q==1 && c=='1')
        q = 3;
        else if(q==2 && c=='0')
        q = 3;
        else if(q==2 && c=='1')
        q = 0;
        else if(q==3 && c=='0')
        q = 2;
        else if(q==3 && c=='1')
        q = 1;
        else{
            q = 4;
            break;
            }
            i++;
            c = inpstr[i];
            }
            if(q==3)
            printf(" is accepted.");
            else
            printf(" is not accepted.");
            return 0;
}
