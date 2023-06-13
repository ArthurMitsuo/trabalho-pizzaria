package entities.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import pizzaria.entities.Usuario;

public class UsuarioDAO {

    private EntityManagerFactory emf;
        
        public UsuarioDAO() {
        emf = Persistence.createEntityManagerFactory("my-persistence-unit");

    }


    public void salvarPessoa(Usuario pessoa) {

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(pessoa);
        em.getTransaction().commit();
        em.close();

    }

    public Usuario buscarUsuarioPorId(Long id) {

        EntityManager em = emf.createEntityManager();
        Usuario usuario = em.find(Usuario.class, id);
        em.close();
        return usuario;

    }


    public List<Usuario> buscarTodasUsuarios() {

        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("SELECT p FROM Usuario p");
        List<Usuario> usuarios = query.getResultList();
        em.close();
        return usuarios;

    }


    public void atualizarPessoa(Usuario pessoa) {

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(pessoa);
        em.getTransaction().commit();
        em.close();

    }

    public void excluirPessoa(Usuario usuario) {

            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            usuario = em.merge(usuario);
            em.remove(usuario);
            em.getTransaction().commit();
            em.close();

    }
}
