public class vid14 {
    public static void main(String [] args){
        
 String name="Anshu";
 System.out.println(name);
 int value=name.length();
 System.out.println(value);
 String lower=name.toLowerCase();
 System.out.println(lower);
 String upper=name.toUpperCase();
 System.out.println(upper);
 String cut=name.trim(); 
//  trim()  returns a new string after removing all the leading and trailing spaces from the original string.Actually it trims the extra spaces used in the string.
 System.out.println(cut);
 System.out.println(name.substring(2));
  System.out.println(name.substring(0,5));
  System.out.println(name.replace('u','i'));
  System.out.println(name.startsWith("ans")); //returns true
  System.out.println(name.endsWith("shi")); // returns false
  System.out.println(name.charAt(3));
  System.out.println(name.indexOf("An"));

    String updatedname= "Prernakumari";
    System.out.println(updatedname.indexOf("mari"));
    System.out.println(updatedname.indexOf("ku",1));
System.out.println(updatedname.lastIndexOf("umar"));
System.out.println(updatedname.lastIndexOf("umar",7));
System.out.println(updatedname.equals("Prernakumari"));
System.out.println(updatedname.equals("PrernakUMari"));
System.out.println(updatedname.equalsIgnoreCase("PrERNakumari"));


// Do search for escape sequence in your web browser


    }
}
