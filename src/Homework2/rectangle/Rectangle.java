package Homework2.rectangle;

public class Rectangle {
    int length;
    int width;
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int calculateArea(){
        int length = this.length;
        int width = this.width;

        return length * width;
    }

    public static void main(String[] args) {
        Rectangle rec = new Rectangle(5, 14);
        System.out.println(rec.calculateArea());
    }

}
