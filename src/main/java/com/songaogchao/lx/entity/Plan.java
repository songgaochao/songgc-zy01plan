package com.songaogchao.lx.entity;


public class Plan {
	/**  **/
	private Integer pid;
	/**  **/
	private String pname;
	/**  **/
	private String amount;
	/**  **/
	private String manager;
	/**  **/
	private String content;
	/**  **/
	private Integer did;
	private String names;

	
	

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getDid() {
		return did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	@Override
	public String toString() {
		return "Plan [pid=" + pid + ", pname=" + pname + ", amount=" + amount + ", manager=" + manager + ", content="
				+ content + ", did=" + did + "]";
	}

}
