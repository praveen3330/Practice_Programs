//NORTH SOUTH EAST WEST
//MALE FEMALE OTHERS
// SUN MON TUE WED THU FRI SAT
//JAN FEB MAR ------ DEC
// PASS FAIL NR
// so on.......


//constant is called when the variable is final
enum Result{
     PASS,FAIL,NR;    // we have to give the constant names in capitals only
     // fields --> instance var --> properties
     //methods
     //Constructor
}

enum Gender{
     MALE,FEMALE,OTHERS;    //in enum these are defaultly public static final
}

enum compass{
     NORTH,SOUTH,EAST,WEST;
}


class Demo{
      final int PASS=35;  //in class we have to specify access modifiers
      //PASS --> error    //in class we cannot write enums without access modifiers;
}

//separte .clasFile for every enum
public class Enum1 {
      enum compass{            //In class also we can write enums
           SOUTH,EAST,NORTH,WEST;
}

public static void main(String[] args) {
// TODO Auto-generated method stub

      }
}