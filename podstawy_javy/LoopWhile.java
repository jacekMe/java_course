package podstawy_javy;

public class LoopWhile {
    public static void main(String[] args) {
        String[] cyclingRaces =
                {
                        "Strade Bianche",
                        "Milan-Sanremo",
                        "Ronde van Vlaanderen",
                        "Paris-Roubaix",
                        "La Fleche Wallonge",
                        "Liege-Bastogne-Liege",
                        "Giro d'Italia",
                        "Tour de France",
                        "La Vuelta Espana",
                        "Il Lombardia"
                };
        int i = 0;
        while(i < cyclingRaces.length)
        {
            System.out.println(cyclingRaces[i]);

            i++;
        }
/*
        i = 0;
        do
        {
            System.out.println(cyclingRaces[i]);

            i++;
        }while(i < cyclingRaces.length);
 */
    }
}
