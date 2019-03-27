package br.com.pjr.exemploelasticsearch.service;

import br.com.pjr.exemploelasticsearch.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;


}
