package hello.core.member;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component // 여기붙이면 댐.
public class MemoryMemberRepository implements MemberRepository{

    private static Map<Long,Member> store= new HashMap<>();  //저장소
    @Override
    public void save(Member member) {
        store.put(member.getId(),member);
        //store 맵에 member의 id,키로 member 저장. put사용함

    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId); //맵에서 get 가져오는것
    }
}
