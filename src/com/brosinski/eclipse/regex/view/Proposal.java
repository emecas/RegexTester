package com.brosinski.eclipse.regex.view;

public class Proposal {

	private String substitute;
	private String description;
	private int replaceCount;
	
	/**
	 * @param substitute
	 * @param description
	 */
	public Proposal(String substitute, String description, int replaceCount) {
		super();
		this.substitute = substitute;
		this.description = description;
		this.replaceCount = replaceCount;
	}



	/**
	 * @return Returns the replaceCount.
	 */
	public int getReplaceCount() {
		return replaceCount;
	}
	/**
	 * @param replaceCount The replaceCount to set.
	 */
	public void setReplaceCount(int replaceCount) {
		this.replaceCount = replaceCount;
	}
	/**
	 * @return Returns the description.
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description The description to set.
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return Returns the substitute.
	 */
	public String getSubstitute() {
		return substitute;
	}
	/**
	 * @param substitute The substitute to set.
	 */
	public void setSubstitute(String substitute) {
		this.substitute = substitute;
	}
}
