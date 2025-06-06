public class StringBuilderConcetps {
    public static void main(String[] args){
        String name = "Ayush Kumar";
        String fullname = "Ayush Kumar";
        fullname = "Not Correct name";

//        System.out.println(name);
//        System.out.println(fullname.charAt(6));

       //Pretty Printing
        float a = 45.15119f;
        System.out.println(a);
        System.out.printf("The formated String is %.2f",a);
        //%s is the placeholder and there are a lot of others for the different values
        System.out.printf("Hello my name is %s and i am %s","Ayush","cool");

        //Now we will talk about the String Builder class
        StringBuilder Value = new StringBuilder("Ayush Kumar");
        Value.append("This is the appended values for the statment");

        StringBuilder builder = new StringBuilder();
        for( int i = 0; i < 26;i++){
            char ch = (char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder);



    }
}
