package br.com.projetoapi.projeto.DAO;

import org.springframework.data.repository.CrudRepository;

import br.com.projetoapi.projeto.model.Usuario;

public interface IUsuario extends CrudRepository<Usuario, Integer>{

}
