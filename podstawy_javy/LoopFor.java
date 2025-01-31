package podstawy_javy;

public class LoopFor {
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

         // for(INICJALIZACJA ZMIENNYCH; WARUNEK PĘTLI; CO MA ZROBIĆ PO WYKONANIU WSZYSTKICH INSTR. W PĘTLI)
        for(int i = 0; i < cyclingRaces.length; i++)
        {
            System.out.println("Wyścig nr " + (i + 1) + " to: " + cyclingRaces[i]);
        }

        // ENHANCED FOR

//        for(String nameRace: cyclingRaces)
//        {
//            System.out.println(nameRace);
//        }
    }
}
