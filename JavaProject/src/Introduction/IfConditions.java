package Introduction;

public class IfConditions {
    public static void main(String[] args) {
        int a = 10, b = 5;

        //syntax: if(condition){
        // code to execute
        // }
    if(a > b){
        System.out.println("a is greater than b");
    }

        //syntax: if(condition){
        // code to execute
        // }else{
        // code to execute if the 1st condition is false
        // }

    if(a > b){
        System.out.println("a is greater than b");
    }else{
        System.out.println("a is not greater than b");
    }

        //syntax: if(condition){
        // code to execute
        // }elseif{
        // code to execute if the first condition is false and you want to give an alternative
        // }else{
        // code to execute if both the first and the last conditions are false
        // }

    if(a < b){
            System.out.println("a is lesser than b");
        }else if(a > b){
            System.out.println("a is greater than b");
        }else{
            System.out.println("None is true");


    }

    }
}
