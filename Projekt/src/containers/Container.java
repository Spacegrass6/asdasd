package containers;

// klasa abstrakcyjna - nie można utworzyć obiektu tego typu
// należy utworzyć klasę dziedziczącą po Container i implementującą metody abstrakcyjne
// w tym wypadku: generateCargo
// w ten sposób zabezpieczamy się przed tym, że obiekt nie ma wypełnionego pola cargo
// a każda dziedzicząca klasa ma swój sposób tworzenia wartości pola cargo

public abstract class Container {
    // albo używamy snake_case, albo camelCase - nie mieszamy :)
    // w przypadku Javy przyjęło się używanie camelCase dla zmiennych i funkcji oraz CamelCase dla klas
    // Dobrą praktyką jest pisanie wszystkiego (nazwy parametrów, funkcji i klas) po angielsku :)
    private int length; //mm
    private int width; //mm
    private int height; //mm
    private int maxLoad; //kg
    private double maxCapacity; //m3
    private int tara; //waga wlasna
    private String cargo;
    private int[] idArray;
    private int id;

    public static String[][] possibleCargo = {
            {"Chemicals", "Milk", "Water", "Fuel"},  // 0
            {"Butadiene", "Ethylene", "LPG", "LNG", "Propylene", "Ammonia", "Chlorine"}, // I
            {"Concrete", "Grains", "Sand", "Sugar", "Rice", "Seeds", "Coal", "Fertilizers"}, // II
            {"Fruits", "Coffee", "Vegetables", "Groats", "Pasta", "Tea"}, // III
            {"Frozens foods", "Medicines"}, // IV
            {"Electronics", "Computers", "Barrels", "Building Materials", "Music instruments"}, // V
            {"Car", "Agricultular Machines", "Construction machinery"} // VI
    };


    public Container(int length, int width, int height, int maxLoad, double maxCapacity, int tara) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.maxLoad = maxLoad;
        this.maxCapacity = maxCapacity;
        this.tara = tara;
        setCargo(generateCargo());
    }

    public Container(int id)
    {
        this.id = id;
    }


    // funkcje dostępne tylko dla klas dziedziczących - nie ma sensu dawać public, jeśli nie będzie się
    // z nich korzystać poza klasą

    protected abstract String generateCargo();

    protected String getRandomCargo(int[] rows) {
        int row = rows[ (int) Math.floor(Math.random() * rows.length) ];
        String[] cargoRow = possibleCargo[row];
        int item = (int) Math.floor(Math.random() * cargoRow.length);
        try {
            return cargoRow[item];
        } catch(IndexOutOfBoundsException e) {
            e.printStackTrace();
            return "";
        }
    }

    // getters & setters
    // parametry powinny być private/protected - odnosimy się do nich zgodnie z konwencją przez metody get/set
    // w ten sposób żaden zewnętrzny obiekt nie będzie miał bezpośredniego dostępu do pól

    // przydatne, kiedy przy ustawianiu pola jest potrzebne wykonanie jakichś obliczeń
    // jeśli by się chciało ustawić coś z zewnątrz, to trzeba by było powtórzyć kod z obliczeniami
    // np: setLength(int length) { this.length = length * 100; }
    // w innym miejscu: container.length = someLength * 100;
    // a tak, to można użyć: container.setLength(someLength) i z głowy :D

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(int maxLoad) {
        this.maxLoad = maxLoad;
    }

    public double getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(double maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getTara() {
        return tara;
    }

    public void setTara(int tara) {
        this.tara = tara;
    }

    public int[] generateID()
    {
        int[] Array = new int[15000];
        for (int i = 1; i <= 15000; i++){
          Array[i] = i;
        }
        return Array;
    }

    public int getID(int[] Array)
    {
        int id = 0;
        for (int i = 1; i <= Array.length; i++){
            id = i;
        }
        return id;
    }
}


