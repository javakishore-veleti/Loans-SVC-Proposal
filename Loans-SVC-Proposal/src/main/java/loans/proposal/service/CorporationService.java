package loans.proposal.service;

import java.util.List;

import loans.proposal.model.Corporation;

public interface CorporationService {

	List<Corporation> getAllCorporations();

	void genreateNewCorporations(Integer countToGenerate);

}
