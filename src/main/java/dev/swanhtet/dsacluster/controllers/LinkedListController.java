package dev.swanhtet.dsacluster.controllers;

import dev.swanhtet.dsacluster.services.impl.LinkedListServicesimpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class LinkedListController {

	private final LinkedListServicesimpl linkedListServicesimpl;

	public LinkedListController(LinkedListServicesimpl linkedListServicesimpl) {

		this.linkedListServicesimpl = linkedListServicesimpl;
	}

	@PostMapping("/insert")
	public ResponseEntity<String> insertionController(@RequestBody int value) {

		linkedListServicesimpl.insertAtTheBeginning(value);
		return new ResponseEntity<>("Success", HttpStatus.OK);
	}

	@GetMapping("/getList")
	public ResponseEntity<String> getListController() {

		return ResponseEntity.ok(linkedListServicesimpl.traverse());
	}

}
