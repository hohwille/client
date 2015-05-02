/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package net.sf.mmm.client.ui.api.media;


/**
 * This is the interface for a {@link MediaDescriptor} of a video stream.
 * 
 * @author Joerg Hohwiller (hohwille at users.sourceforge.net)
 * @since 1.0.0
 */
public interface VideoDescriptor extends MediaDescriptor {

  /**
   * @return the {@link java.net.URL} of the subtitles as {@link String} or <code>null</code> for no
   *         subtitles.
   */
  String getSubtitleUrl();

}
