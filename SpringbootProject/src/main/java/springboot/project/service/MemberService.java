package springboot.project.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import springboot.project.dao.MemberDao;
import springboot.project.dto.BoardDto;
import springboot.project.dto.CommDto;
import springboot.project.dto.EmailVO;
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

@Service
public class MemberService {
	@Autowired
	   MemberDao dao;
	   
	   @Autowired
	   protected JavaMailSender mailSender;
	   
	   public int insertMember(MemberDto dto) {
	      return dao.insertMember(dto);
	   }
	   
	   public String idChk(String memberid) {
	      return dao.idChk(memberid);
	   }
	   
	   public boolean sendMail(EmailVO email) throws Exception {

	      try {

	         MimeMessage msg = mailSender.createMimeMessage();

	         msg.setSubject(email.getSubject());

	         
	         msg.setText(email.getContent());

	         
	         msg.setRecipient(RecipientType.TO, new InternetAddress(email.getReceiver()));
	         

	         mailSender.send(msg);

	         return true;

	      } catch (Exception ex) {

	         ex.printStackTrace();

	      }

	      return false;

	   }
	   
	   public int userCount(String memberid, String memberpw) {
	      Map<String,Object> map = new HashMap<String,Object>();
	      map.put("memberid", memberid);
	      map.put("memberpw", memberpw);
	      return dao.userCount(map);
	   }
	   
	   public MemberDto login(String memberid,String memberpw) {
	      Map<String, Object> map=new HashMap<String, Object>();
	      map.put("memberid", memberid);
	      map.put("memberpw", memberpw);
	      return dao.login(map);
	   }
	   
	   public MemberDto findId(MemberDto dto) {
	      return dao.findId(dto);
	   }
	   
	   public MemberDto findPw(MemberDto dto) {
	      return dao.findPw(dto);
	   }
	   
	   public void updatePw(MemberDto dto) {
	      dao.updatePw(dto);
	   }
	   
	   public int updateMember(MemberDto dto) {
	      return dao.updateMember(dto);
	   }
	   
	   public int deleteMember(String memberpw, MemberDto dto) {
	      String pw = dto.getMemberpw();
	      String memberid = dto.getMemberid();
	      Map<String, Object> map = new HashMap<String, Object>();
	      map.put("memberid",memberid);
	      map.put("memberpw",pw);
	      return dao.deleteMember(map);
	   }
	   
	   public ArrayList<MypageDto> getBoardList(String memberid) {
	      return dao.myBoard(memberid);
	   }
	   
	   public ArrayList<MypageCommDto> getCommList(String memberid){
	      return dao.myComm(memberid);
	   }
	   
	   public int roomCount(String memberid) {
	      return dao.roomCount(memberid);
	   }
	   public List<RoomDto> myRoomList(String memberid ,int start, int end ){
	      Map<String,Object> map = new HashMap<String,Object>();
	      map.put("memberid", memberid);
	      map.put("start", start);
	      map.put("end", end);
	      return dao.myRoomList(map);
	   }
	   
	   public int boardCount(String memberid) {
	      return dao.boardCount(memberid);
	   }
	   public List<BoardDto> myBoardList(String memberid ,int start, int end){
	      Map<String,Object> map = new HashMap<String,Object>();
	      map.put("memberid", memberid);
	      map.put("start", start);
	      map.put("end", end);
	      return dao.myBoardList(map);
	   }
	   
	   public int fsCount(String memberid) {
	      return dao.fsCount(memberid);
	   }
	   public List<FoodboardDto> myFsboardList(String memberid ,int start, int end){
	      Map<String,Object> map = new HashMap<String,Object>();
	      map.put("memberid", memberid);
	      map.put("start", start);
	      map.put("end", end);
	      return dao.myFsboardList(map);
	   }
	   
	   public int petCount(String memberid) {
	      return dao.petCount(memberid);
	   }
	   public List<PetcareDto> myPetList(String memberid ,int start, int end){
	      Map<String,Object> map = new HashMap<String,Object>();
	      map.put("memberid", memberid);
	      map.put("start", start);
	      map.put("end", end);
	      return dao.myPetList(map);
	   }
	   
	   public int roomCommCount(String memberid) {
	      return dao.roomCommCount(memberid);
	   }
	   public List<RoomCommentDto> myRoomComm(String memberid, int start, int end){
	      Map<String,Object> map = new HashMap<String,Object>();
	      map.put("memberid", memberid);
	      map.put("start", start);
	      map.put("end", end);
	      return dao.myRoomComm(map);
	   }
	   
	   public int boardCommCount(String memberid) {
	      return dao.boardCommCount(memberid);
	   }
	   public List<CommDto> myBoardComm(String memberid, int start, int end){
	      Map<String,Object> map = new HashMap<String,Object>();
	      map.put("memberid", memberid);
	      map.put("start", start);
	      map.put("end", end);
	      return dao.myBoardComm(map);
	   }
	   
	   public int fsCommCount(String memberid) {
	      return dao.fsCommCount(memberid);
	   }
	   public List<FscommDto> myFsComm(String memberid, int start, int end){
	      Map<String,Object> map = new HashMap<String,Object>();
	      map.put("memberid", memberid);
	      map.put("start", start);
	      map.put("end", end);
	      return dao.myFsComm(map);
	   }
	   
	   public int petCommCount(String memberid) {
	      return dao.petCommCount(memberid);
	   }
	   public List<PetcommentDto> myPetComm(String memberid, int start, int end){
	      Map<String,Object> map = new HashMap<String,Object>();
	      map.put("memberid", memberid);
	      map.put("start", start);
	      map.put("end", end);
	      return dao.myPetComm(map);
	   }
	   
	   public List<RoomDto> mainRomm(){
			return dao.mainRomm();
		}
	   
	   public List<FoodboardDto> mainFood(){
		   return dao.mainFood();
	   }
	   public List<GroupBuyingDto> mainGroupBuy(){
		   return dao.mainGroupBuy();
	   }
	   public List<PetcareDto> mainPet(){
		   return dao.mainPet();
	   }
	   
	   public List<FoodCountDto> countFood(){
		   return dao.countFood();
	   }
	   
	}
