package com.corejava.ExceptionHandllingDemo;

public class MultipleCatchBlock {

	public int add(){
		try{
	         int arr[]=new int[7];
	         arr[4]=30/0;
//			 int arr[]=new int[7];
//	         arr[10]=19;
	         System.out.println("Last Statement of try block");
	         return 10;
	      }
	      catch(ArithmeticException e){
	         System.out.println("You should not divide a number by zero");
	         return 0;
	      }
	      catch(ArrayIndexOutOfBoundsException e){
	         System.out.println("Accessing array elements outside of the limit");
	         return 0;
	      }
	      catch(Exception e){
	         System.out.println("Some Other Exception");
	         return 0;
	      } finally{
	    	 System.out.println("finally"); 
//	    	 return 1;
	      }
	}
	
	public static void main(String[] args) {
		
	
		System.out.println(new MultipleCatchBlock().add());;
		System.out.println("Main method --------------------------------------------");
		 try{
		        System.out.println('1');
		        try{
		            System.out.println('2');
		            throw new Exception("threw exception in B");
		        }
		        finally
		        {
		            System.out.println('3');
		        }
		        //any code here in the first try block 
		        //is unreachable if an exception occurs in the second try block
		    }
		    catch(Exception e)
		    {
		        System.out.println('4');
		        try{
		        	
		        }catch(Exception e1){
		        	
		        }
		    }
		    finally
		    {
		        System.out.println('5');
		        try{
		        	System.out.println("in try");
		        }finally{
		        	System.out.println("in final");
		        }try{
		        	
		        }catch(Exception e){
		        	
		        }
		    }
		
		
		
	}
}
