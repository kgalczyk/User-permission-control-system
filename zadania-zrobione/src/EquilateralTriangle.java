public class EquilateralTriangle extends Triangle{ // wielokrotne dziedziczenie
    private double side;

    public EquilateralTriangle(double side) {
        // Wszystkie boki są równe, wysokość obliczana automatycznie
        super(side, side, side, (Math.sqrt(3) / 2) * side);
        this.side = side;
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * side * side;
    }

    @Override
    public void getInfo() {
        System.out.println("To jest trojkat rownoboczny o boku " + side + ".");
    }
}
