package Introduction;

public class JavaLoops {
    public static void main(String[] args) {

        //while loop
        //syntax:
        //while(condition){
        // code to execute
        // }

    int x = 0;
    while(x < 10){
        System.out.println(x);
        x++;
        if(x == 5){
            System.out.println(x);
            System.out.println("Hello world!!");
        // to stop at that use:  break;
            break;
        }
    }

    int z = 0;
    while(z < 10){
        if(z == 5){
            z++;
            continue;
        }
        System.out.println(z);
        z++;
    }

        //for loop
        //syntax:
        //for(statement 1,statement 2,statement 3){
        //code to execute
        //statement 1 is executed once before the execution of the code block
        //statement 2 defines the condition for the executing of the code block
        //statement 3 is executed every time the condition (statement 2) is true
        // }

    for(int i = 0;i < 11;i++){
        System.out.println(i);
    }

        //for each loop
        //is used to loop through an array
        //syntax:
        //for(type variable: array name){
        // code to execute
        // }

    String[] cars = {"BMW", "NYAYO"};
    for(String c : cars){
        System.out.println(c);
    }


























    }
}
