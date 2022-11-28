public class AirCondition extends Device{
    public double Db;
    public double btu;
    public String Bluetooth;
    public String color;
    public String ionizer;
    static int AllAirCondition;

    public AirCondition(double Length, double Height, double Depth, String Name, String Manufacture, String Type, double KWh,
                        double Db, double btu, String ionizer, String Bluetooth, String color) {
        super(Length, Height, Depth, Name, Manufacture, Type, KWh);
        this.Db = Db;
        this.btu = btu;
        this.ionizer = ionizer;
        this.Bluetooth = Bluetooth;
        this.color = color;
        AllAirCondition++;
    }

    public String toString(){
        return this.Length + ", " + this.Height + ", " + this.Depth + ", " + this.Name + ", " + this.Manufacture + ", " + this.Type + ", " + this.KWh + ", " + Db + ", " + btu + ", " + ionizer + ", " + Bluetooth + ", " + color + '\n' + AllAirCondition + '\n';
    }
}

