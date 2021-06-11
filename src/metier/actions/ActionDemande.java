/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier.actions;

import ia.base.metier.TypeMouvement;
import ia.base.metier.carte.ressources.TypeRessource;
import static metier.actions.TypeAction.DEMANDE;

/**
 *
 * @author theo clere
 */
public class ActionDemande extends Action {
    
    private String message;

    public ActionDemande(String message){
        this.message = message;
    }
    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public TypeAction getType() {
        return DEMANDE;
    }

    @Override
    public TypeMouvement getDirection() {
        return null;
    }
    
    @Override
    public TypeRessource getTypeRessource() {
        return null;
    }
}
