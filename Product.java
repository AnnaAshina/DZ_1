// ; 1. Название
// ; 2. Цена
// ; 3. Количество
// ; 4. Единица измерения

public class Product {

   // protected static Random r;
    private String name;
    int price;
    int amount;
    private int unit;


    public Product (String name,  int price, int amount, int unit){
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.unit = unit;
    }

    public String getInfo(){
        return String.format("name: %s , price: %d , amount: %d , unit: %d",
            this.name, this.price, this.amount, this.unit);
    }

}

