package adapterDesignPattern_Headset.android.example;

import adapterDesignPattern_Headset.ios.example.IphoneHeadset;

public class HeadsetAdapter implements AndroidHeadset{
    IphoneHeadset iphoneHeadset = new IphoneHeadset();
    @Override
    public void giveSound(String str){
        this.iphoneHeadset.giveQualitySound(str);
    }
}
