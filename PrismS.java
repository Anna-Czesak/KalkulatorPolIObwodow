public class PrismS extends Prism {

    Square base;
    double h;

    public PrismS (Square base, double h){
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
