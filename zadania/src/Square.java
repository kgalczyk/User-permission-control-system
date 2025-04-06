public class Square{
    // przykład kompozycji
    private Rectangle rectangle;
    public Square(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public double getArea(){
        return rectangle.getArea();
    }

    public double getPerimeter() {
        return rectangle.getPerimeter();
    }

    public void getInfo(){
        rectangle.getInfo();
    }
}
