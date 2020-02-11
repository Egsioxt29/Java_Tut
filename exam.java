

import java.util.Scanner;
//@author Ahmed Abbas


public class exam {
    
    int b,i,j,k,a;
    
    void factorial(){
       
        int number,b =1;
          Scanner scanner = new Scanner(System.in);
          
         
        System.out.print("Enter Number - ");
        number = scanner.nextInt();
        
        
        for ( int i=1;i<=number;i++)
        {b = (b * i);
       
        
        }
         System.out.print("The Factorial is: "+b);
        
         
    }
    
    void pyramid(){
        
        System.out.println();
        System.out.print("*");
        for (i=1;i<=4;i++)
        {
         for (k=1;k<=4-i;k++)
         {
          System.out.print(" ");
         }
         
         for (j=1;j<=2*i - 2;j++)
        {
           System.out.print("*");
         }
          System.out.println();
        }
    }
    
    void primenumbers(){
        
        for(int i=1;i<=100;i++){
           int b = 0;
            for(int j=2;j<i;j++){
                if(i%j == 0)
                    b++;
            }
            if(b == 0){
                System.out.print(i+", ");
            }
        }
         System.out.println();
    }
    
    void vowels(){
        
       
    }

   
        
         void RevString(String str){
             System.out.println();
         char[] inp = str.toCharArray();

         for(int i = str.length()-1; 0<=i; i-- ){
             System.out.print(inp[i]);
         }
     }

    
      
        
    
    
     
   
     public static void main(String[] args) {
         
         exam E1 = new exam();
         
         E1.factorial();
         
         exam E2 = new exam();
         
         E2.pyramid();
         
         exam E3 = new exam();
         
         E3.primenumbers();
         
         exam E4 = new exam();
         
         E4.vowels();
         
         Scanner scanner = new Scanner(System.in);
        System.out.print("\n Enter Your String: ");
        String str = scanner.next();

        exam E5 = new exam();
        E5.RevString(str);
        
    }
     
     
}
    
    
    

    
   
   
    

