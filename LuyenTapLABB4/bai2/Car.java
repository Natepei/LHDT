package bai2;
public class Car extends Vehicle{
    private String nhienlieu;
    public Car(){
    }public Car(String nhienlieu, String color, String model){
        super(color, model);
        this.nhienlieu = nhienlieu;
    }public String getNhienlieu(){
        return nhienlieu;
    }public void setNhienlieu(String nhienlieu){
        this.nhienlieu = nhienlieu;
    } 
}
