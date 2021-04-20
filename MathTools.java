/**
 * MathTools.
 *
 * @author Idrissi
 */
public class MathTools {

	 
		public int add(int a,int b){
			return a+b;
		}
	
		public int substract(int a,int b){
			return a-b;
		}
	
		public int multiply(int a,int b){
		  if (a==0 || b==0)
			  throw new IllegalArgumentException(" a or b is equal to zero");
		  return a*b;
	    }
	
		public double divide (int a,int b){
			if (b==0)
			  throw new IllegalArgumentException(" Division over zéro");
		  return a/b;
		}
		
		public int factoriel (int a){
			if(a<0)
				throw new IllegalArgumentException("a is negative");
			else if(a<2)
				return 1;
			else
				return a*factoriel(a-1);
		}
	 
		public static int pgcd(int a,int b){
			if ( a < 0 ) 
				throw new IllegalArgumentException("a is negative");
			if ( b < 0 ) 
				throw new IllegalArgumentException("b is negative");
	
			if(a<b) 
				return (pgcd(b,a));
			else if(b==0) 
				return (a);
			else 
				return (pgcd(b,a%b));
    }
	

}
