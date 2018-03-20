package cajaSobresalto;

import java.util.ArrayList;

public class cajaSobresalto {
	
	private static int MAX;
	private static int MIN;
	
	private Queue<Integer> input;
	private ArrayList<Integer> puntos;
	private int nDatos=20;
	
	public cajaSobresalto() {
		puntos=new ArrayList<>();
		input=new Queue<Integer>();
	}
	
	public ArrayList<Integer> getDatos() {
		//Saca el primer dato de la cola
		//OJO y si la cola está vacía? Constante para recepción de datos?
		int dato=input.dequeue();
		
		if(puntos.size()>nDatos) {
			puntos.remove(0);
			puntos.add(dato);
		}else {
			puntos.add(dato);
		}
		return puntos;
	}
	
	public int getMin() {
		return MIN;
	}
	public int getRangoDatos() {
		return MAX-MIN;
	}
	
}
