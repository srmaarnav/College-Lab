//LAB 8. Create a C program that recognizes the context-free language {a^n b^n | n >= 0}.

#include <stdio.h>

int main() {
    char str[100];
    int i = 0;
    int count = 0;
    int flag = 1;

    printf("Enter a string of your choice to be check: ");
    scanf("%s", str);

    // Count the number of consecutive 'a' characters
    while (str[i] == 'a') {
        count++;
        i++;
    }

    // Check if the remaining characters are consecutive 'b' characters
    while (str[i] == 'b') {
        count--;
        i++;
    }

    // Check if all 'a' characters are followed by the same number of 'b' characters
    if (count != 0 || str[i] != '\0')
        flag = 0;

    // Check the validity and print the result
    if (flag)
        printf("String %s has been recognized under the CFL {a^nb^n|n>=0}.\n");
    else
        printf("String %s hasnot been recognized under the CFL {a^nb^n|n>=0}.\n");

    return 0;
}
