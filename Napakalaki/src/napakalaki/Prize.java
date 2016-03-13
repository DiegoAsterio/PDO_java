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

    private int levels;

    public Prize(){
      treasures = 0;
      levels = 0;
    }

    public Prize(int treasures, int level){
      this.treasures = treasures;
      this.levels = level;
    }

    public int getTreasures(){
      return this.treasures;
    }    

    public int getLevels(){
      return this.levels;
    }

    @Override
    public String toString(){
        return "Tesoros : " + Integer.toString(this.treasures) + " Niveles : " +
                Integer.toString(this.levels);
    }
}
