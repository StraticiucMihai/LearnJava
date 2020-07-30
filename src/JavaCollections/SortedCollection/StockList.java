package JavaCollections.SortedCollection;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {

    private final Map<String , StockItem> list ;

    public StockList() {
        this.list = new LinkedHashMap<>();
    }

    /*used to add elements in the list of items*/
    public int addStock(StockItem item){
        if (item != null){
            StockItem inStock = list.getOrDefault(item.getName(), item); /*parameter 1 is the name of the item to look after and return it
                                                                           parameter 2  item used in case that it is not found though the mame passed at parameter 1*/
            if (inStock != item){
                item.adjustStock(inStock.quantityInStock());
            }
            list.put(item.getName(), item);
            return  item.quantityInStock();
        }
        else {
            return 0;
        }
    }

    public int sellStock(String item , int quantity){
        StockItem inStock = list.getOrDefault(item,null);

        if ( (inStock != null) && (inStock.quantityInStock() >= quantity) && (quantity >0)){
            inStock.adjustStock(-quantity);
            return quantity;
        }
        else {
            return 0;
        }
    }

    public StockItem get(String item ){
        return list.get(item);
    }

    public Map<String, StockItem> Items(){
        return Collections.unmodifiableMap(list); /* Return a map that cant be modified */
    }

    @Override
    public String toString() {
        String s = "\nStockList\n";
        double totalCost = 0.0;
        for (Map.Entry<String,StockItem> itemEntry: list.entrySet()){
            StockItem stockItem = itemEntry.getValue();

            double itemValue = stockItem.getPrice() * stockItem.quantityInStock();

            s = s + stockItem + ".There are : " + stockItem.quantityInStock() + " in stock. Value of items " +
                    String.format("%.2f",itemValue) + "\n";
            totalCost += itemValue;
        }
        return s+ "Total cost is: " + totalCost;
    }



}
