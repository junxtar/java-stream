public class Book {
   private Long id;
   private String bookName;
   private String author;
   private String category;
   private double price;

   public Book(Long id, String bookName, String author, String category, double price) {
      this.id = id;
      this.bookName = bookName;
      this.author = author;
      this.category = category;
      this.price = price;
   }

   public String getBookName() {
      return bookName;
   }

   public String getCategory() {
      return category;
   }

   public double getPrice() {
      return price;
   }

   public void setPrice(double price) {
      this.price = price;
   }
}
