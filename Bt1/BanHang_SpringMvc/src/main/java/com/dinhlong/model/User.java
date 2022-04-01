package com.dinhlong.model;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class User {
	/* @NotEmpty */
	private String name;
	/* @Length(min = 6,max = 12) */
	private String password;
	/* @Min(0) */
	private int id;
	private List<String> favorites;
	private String gender;
	private String about;
	private boolean acceptAgreement;// bạn có đồng ý điều khoản này không
	private MultipartFile avatar;
	private String phoneNumber;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(int id, String name, String password, List<String> favorites, String gender, String about,
			boolean acceptAgreement) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.favorites = favorites;
		this.gender = gender;
		this.about = about;
		this.acceptAgreement = acceptAgreement;
	}

	public User(String name, String password, int id, List<String> favorites, String gender, String about,
			boolean acceptAgreement, MultipartFile avatar, String phoneNumber) {
		super();
		this.name = name;
		this.password = password;
		this.id = id;
		this.favorites = favorites;
		this.gender = gender;
		this.about = about;
		this.acceptAgreement = acceptAgreement;
		this.avatar = avatar;
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public MultipartFile getAvatar() {
		return avatar;
	}

	public void setAvatar(MultipartFile avatar) {
		this.avatar = avatar;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<String> getFavorites() {
		return favorites;
	}

	public void setFavorites(List<String> favorites) {
		this.favorites = favorites;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public boolean isAcceptAgreement() {
		return acceptAgreement;
	}

	public void setAcceptAgreement(boolean acceptAgreement) {
		this.acceptAgreement = acceptAgreement;
	}

}
