public class Book {
    private String name;
    private Author author;
    private double price;
    private int qty;

    public Book(String name, double price, int qty, Author author){
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.author = author;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getQty(){
        return qty;
    }

    public void setQty(int qty){
        this.qty = qty;
    }

    public Author getAuthor(){
        return author;
    }

    public String toString(){
        return "Author of this book is: " + author + "\n" +  "The book name is: " + name + "\n" + "Price is: "+ price + "\n" + "qty is: " + qty;
    }

    }



