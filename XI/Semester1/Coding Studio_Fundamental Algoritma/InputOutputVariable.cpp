#include<stdio.h>

// Data Type Format !
// %d int, %ld long, %c char, %f float, %lf double
// scanf to read a data type, 

int main(){
    int angkaBulat = 10;
    float angkaKoma = 1.5f;
    char karakter = 'a';
    char string[100] = "Hello";

    scanf("%d", &angkaBulat);
    getchar();
    printf("%d\n", angkaBulat);    

    scanf("%f", &angkaKoma);
    getchar();
    printf("%.3f\n", angkaKoma); 
    //maksud .3 adalah untuk menentukan berapa 
    //angka yg berada di belakang koma (',')

    scanf("%c", &karakter);
    getchar();
    printf("%c\n", karakter);

    scanf("%[^\n]", string);
    //Maksud "^\n" adalah ^ berarti sampai \n enter
    //atau sampai enter
    getchar();
    printf("%s\n", string);
    
    return 0;
}
