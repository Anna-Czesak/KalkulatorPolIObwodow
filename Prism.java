public  class Prism implements Printable  {
    Figure base;
    double h;

    public Prism(Figure base, double h ){ //dodać wyjątek
        this.base=base;
        this.h=h;
        if(h<=0){
            throw new IllegalArgumentException("niepoprawne dane!");
        }
    }

    public  double calculateArea(){
        return 2*base.calculateArea()+base.calculatePerimeter()*h;
    }

    public  double calculateVolume(){
        return base.calculateArea()*h;
    }

    @Override
    public void print() {
        System.out.println("Pole powierzchni graniastosłupa: " + calculateArea() );
        System.out.println ("Objetosc graniastosłupa: " + calculateVolume() );
    }

}
