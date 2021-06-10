package bean;

import org.springframework.web.multipart.MultipartFile;

public class Album {
	
	private int id;
	private String albumname;
	private String song;
	private String lyricist; // 작사
	private String songwriter; // 작곡
	private String transcription; // 편곡
	private String writerdate; // 날짜
	private String image ;
	private String genre ; // 장르(콤보 박스)
	private String mediatype ; // 미디어 유형(체크 박스)
	private String emailagree ; // 이메일 수신 여부(라디오 버튼)
	private MultipartFile abcd ;	
	
	public Album() {
		// TODO Auto-generated constructor stub
	}
	
	public Album(int id, String albumname, String song, String lyricist, String songwriter, String transcription,
			String writerdate, String image, String genre, String mediatype, String emailagree, MultipartFile abcd) {
		super();
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
		this.abcd = abcd;
	}



	@Override
	public String toString() {
		return "Album [id=" + id + ", albumname=" + albumname + ", song=" + song + ", lyricist=" + lyricist
				+ ", songwriter=" + songwriter + ", transcription=" + transcription + ", writerdate=" + writerdate
				+ ", image=" + image + ", genre=" + genre + ", mediatype=" + mediatype + ", emailagree=" + emailagree
				+ "]";
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

	public MultipartFile getAbcd() {
		return abcd;
	}

	public void setAbcd(MultipartFile abcd) {
		this.abcd = abcd;
	}
	
	

}
