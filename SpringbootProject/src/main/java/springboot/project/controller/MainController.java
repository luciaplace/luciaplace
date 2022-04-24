package springboot.project.controller;



import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.google.gson.Gson;

import springboot.project.dto.BoardDto;
import springboot.project.dto.CommDto;
import springboot.project.dto.FoodCountDto;
import springboot.project.dto.FoodboardDto;
import springboot.project.dto.FscommDto;
import springboot.project.dto.MasterDto;
import springboot.project.dto.MemberDto;
import springboot.project.dto.PetcareDto;
import springboot.project.dto.PetcommentDto;
import springboot.project.dto.RoomCommentDto;
import springboot.project.dto.RoomDto;
import springboot.project.service.BoardService;
import springboot.project.service.CommService;
import springboot.project.service.FsboardService;
import springboot.project.service.MasterService;
import springboot.project.service.MemberService;
import springboot.project.service.Petcareservice;
import springboot.project.service.RoomService;

@Controller
@SessionAttributes("user")
public class MainController {
	   @Autowired
	   MemberService service;
	   @Autowired
	   RoomService rservice;
	   @Autowired
	   BoardService cservice;
	   @Autowired
	   CommService c_service;
	   @Autowired
	   FsboardService fservice;
	   @Autowired
	   CommService f_service;
	   @Autowired
	   Petcareservice pservice;
	   @Autowired
	   MasterService ms;
	   
	   
	   
	   
	   @ModelAttribute("user")
	   public MemberDto getMemberDto() {
	      return new MemberDto();
	   }
	   
	   //메인페이지 
	   @GetMapping("/")
	   public String main(@ModelAttribute("user") MemberDto dto, Model m,String id, String pw, MasterDto mdto) {
	      m.addAttribute("roomlist", service.mainRomm());
	      m.addAttribute("foodlist", service.mainFood());
	      m.addAttribute("buylist", service.mainGroupBuy());
	      m.addAttribute("petlist", service.mainPet());
	      m.addAttribute("master", ms.login(mdto));
	      List<FoodCountDto> fcount = service.countFood();
	      Gson json = new Gson();
	      String food = json.toJson(fcount);
	      m.addAttribute("food", food);
	      
	      return "index";
	   }
	   
	   //회원가입 약관동의 페이지
	   @GetMapping("/joinform")
	   public String joinForm() {
	      return "member/joinform";
	   }
	   
	   //회원가입 페이지
	   @GetMapping("/insertform")
	   public String insertForm() {
	      return "member/insertform";
	   }
	   
	   //회원가입 
	   @PostMapping("/insert")
	   public String insertMember(MemberDto dto) {
	      service.insertMember(dto);
	      return "redirect:/loginform";
	   }
	   
	   //id중복체크
	   @GetMapping("/idchk")
	   @ResponseBody
	   public String idChk(String memberid) {
	      String chkid = service.idChk(memberid);
	         
	      return chkid;
	         
	      }
	   
	   
	   //로그인페이지
	   @GetMapping("/loginform")
	   public String loginForm(@ModelAttribute("user") MemberDto dto) {
	      if(dto.getMemberid() != null) {
	         return "index";
	      }
	      return "member/loginform";      
	   }
	   //로그인
	   @PostMapping("/login")
	   public String login(@ModelAttribute("user") @Valid MemberDto dto, BindingResult error, Model m,String id ,String pw) {
		  m.addAttribute("roomlist", service.mainRomm());
	      m.addAttribute("foodlist", service.mainFood());
	      m.addAttribute("buylist", service.mainGroupBuy());
	      m.addAttribute("petlist", service.mainPet());
	      List<FoodCountDto> fcount = service.countFood();
	      Gson json = new Gson();
	      String food = json.toJson(fcount);
	      m.addAttribute("food", food);
		  String memberid = dto.getMemberid();
	      String memberpw = dto.getMemberpw();
	      int user = service.userCount(id,pw);
	      if(user == 0) {
	         m.addAttribute("member", 0);
	      }else {
	         m.addAttribute("member", 1);
	      }
	      MemberDto resultDto = service.login(memberid,memberpw);
	      if(resultDto == null) {
	         error.reject("nocode", "로그인 실패: 아이디나 비밀번호가 틀립니다");   
	         return "member/loginform";
	      }else {
	         m.addAttribute("user", resultDto);
	      }
	      return "index";
	      //return "member/loginComplete";
	   }
	   
	   //아이디 찾기 페이지
	   @GetMapping("/findidform")
	   public String findIdForm() {
	      return "member/findidform";
	   }
	   
	   //아이디 찾기
	   @PostMapping("/findid")
	   public String findId(MemberDto dto, Model model) {
	      MemberDto user = service.findId(dto);
	      
	      if(user == null) {
	         model.addAttribute("check", 1);
	      }else {
	         model.addAttribute("check", 0);
	         model.addAttribute("memberid", user.getMemberid());
	      }
	      return "member/findidform";
	   }
	   
	   //비밀번호 찾기 페이지
	   @GetMapping("/findpwform")
	   public String findPw() {
	      return "member/findpwform";
	   }
	   
	   //비밀번호 찾기
	   @PostMapping("/findpw")
	   public String findPw(MemberDto dto, Model model) {
	      MemberDto user = service.findPw(dto);
	      
	      if(user == null) {
	         model.addAttribute("check", 1);
	      }else {
	         model.addAttribute("check", 0);
	         model.addAttribute("updateid", user.getMemberid());
	      }
	      return "member/findpwform";
	   }
	   //비밀번호 변경 성공시 성공페이지로 이동
	   @PostMapping("/updatepw")
	   public String updatePw(@RequestParam(value="updateid", defaultValue="", required=false) String id, MemberDto dto) {
	      dto.setMemberid(id);
	      
	      service.updatePw(dto);
	      return "member/updatepw";
	   }
	   
	   //로그아웃
	   @GetMapping("/logout")
	   public String logout(SessionStatus status) {
	      status.setComplete();
	      return "redirect:/";
	   }
	   
	   //마이페이지
	   @GetMapping("/mypage")
	   public String myPage(@ModelAttribute("user") MemberDto dto, Model m,HttpSession session, @RequestParam(name="p",defaultValue ="1") int page1,@RequestParam(name="p2",defaultValue ="1") int page2,@RequestParam(name="p3",defaultValue ="1") int page3,@RequestParam(name="p4",defaultValue ="1") int page4,@RequestParam(name="p5",defaultValue ="1") int page5 ,@RequestParam(name="p6",defaultValue ="1") int page6,@RequestParam(name="p7",defaultValue ="1") int page7 ,@RequestParam(name="p8",defaultValue ="1") int page8) {
	      String id = dto.getMemberid();
	      
	      int count = service.roomCount(id);
	      if(count > 0) {
	         int perPage = 5; //한 페이지에 보일 글의 갯수
	         int startRow = (page1-1) * perPage +1;
	         int endRow = page1 * perPage;
	   
	         List<RoomDto> roomList = service.myRoomList(id,startRow, endRow);
	         
	         m.addAttribute("rList",roomList);
	      
	         int pageNum = 5; //한번에 보일 페이지 수
	         int totalPages = count/perPage + (count%perPage > 0 ? 1:0); //전체 페이지 수
	         
	         int begin = (page1 -1) / pageNum * pageNum +1;
	         int end = begin + pageNum -1;
	         if(end > totalPages) {
	            end = totalPages;
	         }
	         m.addAttribute("begin1", begin);
	         m.addAttribute("end1", end);   
	         m.addAttribute("pageNum1", pageNum);
	         m.addAttribute("totalPages1", totalPages);
	      }
	      
	      m.addAttribute("count", count);
	      
	      int count1 = service.boardCount(id);
	      if(count1 > 0) {
	      
	      int perPage = 5; // 占쎈립 占쎈읂占쎌뵠筌욑옙占쎈퓠 癰귣똻 뵬 疫뀐옙占쎌벥 揶쏉옙占쎈땾
	      int startRow = (page2 - 1) * perPage + 1;
	      int endRow = page2 * perPage;
	      
	      List<BoardDto> boardList = service.myBoardList(id,startRow, endRow);
	      m.addAttribute("bList", boardList);

	      int pageNum = 5;
	      int totalPages = count1 / perPage + (count1 % perPage > 0 ? 1 : 0); //占쎌읈筌ｏ옙 占쎈읂占쎌뵠筌욑옙 占쎈땾
	      
	      int begin = (page2 - 1) / pageNum * pageNum + 1;
	      int end = begin + pageNum -1;
	      if(end > totalPages) {
	         end = totalPages;
	      }
	       m.addAttribute("begin2", begin);
	       m.addAttribute("end2", end);
	       m.addAttribute("pageNum2", pageNum);
	       m.addAttribute("totalPages2", totalPages);
	      
	      }
	      m.addAttribute("count1", count1);
	      
	      int count2 = service.fsCount(id);
	      if(count2 > 0) {
	      
	      int perPage = 5; // 占쎈립 占쎈읂占쎌뵠筌욑옙占쎈퓠 癰귣똻 뵬 疫뀐옙占쎌벥 揶쏉옙占쎈땾
	      int startRow = (page3 - 1) * perPage + 1;
	      int endRow = page3 * perPage;
	      
	      List<FoodboardDto> boardList1 = service.myFsboardList(id,startRow, endRow);
	      m.addAttribute("fList", boardList1);

	      int pageNum = 5;
	      int totalPages = count2 / perPage + (count2 % perPage > 0 ? 1 : 0); //占쎌읈筌ｏ옙 占쎈읂占쎌뵠筌욑옙 占쎈땾
	      
	      int begin = (page3 - 1) / pageNum * pageNum + 1;
	      int end = begin + pageNum -1;
	      if(end > totalPages) {
	         end = totalPages;
	      }
	       m.addAttribute("begin3", begin);
	       m.addAttribute("end3", end);
	       m.addAttribute("pageNum3", pageNum);
	       m.addAttribute("totalPages3", totalPages);
	      
	      }
	      m.addAttribute("count2", count2);
	      
	      int count3 = service.petCount(id);
	      if (count3 > 0) { // 寃뚯떆臾쇱씠  엳 떎硫 

	         int perPage = 5; //  븳  럹 씠吏  뿉 蹂댁씪 湲  쓽 媛  닔
	         int startRow = (page4 - 1) * perPage + 1; //  떆 옉以 .
	         int endRow = page4 * perPage; //  걹 以 .

	         List<PetcareDto> P_list = service.myPetList(id,startRow, endRow);//  떆 옉遺  꽣  걹源뚯  쓽 list.
	         m.addAttribute("P_list", P_list);

	         int pageNum = 5;
	         int totalPages = count3 / perPage + (count3 % perPage > 0 ? 1 : 0); //  쟾泥   럹 씠吏   닔

	         int begin = (page4 - 1) / pageNum * pageNum + 1;
	         int end = begin + pageNum - 1;
	         if (end > totalPages) {
	            end = totalPages;
	         }
	         m.addAttribute("begin4", begin);
	         m.addAttribute("end4", end);
	         m.addAttribute("pageNum4", pageNum);
	         m.addAttribute("totalPages4", totalPages);

	      }
	      m.addAttribute("count3", count3);
	      
	      int commcount = service.roomCommCount(id);
	      if(commcount > 0) {
	         int perPage = 5; //한 페이지에 보일 글의 갯수
	         int startRow = (page5-1) * perPage +1;
	         int endRow = page5 * perPage;
	   
	         List<RoomCommentDto> roomComm = service.myRoomComm(id,startRow, endRow);
	         
	         m.addAttribute("rc",roomComm);
	      
	         int pageNum = 5; //한번에 보일 페이지 수
	         int totalPages = commcount/perPage + (commcount%perPage > 0 ? 1:0); //전체 페이지 수
	         
	         int begin = (page5 -1) / pageNum * pageNum +1;
	         int end = begin + pageNum -1;
	         if(end > totalPages) {
	            end = totalPages;
	         }
	         m.addAttribute("begin5", begin);
	         m.addAttribute("end5", end);   
	         m.addAttribute("pageNum5", pageNum);
	         m.addAttribute("totalPages5", totalPages);
	      }
	      
	      m.addAttribute("commcount", commcount);
	      
	      int commcount1 = service.boardCommCount(id);
	      if(commcount1 > 0) {
	         int perPage = 5; //한 페이지에 보일 글의 갯수
	         int startRow = (page6-1) * perPage +1;
	         int endRow = page6 * perPage;
	   
	         List<CommDto> boardcomm = service.myBoardComm(id,startRow, endRow);
	         
	         m.addAttribute("bc",boardcomm);
	      
	         int pageNum = 5; //한번에 보일 페이지 수
	         int totalPages = commcount1/perPage + (commcount1%perPage > 0 ? 1:0); //전체 페이지 수
	         
	         int begin = (page6 -1) / pageNum * pageNum +1;
	         int end = begin + pageNum -1;
	         if(end > totalPages) {
	            end = totalPages;
	         }
	         m.addAttribute("begin6", begin);
	         m.addAttribute("end6", end);   
	         m.addAttribute("pageNum6", pageNum);
	         m.addAttribute("totalPages6", totalPages);
	      }
	      
	      m.addAttribute("commcount1", commcount1);
	      
	      int commcount2 = service.fsCommCount(id);
	      if(commcount2 > 0) {
	         int perPage = 5; //한 페이지에 보일 글의 갯수
	         int startRow = (page7-1) * perPage +1;
	         int endRow = page7 * perPage;
	   
	         List<FscommDto> fscomm = service.myFsComm(id,startRow, endRow);
	         
	         m.addAttribute("fc",fscomm);
	      
	         int pageNum = 5; //한번에 보일 페이지 수
	         int totalPages = commcount2/perPage + (commcount2%perPage > 0 ? 1:0); //전체 페이지 수
	         
	         int begin = (page7 -1) / pageNum * pageNum +1;
	         int end = begin + pageNum -1;
	         if(end > totalPages) {
	            end = totalPages;
	         }
	         m.addAttribute("begin7", begin);
	         m.addAttribute("end7", end);   
	         m.addAttribute("pageNum7", pageNum);
	         m.addAttribute("totalPages7", totalPages);
	      }
	      
	      m.addAttribute("commcount2", commcount2);
	      
	      int commcount3 = service.petCommCount(id);
	      if(commcount3 > 0) {
	         int perPage = 5; //한 페이지에 보일 글의 갯수
	         int startRow = (page8-1) * perPage +1;
	         int endRow = page8 * perPage;
	   
	         List<PetcommentDto> petcomm = service.myPetComm(id,startRow, endRow);
	         
	         m.addAttribute("pc",petcomm);
	      
	         int pageNum = 5; //한번에 보일 페이지 수
	         int totalPages = commcount3/perPage + (commcount3%perPage > 0 ? 1:0); //전체 페이지 수
	         
	         int begin = (page8 -1) / pageNum * pageNum +1;
	         int end = begin + pageNum -1;
	         if(end > totalPages) {
	            end = totalPages;
	         }
	         m.addAttribute("begin8", begin);
	         m.addAttribute("end8", end);   
	         m.addAttribute("pageNum8", pageNum);
	         m.addAttribute("totalPages8", totalPages);
	      }
	      
	      m.addAttribute("commcount3", commcount3);
	      
	      
	      /*
	      ArrayList<MypageDto> list = service.getBoardList(id);
	      if(list != null) {
	         m.addAttribute("check", 0);
	         m.addAttribute("list", list);
	      }else{
	         m.addAttribute("check", 1);
	      }
	      
	      ArrayList<MypageCommDto> clist = service.getCommList(id);
	      if(clist != null) {
	         m.addAttribute("check", 0);
	         m.addAttribute("comm", clist);
	      }else {
	         m.addAttribute("check", 1);
	      }*/
	      
	      m.addAttribute("user", dto);
	      return "member/mypage";
	   }
	   
	   /*@getMapping("/list/{no}")
	   public String roomdetail(@PathVariable int roomno,Model m,@ModelAttribute("user") MemberDto user, @PathVariable int no, @PathVariable int fsno) {
	      int a = rservice.countingRoom(roomno);
	      RoomDto dto = rservice.roomdetail(roomno);
	      if(dto.getRoomno() == roomno) {
	         List<RoomFileDto> images = rservice.roomdata(roomno);
	         List<RoomCommentDto> comment = rservice.rcommlist(roomno);
	         List<RoomCommentDto> recomment = rservice.recommlist(roomno);
	         m.addAttribute("room",dto);
	         m.addAttribute("images",images);
	         m.addAttribute("comments",comment);
	         m.addAttribute("recomments",recomment);
	         return "room/detail";
	      }
	      BoardDto bdto = cservice.boardOne(no);
	      if(bdto.getNo() == no) {
	         m.addAttribute("dto", bdto);
	         List<CommDto> cList = c_service.selectComm(no);
	         m.addAttribute("cList", cList);
	         return "board/content";
	      }
	      FsboardDto fdto = fservice.boardOne(fsno);
	      if(bdto.getNo() == fsno) {
	         m.addAttribute("dto", fdto);
	         List<CommDto> cList = f_service.selectComm(fsno);
	         m.addAttribute("cList", cList);
	         return "fsboard/content";
	      }
	      return "mypage";
	   }*/
	   
	   
	   
	   //회원정보변경 페이지
	   @GetMapping("/updateform")
	   public String updateForm(@ModelAttribute("user") MemberDto dto) {
	      return "member/updateform";
	   }
	   
	   //회원정보수정
	   @PostMapping("/update")
	   public String update(@ModelAttribute("user") MemberDto dto) {
	      service.updateMember(dto);
	      return "member/mypage";
	   }
	   
	   //회원탈퇴 성공
	   @GetMapping("/deletecomplate")
	   public String deleteComplate() {
	      return "member/deletecomplate";
	   }
	   
	   //회원 탈퇴 페이지
	   @GetMapping("deleteform")
	   public String deleteForm(@ModelAttribute("user") MemberDto dto) {
	      return "member/deleteform";
	   }
	   
	   //회원탈퇴
	   @PostMapping("/deletemember")
	   public String deleteMember(String memberpw, @ModelAttribute("user") @Valid MemberDto dto, BindingResult error, SessionStatus status) {
	      int i = service.deleteMember(memberpw, dto);
	      if(i == 0) {
	         error.reject("nocode","비밀번호가 틀립니다.");
	         return "member/deleteform";
	      }else {
	         status.setComplete();
	      return "member/deletecomplate";
	      }
	   }
	   
	   
	   


	}
