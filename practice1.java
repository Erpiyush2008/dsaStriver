public class practice1 {

    public static int reverse(int n){
   int rev=0;
        while(n>0){
        int rem = n%10;
        rev = rem+rev*10;
         n=n/10;
        }
        return rev;
    }

    public static boolean isPrime(int n){

        if(n==1||n==2){
            return true;
        }
        for(int i=2;i<n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void  star1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.err.println();
        }
    }
        public static void  star2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.err.println();
        }
    }

     public static void  star3(int n){
        for(int i=1;i<=n;i++){
            int k=1;
            for(int j=1;j<=i;j++){
                System.out.print(k);
                k++;
            }
            System.err.println();
        }
    }
    
     public static void  star4(int n){
        char a='A';
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=i;j++){
                
                System.out.print(a);
                a++;
            }
            System.err.println();
        }
    }

    public static int binToDec(int n){
int power =0;
int dec =0;
        while(n>0){
            int rem = n%10;
             dec= dec+  rem*(int)(Math.pow(2, power)) ;
             n=n/10;
power++;
        }
        return dec;
    }

     public static int  decToBin(int n){
int power =0;
int bin =0;
        while(n>0){
            int rem = n%2;
             bin= bin+  rem*(int)(Math.pow(10, power)) ;
             n=n/2;
       power++;
        }
        return bin;
    }



//     public static void main(String[] args) {
    
//     // System.out.println(reverse(45));
//     // System.out.println(isPrime(9));
//     // star1(4);
//     // star2(4);
//     // star3(4);
//     // star4(4);

//     // System.out.println(binToDec(1010));
//     // System.out.println(decToBin(10));

// }


    public static void main(String[] args) {

        int n = 4;

        for(int i = 0; i < n; i++) {

            // Print spaces
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for(int k = 0; k < (2 * n - 1) - (2 * i); k++) {
                System.out.print("*");
            }

            System.out.println();
        }


        }


}
