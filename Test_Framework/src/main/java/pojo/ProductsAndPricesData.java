package pojo;

public class ProductsAndPricesData {

    private String product;
    private String id;
    private String usd;
    private String eur;
    private String pnd;

    public ProductsAndPricesData(String productName, String productId, String priceDollars, String priceEuros, String pricePounds){

        this.product = productName;
        this.id = productId;
        this.usd = priceDollars;
        this.eur = priceEuros;
        this.pnd = pricePounds;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsd() {
        return usd;
    }

    public void setUsd(String usd) {
        this.usd = usd;
    }

    public String getEur() {
        return eur;
    }

    public void setEur(String eur) {
        this.eur = eur;
    }

    public String getPnd() {
        return pnd;
    }

    public void setPnd(String pnd) {
        this.pnd = pnd;
    }

    @Override
    public String toString(){
        return (String.format("Product: %s | Id: %s | USD: %s | EUR: %s | PND: %s", product, id, usd, eur, pnd));
    }
}
