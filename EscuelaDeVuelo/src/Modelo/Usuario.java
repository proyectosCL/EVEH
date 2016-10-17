package Modelo;

public class Usuario {

    private int id_usuario;

    private String usuario;

    private String pass;
    
    private int id_tipo;
    
    private String estado_usuario;

    public Usuario() {
    }
    
    

    public Usuario(int id_usuario, String usuario, String pass, int id_tipo, String estado_usuario) {
        this.id_usuario = id_usuario;
        this.usuario = usuario;
        this.pass = pass;
        this.id_tipo = id_tipo;
        this.estado_usuario = estado_usuario;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
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

    public int getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(int id_tipo) {
        this.id_tipo = id_tipo;
    }

    public String getEstado_usuario() {
        return estado_usuario;
    }

    public void setEstado_usuario(String estado_usuario) {
        this.estado_usuario = estado_usuario;
    }

    
    

   
    
    
}
