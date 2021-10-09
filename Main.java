
import java.util.Scanner;

public class Main  {
    public static void main( String[] args ){

        Scanner scanner = new Scanner(System.in);
        int choice;

       do {
           System.out.println("\nWybierz figurę lub prostopadłościan:  ");
           System.out.println("kwadrat - \t 1:  ");
           System.out.println("trójkąt - \t 2:  ");
           System.out.println("koło - \t\t 3:  ");

           System.out.println("prostopadłościan o podstawie kwadratu - \t\t 4:  ");
           System.out.println("prostopadłościan o podstawie trójkąta - \t\t 5:  ");


           System.out.println("Aby wyłączyć program - \t\t 0:  ");

           choice = scanner.nextInt();

            switch(choice){

                case 1:

                    System.out.println("Podaj bok kwadratu: ");
                    double a = scanner.nextDouble();
                    Square square =new Square(a);
                    square.print();
                    break;

                case 2:

                    System.out.println("Podaj podstawę trójkąta: ");
                    double base = scanner.nextDouble();

                    System.out.println("Podaj wysokość trójkąta: ");
                    double height = scanner.nextDouble();

                    System.out.println("Podaj drugi bok trójkąta: ");
                    double side2 = scanner.nextDouble();

                    System.out.println("Podaj trzeci bok trójkąta: ");
                    double side3 = scanner.nextDouble();

                    if (base < side2 + side3 && side2 < side3 + base && side3 < side2 + base){
                        Triangle triangle = new Triangle(base, height, side2, side3);

                        triangle.print();
                    }
                   else{
                       System.out.println("Podano nieodpowiednie dane!");
                    }
                    break;

                case 3:

                    System.out.println("Podaj promień koła: ");

                    double r = scanner.nextDouble();

                    Circle circle = new Circle(r);

                    circle.print();

                    break;

                case 4:

                    System.out.println("Podaj bok kwadratu - podstawy graniastołupa: ");
                    double b = scanner.nextDouble();
                    Square baseOfSquare =new Square(b);

                    System.out.println("Podaj wysokość graniastosłupa: ");
                    double heightOfSquare = scanner.nextDouble();

                    PrismS prism=new PrismS(baseOfSquare, heightOfSquare);

                    System.out.println("Pole graniastosłupa: " + prism.calculateArea());
                    System.out.println("Objetość graniastosłupa: " + prism.calculateVolume());

                    break;

                case 5:

                    System.out.println("Podaj dlugość boku podstawy trójkąta: ");
                    double baseOfPrism = scanner.nextDouble();

                    double side2OfBase = baseOfPrism;

                    double side3OfBase = baseOfPrism; //dodac ze jesli boki sa takie same to obwod - 3*bok

                   double heightOfBase = Math.sqrt(3)* baseOfPrism /2;


                        System.out.println("Podaj wysokosc graniastolupa: ");

                        double hightOfPrism = scanner.nextDouble();

                        Triangle BaseOfPrism = new Triangle(baseOfPrism, heightOfBase, side2OfBase, side3OfBase);

                        PrismT prismT =new PrismT(BaseOfPrism, hightOfPrism);

                        System.out.println("Pole graniastoslupa wynosi: " + prismT.calculateArea());
                        System.out.println("Objetosc graniastoslupa wynosi: " + prismT.calculateVolume());

                    break;

                case 0:
                    break;

                default:
                    System.out.println("Nie wybrano żadnej z figur");
            }
        }while(choice !=0);
    }
}
