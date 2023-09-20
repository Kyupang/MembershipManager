package hello.core1.member;

public interface MemberService {
    //실제 서비스 내용을 회원가입과 조회이다.
    // 클라이언트가 member를 보내면 가입이 완료됨
    // 서비스는 리포지토리에 save를 호출할것임.
    void join(Member member);
    Member findMember(Long memberId);
}
