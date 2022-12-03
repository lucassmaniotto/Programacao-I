package Ex8;
public class ProductReview extends Post implements Evaluable {
    private String brand;
    private int stars;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public int getStars() {
        return stars;
    }

    @Override
    public void evaluate(int value) {
        if(value > 10 || value < 1) {
            System.out.println("Avalie o produto de 1 a 10 estrelas");
        } else {
            this.stars = value;
        }
    }
    
    @Override
    public void show() {
        super.show();
        System.out.println("Brand: " + brand);
        System.out.println("Stars: " + stars);
    }    
}