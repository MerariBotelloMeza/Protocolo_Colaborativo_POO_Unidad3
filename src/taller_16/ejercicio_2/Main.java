package taller_16.ejercicio_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*Ejercicio 2:*/
        System.out.println("\nEjercicio 2:\n");


        GestorDocumentos gestorDocumentos = new GestorDocumentos();
        String tituloDocumento = "Harry Potter";
        Documento documentoWord = new DocumentoWord();
        Documento documentoPDF = new DocumentoPDF();
        Documento documentoExcel = new DocumentoExcel();

        System.out.println("Documento: "+tituloDocumento);
        System.out.println("\nSeleccione una opcion del menu:");
        System.out.println("1. Exportar a PDF");
        System.out.println("2. Exportar a Word");
        System.out.println("3. Exportarr a Excel");

        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                gestorDocumentos.adminitrarDocumentos(documentoPDF,tituloDocumento);
            break;
            case 2:
                gestorDocumentos.adminitrarDocumentos(documentoWord,tituloDocumento);
            break;
            case 3:
                gestorDocumentos.adminitrarDocumentos(documentoExcel,tituloDocumento);
                break;
            default:
                System.out.println("Opcion invalida");

        }

    }
}
