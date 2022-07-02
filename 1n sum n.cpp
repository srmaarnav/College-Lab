/* Write a program to find the sum of the series following series and display the result. 1+1/2+1/3 + …….1/n. Take the value of n from the user.
*/

#include <stdio.h> 
int main()
{ 
   int n; 
   float sum=0, n1, n2; 
   
   printf("\nEnter the value of n for the series 1+1/2+1/3 +...1/n :\n "); 
   scanf ("%d", &n);
    
   for(n2=1;n2<=n;n2++) 
   { 
      n1=1/n2; 
      sum = sum + n1; 
    } 
    printf("\nThe sum of series 1 + 1/2 ... + l/%d = %g",n,sum); 
    
 }

