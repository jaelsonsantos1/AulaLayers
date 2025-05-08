package br.ifal.edu.repository;

import br.ifal.edu.domain.Conta;

import java.util.ArrayList;
import java.util.List;

public class MysqlContaDao implements IContaDao {
    private static List<Conta> db = new ArrayList<>();

    @Override
    public void save(Conta conta) {
        db.add(conta);
    }

    @Override
    public List<Conta> findAll() {
        return db;
    }
}
