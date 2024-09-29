package TP1_2;

public class Point {
	private String nom;
	private int abs;
	private int ord;
	public Point (int abs, int ord) {
		this.abs = abs;
		this.ord = ord;
	}
	public Point (string nom) {
		this.nom = nom;
	}
	public Point (int abs, int ord, String nom) {
		this.nom = nom;
		this.abs = abs;
		this.ord = ord;
	}
	public void Affiche() {
		System.out.println(nom+"("+abs+","+ord+")");
	}
	public void TransHoriz (int dx){
		abs += dx ;
	}
	public void TransVert (int dx){
		ord += dx ; 
	}
	public void Translation (int dx , int dy){
		abs += dx ;
		ord += dy ;
	}
	public boolean Coincide(Point p) {
	if (this.abs == p.abs && this.ord == p.ord )
		return true;
	}
	public String getNom() {
		return this.nom;
	}
	public double getAbscisse() {
		return this.abs;
	}
	public double getOrdonnée() {
		return this.ord;
	}
}
