/**
 * @author: Aleksander Ivanov
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import figure.Circle;
import figure.Figure;
import figure.Rectangle;
import figure.Square;


public class UserInterface {

    public static void showMenu(){
        System.out.println();
        System.out.println("Select figure");
        String menu[] = {"1. Circle","2. Rectangle", "3. Square", "4. Exit"};
        for(int i = 0; i < menu.length; i++) {
            System.out.println(menu[i] + "  ");
        }
    }

    public static int waitForInput(){
        int input = 0;
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()) { // true if int value entered
            input = sc.nextInt(); // reads int value from thread and saves to input parameter
        }
        return input;
    }

    public static void main(String[] args) {
        List<Figure> list = new ArrayList<Figure>();

        Scanner sc = new Scanner(System.in);

        int input = 0;

        while (input < 4) {

        double width = 0;
        double height = 0;
        double side = 0;
        double radius = 0;

        if (input == 1) {
            System.out.println("Circle is selected");
            System.out.println("Set radius of the Circle");
            System.out.print("radius:");
            if(sc.hasNextDouble()) { // true if double value entered
                radius = sc.nextDouble(); // reads double value from thread and saves to input parameter
            }
            Figure f = new Circle(radius);
            System.out.println("Circle Circumference is: " + f.calculatePerimeter());
            System.out.println("Circle Square is: " + f.calculateSquare());
            list.add(f);
         }

        if (input == 2) {
            System.out.println("Rectangle is selected");
            System.out.println("Set width and height of the Rectangle");
            System.out.print("width:");
            if(sc.hasNextDouble()) { // true if double value entered
                width = sc.nextDouble(); // reads double value from thread and saves to input parameter
            }
            System.out.print("height:");
            if(sc.hasNextDouble()) { // true if double value entered
                height = sc.nextDouble(); // reads double value from thread and saves to input parameter
            }

            Figure f = new Rectangle(width, height);
            double perimeter = f.calculatePerimeter();
            System.out.println("Rectangle perimeter is:" + perimeter);
            System.out.println("Rectangle Square is: " + f.calculateSquare());

            list.add(f);
        }

        if (input == 3) {
            System.out.println("Square is selected");
            System.out.println("Set side of the Square");
            System.out.print("side:");
            if(sc.hasNextDouble()) { // true if double value entered
                side = sc.nextDouble(); // reads double value from thread and saves to input parameter
            }
            Figure f = new Square(side);
            double perimeter = f.calculatePerimeter();
            System.out.println("Square perimeter is: "+perimeter);
            System.out.println("Square area is: " + f.calculateSquare());

            list.add(f);
        }
            showMenu();
            input = waitForInput();

    }

        for (int i=0; i<list.size(); i++)
        {
            Figure figure = list.get(i);
            System.out.println("Figure name: " + figure.getName());
            if (figure.getName()== "Circle")
            {
                System.out.println("Circle Circumference: "+ figure.calculatePerimeter());
            }
            else
            {
                System.out.println("Figure Perimeter: "+ figure.calculatePerimeter());
            }
            System.out.println("Figure Square: "+ figure.calculateSquare());
        }


    }
}


