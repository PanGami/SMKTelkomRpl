#include<stdio.h>
#include<string.h>

int main(){
	char str[99];	
	scanf("%[^\n]", str);
	getchar();
	int panjang = strlen(str);
	for(int i=0; i<panjang; i++){
		if(str[i] >= 'a' && str[i] <= 'z'){
		str[i] -= 32;
		}
	}
	
	// tambahan toUpper() printf("%s", strupr(str));
	return 0;
}
