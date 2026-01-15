package com.example.CadastroAPI.Missoes;

import com.example.CadastroAPI.NInjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;
    // @OneToMany 1 -> N
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninja;
}
