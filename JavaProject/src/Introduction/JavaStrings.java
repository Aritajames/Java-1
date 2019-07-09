package Introduction;

public class JavaStrings {
    public static void main(String[] args) {
        //  Strings are used to store text, enclosed in double quotes
        //  Before you create a string variable define the type of data it will store
        //  syntax type nameofvariable = value''
        //  A string in java is actually an object which contains methods that can perform certain operations on strings
        //  For Example, The length of a string can be found with the length method
        String firstname = "Developer";
        System.out.println(firstname);

        // variablename.method

        System.out.println(firstname.length());

        //  Special Characters; Escaping Characters using a backslash(\)

        System.out.println("The trainer asked: \"Where is your assignment?\"");
        System.out.println("I am a FrontEnd Developer\nJava Developer\nPhp Developer");
        System.out.println("I am a FrontEnd Developer\n \tJava Developer\n \t \tPhp Developer");
    }
}
