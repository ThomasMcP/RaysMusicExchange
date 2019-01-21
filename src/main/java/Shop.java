import java.util.ArrayList;

public class Shop implements ISell {

    private ArrayList<ISell> stock;
    private String shopName;

    public Shop(String shopName) {
        this.stock = new ArrayList<>();
        this.shopName = shopName;

    }

    public int getStockAmount() {
        return stock.size();
    }

    public ArrayList<ISell> getStock()
    {
        return stock;
    }

    public void addToStock(ISell item){
        stock.add(item);
    }

    public String getShopName() {
        return shopName;
    }
    
    public double calculateMarkup(ISell item) {
         return item.calculateMarkup();
    }

}
