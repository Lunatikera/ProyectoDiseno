/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entidades.LibroEntidad;
import enumeradores.EstadoPrestamo;
import enumeradores.GeneroLibros;
import excepciones.LibroExcepcion;
import interfaces.ILibroDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author Usuario
 */
public class LibroDAO implements ILibroDAO {

    private EntityManagerFactory entityManagerFactory;

    public LibroDAO() {
        this.entityManagerFactory = Conexion.getInstance();
    }

    @Override
    public void agregarLibro(LibroEntidad libro) throws LibroExcepcion {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(libro);
        entityManager.getTransaction().commit();
        entityManager.close();

    }

    @Override
    public void actualizarLibro(LibroEntidad libro) throws LibroExcepcion {
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.merge(libro);
        entityManager.getTransaction().commit();
        entityManager.close();

    }

    @Override
    public void eliminarLibro(String isbn) throws LibroExcepcion {
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        LibroEntidad libro = entityManager.find(LibroEntidad.class, isbn);
        if (libro != null) {
            entityManager.remove(libro);
            entityManager.getTransaction().commit();
            entityManager.close();
        } else {
            entityManager.getTransaction().rollback();
            throw new LibroExcepcion("No se encontró el libro con el ID proporcionado.");
        }
    }

    @Override
    public LibroEntidad consultarLibro(String isbn) throws LibroExcepcion {
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            TypedQuery<LibroEntidad> query = entityManager.createQuery(
                    "SELECT l FROM LibroEntidad l WHERE l.isbn = :isbn",
                    LibroEntidad.class
            );
            query.setParameter("isbn", isbn);

            LibroEntidad libro = query.getSingleResult();
            return libro;
        } catch (NoResultException e) {
            throw new LibroExcepcion("No se encontró el libro con el ISBN proporcionado.");
        } finally {
            entityManager.close();
        }
    }

    public List<LibroEntidad> listaLibrosTitulo(String titulo) throws LibroExcepcion {
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            String jpql = "SELECT l FROM LibroEntidad l WHERE l.titulo LIKE :titulo";

            TypedQuery<LibroEntidad> query = entityManager.createQuery(jpql, LibroEntidad.class);

            query.setParameter("titulo", "%" + titulo + "%");

            return query.getResultList();
        } catch (Exception e) {
            throw new LibroExcepcion("Error al obtener la lista de libros por título: " + e.getMessage());
        }
    }

    @Override
    public List<LibroEntidad> listaLibrosGenero(String genero) throws LibroExcepcion {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        GeneroLibros generoLibro = GeneroLibros.convertirStringAGenero(genero);
        try {
            String jpql = "SELECT l FROM LibroEntidad l WHERE l.genero = :genero";

            TypedQuery<LibroEntidad> query = entityManager.createQuery(jpql, LibroEntidad.class);

            query.setParameter("genero", generoLibro);

            return query.getResultList();
        } catch (Exception e) {
            throw new LibroExcepcion("Error al obtener la lista de libros por genero: " + e.getMessage());
        }
    }

    @Override
    public List<LibroEntidad> listaLibros() throws LibroExcepcion {
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Query query = entityManager.createQuery("SELECT l FROM LibroEntidad  l");
        return query.getResultList();
    }

    public List<LibroEntidad> paginadoLibros(int limit, int offset) throws LibroExcepcion {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            TypedQuery<LibroEntidad> query = entityManager.createQuery("SELECT l FROM LibroEntidad  l", LibroEntidad.class);
            query.setFirstResult(offset);
            query.setMaxResults(limit);
            return query.getResultList();
        } catch (Exception ex) {
            throw new LibroExcepcion("Error al paginar libros");
        }
    }
}
