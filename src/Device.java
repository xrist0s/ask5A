public class Device {
    public double Length;
    public double Height;
    public double Depth;
    public String Name;
    public String Manufacture;
    public String Type;
    public double KWh;
    boolean status;

    public Device(double Length, double Height, double Depth, String Name, String Manufacture, String Type, double KWh) {
        this.Length = Length;
        this.Height = Height;
        this.Depth = Depth;
        this.Name = Name;
        this.Manufacture = Manufacture;
        this.Type = Type;
        this.KWh = KWh;
    }

    public String toString() {
        return this.Length + ", " + this.Height + ", " + this.Depth + ", " + this.Name + ", " + this.Manufacture + ", " + this.Type + ", " + this.KWh + '\n';
    }

    void PowerOn(){
        status = true;
        System.out.println("status device is true");
    }


    void PowerOff(){
        status = false;
        System.out.println("status device is false");
    }

    boolean status() {
        return status;
    }
}

