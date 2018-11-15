#include<stdio.h>
#include "Sort.h"
int main(void){
    int arr[]={1,2,4,5,6,4,7,8,5};
    int length= sizeof(arr)/ sizeof(arr[0]);
    insertsort(arr,length,0);
    for(int i=0;i<length;i++)
        printf("%d ",arr[i]);
}

