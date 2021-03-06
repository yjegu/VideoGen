/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.playlist.playlist;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.playlist.playlist.PlaylistFactory
 * @model kind="package"
 * @generated
 */
public interface PlaylistPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "playlist";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/playlist/Playlist";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "playlist";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PlaylistPackage eINSTANCE = org.xtext.example.playlist.playlist.impl.PlaylistPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.playlist.playlist.impl.PlaylistImpl <em>Playlist</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.playlist.playlist.impl.PlaylistImpl
   * @see org.xtext.example.playlist.playlist.impl.PlaylistPackageImpl#getPlaylist()
   * @generated
   */
  int PLAYLIST = 0;

  /**
   * The feature id for the '<em><b>Videos</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAYLIST__VIDEOS = 0;

  /**
   * The number of structural features of the '<em>Playlist</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAYLIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.playlist.playlist.impl.VideoImpl <em>Video</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.playlist.playlist.impl.VideoImpl
   * @see org.xtext.example.playlist.playlist.impl.PlaylistPackageImpl#getVideo()
   * @generated
   */
  int VIDEO = 1;

  /**
   * The feature id for the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO__LOCATION = 0;

  /**
   * The number of structural features of the '<em>Video</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.xtext.example.playlist.playlist.Playlist <em>Playlist</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Playlist</em>'.
   * @see org.xtext.example.playlist.playlist.Playlist
   * @generated
   */
  EClass getPlaylist();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.playlist.playlist.Playlist#getVideos <em>Videos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Videos</em>'.
   * @see org.xtext.example.playlist.playlist.Playlist#getVideos()
   * @see #getPlaylist()
   * @generated
   */
  EReference getPlaylist_Videos();

  /**
   * Returns the meta object for class '{@link org.xtext.example.playlist.playlist.Video <em>Video</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Video</em>'.
   * @see org.xtext.example.playlist.playlist.Video
   * @generated
   */
  EClass getVideo();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.playlist.playlist.Video#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Location</em>'.
   * @see org.xtext.example.playlist.playlist.Video#getLocation()
   * @see #getVideo()
   * @generated
   */
  EAttribute getVideo_Location();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PlaylistFactory getPlaylistFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.playlist.playlist.impl.PlaylistImpl <em>Playlist</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.playlist.playlist.impl.PlaylistImpl
     * @see org.xtext.example.playlist.playlist.impl.PlaylistPackageImpl#getPlaylist()
     * @generated
     */
    EClass PLAYLIST = eINSTANCE.getPlaylist();

    /**
     * The meta object literal for the '<em><b>Videos</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLAYLIST__VIDEOS = eINSTANCE.getPlaylist_Videos();

    /**
     * The meta object literal for the '{@link org.xtext.example.playlist.playlist.impl.VideoImpl <em>Video</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.playlist.playlist.impl.VideoImpl
     * @see org.xtext.example.playlist.playlist.impl.PlaylistPackageImpl#getVideo()
     * @generated
     */
    EClass VIDEO = eINSTANCE.getVideo();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIDEO__LOCATION = eINSTANCE.getVideo_Location();

  }

} //PlaylistPackage
