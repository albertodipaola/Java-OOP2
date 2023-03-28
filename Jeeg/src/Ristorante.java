public class Ristorante {
    private String name;
    public Dish[] dishes;
    public Drink[] drinks;

    public Ristorante(String name, Dish[] dishes, Drink[] drinks) {
        this.name = name;
        this.dishes = dishes;
        this.drinks = drinks;
    }


    public void stampaMenu() {
        System.out.println("Benvenuti a "+this.name);
        System.out.println("MENU");
        
        System.out.println("I nostri piatti:");
        for (Dish dish : this.dishes) {
            System.out.println(dish.getName()+"... $"+dish.getPrice());
        }
        
        System.out.println("Le nostre bevande:");
        for (Drink drink : this.drinks) {
            System.out.println(drink.getName()+"... $"+drink.getPrice());
        }
    }
}
