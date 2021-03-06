/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Util;


public abstract class Item {
    final Ambiente ambiente;
    
    /** Construtor com o ambiente que o item está
        
        @param - Ambiente referencia ao objeto que o item se encontra
    */
    Item(Ambiente ambiente){
        this.ambiente = ambiente;
    }

    /** Retorna o ambiente que o item se encontra
     * 
     * @return referencia ao objeto que o item se encontra
     */
    public Ambiente getAmbiente() {
        return ambiente;
    }
    
    /** Poliformismo: subclasse executa uma ação
     * 
     * @return 
     * @throws Model.Util.ItemException
     * @throws Model.Util.GameOverException
     */
    public abstract String fazerAcao() throws ItemException, GameOverException;
    
    
}
