
public class main {
   public static void main(String []args) {
	   System.out.println("project longest palindromic substring!");
	   
   }
   
   public String longestPalindrome(String s) {
       String result="";
       int []p=new int[s.length()];
       int center=0;
       int len=1;
       while(center<s.length()) {
    	   for(int i=1;i<s.length();i++) {//compare center
    		   if((center-i)>=0 &&(center+i)<s.length())
    		   {
    			   if(s[0]=) {
    				   
    			   }
    		   }
    	   }
       }
       return result;
   }
}
