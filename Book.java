public abstract class Book
{
   // attributes
   String title;
   double price;
   // constructor
   public Book(String name) {
       title = name;
   }
   // get and set methods
   public String getTitle() {
       return title;
   }

   public double getPrice() {
       return price;
   }

   public abstract void setPrice();
}
