public class assignment_1st {
    public static void main(String[] args) {
//     Q1 - Take 2 integer values in two variables x and y and print their product.
        int x = 2;
        int y = 4;
        System.out.println("Product of x and y = "+x*y);

//        Q2 - Print the ASCII value of character ‘U’
        
        int f = 'U';
        System.out.println("The ascii value of U is : "+f);
//        Q3 - Write a Java program to take the length and breadth of a rectangle and print its area.

        int l = 7;
        int b = 4;

        System.out.println("Length of rectangle: "+l);
        System.out.println("Width of rectangle: "+b);
        System.out.println("Area of rectangle: "+l*b);

//        Q4 - Write a Java program to calculate the cube of a number.
        int a = 4;
        System.out.println("Cube on number "+a+" is: "+a*a*a);

//        Q5 - Write a Java program to swap two numbers with the help of a third variable.
        int g = 2;
        int d = 3;
        int e = 1;
        System.out.println("g = "+ d*e+" and d = "+g*e);
//        OR
        int num_1 = 2;
        int num_2 = 3;
        System.out.println("First number before swap is: "+num_1);
        System.out.println("Second number before swap is: "+num_2);
        int temp = num_1;
        num_1=num_2;
        num_2=temp;
//        temp is not a reserved keyword. Any other variable can also be used instead of temp like 'r' ,
        System.out.println("First number after swap is: "+num_1);
        System.out.println("Second number after swap is: "+num_2);

    }
}






