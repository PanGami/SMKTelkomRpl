#include<stdio.h>

int main(){
	printf("ini tambah : %d\n", 2+3);
	printf("ini kurang : %d\n", 3-2);
	printf("ini kali : %d\n", 3*3);
	printf("ini bagi : %d\n", 5/2);
	printf("ini bagi (desimal) : %f\n)", 5.0/2.0);
	printf("Arithmetic : (%d+%d)/%d %d\n", 5, 2, 3, (5+2)/3);
	
	printf("AND : %d\n", 6&5);
	printf("OR : %d\n", 6|5);
	printf("XOR : %d\n", 6^5);
	printf("Shift Right : %d\n", 6>>2);
	printf("Shift Left : %d\n", 6<<2);
	
	return 0;
	//Pre Increment ++i
	//Post Increment i++
	//Pre Decrement --i
	//Post Decrement i--	
}
