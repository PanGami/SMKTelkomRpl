#include<stdio.h>

void helloWorld(int i){
	if(i == 5) return;
	
	helloWorld(i+1);
	printf("%d\n", i);
}

int main(){
	helloWorld(0);
	
	return 0;
}
