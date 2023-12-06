/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.day3;

import java.util.Scanner;

/**
 *
 * @author kawtarmahy
 */
public class Day3 {

    public static void main(String[] args) {
       ContactManager cm = new ContactManager();
       
        
      /* Contact c1=new Contact("chaimaa","chaimaa.mahy95@gmail.com","+21200000000");
       Contact c2=new Contact("lamiaa","lamiaa@gmail.com","+21200000010");
       Contact c3=new Contact("kawtar","kawtar@gmail.com","+21200001010");
       
       cm.ajouterContact(c1);
       cm.ajouterContact(c2);
       cm.ajouterContact(c3);
       
 
       cm.supprimercontact("chaimaa.mahy95@gmail.com");
       cm.rechercherContact("lamiaa@gmail.com");
       cm.updateContact("lam","lamiaa@gmail.com", "0600600600");
       cm.afficherListdesContact();
       
       */
       Scanner sc = new Scanner(System.in);

        int choix=1;
        while(choix>=1 && choix<=5){
             System.out.println(" Chousis 1 : pour afficher tout contacts.. 2: pour ajouter Contact .  3 : pour rechercher Contact .#4: pour update contact .5 :pour supprimer contact ");
             choix=sc.nextInt();
            switch(choix) {
       
             case 1:
                 
                 cm.afficherListdesContact();
             
                 
                 break;
       
            case 2:
                
                    System.out.println("Enter le nom");
                    String nom =sc.next();
                    System.out.println("Entrer l email");
                    String email=sc.next();
                    System.out.println("Entrer le numero de telephone");
                    String numTel =  sc.next();
                    
                    Contact con=new Contact(nom,email,numTel);
                    
                    cm.ajouterContact(con);
                    
                    
                    
                 break;
          
            case 3:
                
                
                    System.out.println("Enter l email du contact rechercher");
                    String myemail=sc.next();
                    cm.rechercherContact(myemail);
                    

                
                break;
            case 4:
                    System.out.println("Enter l email du contact que vous voulez modifier");
                    String e=sc.next();
                    
                    System.out.println("entrer le nouveau nom ");
                    String n=sc.next();
                    System.out.println("entrer le nouveau numero de tel ");
                    String t=sc.next();
                    cm.updateContact(n, e, t);
                
                break;
                
                
            case 5:
                     System.out.println("Enter l email du contact que vous voulez sypprimer");
                     String em=sc.next();
                     cm.supprimercontact(em);

          default:
           
        }

          
        }
        

        
       
       
       
       
    }
}
