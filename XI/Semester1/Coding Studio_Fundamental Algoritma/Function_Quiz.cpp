#include<stdio.h>

int main(){
	//pointer
	
	int arr[10];
	for(int i =0; i < 10; i++){
		arr[i] = 0;
		printf("%d = %d\n", i, &arr[i]);
	}	
	
	int *a;
	int b;
	
	scanf("%d %d", &a, &b);
	
	*a = b;
	for(int i = 0; i < 10; i++){
		printf("%d = %d\n", i,arr[i]);
	}
	return 0;
}
