
import java.util.ArrayList;
import java.util.Scanner;

public class Email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		int permit=1;
		do{
		System.out.println("Enter First name");
		String firstName=sc.next();
		System.out.println("Enter Last name");
		String lastName=sc.next();
		String fullName=firstName+lastName;
	

        int size= list.size();
        int count=0;
        for(int i=0;i<size;i++){
        String temp=list.get(i);
        if(temp.contains(fullName)){
        //System.out.println("yes");
        	count++;
        }
      
        }
        
        if(count==0){
        	String id= fullName+"@mail.com";
            System.out.println("\n Email Id is :  "+id);
            list.add(id);
        }
        else{
        //System.out.println(count);
        String id= fullName+count+"@mail.com";
        System.out.println("\n Email Id is :  "+id);
        list.add(id);
        }
        
        System.out.println("\n--------Press 1 to continue ----------");
        permit=sc.nextInt();
		}
		while(permit==1);
	}

}
