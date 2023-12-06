/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.day3;

/**
 *
 * @author kawtarmahy
 */
public class Contact {
    private String nom;
    private String email;
    private String numTel;
    
    
   public Contact(String nom, String email, String numTel){
        
       this.nom=nom ;
       this.email=email;
       this.numTel=numTel;
    }
    
   public String getnom(){
       return this.nom;
       
   }
   
   public void setnom(String nom){
       this.nom=nom;
            
   }
   public String getEmail(){
       return this.email;
   }
   public void setEmail(String email){
       
      this.email=email;
   } 
   public String getnumTel(){
       return this.numTel;
   
   }
   
   public void setNumTel(String numTel){
       this.numTel = numTel;
       
   }
   
   @Override
   public String toString(){
       
       return "Nom :"+this.nom+ " email : "+this.email+" Numero de telephone " + this.numTel;
       
   }
 
    
    
}
