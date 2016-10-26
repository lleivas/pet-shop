package br.com.tt.model;

import java.time.LocalDate;

/** Classe modelo de Pet, para cadastrar os pets.
 * @author Luciano
 * @since 0.0.1
 */


public class Pet {
  
  public Pet() {
    super();    
  }
    
  private long id;
  private String nome;
  private LocalDate dataNasc;
  private String raca;
  private String cor;
  
  
  public long getId() {
    return id;
  }
  
  public void setId(long id) {
    this.id = id;
  }
  
  public String getNome() {
    return nome;
  }
  
  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public LocalDate getDataNasc() {
    return dataNasc;
  }
  
  public void setDataNasc(LocalDate dataNasc) {
    this.dataNasc = dataNasc;
  }
  
  public String getRaca() {
    return raca;
  }
  
  public void setRaca(String raca) {
    this.raca = raca;
  }
  
  public String getCor() {
    return cor;
  }
  
  public void setCor(String cor) {
    this.cor = cor;
  }
  
  

}
