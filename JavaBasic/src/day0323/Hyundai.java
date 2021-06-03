package day0323;

public class Hyundai implements Car {
    
    private String carNumber;
    private String carModel;
    private int carMoney;
    private String carColor;
    
    public Hyundai() {
        this.carNumber = new String("12가 1234");
        this.carModel = new String("소나타");
        this.carMoney = 3000;
        this.carColor = new String("흰색");
    }

    @Override
    public void turnOn() {
        System.out.println("시동이 걸립니다. 부릉");
    }

    @Override
    public void speedUp() {
        System.out.println("가속합니다 부릉부릉");
    }

    @Override
    public void speedDown() {
        System.out.println("속도를 줄입니다.");
    }

    @Override
    public void goLeft() {
        System.out.println("왼쪽으로 갑니다.");
    }

    @Override
    public void goRight() {
        System.out.println("오른쪽으로 갑니다.");
    }

    @Override
    public void park() {
        System.out.println("주차를 합니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }
    
}
