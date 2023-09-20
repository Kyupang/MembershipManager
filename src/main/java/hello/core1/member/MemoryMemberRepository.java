package hello.core1.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository{
    private static Map<Long,Member> store = new HashMap<>();

    @Override
    // member 객체가 들어오면 거기서 아이디와 member 객체를 save 함수에 넘겨줌
    public void save(Member member) {
        store.put(member.getId(),member);
    }

    @Override
    // map에서 아이디를 가지고오면 value로 member 가 나올것임.
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
