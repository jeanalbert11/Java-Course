package dominio;

public class Usuario {
    private int id;
    private String usuario;
    private String contraseña;

    public Usuario() {
    }

    public Usuario(int id) {
        this.id = id;
    }
    
    public Usuario(String username, String password) {
        this.usuario = username;
        this.contraseña = password;
    }
    
    public Usuario(int id, String username, String password) {
        this.id = id;
        this.usuario = username;
        this.contraseña = password;
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

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", username=" + usuario + ", password=" + contraseña + '}';
    }
    
    
}
