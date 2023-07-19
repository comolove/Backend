package Funssion.Inforum.mypage.repository;

import Funssion.Inforum.memo.dto.MemoListDto;
import Funssion.Inforum.mypage.dto.MyRecordNumDto;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.NoSuchElementException;

@Repository
@RequiredArgsConstructor
public class MyRepositoryJdbc implements MyRepository{

    private final JdbcTemplate template;
//    @Override
//    public List<MyRecordNumDto> findRecordNumByUserId(String userId) {
//        String sql = "";
//
//        template.query()
//    }



    @Override
    public List<MemoListDto> findAllByUserId(int userId) {
        String sql = "select * from memo where user_id = ?";
        List<MemoListDto> memoList = template.query(sql, MemoListDto.memoListRowMapper(), userId);
        if (memoList.isEmpty()) throw new NoSuchElementException("memo not found");
        return memoList;
    }
}
