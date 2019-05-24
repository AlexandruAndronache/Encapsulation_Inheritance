public class Inheritance_Animal_Dog {

    public class Dog extends Inheritance_Animal {

        private String color;

        @Override
        public void move() {
            System.out.println("Dog is moving");
        }

        public Dog(int age, int numberOfLegs, boolean vegetarian) {
            super(age,numberOfLegs,vegetarian);
        }
    }
}
