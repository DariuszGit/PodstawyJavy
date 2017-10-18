package java2;

public class Java2
{
    public static void main(String[] args)
    {
        System.out.println("Hello");
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[0] + " " + args[1]);
        
        //wyswietlic pierwsz znak parametru pierwszego
        System.out.println(args[0].charAt(0));
        
        //wyswietlic dlugosc paramteru pierwszego
        System.out.println(args[0].length());
        
        //wyswietlic ostatni znak parametru pierwszego
        System.out.println(args[0].charAt(args[0].length() - 1));
        
        //wyswietlic znaki z parametru pierwszego jeden pod drugim
        //kazdy w nowej linii
        
        for(int i = 0; i < args[0].length(); i++)
        {
            System.out.println(args[0].charAt(i));
        }
        
        //wywietlic znaki z parametru pierwszego od konca
        for(int i = args[0].length() - 1; i >= 0; i--)
        {
            System.out.println(args[0].charAt(i));
        }
        
        //wyswietlic parametr pierwszy z duzych liter
        //a paramter drugi z malych
        System.out.println(args[0].toUpperCase());
        System.out.println(args[1].toLowerCase());
        
        System.out.println(args[2]);
        System.out.println(args[3]);
        
        int wzrost = Integer.parseInt(args[2]);
        int waga = Integer.parseInt(args[3]);
        System.out.println(wzrost + 5);
        System.out.println(waga + 2);
        
        double wzrostM = wzrost / 100.0;        
        double bmi = waga / (wzrostM * wzrostM);
        
        System.out.println(bmi);
        
        System.out.println("------------------");
        //Witaj chlopaku/dziewczyno
        //rozpoznac po ostatnin znaku parametru pierwszego
        //nazywasz sie: imie nazwisko
        //imie i nazwisko pierwsze litera duza reszta mala
        //Twoj indeks bmi wynosi
        //Twoja waga jest za mala/prawidlowa/za duza
        
        if (args[0].charAt(args[0].length() - 1) == 'a')
        {
            System.out.println("Witaj dziewczyno"); 
        }
        else
        {
            System.out.println("Witaj chlopaku");
        }
        System.out.println("Nazywasz sie: " + args[0].substring(0, 1).toUpperCase() +
                args[0].substring(1, args[0].length()).toLowerCase() +
                " " +
                 args[1].substring(0, 1).toUpperCase() +
                args[1].substring(1, args[1].length()).toLowerCase());
        
        System.out.println("Twoj indeks bmi wynosi: " + bmi);
        if (bmi < 17)
        {
            System.out.println("Twoja waga jest za mala");
        }
        else if (bmi < 20)
        {
            System.out.println("Twoja waga jest prawidlowa");
        }
        else
        {
            System.out.println("Twoja waga jest za duza");
        }
    }    
}
