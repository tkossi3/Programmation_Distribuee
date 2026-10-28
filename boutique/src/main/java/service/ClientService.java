/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import java.util.List;
import model.Client;

/**
 *
 * @author tkossi
 */
public class ClientService {
    
    private static List<Client> listesClients;
    private static ClientService instance;
    
    private ClientService() {
        
    }
    
    public static synchronized ClientService getInstance() {
        if (instance == null) {
            instance = new ClientService();
            listesClients = new ArrayList<>();
        }
        return instance;
    }
    
    public void ajouter(Client client) {
        listesClients.add(client);
    }
    
    public Client modifier(long id, String nom, String prenom) {
        Client client = trouver(id);
        if (client != null) {
            client.setNom(nom);
            client.setPrenom(prenom);
        }
        return client;
    }
    
    public Client trouver(long id) {
        Client client = new Client();
        try {
            for (Client cl : listesClients) {
                if (cl.getId() == id) {
                    client = cl;
                }
            }
        } catch(Exception ex) {
            System.out.println("Client non trouvé");
        }
        return client;
    }
    
    public void supprimer(long id) {
        Client client = trouver(id);
        listesClients.remove(client);
    }
    
    public void supprimer(Client client) {
        listesClients.remove(client);
    }
    
    public int compter() {
        int sum = 0;
        for (Client cl : listesClients) {
            sum += 1;
        }
        return sum;
    }
    
    public void lister() {
        for (Client cl : listesClients) {
            System.out.println(cl);
        }
    }
    
}
