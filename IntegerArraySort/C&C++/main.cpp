#include<stdio.h>
#include "Sort.h"

int main(void){
    int arr[]={3,2,1,5,6,4,7,8,5,4,3,2,1,1,2,3,4,5};
    int length= sizeof(arr)/ sizeof(arr[0]);

//   bubbleSort(arr,length,0);
//    bubbleSort(arr,length,1);
//    insertSort(arr,length,0);
//    insertSort(arr,length,1);
//    selectionSort(arr,length,0);
//    selectionSort(arr,length,1);
	quickSort(arr, length,1);
    for(int i=0;i<length;i++)
        printf("%d ",arr[i]);

	return 0;

}
