package oop.g8.model.relation.person;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import oop.g8.model.entity.Country;
import oop.g8.model.entity.Person;
import oop.g8.model.entity.Time;
import oop.g8.model.relation.country.C2C;

@RelationshipEntity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class P2T {
	@Id
	@GeneratedValue
	private Long neo4jId;

	private String type;

	@StartNode
	private Person person;

	@EndNode
	private Time time;

	public P2T(String type, Person person, Time time) {
		super();
		this.type = type;
		this.person = person;
		this.time = time;
	}

}