public class Circle extends Figure implements Printable {

    public final double PI = 3.14;
    double r;

    public Circle(double r) {
        this.r=r;
        if (r <= 0) {
            throw new IllegalArgumentException("dlugosc promienia musi byc dodatnia!");
        }
    }
    @Override
    public double calculateArea(){
        return PI*r*r;
    }

    @Override
    public double calculatePerimeter(){
        return 2*PI*r;
    }

    public void setR(double r){
        this.r=r;
    }

    @Override
    public void print(){
        System.out.println("Pole koła o promieniu: "+ r + " wynosi: "+ calculateArea());
        System.out.println("Obwód koła o promieniu: "+ r + " wynosi: "+ calculatePerimeter());
    }
}
