/*
8ª) Criar um programa que verifique se um número é primo ou não, através de um método. Número primo é divisível somente por 1 e por ele mesmo.


import javax.swing.JOptionPane;

class Main {

  public static String numeroPrimo(int c){
    
    String msg = "";
    for(int d = 2; d <= c; d++){
      if(c%d==0){
        if(c==2){
          msg = c + " é um número primo";
        }
        msg = c + " não é um número primo";
        break;
      }
      if(d == c-1){
        msg = c + " é um número primo";
        break;
      }
    }
    return msg;
  }

  public static void main(String[] args) {
    int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
    String primo = numeroPrimo(num);
    JOptionPane.showMessageDialog(null, "O número " + primo);
  }
}
*/

/*
7ª) Criar um programa que retorne o fatorial de um número, usando um método que receba um valor e retorne o fatorial desse valor. Fatorial de 5 = 5 x 4 x 3 x 2 x 1 = 120

import javax.swing.JOptionPane;

class Main {

  public static int fatorial(int num){
    int fatorial = num;
    for(int c = num; c >= 2; c--){
      fatorial *= (c-1);
    }
    return fatorial;
  }

  public static void main(String[] args) {
    int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
    fatorial(num);
    int valorFatorial = fatorial(num);
    JOptionPane.showMessageDialog(null, "O fatorial de " + num + " é igual a: " + valorFatorial);
  }
}
*/

/*
6ª) Criar um programa que receba um número que corresponda a um mês do 1º trimestre e escreva o mês correspondente; caso o usuário digite o número fora do intervalo deverá aparecer inválido, mas utilizando um método do tipo void.



import javax.swing.JOptionPane;

class Main {

  public static void mes(int num){
    switch(num){
      case 1:
        JOptionPane.showMessageDialog(null, "Janeiro");
        break;
      case 2:
        JOptionPane.showMessageDialog(null, "Fevereiro");
        break;
      case 3:
        JOptionPane.showMessageDialog(null, "Março");
        break;
      default:
        JOptionPane.showMessageDialog(null, "Mês inválido");
    }
  }

  public static void main(String[] args) {
    int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de um mês do primeiro trimestre"));
    mes(num);
  }
}
*/

/*
5ª) Criar um programa que mostre qual o maior valor entre dois números, utilizando um método do tipo void (que não retorna valores).


import javax.swing.JOptionPane;

class Main {

  public static void showGreater (int num1, int num2){
    int greater = (num1 > num2) ? num1 : num2;
    JOptionPane.showMessageDialog(null, "O numero maior entre " + num1 + " e " + num2 + " é o: " + greater);
  }

  public static void main(String[] args) {
    int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
    int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
    showGreater(num1, num2);
  }
}
*/

/*
4ª) Criar um programa que receba um grau e o converta para radianos através de um método. Fórmula: radiano = grau * pi / 180

import javax.swing.JOptionPane;
import java.math.*;
import java.text.MessageFormat;

class Main {

  public static double calcRadiano (double grau){
    double radianos = (grau * Math.PI) / 180;
    return radianos;
  }

  public static void main(String[] args) {
    double grau = Double.parseDouble(JOptionPane.showInputDialog("Digite o grau!"));
    double radianos = calcRadiano(grau);
    String msg = MessageFormat.format("O valor do grau {0, number,#.##} " + "em radianos é igual a {1, number,#.##}", grau, radianos);
    JOptionPane.showMessageDialog(null, msg);
  }
}
*/


/*
3ª) Criar um programa que receba 2 valores e calcule o produto através de um método que retorna valores.


import javax.swing.JOptionPane;

class Main {

  public static double calcProduto (double x, double y){
    double produto = x * y;
    return produto;
  }

  public static void main(String[] args) {
    double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor!"));
    double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor!"));
    
    double produto = calcProduto(num1, num2);
    JOptionPane.showMessageDialog(null, "O produto dos valores " + num1 + " e " + num2 + " é igual a " + produto);
  }
}
*/

/*
2ª) Criar um programa que receba 4 notas e calcule a média aritmética, através de um método.


import javax.swing.JOptionPane;

class Main {

  public static double media (double x, double y, double z, double w){
    double media = (x+y+z+w)/4;
    return media;
  }

  public static void main(String[] args) {
    double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota!"));
    double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota!"));
    double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota!"));
    double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota!"));
    
    double media = media(nota1, nota2, nota3, nota4);
    JOptionPane.showMessageDialog(null, "A média aritmética da soma das notas " + nota1 + ", " + nota2 + ", " + nota3 + " e " + nota4 + " é igual a " + media);
  }
}
*/

/*
1ª) Criar um programa que permita a entrada de um número inteiro e retorne o seu dobro, através de um método.

import javax.swing.JOptionPane;

class Main {

  public static int DobraInteiro(int x){
    int r = x*2;
    return r;
  }

  public static void main(String[] args) {
    int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor!"));
    int num2x = DobraInteiro(num);
    JOptionPane.showMessageDialog(null, "O dobro de " + num + " é igual a " + num2x);
  }
}
*/