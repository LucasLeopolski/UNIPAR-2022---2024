/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testescrud.service;

import java.util.HashMap;
import java.util.Map;
import testescrud.model.ProdutoModel;

/**
 *
 * @author Usuário
 */
public class ProdutoService {
    
    private Map<Integer, ProdutoModel> produtos = new HashMap<>();
    
    public ProdutoModel salvar(ProdutoModel produto){
        produtos.put(produto.getId(), produto);
        return produto; 
    }
    
    public ProdutoModel buscar(int id){
        return produtos.get(id);
    }
    
    public ProdutoModel editar(ProdutoModel produto){
        produtos.put(produto.getId(), produto);
        return produto;
    }
    
    public void deletar(int id){
        produtos.remove(id);
    }
    
    public int totalProdutos(){
        return produtos.size();
    }
}
