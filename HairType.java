
package cpit252;

public enum HairType {

  BALD,SHORT,CURLY, LONG_STRAIGHT, LONG_CURLY;

  @Override
  public String toString() {
    return name().toLowerCase();
  }
}
