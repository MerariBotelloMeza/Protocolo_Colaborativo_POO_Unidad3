package taller_16.ejercicio_2;

public class DocumentoExcel extends Documento {

    @Override
    public void exportar(String tituloDocumento) {
        System.out.println("El documento "+tituloDocumento+" se ha exportado como Excel.");
    }

}
