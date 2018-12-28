package song;

public class SongTest {

	public static void main(String[] args) {
		
		Song song = new Song();
		
		song.setArtist("아이유");
		song.setTitle("좋은날");
		song.setAlbum("Real");
		song.setYear(2010);
		song.setTrack(3);
		song.setComposer("이민수");
		
		song.show();
		
		Song song2 = new Song("Ben","180도","180도",null,2018,1);
		song2.show();
		
		Song song3 = new Song("Ben","열애중");
		song3.show();
	}

}
