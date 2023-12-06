/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.day3;

import java.util.ArrayList;

/**
 *
 * @author kawtarmahy
 */
public class ContactManager {
    
    private ArrayList<Contact> contacts;
    
    public ContactManager(){
        this.contacts= new ArrayList<>();
    }
    
    public void afficherListdesContact(){
        if(this.contacts.isEmpty()){
            System.out.println("la liste des contact est vide");
        }
          for(Contact contact : contacts){
              
              System.out.println(contact.toString());
        }
        
        
    }
    
    public void ajouterContact(Contact contact){
        this.contacts.add(contact);
        System.out.println("Le contact est ajouter avec succes");
    }
    
    public Contact rechercherContact(String email){
        for(Contact contact : contacts){
            if(contact.getEmail().equals(email)){
                System.out.println("le contact rechercher est ::"+contact.toString());
                return contact;
            }
            
        }
        return null;
        
    }
    public void supprimercontact(String email){
        if(rechercherContact(email)==null){
            System.out.println("contact does not exist");
            
        }else {
            contacts.remove(rechercherContact(email));
            System.out.println("contact supprimer avec succes");
            
        }
        
    }
    public void updateContact(String nom , String email ,String numTel ){
        
        Contact mycontact=rechercherContact(email);
        if(mycontact==null){
            System.out.println("contact introuvable");
        }else{
            
            mycontact.setnom(nom);
            mycontact.setNumTel(numTel);
        }
        
        
    }
    
    
}
