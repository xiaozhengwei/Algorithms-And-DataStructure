#include <stdio.h>
#include "Sort.h"

/**
 * 冒泡排序
 * @param arr       :   数组
 * @param length    :   数组长度
 * @param type      :   排序类型
 *                      为0从小到大
 *                      非0从大到小
 */

bool bubblesort(int *arr, int length, int type) {
    if (length < 2)
        return false;
    for (int i = 0; i < length - 1; i++)
        for (int j = 0; j < length - i - 1; j++)
            if (type ? arr[j] < arr[j + 1] : arr[j] > arr[j + 1]) {
                arr[j] = arr[j] ^ arr[j + 1];
                arr[j + 1] = arr[j] ^ arr[j + 1];
                arr[j] = arr[j] ^ arr[j + 1];
            }
    return true;
}