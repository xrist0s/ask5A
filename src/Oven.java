public class Oven extends Device{
    public double Db;
    public String Lt;
    public double Ht;
    public String wifi;
    public String color;
    static int AllOven ;

    public Oven(double Length, double Height, double Depth, String Name, String Manufacture, String Type, double KWh,
                double Db,String Lt, double Ht, String wifi, String color) {
        super(Length, Height, Depth, Name, Manufacture, Type, KWh);
        this.Db = Db;
        this.Lt = Lt;
        this.Ht = Ht;
        this.wifi = wifi;
        this.color = color;
        AllOven++;
    }

    public String toString(){
        return this.Length + ", " + this.Height + ", " + this.Depth + ", " + this.Name + ", " + this.Manufacture + ", " + this.Type + ", " + this.KWh + ", " + Db + ", " + Lt + ", " + Ht + ", " + wifi + ", " + color + '\n' + AllOven + '\n';
    }
}