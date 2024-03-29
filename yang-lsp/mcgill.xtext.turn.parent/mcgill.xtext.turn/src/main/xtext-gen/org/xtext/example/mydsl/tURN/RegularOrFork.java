/**
 * generated by Xtext 2.15.0-SNAPSHOT
 */
package org.xtext.example.mydsl.tURN;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regular Or Fork</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.tURN.RegularOrFork#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.tURN.RegularOrFork#getPathBody <em>Path Body</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.tURN.TURNPackage#getRegularOrFork()
 * @model
 * @generated
 */
public interface RegularOrFork extends EObject
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(Condition)
   * @see org.xtext.example.mydsl.tURN.TURNPackage#getRegularOrFork_Condition()
   * @model containment="true"
   * @generated
   */
  Condition getCondition();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.tURN.RegularOrFork#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(Condition value);

  /**
   * Returns the value of the '<em><b>Path Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path Body</em>' containment reference.
   * @see #setPathBody(PathBody)
   * @see org.xtext.example.mydsl.tURN.TURNPackage#getRegularOrFork_PathBody()
   * @model containment="true"
   * @generated
   */
  PathBody getPathBody();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.tURN.RegularOrFork#getPathBody <em>Path Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path Body</em>' containment reference.
   * @see #getPathBody()
   * @generated
   */
  void setPathBody(PathBody value);

} // RegularOrFork
