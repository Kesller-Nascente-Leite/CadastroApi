package com.example.CadastroAPI.NInjas;

import com.example.CadastroAPI.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

//O Entity transforma uma classe em uma entidade do BD
@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
//@Getter ou @Setter
@Data // cria os Getter e Setter
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;
    //@ManyToOne 1 -> 1
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreing key
    private MissoesModel missoes;


}
