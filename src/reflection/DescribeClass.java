package reflection;

import java.util.Arrays;

public class DescribeClass {
    public static void main(String[] args) {
        if (args.length != 1)
            System.out.println("Usage: Give the name of a Class and its interfaces will be displayed");
        else {

            try {
                Class<?> strng = Class.forName(args[0]);
                for (Class<?> i : strng.getInterfaces()) {
                    System.out.println(i.getName());
                }
            } catch (ClassNotFoundException e) {
                System.out.println("Class Not Found. Please enter a Java Class");
                //throw new RuntimeException(e);
            }
        }
    }
}
