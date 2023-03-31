/*Write a program to find the sum  and Average of the array elements. Note:  use the malloc( ) function to dynamically allocate the memory for array elements.*/

#include <stdio.h>
#include<stdlib.h>

int main()
{
    int* ptr; 
    int limit;
    int i; 
    int sum , avg;

    printf("Enter limit of the array: ");
    scanf("%d", &limit);

    ptr = (int*)malloc(limit * sizeof(int));
    for (i = 0; i < limit; i++) {
        printf("Enter element %02d: ", i + 1);
        scanf("%d", (ptr + i));
    }


    sum = 0;
    for (i = 0; i < limit; i++) {
        sum += *(ptr + i);
        avg = sum/limit;
    }
    printf("\nSum of array elements is: %d and its average is %d", sum,avg);

    free(ptr);
    return 0;
}
