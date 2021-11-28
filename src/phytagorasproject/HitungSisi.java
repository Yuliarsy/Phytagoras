/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phytagorasproject;

/**
 *
 * @author Yulia Rakhmah
 */
class HitungSisi {
    double a,c,sisib;
    
    double hitungsisi() {
        sisib = Math.sqrt((c*c)-(a*a));
        return sisib;
    }
}
