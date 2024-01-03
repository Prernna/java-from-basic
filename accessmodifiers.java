/* 1.Access Modifiers : Specifeirs where a property/method is accesible.there are four types of access modifiers in java:
 * Private:They are used to protect the data/information from other users so that they do not have access to any of the data.we use private property or method 
 * Default
 * Protected
 * Public
 
2.Getters and Setters
Getter-> Returns the value [accessors]
Setter -> Sets/Updates the value [mutators]
 */
    
class Employee{
        // int id;
        // String  name;
    private  int id;
    private String  name;
    public String getName(){ //getter
    return name;
    }
    public void setname(String n){
        name=n;
    }
    public int setId(int i){ //the other way is written below
        return id=i; 
    }    
    // public void setId(int i){  //SO that you can provide the value of id in setId in main method where we call our functions.
    //     id=i;

    // }
    public int getId(){
        return id; 
    }

    }
    //Practice question
    class circle{
        private int r=2;
        public int getarea(){
            return 22/7*r*r;
        }
        public int setarea(){
            return 22/7*r*r;
        }
        public int getperimeter(){
            return 2*22/7*r;
        }
        public int setperimeter(){
            return 2*22/7*r;

        }
    }

public class vid40accessmodifiers {

    public static void main(String[] args) {
        
Employee divya = new Employee();
// divya.id=12; //throws error due to private access modifier
// divya.name="Prerna";

divya.setname("Prerna kumari");
divya.setId(1);
System.out.println("Name is "+divya.getName());
System.out.println("Id number is "+divya.getId());

System.out.println("\n");


circle one = new circle();
one.setperimeter();
one.setarea();
System.out.println("Perimeter of circle is " +one.getperimeter());
System.out.println("Area of circle is "+ one.getarea());

    }
}
