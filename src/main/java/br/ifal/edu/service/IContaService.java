package br.ifal.edu.service;

import br.ifal.edu.domain.Conta;

import java.util.List;

public interface IContaService {

    public void save(Conta conta);

    public List<Conta> findAll();
}
