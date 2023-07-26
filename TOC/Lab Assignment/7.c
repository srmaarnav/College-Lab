//LAB 7. Implement a C program for an NFA that recognizes the regular expression "a*|b+".

#include <stdio.h>
#include <string.h>

int main() {
    char str[100];
    int state = 0;
    int i = 0;
    int flag = 1;

    printf("Enter a string under the string {a,b}: ");
    fgets(str, sizeof(str), stdin);
    str[strcspn(str, "\n")] = '\0'; 
    while (str[i] != '\0') {
        switch (state) {
            case 0:
                if (str[i] == 'a')
                    state = 1;
                else if (str[i] == 'b')
                    state = 4;
                else
                    flag = 0;
                break;
            case 1:
                if (str[i] == 'a')

                    state = 1;
                else if (str[i] == 'b')
                    state = 2;
                else
                    flag = 0;  
                break;
            case 2:
                if (str[i] == 'a')
                    state = 3;
                else
                    flag = 0;  
                break;
            case 3:
                if (str[i] == 'a')
                    state = 3;
                else
                    flag = 0; 
                break;
            case 4:
                if (str[i] == 'b')
                    state = 4;
                else
                    flag = 0; 
                break;
        }

        if (!flag)
            break;

        i++;
    }
    if ((state == 1 || state == 4) && flag || (state == 0 && str[0] == '\0'))
        printf("String you entered i.e. %s is accepted!\n",str);
    else
        printf("String you entered i.e. %s is not accepted!\n",str);

    return 0;
}
