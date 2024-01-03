 class MymainEmployee{
private int id;
private String name;
private float money;

public  MymainEmployee(){ /*Constructor will work automatically because the name(method) is same . it will invoke the object.
    1.constructors can take parameters without being overloaded.
    2.there can be more than two overloaded constructors.
    */
id = 45;
name="Prerna kumari";

}

public MymainEmployee(String myname,int myid,float salary){
//We can overload Constructors like other methods.
    id=34;
    name=myname;
    money=salary;

}

public String getname() {return name;}
public void setname(String n){ this.name = n;}
public void setid(int i){this.id = i;}
public int getid() {return id;}
public float getmoney(){return money;}
public void setmoney(float f){ this.money = f;}

}

public class constructors {
    //Constructors in Java : A number function used to initialize an object while creating it.
    public static void main(String[] args) {
    

MymainEmployee divu = new MymainEmployee();  
divu.setname("Sudhanshu rana");
divu.setid(17);
System.out.println(divu.getname());
System.out.println(divu.getid());



MymainEmployee divya = new MymainEmployee("Prerna the learner", 11, 15.5f); //It works as an function , we can pass arguements as long as we have written the objects .
// divya.setname("Prerna kumari");
// divya.setid(15); 
System.out.println(divya.getname()); //because the values of name and id are  already provided in the above code . so its our choice whether to set the value or not.
System.out.println(divya.getid());
System.out.println("Salary is "+ divya.getmoney());




    }
}
