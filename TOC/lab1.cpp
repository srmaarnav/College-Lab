// DFA that ends with string aba
#include<stdio.h>
#include<conio.h>
#define EOS '\0'
int main(){
    char c, input[50];
    int i = 0, q = 0;
    printf("Enter the string\n");
    scanf("%s",input);
    c = input[i];
    printf("%s",input);
    while (c != EOS)
    {
        if (q == 0 && c == 'a')
        {
            q = 1;
        }
        else if (q == 0 && c == 'b')
        {
            q = 0;
        }
        else if (q == 1 && c == 'a')
        {
            q = 1;
        }
        else if (q == 1 && c == 'b')
        {
            q = 2;
        }
        else if (q == 2 && c == 'a')
        {
            q = 3;
        }
        else if (q == 2 && c == 'b')
        {
            q = 0;
        }
        else if (q == 3 && c == 'a')
        {
            q = 1;
        }
        else if (q == 3 && c == 'b')
        {
            q =0;
        }
        else
        {
            q == 4;
            break;
        }
        i++;
        c = input[i];
    }
    if (q =+ 3)
    {
        printf("String is accepted");
    }
    else
    {
        printf("String is not accepted");
    }
    printf("\n");
    return 0;
}

