public class App {
    public static void main(String[] args) throws Exception {
        Dish dish1 = new Dish("entrecotte", 12, new String[]{"carne", "grana", "pomodorini"});
        Dish dish2 = new Dish("pizza", 6, new String[]{"pomodoro", "mozzarella"});
        
        Drink drink1 = new Drink("birra", 5);
        Drink drink2 = new Drink("coca cola", 3);
        Drink drink3 = new Drink("acqua", 2);

        Ristorante ristorante = new Ristorante(
            "La Trattoria dei sogni",
            new Dish[]{dish1, dish2}, 
            new Drink[]{drink1, drink2, drink3}
        );
        ristorante.stampaMenu();


    }
}
