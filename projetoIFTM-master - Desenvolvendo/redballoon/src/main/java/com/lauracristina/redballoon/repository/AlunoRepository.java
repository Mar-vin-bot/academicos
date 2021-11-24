package com.lauracristina.redballoon.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.lauracristina.redballoon.model.Aluno;

@Repository
public class AlunoRepository {

    @Autowired
    JdbcTemplate jdbc;

    public List<Aluno> buscaTodos() {
        String consulta = "SELECT * FROM ALUNO;";
        return jdbc.query(consulta,
            (resultados, numeroDaLinha) -> new Aluno(
                resultados.getInt("id"),
                resultados.getString("nome"),
                resultados.getString("dataNascimento"),
                resultados.getString("anoEscola"),
                resultados.getString("escola")
            )
        );
    }

    public int salvar(Aluno aluno){
        String consulta = "insert into aluno(nome, dataNascimento, anoEscola, escola) values(?,?,?,?)";
        return jdbc.update(consulta, aluno.getNome(), aluno.getDataNascimento(), aluno.getAnoEscola(), aluno.getEscola() );
    }

    public int excluir (Integer id){ 
        String consulta = "delete from aluno where id = ?";
        return jdbc.update(consulta, id);
    }

    public Aluno buscaPorId(Integer id) {
        try {
            String query = "select * from aluno where id = ?";
            return jdbc.queryForObject(query,
                (resultados, rowNum) -> {
                    return new Aluno(
                        resultados.getInt("id"),
                        resultados.getString("nome"),
                        resultados.getString("dataNascimento"),
                        resultados.getString("anoEscola"),
                        resultados.getString("escola")
                    );
                },
            id);
        } catch (EmptyResultDataAccessException e) {
            return new Aluno(0, "","","","");
        }
    }

    public int atualizar(Aluno aluno){
        String consulta = "update aluno set nome = ? where id = ?";
        return jdbc.update(consulta, aluno.getNome(), aluno.getId());
    }
}
