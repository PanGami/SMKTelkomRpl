#include<stdio.h>

int arr[]={12,123,421,312,532,1231,45,123,12,43,123,12};

int length = 11;

int linearSearch(int search){
	for(int i = 0; i < length; i++){
		if(arr[i] == search){
			return i;
		}
	}
	return -1;
}

int binarySearch(int search){
	int low = 0;
	int high = length-1;
	
	while(low <= high){
		int mid = (low+high)/2;
		if(arr[mid] == search) return mid;
		else if(search < arr[mid]) high = mid-1;
		else if(search > arr[mid]) low = mid+1;
	}
	return -1;
}
int main(){
	//int resultIndex = linearSearch(123);
	int resultIndex = binarySearch(123);
	if(resultIndex ==-1) printf("Tidak Ketemu");
	else printf("Index = %d", resultIndex);
	return 0;
}
