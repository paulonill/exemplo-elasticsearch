package br.com.pjr.exemploelasticsearch.repository;

import br.com.pjr.exemploelasticsearch.entidade.Produto;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ProdutoRepository extends ElasticsearchRepository<Produto, Long> {
}
