package objectoriented;

public class ComplexNumbers {
		private int real ;
	    private int imaginary;
	    public ComplexNumbers(int real ,int imaginary){
	        this.real=real;
	        this.imaginary=imaginary;
	    }
	    
	    public int getImaginary(){
	        return imaginary;
	        
	    }
	    public int getReal(){
	        return real;
	    }
	    public int setReal(int real){
	        return this.real=real;
	    }
	    public int setImaginary(int imaginary){
	        return this.imaginary=imaginary;
	    }
	    public void print(){
	     System.out.println(real+" + "+'i'+imaginary);
	    }
	    public void plus(ComplexNumbers c2){
	        
	    }
	    
	    public void multiply(ComplexNumbers c2){
	        
	    }
	    public ComplexNumbers conjugate(){
			return null;
	        
	    }
	    public static ComplexNumbers add(ComplexNumbers c1 ,ComplexNumbers c2 )
	    {
			return c2;
	        
	    }
	    }

