public non-sealed class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Overriding
    @Override
    public void getInfo() {
        System.out.println("To jest kolo o promieniu " + radius + ".");
    }

    // Overloading
    public void getInfo(boolean withDetails) {
        if (withDetails) {
            getInfo();
            System.out.printf("Pole: %.2f, Obwod: %.2f%n", getArea(), getPerimeter());
        } else {
            getInfo();
        }
    }
}
