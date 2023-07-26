//LAB 6. Develop a C program for an NFA that accepts all strings over � = {0, 1} starting with "01".

#include <stdio.h>
#include <conio.h>
int main(){ 
    enum states {q0, q1, qf}; 
    char input[20];
    enum states curr_state=q0;
    int i=0;
    int flag=0;
    printf("Enter the string under the alphabet {0,1}: ");
    scanf("%s",input);
    char ch=input[i];
    while(ch!='\0'){
        switch(curr_state)
            { 
                case q0:
                    if(ch=='0')
                        curr_state=q1;
                    else
                        flag=1;
                        break;
                case q1:
                    if(ch=='1')
                    curr_state=qf;
                    else
                    flag=1;
                    break;
                case qf:
                    if(ch=='0'|| ch=='1')
                    curr_state=qf;
                    break;
                    }
                if(flag)
                    break;
                    ch=input[++i];
                }
            if(curr_state==qf)
            printf(" The string %s is accepted.",input);
            else 
            printf("\n The string %s is not accepted.",input);
            return 0;
}
