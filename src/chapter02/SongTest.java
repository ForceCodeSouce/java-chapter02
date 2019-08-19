package chapter02;

public class SongTest {
	
	public static void main(String[] args) {
		Song song = new Song();
		
		song.setTitle("좋은날");
		song.setArtist("아이유");
		song.setAlbum("real");
		song.setComposer("태영");
		song.setYear(5);
		song.setTrack(2);
		
		song.show();
		Song song2 = new Song("술이 문제야"," ","장혜진,윤민수","류재현",2019, 1);
		Song song3 = new Song("사랑에 연습이 있었다면", "임재현");
		song3.show();
	}

}
