import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		String filename = "/home/js/Dropbox/Music/Capcom Sound Team - Wily Stage 1 [Mega Man Universe]-uKNI04z7uks.wav"; //for testing
		// java only supports AU, AIFF, and WAV formats
		File file = new File(filename);
		try {
			AudioInputStream stream = AudioSystem.getAudioInputStream(file);
			int frameLength = (int) stream.getFrameLength();
			int frameSize = (int) stream.getFormat().getFrameSize();
			byte[] bytes = new byte[frameLength * frameSize];
			int result = stream.read(bytes);
			System.out.print(result);
			
		} catch (UnsupportedAudioFileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
