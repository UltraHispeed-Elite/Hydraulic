package org.geysermc.hydraulic.pack.bedrock.resource.manifest;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Capabilities
 * <p>
 * These are the different features that the pack makes use of that aren't necessarily enabled by default.
 */
public class Capabilities {
  @JsonProperty("experimental_custom_ui")
  public boolean experimentalCustomUi;

  public boolean chemistry;

  public boolean raytraced;

  /**
   * Allows HTML files in the pack to be used for custom UI, and scripts in the pack to call and manipulate custom UI.
   *
   * @return Experimental Custom Ui
   */
  public boolean getExperimentalCustomUi() {
    return this.experimentalCustomUi;
  }

  /**
   * Allows HTML files in the pack to be used for custom UI, and scripts in the pack to call and manipulate custom UI.
   *
   * @param experimentalCustomUi Experimental Custom Ui
   */
  public void setExperimentalCustomUi(boolean experimentalCustomUi) {
    this.experimentalCustomUi = experimentalCustomUi;
  }

  /**
   * Allows the pack to add, change or replace Chemistry functionality.
   *
   * @return Chemistry
   */
  public boolean getChemistry() {
    return this.chemistry;
  }

  /**
   * Allows the pack to add, change or replace Chemistry functionality.
   *
   * @param chemistry Chemistry
   */
  public void setChemistry(boolean chemistry) {
    this.chemistry = chemistry;
  }

  /**
   * Indicates that this pack contains Raytracing Enhanced or Physical Based Materials for rendering.
   *
   * @return Raytraced
   */
  public boolean getRaytraced() {
    return this.raytraced;
  }

  /**
   * Indicates that this pack contains Raytracing Enhanced or Physical Based Materials for rendering.
   *
   * @param raytraced Raytraced
   */
  public void setRaytraced(boolean raytraced) {
    this.raytraced = raytraced;
  }
}
