package java006_class.part09;

public class Song {
	String title;
	String artist;
	String album;
	String[] composer;
	int year;
	int track;

	public Song() {

	}

	public Song(String title, String artist, String album, String[] composer, int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}

	public void show() {
		// System.out.println("노래제목: " + title);
		System.out.printf("노래제목: %s\n", title);

		// System.out.println("가수: " + artist);
		System.out.printf("가수: %s\n", artist);

		// System.out.println("앨범: " + album);
		System.out.printf("앨범: %s\n", album);

		// System.out.println("작곡가: " + composer[0] + ", " + composer[1]);
		System.out.printf("작곡가: ");
		for (int i = 0; i < composer.length; i++) {
			char chk = i < composer.length - 1 ? ',' : '\n';
			System.out.printf("%s%c", composer[i], chk);
		}

		// System.out.println("년도: " + year);
		System.out.printf("년도: %d\n", year);

		// System.out.println("트랙: " + track);
		System.out.printf("트랙: %d\n", track);
	}

}
