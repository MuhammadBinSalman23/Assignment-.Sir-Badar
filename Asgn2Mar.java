import java.util.Scanner;
class Asgn2Mar {
    
public static void main(String[] args) {
    
    int dec, originalDec;
    String binary="";
    
     Scanner sc = new Scanner(System.in);
   dec = Integer.parseInt(sc.nextLine());
   originalDec = dec;
     while (dec != 0) {
             
           binary  =   (dec % 2) + binary;
           dec  = dec / 2;
        
    }
    // part(a)
    System.out.println("Part(a) Decimal number "+originalDec+" its Binary is " +binary);
    
     

    
     // part(b)
    
    int[] binaryArray =  convertDecToBinaryUsingArray(dec);

    System.out.print("Part(b) Decimal number "+originalDec+" its Binary is " );

    for(int i = 0; i < binaryArray.length ; i++ ){

      System.out.print(binaryArray[i]);
    }
    


    
    // part(c)
    System.out.println("Part(c) Decimal number "+originalDec+" its Binary is "+convertDecToBinary(dec) ); 
    

    
  

}


public static int[] convertDecToBinaryUsingArray(int decpara ) {
    int[] binary= new int[20]; 
    int[] returnBinary;
    int index = 0;
    while (decpara != 0) {
             
           binary[index]  =   (decpara % 2);
           decpara  = decpara / 2;
           index++;
        
    }

    returnBinary = new int[index]; 
    for(int y=0, z=index-1; y < returnBinary.length; y++, z--) {
      returnBinary[y] = binary[z]; 
    }
    return returnBinary;    
 } // convertDecToBinaryUsingArray ends
 

public static String convertDecToBinary(int decpara ) {
    String binary =""; 
    while (decpara != 0) {
             
           binary  =   (decpara % 2) + binary;
           decpara  = decpara / 2;
        
    }
 return binary;    
 } // convertDecToBinary ends








} 
