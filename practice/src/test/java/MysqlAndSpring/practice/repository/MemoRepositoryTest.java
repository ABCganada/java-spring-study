package MysqlAndSpring.practice.repository;

import MysqlAndSpring.practice.domain.Memo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;
import java.util.stream.IntStream;

@SpringBootTest
public class MemoRepositoryTest {

    @Autowired
    MemoRepository memoRepository;

    @Test
    public void Insert(){

        IntStream.rangeClosed(1,10).forEach(i ->{
            Memo memo = Memo.builder()
                    .context("Sample..." + i)
                    .build();
            //create
            memoRepository.save(memo);
        });
    }

    @Test
    public void Select(){

        Long id = 4L;

        Optional<Memo> result = memoRepository.findById(id);

        System.out.println("=============================");

        if(result.isPresent()){
            Memo memo = result.get();
            System.out.println(memo);
        }
    }

    @Test
    public void Update(){
        Memo memo = Memo.builder()
                .id(4L)
                .context("Update Text")
                .build();

        memoRepository.save(memo);
    }

    @Test
    public void DeleteDummies(){
        Long id = 5L;

        memoRepository.deleteById(id);
    }
}
