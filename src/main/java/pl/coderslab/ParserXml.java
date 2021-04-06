package pl.coderslab;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

@Slf4j
public class ParserXml {

    public static void main(String[] args) throws IOException {

        XmlMapper xmlMapper = new XmlMapper();
        Artist[] artists =
                xmlMapper.readValue(new File("src/main/resources/artists.xml"), Artist[].class);
        Arrays.stream(artists).forEach(a -> log.info("artist {}", a));

        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("src/main/resources/artists.json");
        objectMapper.writeValue(file, artists);
    }
}
