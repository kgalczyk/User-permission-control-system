# User-permission-control-system

> [!IMPORTANT]
 Klasy `Triangle`, `Rectangle` oraz `Circle` dziedziczą po klasie `Shape`.
 Klasa `EquilateralTriangle` dziedziczy po klasie `Triangle`.



##Zad 1.
Pokaż działanie polimorfizmu na zasadzie metody `public void getInfo()` oraz w klasie potomnej `Circle` przeciąż tę metodę, aby ukazać zjawisko Overloadingu.
##Zad 2.
Nadpisz metody `getArea()` oraz `getPerimeter()` w klasach potomnych tak, aby poprawnie zwracały wyniki dla danych figur. Każdorazowo zastosuj adnotację `@Override`.
##Zad 3.
Edytuj interfejs `ShapeMethods` w taki sposób, aby jego metody miały domyślne działanie: zwracały wartość 0.
##Zad 4.
Uzyskaj pełne zachowanie wzorca **Template Method** za pomocą metody `public final void processShape()`.
##Zad 5.
Ogranicz możliwość dziedziczenia z klasy `Shape` do klas `Circle`, `Rectangle` oraz `Triangle`.
##Zad 6.
Uzupełnij klasę `EquilateralTriangle` tak, aby dziedziczyła po klasie `Triangle`. Nadpisz metodę `getArea()` w celu optymalnego wyliczania pola.
##Zad 7.
Zamiast dziedziczenia można użyć tak zwanej **kompozycji**. Napisz klasę `Square`, która nie będzie dziedziczyć po klasie `Rectangle`, ale będzie wykorzystywać jej obiekt do swoich celów.
