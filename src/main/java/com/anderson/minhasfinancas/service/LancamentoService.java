package com.anderson.minhasfinancas.service;

import java.util.List;

import com.anderson.minhasfinancas.model.entity.Lancamento;
import com.anderson.minhasfinancas.model.enums.StatusLancamento;

public interface LancamentoService {
	
	Lancamento salvar(Lancamento lancamento);
	
	Lancamento atualizar(Lancamento lancamento);
	
	void deletar(Lancamento lancamento);
	
	List<Lancamento> buscar(Lancamento lancamentoFiltro);
	
	void atualizarStatus(Lancamento lancamento, StatusLancamento status);
	
	void valida(Lancamento lancamento);
}
