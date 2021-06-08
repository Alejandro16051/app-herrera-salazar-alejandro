package com.empresa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.Medicamento;
import com.empresa.service.MedicamentoService;

@RestController
@RequestMapping("/rest/medicamento")
public class MedicamentoController {

	@Autowired
	private MedicamentoService service;

	@GetMapping
	@ResponseBody
	public ResponseEntity<List<Medicamento>> listaMedicamento() {
		List<Medicamento> lista = service.listaMedicamento();
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping("/porNombre/{filtro}")
	@ResponseBody
	public ResponseEntity<List<Medicamento>> listaPorNombre(@PathVariable("filtro") String nombre) {
		List<Medicamento> lista = service.listaMedicamentoPorNombre(nombre);
		return ResponseEntity.ok(lista);
	}

	@GetMapping("/porID/{id}")
	@ResponseBody
	public ResponseEntity<List<Medicamento>> listaPorID(@PathVariable("id") int idMedicamento) {
		List<Medicamento> lista = service.obtienePorId(idMedicamento);
		return ResponseEntity.ok(lista);
	}

	@GetMapping("/porLaboratorio/{laboratorio}")
	@ResponseBody
	public ResponseEntity<List<Medicamento>> listaPorLaboratorio(@PathVariable("laboratorio") String laboratorio) {
		List<Medicamento> lista = service.listaPorLaboratorio(laboratorio);
		return ResponseEntity.ok(lista);
	}

}
