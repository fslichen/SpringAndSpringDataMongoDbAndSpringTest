package evolution.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "any_entity")
public class AnyEntity {
	private String name;
	private String gender;
}
