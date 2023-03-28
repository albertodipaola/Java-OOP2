public class Dish {
    private String name;
    private float price;
    private String[] ingredients;

    public Dish(String name, float price, String[] ingredients) {
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
    }

    //getter
    public String getName() {return name;}
    public float getPrice() {return price;}
    public String[] getIngredients() {return ingredients;}
    //setter
    public void setName(String name) {this.name = name;}
    public void setPrice(float price) {this.price = price;}
    public void setIngredients(String[] ingredients) {this.ingredients = ingredients;}

}
