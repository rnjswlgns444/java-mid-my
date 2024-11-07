package nested.nested.inner.ex1;

public class Car {
    private String model;
    private int cargeLevel;
    private Engine engine;

    public Car(String model, int cargeLevel) {
        this.model = model;
        this.cargeLevel = cargeLevel;
        this.engine = new Engine(this);
    }

    //Engine에서만 사용하는 메서드
    public String getChargeLevel() {
        return model;
    }

    //Engine에서만 사용하는 메서드
    public String getModel() {
        return model;
    }

    public void start() {
        engine.start();
        System.out.println(model + "시작완료");

    }
}
