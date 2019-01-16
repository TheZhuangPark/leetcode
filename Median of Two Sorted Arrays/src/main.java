import java.util.Random;
import java.util.*;

/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */

public class main {
  public static void main(String args[]) {
	  System.out.println("Hello World");
	
	  int re=11/2;
	  System.out.print(re);
	  
	//test code  
	  int seed1=10;
	  int seed2=20;
	 
	  
	  for(int i=0; i<10;i++) {  
	 
      Random r1=new Random(seed1);
      Random r2=new Random(seed2);
      int[] test1= new int[10];
	  int[] test2= new int[10];
      for(int j=0;j<10;j++)
      {
    	  test1[j]=r1.nextInt(30);
    	  test2[j]=r2.nextInt(30);
      }
      Arrays.sort(test1);
      Arrays.sort(test2);
	 System.out.println("test1:"+Arrays.toString(test1));
	 System.out.println("test2:"+Arrays.toString(test2));
	 int []resultArray=mergesorted(test1,test2);
	 System.out.println("result:"+Arrays.toString(resultArray));
	 System.out.println("result:"+(resultArray[9]+resultArray[10])/2.0);
	 
	  double result= findMedianSortedArrays2(test1, test2);
	  System.out.print("My result:"+result+"\n");
	  seed1=seed1+1;
	  seed2=seed2+1; 
	  }
  }
  
  
  
  public static int[] mergesorted(int[] n1,int[] n2){
	  int len1=n1.length;
	  int len2=n2.length;
	  int result[]=new int[len1+len2];
	  for(int i=0;i<len1;i++)
	  {
		 result[i]=n1[i];
	  }
	  for(int j=0;j<len2;j++) 
	  {
		 result[len1+j]=n2[j];  
	  }
	  Arrays.sort(result);
	  return result;
	  
  }
  
  public static double findMedianSortedArrays2(int[] nums1, int[] nums2) {
	  if(nums1.length<nums2.length) {
		  int []tmp=nums1;
		  nums1=nums2;
		  nums2=tmp;
	  }
	  
	  double result=0;
	  int m=nums1.length-1;
	  int n=nums2.length-1;
	  int imin=0;
	  int imax=m;
	  while(true) {
		  int i=(imin+imax)/2;
		  int j=(m+n+2)/2-i;
		  int flag=0;
		  if(nums2[j-1]>nums1[i]) { //i is too small
			  flag=0;
			  imin=i;
			  continue;
		  }else
		  {
			  flag=1;  
		  }
		  
		  if(nums1[i-1]>nums2[j]) {
			//i is too big
			  flag=0;
			  imax=i;
			  continue;
		  }else
		  {  flag=1;
		  
		  }
		  
		  if(flag==1) {//we have found target i 
			  if((m+n)%2==0) {// even sequence 
				 int left,right;
				 if(nums1[i]<=nums2[j]) {
					 right=nums1[i];
				 }else {right=nums2[j]; }
				 
				 if(nums1[i-1]>=nums2[j-1]) {
					 left=nums1[i-1];
				 }else {left=nums2[j-1]; }
				 
				 return (left+right)/2.0;
				 
			  }else//odd sequence
			  {
					 int right;
					 if(nums1[i]<=nums2[j]) {
						 right=nums1[i];
					 }else {right=nums2[j]; }
					 
					 return right;
			  }
		  }
		  
     }
	
	  
	//  return result;
  }
  
  public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
      double median=0;
	  int n=nums1.length;
      int m=nums2.length;
      int total_len=n+m;
      
      if(total_len%2==0) {
    	  int i=0;
    	  int j=0;
    	  while(true) {
    	  if(nums1[i]<=nums2[j])
      	  {  
      		   i++;
      		   if( (i+j)== ((total_len)/2+1) ) {
      		   if(nums1[i-1]>nums2[j-1]) 
      		    { if(nums1[i-2]>nums2[j-1]) 
      		    	{
      		    	  return (nums1[i-1]+nums1[i-2])/2.0 ;
      		    	}else
      		    	{
      		    		return (nums1[i-1]+nums2[j-1])/2.0;
      		    	}
      		    }
      		   else { 
      			   if(nums2[j-2]>nums1[i-1]) 
 		    	   {
   		    	      return (nums2[j-1]+nums2[j-2])/2.0 ;
   		    	   }else
   		    	   {
   		    		return (nums1[i-1]+nums2[j-1])/2.0;
   		    	    }
      			   }
      		   }
      	     }
    	   else
      	    {
      	       j++;
      		  if( (i+j)== ((total_len/2)+1) ) {
      		   if(nums1[i-1]>nums2[j-1]) {return nums1[i-1];}
      		   else { return nums2[j-1];}
      		   }
      	   }
    	  
      }}else
      {  int i=0;
         int j=0;
         while(true) {
    	if(nums1[i]<=nums2[j])
    	{  
    		i++;
    		
    		if( (i+j)== ((total_len+1)/2) ) {
    		   if(nums1[i]>nums2[j]) {return nums1[i-1];}
    		   else { return nums2[j-1];}
    		}
    		
    	}else
    	{
    	    j++;
    		if( (i+j)== ((total_len+1)/2) ) {
    		   if(nums1[i]>nums2[j]) {return nums1[i-1];}
    		   else { return nums2[j-1];}
    		}
    	}
       }//while(true)
      }
  
	  
  }
}
