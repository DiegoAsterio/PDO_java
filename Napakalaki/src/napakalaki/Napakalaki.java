/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Diario
 */
public class Napakalaki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

      ArrayList<Monster> monstruos = new ArrayList();
      Prize pr;
      BadConsequence bc;

      pr = new Prize(2,1);
      bc = new BadConsequence("Pierdes tu armadura visible y otra oculta",0,
      new ArrayList(Arrays.asList(TreasureKind.ARMOR)), new ArrayList(Arrays.asList(TreasureKind.ARMOR)));
      monstruos.add (new Monster("3 Byakhees de bonanza",8,bc,pr));

      pr = new Prize(1,1);
      bc = new BadConsequence ("Embobados con el lindo primigenio te descartas de tu casco visible",
      0, null, new ArrayList(Arrays.asList(TreasureKind.HELMETS)));
      monstruos.add (new Monster("Chibithulhu",2,bc,pr));

      pr = new Prize(1,1);
      bc = new BadConsequence ("El primordial bostezo contagioso. Pierdes el calzado visible",
      0,new ArrayList(Arrays.asList(TreasureKind.SHOES)), null);
      monstruos.add (new Monster("El sopor de Dunwich",2,bc,pr));

      pr = new Prize(4,1);
      bc = new BadConsequence ("Te atrapan para llevarte de fiesta y te dejan caer en mitad del vuelo. Descarta 1 mano visible y 1 mano oculta",
      0,new ArrayList(Arrays.asList(TreasureKind.ONEHAND)), new ArrayList(Arrays.asList(TreasureKind.ONEHAND)));
      monstruos.add (new Monster("Ángeles de la noche Ibicenca",14,bc,pr));

      pr = new Prize(3,1);
      bc = new BadConsequence ("Pierdes todos tus tesoros visibles",0,2,0);
      monstruos.add (new Monster("El gorrón en el umbral",10,bc,pr));

      pr = new Prize(2,1);
      bc = new BadConsequence ("Pierdes la armadura visible",0,
      new ArrayList(Arrays.asList(TreasureKind.ARMOR)), null);
      monstruos.add (new Monster("H.P. Munchcraft",6,bc,pr));

      pr = new Prize(1,1);
      bc = new BadConsequence ("Sientes bichos bajo la ropa. Descarta la armadura visible",0,
      new ArrayList(Arrays.asList(TreasureKind.ARMOR)), null);
      monstruos.add (new Monster("Bichgooth",2,bc,pr));

      pr = new Prize(4,2);
      bc = new BadConsequence ("Pierdes 5 niveles y 3 tesoros visibles",5,3,0);
      monstruos.add(new Monster("El rey de rosa",13,bc,pr));

      pr = new Prize(1,1);
      bc = new BadConsequence ("Toses los pulmones y pierdes 2 niveles", 2,0,0);
      monstruos.add(new Monster("La que redacta en las tinieblas",2,bc,pr));

      pr = new Prize(2,1);
      bc = new BadConsequence ("Estos monstuos resultan bastante superficiales y te aburren mortalmente. Estas muerto");
      monstruos.add(new Monster("Los hondos",8,bc,pr));

      pr = new Prize(2,1);
      bc = new BadConsequence ("Pierdes 2 niveles y 2 tesoros ocultos",2,0,2);
      monstruos.add(new Monster("Semillas Cthulhu",4,bc,pr));

      pr = new Prize(2,1);
      bc = new BadConsequence("Te intentas escaquear. Pierdes una mano visible",
      0,new ArrayList(Arrays.asList(TreasureKind.ONEHAND)), null);
      monstruos.add(new Monster("Dameargo",1,bc,pr));

      pr = new Prize(1,1);
      bc = new BadConsequence("Da mucho asquito. Pierdes 3 niveles",3,0,0);
      monstruos.add(new Monster("Pollipólipo volante",3,bc,pr));

      pr = new Prize(3,1);
      bc = new BadConsequence("No le hace gracia que pronuncien mal su nombre. Estas muerta");
      monstruos.add(new Monster("Yskhtihyssg-Goth",12,bc,pr));

      pr = new Prize(4,1);
      bc = new BadConsequence("La familia te atrapa.Estas muerta");
      monstruos.add(new Monster("Familia feliz",1,bc,pr));

      pr = new Prize(2,1);
      bc = new BadConsequence("La quinta directiva primaria te obliga a perder 2 niveles y un tesoro 2 manos visible",
      2,new ArrayList(Arrays.asList(TreasureKind.BOTHHANDS)),null);
      monstruos.add(new Monster("Robogoth",8,bc,pr));

      pr = new Prize(1,1);
      bc = new BadConsequence("Te asusta en la noche. Pierdes un casco visible",
      0, new ArrayList(Arrays.asList(TreasureKind.HELMETS)), null );
      monstruos.add(new Monster("El espía",5,bc,pr));

      pr = new Prize(1,1);
      bc = new BadConsequence("Menudo susto te llevas. Pierdes 2 niveles y 5 tesoros visibles",
      2,5,0);
      monstruos.add(new Monster("El lenguas",20,bc,pr));

      pr = new Prize(1,1);
      bc = new BadConsequence("Te faltan manos para tanta cabeza, pierdes 3 niveles y tus tesoros visibles de las manos",
      3,new ArrayList(Arrays.asList(TreasureKind.ONEHAND,TreasureKind.ONEHAND,
      TreasureKind.BOTHHANDS)),null);
      monstruos.add(new Monster("Bicefalo",20,bc,pr));

      ArrayList<Monster> above10 = new ArrayList();
      monstruos.stream().filter((m) -> (m.getCombatLevel() > 10)).forEach((m) -> {
          above10.add(m);
        });

      ArrayList<Monster> looselev = new ArrayList();
      for (Monster m : monstruos){
        if (m.getBadConsequence().getLevels() > 0 && m.getBadConsequence().getNHiddenTreasures() <= 0
        && m.getBadConsequence().getNVisibleTreasures() <= 0 &&
        m.getBadConsequence().getSpecificVisibleTreasures() == null &&
        m.getBadConsequence().getSpecificHiddenTreasures() == null){
          looselev.add(m);
        }
      }

      ArrayList<Monster> twoorplus = new ArrayList();
      for (Monster m : monstruos){
        if (m.getPrize().getLevels() > 1){
          twoorplus.add(m);
        }
      }

      ArrayList<Monster> loosehelmet = new ArrayList();
      for (Monster m : monstruos){
        if (m.getBadConsequence().getSpecificVisibleTreasures() != null){
          for(TreasureKind t : m.getBadConsequence().getSpecificVisibleTreasures()){
            if (t == TreasureKind.HELMETS){
              loosehelmet.add(m);
            }
          }
        }
        else if (m.getBadConsequence().getSpecificHiddenTreasures() != null){
          for(TreasureKind t : m.getBadConsequence().getSpecificHiddenTreasures()){
            if (t == TreasureKind.HELMETS){
              loosehelmet.add(m);
            }
          }
        }
      }

      
      System.out.println("Monstruos con nivel superior a 10\n\n");
      for(Monster m : above10){
        System.out.println(m.toString());
      }

      System.out.println("Monstruos que solo te hacen perder nivel\n\n");
      for(Monster m : looselev){
        System.out.println(m.toString());
      }

      System.out.println("Monstruos que dan mas de 1 nivel\n\n");
      for(Monster m : twoorplus){
        System.out.println(m.toString());
      }

      System.out.println("Monstruos con los que pierdes el casco\n\n");
      for(Monster m : loosehelmet){
        System.out.println(m.toString());
      }
    }

}
