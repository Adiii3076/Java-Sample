package sample;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Students {
     String name;
     int age ;
     int Roll_No;
     int Sub1; 
     int sub2;
     int Total;
     float per ;
     void getdata ()throws IOException{
    	 BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    	 System.out.println("Enter Name of Student : ");
    	 name = br.readLine();
    	 System.out.println("Enter Age of Student : ");
    	 age =Integer.parseInt(br.readLine());
    	 System.out.println("Enter Roll_No of Student : ");
    	 Roll_No = Integer.parseInt(br.readLine());
    	 System.out.println("Enter Marks out of 100 of 1st Subject of Student : ");
    	 Sub1 =Integer.parseInt(br.readLine());
    	 System.out.println("Enter Marks out of 100 of 1st Subject of Student :");
    	 sub2 = Integer.parseInt(br.readLine());
      }
     void show () {
    	 Total = Sub1+sub2;
    	 per=(Total*100)/200;
    	 System.out.println("Name : "+ name);
    	 System.out.println("Roll_NO : "+Roll_No);
    	 System.out.println("Age : " +age);
    	 System.out.println(" Subject 1st Marks : "+Sub1);
    	 System.out.println("Subject 2nd Marks : "+sub2);
    	 System.out.println("Total Marks : "+Total);
    	 System.out.println("Percentage : "+per+"%");
     }
	public static void main(String[] args)throws IOException {
       Students s=new Students();
       s.getdata();
       s.show();

	}

}
