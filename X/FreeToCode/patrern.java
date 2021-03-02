/*
Belajar Pola Sehingga Melatih logika !
 */

public class patrern {
    
    static void jajarGenjang(){
    for(int i =1; i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=5;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void kotakMemudar(){
for(int i=1; i<=5;i++){
        
        for(int j=1;j<= 15;j++){
        System.out.print("* ");
        
        for(int k=5;k<j;k++){
        System.out.print(" ");
        }
        }
        
        System.out.println();
    }
}
    static void segitiga(){
 int i, j,k;
  for (i=1;i <=5 ; i++) {
   for (j=5; j>i; j--) {
    System.out.print(" ");
   }
   for (k=1;k<(2*i) ; k++) {
    System.out.print("*");
   }
   System.out.println();
  }
}
    static void segitigaTerbalik(){

int i, j, k;
for(i=5;i>=1;i--){
    for(j=5;j>i;j--)
    {
        System.out.print(" ");
    }
    for(k=1;k<(i*2);k++){
    System.out.print("*");
    }
System.out.println();
}
    
}
    static void segitigaSiku(){
int i, j;
  for (i=1; i<=5; i++) {
   for (j=1; j<=i; j++) {

    System.out.print("*"); 
   }
   System.out.println(); 
  }
}
    static void segitigaSikuTerbalik(){
    //Penjelasan !!!
//Setiap baris selesai di eksekusi oleh banyaknya bintang pada 
//for loop ke 2, for loop ke 1 akan eksekusi line baru dan setiap line baru 
//for loop pada ke 1 variable a mengalami decrecement sehingga panjang dari bintang
//yang dieksekusi dari for loop ke 2 akan semakin memendek atau berkurang
int a,b;
for (a=10; a>=1;a--){ //Dari atas ke bawah ada 10 baris
    for (b=1; b<=a; b++){
        System.out.print("*");
    }
    System.out.println(" ");
}
}
    static void kotak(){
    for(int i = 0; i < 4; i++){ // bintang atas ke bawah 
        for(int j = 0; j < 4; j++){ //bintang kiri ke kanan
            System.out.print(" *");   
        }   
        System.out.println(""); 
    }

  
}
    static void hati(){
 
       final int N = 10;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= 4 * N; j++) {
				double d1 = Math.sqrt(Math.pow(i - N, 2)
									+ Math.pow(j - N, 2));

				double d2 = Math.sqrt(Math.pow(i - N, 2)
									+ Math.pow(j - 3 * N, 2));

				if (d1 < N + 0.5 || d2 < N + 0.5) {
					System.out.print('*');
				} else {
					System.out.print(' ');
				}
			}
			System.out.print(System.lineSeparator());
		}

		for (int i = 1; i < 2 * N; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(' ');
			}

			for (int j = 0; j < 4 * N + 1 - 2 * i; j++) {
				System.out.print('*');
			}

			System.out.print(System.lineSeparator());
		}
 
}
    static void diamond(){

int i, j, k;
for(i=1;i<=5;i++){
    for(j=i;j<5;j++){
        System.out.print(" ");
    }
    for(k=1;k<(i*2);k++){
        System.out.print("*");
    }
    System.out.println();
}
for(i=4;i>=1;i--){
    for(j=5;j>i;j--)
    {
        System.out.print(" ");
    }
    for(k=1;k<(i*2);k++)
    {
        System.out.print("*");
    }
    System.out.println();
}
    
}
    static void kotakBolong(){
     for(int i=1; i<=5; i++) 
     {
         for(int j=0; j<=3; j++) 
             {
                 if (i==1||i==5||j==0||j==3) 
                 {
                     System.out.print("@ ");
                 }
                 else
                 {
                     System.out.print("  "); 
                 }
             }
         System.out.println("");
     }
}
    static void Z(){
    
    for (int i = 1; i <= 6; i++) {
        for(int j = 6; j >= 1; j--) {
            
            if (i == 1 || i == 6 || i == j) {
                System.out.print("@ ");
            }
            
            else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
   } 
    static void tugas(){
    for(int i=1;i<=4;i++){
           
           for(int j=0; j < i; j++){
               System.out.print("@ ");
           }
           System.out.println();
       }
    }
    
    static void paternMake(){
    
        
        
   }      
        
public static void main(String[] args) { //print patrern atau tempat pemanggilan pattern

    jajarGenjang();
   

}

}

