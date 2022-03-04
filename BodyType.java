package cpit252;

public enum BodyType {

  SKINNY,
  FIT,
  MUSCULAR,
  FAT;



  @Override
  public String toString() {
    return name().toLowerCase();
  }
}
