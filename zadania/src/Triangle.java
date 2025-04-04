public non-sealed class Triangle extends Shape{
    private double base;
    private double height;
    private double sideA, sideB, sideC;

    // Konstruktor dla trójkąta równoramiennego lub ogólnego (używając boków)
    public Triangle(double sideA, double sideB, double sideC, double height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.base = sideA; // np. zakładamy, że sideA to podstawa
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public void getInfo() {
        System.out.println("To jest trojkat o bokach " + sideA + ", " + sideB + ", " + sideC + ".");
    }

    // Overloading
    public void getInfo(boolean showAreaPerimeter) {
        getInfo();
        if (showAreaPerimeter) {
            System.out.printf("Pole: %.2f, Obwod: %.2f%n", getArea(), getPerimeter());
        }
    }
}
