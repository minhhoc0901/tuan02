// Lớp cha Shape
class Shape {
    // Thuộc tính
    private String color;

    // Constructor
    public Shape(String color) {
        this.color = color;
    }

    // Phương thức tính diện tích (được ghi đè bởi các lớp con)
    public double calculateArea() {
        return 0.0;
    }

    // Getter cho màu sắc
    public String getColor() {
        return color;
    }
}

// Lớp con Circle kế thừa từ Shape
class Circle extends Shape {
    // Thuộc tính bổ sung cho Circle
    private double radius;

    // Constructor
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    // Ghi đè phương thức tính diện tích cho Circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Lớp con Rectangle kế thừa từ Shape
class Rectangle extends Shape {
    // Thuộc tính bổ sung cho Rectangle
    private double width;
    private double height;

    // Constructor
    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    // Ghi đè phương thức tính diện tích cho Rectangle
    @Override
    public double calculateArea() {
        return width * height;
    }
}

// Ví dụ sử dụng
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5.0);
        Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0);

        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Rectangle area: " + rectangle.calculateArea());
    }
}