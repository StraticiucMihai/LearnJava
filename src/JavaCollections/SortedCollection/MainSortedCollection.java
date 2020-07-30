package JavaCollections.SortedCollection;

import java.util.LinkedList;
import java.util.List;

public class MainSortedCollection {
    private static StockList stockList = new StockList();
    private List<Integer> newList = new LinkedList<>();
    public static void main(String[] args) {

        StockItem item = new StockItem("Bread", 0.86, 100);
        stockList.addStock(item);
        item = new StockItem("Cake", 1.10, 7);
        stockList.addStock(item);
        item= new StockItem("BMW",60000,100);
        stockList.addStock(item);
        item= new StockItem("Chair",62.0,200);
        stockList.addStock(item);
        item= new StockItem("Cup",10,150);
        stockList.addStock(item);
        item= new StockItem("Dor",30.5,10);
        stockList.addStock(item);
        item= new StockItem("Phone",96.99,300);
        stockList.addStock(item);
        item= new StockItem("Vase",10.66,40);
        stockList.addStock(item);
        /*Print all items in the stockList*/
        System.out.println(stockList);
        for (String s: stockList.Items().keySet()){
            System.out.println(s);
        }

        Basket myBasket =  new Basket("Mihai");
        sellItem(myBasket,"BMW", 1);
        System.out.println(myBasket);
        sellItem(myBasket,"scanner",10);
        sellItem(myBasket,"Dor",5);
        System.out.println(myBasket);
        sellItem(myBasket,"Dor",20);
        sellItem(myBasket,"Vase",20);
        System.out.println(myBasket);





    }

    public static int sellItem(Basket basket, String item, int quantity){
        //receive an item from stick list
        StockItem stockItem = stockList.get(item);
        if (stockItem == null){
            System.out.println("Can't sell " +item);
            return 0;
        }
        if (stockList.sellStock(item, quantity) != 0){
            basket.addToBasket(stockItem, quantity);
            return quantity;
        }
        return 0;
    }

}
