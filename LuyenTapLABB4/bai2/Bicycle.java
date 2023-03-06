package bai2;
public class Bicycle extends Vehicle{
private int sobanhxe;
    public Bicycle(){
    }public Bicycle(int sobanhxe, String color, String model){
        super(color, model);
        this.sobanhxe = sobanhxe;
    }public int getSobanhxe(){
        return sobanhxe;
    }public void setSobanhxe(int sobanhxe){
        this.sobanhxe = sobanhxe;
    }
}
