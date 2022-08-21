public class i_milk extends Drink {
    private int fatmilk;
    private int datamilk;
    private int value;

    public i_milk (String name, int price, int amount, int unit, int fatmilk, int datamilk, int value ){
        super(name, price, amount, unit);
        this.datamilk = datamilk;
        this.fatmilk = fatmilk;
        this.value = value;
    }
    @Override
    public String getInfo(){
        return String.format("%s fatmilk: %d, datamilk: %d, value: %d", 
            super.getInfo(), this.fatmilk, this.datamilk, this.value);
    }
}