package GDSC_1st_HW;

public class Main {
    public static void main(String[] args) {

        NormalCalc calc = new NormalCalc();

        System.out.println("1234 + 4321 = " + calc.plus(1234,4321));
        System.out.println("970 - 170 = " + calc.minus(911, 170));
        System.out.println("2 * 3 = " + calc.mul(2, 3));
        System.out.println("33 / 11 = " + calc.div(33, 11));

        System.out.println();
        System.out.println();

        Cat cat = new Cat();
        Dog dog = new Dog();

        System.out.print("cat says "); cat.speak();
        System.out.println();
        System.out.print("dog says "); dog.speak();
        System.out.println();
    }
}
