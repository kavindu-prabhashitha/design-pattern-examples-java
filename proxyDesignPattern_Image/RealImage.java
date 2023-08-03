package proxyDesignPattern_Image;

public class RealImage implements Image{
    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromURL(fileName);
    }


    @Override
    public void display() {
        System.out.println("Displaying ");
    }

    private void  loadFromURL(String fileName){
        System.out.println("Load from external server "+fileName);
    }
}
