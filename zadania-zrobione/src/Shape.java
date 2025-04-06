// Klasa szkieletowa
public sealed abstract class Shape implements ShapeMethods permits Circle, Rectangle, Triangle{
    public void getInfo(){
        System.out.println("To jest Figura.");
    }

    // Template Method
    public final void processShape() {
        getInfo();
        double area = getArea();
        double perimeter = getPerimeter();
        displayResult(area, perimeter);
    }

    protected void displayResult(double area, double perimeter) {
        System.out.printf("Pole: %.2f, Obwod: %.2f%n", area, perimeter);
    }
}