#include <stdio.h>
#include "Sort.h"

/**
 * 冒泡排序
 * 时间复杂度(平均)        :   O(n²)
 * 时间复杂度(最好)        :   O(n)
 * 时间复杂度(最坏)        :   O(n²)
 * 空间复杂度              :   O(1)
 * 稳定性:                 :   稳定
 * @param arr       :   标记数组首地址的指针
 * @param length    :   数组长度
 * @param type      :   排序类型
 * @param state     :   若数组不再发生变化,则表示已经排序成功,停止排序
 *                      为0从小到大
 *                      非0从大到小
 */
void bubbleSort(int *arr, int length, int type) {
	if (length < 2)
		return;
	
    int state = 1;//标记状态,若数组没有发生变化,则停止排序
	for (int i = 0; i < length - 1; i++){
		for (int j = 0; j < length - i - 1; j++){
			if (type ? arr[j] < arr[j + 1] : arr[j] > arr[j + 1]) {
				arr[j] = arr[j] ^ arr[j + 1];
				arr[j + 1] = arr[j] ^ arr[j + 1];
				arr[j] = arr[j] ^ arr[j + 1];
				state = 0;
			}
		}
		if (state==1) {
            break;
        }
	}
}

/**
 * 插入排序(未设置监视哨)
 * 时间复杂度(平均)        :   O(n²)
 * 时间复杂度(最好)        :   O(n)
 * 时间复杂度(最坏)        :   O(n²)
 * 空间复杂度              :   O(1)
 * 稳定性:                 :   稳定
 * @param arr       :   标记数组首地址的指针
 * @param length    :   数组长度
 * @param type      :   排序类型
 *                      为0从小到大
 *                      非0从大到小
 */
void insertionSort(int *arr, int length, int type = 1) {
	for (int i = 1; i < length; i++) {
		int temp = arr[i], j;
		for (j = i - 1; j >= 0 && type ? arr[j] < temp : arr[j] > temp; j--){
			arr[j + 1] = arr[j];
		}
		arr[j + 1] = temp;
	}
}

/**
 * 选择排序
 * 时间复杂度(平均)        :   O(n²)
 * 时间复杂度(最好)        :   O(n²)
 * 时间复杂度(最坏)        :   O(n²)
 * 空间复杂度              :   O(1)
 * 稳定性:                 :   不稳定
 * @param arr       :   标记数组首地址的指针
 * @param length    :   数组长度
 * @param type      :   排序类型
 * @param temp      :   最小值的下标
 * @param extreme   :   标记极值,极大值,极小值
 *                      为0从小到大
 *                      非0从大到小
 */
void selectionSort(int *arr, int length, int type) {
	if (length < 2)
		return;
	for (int i = 0; i < length - 1; i++) {
		int extreme = arr[i], cursor = i;
		for (int j = i + 1; j < length; j++)
			if (type ? arr[j] > extreme : arr[j] < extreme) {
				extreme = arr[j];
				cursor = j;
			}
		arr[cursor] = arr[i];
		arr[i] = extreme;
	}
}

/**
 * 快速排序(对冒泡排序的一种改进)
 * 时间复杂度(平均)        :   O(nlog2n)
 * 时间复杂度(最好)        :   O(nlog2n)
 * 时间复杂度(最坏)        :   O(n²)
 * 空间复杂度              :   O(1)
 * 稳定性:                 :   不稳定
 * @param arr       :   标记数组首地址的指针
 * @param length    :   数组长度
 * @param type      :   排序类型
 * @patem key		:	关键数据(进行比较的数字)
 *                      为0从小到大
 *                      非0从大到小
 */
void quickSort(int *arr, int length, int type) {
	int i = 0, j = length - 1, key = arr[0];
	if (length > 1) {
		while (i != j) {
			for (; i < j; j--)
				if (type ? arr[j] > key:arr[j] < key) {
					arr[i] = arr[j];
					break;
				}
			for (; i < j; i++)
				if (type ? arr[i] < key : arr[i] > key) {
					arr[j] = arr[i];
					break;
				}
			arr[i] = key;
		}
		quickSort(arr, i, type);
		quickSort(arr + i + 1, length - i - 1, type);
	}
}