package com.empresa.service;

import java.util.List;

import com.empresa.entity.Medicamento;

public interface MedicamentoService {

	public abstract List<Medicamento> listaMedicamento();

	public abstract List<Medicamento> listaMedicamentoPorNombre(String filtro);

	public abstract List<Medicamento> obtienePorId(int idMedicamento);

	public abstract List<Medicamento> listaPorLaboratorio(String laboratorio);

}