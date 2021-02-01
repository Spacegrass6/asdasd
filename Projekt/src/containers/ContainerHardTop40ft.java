package containers;

public class ContainerHardTop40ft extends Container {

    boolean is_roof_opened; // to sie przyda potem do zaladunku - z otwartym dachem beda na gorze

    public ContainerHardTop40ft(int length, int width, int height, int max_Load, double max_Capacity, int tara) {
        super(12192, 2438, 2896,27200, 31.8, 2380);
    }

    @Override
    protected String generateCargo() // chcę tu zaimportować tablicę possibleCargo z klasy Container i wygenerować randomowy element z rzędu VI
    {
        return getRandomCargo(new int[]{6});
    }
}

