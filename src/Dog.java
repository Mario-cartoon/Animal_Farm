class Dog extends Animal implements Farm_Anaimal {

    public void speak() {
        System.out.printf("Гаф \n");

    }

    public Animal create() {
        return new Dog();
    }
}
