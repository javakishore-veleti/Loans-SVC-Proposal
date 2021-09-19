package loans.proposal.controller;

import java.util.Collections;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import loans.proposal.dto.ResponseResult;

@RestController
@RequestMapping(produces = "application/json", path = "/api/services/proposal/corporation")
public class CorporationController {

	@RequestMapping(path = "get-all-corporations")
	public ResponseEntity<ResponseResult> getAllCorporations() {
		return ResponseEntity.ok(new ResponseResult("corporations", Collections.EMPTY_LIST));
	}

	@RequestMapping(path = "generate-corporations")
	public ResponseEntity<ResponseResult> generateCoroporations(
			@RequestParam(name = "count") Integer noOfCorporations) {

		return ResponseEntity.ok(new ResponseResult("count", noOfCorporations));
	}

}
