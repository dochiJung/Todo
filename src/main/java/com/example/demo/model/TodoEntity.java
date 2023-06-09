package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name= "Todo")
public class TodoEntity {
	@Id
	@GeneratedValue(generator = "system_uuid")
	@GenericGenerator(name = "system_uuid", strategy = "uuid")
	private String id;
	private String userId;
	private String title;
	private boolean done; //true - todo를 완료한 경우(checked)

}
