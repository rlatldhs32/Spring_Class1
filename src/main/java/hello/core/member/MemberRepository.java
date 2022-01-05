package hello.core.member;

public interface MemberRepository { //인터페이스는 추상적이라서 이걸로 동작하진 않음

    void save(Member member); //회원 저장 Member는 클래스니까 이렇게 가능

    Member findById(Long memberId);
}
