/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpit252;

public enum FacialFeatures {

  CLEAN_SHAVEN, LIGHT_BEARD, HEAVY_BEARD, GOATEE, MOUSTACHE;

  @Override
  public String toString() {
    return name().toLowerCase();
  }
}
