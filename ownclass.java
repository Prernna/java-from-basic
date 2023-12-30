public class ownclass {
//Writing a custom class 
/*
 Any real world object = Properties + behaviour
 onjects in OOPs = Attributes + Methods
 */
static class Employee{  //Make Employee class static if u want to declare it into the main branch.
     //(In a java code only one public class can be declare . so, we have to write class and not public class)
    int id;
    int salary;
    String name;

    public void printdetails(){
        System.out.println("Employee id is "+ id);
        System.out.println("Employee name is "+name);
        System.out.println("Their monthly income is : "+ salary);
        System.out.println("\n");

    }

    public int getsalary(){
    return salary;
    }
}
    public static void main(String[] args) {
        System.out.println("Hii, today is a foggy day");
        Employee prerna = new Employee(); //Instantiating a new object
        Employee sudhanshu = new Employee();
        //Setting attributes for Prerna
        prerna.id = 12;
        prerna.name = "Divya";
        prerna.salary=12;

        System.out.println("\n");
        //Setting attributes for Sudhanshu
        sudhanshu.id=15;
        sudhanshu.name="ayesha";
        sudhanshu.salary=12;
        // //printing the attributes
        prerna.printdetails();
        sudhanshu.printdetails();
        // System.out.println(prerna.id);
        // System.out.println(prerna.name);


    }
}
