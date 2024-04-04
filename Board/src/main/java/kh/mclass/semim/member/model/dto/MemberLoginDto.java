package kh.mclass.semim.member.model.dto;

public class MemberLoginDto {
//	이름        널?       유형            
//	--------- -------- ------------- 
//	MEM_ID    NOT NULL VARCHAR2(20)  
//	MEM_PWD   NOT NULL VARCHAR2(20)  
//	MEM_EMAIL NOT NULL VARCHAR2(100)
	
	private String memId;
	private String memPwd;
	private String memEmail;
	
	@Override
	public String toString() {
		return "MemberDto [memId=" + memId + ", memPwd=" + memPwd + "]";
	}
	
	public MemberLoginDto() {
		super();
	}

	public MemberLoginDto(String memId, String memPwd) {
		super();
		this.memId = memId;
		this.memPwd = memPwd;
	}

	public String getMemPwd() {
		return memPwd;
	}


	
	
	
}
