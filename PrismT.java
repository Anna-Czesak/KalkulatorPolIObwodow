public class PrismT extends Prism {

    Triangle base;
    double h;

    public PrismT (Triangle base, double h){
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
