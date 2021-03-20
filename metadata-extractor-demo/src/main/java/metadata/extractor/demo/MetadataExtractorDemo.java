package metadata.extractor.demo;

import com.drew.imaging.mp3.Mp3MetadataReader;
import lombok.SneakyThrows;

import java.io.File;

public class MetadataExtractorDemo {

    public static void main(String[] args) {
        var file = new File(MetadataExtractorDemo.class.getClassLoader().getResource("KDA-MORE2.mp3").getFile());
        printMetadata(file);
    }

    @SneakyThrows
    private static void printMetadata(File file) {
        var metadata = Mp3MetadataReader.readMetadata(file);
        for (var directory : metadata.getDirectories()) {
            for (var tag : directory.getTags()) {
                System.out.println(tag.getDescription());
            }
        }
    }
}
