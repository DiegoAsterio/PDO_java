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
public class Prize {
    private int treasures;

    private int level;

    public Prize(){
      treasures = 0;
      level = 0;
    }

    public Prize(int treasures, int level){
      this.treasures = treasures;
      this.level = level;
    }

    public int getLevels(){
      return level;
    }

    public int getTreasures(){
      return treasures;
    }
    
    @Override
    public String toString(){
        return "Tesoros : " + Integer.toString(treasures) + " Niveles : " +Integer.toString(level);
    }
}
