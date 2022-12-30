import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // System.out.println("Digite um número: ");
    // double num = sc.nextDouble();

    // if(num >= 0 && num <=10){
    //   double parImpar = num % 2;

    //   if(parImpar == 0){
    //     System.out.println("Está entre 0 e 10, e o número par!");
    //   } else{
    //     System.out.println("Está entre 0 e 10, porém o número ímpar");
    //   }
    // } else {
    //   System.out.println("Número digitado é maior que 10 ou menor que 0!");
    // }
    
    // System.out.println("Digite o ano: ");
    // int year = sc.nextInt();

    // double yearBissexto = year % 4;

    // if(yearBissexto == 0){
    //   System.out.println("É um ano bissexto");
    // } else{
    //   System.out.println("Não é um ano bissexto");
    // }
    
    System.out.println("Digite a primeira nota: ");
    double nota1 = sc.nextDouble();
    System.out.println("Digite a segunda nota: ");
    double nota2 = sc.nextDouble();

    double media = (nota1 + nota2)/2;

    // if(media >= 7 && media <=10){
    //   System.out.println("Aprovado!");
    // } else if(media < 7 && media >=4){
    //   System.out.println("Recuperação!");
    // } else if(media < 4 && media >= 0){
    //   System.out.println("Reprovado!");
    // } else{
    //   System.out.println("Nota inválida");
    // }

    switch ((int)media) {
      case 7,8,9,10:
        System.out.println("Aprovado!");
        break;
      case 6,5,4:
        System.out.println("Recuperação");
        break;
      case 3,2,1,0:
        System.out.println("Reprovado!");
      default:
        System.out.println("Nota inválida");
        break;
    }
    sc.close();
  }
}