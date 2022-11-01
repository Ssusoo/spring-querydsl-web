package me.ssu.springquerydslweb.account.domain;

import lombok.*;

import javax.persistence.*;

@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Getter @Builder
@Entity
public class Account {
	@Id @GeneratedValue
	private Long id;

	@Column(unique = true)
	private String email;

	@Column(unique = true)
	private String nickname;

	@Lob @Basic
	private String profileImage;

	private String password;

	private boolean emailVerified;  // 이메일 인증 확인

	private String emailCheckToken;
}
