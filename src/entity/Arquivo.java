/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import javax.swing.tree.TreeNode;

/**
 *
 * @author Push
 */
public class Arquivo implements TreeNode{
    
    private String id;
    private String idInterno;
    private String nome;
    private int tipo;
    private String path;
    private int inicio;
    private int tamanho;
    private String criacao;
    private List<Arquivo> arquivos = new ArrayList<Arquivo>(); // Apenas para diretorios    
    
    /*
    
    public Arquivo (String header) {
        
        String [] h = header.split("|");
        
        tipo = Integer.parseInt(h[0]); // #0 = META, #1 = ARQUIVO, #2 = DIR
        nome = h[1];
        path = h[2];
        inicio = Integer.parseInt(h[3]);
        fim = Integer.parseInt(h[4]);
        criacao = h[5];
        dir = h[6];
        
    }*/
    
    @Override
    public String toString(){
        return nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public String getCriacao() {
        return criacao;
    }

    public void setCriacao(String criacao) {
        this.criacao = criacao;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public TreeNode getChildAt(int childIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getChildCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TreeNode getParent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getIndex(TreeNode node) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean getAllowsChildren() {
        if(tipo == 0) return true;
        return false;
    }

    @Override
    public boolean isLeaf() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Enumeration children() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Arquivo> getArquivos() {
        return arquivos;
    }

    public void setArquivos(List<Arquivo> arquivos) {
        this.arquivos = arquivos;
    }

    public String getIdInterno() {
        return idInterno;
    }

    public void setIdInterno(String idInterno) {
        this.idInterno = idInterno;
    }
    
}
