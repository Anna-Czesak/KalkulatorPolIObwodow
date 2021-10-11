
import java.util.Scanner;

public class Main  {
    public static void main( String[] args ){

        Scanner scanner = new Scanner(System.in);
        int choice;

       do {
           System.out.println("\nWybierz figurę lub graniastołup:  ");
           System.out.println("kwadrat - \t 1:  ");
           System.out.println("trójkąt - \t 2:  ");
           System.out.println("koło \t- \t 3:  ");

           System.out.println("graniastołup o podstawie kwadratu - \t 4:  ");
           System.out.println("graniastołup o podstawie trójkąta - \t 5:  ");
           System.out.println("graniastołup o podstawie koła \t- \t\t 6:  ");


           System.out.println("Aby wyłączyć kalkulator wybierz - \t\t 0:  ");

           choice = scanner.nextInt();

            switch(choice){

                case 1:

                    System.out.println("Podaj bok kwadratu: ");
                    double a = scanner.nextDouble();

                    try{                                    //obsługa wyjątków
                        Square square =new Square(a);
                        square.print();
                    }
                    catch (IllegalArgumentException exception){
                        System.out.println("Podano błędne dane" );
                    }

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

                    try {
                        Triangle triangle = new Triangle(base, height, side2, side3);
                        triangle.print();
                    }
                    catch(IllegalArgumentException exception){
                        System.out.println("Podano błędne dane" );
                    }

                    break;

                case 3:

                    System.out.println("Podaj promień koła: ");
                    double r = scanner.nextDouble();

                    try{                                    //obsługa wyjątków
                        Circle circle = new Circle(r);
                        circle.print();
                    }
                    catch (IllegalArgumentException exception){
                        System.out.println("Podano błędny promień" );
                    }

                    break;

                case 4:

                    System.out.println("Podaj bok kwadratu - podstawy graniastołupa: ");
                    double b = scanner.nextDouble();

                    try{
                        Square baseOfSquare =new Square(b);

                        System.out.println("Podaj wysokość graniastosłupa: ");
                        double heightOfSquare = scanner.nextDouble();

                        Prism prismS=new Prism(baseOfSquare, heightOfSquare);

                        prismS.print();
                    }
                   catch(IllegalArgumentException exception){
                       System.out.println("Podano błędne dane" );
                   }

                    break;

                case 5:

                    System.out.println("Podaj dlugość boku trójkąta - podstawy graniastoslupa: ");
                    double baseOfPrism = scanner.nextDouble(); //długiśc podstawy trójkąta

                    double side2OfBase = baseOfPrism;

                    double side3OfBase = baseOfPrism;

                   double heightOfBase = Math.sqrt(3)* baseOfPrism /2;

                        System.out.println("Podaj wysokosc graniastolupa: ");

                        double hightOfPrismT = scanner.nextDouble();


                    try{
                        Triangle BaseOfPrism = new Triangle(baseOfPrism, heightOfBase, side2OfBase, side3OfBase);

                        Prism prismT =new Prism(BaseOfPrism, hightOfPrismT);

                        prismT.print(); }
                    catch(IllegalArgumentException exception){
                        System.out.println("Podano błędne dane" );
                    }

                    break;

                case 6:

                    System.out.println("Podaj promien kola - podstawy walca: ");
                    double rOfBase = scanner.nextDouble();

                    System.out.println("Podaj wysokosc graniastolupa: ");

                    double hightOfPrism = scanner.nextDouble();

                    try{
                    Circle baseOfPrismC = new Circle(rOfBase);

                    Prism prismC =new Prism(baseOfPrismC, hightOfPrism);

                    prismC.print(); }

                    catch(IllegalArgumentException exception){
                            System.out.println("Podano błędne dane" );
                        }

                    break;

                case 0:
                    break;

                default:
                    System.out.println("Nie wybrano żadnej z figur");
            }
        }while(choice !=0);
    }
}
