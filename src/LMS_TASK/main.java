package LMS_TASK;



public class main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Circle.area(circle);
        Circle.circumferense(circle);
    }
}
//Circle деген класс тузунуз, анын PI жана radius деген свойствасы, area
//жана circumference деген статик методдору болсун.
//areaны табуу учун: PI * (radius * radius)
//circumferenceти табуу учун PI * 2 * radius деген формулалар колдонулат