public non-sealed class Rectangle extends Shape{
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public double getPerimeter() {
        return 2 * sideA + 2 * sideB;
    }

    @Override
    public void getInfo() {
        System.out.println("To jest prostokat o bokach " + sideA + " i "+ sideB +".");
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }
}
