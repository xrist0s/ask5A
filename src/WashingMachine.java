public class WashingMachine extends Device {
    public double Db;
    public double Lt;
    public double Rpm ;
    public String wifi;
    public String color;
    static int AllWashingMachine;

    public WashingMachine(double Length, double Height, double Depth, String Name, String Manufacture, String Type, double KWh,
                          double Db,double Lt, double Rpm, String wifi, String color) {
        super(Length, Height, Depth, Name, Manufacture, Type, KWh);
        this.Db = Db;
        this.Lt = Lt;
        this.Rpm = Rpm;
        this.wifi = wifi;
        this.color = color;
        AllWashingMachine++;
    }

    public String toString() {
        return this.Length + ", " + this.Height + ", " + this.Depth + ", " + this.Name + ", " + this.Manufacture + ", " + this.Type + ", " + this.KWh + ", " + Db + ", " + Lt + ", " + Rpm + ", " + wifi + ", " + color + '\n' + AllWashingMachine + '\n';
    }
}

