package lxl.test.core.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.File;

public class FileSystemResource implements Resource {

    private final String path;
    private final File file;

    public FileSystemResource(String path) {
        this.file = new File(path);
        this.path = path;
    }



    @Override
    public InputStream getInputStream() throws IOException {
        InputStream is = new FileInputStream(file);
        return is;
    }

    @Override
    public String getDescription() {
        return path;
    }
}
