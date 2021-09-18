package loans.proposal.controller;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import loans.proposal.model.Corporation;

@RestController
@RequestMapping(produces = "application/json", path = "/api/services/proposal/corporation")
public class CorporationController {

	@RequestMapping(path = "get-all-corporation")
	public ResponseEntity<ArrayList<Corporation>> getAllCorporations() {
		return ResponseEntity.ok(new ArrayList<Corporation>());
	}

}
