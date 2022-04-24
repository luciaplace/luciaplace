package springboot.project.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import springboot.project.dto.CommDto;

@Mapper
public interface CommDao {
	List<CommDto> selectComm(int no);
	int insertComm(CommDto dto);
	int deleteComm(int cno);
	int updateComm(Map<String,Object> map);
	CommDto commentOne(int cno);
	List<CommDto> commlist(int no);
	List<CommDto> recommlist(int no);

}
