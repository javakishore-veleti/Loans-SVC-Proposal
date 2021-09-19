package loans.proposal.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import loans.proposal.model.Corporation;

@Repository
public interface CorporationRepository extends CrudRepository<Corporation, Long> {

	List<Corporation> findAll();

}
