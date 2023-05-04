package multicampus.kb03.boot_mybatis_0504.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import multicampus.kb03.boot_mybatis_0504.entity.Bbs;

@Mapper
public interface BbsMapper {

	@Select("Select * FROM bbs order by no desc")
	List<Bbs> findAll();

	@Insert("INSERT into bbs(no,title,writer_id,content,regdate) values(BBS_SEQ.NEXTVAL,#{bbs.title},#{bbs.writer_id},"
			+ "#{bbs.content}"
			+ ",SYSDATE )")
	int save(@Param("bbs") Bbs bbs);
	

}
