public class homeappliancesstore {
    static String Compname;
    static String Compadress;
    static int AllEmployes;

    static void deviceStatus(Device ask){
        System.out.println(ask.status());
    }



    public static void main(String[] args) {

        //Fridge1
        Device Fridge1;
        Fridge1 = new Fridge(175, 87, 70, "bosch", "GSLV70PZTM", "PSIGIO NTOULAPA", 430, 55, "yes", "no", "yes", "white" );
        //Fridge2
        Device Fridge2;
        Fridge2 = new Fridge(189 , 90, 75, "Sharp", "RSQ54VB7", "PSIGIO NTOULAPA", 343, 58, "yes", "yes", "yes", "white");

        //WashingMachine1
        Device WashingMachine1;
        WashingMachine1 = new WashingMachine(90, 60, 56, "bosch", "F95KS153", "emprosthias fortisias", 63/100, 74, 9, 1400, "no", "white"  );
        //WashingMachine2
        Device WashingMachine2;
        WashingMachine2 = new WashingMachine(87, 60, 55, "bosch", "TY6489KJL", "emprosthias fortisias", 89/100, 66, 10, 1600, "no", "white");

        //Oven1
        Device Oven1;
        Oven1 = new Oven(59, 59, 54, "Pitsos ", "BAMKGL00", "hlektrikos", 697, 54, "yes", 255, "yes", "white" );
        //Oven2
        Device Oven2;
        Oven2 = new Oven(59, 59, 54, "Siemens ", "HWAGWES0", "hlektrikos", 420, 57, "no", 245, "yes", "black");

        //AirCondition1
        Device AirCondition1;
        AirCondition1 = new AirCondition(987, 305, 263, "Midea ", "MRP/F12FSV", "AC", 388, 72, 18000, "yes", "no", "grey");
       //AirCondition2
        Device AirCondition2;
        AirCondition2 = new AirCondition(875, 289, 215, "TCL ", "058CHPEGD", "AC", 040, 78, 19000, "yes", "yes", "white");

        //Fridge
        System.out.println("First Fridge : " + '\n' + Fridge1);
        Fridge1.PowerOn();
        deviceStatus(Fridge1);
        System.out.println('\n');

        System.out.println("Second Fridge : " + '\n' + Fridge2);
        Fridge2.PowerOff();
        deviceStatus(Fridge2);
        System.out.println('\n');

        //WashingMachine
        System.out.println("First WashingMachine : " + '\n' + WashingMachine1);
        WashingMachine1.PowerOn();
        deviceStatus(WashingMachine1);
        System.out.println('\n');

        System.out.println("Second WashingMachine : " + '\n' + WashingMachine2);
        WashingMachine2.PowerOff();
        deviceStatus(WashingMachine2);
        System.out.println('\n');

        //Oven
        System.out.println("First Oven : " + '\n' + Oven1);
        Oven1.PowerOn();
        deviceStatus(Oven1);
        System.out.println('\n');

        System.out.println("Second Oven : " + '\n' + Oven2);
        Oven2.PowerOff();
        deviceStatus(Oven2);
        System.out.println('\n');

        //AirCondition
        System.out.println("First AirCondition = " + '\n' + AirCondition1);
        AirCondition1.PowerOn();
        deviceStatus(AirCondition1);
        System.out.println('\n');

        System.out.println("Second AirCondition = " + '\n' + AirCondition2);
        AirCondition2.PowerOff();
        deviceStatus(AirCondition2);
        System.out.println('\n');

        int count =  Fridge.AllFridge + WashingMachine.AllWashingMachine + Oven.AllOven + AirCondition.AllAirCondition;
        System.out.println("AllDevices = " + count +'\n');

        if(Compname == null ) {
            System.out.println("Compname error");
        }
        if (Compadress == null ) {
            System.out.println("Compadress error");
        }

        System.out.println("namec = " + Compname + '\n' + "adressc = " + Compadress + '\n' + "AllEmployes = " + AllEmployes);

    }
}

