import containers.*;

import java.sql.Array;

public class Main {
    public static void main(String[] args) {
        Container[] containers = new Container[5];
        containers[0] = new Container20ft(6058, 2438, 2591,26235,33.1,2200);
        containers[1] = new Container40ft(129192, 2438, 2591, 26700, 67.5, 4100);
        containers[2] = new Container45ft(13716, 2438, 2896, 29050, 88.7, 4800);
        containers[3] = new ContainerFreezer40ft(12192, 2438, 2591, 26700, 67.5, 4100);
        containers[4] = new ContainerHardTop40ft(12192, 2438, 2896, 30300, 26.0, 4700);

        for(int i = 0; i < 15000; i++) {
            Container container = containers[i];
            System.out.println(
                    container.getID() +
            );
            /*String className = container.getClass().getName();
            className = className.substring(className.lastIndexOf(".") + 1);
            System.out.println("Kontener klasy: " + className);
            System.out.println("Cargo: " + container.getCargo());
            System.out.println("Długość: " + container.getLength());
            System.out.println("Szerokość: " + container.getWidth());
            System.out.println("Wysokość: " + container.getHeight());
            System.out.println("====================================");*/
        }

    }
}
