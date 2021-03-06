package oop.g8.repository.relation.person;

import java.util.List;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import oop.g8.model.relation.person.P2T;
@Repository

public interface P2TR  extends Neo4jRepository<P2T, Long> {

	List<P2T> findByTypeAndTime_Name(String string, String time);

	List<P2T> findByTypeAndTime_NameContaining(String string, String time);

}
