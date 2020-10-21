package ro.uvt;

public class ImageProxi implements Element {
    String imgname;
     Imagine realImage;

    @Override
    public void render() {
        if (realImage == null){
            realImage = new Imagine(imgname);
        }
        realImage.render();
    }
    public ImageProxi(String imgname){
        this.imgname = imgname;
        this.realImage = null;
    }
}
