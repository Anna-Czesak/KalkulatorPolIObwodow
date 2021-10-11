public class Triangle extends Figure implements Printable{

    double base, height, side3, side2;

    public Triangle (double a, double h, double b, double c){
        this.height =h;
        this.base =a;
        this.side2 =b;
        this.side3 =c;
        if(base>side2+side3 || side2>base+side3 || side3>base+side2){ //rzucenie wyjątku
            throw new IllegalArgumentException("wymiary trojkata sa niepoprawne!");
        }
    }

    public void setBase(double base){
        this.base = base;
     }
    public void setHeight(double height){
        this.height = height;
    }
    public void setSide2(double side2){
        this.side2 = side2;
    }
    public void setSide3(double side3){
        this.side3 = side3;
    }

    public double getSide1(){
        return base;
    }
    public double getSide2(){
        return side2;
    }
    public double getSide3(){
        return side3;
    }

    @Override
    public double calculateArea(){
        return base * height *0.5;
    }
    public double calculatePerimeter(){
        return side3 + side2 + base;
    }

    @Override
    public void print(){
        System.out.println("Trójkąt o podstawie: "+ base +" wysokości: "+ height +" oraz pozostałych bokach: "+ side3 +" "+ side2);
        System.out.println("pole trójkąta: "+calculateArea()+" obwód trójkąta: "+calculatePerimeter());
    }
}
