package tool.utils.manager;

import java.io.File;
import java.io.FileNotFoundException;

public class FileImp implements FileItf {
    @Override
    public String getFileHash(String path) {
        try {

            return FileUtils.md5HashCode(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;

    }
}
