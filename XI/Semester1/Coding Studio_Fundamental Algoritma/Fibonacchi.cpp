#include<stdio.h>

void fibonacchi(int i){
	if(i == 0) return 0;
	if(i == 1) return 1;
	
	return fibonacchi(i-1) + fibonacchi(i-2);
}

int main(){
	int f = fibonacchi(7);
	printf("%d", f);
	
	return 0;
}
