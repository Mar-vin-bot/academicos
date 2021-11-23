package iftm.edu.br.redballon2.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import iftm.edu.br.redballon2.Model.redModel;

@Repository
public class redRepository {

    @Autowired
    JdbcTemplate jdbc;

    public List<redModel> buscarProf() {
        String consulta = "select * from tableAlunos;";
        return jdbc.query(consulta,
                (resultados, numeroDaLinhas) -> new redModel(resultados.getString("nome"), resultados.getInt("id")));

    }

}
