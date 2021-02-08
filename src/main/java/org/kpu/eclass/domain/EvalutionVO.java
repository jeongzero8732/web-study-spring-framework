package org.kpu.eclass.domain;

import javax.xml.bind.annotation.XmlRootElement;

import com.sun.istack.internal.NotNull;

@XmlRootElement
public class EvalutionVO {

	@NotNull
	private int evalutionID;
	@NotNull
	private String userID;
	@NotNull
	private String lectureName;
	@NotNull
	private String professorName;
	@NotNull
	private String lectureYear;
	
	private String semester;
	private String lecture_kinds;
	private String evalutionTitle;
	private String evalutionContent;
	private String totalScore;
	private String lecskill;
	private String leclevel;
	public int getEvalutionID() {
		return evalutionID;
	}
	public void setEvalutionID(int evalutionID) {
		this.evalutionID = evalutionID;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getLectureName() {
		return lectureName;
	}
	public void setLectureName(String lectureName) {
		this.lectureName = lectureName;
	}
	public String getProfessorName() {
		return professorName;
	}
	public void setProfessorName(String professorName) {
		this.professorName = professorName;
	}
	public String getLectureYear() {
		return lectureYear;
	}
	public void setLectureYear(String lectureYear) {
		this.lectureYear = lectureYear;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public String getLecture_kinds() {
		return lecture_kinds;
	}
	public void setLecture_kinds(String lecture_kinds) {
		this.lecture_kinds = lecture_kinds;
	}
	public String getEvalutionTitle() {
		return evalutionTitle;
	}
	public void setEvalutionTitle(String evalutionTitle) {
		this.evalutionTitle = evalutionTitle;
	}
	public String getEvalutionContent() {
		return evalutionContent;
	}
	public void setEvalutionContent(String evalutionContent) {
		this.evalutionContent = evalutionContent;
	}
	public String getTotalScore() {
		return totalScore;
	}
	public void setTotalScore(String totalScore) {
		this.totalScore = totalScore;
	}
	public String getLecskill() {
		return lecskill;
	}
	public void setLecskill(String lecskill) {
		this.lecskill = lecskill;
	}
	public String getLeclevel() {
		return leclevel;
	}
	public void setLeclevel(String leclevel) {
		this.leclevel = leclevel;
	}
	
	@Override
	public String toString() {
		return "EvalutionVO [evalutionID=" + evalutionID + ", userID=" + userID + ", lectureName=" + lectureName
				+ ", professorName=" + professorName + ", lectureYear=" + lectureYear + ", semester=" + semester
				+ ", lecture_kinds=" + lecture_kinds + ", evalutionTitle=" + evalutionTitle + ", evalutionContent="
				+ evalutionContent + ", totalScore=" + totalScore + ", lecskill=" + lecskill + ", leclevel=" + leclevel
				+ "]";
	}
	
	

}
