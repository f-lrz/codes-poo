package entidades;

public class Emprestimo {
	private static int numdeempre;
	private int num;
	private int diaempre;
	private int diadev;
	private Material []mat;
	private double multa;
	
	public Emprestimo(int num, int diaempre, Material []mat) {
		this.numdeempre += 1;
		setNum(num);
		setDiaempre(diaempre);
		setMat(mat);
		this.diadev = 0;
	}
	
	public void fazerDev(Material mat[], int dia) {
		setDiadev(dia);
		int difempre = diadev - diaempre;
		this.multa = 0;
		for(int i = 0; i < mat.length; i++) {
			if(mat[i].getDescr() == "livro") {
				if(difempre > 5 && difempre <= 8) {
					this.multa += difempre * 5.0;
				}
				if(difempre >= 9) {
					this.multa += difempre * 7.0;
				}
			}
			if(mat[i].getDescr() == "tese") {
				if(difempre >= 11 && difempre <= 15) {
					this.multa += difempre * 10.0;
				}
				if(difempre > 15) {
					this.multa += 100.0;
				}
			}
		}
	}
	
	public void imprimeEmpre() {
		System.out.println("Numero do emprestimo: " + getNum());
		System.out.println("Dia do emprestimo: "+ getDiaempre());
		if(getDiadev() != 0) {
			System.out.println("Numero de devolucao: " + getDiadev());
		}
		System.out.println("Valor da multa: " + getMulta());
		for(int i = 0; i < mat.length; i++) {
			if(mat[i].getDescr() == "livro") {
				System.out.println("Livro: " + mat[i].getDescr());
				System.out.println("Ano de lancamento: " + mat[i].getAnodelanc());
			}
			if(mat[i].getDescr() == "tese") {
				System.out.println("Tese: " + mat[i].getDescr());
				System.out.println("Data de Aprovacao: " + mat[i].getDatadeaprov());
			}
		}
			
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getDiaempre() {
		return diaempre;
	}
	public void setDiaempre(int diaempre) {
		this.diaempre = diaempre;
	}
	public int getDiadev() {
		return diadev;
	}
	public void setDiadev(int diadev) {
		this.diadev = diadev;
	}
	public Material getMat(int i) {
		return mat[i];
	}
	public void setMat(Material []mat) {
		for(int i = 0; i < mat.length; i++) {
			this.mat[i] = mat[i];
		}
	}
	public double getMulta() {
		return multa;
	}
	public void setMulta(double multa) {
		this.multa = multa;
	}
	public static int getNumdeempre() {
		return numdeempre;
	}
	public static void setNumdeempre(int numdeempre) {
		Emprestimo.numdeempre = numdeempre;
	}
	
	
	
}
