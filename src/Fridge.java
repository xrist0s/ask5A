public class Fridge extends Device{
    public double Db;
    public String Lt;
    public String Xronos_autonomias;
    public String wifi;
    public String color;
    static int AllFridge;



    public Fridge(double Length, double Height, double Depth, String Name, String Manufacture, String Type, double KWh,
                  double Db, String Lt, String Xronos_autonomias, String wifi, String color) {
        super(Length, Height, Depth, Name, Manufacture, Type, KWh);
        this.Db = Db;
        this.Lt = Lt;
        this. Xronos_autonomias =  Xronos_autonomias;
        this.wifi = wifi;
        this.color = color;
        AllFridge++;
    }

    public String toString(){
        return  this.Length + ", " + this.Height + ", " + this.Depth + ", " + this.Name + ", " + this.Manufacture + ", " + this.Type + ", " + this.KWh + ", " + Db + ", " + Lt + ", " + Xronos_autonomias + ", " + wifi + ", " + color + '\n' + AllFridge + '\n';
    }
}


