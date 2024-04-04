package kh.mclass.semim.member.model.dto;

public class MemberUpdateDto {
//	이름        널?       유형            
//	--------- -------- ------------- 
//	MEM_ID    NOT NULL VARCHAR2(20)  
//	MEM_PWD   NOT NULL VARCHAR2(20)  
//	MEM_EMAIL NOT NULL VARCHAR2(100)
	
	private String memId;
	private String memPwd;
	private String memNewPwd;
	private String memEmail;
	@Override
	public String toString() {
		return "MemberUpdateDto [memId=" + memId + ", memPwd=" + memPwd + ", memNewPwd=" + memNewPwd + ", memEmail="
				+ memEmail + "]";
	}
	public MemberUpdateDto(String memId, String memPwd, String memNewPwd, String memEmail) {
		super();
		this.memId = memId;
		this.memPwd = memPwd;
		this.memNewPwd = memNewPwd;
		this.memEmail = memEmail;
	}
	public String getMemId() {
		return memId;
	}
	public String getMemPwd() {
		return memPwd;
	}
	public String getMemNewPwd() {
		return memNewPwd;
	}
	public String getMemEmail() {
		return memEmail;
	}
	
	
	
	
}
