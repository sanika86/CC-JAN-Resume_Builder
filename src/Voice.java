//package my_final_lms;
import com.sun.speech.freetts.*;
/**
 *
 * @author prince dalsaniya
 */
public class Voice {
    private String name = "kevin16"; 
    private final com.sun.speech.freetts.Voice voice;
    
    public Voice(){
        voice = VoiceManager.getInstance().getVoice(name);
        this.voice.allocate();
    }
    
    public void say(String something){
        this.voice.speak(something);
    }
}
