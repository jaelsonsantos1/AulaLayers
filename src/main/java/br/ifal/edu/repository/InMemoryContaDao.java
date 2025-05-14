package br.ifal.edu.repository;

import br.ifal.edu.domain.Conta;

import java.util.ArrayList;
import java.util.List;

public class InMemoryContaDao implements IContaDao {

    private static List<Conta> db = new ArrayList<>();

    public void save(Conta conta) {
        // Chamada para o banco de dados
        db.add(conta);
    }

    public List<Conta> findAll() {
        return db;
    }

    public Conta findByName(String name) {
        for (Conta conta : db) return conta.getNome().equals(name) ? conta : null;
        return null;
    }
}
