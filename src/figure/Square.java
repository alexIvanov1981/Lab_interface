package figure;

/**
 * Created by alexander.ivanov on 10/14/2014.
 */
public class Square implements Figure{
        private double side;
        private String name = "Square";

    public Square(double s){
        this.side = s;
    }
        public double calculatePerimeter(){
            return 4*side;
        }
        public double calculateSquare(){
            return Math.pow(side,2);
        }
        public String getName() {return name;}
}

