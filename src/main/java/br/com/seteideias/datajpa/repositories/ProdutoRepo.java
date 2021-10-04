package br.com.seteideias.datajpa.repositories;

import br.com.seteideias.datajpa.entities.Produto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepo extends CrudRepository<Produto,String> {
}
