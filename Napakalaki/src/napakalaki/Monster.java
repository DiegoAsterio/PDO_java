/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

/**
 *
 * @author Diario
 */
public class Monster {
    private String name;
    private int combatLevel;
    private BadConsequence bc;
    private Prize prize;

    Monster(String name, int level, BadConsequence bc, Prize prize){
        this.name = name;
        this.combatLevel = level;
        this.bc  = bc;
        this.prize = prize;
    }

    BadConsequence getBadConsequence(){
        return bc;
    }
 
    int getLevelsGained(){
        return prize.getLevels();
    }
    
    int getTreasuresGained(){
        return prize.getTreasures();
    }

    Prize getPrize(){
        return prize;
    }

    String getName(){
        return name;
    }

    int getCombatLevel(){
        return combatLevel;
    }

    @Override
    public String toString(){
      return "Name: " + name + "\n\tNivel de combate: " + combatLevel + 
      "\n\tMal rollo: " + bc.toString() + "\n\tRecompensa: " + prize.toString() + "\n";
    }

}
