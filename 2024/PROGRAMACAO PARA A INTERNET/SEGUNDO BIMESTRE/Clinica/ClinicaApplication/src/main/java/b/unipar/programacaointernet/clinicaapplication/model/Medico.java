package b.unipar.programacaointernet.clinicaapplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
public class Medico implements Serializable {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)

    private Integer id;
    private String nome;
    private String especialidade;

}
