# AC2: Sistema de Gestão de Funcionários

## Objetivo
O objetivo desta avaliação é implementar um sistema de gestão de funcionários utilizando os conceitos de programação orientada a objetos (POO), como herança, polimorfismo, interfaces, sobrescrita e sobrecarga de métodos, entre outros. O sistema permite a criação de diferentes tipos de funcionários (Funcionário, Gerente e Diretor), o cálculo de seus salários e a gestão de um departamento com diversos funcionários.

## Implementação
### Classes:

#### FuncionarioBase:
- Atributos protegidos: nome (String), salarioBase (double)
- Método abstrato calcularSalario()
- Método sobrecarregado calcularSalario(bonusAdicional: double)
- Getters & Setters
#### Funcionario:
- Herda de FuncionarioBase
- Implementa calcularSalario()
#### Gerente:
- Atributo protegido: bonusPercentual (double)
- Herda de FuncionarioBase
- Implementa calcularSalario()
- Implementa a interface Beneficios
- Getters & Setters
#### Diretor:
- Atributos protegidos: bonusPercentual (double), auxilioMoradia (double)
- Herda de FuncionarioBase
- Implementa calcularSalario()
- Implementa a interface Beneficios
- Getters & Setters
#### Beneficios:
- Interface com métodos calcularBonus(percentual: double) e calcularAuxilioMoradia(valorFixado: double)
#### Departamento:
- Atributos: nome (String), funcionarios (ArrayList<FuncionarioBase>)
- Métodos: adicionarFuncionario(), removerFuncionario(), calcularFolhaPagamento(), imprimirSalariosFuncionarios()

### PSVM (Main):

``` java
public class Main {

    public static void main(String[] args) {

        Departamento tecnologia = new Departamento("Tecnologia");

        Funcionario f1 = new Funcionario("João", 3_000);
        Gerente g1 = new Gerente("Maria", 5_000, 20);
        Diretor d1 = new Diretor("Carlos", 10_000, 30, 2_000);

        tecnologia.adicionarFuncionario(f1);
        tecnologia.adicionarFuncionario(g1);
        tecnologia.adicionarFuncionario(d1);

        tecnologia.imprimirSalariosFuncionarios();

        System.out.println("\n\nFolha de pagamento: " + tecnologia.calcularFolhaPagamento());
    }
}
```

## Saída
```
Adicionado João ao departamento Tecnologia
Adicionado Maria ao departamento Tecnologia
Adicionado Carlos ao departamento Tecnologia


Funcionário: João
Salário: R$3000.0


Funcionário: Maria
Salário: R$6000.0


Funcionário: Carlos
Salário: R$15000.0


Folha de pagamento: R$24000.0

Process finished with exit code 0
```

## Conclusão
Este sistema demonstra a aplicação de polimorfismo, permitindo que o método imprimirSalariosFuncionarios() seja utilizado para imprimir os salários de qualquer tipo de funcionário, independentemente de ser um Funcionário, Gerente ou Diretor. A interface Beneficios permite a reutilização de código para o cálculo de bônus e auxílio-moradia.
### Polimorfismo: O método calcularSalario() é polimórfico, pois seu comportamento varia de acordo com a classe que o implementa.
### Herança: As classes Funcionario, Gerente e Diretor herdam os atributos e métodos da classe base FuncionarioBase.
### Interfaces: A interface Beneficios define um contrato que as classes Gerente e Diretor devem implementar.