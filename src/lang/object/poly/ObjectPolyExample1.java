package lang.object.poly;

public class ObjectPolyExample1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    private static void action(Object obj) {
        //obj.sound(); Object는 sound()가 없다
        //obj.move(); Object는 move()가 없다

        /*
        객체에 맞는 다운캐스팅 필요 - 지금 객체는 object클래스를 참조하고 있기 때문에 자식에게 있는 메서드를 불러올 수 없음.
        따라서 다운캐스팅을 통해서 자식의 메서드를 불러올 수 있게 만들어 줄 필요가 있음
        ★올라갈 순 있어도 내려올 순 없다는 것을 꼭 기억하기. - 밑으로 내려가는 경우는 단 한가지: 메서드 오버라이딩.
        */
        if(obj instanceof Dog dog) { //이해가 안가면 자바 기본편 다운캐스팅 보기.
            dog.sound();
        }
        else if (obj instanceof Car car) {
            car.move();
        }
    }
}
