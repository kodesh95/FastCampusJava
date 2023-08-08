package fc.java.part3;

import fc.java.model.MemberDTO;

public class AccessModifier {
    public static void main(String[] args) {
        MemberDTO dto = new MemberDTO();
        dto.name="choi";
        dto.phone="01022344321";
//        dto.age=12 에러 발생(private이라서 접근불가)
        System.out.println("dto.name = " + dto.name);
        System.out.println("dto.phone = " + dto.phone);
        dto.play();
    }
}
