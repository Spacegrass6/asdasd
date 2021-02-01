package containers;

public class ContainerFreezer40ft extends Container {

    public ContainerFreezer40ft(int length, int width, int height, int max_Load, double max_Capacity, int tara) {
        super(12192, 2438, 2896, 30300, 26.0, 4700);
    }
    @Override
    protected String generateCargo() // chcę tu zaimportować tablicę possibleCargo z klasy Container i wygenerować randomowy element z rzędu IV
    {
        return getRandomCargo(new int[]{4});
    }
}
