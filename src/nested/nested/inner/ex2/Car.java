package nested.nested.inner.ex2;


public class Car {
    private String model;
    private int cargeLevel;
    private Engine engine;

//    Engine myEngine = new Engine(); - 내가 쓴 부분

    public Car(String model, int cargeLevel) {
        this.model = model;
        this.cargeLevel = cargeLevel;
        this.engine = new Engine(); //결국 내가 생각했던 이 클래스 생성 시에 Engine이 생성되어야 한다는 생각은 맞았음.
                                    //다음엔 생성자에 넣을 생각 하기.
    }

    public void start() {
        engine.start();
        System.out.println(model + "시작완료");

    }

    // Car에서만 사용
    public class Engine {

        public void start() {
            System.out.println("충전 레벨 확인: " + cargeLevel);
            System.out.println(model + "의 엔진을 구동합니다.");

        }

    }

}


