package com.twitter.utils;

public class ExecutionTimer {
	private double debut;
	
	public void ExecutionTimerDebut(){
		double debut = System.currentTimeMillis();
		this.debut=debut;
	}
	
	public void ExecutionTimerEnd(){
		double result = (System.currentTimeMillis()-this.debut)/ 1000;
		if(result<=1){
			System.out.println("Exécuté en "+result+" seconde");
		}else{
			System.out.println("Exécuté en "+result+" secondes");
		}
		
	}
	
}
