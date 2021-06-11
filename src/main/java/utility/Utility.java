package utility;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

public class Utility {
	// 업도드될 파일 정보를 반환하는 Method
	public static File GetUploadedFileInfo(MultipartFile multi, String realpath) {
		// multi : 멀티 파트 객체
		// realpath : 실제 이미지가 업로드 되는 위치
		
		// 사진 파일명이 저장될 때 [사진명] [년월일시초].png로 저장하기 위한 pattern 생성
		String pattern = "yyyyMMddhhmmss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		// 현재 시각을 구해주는 객체
		String now = sdf.format(new Date());
		
		String somefile = multi.getOriginalFilename();
		System.out.println("somefile 내용은 : " + somefile + " 입니다!");
		
		// 파일명에서 '.'을 찾기 위한 변수 선언
		int dot = somefile.indexOf(".");
		
		// 파일명을 넣을 변수 선언
		String filename = somefile.substring(0, dot);
		
		// 확장명을 넣을 변수 선언
		String fileext = somefile.substring(dot);
		
		// 파일명을 모두 합칠 변수 선언
		String newfile = filename + now + fileext;
		
		// File.separator는 OS 별 파일 위치 path에 대한 설정 관련한 내용이다. (유닉스 계열 = '/', 윈도우 = '\') 
		String myfile = realpath + File.separator + newfile;
		
		return new File(myfile);
	}
}
