package exerHerUniv.Aplicacao;

import java.time.LocalDate;

import exerHerUniv.Entidades.Aluno;
import exerHerUniv.Entidades.Professor;
import exerHerUniv.Entidades.Funcionario;


public class Programa {
    public static void main(String[] args){
        LocalDate dataNascimento;
			
		//professor
		dataNascimento = LocalDate.of(1990, 9, 20);
		Professor prof = new Professor("Carla", dataNascimento, "Doutora", 10000.0);
	    prof.calcIdade();
	    double INSS = prof.calcINSS();
        System.out.println(prof.getNome()+ " " + prof.getDatadenasc() + " " + prof.getIdade() + " " + prof.getTitulacao() + " " + prof.getSalario() + " " + INSS);

        //aluno
		dataNascimento = LocalDate.of(2006, 1, 15);
		Aluno aluno = new Aluno("João", dataNascimento, 2500.0, 500.0);
	    aluno.calcIdade();
	    double pagamento = aluno.calculaPagamento();
        System.out.println(aluno.getNome()+ " " + aluno.getDatadenasc() + " " + aluno.getIdade() + " " + aluno.getMensalidade() + " " + aluno.getDesconto() + " " + pagamento);
        
        //funcionario
		dataNascimento = LocalDate.of(1985, 10, 14);
		Funcionario func = new Funcionario("Manfredo", dataNascimento, 60.0, 60);
		func.calcIdade();
	    double salario = func.calcSalario();
        System.out.println(func.getNome()+ " " + func.getDatadenasc() + " " + func.getIdade() + " " + func.getQnteHoras() + " " + func.getValorHora() + " " + salario);
    }
}
