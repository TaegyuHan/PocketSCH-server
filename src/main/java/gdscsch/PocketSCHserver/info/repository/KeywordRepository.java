package gdscsch.PocketSCHserver.info.repository;


import gdscsch.PocketSCHserver.info.entity.Keyword;
import gdscsch.PocketSCHserver.token.entity.Token;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface KeywordRepository extends PagingAndSortingRepository<Keyword, Integer> {

    Keyword save(Keyword keyword);

    List<Keyword> findAllByTokenAndId(Token token, Integer id);

    Page<Keyword> findAllByToken(Token token, Pageable pageable);

    void deleteById(Integer id);
}