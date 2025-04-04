public non-sealed class Square extends Shape{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public void getInfo() {
        System.out.println("To jest kwadrat o boku " + side + ".");
    }

    // Overloading
    public void getInfo(String label) {
        System.out.println(label + ": kwadrat o boku " + side + ".");
    }
}
