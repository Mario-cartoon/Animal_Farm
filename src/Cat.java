class Cat extends Animal implements Farm_Anaimal {

    public void speak() {

        System.out.printf("Мяу \n");

    }

    public Animal create() {
        return new Cat();
    }
}
