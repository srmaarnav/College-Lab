//  DFA not start with 01.
#include<stdio.h>
#include<conio.h>
#define EOS '\0'
int main(){
    char c, input[50];
    int i = 0, q = 0;
    printf("Enter the input\n");
    scanf("%s",input);
    c = input[i];
    printf("\n");
    while (c != EOS)
    {
        if (q == 0 && c == '0')
        {
            q = 1;
        }
        else if (q == 0 && c == '1')
        {
            q = 3;
        }
        else if (q == 1 && c == '0')
        {
            q = 3;
        }
        else if (q == 1 && c == '1')
        {
            q = 2;
        }
        else if (q == 2 && c == '0')
        {
            q = 2;
        }
        else if (q == 2 && c == '1')
        {
            q = 2;
        }
        else if (q == 3 && c == '0')
        {
            q = 3;
        }
        else if (q == 3 && c == '1')
        {
            q = 3;
        }
        else
        {
            q == 4;
            break;
        }
        i++;
        c = input[i];
    }
    if (q == 1 || q ==3)
    {
        printf("The string is accepted");
    }
    else
    {
        printf("The string is not accepted");
    }
    return 0;
}
