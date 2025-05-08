package br.ifal.edu.repository;

import br.ifal.edu.domain.Conta;

import java.util.List;

public interface IContaDao {

    public void save(Conta conta);

    public List<Conta> findAll();
}
