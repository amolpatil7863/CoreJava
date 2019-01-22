package com.corejava.ExceptionHandllingDemo;

public class CustomCheckedException {

	public CustomCheckedException() {
	}
	 public static Student find(String studentID) throws StudentNotFoundException {
	        if (studentID.equals("123456")) {
	            return new Student();
	        } else {
	            throw new StudentNotFoundException(
	                "Could not find student with ID " + studentID);
	            
	        }
	    }
	public static void main(String[] args) {
		try {
			 
            Student student = CustomCheckedException.find("12345u6");
            System.out.println("student:-"+student);
        } catch (StudentNotFoundException ex) {
            System.err.print(ex);
        }
	}

}
