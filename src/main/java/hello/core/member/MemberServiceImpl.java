package hello.core.member;

public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository; //메모리 멤버 리파시토리 지움

    public MemberServiceImpl(MemberRepository memberRepository) { //이걸 통해서 뭘 들어갈지 결정
        this.memberRepository = memberRepository;
    } //여기에는 Memory member repository 가 없음!!

    @Override
    public void join(Member member) {
        memberRepository.save(member);

    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
