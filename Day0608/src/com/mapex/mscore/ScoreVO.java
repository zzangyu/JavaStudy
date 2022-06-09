package com.mapex.mscore;

public class ScoreVO {
	private String name, hak;
	private int kor, eng, mat, tot;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHak() {
		return hak;
	}

	public void setHak(String hak) {
		this.hak = hak;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getTot() {
		tot = kor + eng + mat;
		return tot;
	}

	@Override
	public String toString() {
		String str = String.format("학번:%7s 이름:%3s \n국어점수:%3d점 영어점수:%3d점 수학점수:%3d점 \n총점:%3d점 평균:%5.1f점", hak, name, kor,
				eng, mat, getTot(), (float) getTot() / 3);
		return str;
	}

}
