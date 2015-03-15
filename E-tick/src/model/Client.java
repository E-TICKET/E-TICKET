package model;
/***********************************************************************
 * Module:  Client.java
 * Author:  Oussama
 * Purpose: Defines the Class Client
 ***********************************************************************/

import java.util.*;
import javax.persistence.Entity;
import javax.persistence.OneToMany;


@Entity
public class Client {

	public  int numClient;
	
	public  String nomClient;
	
	public  String prenomClient;

	public  String adresseClient;

	public  String telClient;

	public  String loginClient;

	public  String passClient;


	@OneToMany
	public  Collection<Commande> commande;

	public int getNumClient() {
		return numClient;
	}


	public void setNumClient(int numClient) {
		this.numClient = numClient;
	}


	public String getNomClient() {
		return nomClient;
	}


	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}


	public String getPrenomClient() {
		return prenomClient;
	}


	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}


	public String getAdresseClient() {
		return adresseClient;
	}


	public void setAdresseClient(String adresseClient) {
		this.adresseClient = adresseClient;
	}


	public String getTelClient() {
		return telClient;
	}


	public void setTelClient(String telClient) {
		this.telClient = telClient;
	}


	public String getLoginClient() {
		return loginClient;
	}


	public void setLoginClient(String loginClient) {
		this.loginClient = loginClient;
	}


	public String getPassClient() {
		return passClient;
	}


	public void setPassClient(String passClient) {
		this.passClient = passClient;
	}


	public Collection<Commande> getCommande() {
		return commande;
	}


	public void setCommande(Collection<Commande> commande) {
		this.commande = commande;
	}


	




}