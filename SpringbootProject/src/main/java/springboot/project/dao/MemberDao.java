package springboot.project.dao;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import springboot.project.dto.BoardDto;
import springboot.project.dto.CommDto;
import springboot.project.dto.FoodCountDto;
import springboot.project.dto.FoodboardDto;
import springboot.project.dto.FscommDto;
import springboot.project.dto.GroupBuyingDto;
import springboot.project.dto.MemberDto;
import springboot.project.dto.MypageCommDto;
import springboot.project.dto.MypageDto;
import springboot.project.dto.PetcareDto;
import springboot.project.dto.PetcommentDto;
import springboot.project.dto.RoomCommentDto;
import springboot.project.dto.RoomDto;


@Mapper
public interface MemberDao {
	int insertMember(MemberDto dto); //ȸ������
	   String idChk(String memberid);//id�ߺ�üũ
	   int userCount(Map<String, Object> map);
	   MemberDto login(Map<String, Object> map);//�α���
	   MemberDto findId(MemberDto dto);//���̵�ã��
	   MemberDto findPw(MemberDto dto);//��й�ȣã��
	   void updatePw(MemberDto dto);//��й�ȣ ����
	   int updateMember(MemberDto dto); //ȸ�� ���� ����
	   int deleteMember(Map<String, Object> map);//ȸ�� Ż��
	   
	   ArrayList<MypageDto> myBoard(String memberid);
	   ArrayList<MypageCommDto> myComm(String memberid);
	   
	   int roomCount(String memberid);
	   List<RoomDto> myRoomList(Map<String, Object> map);
	   int boardCount(String memberid);
	   List<BoardDto> myBoardList(Map<String, Object> map);
	   int fsCount(String memberid);
	   List<FoodboardDto> myFsboardList(Map<String, Object> map);
	   int petCount(String memberid);
	   List<PetcareDto> myPetList(Map<String, Object> map);
	   
	   int roomCommCount(String memberid);
	   List<RoomCommentDto> myRoomComm(Map<String, Object> map);
	   int boardCommCount(String memberid);
	   List<CommDto> myBoardComm(Map<String, Object> map);
	   int fsCommCount(String memberid);
	   List<FscommDto> myFsComm(Map<String, Object> map);
	   int petCommCount(String memberid);
	   List<PetcommentDto> myPetComm(Map<String, Object> map);
	   
	   List<RoomDto> mainRomm();
	   List<FoodboardDto> mainFood();
	   List<GroupBuyingDto> mainGroupBuy();
	   List<PetcareDto> mainPet();
	   
	   List<FoodCountDto> countFood();
	   
	   
	   
	}