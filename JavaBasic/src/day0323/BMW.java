package day0323;

public class BMW implements Car{
    
    private String carNumber;
    private String carModel;
    private int carMoney;
    private String carColor;
    
    public BMW() {
        this.carNumber = new String("23나 5678");
        this.carModel = new String("BMW");
        this.carMoney = 30000;
        this.carColor = new String("검정");
    }

    @Override
    public void turnOn() {
        
    }

    @Override
    public void speedUp() {
        
    }

    @Override
    public void speedDown() {
        
    }

    @Override
    public void goLeft() {
        
    }

    @Override
    public void goRight() {
        
    }

    @Override
    public void park() {
        
    }

    @Override
    public void turnOff() {
        
    }

}
