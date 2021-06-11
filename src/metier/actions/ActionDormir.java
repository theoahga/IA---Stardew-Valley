/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier.actions;

import ia.base.metier.TypeMouvement;
import ia.base.metier.carte.ressources.TypeRessource;
import static metier.actions.TypeAction.ACTIONSTATIQUE;

/**
 *
 * @author theo clere
 */
public class ActionDormir extends Action{

    @Override
    public String getMessage() {
        return "SLEEP";
    }

    @Override
    public TypeAction getType() {
        return ACTIONSTATIQUE;
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
