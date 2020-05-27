final class Square {
//
//    a. Copy Constructor invoked------------------------>Answer
//            (110.0+115.0i)
//    b. Copy Constructor invoked
//            (0.0+0.0i)
//    c. (110.0+115.0i)
//            d. (0.0+0.0)
    private double length, breadth;
    public Square(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    Square(Square square) {
        System.out.println("Copy constructor invoked");
        length = square.length;
        breadth = square.breadth;
    }

    @Override
    public String toString() {
        return "(" +length + "+" + breadth + "i)";
    }
}

class Main {
    public static void main(String[] args) {
        Square sq1 = new Square(110,115);
        Square sq2 = new Square(sq1);
        Square sq3 = sq1;
        System.out.println(sq1);
    }
}