public class PaginaWeb {

   
    private String enlace;
    private String nombrePagina;
    private String fechavisita;

   
    public PaginaWeb(String enlace, String nombrePagina, String fechavisita) {
        this.enlace = enlace;
        this.nombrePagina = nombrePagina;
        this.fechavisita = fechavisita;
    }

  

    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }

    public String getNombrePagina() {
        return nombrePagina;
    }

    public void setNombrePagina(String nombrePagina) {
        this.nombrePagina = nombrePagina;
    }

    public String getFechavisita() {
        return fechavisita;
    }

    public void setFechavisita(String fechavisita) {
        this.fechavisita = fechavisita;
    }
}