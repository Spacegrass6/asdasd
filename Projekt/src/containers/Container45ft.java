package containers;

public class Container45ft extends Container {

    public Container45ft(int length, int width, int height, int max_Load, double max_Capacity, int tara) {
        super(13716, 2438, 2896, 29050, 88.7, 4800);
    }
    @Override
    protected String generateCargo() // chcę tu zaimportować tablicę possibleCargo z klasy Container i wygenerować randomowy element z rzędów V i VI
    {
        return getRandomCargo(new int[]{5, 6});
    }
}


