//C program for simulating FIFO page replacement program.

/*
Algorithm
1. Start the process
2. Declare the size with respect to page length
3. Check the need of replacement from the page to memory
4. Check the need of replacement from old page to new page in memory
5, Form a queue to hold all pages
6. Insert the page require memory into the queue
7. Check for bad replacement and page fault
8. Get the number of processes to be inserted
9. Display the values
10. Stop the process
*/

#include<stdio.h>
#include<stdio.h>
#include<conio.h>
int main()
{
    int i, j, n, a[50], frame[10], no, k, avail, count = 0;
    printf("Enter the number of pages \n");
    scanf("%d",&n);
    printf("Enter the page number \n");
    for (i = 1; i <= n; i++)
    {
        scanf("%d",&a[i]);
    }
    printf("Enter the number of frames \n");
    scanf("%d",&no);
    for (i = 0; i < no; i++)
    {
        frame[i] = -1;
    }
    j = 0;
    printf("ref string \t page frames \n");
    for (i = 1; i <= n; i++)
    {
        printf("%d\t\t", a[i]);
        avail = 0;
        for (k = 0; k < no; k++)
        {
            if (frame[k] == a[i])
            {
                avail = 1;
            }
        
        }
        if (avail == 0)
        {
            frame[j] = a[i];
            j = (j+1)%no;
            count++;
            for (k = 0; k < no; k++)
            {
                printf("%d\t", frame[k]);
            }
        }
        printf("\n");
    }
    printf("Page Fault is %d", count);
    return 0;
}
