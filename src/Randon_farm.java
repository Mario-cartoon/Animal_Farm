import java.util.Random;

class Randon_farm implements Farm_Anaimal {
    Farm_Anaimal[] factories;
    Random r = new Random();

    public Randon_farm(Farm_Anaimal[] factories) {
        this.factories = factories;
    }

    @Override
    public Animal create() {
        int ind = r.nextInt(factories.length);
        return factories[ind].create();
    }
}
