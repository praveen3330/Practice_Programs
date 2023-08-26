enum Compass1{
    SOUTH,NORTH,EAST,WEST;  

    //SOUTH --- public static final Compass SOUTH = new Result();
    //NORTH --- public static final Compass NORTH = new Result();
    //EAST --- public static final Compass EAST = new Result();
    //WEST --- public static final Compass WEST = new Result();

    Compass1(){                     // for enum constructors we must not specify access modifiers like public,Default,etc--  except privtae
        System.out.println("Constructor is called");
    }
}
public class Enum2 {

    public static void main(String[] args) {
        Compass1 cmp = Compass1.SOUTH;         //constructor is called for four times because there are 4 constants
        System.out.println(cmp);

        System.out.println();
        Compass1 cmp1[] = Compass1.EAST.values();
        for(Compass1 cmp2 : cmp1) {
            System.out.println(cmp2.ordinal() + ":" + cmp2.name());
        }
    }
}
