package com.bub.ooplab;

public class mobile {

  public static void main(String[] args) {
    System.out.println("-------");
    iPhoneX iPhoneX = new iPhoneX();
    iPhoneX.modelName = "iPhoneX";
    iPhoneX.subject = "Bas";
    iPhoneX.phoneCall();
    iPhoneX.faceID();
    iPhoneX.appStore();
    System.out.println("-------");
    iPhone8 iPhone8 = new iPhone8();
    iPhone8.modelName = "iPhone8";
    iPhone8.subject = "Bas";
    iPhone8.phoneCall();
    iPhone8.touchID();
    iPhone8.appStore();
    System.out.println("-------");
    andriod samsungGalaxyS8 = new andriod();
    samsungGalaxyS8.modelName = "Samsung Galaxy S8";
    samsungGalaxyS8.phoneCall();
    samsungGalaxyS8.UseGearVR();
    samsungGalaxyS8.TransformToPC();
    samsungGalaxyS8.GooglePlay();
    System.out.println("-------");
    samSungGalaxyNote8 samSungGalaxyNote8 = new samSungGalaxyNote8();
    samSungGalaxyNote8.modelName = "Samsung Galaxy S8";
    samSungGalaxyNote8.subject = "ball";
    samSungGalaxyNote8.usePen();
    samSungGalaxyNote8.phoneCall();
    samSungGalaxyNote8.UseGearVR();
    samSungGalaxyNote8.TransformToPC();
    samSungGalaxyNote8.GooglePlay();
    System.out.println("-------");
  }

}
