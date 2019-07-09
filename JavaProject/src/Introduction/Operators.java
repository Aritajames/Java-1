package Introduction;

public class Operators {
    public static void main(String[] args) {
        System.out.println();

        //  Operators in Java
        //  1. Arithmetic
        //  2. Comparison
        //  3. Assignment
        //  4. Logical operators

        //  1. Arithmetic Operators
        //  Used to perform arithmetic operations
        //  e.g : + , . , * , / , % , ++ , --

        int y = 3, x = 4;
        System.out.println(y + x);
        System.out.println(4 % 3);

        //  2. Assignment Operators
        //  Used to assign values to variables
        //  e.g : = , += , -= , *= ......

        System.out.println(y += x);
        System.out.println(y = y + x);

        //  3. Comparison operators
        //  Used to compare two values
        //  e.g : == , != , > , >= ....

        System.out.println(y == x);

        //  4. Logical Operators
        //  Used to determine logic between two variables or values
        //  e.g : && - And
        //        || - Or
        //        !  - Not

        System.out.println(y < x && x > y); //  Logical And
        System.out.println(y < x || x < y); //  Logical Or
        System.out.println(!(y < x && x > y)); //   Logical Not


    }
}
