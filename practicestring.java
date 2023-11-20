public class vid15 {
    public static void main (String[] args){

        // 1. convert "Jack Parker" name in lower case 
        String name="JAck Parker";
        name=name.toLowerCase();
        System.out.println(name);

// 2.Replace a String value with your suitable variable or operation.
String name1="I am learning how to code and one day i will master it and get a good placement for myself and my parents.";
name1=name1.replace(" ","_" );
System.out.println(name1);

//3. write a java program to fill in a letter template which looks like :
// letter="Dear <|name|, Thanks a lot"
// Replace <|name|> with a string (some name)

String letter ="Hello dear <|Friends|>, thanks for being there ";
//letter.replace("<|Friends", "Nidhi"); it will not change the value of friends to nidhi because it was not assigned in the letter variable of a string.
 letter=letter.replace("<|Friends|>", "Nidhi");
System.out.println(letter);

// 4. Write a java program to detect double and triple spaces in a string.
String spacefiller="she was             very friendly        with everyone            so people       took her        for granted      ";
System.out.println(spacefiller.indexOf(" "));
System.out.println(spacefiller.indexOf("           "));
System.out.println(spacefiller.indexOf("was"));

// Write a program to format the following letter using escape sequence characters. lettet = "Dear Prerna, Universe is waiting for your success."
//this \t gives the space of a tab and \n forms tye sentence or word in another line, without changing the string.
String name3="Dear Prerna, \n Universe is waiting for your success.\n You have a lot to achieve in your life.";
System.out.println(name3);

    }
}
