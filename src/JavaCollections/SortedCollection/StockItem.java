package JavaCollections.SortedCollection;

public class StockItem implements Comparable<StockItem>{

    private final String name;
    private double price;
    private int quantitystock = 0;

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantitystock = 0;
    }
    /*Overload the constructor*/
    public StockItem(String name, double price, int quantitystock) {
        this.name = name;
        this.price = price;
        this.quantitystock = quantitystock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int quantityInStock() {
        return quantitystock;
    }

    public void setPrice(double price) {
        if (price > 0.0) {
            this.price = price;
        }
    }

    public void adjustStock(int quantity) {
        int newQuantity = this.quantitystock + quantity;
        if (quantity >= 0){
            this.quantitystock = newQuantity;
        }
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 31;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Entering StockItem.equals");
        if (this == obj){
            return true;
        }
        if ((obj == null) || (obj.getClass() != this.getClass())){
            return false;
        }
        String objName =((StockItem) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int compareTo(StockItem o) {
        System.out.println("Enter in StockItem.compareTo");
        if (this == o ){
            return 0;
        }
        if ( o != null ){
            return  this.name.compareTo(o.getName());
        }

        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return  this.name + " : " + this.price;
    }


}
