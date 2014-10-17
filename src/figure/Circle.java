package figure;

/**
 * Created by alexander.ivanov on 10/14/2014.
 */
public class Circle implements Figure{
    private double radius;
    private String name = "Circle";

    public Circle(double r){
        this.radius = r;
    }
    public double calculatePerimeter(){
        return 2*radius*Math.PI;
    }
    public double calculateSquare(){
        return Math.PI*Math.pow(radius,2);
    }
    public String getName() {return name;}
}
