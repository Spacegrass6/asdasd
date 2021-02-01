package containers;

public class ContainerTank extends Container {

    public ContainerTank(int length, int width, int height, int max_Load, double max_Capacity, int tara) {
        super(6058, 2438, 2591, 27200, 31.8, 2380);
    }
    @Override
    protected String generateCargo() // chcę tu zaimportować tablicę possibleCargo z klasy Container i wygenerować randomowy element z rzędów 0 i I
    {
        return getRandomCargo(new int[]{0,1});
    }
}
