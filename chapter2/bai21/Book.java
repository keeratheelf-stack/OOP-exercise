public class Book {
    private String name;
    private Author author;
    private double price;
    private int qty = 0;

    public Book(String n, Author a, double p){
        name = n;
        author = a;
        price = p;
    }

    public Book (String n, Author a, double p, int q){
        name = n;
        author = a;
        price = p;
        qty = q;
    }

    public String getName(){
        return name;
    }

    public Author getAuthor(){
        return author;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double p){
        price = p;
    }
    
    public int getQty(){
        return qty;
    }

    public void setQty(int q){
        qty = q;
    }

    public String getAuthorName() {
   return author.getName();
    }

    public String getAuthorEmail() {
   return author.getEmail();
    }

    public char getAuthorGender() {
   return author.getGender();
    }

    public String toString(){
        return "Book[name=" + name + "," + author
        + ",price=" + price + ",qty=" + qty + "]";
    }    
}
