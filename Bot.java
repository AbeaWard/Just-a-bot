import events.HelloEvent;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;

public class Bot {

    public static void main(String args[]) throws Exception{
       JDA jda = new JDABuilder("NTQxNjU5MjcxNjE2NTI4Mzg0.DzirDg.cryv2A5JmDA-aDWxiosAri0D7Gk").build();

        jda.addEventListener(new HelloEvent());
    }
}
