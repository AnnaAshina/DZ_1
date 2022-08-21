public class i_totil extends Hygieneitems {
    private int numblayers;

    public i_totil (String name, int price, int amount, int unit, int numblayers){
        super(name, price, amount, unit);
        this.numblayers = numblayers;
    }

    @Override
    public String getInfo(){
        return String.format("%s  numblayers: %d", super.getInfo(), this.numblayers);
    }

}
