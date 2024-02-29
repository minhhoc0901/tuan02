package BTS;
public class Animal {
    private boolean vegetarian;
    private String eats;
    private int noOfLegs;

    public Animal() {}

    public Animal(boolean veg, String food, int legs) {
        this.vegetarian = veg;
        this.eats = food;
        this.noOfLegs = legs;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public String getEats() {
        return eats;
    }

    public void setEats(String eats) {
        this.eats = eats;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }
}
public class Tiger extends Animal {
    private String color;

    public Tiger(boolean veg, String food, int legs) {
        super(veg, food, legs);
        this.color = "Orange with black stripes";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
public class Cow extends Animal {
    private String breed;

    public Cow(boolean veg, String food, int legs, String breed) {
        super(veg, food, legs);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
public class Rabbit extends Animal {
    private boolean hasFluffyTail;

    public Rabbit(boolean veg, String food, int legs, boolean fluffyTail) {
        super(veg, food, legs);
        this.hasFluffyTail = fluffyTail;
    }

    public boolean hasFluffyTail() {
        return hasFluffyTail;
    }

    public void setFluffyTail(boolean fluffyTail) {
        this.hasFluffyTail = fluffyTail;
    }
}
