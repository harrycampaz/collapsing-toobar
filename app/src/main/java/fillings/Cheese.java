package fillings;

public abstract class Cheese implements Filling {

    private String name;
    private int image;
    private int kcal;
    private boolean veg;
    private float price;


    public Cheese() {
    }

    @Override
    public abstract String getName();

    @Override
    public abstract int getImage();
    @Override
    public abstract int getKCal();

    @Override
    public abstract boolean isVeg();

    @Override
    public abstract float getPrice();
}
