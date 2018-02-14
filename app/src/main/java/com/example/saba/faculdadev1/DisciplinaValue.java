package com.example.saba.faculdadev1;

/**
 * Created by saba on 28/08/15.
 */
public class DisciplinaValue implements java.io.Serializable {

    private Long id;
    private String disciplina;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String toString(){
        return this.getDisciplina();
    }


}
