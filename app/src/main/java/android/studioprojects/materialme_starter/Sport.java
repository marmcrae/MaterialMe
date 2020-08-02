package android.studioprojects.materialme_starter;

class Sport {

    private String title;
    private String info;
    public final int imageResource;


    public Sport(String title, String info, int imageResource) {
        this.title = title;
        this.info = info;
        this.imageResource = imageResource;
    }

    public int getImageResource(){
        return imageResource;
    }

    String getTitle() {
        return title;
    }


    String getInfo() {
        return info;
    }
}