package Modelo;

public class Usuario {

    private int id;

    private String usuario;

    private String pass;
    
    private String id_tipo;

    public Usuario(int id, String usuario, String id_tipo) {
        this.id = id;
        this.usuario = usuario;
        this.id_tipo = id_tipo;
    }

    public Usuario() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(String id_tipo) {
        this.id_tipo = id_tipo;
    }

    
    
}
