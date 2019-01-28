package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author：罗金星 date 2019/1/25 11:52
 **/
public interface AbstractFile {
    void killVirus();
}

/**
 * 叶子组件
 */
class ImageFile implements AbstractFile{
    private  String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("---图像文件："+name+",进行查杀");
    }
}

class TxtFile implements AbstractFile{
    private  String name;

    public TxtFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("---文本文件："+name+",进行查杀");
    }
}

class VideoFile implements AbstractFile{
    private  String name;
    public VideoFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("---视频文件："+name+",进行查杀");
    }
}

/**
 * 容器组件
 */
class Folder implements AbstractFile{
    private  String name;

    public Folder(String name) {
        this.name = name;
    }
    //存放本容器下的子节点
    private List<AbstractFile> files=new ArrayList<>();

    public void add(AbstractFile file){
        files.add(file);
    }
    public void remove(AbstractFile file){
        files.remove(file);
    }
    public AbstractFile getChild(int index){
        return files.get(index);
    }
    @Override
    public void killVirus() {
     System.out.println("文件夹："+name+",进行查杀");
     files.forEach((file)->{
         file.killVirus();
     });
    }
}