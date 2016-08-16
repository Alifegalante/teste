package alife.g.cadastrousuario.to;

import alife.g.cadastrousuario.dao.domain.Usuario;
import alife.g.cadastrousuario.model.dao.UsuarioDao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class UsuarioController {
 
    private  UsuarioDao dao;
    private Usuario usuarioManipulado;
    private List<Usuario> lista;

    public UsuarioController() {
        this.dao = new UsuarioDao();
        this.usuarioManipulado = null;
        this.lista = new ArrayList<Usuario>();
    }
    
    public void pesquisar(){ 
      this.lista = dao.listar();
    }
    
    public void novo(){ 
      this.usuarioManipulado = new Usuario();             
    }
    
     public void editar(){ 
            
    }
    
    public void excluir(){ 
            
      this.dao.excluir(this.usuarioManipulado);
      }
    
    public void salvar(){ 
      this.dao.salvar(this.usuarioManipulado);
    }

    public Usuario getUsuarioManipulado() {
        return usuarioManipulado;
    }

    public void setUsuarioManipulado(Usuario usuarioManipulado) {
        this.usuarioManipulado = usuarioManipulado;
    }

    public List<Usuario> getLista() {
        return lista;
    }

    public void setLista(List<Usuario> lista) {
        this.lista = lista;
    }
    
}

