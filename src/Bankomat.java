import java.util.Scanner;

public class Bankomat {
    public static void main (String args[])
    {
        Karta karta1 = new Karta("xyz", 1234);

        Scanner scanner = new Scanner(System.in);
        int y = 0;
        String id;
        String crb;
        String wplac = "WPLATA";
        String wyplac = "WYPLATA";
        int x;

        System.out.println("Włóż kartę (podaj 3-literowy kod): ");
        id = scanner.next();
        System.out.println("Twój stan konta to: " + karta1.getSumkonta() + " zł");
        while (y==0){
        if (id.equals(karta1.getIdkarty())){

            System.out.println("Wpisz WPLATA lub WYPLATA: ");
            crb = scanner.next();
            if (crb.equals(wplac))
            {System.out.println("Podaj kwotę, którą chcesz wpłacić: ");
               x = scanner.nextInt();
                int stan = x + karta1.getSumkonta();
                System.out.println("Obecny stan konta to: " + stan);

            }

            else if (crb.equals(wyplac))
                {System.out.println("Podaj kwotę, którą chcesz wypłacić: ");
                    x = scanner.nextInt();
                    int stan = karta1.getSumkonta() - x;
                    if (x<= karta1.getSumkonta())
                    {
                    System.out.println("Obecny stan konta to: " + stan + " zł");
                    }
                    else
                    System.out.println("Operacja niemożliwa. Nie masz tyle pieniędzy na koncie.");}
            else
                System.out.println("Coś poszło nie tak");}


        else
            System.out.println("Odmowa. ");


    }}
}
