package br.com.pjr.exemploelasticsearch.service;

import br.com.pjr.exemploelasticsearch.entidade.Produto;
import br.com.pjr.exemploelasticsearch.repository.ProdutoRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;


    public Produto incluir(final Produto produto) {

        produto.setId(null);

        Produto produtoSalvo = repository.save(produto);

        return repository.save(produtoSalvo);
    }

    public Produto alterar(final Produto produto, Long id) {

        Produto produtoPesquisado = pesquisarPorId(id);

        BeanUtils.copyProperties(produto, produtoPesquisado);

        return repository.save(produtoPesquisado);

    }

    public void excluir(final Long id) {

        repository.deleteById(id);

    }

    public Produto pesquisarPorId(final Long id) {

        return repository.findById(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
    }

    public Iterable<Produto> listar() {

        return repository.findAll();
    }

}