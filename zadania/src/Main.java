public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape square = new Square(4);
        Shape triangle = new Triangle(3, 4, 5, 2.5);
        Shape equiTriangle = new EquilateralTriangle(10);

        circle.getInfo();         //(polimorfizm)
        square.getInfo();
        triangle.getInfo();
        equiTriangle.getInfo();

        System.out.println();

        // Overloading
        ((Circle) circle).getInfo(true);
        ((Square) square).getInfo("Figura");
        ((Triangle) triangle).getInfo(true);
        ((EquilateralTriangle) equiTriangle).getInfo(true);


        // Template Method
        circle.processShape();
        square.processShape();
        triangle.processShape();
        equiTriangle.processShape();
    }
}
