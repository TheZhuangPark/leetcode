import java.util.Arrays;

public class main {
   public static void main(String []args) {
	   System.out.println("project longest palindromic substring!");
	   String test="babcbabcbaccba";
	   char []result=longestPalindrome(test);
	   
   }
   private static String preProcess (String s){

       int n = s.length();

       if (n == 0 ) return "^$" ;

       String result = "^" ;

       for ( int i = 0 ; i < n; i++) {

           result += "#" + s.charAt(i);

       }

       result += "#$" ;

       return result;

   }

   public static char[] longestPalindrome(String t) {
	   
	   char [] s = preProcess(t).toCharArray();
	   //System.out.print(s);
       int []p=new int[s.length];
       for(int j=0;j<s.length;j++) {p[j]=0;}
       int c=0;
       int R=0;
       int i=c+1;
       int i_=2*c-i;
       
       while(c<s.length) {
           
      
       System.out.println("center:"+c+" i:"+i+" i_:"+i_);
       if(i_<0) {
    	   while(s[i-(R-i)]==s[i+(R-i)] )
    	   {   p[i]++;
    		   R++;
    		   if((i-(R-i))<0|| (i-(R-i))>=s.length||(i+(R-i))<0||(i+(R-i))>=s.length) break;
    	   }
    	   System.out.println("up date c from "+c+" to "+i);
    	    System.out.print(Arrays.toString(p));
    	   c=i;
           R=i+p[i];
           i=c+1;
           i_=2*c-i;
    	 
       }else {
        if(p[i_]<=R-i ) {
    	   p[i]=p[i_];
   	       System.out.print(Arrays.toString(p));
    	   System.out.println("p["+i+"]:"+p[i]);
    	   i++;
       }else {  
    	   while(s[i-(R-i)]==s[i+(R-i)] )
    	   {   p[i]++;
    		   R++;
    		   if((i-(R-i))<0|| (i-(R-i))>=s.length||(i+(R-i))<0||(i+(R-i))>=s.length) break;
    	   }
    	   System.out.println("up date c from "+c+"to "+i);
   	      System.out.print(Arrays.toString(p));
    	   c=i;
           R=i+p[i];
           i=c+1;
           i_=2*c-i;
    	 
       }
       }
       }
    
	System.out.print(p);
       return s;
   }
}
