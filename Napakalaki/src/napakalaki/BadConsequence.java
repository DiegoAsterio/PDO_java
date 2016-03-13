/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;

/**
 *
 * @author Diario
 */
public class BadConsequence {
    private static final int DEAD = 10;

    private static final int INV = -1;

    private String text;

    private int levels;

    private int nVisibleTreasures;

    private int nHiddenTreasures;

    private ArrayList<TreasureKind> specificVisibleTreasures = null;

    private ArrayList<TreasureKind> specificHiddenTreasures = null;

    public BadConsequence(String text, int levels, int nVisible, int nHidden){
      this.text = text;
      this.levels = levels;
      this.nVisibleTreasures = nVisible;
      this.nHiddenTreasures = nHidden;
      this.specificVisibleTreasures = this.specificHiddenTreasures = null;
    }

    public BadConsequence(String text){
      this.text = text;
      this.levels = this.nVisibleTreasures = this.nHiddenTreasures = DEAD;
      this.specificVisibleTreasures = this.specificHiddenTreasures = null;
    }

    public BadConsequence(String text, int levels, ArrayList<TreasureKind> specificVisibleTreasures,
    ArrayList<TreasureKind> specificHiddenTreasures){
      this.text = text;
      this.levels = levels;
      this.nVisibleTreasures = this.nHiddenTreasures = INV;
      this.specificVisibleTreasures = specificVisibleTreasures;
      this.specificHiddenTreasures = specificHiddenTreasures;
    }

    public String getText(){
      return this.text;
    }

    public int getLevels(){
      return this.levels;
    }

    ArrayList<TreasureKind> getSpecificVisibleTreasures(){
      return this.specificVisibleTreasures;
    }

    ArrayList<TreasureKind> getSpecificHiddenTreasures(){
      return this.specificHiddenTreasures;
    }

    public int getNVisibleTreasures(){
      return this.nVisibleTreasures;
    }

    public int getNHiddenTreasures(){
      return this.nHiddenTreasures;
    }

    @Override
    public String toString(){
        String ret = "Texto: " + this.text + " Niveles: " + this.levels;
        if() 
        " Tesoros Visibles: " + this.nVisibleTreasures + " Tesoros ocultos: "
        + this.nHiddenTreasures ;
    }
}
