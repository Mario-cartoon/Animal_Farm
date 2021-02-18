class Fish extends Animal implements Farm_Anaimal {

    public void speak() {

        System.out.printf("Буль  \n");

    }

    public Animal create() {
        return new Fish();
    }


}
