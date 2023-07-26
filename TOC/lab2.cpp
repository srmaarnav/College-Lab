// DFA that accepts string consisting over alphabet {a, b} and ends in aba.
#include<stdio.h>
#include<conio.h>
#define EOS '\0'
int main(){
    char c, input[50];
    int i = 0, j = 0;
    printf("Enter the string\n");
    scanf("%s", &input);
    c = input[i];
    printf("\n");
    printf("%s",input);
    while (c != EOS)
    {
        if (j == 0 && c == 'a')
        {
            j = 1;
        }
        else if(j == 0 && c == 'b')
        {
            j = 0;
        }
        else if (j == 1 && c == 'a')
        {
            j = 1;
        }
        else if (j == 1 && c == 'b')
        {
            j = 2;
        }
        else if (j == 2 && c == 'a')
        {
            j = 3;
        }
        else if (j == 2 && c == 'b')
        {
            j = 0;
        }
        else if (j == 3 && c == 'a')
        {
            j = 1;
        }
        else if (j == 3 && c == 'b')
        {
            j = 0;
        }
        else
        {
            j == 4;
            break;
        }
        i++;
        c = input[i];
    }
    if (j == 3)
    {
        printf("\nThe input string is accepted\n");
    }
    else
    {
        printf("\nThe input string is not accepted\n");
    }
    return 0;
}
