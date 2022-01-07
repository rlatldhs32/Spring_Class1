package hello.core.singleton;

public class SingletonService {

    //자기 자신을 내부로 가지고있음. private static final로
    //static이기때문에 -> class레벨에 올라가기때문에 하나만 존재함
    private static final SingletonService instance = new SingletonService();
    //자기자신을 instance에 넣어놓음
    public static SingletonService getInstance(){
        return instance;
    } // 항상 같은 인스턴스를 반환함

    private SingletonService(){} //외부 클래스에서 객체 생성 불가

    public void logic(){
        System.out.printf("싱글톤 로직 호출함\n");
    }


}
