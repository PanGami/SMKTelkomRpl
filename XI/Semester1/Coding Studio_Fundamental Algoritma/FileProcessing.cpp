#include<stdio.h>

int main(){
	//Filebase
	
	//read, write, append
	// r -> read
	// w -> write
	// a -> append
	// r+ -> read,write
	// w+ -> read,write
	// a+ -> append, read
	//open, process, close
	
	char txt[200];
	FILE *fp;
	
	fp = fopen("data.txt", "a+");
	
	fprintf(fp, "panpan123panpanpanTest");
	rewind(fp);
	fscanf(fp, "%[^\n]", txt);
	printf("%s", txt);
		
	fclose(fp);
	getchar();
	
	return 0;
}
