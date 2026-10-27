public class TestBook {
    public static void main(String[] args) {
        Author[] authors = {
            new Author("Tan Ah Teck", "ahTeck@somewhere.com", 'm'),
            new Author("Paul Tan", "Paul@nowhere.com", 'm')
        };

        Book book = new Book("Java for Dummy", authors, 19.99, 99);
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm'); // Test the constructor
System.out.println(ahTeck);  // Test toString()
ahTeck.setEmail("paulTan@nowhere.com");  // Test setter
System.out.println("name is: " + ahTeck.getName());     // Test getter
System.out.println("email is: " + ahTeck.getEmail());   // Test getter
System.out.println("gender is: " + ahTeck.getGender()); // Test getter
    

        System.out.println(book);
        System.out.println("Author names: " + book.getAuthorNames());

        book.setPrice(29.95);
        book.setQty(28);
        System.out.println("Name: " + book.getName());
        System.out.println("Price: " + book.getPrice());
        System.out.println("Quantity: " + book.getQty());

        Author[] oneAuthor = {
            new Author("Paul Tan", "paul@somewhere.com", 'm')
        };
        Book anotherBook = new Book("more Java", oneAuthor, 29.95);
        System.out.println(anotherBook);
    }
}
