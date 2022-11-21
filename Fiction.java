public class Fiction extends Book
{
    // constructor
    public Fiction(String name) {
        super(name);
        setPrice();
    }
    // setPrice()
    @Override
    public void setPrice() {
        price = 24.99;
    }
}
