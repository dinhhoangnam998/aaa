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
import oop.g8.model.entity.Organization;
import oop.g8.model.entity.Person;
import oop.g8.model.relation.country.C2C;

@RelationshipEntity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class P2O {
	@Id
	@GeneratedValue
	private Long neo4jId;

	private String type;

	@StartNode
	private Person person;

	@EndNode
	private Organization organization;


	public P2O(String type, Person person, Organization organization) {
		super();
		this.type = type;
		this.person = person;
		this.organization = organization;
	}


}