package iniciante.java;
import java.util.Scanner;

public class Animal1049 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] entradas = new String[3];
        String saida ="";

        entradas[0] = teclado.nextLine();
        entradas[1] = teclado.nextLine();
        entradas[2] = teclado.nextLine();

        switch (entradas[0]) {
            case "vertebrado":
                switch (entradas[1]) {
                    case "ave":
                        switch (entradas[2]) {
                            case "carnivoro":
                                saida = "aguia";
                                break;
                            case "onivoro":
                                saida = "pomba";
                                break;

                            default:
                                break;
                        }
                        break;
                    case "mamifero":
                        switch (entradas[2]) {
                            case "onivoro":
                                saida = "homem";
                                break;
                            case "herbivoro":
                                saida = "vaca";
                                break;

                            default:
                                break;
                        }
                        break;
                    default:
                        break;
                }
                break;

            case "invertebrado":
                switch (entradas[1]) {
                    case "inseto":
                        switch (entradas[2]) {
                            case "hematofago":
                                saida = "pulga";
                                break;
                            case "herbivoro":
                                saida = "lagarta";
                                break;

                            default:
                                break;
                        }
                        break;
                    case "anelideo":
                        switch (entradas[2]) {
                            case "hematofago":
                                saida = "sanguessuga";
                                break;
                            case "onivoro":
                                saida = "minhoca";
                                break;

                            default:
                                break;
                        }
                        break;
                    default:
                        break;
                }
                break;

            default:
                break;
        }

        System.out.println(saida);
        teclado.close();

    }
}
