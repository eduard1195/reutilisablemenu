package sample;

public class Student {
	private String nume;
	private String profil;
	private double medie;
	Student(String n, String p, double m){
		this.nume=n;
		this.profil=p;
		this.medie=m;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getProfil() {
		return profil;
	}
	public void setProfil(String profil) {
		this.profil = profil;
	}
	public double getMedie() {
		return medie;
	}
	public void setMedie(double medie) {
		this.medie = medie;
	}
}
