package containers;

public class Container40ft extends Container {

    public Container40ft(int length, int width, int height, int max_Load, double max_Capacity, int tara) {
        super(129192, 2438, 2591, 26700, 67.5, 4100);
    }
    @Override
    protected String generateCargo() // chcę tu zaimportować tablicę possibleCargo z klasy Container i wygenerować randomowy element z rzędów II, III i V
    {
        return getRandomCargo(new int[]{2, 3, 5});
    }
}

