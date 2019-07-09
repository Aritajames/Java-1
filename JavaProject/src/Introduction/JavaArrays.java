package Introduction;

public class JavaArrays {
    public static void main(String[] args) {
        //string array
        //state the type and square brackets variablename
        String[] cars; //empty array
        String[] languages = {"HTML","Php","Java"};

        //integer array
        int[] numbers;
        int[] myNumbers = {1, 2, 3, 4, 5};

        //Accessing items in an array
        System.out.println(languages[0]);

        //Changing items in an array
        languages[2] = "ruby";
        System.out.println(languages[2]);

        //Checking the length
        System.out.println(languages.length);

        for(String language : languages){
            System.out.println(language);
        }

        for(int a = 0;a < languages.length;a++){
            System.out.println(languages[a]);
        }









    }
}
