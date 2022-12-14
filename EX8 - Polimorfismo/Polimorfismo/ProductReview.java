package Polimorfismo;
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
        if(value <= 10 && value >= 1) {
            this.stars = value;
        } 
        else {
            System.out.println();
            System.out.println("O produto só pode ser avaliado de 1 a 10 estrelas!");
            System.out.println();
        }
    }
    
    @Override
    public void show() {
        super.show();
        System.out.println("Marca: " + brand);
        System.out.println("Estrelas: " + stars);
    }    
}
