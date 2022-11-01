package me.ssu.springquerydslweb.account.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Getter @Builder
@Entity
public class Account {
	@Id @GeneratedValue
	private Long id;

	@Column(unique = false)
	private String email;

	@Column(unique = false)
}
