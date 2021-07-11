#include<stdio.h>
// if, else if, else
// if(kondisi) { statements }else if(kondisi){ Statements } 
// else{statements}

// Switch Case
// Switch(variable) case jika isi variable x, default (seperti else)
int main(){
	int in, botEdge, upEdge;	
	
	scanf("%d", &in);
	scanf("%d %d", &botEdge, &upEdge);
	
	if(in >= botEdge && in <= upEdge){
		printf("%d diantara %d dan %d", in, botEdge, upEdge);
	}else{
		printf("%d bukan diantara %d dan %d", in, botEdge, upEdge);		
	}
	return 0;
}
