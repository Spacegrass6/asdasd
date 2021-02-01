package containers;

public class Container20ft extends Container {

    public Container20ft(int length, int width, int height, int max_Load, double max_Capacity, int tara) {
        super(6058, 2438, 2591,26235,33.1,2200);
    }

    @Override
    protected String generateCargo() // chcę tu zaimportować tablicę possibleCargo z klasy Container i wygenerować randomowy element z rzędów II, III i IV
    {
        return getRandomCargo(new int[]{2, 3, 4});
    }
}
