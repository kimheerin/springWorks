package com.khit.members.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.khit.members.dto.MemberDTO;
import com.khit.members.service.MemberService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Slf4j
@RequestMapping("/member")
@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/join")
	public String join() {
		return "/member/join";
	}
	
	@PostMapping("/join")
	public String join(@ModelAttribute MemberDTO memberDTO) {
		log.info("memberDTO= " + memberDTO);
		memberService.insert(memberDTO);
		return "/member/login";
	}
	
	@GetMapping("/login")
	public String loginForm() {
		return "/member/login";
		
	}
	
	@PostMapping("/login")
	public String login(@ModelAttribute MemberDTO memberDTO, HttpSession session) {
	    MemberDTO loginMember = memberService.login(memberDTO);

	    if (loginMember != null) {
	        session.setAttribute("sessionEmail", memberDTO.getEmail());
	        return "main";
	    } else {
	        return "/member/login";
	    }
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();	//��� ���� ����
		return "redirect:/";
	}

	//ȸ�� ���
	@GetMapping("/")
	public String getMemberList(Model model) {
		List<MemberDTO> memberDTOList = memberService.findAll();
		model.addAttribute("memberList", memberDTOList);
		return "/member/list";
	}
	
	//ȸ�� ��
	@GetMapping
	public String getMember(@RequestParam("id") Long id,
			Model model) {
		MemberDTO memberDTO = memberService.findById(id);
		model.addAttribute("member", memberDTO);
		return "/member/detail";
	}
	
	//ȸ�� ����
	@GetMapping("/delete")
	public String delete(@RequestParam("id") Long id) {
		memberService.delete(id);
		return "redirect:/member/";
	}
	
	//ȸ�� ���� ������
	@GetMapping("/update")
	public String updateForm(HttpSession session,
			Model model) {
		//������ �����ͼ�
		//ȸ���� �̸���(session)�� �˻�
		String email = (String)session.getAttribute("sessionEmail");
		MemberDTO memberDTO = memberService.findByEmail(email);
		model.addAttribute("member", memberDTO);
		return "/member/update";
	}
	
	//���� ó��
	@PostMapping("/update")
	public String update(@ModelAttribute MemberDTO memberDTO) {
		memberService.update(memberDTO);
		return "redirect:/member/update?id=" + memberDTO.getId();
	}
	
	//�̸��� �ߺ� �˻�
	@PostMapping("/checkEmail")
	public @ResponseBody String checkEmail(
			@RequestParam("email") String email) {
		String resultText = memberService.checkEmail(email);
		return resultText;
	}
	
}