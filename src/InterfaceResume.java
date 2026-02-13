import java.util.Scanner;

interface Resume {
    void biodata();
    
    // TODO: Declare method void biodata();
}

class Teacher implements Resume {
    // Attributes
   String name;
   String Qualification;
   String Experience;
    
void biodata(){

    
}
    // TODO: Implement biodata() method to print details in the required format
}

public class InterfaceResume {
   
        public void main(String args[]){

            Scanner sc=new Scanner(System.in);
            int name=sc.nextLine();
            int qual=sc.nextLine();
            int exp=sc.nextLine();   

            
        }
        // TODO: Read input (Name, Qualification, Experience)
        // Assign to teacher object attributes
        
        // TODO: Call teacher.biodata()
    
}
