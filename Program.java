/*ARITHMETIC OPERATOR */
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int a=12,b=5;
	    System.out.println("a+b :"+(a+b));
	    System.out.println("a-b :"+(a-b));
	    System.out.println("a*b :"+(a*b));
	    System.out.println("a/b :"+(a/b));
	    System.out.println("a%b :"+(a%b));
	    
	    
	    System.out.println("");
	    
/*ASSIGNMENT OPERATOR*/
	    
	    int c=4;
	    int var;
	    var=c;
	    System.out.println("var using :"+var);
	    var+=c;
	    System.out.println("var using +:"+var);
	    var*=a;
	    System.out.println("var using *:"+var);
	    
	    System.out.println("");
	    
/* LOGICAL OPERATOR */
	    System.out.println((5>3)&&(8>5));
	    System.out.println((5>3)&&(8<5));
	    System.out.println((5<3)||(8>5));  
	    System.out.println((5>3)||(8<5));  
	    System.out.println((5<3)||(8<5)); 
	    System.out.println(!(5==3)); 
	    System.out.println(!(5>3));  
	}
}


