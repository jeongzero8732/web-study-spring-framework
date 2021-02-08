package org.kpu.eclass.domain;

import javax.xml.bind.annotation.XmlRootElement;

import com.sun.istack.internal.NotNull;

@XmlRootElement
public class UserVO {
	
	@NotNull
	private String userID;
	@NotNull
	private String userPasswd;
	@NotNull
	private String userName;

	private String userSex;
	private String userBirth;
	private String userEmail;
	private String userHome;
	private int count;

	private String scoreFF;

	private String scoreFS;

	private String scoreSF;

	private String scoreSS;

	private String scoreTF;

	private String scoreTS;

	private String scoreFFF;

	private String scoreFFS;
	
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserPasswd() {
		return userPasswd;
	}
	public void setUserPasswd(String userPasswd) {
		this.userPasswd = userPasswd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserSex() {
		return userSex;
	}
	public void setUsersex(String userSex) {
		this.userSex = userSex;
	}
	public String getUserBirth() {
		return userBirth;
	}
	public void setUserBirth(String userBirth) {
		this.userBirth = userBirth;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserHome() {
		return userHome;
	}
	public void setUserHome(String userHome) {
		this.userHome = userHome;
	}
	public String getScoreFF() {
		return scoreFF;
	}
	public void setScoreFF(String scoreFF) {
		this.scoreFF = scoreFF;
	}
	public String getScoreFS() {
		return scoreFS;
	}
	public void setScoreFS(String scoreFS) {
		this.scoreFS = scoreFS;
	}
	public String getScoreSF() {
		return scoreSF;
	}
	public void setScoreSF(String scoreSF) {
		this.scoreSF = scoreSF;
	}
	public String getScoreSS() {
		return scoreSS;
	}
	public void setScoreSS(String scoreSS) {
		this.scoreSS = scoreSS;
	}
	public String getScoreTF() {
		return scoreTF;
	}
	public void setScoreTF(String scoreTF) {
		this.scoreTF = scoreTF;
	}
	public String getScoreTS() {
		return scoreTS;
	}
	public void setScoreTS(String scoreTS) {
		this.scoreTS = scoreTS;
	}
	public String getScoreFFF() {
		return scoreFFF;
	}
	public void setScoreFFF(String scoreFFF) {
		this.scoreFFF = scoreFFF;
	}
	public String getScoreFFS() {
		return scoreFFS;
	}
	public void setScoreFFS(String scoreFFS) {
		this.scoreFFS = scoreFFS;
	}
	
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "UserVO [userID=" + userID + ", userPasswd=" + userPasswd + ", userName=" + userName + ", userSex="
				+ userSex + ", userBirth=" + userBirth + ", userEmail=" + userEmail + ", userHome=" + userHome
				+ ", scoreFF=" + scoreFF + ", scoreFS=" + scoreFS + ", scoreSF=" + scoreSF + ", scoreSS=" + scoreSS
				+ ", scoreTF=" + scoreTF + ", scoreTS=" + scoreTS + ", scoreFFF=" + scoreFFF + ", scoreFFS=" + scoreFFS
				+ "]";
	}
	
	
}
