// WAP to implement Lexical Analyzer to identify tokens.

#include <stdio.h>
#include <ctype.h>
#include <string.h>

// Function to check if a character is a valid identifier character
int isIdentifierChar(char ch) {
    return isalnum(ch) || ch == '_';
}

// Function to check if a character is a valid operator character
int isOperatorChar(char ch) {
    return strchr("+-*/=", ch) != NULL;
}

// Function to tokenize the input string
void tokenize(char* input) {
    int len = strlen(input);
    int i = 0;

    while (i < len) {
        // Skip whitespace characters
        if (isspace(input[i])) {
            i++;
            continue;
        }

        // Check if the current character is an identifier
        if (isalpha(input[i]) || input[i] == '_') {
            int j = i + 1;
            while (j < len && isIdentifierChar(input[j])) {
                j++;
            }
            printf("Identifier: %.*s\n", j - i, &input[i]);
            i = j;
            continue;
        }

        // Check if the current character is an operator
        if (isOperatorChar(input[i])) {
            printf("Operator: %c\n", input[i]);
            i++;
            continue;
        }

        // Check if the current character is a number
        if (isdigit(input[i])) {
            int j = i + 1;
            while (j < len && isdigit(input[j])) {
                j++;
            }
            printf("Number: %.*s\n", j - i, &input[i]);
            i = j;
            continue;
        }

        // If none of the above, it's an invalid character
        printf("Invalid character: %c\n", input[i]);
        i++;
    }
}

int main() {
    char input[100];

    printf("Enter input string: ");
    fgets(input, sizeof(input), stdin);

    tokenize(input);

    return 0;
}