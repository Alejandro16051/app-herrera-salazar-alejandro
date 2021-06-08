package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Medicamento;
import com.empresa.repository.MedicamentoRepository;

@Service
public class MedicamentoServiceImpl implements MedicamentoService {

	@Autowired
	private MedicamentoRepository repository;

	@Override
	public List<Medicamento> listaMedicamento() {
		return repository.findAll();
	}

	@Override
	public List<Medicamento> listaMedicamentoPorNombre(String filtro) {
		return repository.listaMedicamentoPorNombre(filtro);
	}

	@Override
	public List<Medicamento> obtienePorId(int idMedicamento) {
		return repository.findById(idMedicamento);
	}

	@Override
	public List<Medicamento> listaPorLaboratorio(String laboratorio) {
		return repository.findByLaboratorio(laboratorio);
	}

}
