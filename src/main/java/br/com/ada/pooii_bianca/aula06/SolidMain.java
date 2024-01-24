package br.com.ada.pooii_bianca.aula06;

public class SolidMain {
    public static void main(String[] args) {

        // SOLID:
        //aplicados a Linguagens Orientadas a Objetos
        //deixam o código mais manutenível e MENOS acoplado

        // SRP -> Principio da responsabilidade unica (Single responsibility principle):
                //Só altera se for só por 1 motivo
                    //Se tiver mais, então esse Princípio está sendo violado

        // OCP -> Principio do aberto e fechado (Open-Closed Principle):
            	//Classe tem q ser aberta pra receber NOVAS implementações/comportamentos SEM precisar mexer nela
		            //MAS NÃO pode alterar NADA nas novas implementações
		            //aberto pra extensão, fechado pra modificação

        // LSP -> Principio da substituicao de liskov (Liskov substitution principle)
        // ISP -> Principio da segregacao de interfaces (Interface substitution principle)
        // DIP -> Principio da inversao de dependencia (Dependency inversion principle)

        // --> Principio da Injecao de dependencia

        // SRP -> exercicio
        // OCP

        Funcionario funcionariaErica = new Gerente("erica", 5000);
        Funcionario funcionariaPaula = new Produto("paula", 2000);
        Funcionario funcionariaAgata = new Almoxarifado("agata", 3200);

        double bonusErica = funcionariaErica.calcularBonus();
        double bonusPaula = funcionariaPaula.calcularBonus();
        double bonusAgata = funcionariaAgata.calcularBonus();

        System.out.println(bonusErica);
        System.out.println(bonusPaula);
        System.out.println(bonusAgata);

    }
}
