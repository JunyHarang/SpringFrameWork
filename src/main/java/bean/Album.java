package bean;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

public class Album {
	
	private final String mustInput = "필수 입력 사항 입니다!";
	
	private int id;
	
	@Length(min=5, max=12, message = "앨범 이름은 최소 5자리 이상 최대 12자리 이하로 설정해야 합니다!" )
 	private String albumname;
	
	@NotEmpty(message = "노래 제목은 " + mustInput)
	private String song;
	
	@Length(min=3, max=12, message = "작사 이름은 최소 3자리 이상 최대 12자리 이하로 설정해야 합니다!" )
	private String lyricist; // 작사
	
	@Length(min=3, max=12, message = "작곡가 이름은 최소 3자리 이상 최대 12자리 이하로 설정해야 합니다!" )
	@NotEmpty(message = "작곡가 이름은 " + mustInput)
	private String songwriter; // 작곡
	private String transcription; // 편곡
	
	@Pattern(regexp = "\\d{4}[-/]\\d{2}[-/]\\d{2}", message = "날짜는 yyyy/mm/dd 또는 yyyy-mm-dd 형식으로 입력 해야 합니다!")
	private String writerdate; // 날짜
	
	//파일 업로드 관련 내용
	private String image;		// 그림 저장할 문자열 변수
	private MultipartFile uploadFile;
	
	//@Range(min = 1, message = "장르를 선택 해 주세요!)
	@Pattern(regexp = "[^~]*", message = "장르를 선택 해 주세요!")
	private String genre; // 장르(콤보 박스)
	
	@NotNull(message = "미디어 유형을 선택 해 주세요!")
	private String mediatype; // 미디어 유형(체크 박스)
	
	@NotNull(message = "이메일 수신 여부를 선택 해 주세요!")
	private String emailagree; // 이메일 수신 여부(라디오 버튼)

	
	public Album() {
		// TODO Auto-generated constructor stub
	}
	
	public Album(int id, String albumname, String song, String lyricist, String songwriter, String transcription, String writerdate, String image, String genre, String mediatype, String emailagree, MultipartFile abcd) {
		this.id = id;
		this.albumname = albumname;
		this.song = song;
		this.lyricist = lyricist;
		this.songwriter = songwriter;
		this.transcription = transcription;
		this.writerdate = writerdate;
		this.image = image;
		this.genre = genre;
		this.mediatype = mediatype;
		this.emailagree = emailagree;
		this.uploadFile = uploadFile;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAlbumname() {
		return albumname;
	}

	public void setAlbumname(String albumname) {
		this.albumname = albumname;
	}

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	public String getLyricist() {
		return lyricist;
	}

	public void setLyricist(String lyricist) {
		this.lyricist = lyricist;
	}

	public String getSongwriter() {
		return songwriter;
	}

	public void setSongwriter(String songwriter) {
		this.songwriter = songwriter;
	}

	public String getTranscription() {
		return transcription;
	}

	public void setTranscription(String transcription) {
		this.transcription = transcription;
	}

	public String getWriterdate() {
		return writerdate;
	}

	public void setWriterdate(String writerdate) {
		this.writerdate = writerdate;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getMediatype() {
		return mediatype;
	}

	public void setMediatype(String mediatype) {
		this.mediatype = mediatype;
	}

	public String getEmailagree() {
		return emailagree;
	}

	public void setEmailagree(String emailagree) {
		this.emailagree = emailagree;
	}

	public MultipartFile getUploadFile() {
		return uploadFile;
	}

	public void setuploadFile(MultipartFile uploadFile) {
		this.uploadFile = uploadFile;
		
		if (this.uploadFile != null) { // 교안 385쪽 참고
			this.image = this.uploadFile.getOriginalFilename();
		}
	}
	
	@Override
	public String toString() {
		return "Album [id=" + id + ", albumname=" + albumname + ", song=" + song + ", lyricist=" + lyricist
				+ ", songwriter=" + songwriter + ", transcription=" + transcription + ", writerdate=" + writerdate
				+ ", image=" + image + ", genre=" + genre + ", mediatype=" + mediatype + ", emailagree=" + emailagree
				+ "]";
	}
}
