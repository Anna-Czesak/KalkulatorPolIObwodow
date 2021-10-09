public class Square extends Figure implements Printable{

    double a;

    public Square(double a){
        this.a=a;
    }

    public void setA(double a){
        this.a=a;
    }
    public double getA(){
        return this.a;
    }

    public double calculateArea(){
        return a*a;
    }
    public double calculatePerimeter(){
        return 4*a ;
    }

    public void print(){
        System.out.println("Pole kwadratu o boku: "+ a +" wynosi: "+ this.calculateArea());
        System.out.println("Obwód kwadratu o boku: "+ a +" wynosi: "+ this.calculatePerimeter());
    }
}
