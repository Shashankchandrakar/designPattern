package singleton;

import java.util.HashMap;

enum Subsystem
{
    PRIMARY,
    AUXILIARY,
    FALLBACK
}

class Printer
{
    private static int INSTANCE_COUNT = 0;

    private Printer()
    {
        INSTANCE_COUNT++;
        System.out.println("A total of " +
                INSTANCE_COUNT + " instances created so far.");
    }

    private static final HashMap<Subsystem, Printer>
            INSTANCES = new HashMap<>();

    public static Printer get(Subsystem ss)
    {
        if (INSTANCES.containsKey(ss))
            return INSTANCES.get(ss);

        Printer instance = new Printer();
        INSTANCES.put(ss, instance);
        return instance;
    }
}

public class MultitonSingleton {
    public static void main(String[] args) {
        Printer main = Printer.get(Subsystem.PRIMARY);
        Printer aux = Printer.get(Subsystem.AUXILIARY);
        Printer aux2 = Printer.get(Subsystem.AUXILIARY);
    }
}

