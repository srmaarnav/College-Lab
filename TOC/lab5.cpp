// DFA accepting odd 0’s and odd 1’s
#include<stdio.h>
#include<conio.h>
#define EOS '\0'
int main(){
    char c, input[100];
    int i = 0, q = 0;
    printf("Enter a string: ");
    scanf("%s", input);
    c = input[i];
    printf("\n");
    printf("%s",input);
    while(c != EOS)
    {
        if (q == 0 && c == '0')
        {
            q = 1;
        }
        else if (q == 0 && c == '1')
        {
            q = 2;
        }
        else if (q == 2 && c == '0')
        {
            q = 3;
        }
        else if (q == 1 && c == '1')
        {
            q = 3;
        }
        else if (q == 1 && c == '0')
        {
            q = 0;
        }
        else if (q == 2 && c == '1')
        {
            q = 0;
        }
        else if (q == 3 && c == '0')
        {
            q = 2;
        }
        else if (q == 3 && c == '1')
        {
            q = 1;
        }
        else
        {
            q == 4;
            break;
        }
        i++;
        c = input[i];
    }
    if (q == 3)
    {
        printf("accepted");
    }
    else
    {
        printf("rejected");
    }
    printf("\n");
    return 0;
}
