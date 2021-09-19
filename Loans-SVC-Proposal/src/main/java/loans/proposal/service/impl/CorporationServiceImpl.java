package loans.proposal.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.javafaker.Faker;

import loans.proposal.dao.CorporationRepository;
import loans.proposal.model.Corporation;
import loans.proposal.service.CorporationService;

@Service
public class CorporationServiceImpl implements CorporationService {

	@Autowired
	private CorporationRepository repo;

	@Override
	public List<Corporation> getAllCorporations() {
		return this.repo.findAll();
	}

	@Transactional
	@Override
	public void genreateNewCorporations(Integer countToGenerate) {

		Faker faker = new Faker();

		List<Corporation> corporations = new ArrayList<>();

		Corporation corporation = null;
		for (int counter = 1; counter <= countToGenerate; counter++) {
			corporation = new Corporation();
			corporation.setName(faker.company().name());
			corporation.setName(faker.harryPotter().character() + " " + faker.artist().name());

			corporations.add(corporation);
		}

		this.repo.saveAll(corporations);
	}

}
