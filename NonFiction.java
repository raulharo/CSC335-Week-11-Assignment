public class NonFiction extends Book
{
    // constructor
    public NonFiction(String name) {
        super(name);
        setPrice();
    }
    // setPrice()
    @Override
    public void setPrice() {
        price = 37.99;
    }
}
