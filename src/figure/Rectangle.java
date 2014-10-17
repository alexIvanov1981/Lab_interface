package figure;

/**
 * Created by alexander.ivanov on 10/14/2014.
 */
public class Rectangle implements Figure{
        private double width;
        private double height;
        private String name = "Rectangle";

    public Rectangle(double w, double h){
        this.width = w;
        this.height = h;
    }
        public double calculatePerimeter(){
            return 2*(width + height);
        }
        public double calculateSquare(){
            return width*height;
        }
        public String getName() {return name;}
    }

