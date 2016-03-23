package foo.bar.config;

import foo.bar.etc.Song;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Albert on 14.03.2016.
 */
@Configuration
public class Config {

    @Bean
    public Song kukuhka(){
    Song song= new Song();
    song.setSongsName("Кукушка");
    song.setSongsText("Песен ещё ненаписанных\n" +
            "                    Сколько, cкажи, кукушка, пропой.");
    return song;
}

    @Bean
    public Song pachka(){
        Song song= new Song();
        song.setSongsName("Пачка Сигарет");
        song.setSongsText(" Если есть в кормане пачка...");
        return song;
    }

    @Bean
    public Song musorniyVeter(){
        Song song= new Song();
        song.setSongsName("Мусорный Ветер");
        song.setSongsText("Мусорный ветер, дым из трубы, плач природы, смех сатаны");
        return song;
    }

    @Bean
    public Song tanya(){
        Song song= new Song();
        song.setSongsName("Таня");
        song.setSongsText("Жаль, что она умерла, жаль, что она умерла\n" +
                "                    Вокруг меня чужие люди, у них совсем другая игра\n" +
                "                    И мне жаль, что она умерла");
        return song;
    }


}
