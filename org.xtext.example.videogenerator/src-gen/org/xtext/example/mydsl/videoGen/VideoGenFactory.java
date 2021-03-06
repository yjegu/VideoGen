/**
 */
package org.xtext.example.mydsl.videoGen;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.videoGen.VideoGenPackage
 * @generated
 */
public interface VideoGenFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  VideoGenFactory eINSTANCE = org.xtext.example.mydsl.videoGen.impl.VideoGenFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Video Generator Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Video Generator Model</em>'.
   * @generated
   */
  VideoGeneratorModel createVideoGeneratorModel();

  /**
   * Returns a new object of class '<em>Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Information</em>'.
   * @generated
   */
  VideoGenInformation createVideoGenInformation();

  /**
   * Returns a new object of class '<em>Video Seq</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Video Seq</em>'.
   * @generated
   */
  VideoSeq createVideoSeq();

  /**
   * Returns a new object of class '<em>Mandatory Video Seq</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mandatory Video Seq</em>'.
   * @generated
   */
  MandatoryVideoSeq createMandatoryVideoSeq();

  /**
   * Returns a new object of class '<em>Optional Video Seq</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Optional Video Seq</em>'.
   * @generated
   */
  OptionalVideoSeq createOptionalVideoSeq();

  /**
   * Returns a new object of class '<em>Alternative Video Seq</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Alternative Video Seq</em>'.
   * @generated
   */
  AlternativeVideoSeq createAlternativeVideoSeq();

  /**
   * Returns a new object of class '<em>Video Description</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Video Description</em>'.
   * @generated
   */
  VideoDescription createVideoDescription();

  /**
   * Returns a new object of class '<em>Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Filter</em>'.
   * @generated
   */
  Filter createFilter();

  /**
   * Returns a new object of class '<em>Text</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Text</em>'.
   * @generated
   */
  Text createText();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  VideoGenPackage getVideoGenPackage();

} //VideoGenFactory
