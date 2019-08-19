package chapter02;

public class Song {
	
	private String title;
    private String artist;
    private String album;
    private String composer;
    private int year;
    private int track;
    
    //객체를 생성할때 다양한 방법으로 생성하겠다. = 다형성!!!
    
    
    //기본생성자
    //오버로딩 = 다형성 - 객체를 다양한 방식으로 사용하겠다.
    //다형성을 구현하기 위해서 시그니처를 다르게 한다.
    //인자를 다르게 하는 것이다.
    //하나의 클래스
    //생성자, 메소드,
    //다른 시그니처
    
    public Song() {
    	
    }
    
    //상속과 다형성 = 오버라이딩
    
    
    //개발자가 의도한 생성자!!!
    //기본생성자로 생성하지 않겠다는 뜻!!!
	public Song(String title, String album, String artist, String composer, int year, int track) {
		// TODO Auto-generated constructor stub
		this.title = title;
		this.album = album;
		this.artist = artist;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	
	public Song(String title, String artist) {
		//this.title = title;		//없으면 null
		//this.artist = artist;	//없으면 null
		
		//some code1
		//some code2
		//some code3
		
		//재사용
		//*******중요********
		this(title, null, artist, null, 0, 0);
		//******************
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	
	public void show() {
		System.out.println(title +
				" (" +artist +" "+ album +" "+ composer + " "+ year 
				+ " " + track+ ")");
	}
    
    
	

}
