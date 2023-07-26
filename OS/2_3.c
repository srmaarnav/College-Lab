#include<stdio.h>
#include<unistd.h> /*contains fork prototype*/
void main(void)
{
	printf("Here I am just before first forking statement \n");
	fork();
	printf("Here I am after first forking statement\n");
	fork();
	printf("Here I am after second forking statement\n");
	printf("\tHello World from process %d !\n",getpid());
}