/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testescrud.service;

/**
 *
 * @author Usuário
 */

import com.seuempresa.seuprojeto.model.Produto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ProdutoServiceTest {
    
    private ProdutoService produtoService;

    @BeforeEach
    public void setUp() {
        produtoService = new ProdutoService();
    }
}
