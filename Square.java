public class Square extends Figure implements Printable{

    double a;

    public Square(double a){
        this.a=a;
        if(a<=0){
            throw new IllegalArgumentException();
        }
    }

    public void setA(double a){
        this.a=a;
    }
    public double getA(){
        return this.a;
    }

    @Override
    public double calculateArea(){
        return a*a;
    }
    @Override
    public double calculatePerimeter(){
        return 4*a ;
    }

    @Override
    public void print(){
        System.out.println("Pole kwadratu o boku: "+ a +" wynosi: "+ this.calculateArea());
        System.out.println("Obwód kwadratu o boku: "+ a +" wynosi: "+ this.calculatePerimeter());
    }
}
