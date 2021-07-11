#include<stdio.h>

int arr[] = {37,29,14,10,14};
int length = 5;

void bubbleSort(){
	for(int i = 0; i < length; i++){
		bool swapped = false;		
		for(int j = 0; j < length-i-1; j++){
			if(arr[j] > arr[j+1]){
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				swapped = true;
			}
		}
		if(swapped == false) break;
	}
}

void selectionSort(){
	for(int i = 0; i < length; i++){
		int min = i;
		for(int j = i+1; j < length; j++){
			if(arr[j] <  arr[min]){
				min = j;
			}
		}
		int temp = arr[min];
		arr[min] = arr[i];
		arr[i] = temp;
	}
}

void print(){
	for(int i = 0; i < length; i++){
		printf("%d ", arr[i]);
	}
	printf("\n");
}

int main(){
//	bubbleSort();
//	selectionSort();
	print();
	
	return 0;
}
