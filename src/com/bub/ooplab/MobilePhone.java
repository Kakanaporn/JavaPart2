package com.bub.ooplab;

public class MobilePhone {

  public String modelName;
  public int modelNo;


  public void phoneCall() {
    System.out.println("phoneCall " + modelName);
  }

  public void sms(String ob) {
    System.out.println("sms to " + ob + " from modelName: " + modelName);
  }

  public void internetSurfing() {
    System.out.println("Hello " + modelName);
  }
}


class iPhone extends MobilePhone {

  public void appStore() {
    System.out.println("Welcome " + modelName + "to AppStrore");
  }

}


class andriod extends MobilePhone {

  public void UseGearVR() {
    System.out.println("UseGearVR");
  }

  public void TransformToPC() {
    System.out.println("TransformToPC");
  }

  public void GooglePlay() {
    System.out.println("Welcome " + modelName + "to GooglePlay");
  }
}


class iPhoneX extends iPhone {

  String subject;

  void faceID() {
    System.out.println("faceID: " + subject);
  }

}


class iPhone8 extends iPhone {

  String subject;

  void touchID() {
    System.out.println("TouchID: " + subject);
  }

}


class samSungGalaxyNote8 extends andriod {

  String subject;

  void usePen() {
    System.out.println("UsePen: " + subject);
  }

}
