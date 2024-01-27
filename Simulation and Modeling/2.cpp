//monte carlo

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
    int i, j, n, h, t;
    double x;
    srand(time(NULL)); // seed random number generator
    
    // ask user for number of iterations
    printf("Enter number of iterations: ");
    scanf("%d", &n);
    
    // perform simulation
    t = h = 0;
    for (i = 0; i < n; i++) {
        h = 0;
        for (j = 0; j < 10; j++) {
            x = (double)rand() / RAND_MAX;
            if (x < 0.5) {
                printf("H ");
                h++;
            } else {
                printf("T ");
            }
        }
        printf("\n");
        if (h == 3 || h == 6 || h == 9) {
            t++;
        }
    }
    
    // calculate probability and display result
    double p = (double)t / n;
    printf("\nProbability of getting 3, 6, or 9 heads in 10 coin flips: %f\n", p);
    
    return 0;
}

