public class PrismC extends Prism {

    Circle base;
    double h;

    public PrismC (Circle base, double h){
        this.base=base;
        this.h=h;
    }
    public double calculateArea() {
        return 2*base.calculateArea()+base.calculatePerimeter()*h;
    }
    public double calculateVolume() {
        return base.calculateArea()*h;
    }
}
