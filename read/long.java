https://www.geeksforgeeks.org/java-lang-long-class-in-java/
// Java program to illustrate  
// various Long class methods 
public class Long_test  
{ 
    public static void main(String args[])  
    { 
        long b = 55; 
        String bb = "45"; 
  
        // Construct two Long objects 
        Long x = new Long(b); 
        Long y = new Long(bb); 
  
        // toString() 
        System.out.println("toString(b) = " + Long.toString(b)); 
         //toString(b) = 55
        // toHexString(),toOctalString(),toBinaryString() 
        // converts into hexadecimal, octal and binary forms. 
        System.out.println("toHexString(b) =" + Long.toHexString(b)); 
        System.out.println("toOctalString(b) =" + Long.toOctalString(b)); 
        System.out.println("toBinaryString(b) =" + Long.toBinaryString(b)); 
  
        // valueOf(): return Long object 
        // an overloaded method takes radix as well. 
        Long z = Long.valueOf(b); 
        System.out.println("valueOf(b) = " + z); 
        z = Long.valueOf(bb); 
        System.out.println("ValueOf(bb) = " + z); 
        z = Long.valueOf(bb, 6); 
        System.out.println("ValueOf(bb,6) = " + z); 
  
        // parseLong(): return primitive long value 
        // an overloaded method takes radix as well 
        long zz = Long.parseLong(bb); 
        System.out.println("parseLong(bb) = " + zz); 
        zz = Long.parseLong(bb, 6); 
        System.out.println("parseLong(bb,6) = " + zz); 
  
        // getLong(): can be used to retrieve 
        // long value of system property 
        long prop = Long.getLong("sun.arch.data.model"); 
        System.out.println("getLong(sun.arch.data.model) = " + prop); 
        System.out.println("getLong(abcd) =" + Long.getLong("abcd")); 
  
        // an overloaded getLong() method 
        // which return default value if property not found. 
        System.out.println("getLong(abcd,10) =" + Long.getLong("abcd", 10)); 
  
        // decode() : decodes the hex,octal and decimal 
        // string to corresponding long values. 
        String decimal = "45"; 
        String octal = "005"; 
        String hex = "0x0f"; 
  
        Long dec = Long.decode(decimal); 
        System.out.println("decode(45) = " + dec); 
        dec = Long.decode(octal); 
        System.out.println("decode(005) = " + dec); 
        dec = Long.decode(hex); 
        System.out.println("decode(0x0f) = " + dec); 
          
        // rotateLeft and rotateRight can be used 
        // to rotate bits by specified distance 
        long valrot = 2; 
        System.out.println("rotateLeft(0000 0000 0000 0010 , 2) =" +  
                                    Long.rotateLeft(valrot, 2)); 
        System.out.println("rotateRight(0000 0000 0000 0010,3) =" +  
                                    Long.rotateRight(valrot, 3)); 
    } 
} 
Output :


toHexString(b) =37
toOctalString(b) =67
toBinaryString(b) =110111
valueOf(b) = 55
ValueOf(bb) = 45
ValueOf(bb,6) = 29
parseInt(bb) = 45
parseInt(bb,6) = 29
getLong(sun.arch.data.model) = 64
getLong(abcd) =null
getLong(abcd,10) =10
decode(45) = 45
decode(005) = 5
decode(0x0f) = 15
rotateLeft(0000 0000 0000 0010 , 2) =8
rotateRight(0000 0000 0000 0010,3) =1073741824
