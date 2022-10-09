public class Product {

    //public Product(int id, String name, String description, double price, int stockAmount, String kod) {
        public Product() {
        System.out.println("Yapıcı Blok çalıştı");
        this.id=id;             //overloading -- asırı yükleme denir
        this.name=name;
        this.price=price;
        this.kod=kod;
        this.description=description;
        this.stockAmount=stockAmount;
    }

    //Attribütes veya field denir
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String kod;

    //getter
    public int getId() {
        return id;
    }

    //setter
    public void setId(int id) {
        this.id = id;
    } //this benim içerisinde bulunduğum class demektir.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getKod() {
        return this.name.substring(0, 1) + id;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }
}

