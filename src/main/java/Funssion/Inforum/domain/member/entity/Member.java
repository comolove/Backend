package Funssion.Inforum.domain.member.entity;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// 상속을 이용하여 Social 로그인 Member, Non Social 로그인 Member 분리
@Getter @Setter
public class Member {
    private Long user_id;

    private String user_name;

    private Integer login_type;
}